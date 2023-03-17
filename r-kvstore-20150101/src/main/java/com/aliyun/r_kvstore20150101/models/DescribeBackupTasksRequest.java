// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribeBackupTasksRequest extends TeaModel {
    /**
     * <p>The ID of the backup task.</p>
     * <br>
     * <p>>  After you call the [CreateBackup](~~61075~~) operation to create a manual backup task, you can specify the returned backup task ID in the request of this operation to query the progress of the backup task.</p>
     */
    @NameInMap("BackupJobId")
    public String backupJobId;

    /**
     * <p>The ID of the ApsaraDB for Redis instance. You can call the [DescribeInstances](~~60933~~) operation to query instance IDs.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The backup mode. Valid values:</p>
     * <br>
     * <p>*   **Automated**: automatic backup. You can call the [DescribeBackupPolicy](~~61078~~) operation to query the automatic backup policy.</p>
     * <p>*   **Manual**: manual backup.</p>
     * <br>
     * <p>>  By default, the information about backup tasks in both modes is returned.</p>
     */
    @NameInMap("JobMode")
    public String jobMode;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static DescribeBackupTasksRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeBackupTasksRequest self = new DescribeBackupTasksRequest();
        return TeaModel.build(map, self);
    }

    public DescribeBackupTasksRequest setBackupJobId(String backupJobId) {
        this.backupJobId = backupJobId;
        return this;
    }
    public String getBackupJobId() {
        return this.backupJobId;
    }

    public DescribeBackupTasksRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeBackupTasksRequest setJobMode(String jobMode) {
        this.jobMode = jobMode;
        return this;
    }
    public String getJobMode() {
        return this.jobMode;
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

    public DescribeBackupTasksRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
