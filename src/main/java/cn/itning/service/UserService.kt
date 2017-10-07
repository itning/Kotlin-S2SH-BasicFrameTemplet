package cn.itning.service

import cn.itning.dao.UserDao
import org.springframework.stereotype.Service
import javax.annotation.Resource

@Service
open class UserService {

    @Resource
    val userDao: UserDao? = null

    /*必须open，否则线程报错*/
    open fun say(): String {
        println("userdao=" + userDao!!)
        return userDao.say()
    }
}
