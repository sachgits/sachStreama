package streama

import grails.transaction.Transactional

@Transactional
class DefaultDataService {

  def createDefaultRoles(){
    def roles = [
      [authority: "ROLE_ADMIN", displayName: "Admin"],
      [authority: "ROLE_CONTENT_MANAGER", displayName: "Content Manager"],
      [authority: "ROLE_PAID", displayName: "Balance: "]
    ]

    roles.each { role ->
      def roleInstance = Role.findOrCreateByAuthority(role.authority)
      roleInstance.properties = role
      roleInstance.save flush: true, failOnError: true
    }
  }


  def createDefaultUsers(){
    def users = [
        [
            username: 'admin',
            password: 'admin',
            enabled: true,
            roles: [Role.findByAuthority("ROLE_ADMIN"), Role.findByAuthority("ROLE_CONTENT_MANAGER"),Role.findByAuthority("ROLE_PAID")]
        ]
    ]

    users.each{ userData ->
      if(!User.findByUsername(userData.username)){
        def user = new User(username: userData.username, password: userData.password, enabled: userData.enabled)
        user.save flush: true, failOnError: true

        userData.roles?.each{ role ->
          UserRole.create(user, role)
        }
      }
    }
  }


  def createDefaultSettings(){
    def settings = [
        [
            settingsKey: 'Upload Directory',
            description: 'This setting provides the application with your desired upload-path for all files. ' +
                'The default so far has been /data/streama. Remember: if you change this path, copy all the files (that were previously added) into the new directory.',
            settingsType: 'string',
            required: true
        ],
        [
            settingsKey: 'TheMovieDB API key',
            description: "API stands for Application Programming Interface. TheMovieDB's movie/TV show information database is accessible only by registering at https://www.themoviedb.org/account/signup and requesting an API-key. " +
              "After you have sent a request form, you can see your API-key by going to the API section in your profile's settings in TheMovieDB. The API-key is required by this application to fetch " +
              "all the nice Movie/Episode/Show data for you.",
            settingsType: 'string',
            required: true
        ],
        [
            settingsKey: 'Base URL',
            value: 'http://localhost:8080',
            description: 'The Base-URL is used for the videos and the link in the invitation-email.',
            settingsType: 'string',
            required: true
        ],
        [
            settingsKey: 'Second Directory',
            description: 'This directory is not used for uploading of new files, only for playback of existing files. This can be useful if you want to spread your video files over two directories, for instance by mounting a second drive.',
            settingsType: 'string',
            required: false
        ],
        [
            settingsKey: 'First Time Login Info',
            description: 'Should the First-Time login info (admin/admin) be shown in the login screen?',
            settingsType: 'boolean'
        ],
//        [
//            settingsKey: 'Remove Source After Convert',
//            value: 'yes',
//            settingsType: 'radio',
//            description: 'If this is set to "yes", after successful file-conversion the original file will be removed from the Upload Directory. This may be useful in case you have limited disk space.'
//        ],
    ]

    settings.each{ settingData ->
      if(!Settings.findBySettingsKey(settingData.settingsKey)){
        def setting = new Settings(settingData)
        setting.save flush: true, failOnError: true
      }
    }
  }
}
