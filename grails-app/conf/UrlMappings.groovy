import javassist.NotFoundException
import org.springframework.security.access.AccessDeniedException;

class UrlMappings {

	static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/"(view:"/index")
        "403"(controller: "payment", action: "mpesa")
        "500"(controller: "payment", action: "mpesa", exception: AccessDeniedException)
        //"500"(controller: "payment", action: "mpesa", exception: NotFoundException)//to be changed later to security.acl.NotFoundException

        "500"(view:'/error')
	}
}
