// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class UpgradeApplicationApmServiceResponseBody extends TeaModel {
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
     * <p>The returned result.</p>
     */
    @NameInMap("Data")
    public UpgradeApplicationApmServiceResponseBodyData data;

    /**
     * <p>The status code. Value values:</p>
     * <ul>
     * <li>If the request was successful, <strong>ErrorCode</strong> is not returned.</li>
     * <li>If the request failed, <strong>ErrorCode</strong> is returned. For more information, see <strong>Error codes</strong> in this topic.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The message returned. The following limits are imposed on the ID:</p>
     * <ul>
     * <li>If the request was successful, <strong>success</strong> is returned.</li>
     * <li>An error code is returned when a request failed.</li>
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
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The ID of the trace. The ID is used to query the details of a request.</p>
     * 
     * <strong>example:</strong>
     * <p>0a98a02315955564772843261e****</p>
     */
    @NameInMap("TraceId")
    public String traceId;

    public static UpgradeApplicationApmServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpgradeApplicationApmServiceResponseBody self = new UpgradeApplicationApmServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public UpgradeApplicationApmServiceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpgradeApplicationApmServiceResponseBody setData(UpgradeApplicationApmServiceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UpgradeApplicationApmServiceResponseBodyData getData() {
        return this.data;
    }

    public UpgradeApplicationApmServiceResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public UpgradeApplicationApmServiceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpgradeApplicationApmServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpgradeApplicationApmServiceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public UpgradeApplicationApmServiceResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class UpgradeApplicationApmServiceResponseBodyData extends TeaModel {
        /**
         * <p>Indicates whether ARMS advanced monitoring is enabled. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Status")
        public Boolean status;

        public static UpgradeApplicationApmServiceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UpgradeApplicationApmServiceResponseBodyData self = new UpgradeApplicationApmServiceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UpgradeApplicationApmServiceResponseBodyData setStatus(Boolean status) {
            this.status = status;
            return this;
        }
        public Boolean getStatus() {
            return this.status;
        }

    }

}
