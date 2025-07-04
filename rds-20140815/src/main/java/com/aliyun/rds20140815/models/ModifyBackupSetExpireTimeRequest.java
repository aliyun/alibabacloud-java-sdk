// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyBackupSetExpireTimeRequest extends TeaModel {
    /**
     * <p>The backup set ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>b-n8tpg24c6i0v****</p>
     */
    @NameInMap("BackupId")
    public Long backupId;

    /**
     * <p>The ID of the instance. You can call the DescribeDBInstances operation to query the instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-uf6wjk5****</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The point in time to which you want to extend the expiration time. Specify the time in the yyyy-MM-ddTHH:mmZ format. The time must be in UTC. The time cannot be earlier than the current expiration time.</p>
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
