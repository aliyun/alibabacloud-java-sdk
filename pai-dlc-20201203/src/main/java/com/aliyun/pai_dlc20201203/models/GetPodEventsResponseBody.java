// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class GetPodEventsResponseBody extends TeaModel {
    @NameInMap("Events")
    public java.util.List<String> events;

    @NameInMap("JobId")
    public String jobId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("PodId")
    public String podId;

    @NameInMap("PodUid")
    public String podUid;

    @NameInMap("RequestId")
    public String requestId;

    public static GetPodEventsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPodEventsResponseBody self = new GetPodEventsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPodEventsResponseBody setEvents(java.util.List<String> events) {
        this.events = events;
        return this;
    }
    public java.util.List<String> getEvents() {
        return this.events;
    }

    public GetPodEventsResponseBody setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public GetPodEventsResponseBody setPodId(String podId) {
        this.podId = podId;
        return this;
    }
    public String getPodId() {
        return this.podId;
    }

    public GetPodEventsResponseBody setPodUid(String podUid) {
        this.podUid = podUid;
        return this;
    }
    public String getPodUid() {
        return this.podUid;
    }

    public GetPodEventsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
