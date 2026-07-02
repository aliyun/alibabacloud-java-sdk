// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribeBackupsRequest extends TeaModel {
    /**
     * <p>The ID of the backup file.</p>
     * 
     * <strong>example:</strong>
     * <p>11611111</p>
     */
    @NameInMap("BackupId")
    public Long backupId;

    /**
     * <p>The ID of the backup job returned by the <code>CreateBackup</code> operation. If <code>CreateBackup</code> returns multiple backup job IDs, call this operation for each ID.</p>
     * 
     * <strong>example:</strong>
     * <p>10001</p>
     */
    @NameInMap("BackupJobId")
    public Long backupJobId;

    /**
     * <p>The end time for the query. The end time must be later than the start time. Specify the time in UTC using the <em>yyyy-MM-dd</em>T<em>HH:mm</em>Z format.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-03-14T18:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The ID of the instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>r-bp1zxszhcgatnx****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>Specifies whether to enable AOF persistence. Valid values:</p>
     * <ul>
     * <li><p><strong>0</strong>: Disabled.</p>
     * </li>
     * <li><p><strong>1</strong>: Enabled.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>The default value is <strong>0</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("NeedAof")
    public String needAof;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The page number to return. The value must be greater than <strong>0</strong>. The default value is <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The maximum number of entries to return per page. Valid values: <code>30</code>, <code>50</code>, <code>100</code>, <code>200</code>, and <code>300</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>The start time for the query. Specify the time in UTC using the <em>yyyy-MM-dd</em>T<em>HH:mm</em>Z format.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-03-11T10:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeBackupsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeBackupsRequest self = new DescribeBackupsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeBackupsRequest setBackupId(Long backupId) {
        this.backupId = backupId;
        return this;
    }
    public Long getBackupId() {
        return this.backupId;
    }

    public DescribeBackupsRequest setBackupJobId(Long backupJobId) {
        this.backupJobId = backupJobId;
        return this;
    }
    public Long getBackupJobId() {
        return this.backupJobId;
    }

    public DescribeBackupsRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeBackupsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeBackupsRequest setNeedAof(String needAof) {
        this.needAof = needAof;
        return this;
    }
    public String getNeedAof() {
        return this.needAof;
    }

    public DescribeBackupsRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeBackupsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeBackupsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeBackupsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeBackupsRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeBackupsRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeBackupsRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public DescribeBackupsRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
