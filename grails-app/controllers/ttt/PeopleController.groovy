package ttt

import grails.plugin.springsecurity.annotation.Secured
import grails.rest.*
import grails.converters.*

class PeopleController {
    static responseFormats = ['json', 'xml']

    def index() {}

    @Secured('ROLE_USER')
    def show(People people) {
        if (people != null) {
            [people: people]
        } else {
            render(view: '/notFound')
        }
    }
}
