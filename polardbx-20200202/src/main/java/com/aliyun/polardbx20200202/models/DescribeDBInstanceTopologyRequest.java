// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribeDBInstanceTopologyRequest extends TeaModel {
    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pxc-********</p>
     */
    @NameInMap("DBInstanceName")
    public String DBInstanceName;

    /**
     * <p>The end time of the time range for querying historical instances in the topology. Format: yyyy-MM-dd HH:mm:ss.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-10-22T10:30:45Z 04:00:00</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>Specifies whether to query the historical topology.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("MinuteSimple")
    public Boolean minuteSimple;

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
     * <p>The start time of the time range for querying historical instances in the topology. Format: yyyy-MM-dd HH:mm:ss.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-10-21T10:30:45Z 04:00:00</p>
     */
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
