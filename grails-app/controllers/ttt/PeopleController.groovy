package ttt


import grails.rest.*
import grails.converters.*

class PeopleController {
    static responseFormats = ['json', 'xml']

    def index() {}

    def show(People people) {
        if (people != null) {
            [people: people]
        } else {
            render(view: '/notFound')
        }
    }
}
