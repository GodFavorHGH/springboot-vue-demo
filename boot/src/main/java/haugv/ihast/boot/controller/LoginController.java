package haugv.ihast.boot.controller;

import cn.hutool.json.JSONObject;
import haugv.ihast.boot.common.JsonResult;
import haugv.ihast.boot.entity.User;
import org.springframework.web.bind.annotation.*;

/**
 * @author haugv
 * @description
 * @date 2021/4/2-2:58 下午
 */
@RestController
@RequestMapping("/login")
public class LoginController {

    @GetMapping("/get")
    public JsonResult get(String loginId, String password){
        User user = new User(0, loginId, password);
        return new JsonResult(200, "success!", user);
    }

    @PostMapping("/post")
    public JsonResult post(@RequestBody JSONObject jsonObject){
        User user = new User(0, (String)jsonObject.get("loginId"), (String)jsonObject.get("password"));
        return new JsonResult(200, "success!", user);
    }

}
