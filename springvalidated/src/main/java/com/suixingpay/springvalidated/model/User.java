package com.suixingpay.springvalidated.model;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * <dl>
 * <dd>描述: ~User实体</dd>
 * <dd>创建时间：  9:52 2018/6/12</dd>
 * <dd>创建人： guodong</dd>
 * <dt>版本历史: </dt>
 * <pre>
 * Date         Author      Version     Description
 * ------------------------------------------------------------------
 * 2018/6/12      guodong       1.0        1.0 Version
 * </pre>
 * </dl>
 */
@Data
public class User {

    @NotNull(message = "id 不允许为空", groups = Groups.Update.class)
    private Integer id;
    @NotBlank(message = "name 不允许为空", groups = Groups.Default.class)
    private String name;
    @NotNull(message = "age 不允许为空", groups = Groups.Default.class)
    private int age;

}
