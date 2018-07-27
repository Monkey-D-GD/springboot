package com.suixingfu.fel;

import com.greenpineyu.fel.FelEngineImpl;
import com.greenpineyu.fel.context.FelContext;

/**
 * <dl>
 * <dd>描述: ~fel 表达式</dd>
 * <dd>创建时间：  15:18 2018/6/19</dd>
 * <dd>创建人： guodong</dd>
 * <dt>版本历史: </dt>
 * <pre>
 * Date         Author      Version     Description
 * ------------------------------------------------------------------
 * 2018/6/19      guodong       1.0        1.0 Version
 * </pre>
 * </dl>
 */
public class FelTests {

    //依赖：  compile group: 'org.eweb4j', name: 'fel', version: '0.8'
    public static void main(String[] args) {
        String a = "入参";
        String b = "数据库参数";
        String el = ">=";
        FelEngineImpl engine = new FelEngineImpl();
        FelContext ctx = engine.getContext();
        ctx.set(a,10);
        ctx.set(b,20);
        String exp = a+el+b;
        System.out.println(exp+"->"+engine.eval(exp));
    }

}
