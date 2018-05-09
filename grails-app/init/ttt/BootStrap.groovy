package ttt

class BootStrap {

    def init = { servletContext ->
        new People(name: "Jerry U.", status: "Dating", networth: "US\$10,000,000").save()
        new People(name: "Steve Jobs", status: "Single", networth: "US\$17,590,000,000").save()
        new People(name: "Bill Gates", status: "Married", networth: "US\$78,310,000,000").save()

        def role1 = new Authority(authority: "ROLE_USER").save flush: true
        def user1 = new User(username: "user", password: "pass").save flush: true
        UserAuthority.create(user1, role1)
    }
    def destroy = {
    }
}
