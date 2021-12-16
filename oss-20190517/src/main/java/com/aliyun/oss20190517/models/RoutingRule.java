// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class RoutingRule extends TeaModel {
    // description
    @NameInMap("Condition")
    public RoutingRuleCondition condition;

    // description
    @NameInMap("Redirect")
    public RoutingRuleRedirect redirect;

    // description
    @NameInMap("RuleNumber")
    public Long ruleNumber;

    public static RoutingRule build(java.util.Map<String, ?> map) throws Exception {
        RoutingRule self = new RoutingRule();
        return TeaModel.build(map, self);
    }

    public RoutingRule setCondition(RoutingRuleCondition condition) {
        this.condition = condition;
        return this;
    }
    public RoutingRuleCondition getCondition() {
        return this.condition;
    }

    public RoutingRule setRedirect(RoutingRuleRedirect redirect) {
        this.redirect = redirect;
        return this;
    }
    public RoutingRuleRedirect getRedirect() {
        return this.redirect;
    }

    public RoutingRule setRuleNumber(Long ruleNumber) {
        this.ruleNumber = ruleNumber;
        return this;
    }
    public Long getRuleNumber() {
        return this.ruleNumber;
    }

}
