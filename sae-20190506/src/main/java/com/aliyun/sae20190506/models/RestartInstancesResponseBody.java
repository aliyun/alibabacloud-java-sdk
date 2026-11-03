// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class RestartInstancesResponseBody extends TeaModel {
    /**
     * <p>The API status code or POP error code. Valid values:</p>
     * <ul>
     * <li><strong>2xx</strong>: Success.</li>
     * <li><strong>3xx</strong>: Redirection.</li>
     * <li><strong>4xx</strong>: Request error.</li>
     * <li><strong>5xx</strong>: Server error.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The application information.</p>
     */
    @NameInMap("Data")
    public RestartInstancesResponseBodyData data;

    /**
     * <p>The error code. Valid values:</p>
     * <ul>
     * <li>Not returned: The request is successful.</li>
     * <li>Specific error code: The request fails. For more information, see the <strong>Error codes</strong> section in this topic.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>InvalidApplication.NotFound</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The additional information. Valid values:</p>
     * <ul>
     * <li><strong>success</strong>: The request is successful.</li>
     * <li>Specific error code: An exception occurred during the request.</li>
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
     * <p>Specifies whether the application instances were restarted successfully. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The restart was successful.</li>
     * <li><strong>false</strong>: The restart failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The trace ID used to precisely query call information.</p>
     * 
     * <strong>example:</strong>
     * <p>0a98a02315955564772843261e****</p>
     */
    @NameInMap("TraceId")
    public String traceId;

    public static RestartInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RestartInstancesResponseBody self = new RestartInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public RestartInstancesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public RestartInstancesResponseBody setData(RestartInstancesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public RestartInstancesResponseBodyData getData() {
        return this.data;
    }

    public RestartInstancesResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public RestartInstancesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public RestartInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RestartInstancesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public RestartInstancesResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class RestartInstancesResponseBodyData extends TeaModel {
        /**
         * <p>The change order ID.</p>
         * 
         * <strong>example:</strong>
         * <p>5afa5b98-0c64-4637-983f-15eaa888****</p>
         */
        @NameInMap("ChangeOrderId")
        public String changeOrderId;

        public static RestartInstancesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            RestartInstancesResponseBodyData self = new RestartInstancesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public RestartInstancesResponseBodyData setChangeOrderId(String changeOrderId) {
            this.changeOrderId = changeOrderId;
            return this;
        }
        public String getChangeOrderId() {
            return this.changeOrderId;
        }

    }

}
