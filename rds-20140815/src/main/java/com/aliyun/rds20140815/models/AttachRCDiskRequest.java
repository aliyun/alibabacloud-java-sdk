// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class AttachRCDiskRequest extends TeaModel {
    /**
     * <p>Specifies whether to release the cloud disk when the instance is released. Valid values:</p>
     * <ul>
     * <li>true: The cloud disk is released.</li>
     * <li>false: The cloud disk is not released. The cloud disk is retained and converted to a pay-as-you-go data cloud disk.</li>
     * </ul>
     * <p>Default value: false.</p>
     * <p>When you configure this parameter, take note of the following items:</p>
     * <p>If you set DeleteWithInstance to false and the instance is locked for security reasons (the &quot;LockReason&quot; : &quot;security&quot; attribute is included in OperationLocks), the cloud disk is released along with the instance regardless of this parameter setting.</p>
     * <p>If the cloud disk you want to attach is an elastic ephemeral disk, you must set DeleteWithInstance to true.</p>
     * <p>This parameter cannot be configured for cloud disks that have the multi-attach feature enabled.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DeleteWithInstance")
    public Boolean deleteWithInstance;

    /**
     * <p>The ID of the cloud disk to be attached. The cloud disk (DiskId) and the instance (InstanceId) must be in the same zone.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rcd-wz98hnpj2sjo85zc7t2w</p>
     */
    @NameInMap("DiskId")
    public String diskId;

    /**
     * <p>The ID of the destination RDS Custom instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rc-dh2jf9n6j4s14926****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static AttachRCDiskRequest build(java.util.Map<String, ?> map) throws Exception {
        AttachRCDiskRequest self = new AttachRCDiskRequest();
        return TeaModel.build(map, self);
    }

    public AttachRCDiskRequest setDeleteWithInstance(Boolean deleteWithInstance) {
        this.deleteWithInstance = deleteWithInstance;
        return this;
    }
    public Boolean getDeleteWithInstance() {
        return this.deleteWithInstance;
    }

    public AttachRCDiskRequest setDiskId(String diskId) {
        this.diskId = diskId;
        return this;
    }
    public String getDiskId() {
        return this.diskId;
    }

    public AttachRCDiskRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public AttachRCDiskRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
