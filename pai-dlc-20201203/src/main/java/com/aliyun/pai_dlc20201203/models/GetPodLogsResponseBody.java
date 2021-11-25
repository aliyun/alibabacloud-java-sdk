// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class GetPodLogsResponseBody extends TeaModel {
    // 作业ID
    @NameInMap("JobId")
    public String jobId;

    // 日志列表
    @NameInMap("Logs")
    public java.util.List<String> logs;

    // 实例ID
    @NameInMap("PodId")
    public String podId;

    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

    public static GetPodLogsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPodLogsResponseBody self = new GetPodLogsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPodLogsResponseBody setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public GetPodLogsResponseBody setLogs(java.util.List<String> logs) {
        this.logs = logs;
        return this;
    }
    public java.util.List<String> getLogs() {
        return this.logs;
    }

    public GetPodLogsResponseBody setPodId(String podId) {
        this.podId = podId;
        return this;
    }
    public String getPodId() {
        return this.podId;
    }

    public GetPodLogsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
