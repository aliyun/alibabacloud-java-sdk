// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20190910.models;

import com.aliyun.tea.*;

public class DeleteProtectionModuleRuleRequest extends TeaModel {
    @NameInMap("DefenseType")
    public String defenseType;

    @NameInMap("Domain")
    public String domain;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("RuleId")
    public Long ruleId;

    public static DeleteProtectionModuleRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteProtectionModuleRuleRequest self = new DeleteProtectionModuleRuleRequest();
        return TeaModel.build(map, self);
    }

    public DeleteProtectionModuleRuleRequest setDefenseType(String defenseType) {
        this.defenseType = defenseType;
        return this;
    }
    public String getDefenseType() {
        return this.defenseType;
    }

    public DeleteProtectionModuleRuleRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public DeleteProtectionModuleRuleRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DeleteProtectionModuleRuleRequest setRuleId(Long ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public Long getRuleId() {
        return this.ruleId;
    }

}
