// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiflow20210202.models;

import com.aliyun.tea.*;

public class ListPipelineRunNodeLogsResponseBody extends TeaModel {
    @NameInMap("Logs")
    public java.util.List<String> logs;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListPipelineRunNodeLogsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPipelineRunNodeLogsResponseBody self = new ListPipelineRunNodeLogsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPipelineRunNodeLogsResponseBody setLogs(java.util.List<String> logs) {
        this.logs = logs;
        return this;
    }
    public java.util.List<String> getLogs() {
        return this.logs;
    }

    public ListPipelineRunNodeLogsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListPipelineRunNodeLogsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

}
