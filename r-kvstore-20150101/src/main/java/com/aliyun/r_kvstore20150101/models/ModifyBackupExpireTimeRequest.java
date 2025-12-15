// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class ModifyBackupExpireTimeRequest extends TeaModel {
    /**
     * <p>The ID of the backup file. You can call the <a href="https://help.aliyun.com/document_detail/473823.html">DescribeBackups</a> operation to query the IDs of backup files.</p>
     * 
     * <strong>example:</strong>
     * <p>521****66</p>
     */
    @NameInMap("BackupId")
    public String backupId;

    /**
     * <p>The point in time to which you want to extend the expiration time. Specify the time in the yyyy-MM-ddTHH:mmZ format. The time must be in UTC. The time cannot be earlier than the current expiration time.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-07-06T07:25:57Z</p>
     */
    @NameInMap("ExpectExpireTime")
    public String expectExpireTime;

    /**
     * <p>The ID of the instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>r-bp1zxszhcgatnx****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static ModifyBackupExpireTimeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyBackupExpireTimeRequest self = new ModifyBackupExpireTimeRequest();
        return TeaModel.build(map, self);
    }

    public ModifyBackupExpireTimeRequest setBackupId(String backupId) {
        this.backupId = backupId;
        return this;
    }
    public String getBackupId() {
        return this.backupId;
    }

    public ModifyBackupExpireTimeRequest setExpectExpireTime(String expectExpireTime) {
        this.expectExpireTime = expectExpireTime;
        return this;
    }
    public String getExpectExpireTime() {
        return this.expectExpireTime;
    }

    public ModifyBackupExpireTimeRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyBackupExpireTimeRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyBackupExpireTimeRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyBackupExpireTimeRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyBackupExpireTimeRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
