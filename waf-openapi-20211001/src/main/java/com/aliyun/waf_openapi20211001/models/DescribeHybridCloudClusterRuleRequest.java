// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeHybridCloudClusterRuleRequest extends TeaModel {
    /**
     * <p><strong>[Deprecated]</strong> The hybrid cloud cluster ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ClusterId")
    @Deprecated
    public Long clusterId;

    /**
     * <p>The cluster rule resource ID.</p>
     * 
     * <strong>example:</strong>
     * <p>hdbc-clusterrule-*******m0w</p>
     */
    @NameInMap("ClusterRuleResourceId")
    public String clusterRuleResourceId;

    /**
     * <p>The ID of the WAF instance.</p>
     * <blockquote>
     * <p>You can call <a href="https://help.aliyun.com/document_detail/433756.html">DescribeInstance</a> to obtain the ID of the current WAF instance.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>waf-cn-uqm33n***02</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

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
     * <p>The Alibaba Cloud resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfm***q</p>
     */
    @NameInMap("ResourceManagerResourceGroupId")
    public String resourceManagerResourceGroupId;

    /**
     * <p><strong>[Deprecated]</strong> The rule type. Valid values:</p>
     * <ul>
     * <li><strong>pullin</strong>: cluster traffic redirection</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>pullin</p>
     */
    @NameInMap("RuleType")
    @Deprecated
    public String ruleType;

    public static DescribeHybridCloudClusterRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeHybridCloudClusterRuleRequest self = new DescribeHybridCloudClusterRuleRequest();
        return TeaModel.build(map, self);
    }

    @Deprecated
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

    @Deprecated
    public DescribeHybridCloudClusterRuleRequest setRuleType(String ruleType) {
        this.ruleType = ruleType;
        return this;
    }
    public String getRuleType() {
        return this.ruleType;
    }

}
