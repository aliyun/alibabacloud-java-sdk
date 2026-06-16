// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribeBackupSetListRequest extends TeaModel {
    /**
     * <p>The name of the instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pxc-xxxxxx</p>
     */
    @NameInMap("DBInstanceName")
    public String DBInstanceName;

    /**
     * <p>The region where the backup sets reside. If you specify this parameter, backup sets in the specified region are returned. You can specify only one region at a time.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("DestCrossRegion")
    public String destCrossRegion;

    /**
     * <p>The end time. Specify a UNIX timestamp in milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1635707845000</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The page number. The value starts from 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the region where the instance resides.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The start time. Specify a UNIX timestamp in milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1635707845000</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    public static DescribeBackupSetListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeBackupSetListRequest self = new DescribeBackupSetListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeBackupSetListRequest setDBInstanceName(String DBInstanceName) {
        this.DBInstanceName = DBInstanceName;
        return this;
    }
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    public DescribeBackupSetListRequest setDestCrossRegion(String destCrossRegion) {
        this.destCrossRegion = destCrossRegion;
        return this;
    }
    public String getDestCrossRegion() {
        return this.destCrossRegion;
    }

    public DescribeBackupSetListRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public DescribeBackupSetListRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeBackupSetListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeBackupSetListRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeBackupSetListRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
