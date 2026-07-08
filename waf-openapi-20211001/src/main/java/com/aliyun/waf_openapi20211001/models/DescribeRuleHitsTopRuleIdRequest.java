// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeRuleHitsTopRuleIdRequest extends TeaModel {
    /**
     * <p>The end of the time range to query. Unit: seconds. If you do not specify this parameter, the current time is used.</p>
     * 
     * <strong>example:</strong>
     * <p>1665386280</p>
     */
    @NameInMap("EndTimestamp")
    public String endTimestamp;

    /**
     * <p>The ID of the WAF instance.</p>
     * <blockquote>
     * <p>You can call <a href="https://help.aliyun.com/document_detail/433756.html">DescribeInstance</a> to query the ID of the current WAF instance.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>waf_cdnsdf3****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>Specifies whether to aggregate rule hits by protected object.</p>
     * <ul>
     * <li><strong>true (default)</strong>: Aggregates rule hits by protected object. In this case, rule hits are counted based on individual rules only, and the Resource value in the response is empty.</li>
     * <li><strong>false</strong>: Does not aggregate rule hits by protected object. In this case, rule hits are counted based on both protected objects and rules.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsGroupResource")
    public String isGroupResource;

    /**
     * <p>The region where the WAF instance is deployed. Valid values:</p>
     * <ul>
     * <li><p><strong>cn-hangzhou</strong>: the Chinese mainland.</p>
     * </li>
     * <li><p><strong>ap-southeast-1</strong>: outside the Chinese mainland.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The protected object.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://www.aliyundoc.com">www.aliyundoc.com</a></p>
     */
    @NameInMap("Resource")
    public String resource;

    /**
     * <p>The Alibaba Cloud resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfm***q</p>
     */
    @NameInMap("ResourceManagerResourceGroupId")
    public String resourceManagerResourceGroupId;

    /**
     * <p>The type of rule hit by the protected object. By default, this parameter is not specified, which indicates that all rules are displayed.</p>
     * <ul>
     * <li><p><strong>blacklist</strong>: IP blacklist.</p>
     * </li>
     * <li><p><strong>custom</strong>: Custom rule.</p>
     * </li>
     * <li><p><strong>antiscan</strong>: Scan protection rule.</p>
     * </li>
     * <li><p><strong>cc_system</strong>: HTTP flood mitigation rule.</p>
     * </li>
     * <li><p><strong>region_block</strong>: Location blacklist.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>blacklist</p>
     */
    @NameInMap("RuleType")
    public String ruleType;

    /**
     * <p>The beginning of the time range to query. Unit: seconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1665331200</p>
     */
    @NameInMap("StartTimestamp")
    public String startTimestamp;

    public static DescribeRuleHitsTopRuleIdRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRuleHitsTopRuleIdRequest self = new DescribeRuleHitsTopRuleIdRequest();
        return TeaModel.build(map, self);
    }

    public DescribeRuleHitsTopRuleIdRequest setEndTimestamp(String endTimestamp) {
        this.endTimestamp = endTimestamp;
        return this;
    }
    public String getEndTimestamp() {
        return this.endTimestamp;
    }

    public DescribeRuleHitsTopRuleIdRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeRuleHitsTopRuleIdRequest setIsGroupResource(String isGroupResource) {
        this.isGroupResource = isGroupResource;
        return this;
    }
    public String getIsGroupResource() {
        return this.isGroupResource;
    }

    public DescribeRuleHitsTopRuleIdRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeRuleHitsTopRuleIdRequest setResource(String resource) {
        this.resource = resource;
        return this;
    }
    public String getResource() {
        return this.resource;
    }

    public DescribeRuleHitsTopRuleIdRequest setResourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
        this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
        return this;
    }
    public String getResourceManagerResourceGroupId() {
        return this.resourceManagerResourceGroupId;
    }

    public DescribeRuleHitsTopRuleIdRequest setRuleType(String ruleType) {
        this.ruleType = ruleType;
        return this;
    }
    public String getRuleType() {
        return this.ruleType;
    }

    public DescribeRuleHitsTopRuleIdRequest setStartTimestamp(String startTimestamp) {
        this.startTimestamp = startTimestamp;
        return this;
    }
    public String getStartTimestamp() {
        return this.startTimestamp;
    }

}
