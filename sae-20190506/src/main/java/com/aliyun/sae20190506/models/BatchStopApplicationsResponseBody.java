// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class BatchStopApplicationsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public BatchStopApplicationsResponseBodyData data;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TraceId")
    public String traceId;

    public static BatchStopApplicationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchStopApplicationsResponseBody self = new BatchStopApplicationsResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchStopApplicationsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public BatchStopApplicationsResponseBody setData(BatchStopApplicationsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public BatchStopApplicationsResponseBodyData getData() {
        return this.data;
    }

    public BatchStopApplicationsResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public BatchStopApplicationsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public BatchStopApplicationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BatchStopApplicationsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public BatchStopApplicationsResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class BatchStopApplicationsResponseBodyData extends TeaModel {
        @NameInMap("ChangeOrderId")
        public String changeOrderId;

        public static BatchStopApplicationsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            BatchStopApplicationsResponseBodyData self = new BatchStopApplicationsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public BatchStopApplicationsResponseBodyData setChangeOrderId(String changeOrderId) {
            this.changeOrderId = changeOrderId;
            return this;
        }
        public String getChangeOrderId() {
            return this.changeOrderId;
        }

    }

}
