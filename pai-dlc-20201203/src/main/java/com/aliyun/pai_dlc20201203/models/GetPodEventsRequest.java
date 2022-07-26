// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class GetPodEventsRequest extends TeaModel {
    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("MaxEventsNum")
    public Integer maxEventsNum;

    @NameInMap("PodUid")
    public String podUid;

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

    public GetPodEventsRequest setPodUid(String podUid) {
        this.podUid = podUid;
        return this;
    }
    public String getPodUid() {
        return this.podUid;
    }

    public GetPodEventsRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
