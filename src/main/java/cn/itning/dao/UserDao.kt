package cn.itning.dao

import org.hibernate.SessionFactory

class UserDao {

    var sessionFactory: SessionFactory? = null

    fun say(): String {
        println(sessionFactory)
        return "ok"
    }
}
