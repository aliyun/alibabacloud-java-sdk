// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeRuleHitsTopClientIpRequest extends TeaModel {
    /**
     * <p>The end of the time range to query. Unit: seconds. If you do not specify this parameter, the current time is used.</p>
     */
    @NameInMap("EndTimestamp")
    public String endTimestamp;

    /**
     * <p>The ID of the Web Application Firewall (WAF) instance.</p>
     * <br>
     * <p>>  You can call the [DescribeInstance](https://help.aliyun.com/document_detail/433756.html) operation to obtain the ID of the WAF instance.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The region where the WAF instance resides. Valid values:</p>
     * <br>
     * <p>*   **cn-hangzhou:** the Chinese mainland.</p>
     * <p>*   **ap-southeast-1:** outside the Chinese mainland.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The protected object.</p>
     */
    @NameInMap("Resource")
    public String resource;

    /**
     * <p>The ID of the resource group.</p>
     */
    @NameInMap("ResourceManagerResourceGroupId")
    public String resourceManagerResourceGroupId;

    /**
     * <p>The type of rules that are triggered by the protected object. By default, this parameter is not specified and all types of rules are queried.</p>
     * <br>
     * <p>*   **blacklist:** IP address blacklist rules.</p>
     * <p>*   **custom:** custom rules.</p>
     * <p>*   **antiscan:** scan protection rules.</p>
     * <p>*   **cc_system:** HTTP flood protection rules.</p>
     * <p>*   **region_block:** region blacklist rules.</p>
     */
    @NameInMap("RuleType")
    public String ruleType;

    /**
     * <p>The beginning of the time range to query. Unit: seconds.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("StartTimestamp")
    public String startTimestamp;

    public static DescribeRuleHitsTopClientIpRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRuleHitsTopClientIpRequest self = new DescribeRuleHitsTopClientIpRequest();
        return TeaModel.build(map, self);
    }

    public DescribeRuleHitsTopClientIpRequest setEndTimestamp(String endTimestamp) {
        this.endTimestamp = endTimestamp;
        return this;
    }
    public String getEndTimestamp() {
        return this.endTimestamp;
    }

    public DescribeRuleHitsTopClientIpRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeRuleHitsTopClientIpRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeRuleHitsTopClientIpRequest setResource(String resource) {
        this.resource = resource;
        return this;
    }
    public String getResource() {
        return this.resource;
    }

    public DescribeRuleHitsTopClientIpRequest setResourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
        this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
        return this;
    }
    public String getResourceManagerResourceGroupId() {
        return this.resourceManagerResourceGroupId;
    }

    public DescribeRuleHitsTopClientIpRequest setRuleType(String ruleType) {
        this.ruleType = ruleType;
        return this;
    }
    public String getRuleType() {
        return this.ruleType;
    }

    public DescribeRuleHitsTopClientIpRequest setStartTimestamp(String startTimestamp) {
        this.startTimestamp = startTimestamp;
        return this;
    }
    public String getStartTimestamp() {
        return this.startTimestamp;
    }

}
