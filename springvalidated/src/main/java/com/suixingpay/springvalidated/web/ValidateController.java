package com.suixingpay.springvalidated.web;

import com.suixingpay.springvalidated.model.Groups;
import com.suixingpay.springvalidated.model.User;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <dl>
 * <dd>描述: ~</dd>
 * <dd>创建时间：  9:56 2018/6/12</dd>
 * <dd>创建人： guodong</dd>
 * <dt>版本历史: </dt>
 * <pre>
 * Date         Author      Version     Description
 * ------------------------------------------------------------------
 * 2018/6/12      guodong       1.0        1.0 Version
 * </pre>
 * </dl>
 */
@RestController
public class ValidateController {

    @GetMapping("/insert")
    public String insert(@Validated(value = Groups.Default.class) User user) {
        System.out.println(user.toString());
        return "insert";
    }


    @GetMapping("/update")
    public String update(@Validated(value = {Groups.Default.class, Groups.Update.class}) User user) {
        System.out.println(user.toString());
        return "update";
    }
}
