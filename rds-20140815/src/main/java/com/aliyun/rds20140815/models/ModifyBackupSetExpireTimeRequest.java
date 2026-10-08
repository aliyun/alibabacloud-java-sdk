// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyBackupSetExpireTimeRequest extends TeaModel {
    /**
     * <p>The backup set ID. You can invoke DescribeBackups to query the backup set ID. The backup set must meet the following conditions:</p>
     * <ul>
     * <li>Engine (database type): SQLServer</li>
     * <li>BackupMode (backup pattern): Manual (manual backup)</li>
     * <li>BackupMethod: Physical (physical backup)</li>
     * <li>BackupType: FullBackup (full backup)</li>
     * <li>BackupStatus: Success (backup completed)</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>262186****</p>
     */
    @NameInMap("BackupId")
    public Long backupId;

    /**
     * <p>The instance ID. You can call DescribeDBInstances to query the instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-7xv8f2zcia0e4****</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The time to which you want to extend the expiration time of the backup set. Specify the time in the yyyy-MM-ddTHH:mmZ format (UTC).</p>
     * <p>The specified time cannot be earlier than the current expiration time. You can call DescribeBackups to query the current expiration time (ExpectExpireTime).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-07-15T12:10:23Z</p>
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
