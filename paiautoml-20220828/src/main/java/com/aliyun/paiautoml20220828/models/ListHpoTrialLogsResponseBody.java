// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiautoml20220828.models;

import com.aliyun.tea.*;

public class ListHpoTrialLogsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Detail")
    public java.util.Map<String, ?> detail;

    @NameInMap("Logs")
    public java.util.List<String> logs;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListHpoTrialLogsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListHpoTrialLogsResponseBody self = new ListHpoTrialLogsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListHpoTrialLogsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListHpoTrialLogsResponseBody setDetail(java.util.Map<String, ?> detail) {
        this.detail = detail;
        return this;
    }
    public java.util.Map<String, ?> getDetail() {
        return this.detail;
    }

    public ListHpoTrialLogsResponseBody setLogs(java.util.List<String> logs) {
        this.logs = logs;
        return this;
    }
    public java.util.List<String> getLogs() {
        return this.logs;
    }

    public ListHpoTrialLogsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListHpoTrialLogsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListHpoTrialLogsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

}
