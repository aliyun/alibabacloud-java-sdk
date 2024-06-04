// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DeleteApisecAbnormalRequest extends TeaModel {
    @NameInMap("AbnormalId")
    public String abnormalId;

    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Region")
    public String region;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceManagerResourceGroupId")
    public String resourceManagerResourceGroupId;

    public static DeleteApisecAbnormalRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteApisecAbnormalRequest self = new DeleteApisecAbnormalRequest();
        return TeaModel.build(map, self);
    }

    public DeleteApisecAbnormalRequest setAbnormalId(String abnormalId) {
        this.abnormalId = abnormalId;
        return this;
    }
    public String getAbnormalId() {
        return this.abnormalId;
    }

    public DeleteApisecAbnormalRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DeleteApisecAbnormalRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DeleteApisecAbnormalRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public DeleteApisecAbnormalRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteApisecAbnormalRequest setResourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
        this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
        return this;
    }
    public String getResourceManagerResourceGroupId() {
        return this.resourceManagerResourceGroupId;
    }

}
