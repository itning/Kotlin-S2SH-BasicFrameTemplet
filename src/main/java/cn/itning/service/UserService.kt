package cn.itning.service

import cn.itning.dao.UserDao

open class UserService {

    open var userDao: UserDao? = null

    fun say(): String {
        println("userdao=" + userDao!!)
        return userDao!!.say()
    }
}
