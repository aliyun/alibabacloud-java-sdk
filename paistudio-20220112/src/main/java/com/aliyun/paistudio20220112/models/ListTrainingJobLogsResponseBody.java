// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class ListTrainingJobLogsResponseBody extends TeaModel {
    // 日志列表
    @NameInMap("Logs")
    public java.util.List<String> logs;

    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

    // 符合过滤条件的日志数量
    @NameInMap("TotalCount")
    public String totalCount;

    public static ListTrainingJobLogsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTrainingJobLogsResponseBody self = new ListTrainingJobLogsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTrainingJobLogsResponseBody setLogs(java.util.List<String> logs) {
        this.logs = logs;
        return this;
    }
    public java.util.List<String> getLogs() {
        return this.logs;
    }

    public ListTrainingJobLogsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTrainingJobLogsResponseBody setTotalCount(String totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public String getTotalCount() {
        return this.totalCount;
    }

}
