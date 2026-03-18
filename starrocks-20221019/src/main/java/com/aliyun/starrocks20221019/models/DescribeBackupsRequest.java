// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starrocks20221019.models;

import com.aliyun.tea.*;

public class DescribeBackupsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>bt-2389hsdui12m</p>
     */
    @NameInMap("BackupTaskId")
    public String backupTaskId;

    /**
     * <strong>example:</strong>
     * <p>c-b25e21e24388****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <strong>example:</strong>
     * <p>COMPLETED</p>
     */
    @NameInMap("Statuses")
    public String statuses;

    /**
     * <strong>example:</strong>
     * <p>1747728000</p>
     */
    @NameInMap("TimePeriodEndTime")
    public Long timePeriodEndTime;

    /**
     * <strong>example:</strong>
     * <p>1747708000</p>
     */
    @NameInMap("TimePeriodStartTime")
    public Long timePeriodStartTime;

    public static DescribeBackupsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeBackupsRequest self = new DescribeBackupsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeBackupsRequest setBackupTaskId(String backupTaskId) {
        this.backupTaskId = backupTaskId;
        return this;
    }
    public String getBackupTaskId() {
        return this.backupTaskId;
    }

    public DescribeBackupsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
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

    public DescribeBackupsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeBackupsRequest setStatuses(String statuses) {
        this.statuses = statuses;
        return this;
    }
    public String getStatuses() {
        return this.statuses;
    }

    public DescribeBackupsRequest setTimePeriodEndTime(Long timePeriodEndTime) {
        this.timePeriodEndTime = timePeriodEndTime;
        return this;
    }
    public Long getTimePeriodEndTime() {
        return this.timePeriodEndTime;
    }

    public DescribeBackupsRequest setTimePeriodStartTime(Long timePeriodStartTime) {
        this.timePeriodStartTime = timePeriodStartTime;
        return this;
    }
    public Long getTimePeriodStartTime() {
        return this.timePeriodStartTime;
    }

}
