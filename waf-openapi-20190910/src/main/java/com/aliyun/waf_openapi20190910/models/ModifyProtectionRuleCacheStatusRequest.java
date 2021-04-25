// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20190910.models;

import com.aliyun.tea.*;

public class ModifyProtectionRuleCacheStatusRequest extends TeaModel {
    @NameInMap("Domain")
    public String domain;

    @NameInMap("RuleId")
    public Long ruleId;

    @NameInMap("DefenseType")
    public String defenseType;

    @NameInMap("InstanceId")
    public String instanceId;

    public static ModifyProtectionRuleCacheStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyProtectionRuleCacheStatusRequest self = new ModifyProtectionRuleCacheStatusRequest();
        return TeaModel.build(map, self);
    }

    public ModifyProtectionRuleCacheStatusRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public ModifyProtectionRuleCacheStatusRequest setRuleId(Long ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public Long getRuleId() {
        return this.ruleId;
    }

    public ModifyProtectionRuleCacheStatusRequest setDefenseType(String defenseType) {
        this.defenseType = defenseType;
        return this;
    }
    public String getDefenseType() {
        return this.defenseType;
    }

    public ModifyProtectionRuleCacheStatusRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
