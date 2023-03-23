// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class GetJobEventsResponseBody extends TeaModel {
    @NameInMap("Events")
    public java.util.List<String> events;

    @NameInMap("JobId")
    public String jobId;

    @NameInMap("RequestId")
    public String requestId;

    public static GetJobEventsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetJobEventsResponseBody self = new GetJobEventsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetJobEventsResponseBody setEvents(java.util.List<String> events) {
        this.events = events;
        return this;
    }
    public java.util.List<String> getEvents() {
        return this.events;
    }

    public GetJobEventsResponseBody setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public GetJobEventsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
