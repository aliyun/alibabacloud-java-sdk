// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class RestartInstancesResponseBody extends TeaModel {
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
    public RestartInstancesResponseBodyData data;

    public static RestartInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RestartInstancesResponseBody self = new RestartInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public RestartInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RestartInstancesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public RestartInstancesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public RestartInstancesResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public RestartInstancesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public RestartInstancesResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public RestartInstancesResponseBody setData(RestartInstancesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public RestartInstancesResponseBodyData getData() {
        return this.data;
    }

    public static class RestartInstancesResponseBodyData extends TeaModel {
        @NameInMap("ChangeOrderId")
        @Validation(required = true)
        public String changeOrderId;

        public static RestartInstancesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            RestartInstancesResponseBodyData self = new RestartInstancesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public RestartInstancesResponseBodyData setChangeOrderId(String changeOrderId) {
            this.changeOrderId = changeOrderId;
            return this;
        }
        public String getChangeOrderId() {
            return this.changeOrderId;
        }

    }

}
