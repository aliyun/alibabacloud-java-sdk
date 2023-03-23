// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DeleteApplicationResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code. Valid values:</p>
     * <br>
     * <p>*   **2xx**: The request is successful.</p>
     * <p>*   **3xx**: A redirection message is returned.</p>
     * <p>*   **4xx**: The request is invalid.</p>
     * <p>*   **5xx**: A server error occurred.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned results.</p>
     */
    @NameInMap("Data")
    public DeleteApplicationResponseBodyData data;

    /**
     * <p>The error code that is returned if the request fails.</p>
     * <br>
     * <p>*   If the request is successful, this parameter is not returned.****</p>
     * <p>*   This parameter is returned only if the request failed.**** For more information about the values of this parameter, see the "**Error codes**" section of this topic.</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The returned message.</p>
     * <br>
     * <p>*   If the request is successful, **success** is returned.</p>
     * <p>*   If an error occurred, the error code is returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the application is deleted. Valid values:</p>
     * <br>
     * <p>*   **true**</p>
     * <p>*   **false**</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The trace ID that is used to query details of the request.</p>
     */
    @NameInMap("TraceId")
    public String traceId;

    public static DeleteApplicationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteApplicationResponseBody self = new DeleteApplicationResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteApplicationResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DeleteApplicationResponseBody setData(DeleteApplicationResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DeleteApplicationResponseBodyData getData() {
        return this.data;
    }

    public DeleteApplicationResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public DeleteApplicationResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteApplicationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteApplicationResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DeleteApplicationResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class DeleteApplicationResponseBodyData extends TeaModel {
        /**
         * <p>The ID of the change order that is used to query the task execution status.</p>
         */
        @NameInMap("ChangeOrderId")
        public String changeOrderId;

        public static DeleteApplicationResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DeleteApplicationResponseBodyData self = new DeleteApplicationResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DeleteApplicationResponseBodyData setChangeOrderId(String changeOrderId) {
            this.changeOrderId = changeOrderId;
            return this;
        }
        public String getChangeOrderId() {
            return this.changeOrderId;
        }

    }

}
