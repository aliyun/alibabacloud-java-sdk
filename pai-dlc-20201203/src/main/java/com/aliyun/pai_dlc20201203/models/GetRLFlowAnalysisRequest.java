// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class GetRLFlowAnalysisRequest extends TeaModel {
    /**
     * <p>The end time of the query window in UTC RFC3339 format. Default value: now.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-08-07T00:00:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The start time of the query window in UTC RFC3339 format. Default value: EndTime-7d.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-08-04T00:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static GetRLFlowAnalysisRequest build(java.util.Map<String, ?> map) throws Exception {
        GetRLFlowAnalysisRequest self = new GetRLFlowAnalysisRequest();
        return TeaModel.build(map, self);
    }

    public GetRLFlowAnalysisRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public GetRLFlowAnalysisRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
