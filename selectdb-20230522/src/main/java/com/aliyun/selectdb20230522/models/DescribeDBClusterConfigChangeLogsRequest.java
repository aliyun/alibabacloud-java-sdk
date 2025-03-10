// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.selectdb20230522.models;

import com.aliyun.tea.*;

public class DescribeDBClusterConfigChangeLogsRequest extends TeaModel {
    /**
     * <p>The configuration file that you want to modify. For a compute cluster, set the value to be.conf. For a frontend (FE) cluster, set the value to fe.conf.</p>
     * 
     * <strong>example:</strong>
     * <p>be.conf</p>
     */
    @NameInMap("ConfigKey")
    public String configKey;

    /**
     * <p>The cluster ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>selectdb-cn-7213c8yvv09-be</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>selectdb-cn-jia3ma3b003</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The end of the time range to query. Format: yyyy-MM-dd HH:mm:ss.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-05-08T15:59:59Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The beginning of the time range to query. Format: yyyy-MM-dd HH:mm:ss.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-04-25T09:48:23Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeDBClusterConfigChangeLogsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBClusterConfigChangeLogsRequest self = new DescribeDBClusterConfigChangeLogsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDBClusterConfigChangeLogsRequest setConfigKey(String configKey) {
        this.configKey = configKey;
        return this;
    }
    public String getConfigKey() {
        return this.configKey;
    }

    public DescribeDBClusterConfigChangeLogsRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DescribeDBClusterConfigChangeLogsRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public DescribeDBClusterConfigChangeLogsRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeDBClusterConfigChangeLogsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeDBClusterConfigChangeLogsRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
