// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribeInstancePerformanceRequest extends TeaModel {
    @NameInMap("DbInstanceName")
    public String dbInstanceName;

    @NameInMap("NodeId")
    public String nodeId;

    @NameInMap("Keys")
    public String keys;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("EndTime")
    public String endTime;

    public static DescribeInstancePerformanceRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstancePerformanceRequest self = new DescribeInstancePerformanceRequest();
        return TeaModel.build(map, self);
    }

    public DescribeInstancePerformanceRequest setDbInstanceName(String dbInstanceName) {
        this.dbInstanceName = dbInstanceName;
        return this;
    }
    public String getDbInstanceName() {
        return this.dbInstanceName;
    }

    public DescribeInstancePerformanceRequest setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

    public DescribeInstancePerformanceRequest setKeys(String keys) {
        this.keys = keys;
        return this;
    }
    public String getKeys() {
        return this.keys;
    }

    public DescribeInstancePerformanceRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeInstancePerformanceRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

}
