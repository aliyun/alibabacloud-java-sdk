// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class GetPodEventsRequest extends TeaModel {
    // 截止时间
    @NameInMap("EndTime")
    public String endTime;

    // 返回的事件最大数量
    @NameInMap("MaxEventsNum")
    public Integer maxEventsNum;

    // 起始时间
    @NameInMap("StartTime")
    public String startTime;

    public static GetPodEventsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPodEventsRequest self = new GetPodEventsRequest();
        return TeaModel.build(map, self);
    }

    public GetPodEventsRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public GetPodEventsRequest setMaxEventsNum(Integer maxEventsNum) {
        this.maxEventsNum = maxEventsNum;
        return this;
    }
    public Integer getMaxEventsNum() {
        return this.maxEventsNum;
    }

    public GetPodEventsRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
