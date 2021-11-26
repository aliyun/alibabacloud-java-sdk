// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DeleteGreyTagRouteResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public DeleteGreyTagRouteResponseBodyData data;

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

    public static DeleteGreyTagRouteResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteGreyTagRouteResponseBody self = new DeleteGreyTagRouteResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteGreyTagRouteResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DeleteGreyTagRouteResponseBody setData(DeleteGreyTagRouteResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DeleteGreyTagRouteResponseBodyData getData() {
        return this.data;
    }

    public DeleteGreyTagRouteResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public DeleteGreyTagRouteResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteGreyTagRouteResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteGreyTagRouteResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DeleteGreyTagRouteResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class DeleteGreyTagRouteResponseBodyData extends TeaModel {
        @NameInMap("GreyTagRouteId")
        public Long greyTagRouteId;

        public static DeleteGreyTagRouteResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DeleteGreyTagRouteResponseBodyData self = new DeleteGreyTagRouteResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DeleteGreyTagRouteResponseBodyData setGreyTagRouteId(Long greyTagRouteId) {
            this.greyTagRouteId = greyTagRouteId;
            return this;
        }
        public Long getGreyTagRouteId() {
            return this.greyTagRouteId;
        }

    }

}
