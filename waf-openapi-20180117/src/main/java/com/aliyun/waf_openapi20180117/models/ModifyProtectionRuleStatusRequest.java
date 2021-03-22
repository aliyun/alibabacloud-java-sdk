// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20180117.models;

import com.aliyun.tea.*;

public class ModifyProtectionRuleStatusRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("Domain")
    public String domain;

    @NameInMap("Defense")
    public String defense;

    @NameInMap("Id")
    public Long id;

    @NameInMap("RuleStatus")
    public Integer ruleStatus;

    @NameInMap("LockVersion")
    public Long lockVersion;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Region")
    public String region;

    public static ModifyProtectionRuleStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyProtectionRuleStatusRequest self = new ModifyProtectionRuleStatusRequest();
        return TeaModel.build(map, self);
    }

    public ModifyProtectionRuleStatusRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public ModifyProtectionRuleStatusRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ModifyProtectionRuleStatusRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public ModifyProtectionRuleStatusRequest setDefense(String defense) {
        this.defense = defense;
        return this;
    }
    public String getDefense() {
        return this.defense;
    }

    public ModifyProtectionRuleStatusRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
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

    public ModifyProtectionRuleStatusRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

}
