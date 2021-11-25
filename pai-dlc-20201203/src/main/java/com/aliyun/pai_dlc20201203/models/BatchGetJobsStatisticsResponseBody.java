// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class BatchGetJobsStatisticsResponseBody extends TeaModel {
    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

    // 每一个工作空间id下面的Job按照状态的分类统计信息
    @NameInMap("Statistics")
    public java.util.Map<String, ?> statistics;

    public static BatchGetJobsStatisticsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchGetJobsStatisticsResponseBody self = new BatchGetJobsStatisticsResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchGetJobsStatisticsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BatchGetJobsStatisticsResponseBody setStatistics(java.util.Map<String, ?> statistics) {
        this.statistics = statistics;
        return this;
    }
    public java.util.Map<String, ?> getStatistics() {
        return this.statistics;
    }

}
