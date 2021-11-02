// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.unimkt20181212.models;

import com.aliyun.tea.*;

public class QueryRuleResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("Model")
    public QueryRuleResponseBodyModel model;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryRuleResponseBody self = new QueryRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryRuleResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryRuleResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryRuleResponseBody setModel(QueryRuleResponseBodyModel model) {
        this.model = model;
        return this;
    }
    public QueryRuleResponseBodyModel getModel() {
        return this.model;
    }

    public QueryRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryRuleResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryRuleResponseBodyModel extends TeaModel {
        @NameInMap("AccessStatus")
        public String accessStatus;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("ExtInfo")
        public String extInfo;

        @NameInMap("ModifyTime")
        public Long modifyTime;

        @NameInMap("RelatedAdSlots")
        public String relatedAdSlots;

        @NameInMap("RuleConfig")
        public String ruleConfig;

        @NameInMap("RuleId")
        public String ruleId;

        @NameInMap("RuleName")
        public String ruleName;

        @NameInMap("RuleRId")
        public String ruleRId;

        @NameInMap("RuleType")
        public String ruleType;

        @NameInMap("Status")
        public String status;

        @NameInMap("TenantId")
        public String tenantId;

        @NameInMap("Version")
        public Long version;

        public static QueryRuleResponseBodyModel build(java.util.Map<String, ?> map) throws Exception {
            QueryRuleResponseBodyModel self = new QueryRuleResponseBodyModel();
            return TeaModel.build(map, self);
        }

        public QueryRuleResponseBodyModel setAccessStatus(String accessStatus) {
            this.accessStatus = accessStatus;
            return this;
        }
        public String getAccessStatus() {
            return this.accessStatus;
        }

        public QueryRuleResponseBodyModel setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public QueryRuleResponseBodyModel setExtInfo(String extInfo) {
            this.extInfo = extInfo;
            return this;
        }
        public String getExtInfo() {
            return this.extInfo;
        }

        public QueryRuleResponseBodyModel setModifyTime(Long modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public Long getModifyTime() {
            return this.modifyTime;
        }

        public QueryRuleResponseBodyModel setRelatedAdSlots(String relatedAdSlots) {
            this.relatedAdSlots = relatedAdSlots;
            return this;
        }
        public String getRelatedAdSlots() {
            return this.relatedAdSlots;
        }

        public QueryRuleResponseBodyModel setRuleConfig(String ruleConfig) {
            this.ruleConfig = ruleConfig;
            return this;
        }
        public String getRuleConfig() {
            return this.ruleConfig;
        }

        public QueryRuleResponseBodyModel setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

        public QueryRuleResponseBodyModel setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public QueryRuleResponseBodyModel setRuleRId(String ruleRId) {
            this.ruleRId = ruleRId;
            return this;
        }
        public String getRuleRId() {
            return this.ruleRId;
        }

        public QueryRuleResponseBodyModel setRuleType(String ruleType) {
            this.ruleType = ruleType;
            return this;
        }
        public String getRuleType() {
            return this.ruleType;
        }

        public QueryRuleResponseBodyModel setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryRuleResponseBodyModel setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public QueryRuleResponseBodyModel setVersion(Long version) {
            this.version = version;
            return this;
        }
        public Long getVersion() {
            return this.version;
        }

    }

}
