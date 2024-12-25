// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class CreateRulesResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>9DEC9C28-AB05-4DDF-9A78-6B08EC9CE18C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The forwarding rules.</p>
     */
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
        /**
         * <p>The forwarding rule ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rule-bp12jzy0*****</p>
         */
        @NameInMap("RuleId")
        public String ruleId;

        /**
         * <p>The name of the forwarding rule.</p>
         * 
         * <strong>example:</strong>
         * <p>Rule2</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        public static CreateRulesResponseBodyRulesRule build(java.util.Map<String, ?> map) throws Exception {
            CreateRulesResponseBodyRulesRule self = new CreateRulesResponseBodyRulesRule();
            return TeaModel.build(map, self);
        }

        public CreateRulesResponseBodyRulesRule setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

        public CreateRulesResponseBodyRulesRule setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
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
