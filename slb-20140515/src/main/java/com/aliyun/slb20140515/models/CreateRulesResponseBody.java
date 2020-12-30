// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class CreateRulesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Rules")
    public CreateRulesResponseBodyRules rules;

    public static CreateRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateRulesResponseBody self = new CreateRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateRulesResponseBody setRules(CreateRulesResponseBodyRules rules) {
        this.rules = rules;
        return this;
    }
    public CreateRulesResponseBodyRules getRules() {
        return this.rules;
    }

    public static class CreateRulesResponseBodyRulesRule extends TeaModel {
        @NameInMap("RuleName")
        public String ruleName;

        @NameInMap("RuleId")
        public String ruleId;

        public static CreateRulesResponseBodyRulesRule build(java.util.Map<String, ?> map) throws Exception {
            CreateRulesResponseBodyRulesRule self = new CreateRulesResponseBodyRulesRule();
            return TeaModel.build(map, self);
        }

        public CreateRulesResponseBodyRulesRule setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public CreateRulesResponseBodyRulesRule setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

    }

    public static class CreateRulesResponseBodyRules extends TeaModel {
        @NameInMap("Rule")
        public java.util.List<CreateRulesResponseBodyRulesRule> rule;

        public static CreateRulesResponseBodyRules build(java.util.Map<String, ?> map) throws Exception {
            CreateRulesResponseBodyRules self = new CreateRulesResponseBodyRules();
            return TeaModel.build(map, self);
        }

        public CreateRulesResponseBodyRules setRule(java.util.List<CreateRulesResponseBodyRulesRule> rule) {
            this.rule = rule;
            return this;
        }
        public java.util.List<CreateRulesResponseBodyRulesRule> getRule() {
            return this.rule;
        }

    }

}
