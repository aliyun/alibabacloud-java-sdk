// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyRCDiskAttributeRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable the performance burst feature for cloud disks that support burst. Valid values:</p>
     * <p>true: Enabled.
     * false: Disabled.
     * Note
     * An error is returned if you pass any value for cloud disks that do not support the burst feature.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("BurstingEnabled")
    public Boolean burstingEnabled;

    /**
     * <p>Specifies whether to release the cloud disk when the associated instance is released. Default value: null, which indicates that the current value is not changed.</p>
     * <p>Cloud disks that have the multi-attach feature enabled do not support this parameter.</p>
     * <p>An error is returned if you set DeleteWithInstance to false in the following cases:</p>
     * <p>The category of the cloud disk is local disk (ephemeral).
     * The category of the cloud disk is basic cloud disk (cloud) and the cloud disk is not detachable (Portable=false).
     * Warning
     * If you set DeleteWithInstance to false and the ECS instance to which the cloud disk is attached is security-locked with &quot;LockReason&quot; : &quot;security&quot; in OperationLocks, the DeleteWithInstance attribute of the cloud disk is ignored and the cloud disk is released together with the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DeleteWithInstance")
    public Boolean deleteWithInstance;

    /**
     * <p>The description of the cloud disk. The description must be 2 to 256 characters in length and cannot start with http:// or https://.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The ID of the cloud disk whose attributes you want to modify.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rcd-wz9c8isqly8637zw****</p>
     */
    @NameInMap("DiskId")
    public String diskId;

    /**
     * <p>The name of the cloud disk. The name must be 2 to 128 characters in length and can contain Unicode characters under the letter category (including letters from various languages, Chinese characters, and digits). The name can contain colons (:), underscores (_), periods (.), or hyphens (-).</p>
     * 
     * <strong>example:</strong>
     * <p>testDisk</p>
     */
    @NameInMap("DiskName")
    public String diskName;

    /**
     * <p>The region ID. You can call DescribeRegions to obtain the region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static ModifyRCDiskAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyRCDiskAttributeRequest self = new ModifyRCDiskAttributeRequest();
        return TeaModel.build(map, self);
    }

    public ModifyRCDiskAttributeRequest setBurstingEnabled(Boolean burstingEnabled) {
        this.burstingEnabled = burstingEnabled;
        return this;
    }
    public Boolean getBurstingEnabled() {
        return this.burstingEnabled;
    }

    public ModifyRCDiskAttributeRequest setDeleteWithInstance(Boolean deleteWithInstance) {
        this.deleteWithInstance = deleteWithInstance;
        return this;
    }
    public Boolean getDeleteWithInstance() {
        return this.deleteWithInstance;
    }

    public ModifyRCDiskAttributeRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifyRCDiskAttributeRequest setDiskId(String diskId) {
        this.diskId = diskId;
        return this;
    }
    public String getDiskId() {
        return this.diskId;
    }

    public ModifyRCDiskAttributeRequest setDiskName(String diskName) {
        this.diskName = diskName;
        return this;
    }
    public String getDiskName() {
        return this.diskName;
    }

    public ModifyRCDiskAttributeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
