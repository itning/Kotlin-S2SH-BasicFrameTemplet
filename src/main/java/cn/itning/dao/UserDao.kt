package cn.itning.dao

import cn.itning.entity.User
import org.springframework.orm.hibernate5.support.HibernateDaoSupport

open class UserDao : HibernateDaoSupport() {

    fun say(): String {
        //val user= hibernateTemplate.get(User::class.java, "1");
        val user = currentSession().get(User::class.java, "1")
        println(if (user != null) user.id + ":" + user.name else "user is null")
        return "ok"
    }
}
