// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryMsSgServiceRateLimitRulesResponseBody extends TeaModel {
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

    @NameInMap("ServiceRateLimitRules")
    public java.util.List<QueryMsSgServiceRateLimitRulesResponseBodyServiceRateLimitRules> serviceRateLimitRules;

    public static QueryMsSgServiceRateLimitRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryMsSgServiceRateLimitRulesResponseBody self = new QueryMsSgServiceRateLimitRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryMsSgServiceRateLimitRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryMsSgServiceRateLimitRulesResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryMsSgServiceRateLimitRulesResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryMsSgServiceRateLimitRulesResponseBody setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public QueryMsSgServiceRateLimitRulesResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryMsSgServiceRateLimitRulesResponseBody setStartIndex(Long startIndex) {
        this.startIndex = startIndex;
        return this;
    }
    public Long getStartIndex() {
        return this.startIndex;
    }

    public QueryMsSgServiceRateLimitRulesResponseBody setTotalSize(Long totalSize) {
        this.totalSize = totalSize;
        return this;
    }
    public Long getTotalSize() {
        return this.totalSize;
    }

    public QueryMsSgServiceRateLimitRulesResponseBody setServiceRateLimitRules(java.util.List<QueryMsSgServiceRateLimitRulesResponseBodyServiceRateLimitRules> serviceRateLimitRules) {
        this.serviceRateLimitRules = serviceRateLimitRules;
        return this;
    }
    public java.util.List<QueryMsSgServiceRateLimitRulesResponseBodyServiceRateLimitRules> getServiceRateLimitRules() {
        return this.serviceRateLimitRules;
    }

    public static class QueryMsSgServiceRateLimitRulesResponseBodyServiceRateLimitRules extends TeaModel {
        @NameInMap("AppName")
        public String appName;

        @NameInMap("DataId")
        public String dataId;

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

        @NameInMap("ServiceType")
        public String serviceType;

        public static QueryMsSgServiceRateLimitRulesResponseBodyServiceRateLimitRules build(java.util.Map<String, ?> map) throws Exception {
            QueryMsSgServiceRateLimitRulesResponseBodyServiceRateLimitRules self = new QueryMsSgServiceRateLimitRulesResponseBodyServiceRateLimitRules();
            return TeaModel.build(map, self);
        }

        public QueryMsSgServiceRateLimitRulesResponseBodyServiceRateLimitRules setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public QueryMsSgServiceRateLimitRulesResponseBodyServiceRateLimitRules setDataId(String dataId) {
            this.dataId = dataId;
            return this;
        }
        public String getDataId() {
            return this.dataId;
        }

        public QueryMsSgServiceRateLimitRulesResponseBodyServiceRateLimitRules setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public QueryMsSgServiceRateLimitRulesResponseBodyServiceRateLimitRules setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public QueryMsSgServiceRateLimitRulesResponseBodyServiceRateLimitRules setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public QueryMsSgServiceRateLimitRulesResponseBodyServiceRateLimitRules setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QueryMsSgServiceRateLimitRulesResponseBodyServiceRateLimitRules setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public QueryMsSgServiceRateLimitRulesResponseBodyServiceRateLimitRules setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryMsSgServiceRateLimitRulesResponseBodyServiceRateLimitRules setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public QueryMsSgServiceRateLimitRulesResponseBodyServiceRateLimitRules setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public QueryMsSgServiceRateLimitRulesResponseBodyServiceRateLimitRules setRuleConfig(String ruleConfig) {
            this.ruleConfig = ruleConfig;
            return this;
        }
        public String getRuleConfig() {
            return this.ruleConfig;
        }

        public QueryMsSgServiceRateLimitRulesResponseBodyServiceRateLimitRules setRunMode(String runMode) {
            this.runMode = runMode;
            return this;
        }
        public String getRunMode() {
            return this.runMode;
        }

        public QueryMsSgServiceRateLimitRulesResponseBodyServiceRateLimitRules setServiceType(String serviceType) {
            this.serviceType = serviceType;
            return this;
        }
        public String getServiceType() {
            return this.serviceType;
        }

    }

}
