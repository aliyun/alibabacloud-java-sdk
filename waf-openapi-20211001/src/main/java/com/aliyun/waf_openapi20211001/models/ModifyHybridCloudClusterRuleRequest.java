// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class ModifyHybridCloudClusterRuleRequest extends TeaModel {
    /**
     * <p>[Deprecated] The ID of the hybrid cloud cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>10*</p>
     */
    @NameInMap("ClusterId")
    public Long clusterId;

    /**
     * <p>The resource ID of the cluster rule.</p>
     * 
     * <strong>example:</strong>
     * <p>hdbc-clusterrule-*******ym0w</p>
     */
    @NameInMap("ClusterRuleResourceId")
    public String clusterRuleResourceId;

    /**
     * <p>Instance ID of the WAF instance.</p>
     * <blockquote>
     * <p>You can call <a href="https://help.aliyun.com/document_detail/140857.html">DescribeInstanceInfo</a> to query instance ID of the current WAF instance.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>waf-cn-n6w***x52m</p>
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
     * <p>The ID of the Alibaba Cloud resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfm***q</p>
     */
    @NameInMap("ResourceManagerResourceGroupId")
    public String resourceManagerResourceGroupId;

    /**
     * <p>The traffic redirection rule configuration.</p>
     * <p><notice>The mode cannot be modified.</notice></p>
     * <ul>
     * <li><strong>check_mode</strong>: The mode. Valid values:<ul>
     * <li><strong>all</strong>: full traffic redirection.</li>
     * <li><strong>part</strong>: partial traffic redirection.</li>
     * </ul>
     * </li>
     * <li><strong>type</strong>: The rule matching type. Valid values:<ul>
     * <li><strong>exact</strong>: exact match.</li>
     * <li><strong>regex</strong>: regular expression.</li>
     * </ul>
     * </li>
     * <li><strong>substance</strong>: The rule value.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;check_mode\&quot;: \&quot;all\&quot;, \&quot;type\&quot;: \&quot;exact\&quot;, \&quot;substance\&quot;: \&quot;122\&quot;}</p>
     */
    @NameInMap("RuleConfig")
    public String ruleConfig;

    /**
     * <p>The rule status. Valid values:</p>
     * <ul>
     * <li><strong>on</strong>: enabled.</li>
     * <li><strong>off</strong>: disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("RuleStatus")
    public String ruleStatus;

    /**
     * <p>[Deprecated] The rule type. Valid values:</p>
     * <ul>
     * <li><strong>pullin</strong>: traffic redirection configuration.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>pullin</p>
     */
    @NameInMap("RuleType")
    public String ruleType;

    public static ModifyHybridCloudClusterRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyHybridCloudClusterRuleRequest self = new ModifyHybridCloudClusterRuleRequest();
        return TeaModel.build(map, self);
    }

    public ModifyHybridCloudClusterRuleRequest setClusterId(Long clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public Long getClusterId() {
        return this.clusterId;
    }

    public ModifyHybridCloudClusterRuleRequest setClusterRuleResourceId(String clusterRuleResourceId) {
        this.clusterRuleResourceId = clusterRuleResourceId;
        return this;
    }
    public String getClusterRuleResourceId() {
        return this.clusterRuleResourceId;
    }

    public ModifyHybridCloudClusterRuleRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyHybridCloudClusterRuleRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyHybridCloudClusterRuleRequest setResourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
        this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
        return this;
    }
    public String getResourceManagerResourceGroupId() {
        return this.resourceManagerResourceGroupId;
    }

    public ModifyHybridCloudClusterRuleRequest setRuleConfig(String ruleConfig) {
        this.ruleConfig = ruleConfig;
        return this;
    }
    public String getRuleConfig() {
        return this.ruleConfig;
    }

    public ModifyHybridCloudClusterRuleRequest setRuleStatus(String ruleStatus) {
        this.ruleStatus = ruleStatus;
        return this;
    }
    public String getRuleStatus() {
        return this.ruleStatus;
    }

    public ModifyHybridCloudClusterRuleRequest setRuleType(String ruleType) {
        this.ruleType = ruleType;
        return this;
    }
    public String getRuleType() {
        return this.ruleType;
    }

}
