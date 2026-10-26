// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeCrossRegionBackupsRequest extends TeaModel {
    /**
     * <p>The ID of the user backup.</p>
     * 
     * <strong>example:</strong>
     * <p>603524****</p>
     */
    @NameInMap("BackupId")
    public Integer backupId;

    /**
     * <p>The ID of the cross-region backup file.</p>
     * <blockquote>
     * <p>You must specify either <strong>CrossBackupId</strong> or the start and end time parameters (<strong>StartTime</strong> and <strong>EndTime</strong>).</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>14562</p>
     */
    @NameInMap("CrossBackupId")
    public Integer crossBackupId;

    /**
     * <p>The ID of the destination region for cross-region backup.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("CrossBackupRegion")
    public String crossBackupRegion;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-uf6wjk5****</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The end time of the query. Specify the time in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time must be in UTC.</p>
     * <blockquote>
     * <p>If the time zone is not UTC+0, you must subtract 8 hours from the actual time.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2024-03-05T02:24:37Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The page number. Valid values: any integer greater than 0 and less than or equal to the maximum value of the Integer type.</p>
     * <p>Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Valid values:</p>
     * <ul>
     * <li><strong>30</strong></li>
     * <li><strong>50</strong></li>
     * <li><strong>100</strong></li>
     * </ul>
     * <p>Default value: 30.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The region ID of the instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmy****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The start time of the query. Specify the time in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time must be in UTC.</p>
     * <blockquote>
     * <p>If the time zone is not UTC+0, you must subtract 8 hours from the actual time.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2024-03-05T02:21:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeCrossRegionBackupsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCrossRegionBackupsRequest self = new DescribeCrossRegionBackupsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCrossRegionBackupsRequest setBackupId(Integer backupId) {
        this.backupId = backupId;
        return this;
    }
    public Integer getBackupId() {
        return this.backupId;
    }

    public DescribeCrossRegionBackupsRequest setCrossBackupId(Integer crossBackupId) {
        this.crossBackupId = crossBackupId;
        return this;
    }
    public Integer getCrossBackupId() {
        return this.crossBackupId;
    }

    public DescribeCrossRegionBackupsRequest setCrossBackupRegion(String crossBackupRegion) {
        this.crossBackupRegion = crossBackupRegion;
        return this;
    }
    public String getCrossBackupRegion() {
        return this.crossBackupRegion;
    }

    public DescribeCrossRegionBackupsRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public DescribeCrossRegionBackupsRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeCrossRegionBackupsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeCrossRegionBackupsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeCrossRegionBackupsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeCrossRegionBackupsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeCrossRegionBackupsRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeCrossRegionBackupsRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeCrossRegionBackupsRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeCrossRegionBackupsRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
