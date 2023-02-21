// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class UpdateUserBackupFileRequest extends TeaModel {
    /**
     * <p>The ID of the full backup file. You can call the [ListUserBackupFiles](~~257821~~) operation to query the information about all full backup files in a region.</p>
     */
    @NameInMap("BackupId")
    public String backupId;

    /**
     * <p>The new description of the full backup file.</p>
     */
    @NameInMap("Comment")
    public String comment;

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

    /**
     * <p>The new retention period of the full backup file. Unit: days. Valid values: any non-zero positive integer.</p>
     */
    @NameInMap("Retention")
    public Integer retention;

    public static UpdateUserBackupFileRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateUserBackupFileRequest self = new UpdateUserBackupFileRequest();
        return TeaModel.build(map, self);
    }

    public UpdateUserBackupFileRequest setBackupId(String backupId) {
        this.backupId = backupId;
        return this;
    }
    public String getBackupId() {
        return this.backupId;
    }

    public UpdateUserBackupFileRequest setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public UpdateUserBackupFileRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UpdateUserBackupFileRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateUserBackupFileRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public UpdateUserBackupFileRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public UpdateUserBackupFileRequest setRetention(Integer retention) {
        this.retention = retention;
        return this;
    }
    public Integer getRetention() {
        return this.retention;
    }

}
