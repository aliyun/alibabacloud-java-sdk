// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class EvaluateDedicatedHostInstanceResourceRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("DedicatedHostGroupId")
    public String dedicatedHostGroupId;

    @NameInMap("DiskType")
    public String diskType;

    @NameInMap("DiskSize")
    public String diskSize;

    @NameInMap("InstanceClassNames")
    public String instanceClassNames;

    @NameInMap("Engine")
    public String engine;

    @NameInMap("EngineVersion")
    public String engineVersion;

    public static EvaluateDedicatedHostInstanceResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        EvaluateDedicatedHostInstanceResourceRequest self = new EvaluateDedicatedHostInstanceResourceRequest();
        return TeaModel.build(map, self);
    }

    public EvaluateDedicatedHostInstanceResourceRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public EvaluateDedicatedHostInstanceResourceRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public EvaluateDedicatedHostInstanceResourceRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public EvaluateDedicatedHostInstanceResourceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public EvaluateDedicatedHostInstanceResourceRequest setDedicatedHostGroupId(String dedicatedHostGroupId) {
        this.dedicatedHostGroupId = dedicatedHostGroupId;
        return this;
    }
    public String getDedicatedHostGroupId() {
        return this.dedicatedHostGroupId;
    }

    public EvaluateDedicatedHostInstanceResourceRequest setDiskType(String diskType) {
        this.diskType = diskType;
        return this;
    }
    public String getDiskType() {
        return this.diskType;
    }

    public EvaluateDedicatedHostInstanceResourceRequest setDiskSize(String diskSize) {
        this.diskSize = diskSize;
        return this;
    }
    public String getDiskSize() {
        return this.diskSize;
    }

    public EvaluateDedicatedHostInstanceResourceRequest setInstanceClassNames(String instanceClassNames) {
        this.instanceClassNames = instanceClassNames;
        return this;
    }
    public String getInstanceClassNames() {
        return this.instanceClassNames;
    }

    public EvaluateDedicatedHostInstanceResourceRequest setEngine(String engine) {
        this.engine = engine;
        return this;
    }
    public String getEngine() {
        return this.engine;
    }

    public EvaluateDedicatedHostInstanceResourceRequest setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }
    public String getEngineVersion() {
        return this.engineVersion;
    }

}
