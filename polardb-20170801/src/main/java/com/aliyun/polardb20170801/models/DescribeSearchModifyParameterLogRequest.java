// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeSearchModifyParameterLogRequest extends TeaModel {
    /**
     * <p>The ID of the PolarDB for MySQL primary cluster. This ID is used to query the parameter modification history of the associated Search cluster. Before you call this operation, you must enable PolarSearch for the target cluster. You can add a search node on the Basic Information page of the cluster in the console. This operation is not applicable to clusters for which Search is not enabled.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-xxxxxxxx</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The end time of the query in UTC. Format: yyyy-MM-ddTHH:mmZ. Only records with a modification time earlier than this time are returned. The end time cannot be earlier than the start time.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-10-14T02:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The start time of the query in UTC. Format: yyyy-MM-ddTHH:mmZ. Only records with a modification time later than this time are returned.</p>
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
