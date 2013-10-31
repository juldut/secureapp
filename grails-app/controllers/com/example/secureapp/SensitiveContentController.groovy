package com.example.secureapp
import grails.plugins.springsecurity.Secured

// @Secured(['ROLE_ADMIN'])	 // <-- bisa juga di class nya utk semua
class SensitiveContentController {
	@Secured(['ROLE_ADMIN'])
    def index() { 
    	render "Something sensitive"
    }
}
