// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyBackupSetExpireTimeRequest extends TeaModel {
    /**
     * <p>The backup set ID. You can call the DescribeBackups operation to query the backup set ID. The backup set must meet the following requirements:</p>
     * <ul>
     * <li>The Engine parameter is SQLServer</li>
     * <li>The BackupMode parameter is set to Manual.</li>
     * <li>The BackupMethod parameter is set to Physical.</li>
     * <li>The BackupType parameter is set to FullBackup.</li>
     * <li>The BackupStatus parameter is set to Success.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>b-n8tpg24c6i0v****</p>
     */
    @NameInMap("BackupId")
    public Long backupId;

    /**
     * <p>The instance ID. You can call the DescribeDBInstances operation to query the instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-uf6wjk5****</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The point in time to which you want to extend the expiration time of the backup set. Specify the time in the yyyy-MM-ddTHH:mmZ format. The time must be in UTC.</p>
     * <p>The time cannot be earlier than the current expiration time. You can call the DescribeBackups operation to view the current expiration time of the backup set.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-06-17T12:10:23Z</p>
     */
    @NameInMap("ExpectExpireTime")
    public String expectExpireTime;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static ModifyBackupSetExpireTimeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyBackupSetExpireTimeRequest self = new ModifyBackupSetExpireTimeRequest();
        return TeaModel.build(map, self);
    }

    public ModifyBackupSetExpireTimeRequest setBackupId(Long backupId) {
        this.backupId = backupId;
        return this;
    }
    public Long getBackupId() {
        return this.backupId;
    }

    public ModifyBackupSetExpireTimeRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public ModifyBackupSetExpireTimeRequest setExpectExpireTime(String expectExpireTime) {
        this.expectExpireTime = expectExpireTime;
        return this;
    }
    public String getExpectExpireTime() {
        return this.expectExpireTime;
    }

    public ModifyBackupSetExpireTimeRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
