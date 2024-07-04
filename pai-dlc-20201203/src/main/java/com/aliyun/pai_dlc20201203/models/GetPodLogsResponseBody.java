// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class GetPodLogsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>dlc-20210126170216-******</p>
     */
    @NameInMap("JobId")
    public String jobId;

    @NameInMap("Logs")
    public java.util.List<String> logs;

    /**
     * <strong>example:</strong>
     * <p>dlc-20210126170216-****-chief-0</p>
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

    public GetPodLogsResponseBody setPodUid(String podUid) {
        this.podUid = podUid;
        return this;
    }
    public String getPodUid() {
        return this.podUid;
    }

    public GetPodLogsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
