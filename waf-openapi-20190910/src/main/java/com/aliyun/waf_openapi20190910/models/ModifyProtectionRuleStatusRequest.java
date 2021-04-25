// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20190910.models;

import com.aliyun.tea.*;

public class ModifyProtectionRuleStatusRequest extends TeaModel {
    @NameInMap("Domain")
    public String domain;

    @NameInMap("DefenseType")
    public String defenseType;

    @NameInMap("RuleId")
    public Long ruleId;

    @NameInMap("RuleStatus")
    public Integer ruleStatus;

    @NameInMap("LockVersion")
    public Long lockVersion;

    @NameInMap("InstanceId")
    public String instanceId;

    public static ModifyProtectionRuleStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyProtectionRuleStatusRequest self = new ModifyProtectionRuleStatusRequest();
        return TeaModel.build(map, self);
    }

    public ModifyProtectionRuleStatusRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public ModifyProtectionRuleStatusRequest setDefenseType(String defenseType) {
        this.defenseType = defenseType;
        return this;
    }
    public String getDefenseType() {
        return this.defenseType;
    }

    public ModifyProtectionRuleStatusRequest setRuleId(Long ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public Long getRuleId() {
        return this.ruleId;
    }

    public ModifyProtectionRuleStatusRequest setRuleStatus(Integer ruleStatus) {
        this.ruleStatus = ruleStatus;
        return this;
    }
    public Integer getRuleStatus() {
        return this.ruleStatus;
    }

    public ModifyProtectionRuleStatusRequest setLockVersion(Long lockVersion) {
        this.lockVersion = lockVersion;
        return this;
    }
    public Long getLockVersion() {
        return this.lockVersion;
    }

    public ModifyProtectionRuleStatusRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
