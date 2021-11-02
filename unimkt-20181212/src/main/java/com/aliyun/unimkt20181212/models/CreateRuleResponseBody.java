// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.unimkt20181212.models;

import com.aliyun.tea.*;

public class CreateRuleResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("Model")
    public CreateRuleResponseBodyModel model;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static CreateRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateRuleResponseBody self = new CreateRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateRuleResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateRuleResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateRuleResponseBody setModel(CreateRuleResponseBodyModel model) {
        this.model = model;
        return this;
    }
    public CreateRuleResponseBodyModel getModel() {
        return this.model;
    }

    public CreateRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateRuleResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateRuleResponseBodyModel extends TeaModel {
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

        public static CreateRuleResponseBodyModel build(java.util.Map<String, ?> map) throws Exception {
            CreateRuleResponseBodyModel self = new CreateRuleResponseBodyModel();
            return TeaModel.build(map, self);
        }

        public CreateRuleResponseBodyModel setAccessStatus(String accessStatus) {
            this.accessStatus = accessStatus;
            return this;
        }
        public String getAccessStatus() {
            return this.accessStatus;
        }

        public CreateRuleResponseBodyModel setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public CreateRuleResponseBodyModel setExtInfo(String extInfo) {
            this.extInfo = extInfo;
            return this;
        }
        public String getExtInfo() {
            return this.extInfo;
        }

        public CreateRuleResponseBodyModel setModifyTime(Long modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public Long getModifyTime() {
            return this.modifyTime;
        }

        public CreateRuleResponseBodyModel setRelatedAdSlots(String relatedAdSlots) {
            this.relatedAdSlots = relatedAdSlots;
            return this;
        }
        public String getRelatedAdSlots() {
            return this.relatedAdSlots;
        }

        public CreateRuleResponseBodyModel setRuleConfig(String ruleConfig) {
            this.ruleConfig = ruleConfig;
            return this;
        }
        public String getRuleConfig() {
            return this.ruleConfig;
        }

        public CreateRuleResponseBodyModel setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

        public CreateRuleResponseBodyModel setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public CreateRuleResponseBodyModel setRuleRId(String ruleRId) {
            this.ruleRId = ruleRId;
            return this;
        }
        public String getRuleRId() {
            return this.ruleRId;
        }

        public CreateRuleResponseBodyModel setRuleType(String ruleType) {
            this.ruleType = ruleType;
            return this;
        }
        public String getRuleType() {
            return this.ruleType;
        }

        public CreateRuleResponseBodyModel setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public CreateRuleResponseBodyModel setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public CreateRuleResponseBodyModel setVersion(Long version) {
            this.version = version;
            return this;
        }
        public Long getVersion() {
            return this.version;
        }

    }

}
