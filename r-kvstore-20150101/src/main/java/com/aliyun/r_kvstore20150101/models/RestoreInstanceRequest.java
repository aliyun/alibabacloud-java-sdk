// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class RestoreInstanceRequest extends TeaModel {
    /**
     * <p>The ID of the backup file. You can call the [DescribeBackups](~~61081~~) operation to query the IDs of backup files.</p>
     */
    @NameInMap("BackupId")
    public String backupId;

    /**
     * <p>The key that you want to restore. You can specify multiple keys. Separate multiple keys with commas (,). Regular expressions are supported.</p>
     * <br>
     * <p>> </p>
     * <br>
     * <p>*   In a regular expression, an asterisk (`*`) matches zero or more occurrences of a subexpression that occurs before. For example, if you set this parameter to `h.*llo`, strings such as `hllo` and `heeeello` are matched.</p>
     * <br>
     * <p>*   This parameter is available only if you set the **RestoreType** parameter to **1**.</p>
     */
    @NameInMap("FilterKey")
    public String filterKey;

    /**
     * <p>The ID of the instance.</p>
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

    /**
     * <p>The point in time to which you want to restore data. Specify the time in the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time must be in UTC.</p>
     * <br>
     * <p>> </p>
     * <br>
     * <p>*   If the [data flashback](~~148479~~) feature is enabled for the instance, you can specify this parameter and the **FilterKey** parameter to restore the data of the specified key to the specified point in time that is accurate to the second. Other keys are not affected. This way, you can achieve more fine-grained data restoration.</p>
     * <br>
     * <p>*   This parameter is available only if you set the **RestoreType** parameter to **1**.</p>
     */
    @NameInMap("RestoreTime")
    public String restoreTime;

    /**
     * <p>The restoration mode. Default value: 0. Valid values:</p>
     * <br>
     * <p>*   **0**: restores data from the specified backup set.</p>
     * <p>*   **1**: restores data to a specified point in time. You can specify this value only if the [data flashback](~~148479~~) feature is enabled for the instance. If you specify this value, you must also specify the **RestoreTime** parameter.</p>
     */
    @NameInMap("RestoreType")
    public String restoreType;

    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>The expiration offset time point of a key. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mmZ format. The time must be in UTC. The key expires after the remaining validity period of the key elapses based on the expiration offset time point.</p>
     * <br>
     * <p>> This time point must be between the specified flashback time point and the submission time of the data restoration task.</p>
     */
    @NameInMap("TimeShift")
    public String timeShift;

    public static RestoreInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        RestoreInstanceRequest self = new RestoreInstanceRequest();
        return TeaModel.build(map, self);
    }

    public RestoreInstanceRequest setBackupId(String backupId) {
        this.backupId = backupId;
        return this;
    }
    public String getBackupId() {
        return this.backupId;
    }

    public RestoreInstanceRequest setFilterKey(String filterKey) {
        this.filterKey = filterKey;
        return this;
    }
    public String getFilterKey() {
        return this.filterKey;
    }

    public RestoreInstanceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public RestoreInstanceRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public RestoreInstanceRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public RestoreInstanceRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public RestoreInstanceRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public RestoreInstanceRequest setRestoreTime(String restoreTime) {
        this.restoreTime = restoreTime;
        return this;
    }
    public String getRestoreTime() {
        return this.restoreTime;
    }

    public RestoreInstanceRequest setRestoreType(String restoreType) {
        this.restoreType = restoreType;
        return this;
    }
    public String getRestoreType() {
        return this.restoreType;
    }

    public RestoreInstanceRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public RestoreInstanceRequest setTimeShift(String timeShift) {
        this.timeShift = timeShift;
        return this;
    }
    public String getTimeShift() {
        return this.timeShift;
    }

}
