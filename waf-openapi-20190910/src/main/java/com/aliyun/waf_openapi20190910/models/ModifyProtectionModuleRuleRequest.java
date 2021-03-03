// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20190910.models;

import com.aliyun.tea.*;

public class ModifyProtectionModuleRuleRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("Domain")
    public String domain;

    @NameInMap("DefenseType")
    public String defenseType;

    @NameInMap("Rule")
    public String rule;

    @NameInMap("RuleId")
    public Long ruleId;

    @NameInMap("LockVersion")
    public Long lockVersion;

    @NameInMap("InstanceId")
    public String instanceId;

    public static ModifyProtectionModuleRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyProtectionModuleRuleRequest self = new ModifyProtectionModuleRuleRequest();
        return TeaModel.build(map, self);
    }

    public ModifyProtectionModuleRuleRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public ModifyProtectionModuleRuleRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ModifyProtectionModuleRuleRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public ModifyProtectionModuleRuleRequest setDefenseType(String defenseType) {
        this.defenseType = defenseType;
        return this;
    }
    public String getDefenseType() {
        return this.defenseType;
    }

    public ModifyProtectionModuleRuleRequest setRule(String rule) {
        this.rule = rule;
        return this;
    }
    public String getRule() {
        return this.rule;
    }

    public ModifyProtectionModuleRuleRequest setRuleId(Long ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public Long getRuleId() {
        return this.ruleId;
    }

    public ModifyProtectionModuleRuleRequest setLockVersion(Long lockVersion) {
        this.lockVersion = lockVersion;
        return this;
    }
    public Long getLockVersion() {
        return this.lockVersion;
    }

    public ModifyProtectionModuleRuleRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
