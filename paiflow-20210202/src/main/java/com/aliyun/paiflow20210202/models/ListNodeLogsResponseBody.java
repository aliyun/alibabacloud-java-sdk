// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiflow20210202.models;

import com.aliyun.tea.*;

public class ListNodeLogsResponseBody extends TeaModel {
    // 请求 ID
    @NameInMap("RequestId")
    public String requestId;

    // 符合过滤条件的作业数量
    @NameInMap("TotalCount")
    public Long totalCount;

    // 日志列表
    @NameInMap("Logs")
    public java.util.List<String> logs;

    public static ListNodeLogsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListNodeLogsResponseBody self = new ListNodeLogsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListNodeLogsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListNodeLogsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public ListNodeLogsResponseBody setLogs(java.util.List<String> logs) {
        this.logs = logs;
        return this;
    }
    public java.util.List<String> getLogs() {
        return this.logs;
    }

}
