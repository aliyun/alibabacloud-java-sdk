// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class StopApplicationResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public StopApplicationResponseBodyData data;

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

    public static StopApplicationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StopApplicationResponseBody self = new StopApplicationResponseBody();
        return TeaModel.build(map, self);
    }

    public StopApplicationResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public StopApplicationResponseBody setData(StopApplicationResponseBodyData data) {
        this.data = data;
        return this;
    }
    public StopApplicationResponseBodyData getData() {
        return this.data;
    }

    public StopApplicationResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public StopApplicationResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public StopApplicationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public StopApplicationResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public StopApplicationResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class StopApplicationResponseBodyData extends TeaModel {
        @NameInMap("ChangeOrderId")
        public String changeOrderId;

        public static StopApplicationResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            StopApplicationResponseBodyData self = new StopApplicationResponseBodyData();
            return TeaModel.build(map, self);
        }

        public StopApplicationResponseBodyData setChangeOrderId(String changeOrderId) {
            this.changeOrderId = changeOrderId;
            return this;
        }
        public String getChangeOrderId() {
            return this.changeOrderId;
        }

    }

}
