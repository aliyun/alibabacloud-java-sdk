// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20180117.models;

import com.aliyun.tea.*;

public class CreateProtectionModuleRuleRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("Domain")
    public String domain;

    @NameInMap("Defense")
    public String defense;

    @NameInMap("Rule")
    public String rule;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Region")
    public String region;

    public static CreateProtectionModuleRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateProtectionModuleRuleRequest self = new CreateProtectionModuleRuleRequest();
        return TeaModel.build(map, self);
    }

    public CreateProtectionModuleRuleRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public CreateProtectionModuleRuleRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public CreateProtectionModuleRuleRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public CreateProtectionModuleRuleRequest setDefense(String defense) {
        this.defense = defense;
        return this;
    }
    public String getDefense() {
        return this.defense;
    }

    public CreateProtectionModuleRuleRequest setRule(String rule) {
        this.rule = rule;
        return this;
    }
    public String getRule() {
        return this.rule;
    }

    public CreateProtectionModuleRuleRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateProtectionModuleRuleRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

}
