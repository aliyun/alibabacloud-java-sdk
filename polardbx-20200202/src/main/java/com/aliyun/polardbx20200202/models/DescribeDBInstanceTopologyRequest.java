// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribeDBInstanceTopologyRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pxc-********</p>
     */
    @NameInMap("DBInstanceName")
    public String DBInstanceName;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("MinuteSimple")
    public Boolean minuteSimple;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("StartTime")
    public String startTime;

    public static DescribeDBInstanceTopologyRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstanceTopologyRequest self = new DescribeDBInstanceTopologyRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstanceTopologyRequest setDBInstanceName(String DBInstanceName) {
        this.DBInstanceName = DBInstanceName;
        return this;
    }
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    public DescribeDBInstanceTopologyRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeDBInstanceTopologyRequest setMinuteSimple(Boolean minuteSimple) {
        this.minuteSimple = minuteSimple;
        return this;
    }
    public Boolean getMinuteSimple() {
        return this.minuteSimple;
    }

    public DescribeDBInstanceTopologyRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeDBInstanceTopologyRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
