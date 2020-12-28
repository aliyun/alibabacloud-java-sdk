// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class CreateRulesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Rules")
    public java.util.List<CreateRulesResponseBodyRules> rules;

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

    public CreateRulesResponseBody setRules(java.util.List<CreateRulesResponseBodyRules> rules) {
        this.rules = rules;
        return this;
    }
    public java.util.List<CreateRulesResponseBodyRules> getRules() {
        return this.rules;
    }

    public static class CreateRulesResponseBodyRules extends TeaModel {
        @NameInMap("RuleName")
        public String ruleName;

        @NameInMap("RuleId")
        public String ruleId;

        public static CreateRulesResponseBodyRules build(java.util.Map<String, ?> map) throws Exception {
            CreateRulesResponseBodyRules self = new CreateRulesResponseBodyRules();
            return TeaModel.build(map, self);
        }

        public CreateRulesResponseBodyRules setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public CreateRulesResponseBodyRules setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

    }

}
