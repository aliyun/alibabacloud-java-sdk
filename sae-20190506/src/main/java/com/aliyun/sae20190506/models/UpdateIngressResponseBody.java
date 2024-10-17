// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class UpdateIngressResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code. Valid values:</p>
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
     * <p>The returned result.</p>
     */
    @NameInMap("Data")
    public UpdateIngressResponseBodyData data;

    /**
     * <p>The error code.</p>
     * <ul>
     * <li>If the request was successful, <strong>ErrorCode</strong> is not returned.</li>
     * <li>If the request failed, <strong>ErrorCode</strong> is returned. For more information, see the <strong>Error codes</strong> section of this topic.</li>
     * </ul>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The returned information.</p>
     * <ul>
     * <li>If the request was successful, <strong>success</strong> is returned.</li>
     * <li>If the request failed, an error code is returned.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>91F93257-7A4A-4BD3-9A7E-2F6EAE6D****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the configurations of the routing rule were updated. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The trace ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0a98a02315955564772843261e****</p>
     */
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
        /**
         * <p>The ID of the routing rule.</p>
         * 
         * <strong>example:</strong>
         * <p>87</p>
         */
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
