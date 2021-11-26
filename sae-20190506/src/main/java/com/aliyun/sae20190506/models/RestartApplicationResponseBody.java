// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class RestartApplicationResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public RestartApplicationResponseBodyData data;

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

    public static RestartApplicationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RestartApplicationResponseBody self = new RestartApplicationResponseBody();
        return TeaModel.build(map, self);
    }

    public RestartApplicationResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public RestartApplicationResponseBody setData(RestartApplicationResponseBodyData data) {
        this.data = data;
        return this;
    }
    public RestartApplicationResponseBodyData getData() {
        return this.data;
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

    public RestartApplicationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RestartApplicationResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public RestartApplicationResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class RestartApplicationResponseBodyData extends TeaModel {
        @NameInMap("ChangeOrderId")
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
