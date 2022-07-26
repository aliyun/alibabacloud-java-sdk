// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class GetJobEventsRequest extends TeaModel {
    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("MaxEventsNum")
    public Integer maxEventsNum;

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
