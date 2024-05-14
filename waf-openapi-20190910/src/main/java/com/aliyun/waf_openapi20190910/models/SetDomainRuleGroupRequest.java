// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20190910.models;

import com.aliyun.tea.*;

public class SetDomainRuleGroupRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Domains")
    public String domains;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("RuleGroupId")
    public Long ruleGroupId;

    @NameInMap("WafAiStatus")
    public Integer wafAiStatus;

    @NameInMap("WafVersion")
    public Long wafVersion;

    public static SetDomainRuleGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        SetDomainRuleGroupRequest self = new SetDomainRuleGroupRequest();
        return TeaModel.build(map, self);
    }

    public SetDomainRuleGroupRequest setDomains(String domains) {
        this.domains = domains;
        return this;
    }
    public String getDomains() {
        return this.domains;
    }

    public SetDomainRuleGroupRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public SetDomainRuleGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public SetDomainRuleGroupRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public SetDomainRuleGroupRequest setRuleGroupId(Long ruleGroupId) {
        this.ruleGroupId = ruleGroupId;
        return this;
    }
    public Long getRuleGroupId() {
        return this.ruleGroupId;
    }

    public SetDomainRuleGroupRequest setWafAiStatus(Integer wafAiStatus) {
        this.wafAiStatus = wafAiStatus;
        return this;
    }
    public Integer getWafAiStatus() {
        return this.wafAiStatus;
    }

    public SetDomainRuleGroupRequest setWafVersion(Long wafVersion) {
        this.wafVersion = wafVersion;
        return this;
    }
    public Long getWafVersion() {
        return this.wafVersion;
    }

}
