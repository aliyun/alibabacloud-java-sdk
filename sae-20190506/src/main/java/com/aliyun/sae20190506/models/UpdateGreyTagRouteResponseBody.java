// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class UpdateGreyTagRouteResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public UpdateGreyTagRouteResponseBodyData data;

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

    public static UpdateGreyTagRouteResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateGreyTagRouteResponseBody self = new UpdateGreyTagRouteResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateGreyTagRouteResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateGreyTagRouteResponseBody setData(UpdateGreyTagRouteResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UpdateGreyTagRouteResponseBodyData getData() {
        return this.data;
    }

    public UpdateGreyTagRouteResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public UpdateGreyTagRouteResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateGreyTagRouteResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateGreyTagRouteResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public UpdateGreyTagRouteResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class UpdateGreyTagRouteResponseBodyData extends TeaModel {
        @NameInMap("GreyTagRouteId")
        public Long greyTagRouteId;

        public static UpdateGreyTagRouteResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UpdateGreyTagRouteResponseBodyData self = new UpdateGreyTagRouteResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UpdateGreyTagRouteResponseBodyData setGreyTagRouteId(Long greyTagRouteId) {
            this.greyTagRouteId = greyTagRouteId;
            return this;
        }
        public Long getGreyTagRouteId() {
            return this.greyTagRouteId;
        }

    }

}
