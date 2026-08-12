// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class CreateHybridCloudClusterRuleRequest extends TeaModel {
    /**
     * <p>The ID of the hybrid cloud cluster.</p>
     * <blockquote>
     * <p>This parameter applies only to hybrid cloud scenarios. You can call the <a href="https://help.aliyun.com/document_detail/2849376.html">DescribeHybridCloudClusters</a> operation to obtain hybrid cloud cluster information.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>428</p>
     */
    @NameInMap("ClusterId")
    public Long clusterId;

    /**
     * <p>Instance ID of the WAF instance.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/433756.html">DescribeInstance</a> operation to query instance ID of the current WAF instance.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>waf_elasticity-cn-0xldbqt****</p>
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
     * <blockquote>
     * <p>The mode options are mutually exclusive. You can select only one. If you change the mode, all traffic redirection rules under the original mode are cleared.</p>
     * </blockquote>
     * <ul>
     * <li><strong>check_mode</strong>: the mode. Valid values:<ul>
     * <li><strong>all</strong>: full traffic redirection.</li>
     * <li><strong>part</strong>: partial traffic redirection.</li>
     * </ul>
     * </li>
     * <li><strong>type</strong>: the rule matching type. Valid values:<ul>
     * <li><strong>exact</strong>: exact match.</li>
     * <li><strong>regex</strong>: regular expression.</li>
     * </ul>
     * </li>
     * <li><strong>substance</strong>: the rule value.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>full volume drainage:{\&quot;check_mode\&quot;: \&quot;all\&quot;, \&quot;type\&quot;: \&quot;exact\&quot;, \&quot;substance\&quot;: \&quot;122\&quot;}
     * Specified partial drainage：{\&quot;check_mode\&quot;: \&quot;part\&quot;, \&quot;type\&quot;: \&quot;exact\&quot;, \&quot;substance\&quot;: \&quot;12222\&quot;}</p>
     */
    @NameInMap("RuleConfig")
    public String ruleConfig;

    /**
     * <p>The rule status. Valid values:</p>
     * <ul>
     * <li><strong>on</strong>: enabled.</li>
     * <li><strong>off</strong>: disabled.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("RuleStatus")
    public String ruleStatus;

    /**
     * <p>The rule type. Valid values:</p>
     * <ul>
     * <li><strong>pullin</strong>: cluster traffic redirection.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pullin</p>
     */
    @NameInMap("RuleType")
    public String ruleType;

    public static CreateHybridCloudClusterRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateHybridCloudClusterRuleRequest self = new CreateHybridCloudClusterRuleRequest();
        return TeaModel.build(map, self);
    }

    public CreateHybridCloudClusterRuleRequest setClusterId(Long clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public Long getClusterId() {
        return this.clusterId;
    }

    public CreateHybridCloudClusterRuleRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateHybridCloudClusterRuleRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateHybridCloudClusterRuleRequest setResourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
        this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
        return this;
    }
    public String getResourceManagerResourceGroupId() {
        return this.resourceManagerResourceGroupId;
    }

    public CreateHybridCloudClusterRuleRequest setRuleConfig(String ruleConfig) {
        this.ruleConfig = ruleConfig;
        return this;
    }
    public String getRuleConfig() {
        return this.ruleConfig;
    }

    public CreateHybridCloudClusterRuleRequest setRuleStatus(String ruleStatus) {
        this.ruleStatus = ruleStatus;
        return this;
    }
    public String getRuleStatus() {
        return this.ruleStatus;
    }

    public CreateHybridCloudClusterRuleRequest setRuleType(String ruleType) {
        this.ruleType = ruleType;
        return this;
    }
    public String getRuleType() {
        return this.ruleType;
    }

}
