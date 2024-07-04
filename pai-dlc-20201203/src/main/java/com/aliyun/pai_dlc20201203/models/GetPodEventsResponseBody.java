// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class GetPodEventsResponseBody extends TeaModel {
    @NameInMap("Events")
    public java.util.List<String> events;

    /**
     * <strong>example:</strong>
     * <p>dlc-20210126170216-*****</p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dlc-20210126170216-*****-chief-0</p>
     */
    @NameInMap("PodId")
    public String podId;

    /**
     * <strong>example:</strong>
     * <p>94a7cc7c-0033-48b5-85bd-71c63592c268</p>
     */
    @NameInMap("PodUid")
    public String podUid;

    /**
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
     */
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
