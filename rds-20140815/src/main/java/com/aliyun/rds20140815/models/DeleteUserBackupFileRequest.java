// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DeleteUserBackupFileRequest extends TeaModel {
    /**
     * <p>The ID of the full backup file. You can call the [ListUserBackupFiles](~~257821~~) operation to query the information about all full backup files in the region.</p>
     */
    @NameInMap("BackupId")
    public String backupId;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID of the full backup file. You can call the [DescribeRegions](~~26243~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static DeleteUserBackupFileRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteUserBackupFileRequest self = new DeleteUserBackupFileRequest();
        return TeaModel.build(map, self);
    }

    public DeleteUserBackupFileRequest setBackupId(String backupId) {
        this.backupId = backupId;
        return this;
    }
    public String getBackupId() {
        return this.backupId;
    }

    public DeleteUserBackupFileRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DeleteUserBackupFileRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteUserBackupFileRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DeleteUserBackupFileRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
