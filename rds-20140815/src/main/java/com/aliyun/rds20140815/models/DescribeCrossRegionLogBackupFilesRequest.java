// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeCrossRegionLogBackupFilesRequest extends TeaModel {
    // description: 实例ID。; 
    @NameInMap("DBInstanceId")
    @Validation(required = true)
    public String DBInstanceId;

    // description: 实例所在地域ID。可以通过接口[DescribeRegions](~~26243~~)查看地域ID。; 
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    // description: 跨地域备份目的地域ID。可以通过接口[DescribeCrossRegionBackupDBInstance](~~121737~~)查看地域ID。; 
    @NameInMap("CrossBackupRegion")
    public String crossBackupRegion;

    // description: 查询开始时间。格式：<i>yyyy-MM-dd</i>T<i>HH:mm</i>Z（UTC时间）。; 
    @NameInMap("StartTime")
    @Validation(required = true)
    public String startTime;

    // description: 查询结束时间。格式：<i>yyyy-MM-dd</i>T<i>HH:mm</i>Z（UTC时间）。; 
    @NameInMap("EndTime")
    @Validation(required = true)
    public String endTime;

    // description: 每页记录数，取值：* **30**；* **50**；* **100**。默认值：30。; 
    @NameInMap("PageSize")
    public Integer pageSize;

    // description: 页码，取值：大于0且不超过Integer的最大值。默认值：**1**。; 
    @NameInMap("PageNumber")
    public Integer pageNumber;

    public static DescribeCrossRegionLogBackupFilesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCrossRegionLogBackupFilesRequest self = new DescribeCrossRegionLogBackupFilesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCrossRegionLogBackupFilesRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public DescribeCrossRegionLogBackupFilesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeCrossRegionLogBackupFilesRequest setCrossBackupRegion(String crossBackupRegion) {
        this.crossBackupRegion = crossBackupRegion;
        return this;
    }
    public String getCrossBackupRegion() {
        return this.crossBackupRegion;
    }

    public DescribeCrossRegionLogBackupFilesRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeCrossRegionLogBackupFilesRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeCrossRegionLogBackupFilesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeCrossRegionLogBackupFilesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

}
