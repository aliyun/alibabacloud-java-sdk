// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeHybridCloudClusterRuleRequest extends TeaModel {
    /**
     * <p>The ID of the hybrid cloud cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ClusterId")
    public Long clusterId;

    @NameInMap("ClusterRuleResourceId")
    public String clusterRuleResourceId;

    /**
     * <p>The ID of the WAF instance.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/433756.html">DescribeInstance</a> operation to query the ID of the WAF instance.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>waf-cn-uqm33n***02</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The region in which the WAF instance is deployed. Valid value:</p>
     * <ul>
     * <li><strong>cn-hangzhou</strong>: Chinese mainland.</li>
     * <li><strong>ap-southeast-1</strong>: outside the Chinese mainland.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the Alibaba Cloud resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfm***q</p>
     */
    @NameInMap("ResourceManagerResourceGroupId")
    public String resourceManagerResourceGroupId;

    /**
     * <p>The type of the rule. Valid values:</p>
     * <ul>
     * <li><strong>pullin</strong>: The traffic redirection rule of the hybrid cloud cluster.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>pullin</p>
     */
    @NameInMap("RuleType")
    public String ruleType;

    public static DescribeHybridCloudClusterRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeHybridCloudClusterRuleRequest self = new DescribeHybridCloudClusterRuleRequest();
        return TeaModel.build(map, self);
    }

    public DescribeHybridCloudClusterRuleRequest setClusterId(Long clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public Long getClusterId() {
        return this.clusterId;
    }

    public DescribeHybridCloudClusterRuleRequest setClusterRuleResourceId(String clusterRuleResourceId) {
        this.clusterRuleResourceId = clusterRuleResourceId;
        return this;
    }
    public String getClusterRuleResourceId() {
        return this.clusterRuleResourceId;
    }

    public DescribeHybridCloudClusterRuleRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeHybridCloudClusterRuleRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeHybridCloudClusterRuleRequest setResourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
        this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
        return this;
    }
    public String getResourceManagerResourceGroupId() {
        return this.resourceManagerResourceGroupId;
    }

    public DescribeHybridCloudClusterRuleRequest setRuleType(String ruleType) {
        this.ruleType = ruleType;
        return this;
    }
    public String getRuleType() {
        return this.ruleType;
    }

}
