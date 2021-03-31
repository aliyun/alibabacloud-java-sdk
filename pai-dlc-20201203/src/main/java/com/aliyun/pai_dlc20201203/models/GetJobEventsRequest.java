// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class GetJobEventsRequest extends TeaModel {
    // 获取事件的最大数目，默认值：2000
    @NameInMap("MaxEventsNum")
    public Integer maxEventsNum;

    // 查询事件的时间区间的起始时间，默认值是7天前。
    @NameInMap("StartTime")
    public String startTime;

    // 查询事件的时间区间的截止时间，默认值是当前。
    @NameInMap("EndTime")
    public String endTime;

    public static GetJobEventsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetJobEventsRequest self = new GetJobEventsRequest();
        return TeaModel.build(map, self);
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

    public GetJobEventsRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

}
