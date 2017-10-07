package cn.itning.action

import cn.itning.service.UserService
import com.opensymphony.xwork2.Action
import com.opensymphony.xwork2.ActionSupport
import org.springframework.stereotype.Controller
import javax.annotation.Resource

@Controller
class HelloAction : ActionSupport() {

    @Resource
    private val userService: UserService? = null

    /*action中方法必须返回String 不能有参数*/
    @Throws(Exception::class)
    override fun execute(): String {
        println("ok")
        println(userService?.say() ?: "userService is null")
        return Action.SUCCESS
    }
}
