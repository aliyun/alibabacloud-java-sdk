// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeRuleHitsTopResourceRequest extends TeaModel {
    /**
     * <p>The end of the time range to query. Unit: seconds. If you do not specify this parameter, the current time is used.</p>
     * 
     * <strong>example:</strong>
     * <p>1665386340</p>
     */
    @NameInMap("EndTimestamp")
    public String endTimestamp;

    /**
     * <p>The ID of the Web Application Firewall (WAF) instance.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/433756.html">DescribeInstance</a> operation to obtain the ID of the WAF instance.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>waf_cdnsdf3****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The region where the WAF instance resides. Valid values:</p>
     * <ul>
     * <li><strong>cn-hangzhou:</strong> the Chinese mainland.</li>
     * <li><strong>ap-southeast-1:</strong> outside the Chinese mainland.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfm***q</p>
     */
    @NameInMap("ResourceManagerResourceGroupId")
    public String resourceManagerResourceGroupId;

    /**
     * <p>The type of rules that are triggered by the protected object. By default, this parameter is not specified and all types of rules are queried.</p>
     * <ul>
     * <li><strong>blacklist:</strong> IP address blacklist rules.</li>
     * <li><strong>custom:</strong> custom rules.</li>
     * <li><strong>antiscan:</strong> scan protection rules.</li>
     * <li><strong>cc_system:</strong> HTTP flood protection rules.</li>
     * <li><strong>region_block:</strong> region blacklist rules.</li>
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

    public static DescribeRuleHitsTopResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRuleHitsTopResourceRequest self = new DescribeRuleHitsTopResourceRequest();
        return TeaModel.build(map, self);
    }

    public DescribeRuleHitsTopResourceRequest setEndTimestamp(String endTimestamp) {
        this.endTimestamp = endTimestamp;
        return this;
    }
    public String getEndTimestamp() {
        return this.endTimestamp;
    }

    public DescribeRuleHitsTopResourceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeRuleHitsTopResourceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeRuleHitsTopResourceRequest setResourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
        this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
        return this;
    }
    public String getResourceManagerResourceGroupId() {
        return this.resourceManagerResourceGroupId;
    }

    public DescribeRuleHitsTopResourceRequest setRuleType(String ruleType) {
        this.ruleType = ruleType;
        return this;
    }
    public String getRuleType() {
        return this.ruleType;
    }

    public DescribeRuleHitsTopResourceRequest setStartTimestamp(String startTimestamp) {
        this.startTimestamp = startTimestamp;
        return this;
    }
    public String getStartTimestamp() {
        return this.startTimestamp;
    }

}
