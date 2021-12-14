// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20190910.models;

import com.aliyun.tea.*;

public class CreateProtectionModuleRuleRequest extends TeaModel {
    @NameInMap("DefenseType")
    public String defenseType;

    @NameInMap("Domain")
    public String domain;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Rule")
    public String rule;

    public static CreateProtectionModuleRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateProtectionModuleRuleRequest self = new CreateProtectionModuleRuleRequest();
        return TeaModel.build(map, self);
    }

    public CreateProtectionModuleRuleRequest setDefenseType(String defenseType) {
        this.defenseType = defenseType;
        return this;
    }
    public String getDefenseType() {
        return this.defenseType;
    }

    public CreateProtectionModuleRuleRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public CreateProtectionModuleRuleRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateProtectionModuleRuleRequest setRule(String rule) {
        this.rule = rule;
        return this;
    }
    public String getRule() {
        return this.rule;
    }

}
