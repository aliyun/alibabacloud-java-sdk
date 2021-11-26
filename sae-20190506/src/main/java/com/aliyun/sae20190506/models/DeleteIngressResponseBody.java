// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DeleteIngressResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public DeleteIngressResponseBodyData data;

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

    public static DeleteIngressResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteIngressResponseBody self = new DeleteIngressResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteIngressResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DeleteIngressResponseBody setData(DeleteIngressResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DeleteIngressResponseBodyData getData() {
        return this.data;
    }

    public DeleteIngressResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public DeleteIngressResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteIngressResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteIngressResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DeleteIngressResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class DeleteIngressResponseBodyData extends TeaModel {
        @NameInMap("IngressId")
        public Long ingressId;

        public static DeleteIngressResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DeleteIngressResponseBodyData self = new DeleteIngressResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DeleteIngressResponseBodyData setIngressId(Long ingressId) {
            this.ingressId = ingressId;
            return this;
        }
        public Long getIngressId() {
            return this.ingressId;
        }

    }

}
