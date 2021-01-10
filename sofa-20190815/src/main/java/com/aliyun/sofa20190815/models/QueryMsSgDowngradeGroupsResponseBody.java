// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryMsSgDowngradeGroupsResponseBody extends TeaModel {
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

    @NameInMap("TotalSize")
    public Long totalSize;

    @NameInMap("DowngradeRuleGroups")
    public java.util.List<QueryMsSgDowngradeGroupsResponseBodyDowngradeRuleGroups> downgradeRuleGroups;

    public static QueryMsSgDowngradeGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryMsSgDowngradeGroupsResponseBody self = new QueryMsSgDowngradeGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryMsSgDowngradeGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryMsSgDowngradeGroupsResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryMsSgDowngradeGroupsResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryMsSgDowngradeGroupsResponseBody setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public QueryMsSgDowngradeGroupsResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryMsSgDowngradeGroupsResponseBody setTotalSize(Long totalSize) {
        this.totalSize = totalSize;
        return this;
    }
    public Long getTotalSize() {
        return this.totalSize;
    }

    public QueryMsSgDowngradeGroupsResponseBody setDowngradeRuleGroups(java.util.List<QueryMsSgDowngradeGroupsResponseBodyDowngradeRuleGroups> downgradeRuleGroups) {
        this.downgradeRuleGroups = downgradeRuleGroups;
        return this;
    }
    public java.util.List<QueryMsSgDowngradeGroupsResponseBodyDowngradeRuleGroups> getDowngradeRuleGroups() {
        return this.downgradeRuleGroups;
    }

    public static class QueryMsSgDowngradeGroupsResponseBodyDowngradeRuleGroupsDowngradeRules extends TeaModel {
        @NameInMap("DowngradeAction")
        public String downgradeAction;

        @NameInMap("DowngradeMethod")
        public String downgradeMethod;

        @NameInMap("DowngradeService")
        public String downgradeService;

        @NameInMap("Enabled")
        public Long enabled;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("GroupId")
        public Long groupId;

        @NameInMap("Id")
        public Long id;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Mode")
        public String mode;

        @NameInMap("RuleName")
        public String ruleName;

        public static QueryMsSgDowngradeGroupsResponseBodyDowngradeRuleGroupsDowngradeRules build(java.util.Map<String, ?> map) throws Exception {
            QueryMsSgDowngradeGroupsResponseBodyDowngradeRuleGroupsDowngradeRules self = new QueryMsSgDowngradeGroupsResponseBodyDowngradeRuleGroupsDowngradeRules();
            return TeaModel.build(map, self);
        }

        public QueryMsSgDowngradeGroupsResponseBodyDowngradeRuleGroupsDowngradeRules setDowngradeAction(String downgradeAction) {
            this.downgradeAction = downgradeAction;
            return this;
        }
        public String getDowngradeAction() {
            return this.downgradeAction;
        }

        public QueryMsSgDowngradeGroupsResponseBodyDowngradeRuleGroupsDowngradeRules setDowngradeMethod(String downgradeMethod) {
            this.downgradeMethod = downgradeMethod;
            return this;
        }
        public String getDowngradeMethod() {
            return this.downgradeMethod;
        }

        public QueryMsSgDowngradeGroupsResponseBodyDowngradeRuleGroupsDowngradeRules setDowngradeService(String downgradeService) {
            this.downgradeService = downgradeService;
            return this;
        }
        public String getDowngradeService() {
            return this.downgradeService;
        }

        public QueryMsSgDowngradeGroupsResponseBodyDowngradeRuleGroupsDowngradeRules setEnabled(Long enabled) {
            this.enabled = enabled;
            return this;
        }
        public Long getEnabled() {
            return this.enabled;
        }

        public QueryMsSgDowngradeGroupsResponseBodyDowngradeRuleGroupsDowngradeRules setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public QueryMsSgDowngradeGroupsResponseBodyDowngradeRuleGroupsDowngradeRules setGroupId(Long groupId) {
            this.groupId = groupId;
            return this;
        }
        public Long getGroupId() {
            return this.groupId;
        }

        public QueryMsSgDowngradeGroupsResponseBodyDowngradeRuleGroupsDowngradeRules setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QueryMsSgDowngradeGroupsResponseBodyDowngradeRuleGroupsDowngradeRules setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public QueryMsSgDowngradeGroupsResponseBodyDowngradeRuleGroupsDowngradeRules setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

        public QueryMsSgDowngradeGroupsResponseBodyDowngradeRuleGroupsDowngradeRules setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

    }

    public static class QueryMsSgDowngradeGroupsResponseBodyDowngradeRuleGroups extends TeaModel {
        @NameInMap("AppName")
        public String appName;

        @NameInMap("Enabled")
        public Long enabled;

        @NameInMap("Id")
        public Long id;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Type")
        public String type;

        @NameInMap("DowngradeRules")
        public java.util.List<QueryMsSgDowngradeGroupsResponseBodyDowngradeRuleGroupsDowngradeRules> downgradeRules;

        public static QueryMsSgDowngradeGroupsResponseBodyDowngradeRuleGroups build(java.util.Map<String, ?> map) throws Exception {
            QueryMsSgDowngradeGroupsResponseBodyDowngradeRuleGroups self = new QueryMsSgDowngradeGroupsResponseBodyDowngradeRuleGroups();
            return TeaModel.build(map, self);
        }

        public QueryMsSgDowngradeGroupsResponseBodyDowngradeRuleGroups setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public QueryMsSgDowngradeGroupsResponseBodyDowngradeRuleGroups setEnabled(Long enabled) {
            this.enabled = enabled;
            return this;
        }
        public Long getEnabled() {
            return this.enabled;
        }

        public QueryMsSgDowngradeGroupsResponseBodyDowngradeRuleGroups setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QueryMsSgDowngradeGroupsResponseBodyDowngradeRuleGroups setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public QueryMsSgDowngradeGroupsResponseBodyDowngradeRuleGroups setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public QueryMsSgDowngradeGroupsResponseBodyDowngradeRuleGroups setDowngradeRules(java.util.List<QueryMsSgDowngradeGroupsResponseBodyDowngradeRuleGroupsDowngradeRules> downgradeRules) {
            this.downgradeRules = downgradeRules;
            return this;
        }
        public java.util.List<QueryMsSgDowngradeGroupsResponseBodyDowngradeRuleGroupsDowngradeRules> getDowngradeRules() {
            return this.downgradeRules;
        }

    }

}
