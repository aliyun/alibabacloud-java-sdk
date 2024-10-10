// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DowngradeApplicationApmServiceResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public DowngradeApplicationApmServiceResponseBodyData data;

    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>01CF26C7-00A3-4AA6-BA76-7E95F2A3****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    /**
     * <strong>example:</strong>
     * <p>0a98a02315955564772843261e****</p>
     */
    @NameInMap("TraceId")
    public String traceId;

    public static DowngradeApplicationApmServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DowngradeApplicationApmServiceResponseBody self = new DowngradeApplicationApmServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public DowngradeApplicationApmServiceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DowngradeApplicationApmServiceResponseBody setData(DowngradeApplicationApmServiceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DowngradeApplicationApmServiceResponseBodyData getData() {
        return this.data;
    }

    public DowngradeApplicationApmServiceResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public DowngradeApplicationApmServiceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DowngradeApplicationApmServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DowngradeApplicationApmServiceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DowngradeApplicationApmServiceResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class DowngradeApplicationApmServiceResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Status")
        public Boolean status;

        public static DowngradeApplicationApmServiceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DowngradeApplicationApmServiceResponseBodyData self = new DowngradeApplicationApmServiceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DowngradeApplicationApmServiceResponseBodyData setStatus(Boolean status) {
            this.status = status;
            return this;
        }
        public Boolean getStatus() {
            return this.status;
        }

    }

}
