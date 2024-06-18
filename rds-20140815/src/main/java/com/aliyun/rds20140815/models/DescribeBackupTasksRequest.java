// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeBackupTasksRequest extends TeaModel {
    /**
     * <p>The ID of the backup task.</p>
     * 
     * <strong>example:</strong>
     * <p>4762614</p>
     */
    @NameInMap("BackupJobId")
    public Integer backupJobId;

    /**
     * <p>The status of the backup task. Valid values:</p>
     * <ul>
     * <li><strong>NoStart</strong></li>
     * <li><strong>Progressing</strong></li>
     * </ul>
     * <p>By default, this operation returns backup tasks in both states.</p>
     * 
     * <strong>example:</strong>
     * <p>NoStart</p>
     */
    @NameInMap("BackupJobStatus")
    public String backupJobStatus;

    /**
     * <p>The backup mode. Valid values:</p>
     * <ul>
     * <li><strong>Automated</strong></li>
     * <li><strong>Manual</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Automated</p>
     */
    @NameInMap("BackupMode")
    public String backupMode;

    /**
     * <p>Specifies the client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>ETnLKlblzczshOTUbOCzxxxxxxx</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The instance ID. You can call the DescribeDBInstances operation to query the instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-uf6wjk5xxxxxxx</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>A reserved parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("Flag")
    public String flag;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static DescribeBackupTasksRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeBackupTasksRequest self = new DescribeBackupTasksRequest();
        return TeaModel.build(map, self);
    }

    public DescribeBackupTasksRequest setBackupJobId(Integer backupJobId) {
        this.backupJobId = backupJobId;
        return this;
    }
    public Integer getBackupJobId() {
        return this.backupJobId;
    }

    public DescribeBackupTasksRequest setBackupJobStatus(String backupJobStatus) {
        this.backupJobStatus = backupJobStatus;
        return this;
    }
    public String getBackupJobStatus() {
        return this.backupJobStatus;
    }

    public DescribeBackupTasksRequest setBackupMode(String backupMode) {
        this.backupMode = backupMode;
        return this;
    }
    public String getBackupMode() {
        return this.backupMode;
    }

    public DescribeBackupTasksRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DescribeBackupTasksRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public DescribeBackupTasksRequest setFlag(String flag) {
        this.flag = flag;
        return this;
    }
    public String getFlag() {
        return this.flag;
    }

    public DescribeBackupTasksRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeBackupTasksRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeBackupTasksRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeBackupTasksRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
