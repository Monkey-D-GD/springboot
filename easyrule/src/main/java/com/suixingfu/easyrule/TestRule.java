package com.suixingfu.easyrule;

import com.suixingfu.easyrule.rule.BlueRule;
import com.suixingfu.easyrule.rule.RedRule;
import com.suixingfu.easyrule.rule.YellowRule;
import org.easyrules.api.RulesEngine;
import org.easyrules.core.RulesEngineBuilder;

/**
 * <dl>
 * <dd>描述: ~规则引擎测试</dd>
 * <dd>创建时间：  14:44 2018/6/12</dd>
 * <dd>创建人： guodong</dd>
 * <dt>版本历史: </dt>
 * <pre>
 * Date         Author      Version     Description
 * ------------------------------------------------------------------
 * 2018/6/12      guodong       1.0        1.0 Version
 * </pre>
 * </dl>
 */
public class TestRule {

    public static void main(String[] args) {

        RulesEngine fizzBuzzEngine =
                RulesEngineBuilder.aNewRulesEngine()
                        .withSkipOnFirstAppliedRule(true) //如果第一个规则满足条件，后面的规则将不再执行
                        .withSilentMode(true)
                        .build();

        RedRule redRule = new RedRule();
        YellowRule yellowRule = new YellowRule();
        BlueRule blueRule = new BlueRule();

        fizzBuzzEngine.registerRule(redRule);
        fizzBuzzEngine.registerRule(yellowRule);
        fizzBuzzEngine.registerRule(blueRule);

        redRule.setName("zhangsan");
        yellowRule.setName("zhangsan");
        blueRule.setName("zhangsan");

        fizzBuzzEngine.fireRules();

    }
}
