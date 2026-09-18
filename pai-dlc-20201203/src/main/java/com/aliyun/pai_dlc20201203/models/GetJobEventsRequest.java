// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class GetJobEventsRequest extends TeaModel {
    /**
     * <p>The end time (UTC) of the event query interval. Default value: current time.</p>
     * 
     * <strong>example:</strong>
     * <p>2020-11-08T18:00:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The maximum number of events to retrieve. Default value: 2000.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("MaxEventsNum")
    public Integer maxEventsNum;

    /**
     * <p>The start time (UTC) of the event query interval. Default value: 7 days ago.</p>
     * 
     * <strong>example:</strong>
     * <p>2020-11-08T16:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static GetJobEventsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetJobEventsRequest self = new GetJobEventsRequest();
        return TeaModel.build(map, self);
    }

    public GetJobEventsRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public GetJobEventsRequest setMaxEventsNum(Integer maxEventsNum) {
        this.maxEventsNum = maxEventsNum;
        return this;
    }
    public Integer getMaxEventsNum() {
        return this.maxEventsNum;
    }

    public GetJobEventsRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
