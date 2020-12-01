// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class AbortChangeOrderResponseBody extends TeaModel {
    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("ErrorCode")
    @Validation(required = true)
    public String errorCode;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("TraceId")
    @Validation(required = true)
    public String traceId;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public AbortChangeOrderResponseBodyData data;

    public static AbortChangeOrderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AbortChangeOrderResponseBody self = new AbortChangeOrderResponseBody();
        return TeaModel.build(map, self);
    }

    public AbortChangeOrderResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public AbortChangeOrderResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public AbortChangeOrderResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AbortChangeOrderResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public AbortChangeOrderResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public AbortChangeOrderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AbortChangeOrderResponseBody setData(AbortChangeOrderResponseBodyData data) {
        this.data = data;
        return this;
    }
    public AbortChangeOrderResponseBodyData getData() {
        return this.data;
    }

    public static class AbortChangeOrderResponseBodyData extends TeaModel {
        @NameInMap("ChangeOrderId")
        @Validation(required = true)
        public String changeOrderId;

        public static AbortChangeOrderResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            AbortChangeOrderResponseBodyData self = new AbortChangeOrderResponseBodyData();
            return TeaModel.build(map, self);
        }

        public AbortChangeOrderResponseBodyData setChangeOrderId(String changeOrderId) {
            this.changeOrderId = changeOrderId;
            return this;
        }
        public String getChangeOrderId() {
            return this.changeOrderId;
        }

    }

}
