// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class UnbindSlbResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public UnbindSlbResponseBodyData data;

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

    public UnbindSlbResponseBody setData(UnbindSlbResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UnbindSlbResponseBodyData getData() {
        return this.data;
    }

    public UnbindSlbResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public UnbindSlbResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UnbindSlbResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
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

    public static class UnbindSlbResponseBodyData extends TeaModel {
        @NameInMap("ChangeOrderId")
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
