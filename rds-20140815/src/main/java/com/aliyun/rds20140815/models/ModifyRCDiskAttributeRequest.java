// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyRCDiskAttributeRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable the burst (performance burst) feature for disks that support it. Valid values:</p>
     * <p>true: Enabled.
     * false: No.
     * Note
     * If you specify any value for a disk that does not support the burst feature, an error is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("BurstingEnabled")
    public Boolean burstingEnabled;

    /**
     * <p>Specifies whether the disk is released when its associated instance is released. Default value: none, which means the current setting remains unchanged.</p>
     * <p>This parameter cannot be set for disks with the multi-attach feature enabled.</p>
     * <p>An error occurs if you set DeleteWithInstance to false in either of the following cases:</p>
     * <ul>
     * <li>The disk category is local disk (ephemeral).</li>
     * <li>The disk category is basic disk (cloud) and the disk is non-portable (Portable=false).</li>
     * </ul>
     * <p>Warning
     * If you set DeleteWithInstance to false, but the ECS instance to which the disk is attached is security locked (indicated by &quot;LockReason&quot;: &quot;security&quot; in OperationLocks), the disk will be released together with the instance regardless of the DeleteWithInstance setting when the instance is released.</p>
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
     * <p>The ID of the disk whose property you want to modify.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rcd-wz9c8isqly8637zw****</p>
     */
    @NameInMap("DiskId")
    public String diskId;

    /**
     * <p>Disk name. The name must be 2 to 128 characters in length and can contain characters from the letter categorization in Unicode (including English letters, Chinese characters, and digits). It can also include colons (:), underscores (_), periods (.), or hyphens (-).</p>
     * 
     * <strong>example:</strong>
     * <p>testDisk</p>
     */
    @NameInMap("DiskName")
    public String diskName;

    /**
     * <p>The region ID. You can call DescribeRegions to obtain valid region IDs.</p>
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
