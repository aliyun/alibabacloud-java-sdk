// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class RestoreInstanceRequest extends TeaModel {
    /**
     * <p>The ID of the backup file. You can find backup file IDs by calling the <a href="https://help.aliyun.com/document_detail/473823.html">DescribeBackups</a> operation.</p>
     * 
     * <strong>example:</strong>
     * <p>78241****</p>
     */
    @NameInMap("BackupId")
    public String backupId;

    /**
     * <p>The keys to restore, which can be specified as a regular expression. To specify multiple keys, separate them with commas (,).</p>
     * <ul>
     * <li><p>If you do not specify this parameter, the entire instance is restored.</p>
     * </li>
     * <li><p>If you specify this parameter, only the specified keys are restored. This feature is available only for instances that use the classic architecture.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>In a regular expression, the asterisk (<code>*</code>) matches the preceding element zero or more times. For example, if you set this parameter to <code>h.*llo</code>, strings such as <code>hllo</code> and <code>heeeello</code> are matched.</p>
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
     * <p>The restore point in time. Specify the time in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format (UTC).</p>
     * <blockquote>
     * <p>This point in time cannot be earlier than the time when the Data Flashback feature was enabled.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2021-07-06T07:25:57Z</p>
     */
    @NameInMap("RestoreTime")
    public String restoreTime;

    /**
     * <p>The restore method. Valid values:</p>
     * <ul>
     * <li><p><strong>0</strong> (default): This value is deprecated.</p>
     * </li>
     * <li><p><strong>1</strong>: Restores data to a specific point in time. You can set this parameter to 1 only if the <a href="https://help.aliyun.com/document_detail/148479.html">Data Flashback</a> feature is enabled for the instance. If you set this parameter to 1, you must also specify the <strong>RestoreTime</strong> parameter.</p>
     * </li>
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
     * <p>For instances that use the classic architecture, you can apply an offset to the expiration time of restored keys. This applies whether you restore the entire instance or only specific keys. The system calculates a key\&quot;s remaining time-to-live (TTL) at the specified flashback point in time and then adds this TTL to the <code>TimeShift</code> value to set the key\&quot;s new expiration time. Specify the time in the yyyy-MM-ddTHH:mm:ssZ format (UTC).</p>
     * <blockquote>
     * <ul>
     * <li><p>This feature adjusts the expiration time for top-level keys only. It does not apply to the expiration times of elements within Tair-specific data structures, such as fields in an exHash or secondary keys (Skeys) in a Time Series (TS) data structure.</p>
     * </li>
     * <li><p>The specified time must be later than <code>RestoreTime</code> and earlier than the task submission time.</p>
     * </li>
     * </ul>
     * </blockquote>
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
