// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class GetPodEventsResponseBody extends TeaModel {
    // 事件列表
    @NameInMap("Events")
    public java.util.List<String> events;

    // 作业ID
    @NameInMap("JobId")
    public String jobId;

    // 运行示例ID
    @NameInMap("PodId")
    public String podId;

    // 请求ID
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

    public GetPodEventsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
