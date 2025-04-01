// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class RestoreInstanceRequest extends TeaModel {
    /**
     * <p>The ID of the backup file. You can call the <a href="https://help.aliyun.com/document_detail/473823.html">DescribeBackups</a> operation to query the IDs of backup files.</p>
     * 
     * <strong>example:</strong>
     * <p>78241****</p>
     */
    @NameInMap("BackupId")
    public String backupId;

    /**
     * <p>The key that you want to restore. You can specify multiple keys. Separate multiple keys with commas (,). Regular expressions are supported.</p>
     * <ul>
     * <li>If you do not specify this parameter, the entire instance is restored.</li>
     * <li>If you specify this parameter, only the involved keys are restored. Only classic instances support this feature.</li>
     * </ul>
     * <blockquote>
     * <p> In a regular expression, an asterisk (<code>*</code>) matches zero or more occurrences of a subexpression that occurs before. For example, if you set this parameter to <code>h.*llo</code>, strings such as <code>hllo</code> and <code>heeeello</code> are matched.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>key:00000007198*</p>
     */
    @NameInMap("FilterKey")
    public String filterKey;

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

    /**
     * <p>The point in time to which you want to restore data. Specify the time in the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm</em>Z format. The time must be in UTC.</p>
     * <blockquote>
     * <p> The point in time cannot be earlier than the point in time when the data flashback feature is enabled.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2021-07-06T07:25:57Z</p>
     */
    @NameInMap("RestoreTime")
    public String restoreTime;

    /**
     * <p>The restoration mode. Valid values:</p>
     * <ul>
     * <li><strong>0</strong> (default): The parameter is invalid.</li>
     * <li><strong>1</strong>: restores data to a specified point in time. You can specify this value only if the <a href="https://help.aliyun.com/document_detail/148479.html">data flashback</a> feature is enabled for the instance. If you specify this value, you also need to set the <strong>RestoreTime</strong> parameter.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("RestoreType")
    public String restoreType;

    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>When you restore a classic instance, regardless of whether you choose to restore all data or specific keys, you can apply an offset to the expiration time of the keys. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mmZ format. The time must be in UTC. A key expires after the remaining validity period of the key elapses based on the expiration offset time point.</p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>This feature applies only to keys and does not work on elements in the self-developed data structures of Tair, such as fields in exHash and skeys in TairTS.</p>
     * </li>
     * <li><p>This time point must be between the specified flashback time point and the submission time of the data restoration task.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2021-07-06T08:25:57Z</p>
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
