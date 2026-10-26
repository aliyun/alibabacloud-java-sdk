// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyRCDiskAttributeRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable the performance burst feature for disks that support this feature. Valid values:</p>
     * <p>true: enables the feature.
     * false: disables the feature.
     * Note
     * An error is returned if you specify any value for a disk that does not support the performance burst feature.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("BurstingEnabled")
    public Boolean burstingEnabled;

    /**
     * <p>Specifies whether to release the disk when the instance is released. Default value: null. A value of null indicates that the current value remains unchanged.</p>
     * <p>You cannot configure this parameter for cloud disks that have the multi-attach feature enabled.</p>
     * <p>An error is returned if you set the DeleteWithInstance parameter to false in the following scenarios:</p>
     * <p>The disk category is local disk (ephemeral).
     * The disk category is basic cloud disk (cloud) and the disk is not detachable (Portable=false).
     * Warning
     * If you set this parameter to false and the ECS instance to which the disk is attached is locked for security reasons (the OperationLocks parameter indicates &quot;LockReason&quot; : &quot;security&quot;), the disk is released along with the instance regardless of the DeleteWithInstance setting when the instance is released.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DeleteWithInstance")
    public Boolean deleteWithInstance;

    /**
     * <p>The description of the disk. The description must be 2 to 256 characters in length and cannot start with http:// or https://.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The ID of the disk whose attributes you want to modify.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rcd-wz9c8isqly8637zw****</p>
     */
    @NameInMap("DiskId")
    public String diskId;

    /**
     * <p>The cloud disk name. The name must be 2 to 128 characters in length and can contain characters in the Letter category of Unicode, such as English letters, Chinese characters, and digits. It can also contain colons (:), underscores (_), periods (.), and hyphens (-).</p>
     * 
     * <strong>example:</strong>
     * <p>testDisk</p>
     */
    @NameInMap("DiskName")
    public String diskName;

    /**
     * <p>The region ID. You can call the DescribeRegions operation to query the most recent region list.</p>
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
