package cn.itning.action

import cn.itning.service.UserService
import com.opensymphony.xwork2.Action
import com.opensymphony.xwork2.ActionSupport


class HelloAction : ActionSupport() {

    var userService: UserService? = null

    /*action中方法必须返回String 不能有参数*/
    @Throws(Exception::class)
    override fun execute(): String {
        println("ok")
        if (userService != null) {
            println(userService!!.say())
        } else {
            println("userService is null")
        }
        return Action.SUCCESS
    }
}
