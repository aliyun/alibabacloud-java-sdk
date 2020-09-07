// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeCrossRegionBackupsRequest extends TeaModel {
    // description: 实例ID。; 
    @NameInMap("DBInstanceId")
    @Validation(required = true)
    public String DBInstanceId;

    // description: 实例所在地域ID。; 
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    // description: 跨地域备份目的地域ID。; 
    @NameInMap("CrossBackupRegion")
    public String crossBackupRegion;

    // description: 跨地域备份文件ID。>**CrossBackupId**和起止时间参数（**StartTime**、**EndTime**）必须传入其中一组。; 
    @NameInMap("CrossBackupId")
    public Integer crossBackupId;

    // description: 查询开始时间。格式：<i>yyyy-MM-dd</i>T<i>HH:mm</i>Z（UTC时间）。; 
    @NameInMap("StartTime")
    public String startTime;

    // description: 查询结束时间。格式：<i>yyyy-MM-dd</i>T<i>HH:mm</i>Z（UTC时间）。; 
    @NameInMap("EndTime")
    public String endTime;

    // description: 每页记录数，取值：* **30**；* **50**；* **100**。默认值：30。; 
    @NameInMap("PageSize")
    public Integer pageSize;

    // description: 页码，取值：大于0且不超过Integer的最大值。默认值：**1**。; 
    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("BackupId")
    public Integer backupId;

    public static DescribeCrossRegionBackupsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCrossRegionBackupsRequest self = new DescribeCrossRegionBackupsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCrossRegionBackupsRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public DescribeCrossRegionBackupsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeCrossRegionBackupsRequest setCrossBackupRegion(String crossBackupRegion) {
        this.crossBackupRegion = crossBackupRegion;
        return this;
    }
    public String getCrossBackupRegion() {
        return this.crossBackupRegion;
    }

    public DescribeCrossRegionBackupsRequest setCrossBackupId(Integer crossBackupId) {
        this.crossBackupId = crossBackupId;
        return this;
    }
    public Integer getCrossBackupId() {
        return this.crossBackupId;
    }

    public DescribeCrossRegionBackupsRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeCrossRegionBackupsRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeCrossRegionBackupsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeCrossRegionBackupsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeCrossRegionBackupsRequest setBackupId(Integer backupId) {
        this.backupId = backupId;
        return this;
    }
    public Integer getBackupId() {
        return this.backupId;
    }

}
