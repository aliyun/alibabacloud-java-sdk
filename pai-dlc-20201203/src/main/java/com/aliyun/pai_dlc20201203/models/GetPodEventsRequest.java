// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class GetPodEventsRequest extends TeaModel {
    /**
     * <p>The end time (UTC).</p>
     * 
     * <strong>example:</strong>
     * <p>2020-11-09T16:00:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The maximum number of events that can be returned.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("MaxEventsNum")
    public Integer maxEventsNum;

    /**
     * <p>The node UID. Call <a href="https://help.aliyun.com/document_detail/459677.html">GetJob</a> to get the node UID.</p>
     * 
     * <strong>example:</strong>
     * <p>dlc-20210126170216-*****-chief-0</p>
     */
    @NameInMap("PodUid")
    public String podUid;

    /**
     * <p>The start time (UTC).</p>
     * 
     * <strong>example:</strong>
     * <p>2020-11-08T16:00:00Z</p>
     */
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
