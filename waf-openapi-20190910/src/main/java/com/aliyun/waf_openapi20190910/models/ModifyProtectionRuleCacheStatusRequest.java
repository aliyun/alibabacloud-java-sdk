// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20190910.models;

import com.aliyun.tea.*;

public class ModifyProtectionRuleCacheStatusRequest extends TeaModel {
    @NameInMap("DefenseType")
    public String defenseType;

    @NameInMap("Domain")
    public String domain;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("RuleId")
    public Long ruleId;

    public static ModifyProtectionRuleCacheStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyProtectionRuleCacheStatusRequest self = new ModifyProtectionRuleCacheStatusRequest();
        return TeaModel.build(map, self);
    }

    public ModifyProtectionRuleCacheStatusRequest setDefenseType(String defenseType) {
        this.defenseType = defenseType;
        return this;
    }
    public String getDefenseType() {
        return this.defenseType;
    }

    public ModifyProtectionRuleCacheStatusRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public ModifyProtectionRuleCacheStatusRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyProtectionRuleCacheStatusRequest setRuleId(Long ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public Long getRuleId() {
        return this.ruleId;
    }

}
