// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListMsSgAuthRuleGroupsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("AuthRuleGroups")
    public java.util.List<ListMsSgAuthRuleGroupsResponseBodyAuthRuleGroups> authRuleGroups;

    public static ListMsSgAuthRuleGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMsSgAuthRuleGroupsResponseBody self = new ListMsSgAuthRuleGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMsSgAuthRuleGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListMsSgAuthRuleGroupsResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListMsSgAuthRuleGroupsResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public ListMsSgAuthRuleGroupsResponseBody setAuthRuleGroups(java.util.List<ListMsSgAuthRuleGroupsResponseBodyAuthRuleGroups> authRuleGroups) {
        this.authRuleGroups = authRuleGroups;
        return this;
    }
    public java.util.List<ListMsSgAuthRuleGroupsResponseBodyAuthRuleGroups> getAuthRuleGroups() {
        return this.authRuleGroups;
    }

    public static class ListMsSgAuthRuleGroupsResponseBodyAuthRuleGroupsRulesRuleItemsPublishedAuthRuleItem extends TeaModel {
        @NameInMap("AuthRuleId")
        public Long authRuleId;

        @NameInMap("ChangedType")
        public String changedType;

        @NameInMap("Field")
        public String field;

        @NameInMap("Operation")
        public String operation;

        @NameInMap("Value")
        public String value;

        public static ListMsSgAuthRuleGroupsResponseBodyAuthRuleGroupsRulesRuleItemsPublishedAuthRuleItem build(java.util.Map<String, ?> map) throws Exception {
            ListMsSgAuthRuleGroupsResponseBodyAuthRuleGroupsRulesRuleItemsPublishedAuthRuleItem self = new ListMsSgAuthRuleGroupsResponseBodyAuthRuleGroupsRulesRuleItemsPublishedAuthRuleItem();
            return TeaModel.build(map, self);
        }

        public ListMsSgAuthRuleGroupsResponseBodyAuthRuleGroupsRulesRuleItemsPublishedAuthRuleItem setAuthRuleId(Long authRuleId) {
            this.authRuleId = authRuleId;
            return this;
        }
        public Long getAuthRuleId() {
            return this.authRuleId;
        }

        public ListMsSgAuthRuleGroupsResponseBodyAuthRuleGroupsRulesRuleItemsPublishedAuthRuleItem setChangedType(String changedType) {
            this.changedType = changedType;
            return this;
        }
        public String getChangedType() {
            return this.changedType;
        }

        public ListMsSgAuthRuleGroupsResponseBodyAuthRuleGroupsRulesRuleItemsPublishedAuthRuleItem setField(String field) {
            this.field = field;
            return this;
        }
        public String getField() {
            return this.field;
        }

        public ListMsSgAuthRuleGroupsResponseBodyAuthRuleGroupsRulesRuleItemsPublishedAuthRuleItem setOperation(String operation) {
            this.operation = operation;
            return this;
        }
        public String getOperation() {
            return this.operation;
        }

        public ListMsSgAuthRuleGroupsResponseBodyAuthRuleGroupsRulesRuleItemsPublishedAuthRuleItem setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListMsSgAuthRuleGroupsResponseBodyAuthRuleGroupsRulesRuleItems extends TeaModel {
        @NameInMap("AuthRuleId")
        public Long authRuleId;

        @NameInMap("ChangedType")
        public String changedType;

        @NameInMap("Field")
        public String field;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Operation")
        public String operation;

        @NameInMap("Type")
        public String type;

        @NameInMap("Value")
        public String value;

        @NameInMap("PublishedAuthRuleItem")
        public ListMsSgAuthRuleGroupsResponseBodyAuthRuleGroupsRulesRuleItemsPublishedAuthRuleItem publishedAuthRuleItem;

        public static ListMsSgAuthRuleGroupsResponseBodyAuthRuleGroupsRulesRuleItems build(java.util.Map<String, ?> map) throws Exception {
            ListMsSgAuthRuleGroupsResponseBodyAuthRuleGroupsRulesRuleItems self = new ListMsSgAuthRuleGroupsResponseBodyAuthRuleGroupsRulesRuleItems();
            return TeaModel.build(map, self);
        }

        public ListMsSgAuthRuleGroupsResponseBodyAuthRuleGroupsRulesRuleItems setAuthRuleId(Long authRuleId) {
            this.authRuleId = authRuleId;
            return this;
        }
        public Long getAuthRuleId() {
            return this.authRuleId;
        }

        public ListMsSgAuthRuleGroupsResponseBodyAuthRuleGroupsRulesRuleItems setChangedType(String changedType) {
            this.changedType = changedType;
            return this;
        }
        public String getChangedType() {
            return this.changedType;
        }

        public ListMsSgAuthRuleGroupsResponseBodyAuthRuleGroupsRulesRuleItems setField(String field) {
            this.field = field;
            return this;
        }
        public String getField() {
            return this.field;
        }

        public ListMsSgAuthRuleGroupsResponseBodyAuthRuleGroupsRulesRuleItems setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListMsSgAuthRuleGroupsResponseBodyAuthRuleGroupsRulesRuleItems setOperation(String operation) {
            this.operation = operation;
            return this;
        }
        public String getOperation() {
            return this.operation;
        }

        public ListMsSgAuthRuleGroupsResponseBodyAuthRuleGroupsRulesRuleItems setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListMsSgAuthRuleGroupsResponseBodyAuthRuleGroupsRulesRuleItems setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public ListMsSgAuthRuleGroupsResponseBodyAuthRuleGroupsRulesRuleItems setPublishedAuthRuleItem(ListMsSgAuthRuleGroupsResponseBodyAuthRuleGroupsRulesRuleItemsPublishedAuthRuleItem publishedAuthRuleItem) {
            this.publishedAuthRuleItem = publishedAuthRuleItem;
            return this;
        }
        public ListMsSgAuthRuleGroupsResponseBodyAuthRuleGroupsRulesRuleItemsPublishedAuthRuleItem getPublishedAuthRuleItem() {
            return this.publishedAuthRuleItem;
        }

    }

    public static class ListMsSgAuthRuleGroupsResponseBodyAuthRuleGroupsRules extends TeaModel {
        @NameInMap("AuthRuleGroupId")
        public String authRuleGroupId;

        @NameInMap("ChangedItemCnt")
        public Long changedItemCnt;

        @NameInMap("ChangedType")
        public String changedType;

        @NameInMap("Enabled")
        public Long enabled;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Mode")
        public String mode;

        @NameInMap("Name")
        public String name;

        @NameInMap("RuleItems")
        public java.util.List<ListMsSgAuthRuleGroupsResponseBodyAuthRuleGroupsRulesRuleItems> ruleItems;

        public static ListMsSgAuthRuleGroupsResponseBodyAuthRuleGroupsRules build(java.util.Map<String, ?> map) throws Exception {
            ListMsSgAuthRuleGroupsResponseBodyAuthRuleGroupsRules self = new ListMsSgAuthRuleGroupsResponseBodyAuthRuleGroupsRules();
            return TeaModel.build(map, self);
        }

        public ListMsSgAuthRuleGroupsResponseBodyAuthRuleGroupsRules setAuthRuleGroupId(String authRuleGroupId) {
            this.authRuleGroupId = authRuleGroupId;
            return this;
        }
        public String getAuthRuleGroupId() {
            return this.authRuleGroupId;
        }

        public ListMsSgAuthRuleGroupsResponseBodyAuthRuleGroupsRules setChangedItemCnt(Long changedItemCnt) {
            this.changedItemCnt = changedItemCnt;
            return this;
        }
        public Long getChangedItemCnt() {
            return this.changedItemCnt;
        }

        public ListMsSgAuthRuleGroupsResponseBodyAuthRuleGroupsRules setChangedType(String changedType) {
            this.changedType = changedType;
            return this;
        }
        public String getChangedType() {
            return this.changedType;
        }

        public ListMsSgAuthRuleGroupsResponseBodyAuthRuleGroupsRules setEnabled(Long enabled) {
            this.enabled = enabled;
            return this;
        }
        public Long getEnabled() {
            return this.enabled;
        }

        public ListMsSgAuthRuleGroupsResponseBodyAuthRuleGroupsRules setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListMsSgAuthRuleGroupsResponseBodyAuthRuleGroupsRules setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

        public ListMsSgAuthRuleGroupsResponseBodyAuthRuleGroupsRules setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListMsSgAuthRuleGroupsResponseBodyAuthRuleGroupsRules setRuleItems(java.util.List<ListMsSgAuthRuleGroupsResponseBodyAuthRuleGroupsRulesRuleItems> ruleItems) {
            this.ruleItems = ruleItems;
            return this;
        }
        public java.util.List<ListMsSgAuthRuleGroupsResponseBodyAuthRuleGroupsRulesRuleItems> getRuleItems() {
            return this.ruleItems;
        }

    }

    public static class ListMsSgAuthRuleGroupsResponseBodyAuthRuleGroups extends TeaModel {
        @NameInMap("DataId")
        public String dataId;

        @NameInMap("Enabled")
        public Long enabled;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("Id")
        public Long id;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Status")
        public Long status;

        @NameInMap("Type")
        public String type;

        @NameInMap("Rules")
        public java.util.List<ListMsSgAuthRuleGroupsResponseBodyAuthRuleGroupsRules> rules;

        public static ListMsSgAuthRuleGroupsResponseBodyAuthRuleGroups build(java.util.Map<String, ?> map) throws Exception {
            ListMsSgAuthRuleGroupsResponseBodyAuthRuleGroups self = new ListMsSgAuthRuleGroupsResponseBodyAuthRuleGroups();
            return TeaModel.build(map, self);
        }

        public ListMsSgAuthRuleGroupsResponseBodyAuthRuleGroups setDataId(String dataId) {
            this.dataId = dataId;
            return this;
        }
        public String getDataId() {
            return this.dataId;
        }

        public ListMsSgAuthRuleGroupsResponseBodyAuthRuleGroups setEnabled(Long enabled) {
            this.enabled = enabled;
            return this;
        }
        public Long getEnabled() {
            return this.enabled;
        }

        public ListMsSgAuthRuleGroupsResponseBodyAuthRuleGroups setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListMsSgAuthRuleGroupsResponseBodyAuthRuleGroups setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListMsSgAuthRuleGroupsResponseBodyAuthRuleGroups setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListMsSgAuthRuleGroupsResponseBodyAuthRuleGroups setStatus(Long status) {
            this.status = status;
            return this;
        }
        public Long getStatus() {
            return this.status;
        }

        public ListMsSgAuthRuleGroupsResponseBodyAuthRuleGroups setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListMsSgAuthRuleGroupsResponseBodyAuthRuleGroups setRules(java.util.List<ListMsSgAuthRuleGroupsResponseBodyAuthRuleGroupsRules> rules) {
            this.rules = rules;
            return this;
        }
        public java.util.List<ListMsSgAuthRuleGroupsResponseBodyAuthRuleGroupsRules> getRules() {
            return this.rules;
        }

    }

}
