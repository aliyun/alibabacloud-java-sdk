// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AddMsSgAuthRulesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("AuthRule")
    public AddMsSgAuthRulesResponseBodyAuthRule authRule;

    @NameInMap("ResultCode")
    public String resultCode;

    public static AddMsSgAuthRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddMsSgAuthRulesResponseBody self = new AddMsSgAuthRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public AddMsSgAuthRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddMsSgAuthRulesResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public AddMsSgAuthRulesResponseBody setAuthRule(AddMsSgAuthRulesResponseBodyAuthRule authRule) {
        this.authRule = authRule;
        return this;
    }
    public AddMsSgAuthRulesResponseBodyAuthRule getAuthRule() {
        return this.authRule;
    }

    public AddMsSgAuthRulesResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public static class AddMsSgAuthRulesResponseBodyAuthRuleRuleItems extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("Operation")
        public String operation;

        @NameInMap("Value")
        public String value;

        @NameInMap("AuthRuleId")
        public Long authRuleId;

        @NameInMap("Field")
        public String field;

        public static AddMsSgAuthRulesResponseBodyAuthRuleRuleItems build(java.util.Map<String, ?> map) throws Exception {
            AddMsSgAuthRulesResponseBodyAuthRuleRuleItems self = new AddMsSgAuthRulesResponseBodyAuthRuleRuleItems();
            return TeaModel.build(map, self);
        }

        public AddMsSgAuthRulesResponseBodyAuthRuleRuleItems setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public AddMsSgAuthRulesResponseBodyAuthRuleRuleItems setOperation(String operation) {
            this.operation = operation;
            return this;
        }
        public String getOperation() {
            return this.operation;
        }

        public AddMsSgAuthRulesResponseBodyAuthRuleRuleItems setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public AddMsSgAuthRulesResponseBodyAuthRuleRuleItems setAuthRuleId(Long authRuleId) {
            this.authRuleId = authRuleId;
            return this;
        }
        public Long getAuthRuleId() {
            return this.authRuleId;
        }

        public AddMsSgAuthRulesResponseBodyAuthRuleRuleItems setField(String field) {
            this.field = field;
            return this;
        }
        public String getField() {
            return this.field;
        }

    }

    public static class AddMsSgAuthRulesResponseBodyAuthRule extends TeaModel {
        @NameInMap("AuthRuleGroupId")
        public Long authRuleGroupId;

        @NameInMap("Enabled")
        public Long enabled;

        @NameInMap("Mode")
        public String mode;

        @NameInMap("Name")
        public String name;

        @NameInMap("RuleItems")
        public java.util.List<AddMsSgAuthRulesResponseBodyAuthRuleRuleItems> ruleItems;

        public static AddMsSgAuthRulesResponseBodyAuthRule build(java.util.Map<String, ?> map) throws Exception {
            AddMsSgAuthRulesResponseBodyAuthRule self = new AddMsSgAuthRulesResponseBodyAuthRule();
            return TeaModel.build(map, self);
        }

        public AddMsSgAuthRulesResponseBodyAuthRule setAuthRuleGroupId(Long authRuleGroupId) {
            this.authRuleGroupId = authRuleGroupId;
            return this;
        }
        public Long getAuthRuleGroupId() {
            return this.authRuleGroupId;
        }

        public AddMsSgAuthRulesResponseBodyAuthRule setEnabled(Long enabled) {
            this.enabled = enabled;
            return this;
        }
        public Long getEnabled() {
            return this.enabled;
        }

        public AddMsSgAuthRulesResponseBodyAuthRule setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

        public AddMsSgAuthRulesResponseBodyAuthRule setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public AddMsSgAuthRulesResponseBodyAuthRule setRuleItems(java.util.List<AddMsSgAuthRulesResponseBodyAuthRuleRuleItems> ruleItems) {
            this.ruleItems = ruleItems;
            return this;
        }
        public java.util.List<AddMsSgAuthRulesResponseBodyAuthRuleRuleItems> getRuleItems() {
            return this.ruleItems;
        }

    }

}
