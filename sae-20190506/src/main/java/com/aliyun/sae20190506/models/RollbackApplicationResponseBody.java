// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class RollbackApplicationResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code. Take note of the following rules:</p>
     * <br>
     * <p>*   **2xx**: The call was successful.</p>
     * <p>*   **3xx**: The call was redirected.</p>
     * <p>*   **4xx**: The call failed.</p>
     * <p>*   **5xx**: A server error occurred.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The response.</p>
     */
    @NameInMap("Data")
    public RollbackApplicationResponseBodyData data;

    /**
     * <p>The error code returned if the request failed. Take note of the following rules:</p>
     * <br>
     * <p>*   The **ErrorCode** parameter is not returned if the request succeeds.</p>
     * <p>*   If the call fails, the **ErrorCode** parameter is returned. For more information, see the "**Error codes**" section of this topic.</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The message returned for the operation.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the application is successfully rolled back. Take note of the following rules:</p>
     * <br>
     * <p>*   **true**</p>
     * <p>*   **false**</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The trace ID that is used to query the details of the request.</p>
     */
    @NameInMap("TraceId")
    public String traceId;

    public static RollbackApplicationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RollbackApplicationResponseBody self = new RollbackApplicationResponseBody();
        return TeaModel.build(map, self);
    }

    public RollbackApplicationResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public RollbackApplicationResponseBody setData(RollbackApplicationResponseBodyData data) {
        this.data = data;
        return this;
    }
    public RollbackApplicationResponseBodyData getData() {
        return this.data;
    }

    public RollbackApplicationResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public RollbackApplicationResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public RollbackApplicationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RollbackApplicationResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public RollbackApplicationResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class RollbackApplicationResponseBodyData extends TeaModel {
        /**
         * <p>The ID of the change process.</p>
         */
        @NameInMap("ChangeOrderId")
        public String changeOrderId;

        /**
         * <p>Specifies whether approval is required when a RAM user performs release. Take note of the following rules:</p>
         * <br>
         * <p>*   **true**</p>
         * <p>*   **false**</p>
         */
        @NameInMap("IsNeedApproval")
        public Boolean isNeedApproval;

        public static RollbackApplicationResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            RollbackApplicationResponseBodyData self = new RollbackApplicationResponseBodyData();
            return TeaModel.build(map, self);
        }

        public RollbackApplicationResponseBodyData setChangeOrderId(String changeOrderId) {
            this.changeOrderId = changeOrderId;
            return this;
        }
        public String getChangeOrderId() {
            return this.changeOrderId;
        }

        public RollbackApplicationResponseBodyData setIsNeedApproval(Boolean isNeedApproval) {
            this.isNeedApproval = isNeedApproval;
            return this;
        }
        public Boolean getIsNeedApproval() {
            return this.isNeedApproval;
        }

    }

}
