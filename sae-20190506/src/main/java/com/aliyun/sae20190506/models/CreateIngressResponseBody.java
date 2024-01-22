// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class CreateIngressResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public CreateIngressResponseBodyData data;

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

    public static CreateIngressResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateIngressResponseBody self = new CreateIngressResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateIngressResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateIngressResponseBody setData(CreateIngressResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateIngressResponseBodyData getData() {
        return this.data;
    }

    public CreateIngressResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public CreateIngressResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateIngressResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateIngressResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public CreateIngressResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class CreateIngressResponseBodyData extends TeaModel {
        @NameInMap("IngressId")
        public Long ingressId;

        public static CreateIngressResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateIngressResponseBodyData self = new CreateIngressResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateIngressResponseBodyData setIngressId(Long ingressId) {
            this.ingressId = ingressId;
            return this;
        }
        public Long getIngressId() {
            return this.ingressId;
        }

    }

}
