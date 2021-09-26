// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class CreateRuleRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("RuleInfo")
    public String ruleInfo;

    @NameInMap("RuleDbRelation")
    public String ruleDbRelation;

    @NameInMap("RuleGroup")
    public String ruleGroup;

    @NameInMap("EffectCurrentDBStatus")
    public String effectCurrentDBStatus;

    public static CreateRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRuleRequest self = new CreateRuleRequest();
        return TeaModel.build(map, self);
    }

    public CreateRuleRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateRuleRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateRuleRequest setRuleInfo(String ruleInfo) {
        this.ruleInfo = ruleInfo;
        return this;
    }
    public String getRuleInfo() {
        return this.ruleInfo;
    }

    public CreateRuleRequest setRuleDbRelation(String ruleDbRelation) {
        this.ruleDbRelation = ruleDbRelation;
        return this;
    }
    public String getRuleDbRelation() {
        return this.ruleDbRelation;
    }

    public CreateRuleRequest setRuleGroup(String ruleGroup) {
        this.ruleGroup = ruleGroup;
        return this;
    }
    public String getRuleGroup() {
        return this.ruleGroup;
    }

    public CreateRuleRequest setEffectCurrentDBStatus(String effectCurrentDBStatus) {
        this.effectCurrentDBStatus = effectCurrentDBStatus;
        return this;
    }
    public String getEffectCurrentDBStatus() {
        return this.effectCurrentDBStatus;
    }

}
