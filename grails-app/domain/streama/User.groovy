package streama

import static java.util.UUID.randomUUID

class User {

	transient springSecurityService

	Date dateCreated
	Date lastUpdated
  boolean deleted = false

	String username
	String password
  String phoneNumber
  long totalBalance
  boolean subscribedStatus = false //is user currently subscribed to a plan or not

	boolean enabled = false
	boolean accountExpired
	boolean accountLocked
	boolean passwordExpired
	boolean invitationSent = false
	boolean pauseVideoOnClick = true
	String uuid
	String language = 'en'
  String fullName

	static transients = ['springSecurityService']

  static hasMany = [favoriteGenres: Genre, subscriptions: UserSubscription]

	static constraints = {
		username blank: false, unique: true
		password blank: false
    phoneNumber nullable: false, unique:true
		dateCreated nullable: true
		lastUpdated nullable: true
	}

	static mapping = {
		password column: '`password`'
		cache true
	}

	Set<Role> getAuthorities() {
		UserRole.findAllByUser(this).collect { it.role }
	}

	def beforeInsert() {
		if(!password){
			password = randomUUID() as String
		}
		encodePassword()
	}

	def beforeUpdate() {
		if (isDirty('password')) {
			encodePassword()
		}
	}

	protected void encodePassword() {
		password = springSecurityService?.passwordEncoder ? springSecurityService.encodePassword(password) : password
	}
}
