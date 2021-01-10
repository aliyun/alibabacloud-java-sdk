// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListMsSgAuthRuleGroupAppsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("CurrentPage")
    public Long currentPage;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("StartIndex")
    public Long startIndex;

    @NameInMap("TotalSize")
    public Long totalSize;

    @NameInMap("AuthRuleGroups")
    public java.util.List<ListMsSgAuthRuleGroupAppsResponseBodyAuthRuleGroups> authRuleGroups;

    public static ListMsSgAuthRuleGroupAppsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMsSgAuthRuleGroupAppsResponseBody self = new ListMsSgAuthRuleGroupAppsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMsSgAuthRuleGroupAppsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListMsSgAuthRuleGroupAppsResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListMsSgAuthRuleGroupAppsResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public ListMsSgAuthRuleGroupAppsResponseBody setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public ListMsSgAuthRuleGroupAppsResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListMsSgAuthRuleGroupAppsResponseBody setStartIndex(Long startIndex) {
        this.startIndex = startIndex;
        return this;
    }
    public Long getStartIndex() {
        return this.startIndex;
    }

    public ListMsSgAuthRuleGroupAppsResponseBody setTotalSize(Long totalSize) {
        this.totalSize = totalSize;
        return this;
    }
    public Long getTotalSize() {
        return this.totalSize;
    }

    public ListMsSgAuthRuleGroupAppsResponseBody setAuthRuleGroups(java.util.List<ListMsSgAuthRuleGroupAppsResponseBodyAuthRuleGroups> authRuleGroups) {
        this.authRuleGroups = authRuleGroups;
        return this;
    }
    public java.util.List<ListMsSgAuthRuleGroupAppsResponseBodyAuthRuleGroups> getAuthRuleGroups() {
        return this.authRuleGroups;
    }

    public static class ListMsSgAuthRuleGroupAppsResponseBodyAuthRuleGroupsRulesRuleItems extends TeaModel {
        @NameInMap("AuthRuleId")
        public Long authRuleId;

        @NameInMap("Field")
        public String field;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Operation")
        public String operation;

        @NameInMap("Operator")
        public String operator;

        @NameInMap("Type")
        public String type;

        @NameInMap("Value")
        public String value;

        public static ListMsSgAuthRuleGroupAppsResponseBodyAuthRuleGroupsRulesRuleItems build(java.util.Map<String, ?> map) throws Exception {
            ListMsSgAuthRuleGroupAppsResponseBodyAuthRuleGroupsRulesRuleItems self = new ListMsSgAuthRuleGroupAppsResponseBodyAuthRuleGroupsRulesRuleItems();
            return TeaModel.build(map, self);
        }

        public ListMsSgAuthRuleGroupAppsResponseBodyAuthRuleGroupsRulesRuleItems setAuthRuleId(Long authRuleId) {
            this.authRuleId = authRuleId;
            return this;
        }
        public Long getAuthRuleId() {
            return this.authRuleId;
        }

        public ListMsSgAuthRuleGroupAppsResponseBodyAuthRuleGroupsRulesRuleItems setField(String field) {
            this.field = field;
            return this;
        }
        public String getField() {
            return this.field;
        }

        public ListMsSgAuthRuleGroupAppsResponseBodyAuthRuleGroupsRulesRuleItems setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListMsSgAuthRuleGroupAppsResponseBodyAuthRuleGroupsRulesRuleItems setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListMsSgAuthRuleGroupAppsResponseBodyAuthRuleGroupsRulesRuleItems setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListMsSgAuthRuleGroupAppsResponseBodyAuthRuleGroupsRulesRuleItems setOperation(String operation) {
            this.operation = operation;
            return this;
        }
        public String getOperation() {
            return this.operation;
        }

        public ListMsSgAuthRuleGroupAppsResponseBodyAuthRuleGroupsRulesRuleItems setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public ListMsSgAuthRuleGroupAppsResponseBodyAuthRuleGroupsRulesRuleItems setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListMsSgAuthRuleGroupAppsResponseBodyAuthRuleGroupsRulesRuleItems setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListMsSgAuthRuleGroupAppsResponseBodyAuthRuleGroupsRules extends TeaModel {
        @NameInMap("AuthRuleGroupId")
        public Long authRuleGroupId;

        @NameInMap("Enabled")
        public Long enabled;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("Id")
        public String id;

        @NameInMap("Mode")
        public String mode;

        @NameInMap("Name")
        public String name;

        @NameInMap("Type")
        public String type;

        @NameInMap("RuleItems")
        public java.util.List<ListMsSgAuthRuleGroupAppsResponseBodyAuthRuleGroupsRulesRuleItems> ruleItems;

        public static ListMsSgAuthRuleGroupAppsResponseBodyAuthRuleGroupsRules build(java.util.Map<String, ?> map) throws Exception {
            ListMsSgAuthRuleGroupAppsResponseBodyAuthRuleGroupsRules self = new ListMsSgAuthRuleGroupAppsResponseBodyAuthRuleGroupsRules();
            return TeaModel.build(map, self);
        }

        public ListMsSgAuthRuleGroupAppsResponseBodyAuthRuleGroupsRules setAuthRuleGroupId(Long authRuleGroupId) {
            this.authRuleGroupId = authRuleGroupId;
            return this;
        }
        public Long getAuthRuleGroupId() {
            return this.authRuleGroupId;
        }

        public ListMsSgAuthRuleGroupAppsResponseBodyAuthRuleGroupsRules setEnabled(Long enabled) {
            this.enabled = enabled;
            return this;
        }
        public Long getEnabled() {
            return this.enabled;
        }

        public ListMsSgAuthRuleGroupAppsResponseBodyAuthRuleGroupsRules setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListMsSgAuthRuleGroupAppsResponseBodyAuthRuleGroupsRules setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListMsSgAuthRuleGroupAppsResponseBodyAuthRuleGroupsRules setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListMsSgAuthRuleGroupAppsResponseBodyAuthRuleGroupsRules setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

        public ListMsSgAuthRuleGroupAppsResponseBodyAuthRuleGroupsRules setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListMsSgAuthRuleGroupAppsResponseBodyAuthRuleGroupsRules setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListMsSgAuthRuleGroupAppsResponseBodyAuthRuleGroupsRules setRuleItems(java.util.List<ListMsSgAuthRuleGroupAppsResponseBodyAuthRuleGroupsRulesRuleItems> ruleItems) {
            this.ruleItems = ruleItems;
            return this;
        }
        public java.util.List<ListMsSgAuthRuleGroupAppsResponseBodyAuthRuleGroupsRulesRuleItems> getRuleItems() {
            return this.ruleItems;
        }

    }

    public static class ListMsSgAuthRuleGroupAppsResponseBodyAuthRuleGroups extends TeaModel {
        @NameInMap("AppName")
        public String appName;

        @NameInMap("BlackGroupId")
        public Long blackGroupId;

        @NameInMap("BlackState")
        public Long blackState;

        @NameInMap("ChangeStatus")
        public String changeStatus;

        @NameInMap("DataId")
        public String dataId;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("Id")
        public Long id;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Operator")
        public String operator;

        @NameInMap("Status")
        public Long status;

        @NameInMap("WhiteGroupId")
        public Long whiteGroupId;

        @NameInMap("WhiteState")
        public Long whiteState;

        @NameInMap("Rules")
        public java.util.List<ListMsSgAuthRuleGroupAppsResponseBodyAuthRuleGroupsRules> rules;

        public static ListMsSgAuthRuleGroupAppsResponseBodyAuthRuleGroups build(java.util.Map<String, ?> map) throws Exception {
            ListMsSgAuthRuleGroupAppsResponseBodyAuthRuleGroups self = new ListMsSgAuthRuleGroupAppsResponseBodyAuthRuleGroups();
            return TeaModel.build(map, self);
        }

        public ListMsSgAuthRuleGroupAppsResponseBodyAuthRuleGroups setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public ListMsSgAuthRuleGroupAppsResponseBodyAuthRuleGroups setBlackGroupId(Long blackGroupId) {
            this.blackGroupId = blackGroupId;
            return this;
        }
        public Long getBlackGroupId() {
            return this.blackGroupId;
        }

        public ListMsSgAuthRuleGroupAppsResponseBodyAuthRuleGroups setBlackState(Long blackState) {
            this.blackState = blackState;
            return this;
        }
        public Long getBlackState() {
            return this.blackState;
        }

        public ListMsSgAuthRuleGroupAppsResponseBodyAuthRuleGroups setChangeStatus(String changeStatus) {
            this.changeStatus = changeStatus;
            return this;
        }
        public String getChangeStatus() {
            return this.changeStatus;
        }

        public ListMsSgAuthRuleGroupAppsResponseBodyAuthRuleGroups setDataId(String dataId) {
            this.dataId = dataId;
            return this;
        }
        public String getDataId() {
            return this.dataId;
        }

        public ListMsSgAuthRuleGroupAppsResponseBodyAuthRuleGroups setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListMsSgAuthRuleGroupAppsResponseBodyAuthRuleGroups setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListMsSgAuthRuleGroupAppsResponseBodyAuthRuleGroups setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListMsSgAuthRuleGroupAppsResponseBodyAuthRuleGroups setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListMsSgAuthRuleGroupAppsResponseBodyAuthRuleGroups setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public ListMsSgAuthRuleGroupAppsResponseBodyAuthRuleGroups setStatus(Long status) {
            this.status = status;
            return this;
        }
        public Long getStatus() {
            return this.status;
        }

        public ListMsSgAuthRuleGroupAppsResponseBodyAuthRuleGroups setWhiteGroupId(Long whiteGroupId) {
            this.whiteGroupId = whiteGroupId;
            return this;
        }
        public Long getWhiteGroupId() {
            return this.whiteGroupId;
        }

        public ListMsSgAuthRuleGroupAppsResponseBodyAuthRuleGroups setWhiteState(Long whiteState) {
            this.whiteState = whiteState;
            return this;
        }
        public Long getWhiteState() {
            return this.whiteState;
        }

        public ListMsSgAuthRuleGroupAppsResponseBodyAuthRuleGroups setRules(java.util.List<ListMsSgAuthRuleGroupAppsResponseBodyAuthRuleGroupsRules> rules) {
            this.rules = rules;
            return this;
        }
        public java.util.List<ListMsSgAuthRuleGroupAppsResponseBodyAuthRuleGroupsRules> getRules() {
            return this.rules;
        }

    }

}
