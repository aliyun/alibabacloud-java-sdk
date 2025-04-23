// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paillmtrace20240311.models;

import com.aliyun.tea.*;

public class ListTracesDatasResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>ExecutionFailure</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>failed to get trace data</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>POP request id</p>
     * 
     * <strong>example:</strong>
     * <p>6A87228C-969A-1381-98CF-AE07AE630FA5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>22</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("Traces")
    public java.util.List<?> traces;

    public static ListTracesDatasResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTracesDatasResponseBody self = new ListTracesDatasResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTracesDatasResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListTracesDatasResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListTracesDatasResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTracesDatasResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListTracesDatasResponseBody setTraces(java.util.List<?> traces) {
        this.traces = traces;
        return this;
    }
    public java.util.List<?> getTraces() {
        return this.traces;
    }

}
