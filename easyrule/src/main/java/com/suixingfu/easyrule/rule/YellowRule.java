package com.suixingfu.easyrule.rule;

import org.easyrules.annotation.Action;
import org.easyrules.annotation.Condition;
import org.easyrules.annotation.Priority;
import org.easyrules.annotation.Rule;

/**
 * <dl>
 * <dd>描述: ~节点业务逻辑实现</dd>
 * <dd>创建时间：  14:31 2018/6/12</dd>
 * <dd>创建人： guodong</dd>
 * <dt>版本历史: </dt>
 * <pre>
 * Date         Author      Version     Description
 * ------------------------------------------------------------------
 * 2018/6/12      guodong       1.0        1.0 Version
 * </pre>
 * </dl>
 */
@Rule
public class YellowRule {

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    @Condition
    public boolean isZhangSan(){
        return name.equals("zhangsan");
    }

    @Action
    public String printHello(){
        System.out.println("Yellow : " + name);
        return "yellow";
    }

    @Priority
    public int getPriority(){
        return 0;
    }

}
