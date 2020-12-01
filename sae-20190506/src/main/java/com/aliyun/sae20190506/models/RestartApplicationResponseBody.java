// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class RestartApplicationResponseBody extends TeaModel {
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
    public RestartApplicationResponseBodyData data;

    public static RestartApplicationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RestartApplicationResponseBody self = new RestartApplicationResponseBody();
        return TeaModel.build(map, self);
    }

    public RestartApplicationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RestartApplicationResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public RestartApplicationResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public RestartApplicationResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public RestartApplicationResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public RestartApplicationResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public RestartApplicationResponseBody setData(RestartApplicationResponseBodyData data) {
        this.data = data;
        return this;
    }
    public RestartApplicationResponseBodyData getData() {
        return this.data;
    }

    public static class RestartApplicationResponseBodyData extends TeaModel {
        @NameInMap("ChangeOrderId")
        @Validation(required = true)
        public String changeOrderId;

        public static RestartApplicationResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            RestartApplicationResponseBodyData self = new RestartApplicationResponseBodyData();
            return TeaModel.build(map, self);
        }

        public RestartApplicationResponseBodyData setChangeOrderId(String changeOrderId) {
            this.changeOrderId = changeOrderId;
            return this;
        }
        public String getChangeOrderId() {
            return this.changeOrderId;
        }

    }

}
