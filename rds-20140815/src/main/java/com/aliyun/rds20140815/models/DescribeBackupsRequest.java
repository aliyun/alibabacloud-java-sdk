// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeBackupsRequest extends TeaModel {
    /**
     * <p>The ID of the backup set.</p>
     * 
     * <strong>example:</strong>
     * <p>327329803</p>
     */
    @NameInMap("BackupId")
    public String backupId;

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
     * <p>The status of the backup set. Valid values:</p>
     * <ul>
     * <li><strong>Success</strong></li>
     * <li><strong>Failed</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("BackupStatus")
    public String backupStatus;

    /**
     * <p>The backup type. Valid values:</p>
     * <ul>
     * <li><strong>FullBackup</strong>: full backup</li>
     * <li><strong>IncrementalBackup</strong>: incremental backup</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>FullBackup</p>
     */
    @NameInMap("BackupType")
    public String backupType;

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
     * <p>The end of the time range to query. The end time must be later than the start time. Specify the time in the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm</em>Z format. The time must be in UTC.</p>
     * <blockquote>
     * <p>We recommend that you specify a time range that is as short as possible to avoid timeout.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2011-06-15T16:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The number of the page to return. Valid values: any non-zero positive integer.</p>
     * <p>Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page. Valid values:</p>
     * <ul>
     * <li><strong>30</strong></li>
     * <li><strong>50</strong></li>
     * <li><strong>100</strong></li>
     * </ul>
     * <p>Default value: <strong>30</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmy*****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The beginning of the time range to query. Specify the time in the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm</em>Z format. The time must be in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2011-06-01T16:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeBackupsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeBackupsRequest self = new DescribeBackupsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeBackupsRequest setBackupId(String backupId) {
        this.backupId = backupId;
        return this;
    }
    public String getBackupId() {
        return this.backupId;
    }

    public DescribeBackupsRequest setBackupMode(String backupMode) {
        this.backupMode = backupMode;
        return this;
    }
    public String getBackupMode() {
        return this.backupMode;
    }

    public DescribeBackupsRequest setBackupStatus(String backupStatus) {
        this.backupStatus = backupStatus;
        return this;
    }
    public String getBackupStatus() {
        return this.backupStatus;
    }

    public DescribeBackupsRequest setBackupType(String backupType) {
        this.backupType = backupType;
        return this;
    }
    public String getBackupType() {
        return this.backupType;
    }

    public DescribeBackupsRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public DescribeBackupsRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
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

    public DescribeBackupsRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeBackupsRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeBackupsRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
