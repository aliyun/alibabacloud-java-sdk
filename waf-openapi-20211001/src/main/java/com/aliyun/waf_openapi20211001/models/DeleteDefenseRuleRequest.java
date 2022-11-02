// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DeleteDefenseRuleRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("RuleIds")
    public String ruleIds;

    @NameInMap("TemplateId")
    public Long templateId;

    public static DeleteDefenseRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDefenseRuleRequest self = new DeleteDefenseRuleRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDefenseRuleRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DeleteDefenseRuleRequest setRuleIds(String ruleIds) {
        this.ruleIds = ruleIds;
        return this;
    }
    public String getRuleIds() {
        return this.ruleIds;
    }

    public DeleteDefenseRuleRequest setTemplateId(Long templateId) {
        this.templateId = templateId;
        return this;
    }
    public Long getTemplateId() {
        return this.templateId;
    }

}
