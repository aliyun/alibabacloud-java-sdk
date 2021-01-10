// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListMsSgAuthRuleGroupServicesResponseBody extends TeaModel {
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
    public java.util.List<ListMsSgAuthRuleGroupServicesResponseBodyAuthRuleGroups> authRuleGroups;

    public static ListMsSgAuthRuleGroupServicesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMsSgAuthRuleGroupServicesResponseBody self = new ListMsSgAuthRuleGroupServicesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMsSgAuthRuleGroupServicesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListMsSgAuthRuleGroupServicesResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListMsSgAuthRuleGroupServicesResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public ListMsSgAuthRuleGroupServicesResponseBody setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public ListMsSgAuthRuleGroupServicesResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListMsSgAuthRuleGroupServicesResponseBody setStartIndex(Long startIndex) {
        this.startIndex = startIndex;
        return this;
    }
    public Long getStartIndex() {
        return this.startIndex;
    }

    public ListMsSgAuthRuleGroupServicesResponseBody setTotalSize(Long totalSize) {
        this.totalSize = totalSize;
        return this;
    }
    public Long getTotalSize() {
        return this.totalSize;
    }

    public ListMsSgAuthRuleGroupServicesResponseBody setAuthRuleGroups(java.util.List<ListMsSgAuthRuleGroupServicesResponseBodyAuthRuleGroups> authRuleGroups) {
        this.authRuleGroups = authRuleGroups;
        return this;
    }
    public java.util.List<ListMsSgAuthRuleGroupServicesResponseBodyAuthRuleGroups> getAuthRuleGroups() {
        return this.authRuleGroups;
    }

    public static class ListMsSgAuthRuleGroupServicesResponseBodyAuthRuleGroupsRulesRuleItems extends TeaModel {
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

        public static ListMsSgAuthRuleGroupServicesResponseBodyAuthRuleGroupsRulesRuleItems build(java.util.Map<String, ?> map) throws Exception {
            ListMsSgAuthRuleGroupServicesResponseBodyAuthRuleGroupsRulesRuleItems self = new ListMsSgAuthRuleGroupServicesResponseBodyAuthRuleGroupsRulesRuleItems();
            return TeaModel.build(map, self);
        }

        public ListMsSgAuthRuleGroupServicesResponseBodyAuthRuleGroupsRulesRuleItems setAuthRuleId(Long authRuleId) {
            this.authRuleId = authRuleId;
            return this;
        }
        public Long getAuthRuleId() {
            return this.authRuleId;
        }

        public ListMsSgAuthRuleGroupServicesResponseBodyAuthRuleGroupsRulesRuleItems setField(String field) {
            this.field = field;
            return this;
        }
        public String getField() {
            return this.field;
        }

        public ListMsSgAuthRuleGroupServicesResponseBodyAuthRuleGroupsRulesRuleItems setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListMsSgAuthRuleGroupServicesResponseBodyAuthRuleGroupsRulesRuleItems setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListMsSgAuthRuleGroupServicesResponseBodyAuthRuleGroupsRulesRuleItems setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListMsSgAuthRuleGroupServicesResponseBodyAuthRuleGroupsRulesRuleItems setOperation(String operation) {
            this.operation = operation;
            return this;
        }
        public String getOperation() {
            return this.operation;
        }

        public ListMsSgAuthRuleGroupServicesResponseBodyAuthRuleGroupsRulesRuleItems setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public ListMsSgAuthRuleGroupServicesResponseBodyAuthRuleGroupsRulesRuleItems setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListMsSgAuthRuleGroupServicesResponseBodyAuthRuleGroupsRulesRuleItems setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListMsSgAuthRuleGroupServicesResponseBodyAuthRuleGroupsRules extends TeaModel {
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
        public java.util.List<ListMsSgAuthRuleGroupServicesResponseBodyAuthRuleGroupsRulesRuleItems> ruleItems;

        public static ListMsSgAuthRuleGroupServicesResponseBodyAuthRuleGroupsRules build(java.util.Map<String, ?> map) throws Exception {
            ListMsSgAuthRuleGroupServicesResponseBodyAuthRuleGroupsRules self = new ListMsSgAuthRuleGroupServicesResponseBodyAuthRuleGroupsRules();
            return TeaModel.build(map, self);
        }

        public ListMsSgAuthRuleGroupServicesResponseBodyAuthRuleGroupsRules setAuthRuleGroupId(Long authRuleGroupId) {
            this.authRuleGroupId = authRuleGroupId;
            return this;
        }
        public Long getAuthRuleGroupId() {
            return this.authRuleGroupId;
        }

        public ListMsSgAuthRuleGroupServicesResponseBodyAuthRuleGroupsRules setEnabled(Long enabled) {
            this.enabled = enabled;
            return this;
        }
        public Long getEnabled() {
            return this.enabled;
        }

        public ListMsSgAuthRuleGroupServicesResponseBodyAuthRuleGroupsRules setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListMsSgAuthRuleGroupServicesResponseBodyAuthRuleGroupsRules setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListMsSgAuthRuleGroupServicesResponseBodyAuthRuleGroupsRules setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListMsSgAuthRuleGroupServicesResponseBodyAuthRuleGroupsRules setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

        public ListMsSgAuthRuleGroupServicesResponseBodyAuthRuleGroupsRules setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListMsSgAuthRuleGroupServicesResponseBodyAuthRuleGroupsRules setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListMsSgAuthRuleGroupServicesResponseBodyAuthRuleGroupsRules setRuleItems(java.util.List<ListMsSgAuthRuleGroupServicesResponseBodyAuthRuleGroupsRulesRuleItems> ruleItems) {
            this.ruleItems = ruleItems;
            return this;
        }
        public java.util.List<ListMsSgAuthRuleGroupServicesResponseBodyAuthRuleGroupsRulesRuleItems> getRuleItems() {
            return this.ruleItems;
        }

    }

    public static class ListMsSgAuthRuleGroupServicesResponseBodyAuthRuleGroups extends TeaModel {
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
        public java.util.List<ListMsSgAuthRuleGroupServicesResponseBodyAuthRuleGroupsRules> rules;

        public static ListMsSgAuthRuleGroupServicesResponseBodyAuthRuleGroups build(java.util.Map<String, ?> map) throws Exception {
            ListMsSgAuthRuleGroupServicesResponseBodyAuthRuleGroups self = new ListMsSgAuthRuleGroupServicesResponseBodyAuthRuleGroups();
            return TeaModel.build(map, self);
        }

        public ListMsSgAuthRuleGroupServicesResponseBodyAuthRuleGroups setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public ListMsSgAuthRuleGroupServicesResponseBodyAuthRuleGroups setBlackGroupId(Long blackGroupId) {
            this.blackGroupId = blackGroupId;
            return this;
        }
        public Long getBlackGroupId() {
            return this.blackGroupId;
        }

        public ListMsSgAuthRuleGroupServicesResponseBodyAuthRuleGroups setBlackState(Long blackState) {
            this.blackState = blackState;
            return this;
        }
        public Long getBlackState() {
            return this.blackState;
        }

        public ListMsSgAuthRuleGroupServicesResponseBodyAuthRuleGroups setChangeStatus(String changeStatus) {
            this.changeStatus = changeStatus;
            return this;
        }
        public String getChangeStatus() {
            return this.changeStatus;
        }

        public ListMsSgAuthRuleGroupServicesResponseBodyAuthRuleGroups setDataId(String dataId) {
            this.dataId = dataId;
            return this;
        }
        public String getDataId() {
            return this.dataId;
        }

        public ListMsSgAuthRuleGroupServicesResponseBodyAuthRuleGroups setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListMsSgAuthRuleGroupServicesResponseBodyAuthRuleGroups setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListMsSgAuthRuleGroupServicesResponseBodyAuthRuleGroups setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListMsSgAuthRuleGroupServicesResponseBodyAuthRuleGroups setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListMsSgAuthRuleGroupServicesResponseBodyAuthRuleGroups setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public ListMsSgAuthRuleGroupServicesResponseBodyAuthRuleGroups setStatus(Long status) {
            this.status = status;
            return this;
        }
        public Long getStatus() {
            return this.status;
        }

        public ListMsSgAuthRuleGroupServicesResponseBodyAuthRuleGroups setWhiteGroupId(Long whiteGroupId) {
            this.whiteGroupId = whiteGroupId;
            return this;
        }
        public Long getWhiteGroupId() {
            return this.whiteGroupId;
        }

        public ListMsSgAuthRuleGroupServicesResponseBodyAuthRuleGroups setWhiteState(Long whiteState) {
            this.whiteState = whiteState;
            return this;
        }
        public Long getWhiteState() {
            return this.whiteState;
        }

        public ListMsSgAuthRuleGroupServicesResponseBodyAuthRuleGroups setRules(java.util.List<ListMsSgAuthRuleGroupServicesResponseBodyAuthRuleGroupsRules> rules) {
            this.rules = rules;
            return this;
        }
        public java.util.List<ListMsSgAuthRuleGroupServicesResponseBodyAuthRuleGroupsRules> getRules() {
            return this.rules;
        }

    }

}
