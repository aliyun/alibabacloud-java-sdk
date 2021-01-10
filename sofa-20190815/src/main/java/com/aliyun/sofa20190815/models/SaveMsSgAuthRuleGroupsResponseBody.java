// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class SaveMsSgAuthRuleGroupsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("AuthRuleGroups")
    public java.util.List<SaveMsSgAuthRuleGroupsResponseBodyAuthRuleGroups> authRuleGroups;

    public static SaveMsSgAuthRuleGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SaveMsSgAuthRuleGroupsResponseBody self = new SaveMsSgAuthRuleGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public SaveMsSgAuthRuleGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SaveMsSgAuthRuleGroupsResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public SaveMsSgAuthRuleGroupsResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public SaveMsSgAuthRuleGroupsResponseBody setAuthRuleGroups(java.util.List<SaveMsSgAuthRuleGroupsResponseBodyAuthRuleGroups> authRuleGroups) {
        this.authRuleGroups = authRuleGroups;
        return this;
    }
    public java.util.List<SaveMsSgAuthRuleGroupsResponseBodyAuthRuleGroups> getAuthRuleGroups() {
        return this.authRuleGroups;
    }

    public static class SaveMsSgAuthRuleGroupsResponseBodyAuthRuleGroupsRulesRuleItems extends TeaModel {
        @NameInMap("AuthRuleId")
        public Long authRuleId;

        @NameInMap("Field")
        public String field;

        @NameInMap("Operation")
        public String operation;

        @NameInMap("Type")
        public String type;

        @NameInMap("Value")
        public String value;

        public static SaveMsSgAuthRuleGroupsResponseBodyAuthRuleGroupsRulesRuleItems build(java.util.Map<String, ?> map) throws Exception {
            SaveMsSgAuthRuleGroupsResponseBodyAuthRuleGroupsRulesRuleItems self = new SaveMsSgAuthRuleGroupsResponseBodyAuthRuleGroupsRulesRuleItems();
            return TeaModel.build(map, self);
        }

        public SaveMsSgAuthRuleGroupsResponseBodyAuthRuleGroupsRulesRuleItems setAuthRuleId(Long authRuleId) {
            this.authRuleId = authRuleId;
            return this;
        }
        public Long getAuthRuleId() {
            return this.authRuleId;
        }

        public SaveMsSgAuthRuleGroupsResponseBodyAuthRuleGroupsRulesRuleItems setField(String field) {
            this.field = field;
            return this;
        }
        public String getField() {
            return this.field;
        }

        public SaveMsSgAuthRuleGroupsResponseBodyAuthRuleGroupsRulesRuleItems setOperation(String operation) {
            this.operation = operation;
            return this;
        }
        public String getOperation() {
            return this.operation;
        }

        public SaveMsSgAuthRuleGroupsResponseBodyAuthRuleGroupsRulesRuleItems setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public SaveMsSgAuthRuleGroupsResponseBodyAuthRuleGroupsRulesRuleItems setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class SaveMsSgAuthRuleGroupsResponseBodyAuthRuleGroupsRules extends TeaModel {
        @NameInMap("AuthRuleGroupId")
        public Long authRuleGroupId;

        @NameInMap("Enabled")
        public Long enabled;

        @NameInMap("Mode")
        public String mode;

        @NameInMap("Name")
        public String name;

        @NameInMap("RuleItems")
        public java.util.List<SaveMsSgAuthRuleGroupsResponseBodyAuthRuleGroupsRulesRuleItems> ruleItems;

        public static SaveMsSgAuthRuleGroupsResponseBodyAuthRuleGroupsRules build(java.util.Map<String, ?> map) throws Exception {
            SaveMsSgAuthRuleGroupsResponseBodyAuthRuleGroupsRules self = new SaveMsSgAuthRuleGroupsResponseBodyAuthRuleGroupsRules();
            return TeaModel.build(map, self);
        }

        public SaveMsSgAuthRuleGroupsResponseBodyAuthRuleGroupsRules setAuthRuleGroupId(Long authRuleGroupId) {
            this.authRuleGroupId = authRuleGroupId;
            return this;
        }
        public Long getAuthRuleGroupId() {
            return this.authRuleGroupId;
        }

        public SaveMsSgAuthRuleGroupsResponseBodyAuthRuleGroupsRules setEnabled(Long enabled) {
            this.enabled = enabled;
            return this;
        }
        public Long getEnabled() {
            return this.enabled;
        }

        public SaveMsSgAuthRuleGroupsResponseBodyAuthRuleGroupsRules setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

        public SaveMsSgAuthRuleGroupsResponseBodyAuthRuleGroupsRules setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public SaveMsSgAuthRuleGroupsResponseBodyAuthRuleGroupsRules setRuleItems(java.util.List<SaveMsSgAuthRuleGroupsResponseBodyAuthRuleGroupsRulesRuleItems> ruleItems) {
            this.ruleItems = ruleItems;
            return this;
        }
        public java.util.List<SaveMsSgAuthRuleGroupsResponseBodyAuthRuleGroupsRulesRuleItems> getRuleItems() {
            return this.ruleItems;
        }

    }

    public static class SaveMsSgAuthRuleGroupsResponseBodyAuthRuleGroups extends TeaModel {
        @NameInMap("DataId")
        public String dataId;

        @NameInMap("Enabled")
        public Long enabled;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Status")
        public Long status;

        @NameInMap("Type")
        public String type;

        @NameInMap("Rules")
        public java.util.List<SaveMsSgAuthRuleGroupsResponseBodyAuthRuleGroupsRules> rules;

        public static SaveMsSgAuthRuleGroupsResponseBodyAuthRuleGroups build(java.util.Map<String, ?> map) throws Exception {
            SaveMsSgAuthRuleGroupsResponseBodyAuthRuleGroups self = new SaveMsSgAuthRuleGroupsResponseBodyAuthRuleGroups();
            return TeaModel.build(map, self);
        }

        public SaveMsSgAuthRuleGroupsResponseBodyAuthRuleGroups setDataId(String dataId) {
            this.dataId = dataId;
            return this;
        }
        public String getDataId() {
            return this.dataId;
        }

        public SaveMsSgAuthRuleGroupsResponseBodyAuthRuleGroups setEnabled(Long enabled) {
            this.enabled = enabled;
            return this;
        }
        public Long getEnabled() {
            return this.enabled;
        }

        public SaveMsSgAuthRuleGroupsResponseBodyAuthRuleGroups setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public SaveMsSgAuthRuleGroupsResponseBodyAuthRuleGroups setStatus(Long status) {
            this.status = status;
            return this;
        }
        public Long getStatus() {
            return this.status;
        }

        public SaveMsSgAuthRuleGroupsResponseBodyAuthRuleGroups setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public SaveMsSgAuthRuleGroupsResponseBodyAuthRuleGroups setRules(java.util.List<SaveMsSgAuthRuleGroupsResponseBodyAuthRuleGroupsRules> rules) {
            this.rules = rules;
            return this;
        }
        public java.util.List<SaveMsSgAuthRuleGroupsResponseBodyAuthRuleGroupsRules> getRules() {
            return this.rules;
        }

    }

}
