// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class ModifyDefenseRuleStatusRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("RuleId")
    public Long ruleId;

    @NameInMap("RuleStatus")
    public Integer ruleStatus;

    @NameInMap("TemplateId")
    public Long templateId;

    public static ModifyDefenseRuleStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDefenseRuleStatusRequest self = new ModifyDefenseRuleStatusRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDefenseRuleStatusRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyDefenseRuleStatusRequest setRuleId(Long ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public Long getRuleId() {
        return this.ruleId;
    }

    public ModifyDefenseRuleStatusRequest setRuleStatus(Integer ruleStatus) {
        this.ruleStatus = ruleStatus;
        return this;
    }
    public Integer getRuleStatus() {
        return this.ruleStatus;
    }

    public ModifyDefenseRuleStatusRequest setTemplateId(Long templateId) {
        this.templateId = templateId;
        return this;
    }
    public Long getTemplateId() {
        return this.templateId;
    }

}
