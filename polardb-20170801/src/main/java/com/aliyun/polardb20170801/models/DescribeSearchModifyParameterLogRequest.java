// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeSearchModifyParameterLogRequest extends TeaModel {
    /**
     * <p>The ID of the PolarDB primary cluster. This ID is used to query the parameter modification history of the Search cluster associated with the current account.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-xxxxxxxx</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The end time of the query. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mmZ format. The time must be in UTC. Only records modified before this time are returned. The end time cannot be earlier than the start time.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-10-14T02:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The start time of the query. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mmZ format. The time must be in UTC. Only records modified after this time are returned.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-10-14T01:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeSearchModifyParameterLogRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSearchModifyParameterLogRequest self = new DescribeSearchModifyParameterLogRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSearchModifyParameterLogRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DescribeSearchModifyParameterLogRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeSearchModifyParameterLogRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
