// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class CreateIngressResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code or the error code. Valid values:</p>
     * <ul>
     * <li><strong>2xx</strong>: The request was successful.</li>
     * <li><strong>3xx</strong>: The request was redirected.</li>
     * <li><strong>4xx</strong>: The request failed.</li>
     * <li><strong>5xx</strong>: A server error occurred.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Responses.</p>
     */
    @NameInMap("Data")
    public CreateIngressResponseBodyData data;

    /**
     * <p>Error code. Valid values:</p>
     * <ul>
     * <li>If the request is successful, no <strong>ErrorCode</strong> fields are returned.</li>
     * <li>Request failed: <strong>ErrorCode</strong> fields are returned. For more information, see <strong>Error codes</strong>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>Additional information. Valid values:</p>
     * <ul>
     * <li>The error message returned because the request is normal and <strong>success</strong> is returned.</li>
     * <li>If the request is abnormal, the specific exception error code is returned.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>91F93257-7A4A-4BD3-9A7E-2F6EAE6D****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the routing rule was created. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The ConfigMap was created.</li>
     * <li><strong>false</strong>: The ConfigMap failed to be created.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The ID of the trace. This parameter is used to query the exact call information.</p>
     * 
     * <strong>example:</strong>
     * <p>0a98a02315955564772843261e****</p>
     */
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
        /**
         * <p>The ID of the routing rule.</p>
         * 
         * <strong>example:</strong>
         * <p>87</p>
         */
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
