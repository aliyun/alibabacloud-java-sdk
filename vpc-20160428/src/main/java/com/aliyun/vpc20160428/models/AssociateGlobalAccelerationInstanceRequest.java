// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class AssociateGlobalAccelerationInstanceRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("GlobalAccelerationInstanceId")
    @Validation(required = true)
    public String globalAccelerationInstanceId;

    @NameInMap("BackendServerId")
    @Validation(required = true)
    public String backendServerId;

    @NameInMap("BackendServerRegionId")
    @Validation(required = true)
    public String backendServerRegionId;

    @NameInMap("BackendServerType")
    public String backendServerType;

    public static AssociateGlobalAccelerationInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        AssociateGlobalAccelerationInstanceRequest self = new AssociateGlobalAccelerationInstanceRequest();
        return TeaModel.build(map, self);
    }

    public AssociateGlobalAccelerationInstanceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public AssociateGlobalAccelerationInstanceRequest setGlobalAccelerationInstanceId(String globalAccelerationInstanceId) {
        this.globalAccelerationInstanceId = globalAccelerationInstanceId;
        return this;
    }
    public String getGlobalAccelerationInstanceId() {
        return this.globalAccelerationInstanceId;
    }

    public AssociateGlobalAccelerationInstanceRequest setBackendServerId(String backendServerId) {
        this.backendServerId = backendServerId;
        return this;
    }
    public String getBackendServerId() {
        return this.backendServerId;
    }

    public AssociateGlobalAccelerationInstanceRequest setBackendServerRegionId(String backendServerRegionId) {
        this.backendServerRegionId = backendServerRegionId;
        return this;
    }
    public String getBackendServerRegionId() {
        return this.backendServerRegionId;
    }

    public AssociateGlobalAccelerationInstanceRequest setBackendServerType(String backendServerType) {
        this.backendServerType = backendServerType;
        return this;
    }
    public String getBackendServerType() {
        return this.backendServerType;
    }

}
