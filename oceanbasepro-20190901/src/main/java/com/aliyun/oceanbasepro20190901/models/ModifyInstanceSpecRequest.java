// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class ModifyInstanceSpecRequest extends TeaModel {
    /**
     * <p>The size of the storage space, in GB. The required storage space varies based on the cluster specifications:</p>
     * <p>- 8C32G: 100 GB to 10 TB.</p>
     * <p>- 14C70G: 200 GB to 10 TB.</p>
     * <p>- 30C180G: 400 GB to 10 TB.</p>
     * <p>- 62C400G: 800 GB to 10 TB. The preceding minimum storage space sizes are the default storage space sizes of the corresponding cluster specification plans.</p>
     */
    @NameInMap("DiskSize")
    public Long diskSize;

    /**
     * <p>Disk type.</p>
     */
    @NameInMap("DiskType")
    public String diskType;

    /**
     * <p>Specifies whether to perform only a dry run for the request. Default value: false. Valid values:</p>
     * <p>- true: Only a dry-run request is sent and the instance settings are not modified. If the dry run succeeds, DryRunResult=true is returned. If the dry run fails, an error code is returned.</p>
     * <p>- false: If the DryRun parameter is set to false, no dry run is performed and the DryRunResult parameter returns false.</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The specifications of the cluster. You can specify one of the following four plans:</p>
     * <p>- 8C32GB: indicates 8 CPU cores and 32 GB of memory.</p>
     * <p>- 14C70GB: indicates 14 CPU cores and 70 GB of memory. This is the default value.</p>
     * <p>- 30C180GB: indicates 30 CPU cores and 180 GB of memory.</p>
     * <p>- 62C400GB: indicates 62 CPU cores and 400 GB of memory.</p>
     */
    @NameInMap("InstanceClass")
    public String instanceClass;

    /**
     * <p>The ID of the OceanBase cluster.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("UpgradeSpecNative")
    public Boolean upgradeSpecNative;

    public static ModifyInstanceSpecRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceSpecRequest self = new ModifyInstanceSpecRequest();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceSpecRequest setDiskSize(Long diskSize) {
        this.diskSize = diskSize;
        return this;
    }
    public Long getDiskSize() {
        return this.diskSize;
    }

    public ModifyInstanceSpecRequest setDiskType(String diskType) {
        this.diskType = diskType;
        return this;
    }
    public String getDiskType() {
        return this.diskType;
    }

    public ModifyInstanceSpecRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public ModifyInstanceSpecRequest setInstanceClass(String instanceClass) {
        this.instanceClass = instanceClass;
        return this;
    }
    public String getInstanceClass() {
        return this.instanceClass;
    }

    public ModifyInstanceSpecRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyInstanceSpecRequest setUpgradeSpecNative(Boolean upgradeSpecNative) {
        this.upgradeSpecNative = upgradeSpecNative;
        return this;
    }
    public Boolean getUpgradeSpecNative() {
        return this.upgradeSpecNative;
    }

}
