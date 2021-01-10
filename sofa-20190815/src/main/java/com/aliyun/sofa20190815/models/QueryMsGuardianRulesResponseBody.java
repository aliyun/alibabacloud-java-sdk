// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryMsGuardianRulesResponseBody extends TeaModel {
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

    @NameInMap("GuardianRules")
    public java.util.List<QueryMsGuardianRulesResponseBodyGuardianRules> guardianRules;

    public static QueryMsGuardianRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryMsGuardianRulesResponseBody self = new QueryMsGuardianRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryMsGuardianRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryMsGuardianRulesResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryMsGuardianRulesResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryMsGuardianRulesResponseBody setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public QueryMsGuardianRulesResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryMsGuardianRulesResponseBody setStartIndex(Long startIndex) {
        this.startIndex = startIndex;
        return this;
    }
    public Long getStartIndex() {
        return this.startIndex;
    }

    public QueryMsGuardianRulesResponseBody setTotalSize(Long totalSize) {
        this.totalSize = totalSize;
        return this;
    }
    public Long getTotalSize() {
        return this.totalSize;
    }

    public QueryMsGuardianRulesResponseBody setGuardianRules(java.util.List<QueryMsGuardianRulesResponseBodyGuardianRules> guardianRules) {
        this.guardianRules = guardianRules;
        return this;
    }
    public java.util.List<QueryMsGuardianRulesResponseBodyGuardianRules> getGuardianRules() {
        return this.guardianRules;
    }

    public static class QueryMsGuardianRulesResponseBodyGuardianRules extends TeaModel {
        @NameInMap("AppName")
        public String appName;

        @NameInMap("Enable")
        public Boolean enable;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("Id")
        public Long id;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Name")
        public String name;

        @NameInMap("Operator")
        public String operator;

        @NameInMap("ResourceType")
        public String resourceType;

        @NameInMap("RuleConfig")
        public String ruleConfig;

        @NameInMap("RunMode")
        public String runMode;

        public static QueryMsGuardianRulesResponseBodyGuardianRules build(java.util.Map<String, ?> map) throws Exception {
            QueryMsGuardianRulesResponseBodyGuardianRules self = new QueryMsGuardianRulesResponseBodyGuardianRules();
            return TeaModel.build(map, self);
        }

        public QueryMsGuardianRulesResponseBodyGuardianRules setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public QueryMsGuardianRulesResponseBodyGuardianRules setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public QueryMsGuardianRulesResponseBodyGuardianRules setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public QueryMsGuardianRulesResponseBodyGuardianRules setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public QueryMsGuardianRulesResponseBodyGuardianRules setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QueryMsGuardianRulesResponseBodyGuardianRules setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public QueryMsGuardianRulesResponseBodyGuardianRules setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryMsGuardianRulesResponseBodyGuardianRules setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public QueryMsGuardianRulesResponseBodyGuardianRules setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public QueryMsGuardianRulesResponseBodyGuardianRules setRuleConfig(String ruleConfig) {
            this.ruleConfig = ruleConfig;
            return this;
        }
        public String getRuleConfig() {
            return this.ruleConfig;
        }

        public QueryMsGuardianRulesResponseBodyGuardianRules setRunMode(String runMode) {
            this.runMode = runMode;
            return this;
        }
        public String getRunMode() {
            return this.runMode;
        }

    }

}
