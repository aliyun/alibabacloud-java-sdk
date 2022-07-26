// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class GetJobMetricsResponseBody extends TeaModel {
    @NameInMap("JobId")
    public String jobId;

    @NameInMap("PodMetrics")
    public java.util.List<PodMetric> podMetrics;

    @NameInMap("RequestId")
    public String requestId;

    public static GetJobMetricsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetJobMetricsResponseBody self = new GetJobMetricsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetJobMetricsResponseBody setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public GetJobMetricsResponseBody setPodMetrics(java.util.List<PodMetric> podMetrics) {
        this.podMetrics = podMetrics;
        return this;
    }
    public java.util.List<PodMetric> getPodMetrics() {
        return this.podMetrics;
    }

    public GetJobMetricsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
