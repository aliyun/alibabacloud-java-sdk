// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DeleteHybridCloudClusterRuleRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>hdbc-clusterrule-*******m0w</p>
     */
    @NameInMap("ClusterRuleResourceId")
    public String clusterRuleResourceId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>waf_elasticity-cn-0xldbqt****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <strong>example:</strong>
     * <p>rg-acfm***q</p>
     */
    @NameInMap("ResourceManagerResourceGroupId")
    public String resourceManagerResourceGroupId;

    public static DeleteHybridCloudClusterRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteHybridCloudClusterRuleRequest self = new DeleteHybridCloudClusterRuleRequest();
        return TeaModel.build(map, self);
    }

    public DeleteHybridCloudClusterRuleRequest setClusterRuleResourceId(String clusterRuleResourceId) {
        this.clusterRuleResourceId = clusterRuleResourceId;
        return this;
    }
    public String getClusterRuleResourceId() {
        return this.clusterRuleResourceId;
    }

    public DeleteHybridCloudClusterRuleRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DeleteHybridCloudClusterRuleRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteHybridCloudClusterRuleRequest setResourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
        this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
        return this;
    }
    public String getResourceManagerResourceGroupId() {
        return this.resourceManagerResourceGroupId;
    }

}
