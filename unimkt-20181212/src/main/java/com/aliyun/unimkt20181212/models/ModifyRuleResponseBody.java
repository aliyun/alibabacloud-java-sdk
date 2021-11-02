// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.unimkt20181212.models;

import com.aliyun.tea.*;

public class ModifyRuleResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("Model")
    public ModifyRuleResponseBodyModel model;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ModifyRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyRuleResponseBody self = new ModifyRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyRuleResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ModifyRuleResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ModifyRuleResponseBody setModel(ModifyRuleResponseBodyModel model) {
        this.model = model;
        return this;
    }
    public ModifyRuleResponseBodyModel getModel() {
        return this.model;
    }

    public ModifyRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyRuleResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ModifyRuleResponseBodyModel extends TeaModel {
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

        public static ModifyRuleResponseBodyModel build(java.util.Map<String, ?> map) throws Exception {
            ModifyRuleResponseBodyModel self = new ModifyRuleResponseBodyModel();
            return TeaModel.build(map, self);
        }

        public ModifyRuleResponseBodyModel setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ModifyRuleResponseBodyModel setExtInfo(String extInfo) {
            this.extInfo = extInfo;
            return this;
        }
        public String getExtInfo() {
            return this.extInfo;
        }

        public ModifyRuleResponseBodyModel setModifyTime(Long modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public Long getModifyTime() {
            return this.modifyTime;
        }

        public ModifyRuleResponseBodyModel setRelatedAdSlots(String relatedAdSlots) {
            this.relatedAdSlots = relatedAdSlots;
            return this;
        }
        public String getRelatedAdSlots() {
            return this.relatedAdSlots;
        }

        public ModifyRuleResponseBodyModel setRuleConfig(String ruleConfig) {
            this.ruleConfig = ruleConfig;
            return this;
        }
        public String getRuleConfig() {
            return this.ruleConfig;
        }

        public ModifyRuleResponseBodyModel setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

        public ModifyRuleResponseBodyModel setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public ModifyRuleResponseBodyModel setRuleRId(String ruleRId) {
            this.ruleRId = ruleRId;
            return this;
        }
        public String getRuleRId() {
            return this.ruleRId;
        }

        public ModifyRuleResponseBodyModel setRuleType(String ruleType) {
            this.ruleType = ruleType;
            return this;
        }
        public String getRuleType() {
            return this.ruleType;
        }

        public ModifyRuleResponseBodyModel setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ModifyRuleResponseBodyModel setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public ModifyRuleResponseBodyModel setVersion(Long version) {
            this.version = version;
            return this;
        }
        public Long getVersion() {
            return this.version;
        }

    }

}
