// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class RescaleApplicationVerticallyResponseBody extends TeaModel {
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
    public RescaleApplicationVerticallyResponseBodyData data;

    public static RescaleApplicationVerticallyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RescaleApplicationVerticallyResponseBody self = new RescaleApplicationVerticallyResponseBody();
        return TeaModel.build(map, self);
    }

    public RescaleApplicationVerticallyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RescaleApplicationVerticallyResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public RescaleApplicationVerticallyResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public RescaleApplicationVerticallyResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public RescaleApplicationVerticallyResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public RescaleApplicationVerticallyResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public RescaleApplicationVerticallyResponseBody setData(RescaleApplicationVerticallyResponseBodyData data) {
        this.data = data;
        return this;
    }
    public RescaleApplicationVerticallyResponseBodyData getData() {
        return this.data;
    }

    public static class RescaleApplicationVerticallyResponseBodyData extends TeaModel {
        @NameInMap("ChangeOrderId")
        @Validation(required = true)
        public String changeOrderId;

        public static RescaleApplicationVerticallyResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            RescaleApplicationVerticallyResponseBodyData self = new RescaleApplicationVerticallyResponseBodyData();
            return TeaModel.build(map, self);
        }

        public RescaleApplicationVerticallyResponseBodyData setChangeOrderId(String changeOrderId) {
            this.changeOrderId = changeOrderId;
            return this;
        }
        public String getChangeOrderId() {
            return this.changeOrderId;
        }

    }

}
