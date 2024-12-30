// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class ModifyHybridCloudClusterBypassStatusRequest extends TeaModel {
    /**
     * <p>The ID of the hybrid cloud cluster.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>hdbc_cluster_****</p>
     */
    @NameInMap("ClusterResourceId")
    public String clusterResourceId;

    /**
     * <p>The ID of the Web Application Firewall (WAF) instance.</p>
     * <p>**</p>
     * <p>**You can call the **DescribeInstanceInfo<a href="https://help.aliyun.com/document_detail/140857.html"> operation to obtain the ID of the WAF instance.</a></p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>waf_elasticity-cn-0xldbqt****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceManagerResourceGroupId")
    public String resourceManagerResourceGroupId;

    /**
     * <p>The status of manual bypass. Valid values:</p>
     * <ul>
     * <li><strong>on</strong>: enabled.</li>
     * <li><strong>off</strong>: disabled. This is the default value.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("RuleStatus")
    public String ruleStatus;

    public static ModifyHybridCloudClusterBypassStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyHybridCloudClusterBypassStatusRequest self = new ModifyHybridCloudClusterBypassStatusRequest();
        return TeaModel.build(map, self);
    }

    public ModifyHybridCloudClusterBypassStatusRequest setClusterResourceId(String clusterResourceId) {
        this.clusterResourceId = clusterResourceId;
        return this;
    }
    public String getClusterResourceId() {
        return this.clusterResourceId;
    }

    public ModifyHybridCloudClusterBypassStatusRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyHybridCloudClusterBypassStatusRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyHybridCloudClusterBypassStatusRequest setResourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
        this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
        return this;
    }
    public String getResourceManagerResourceGroupId() {
        return this.resourceManagerResourceGroupId;
    }

    public ModifyHybridCloudClusterBypassStatusRequest setRuleStatus(String ruleStatus) {
        this.ruleStatus = ruleStatus;
        return this;
    }
    public String getRuleStatus() {
        return this.ruleStatus;
    }

}
