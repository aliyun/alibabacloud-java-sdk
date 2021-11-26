// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class UpdateIngressResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public UpdateIngressResponseBodyData data;

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

    public static UpdateIngressResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateIngressResponseBody self = new UpdateIngressResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateIngressResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateIngressResponseBody setData(UpdateIngressResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UpdateIngressResponseBodyData getData() {
        return this.data;
    }

    public UpdateIngressResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public UpdateIngressResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateIngressResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateIngressResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public UpdateIngressResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class UpdateIngressResponseBodyData extends TeaModel {
        @NameInMap("IngressId")
        public Long ingressId;

        public static UpdateIngressResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UpdateIngressResponseBodyData self = new UpdateIngressResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UpdateIngressResponseBodyData setIngressId(Long ingressId) {
            this.ingressId = ingressId;
            return this;
        }
        public Long getIngressId() {
            return this.ingressId;
        }

    }

}
