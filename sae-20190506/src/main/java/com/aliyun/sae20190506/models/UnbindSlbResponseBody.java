// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class UnbindSlbResponseBody extends TeaModel {
    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("ErrorCode")
    @Validation(required = true)
    public String errorCode;

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
    public UnbindSlbResponseBodyData data;

    public static UnbindSlbResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UnbindSlbResponseBody self = new UnbindSlbResponseBody();
        return TeaModel.build(map, self);
    }

    public UnbindSlbResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UnbindSlbResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UnbindSlbResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public UnbindSlbResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public UnbindSlbResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public UnbindSlbResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UnbindSlbResponseBody setData(UnbindSlbResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UnbindSlbResponseBodyData getData() {
        return this.data;
    }

    public static class UnbindSlbResponseBodyData extends TeaModel {
        @NameInMap("ChangeOrderId")
        @Validation(required = true)
        public String changeOrderId;

        public static UnbindSlbResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UnbindSlbResponseBodyData self = new UnbindSlbResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UnbindSlbResponseBodyData setChangeOrderId(String changeOrderId) {
            this.changeOrderId = changeOrderId;
            return this;
        }
        public String getChangeOrderId() {
            return this.changeOrderId;
        }

    }

}
