// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListSofaMsSgAuthRuleGroupsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("AuthRuleGroups")
    public java.util.List<ListSofaMsSgAuthRuleGroupsResponseBodyAuthRuleGroups> authRuleGroups;

    public static ListSofaMsSgAuthRuleGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSofaMsSgAuthRuleGroupsResponseBody self = new ListSofaMsSgAuthRuleGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSofaMsSgAuthRuleGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSofaMsSgAuthRuleGroupsResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListSofaMsSgAuthRuleGroupsResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public ListSofaMsSgAuthRuleGroupsResponseBody setAuthRuleGroups(java.util.List<ListSofaMsSgAuthRuleGroupsResponseBodyAuthRuleGroups> authRuleGroups) {
        this.authRuleGroups = authRuleGroups;
        return this;
    }
    public java.util.List<ListSofaMsSgAuthRuleGroupsResponseBodyAuthRuleGroups> getAuthRuleGroups() {
        return this.authRuleGroups;
    }

    public static class ListSofaMsSgAuthRuleGroupsResponseBodyAuthRuleGroupsRulesRuleItemsPublishedAuthRuleItem extends TeaModel {
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

        public static ListSofaMsSgAuthRuleGroupsResponseBodyAuthRuleGroupsRulesRuleItemsPublishedAuthRuleItem build(java.util.Map<String, ?> map) throws Exception {
            ListSofaMsSgAuthRuleGroupsResponseBodyAuthRuleGroupsRulesRuleItemsPublishedAuthRuleItem self = new ListSofaMsSgAuthRuleGroupsResponseBodyAuthRuleGroupsRulesRuleItemsPublishedAuthRuleItem();
            return TeaModel.build(map, self);
        }

        public ListSofaMsSgAuthRuleGroupsResponseBodyAuthRuleGroupsRulesRuleItemsPublishedAuthRuleItem setAuthRuleId(Long authRuleId) {
            this.authRuleId = authRuleId;
            return this;
        }
        public Long getAuthRuleId() {
            return this.authRuleId;
        }

        public ListSofaMsSgAuthRuleGroupsResponseBodyAuthRuleGroupsRulesRuleItemsPublishedAuthRuleItem setChangedType(String changedType) {
            this.changedType = changedType;
            return this;
        }
        public String getChangedType() {
            return this.changedType;
        }

        public ListSofaMsSgAuthRuleGroupsResponseBodyAuthRuleGroupsRulesRuleItemsPublishedAuthRuleItem setField(String field) {
            this.field = field;
            return this;
        }
        public String getField() {
            return this.field;
        }

        public ListSofaMsSgAuthRuleGroupsResponseBodyAuthRuleGroupsRulesRuleItemsPublishedAuthRuleItem setOperation(String operation) {
            this.operation = operation;
            return this;
        }
        public String getOperation() {
            return this.operation;
        }

        public ListSofaMsSgAuthRuleGroupsResponseBodyAuthRuleGroupsRulesRuleItemsPublishedAuthRuleItem setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListSofaMsSgAuthRuleGroupsResponseBodyAuthRuleGroupsRulesRuleItems extends TeaModel {
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
        public ListSofaMsSgAuthRuleGroupsResponseBodyAuthRuleGroupsRulesRuleItemsPublishedAuthRuleItem publishedAuthRuleItem;

        public static ListSofaMsSgAuthRuleGroupsResponseBodyAuthRuleGroupsRulesRuleItems build(java.util.Map<String, ?> map) throws Exception {
            ListSofaMsSgAuthRuleGroupsResponseBodyAuthRuleGroupsRulesRuleItems self = new ListSofaMsSgAuthRuleGroupsResponseBodyAuthRuleGroupsRulesRuleItems();
            return TeaModel.build(map, self);
        }

        public ListSofaMsSgAuthRuleGroupsResponseBodyAuthRuleGroupsRulesRuleItems setAuthRuleId(Long authRuleId) {
            this.authRuleId = authRuleId;
            return this;
        }
        public Long getAuthRuleId() {
            return this.authRuleId;
        }

        public ListSofaMsSgAuthRuleGroupsResponseBodyAuthRuleGroupsRulesRuleItems setChangedType(String changedType) {
            this.changedType = changedType;
            return this;
        }
        public String getChangedType() {
            return this.changedType;
        }

        public ListSofaMsSgAuthRuleGroupsResponseBodyAuthRuleGroupsRulesRuleItems setField(String field) {
            this.field = field;
            return this;
        }
        public String getField() {
            return this.field;
        }

        public ListSofaMsSgAuthRuleGroupsResponseBodyAuthRuleGroupsRulesRuleItems setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListSofaMsSgAuthRuleGroupsResponseBodyAuthRuleGroupsRulesRuleItems setOperation(String operation) {
            this.operation = operation;
            return this;
        }
        public String getOperation() {
            return this.operation;
        }

        public ListSofaMsSgAuthRuleGroupsResponseBodyAuthRuleGroupsRulesRuleItems setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListSofaMsSgAuthRuleGroupsResponseBodyAuthRuleGroupsRulesRuleItems setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public ListSofaMsSgAuthRuleGroupsResponseBodyAuthRuleGroupsRulesRuleItems setPublishedAuthRuleItem(ListSofaMsSgAuthRuleGroupsResponseBodyAuthRuleGroupsRulesRuleItemsPublishedAuthRuleItem publishedAuthRuleItem) {
            this.publishedAuthRuleItem = publishedAuthRuleItem;
            return this;
        }
        public ListSofaMsSgAuthRuleGroupsResponseBodyAuthRuleGroupsRulesRuleItemsPublishedAuthRuleItem getPublishedAuthRuleItem() {
            return this.publishedAuthRuleItem;
        }

    }

    public static class ListSofaMsSgAuthRuleGroupsResponseBodyAuthRuleGroupsRules extends TeaModel {
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
        public java.util.List<ListSofaMsSgAuthRuleGroupsResponseBodyAuthRuleGroupsRulesRuleItems> ruleItems;

        public static ListSofaMsSgAuthRuleGroupsResponseBodyAuthRuleGroupsRules build(java.util.Map<String, ?> map) throws Exception {
            ListSofaMsSgAuthRuleGroupsResponseBodyAuthRuleGroupsRules self = new ListSofaMsSgAuthRuleGroupsResponseBodyAuthRuleGroupsRules();
            return TeaModel.build(map, self);
        }

        public ListSofaMsSgAuthRuleGroupsResponseBodyAuthRuleGroupsRules setAuthRuleGroupId(String authRuleGroupId) {
            this.authRuleGroupId = authRuleGroupId;
            return this;
        }
        public String getAuthRuleGroupId() {
            return this.authRuleGroupId;
        }

        public ListSofaMsSgAuthRuleGroupsResponseBodyAuthRuleGroupsRules setChangedItemCnt(Long changedItemCnt) {
            this.changedItemCnt = changedItemCnt;
            return this;
        }
        public Long getChangedItemCnt() {
            return this.changedItemCnt;
        }

        public ListSofaMsSgAuthRuleGroupsResponseBodyAuthRuleGroupsRules setChangedType(String changedType) {
            this.changedType = changedType;
            return this;
        }
        public String getChangedType() {
            return this.changedType;
        }

        public ListSofaMsSgAuthRuleGroupsResponseBodyAuthRuleGroupsRules setEnabled(Long enabled) {
            this.enabled = enabled;
            return this;
        }
        public Long getEnabled() {
            return this.enabled;
        }

        public ListSofaMsSgAuthRuleGroupsResponseBodyAuthRuleGroupsRules setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListSofaMsSgAuthRuleGroupsResponseBodyAuthRuleGroupsRules setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

        public ListSofaMsSgAuthRuleGroupsResponseBodyAuthRuleGroupsRules setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListSofaMsSgAuthRuleGroupsResponseBodyAuthRuleGroupsRules setRuleItems(java.util.List<ListSofaMsSgAuthRuleGroupsResponseBodyAuthRuleGroupsRulesRuleItems> ruleItems) {
            this.ruleItems = ruleItems;
            return this;
        }
        public java.util.List<ListSofaMsSgAuthRuleGroupsResponseBodyAuthRuleGroupsRulesRuleItems> getRuleItems() {
            return this.ruleItems;
        }

    }

    public static class ListSofaMsSgAuthRuleGroupsResponseBodyAuthRuleGroups extends TeaModel {
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
        public java.util.List<ListSofaMsSgAuthRuleGroupsResponseBodyAuthRuleGroupsRules> rules;

        public static ListSofaMsSgAuthRuleGroupsResponseBodyAuthRuleGroups build(java.util.Map<String, ?> map) throws Exception {
            ListSofaMsSgAuthRuleGroupsResponseBodyAuthRuleGroups self = new ListSofaMsSgAuthRuleGroupsResponseBodyAuthRuleGroups();
            return TeaModel.build(map, self);
        }

        public ListSofaMsSgAuthRuleGroupsResponseBodyAuthRuleGroups setDataId(String dataId) {
            this.dataId = dataId;
            return this;
        }
        public String getDataId() {
            return this.dataId;
        }

        public ListSofaMsSgAuthRuleGroupsResponseBodyAuthRuleGroups setEnabled(Long enabled) {
            this.enabled = enabled;
            return this;
        }
        public Long getEnabled() {
            return this.enabled;
        }

        public ListSofaMsSgAuthRuleGroupsResponseBodyAuthRuleGroups setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListSofaMsSgAuthRuleGroupsResponseBodyAuthRuleGroups setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListSofaMsSgAuthRuleGroupsResponseBodyAuthRuleGroups setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListSofaMsSgAuthRuleGroupsResponseBodyAuthRuleGroups setStatus(Long status) {
            this.status = status;
            return this;
        }
        public Long getStatus() {
            return this.status;
        }

        public ListSofaMsSgAuthRuleGroupsResponseBodyAuthRuleGroups setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListSofaMsSgAuthRuleGroupsResponseBodyAuthRuleGroups setRules(java.util.List<ListSofaMsSgAuthRuleGroupsResponseBodyAuthRuleGroupsRules> rules) {
            this.rules = rules;
            return this;
        }
        public java.util.List<ListSofaMsSgAuthRuleGroupsResponseBodyAuthRuleGroupsRules> getRules() {
            return this.rules;
        }

    }

}
