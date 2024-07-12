// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paifeaturestore20230621.models;

import com.aliyun.tea.*;

public class ListTaskLogsResponseBody extends TeaModel {
    @NameInMap("Logs")
    public java.util.List<String> logs;

    /**
     * <strong>example:</strong>
     * <p>72F15A8A-5A28-5B18-A0DE-0EABD7D3245A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListTaskLogsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTaskLogsResponseBody self = new ListTaskLogsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTaskLogsResponseBody setLogs(java.util.List<String> logs) {
        this.logs = logs;
        return this;
    }
    public java.util.List<String> getLogs() {
        return this.logs;
    }

    public ListTaskLogsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTaskLogsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

}
