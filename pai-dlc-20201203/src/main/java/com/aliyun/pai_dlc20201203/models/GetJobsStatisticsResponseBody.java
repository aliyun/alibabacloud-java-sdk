// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class GetJobsStatisticsResponseBody extends TeaModel {
    // 当前的Workspace ID下面的JOB统计数据
    @NameInMap("Statistics")
    public java.util.Map<String, ?> statistics;

    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

    public static GetJobsStatisticsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetJobsStatisticsResponseBody self = new GetJobsStatisticsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetJobsStatisticsResponseBody setStatistics(java.util.Map<String, ?> statistics) {
        this.statistics = statistics;
        return this;
    }
    public java.util.Map<String, ?> getStatistics() {
        return this.statistics;
    }

    public GetJobsStatisticsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
