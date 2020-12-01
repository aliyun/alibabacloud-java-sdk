// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class StopApplicationResponseBody extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("ErrorCode")
    @Validation(required = true)
    public String errorCode;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("TraceId")
    @Validation(required = true)
    public String traceId;

    @NameInMap("Data")
    @Validation(required = true)
    public StopApplicationResponseBodyData data;

    public static StopApplicationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StopApplicationResponseBody self = new StopApplicationResponseBody();
        return TeaModel.build(map, self);
    }

    public StopApplicationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public StopApplicationResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public StopApplicationResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
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

    public StopApplicationResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public StopApplicationResponseBody setData(StopApplicationResponseBodyData data) {
        this.data = data;
        return this;
    }
    public StopApplicationResponseBodyData getData() {
        return this.data;
    }

    public static class StopApplicationResponseBodyData extends TeaModel {
        @NameInMap("ChangeOrderId")
        @Validation(required = true)
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
