// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class ListTrainingJobLogsResponseBody extends TeaModel {
    @NameInMap("Logs")
    public java.util.List<String> logs;

    @NameInMap("RequestId")
    public String requestId;

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
