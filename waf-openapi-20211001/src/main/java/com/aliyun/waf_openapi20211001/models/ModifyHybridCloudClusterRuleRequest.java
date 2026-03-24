// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class ModifyHybridCloudClusterRuleRequest extends TeaModel {
    /**
     * <p>[Deprecated] The hybrid cloud cluster ID.</p>
     * 
     * <strong>example:</strong>
     * <p>10*</p>
     */
    @NameInMap("ClusterId")
    public Long clusterId;

    /**
     * <p>The cluster rule resource ID.</p>
     * 
     * <strong>example:</strong>
     * <p>hdbc-clusterrule-*******ym0w</p>
     */
    @NameInMap("ClusterRuleResourceId")
    public String clusterRuleResourceId;

    /**
     * <p>The Web Application Firewall (WAF) instance ID.</p>
     * <blockquote>
     * <p>Call <a href="https://help.aliyun.com/document_detail/140857.html">DescribeInstanceInfo</a> to query the current WAF instance ID.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>waf-cn-n6w***x52m</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The region of the WAF instance. Valid values:</p>
     * <ul>
     * <li><p><strong>cn-hangzhou</strong>: The Chinese mainland.</p>
     * </li>
     * <li><p><strong>ap-southeast-1</strong>: Outside the Chinese mainland.</p>
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
     * <p>The traffic routing rule configuration:</p>
     * <blockquote>
     * <p>Notice: </p>
     * </blockquote>
     * <p>The mode cannot be changed after it is selected.</p>
     * <ul>
     * <li><p><strong>check_mode</strong> Defines the traffic scope for the routing rule. Valid values:</p>
     * <ul>
     * <li><p><strong>all</strong>: Routes all traffic.</p>
     * </li>
     * <li><p><strong>part</strong>: Routes a specified portion of traffic.</p>
     * </li>
     * </ul>
     * </li>
     * <li><p><strong>type</strong>: The rule\&quot;s match type. Valid values:</p>
     * <ul>
     * <li><p><strong>exact</strong>: Exact match</p>
     * </li>
     * <li><p><strong>regex</strong>: Regular expression match.</p>
     * </li>
     * </ul>
     * </li>
     * <li><p><strong>substance</strong>: The value of the rule.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;check_mode\&quot;: \&quot;all\&quot;, \&quot;type\&quot;: \&quot;exact\&quot;, \&quot;substance\&quot;: \&quot;122\&quot;}</p>
     */
    @NameInMap("RuleConfig")
    public String ruleConfig;

    /**
     * <p>The status of the rule. Valid values:</p>
     * <ul>
     * <li><p><strong>on</strong>: Enabled</p>
     * </li>
     * <li><p><strong>off</strong>: Disabled.</p>
     * </li>
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
     * <li><strong>pullin</strong>: Traffic routing configuration.</li>
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
