// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class UpdateIngressResponseBody extends TeaModel {
    /**
     * <p>API status or POP error code. Details are as follows:</p>
     * <ul>
     * <li><p><strong>2xx</strong>: Success.</p>
     * </li>
     * <li><p><strong>3xx</strong>: Redirection.</p>
     * </li>
     * <li><p><strong>4xx</strong>: Request error.</p>
     * </li>
     * <li><p><strong>5xx</strong>: Server error.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Returned result.</p>
     */
    @NameInMap("Data")
    public UpdateIngressResponseBodyData data;

    /**
     * <p>Error code. Details are as follows:</p>
     * <ul>
     * <li><p>If the request is successful, the <strong>ErrorCode</strong> field is not returned.</p>
     * </li>
     * <li><p>If the request failed, the <strong>ErrorCode</strong> field is returned. For more information, see the <strong>Error Codes</strong> list in this topic.</p>
     * </li>
     * </ul>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>Additional information. Details are as follows:</p>
     * <ul>
     * <li><p>If the request is normal, <strong>success</strong> is returned.</p>
     * </li>
     * <li><p>If the request is abnormal, a specific abnormal error code is returned.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>91F93257-7A4A-4BD3-9A7E-2F6EAE6D****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the Ingress instance configuration was successfully updated. Details are as follows:</p>
     * <ul>
     * <li><p><strong>true</strong>: The update was successful.</p>
     * </li>
     * <li><p><strong>false</strong>: The update failed.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>Call chain ID.</p>
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
         * <p>Routing rule ID.</p>
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
