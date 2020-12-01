// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class CreateIngressResponseBody extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("ErrorCode")
    @Validation(required = true)
    public String errorCode;

    @NameInMap("TraceId")
    @Validation(required = true)
    public String traceId;

    @NameInMap("Data")
    @Validation(required = true)
    public CreateIngressResponseBodyData data;

    public static CreateIngressResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateIngressResponseBody self = new CreateIngressResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateIngressResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateIngressResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateIngressResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateIngressResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public CreateIngressResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public CreateIngressResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public CreateIngressResponseBody setData(CreateIngressResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateIngressResponseBodyData getData() {
        return this.data;
    }

    public static class CreateIngressResponseBodyData extends TeaModel {
        @NameInMap("IngressId")
        @Validation(required = true)
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
