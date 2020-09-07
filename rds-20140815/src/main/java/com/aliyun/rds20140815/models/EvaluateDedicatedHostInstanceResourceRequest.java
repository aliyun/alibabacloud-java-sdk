// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class EvaluateDedicatedHostInstanceResourceRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("DedicatedHostGroupId")
    @Validation(required = true)
    public String dedicatedHostGroupId;

    @NameInMap("DiskType")
    public String diskType;

    @NameInMap("DiskSize")
    public String diskSize;

    @NameInMap("InstanceClassNames")
    @Validation(required = true)
    public String instanceClassNames;

    @NameInMap("Engine")
    @Validation(required = true)
    public String engine;

    @NameInMap("EngineVersion")
    @Validation(required = true)
    public String engineVersion;

    public static EvaluateDedicatedHostInstanceResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        EvaluateDedicatedHostInstanceResourceRequest self = new EvaluateDedicatedHostInstanceResourceRequest();
        return TeaModel.build(map, self);
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
