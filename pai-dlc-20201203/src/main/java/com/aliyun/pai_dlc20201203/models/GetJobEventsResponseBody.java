// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class GetJobEventsResponseBody extends TeaModel {
    // 作业ID
    @NameInMap("JobId")
    public String jobId;

    // 事件
    @NameInMap("Events")
    public java.util.List<String> events;

    // 请求ID
    @NameInMap("RequestId")
    public Integer requestId;

    public static GetJobEventsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetJobEventsResponseBody self = new GetJobEventsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetJobEventsResponseBody setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public GetJobEventsResponseBody setEvents(java.util.List<String> events) {
        this.events = events;
        return this;
    }
    public java.util.List<String> getEvents() {
        return this.events;
    }

    public GetJobEventsResponseBody setRequestId(Integer requestId) {
        this.requestId = requestId;
        return this;
    }
    public Integer getRequestId() {
        return this.requestId;
    }

}
