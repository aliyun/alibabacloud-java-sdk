// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class RescaleApplicationResponseBody extends TeaModel {
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
    public RescaleApplicationResponseBodyData data;

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
     * <p>Indicates whether the application is successfully scaled. Take note of the following rules:</p>
     * <br>
     * <p>*   **true**</p>
     * <p>*   **false**</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static RescaleApplicationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RescaleApplicationResponseBody self = new RescaleApplicationResponseBody();
        return TeaModel.build(map, self);
    }

    public RescaleApplicationResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public RescaleApplicationResponseBody setData(RescaleApplicationResponseBodyData data) {
        this.data = data;
        return this;
    }
    public RescaleApplicationResponseBodyData getData() {
        return this.data;
    }

    public RescaleApplicationResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public RescaleApplicationResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public RescaleApplicationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RescaleApplicationResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class RescaleApplicationResponseBodyData extends TeaModel {
        /**
         * <p>The ID of the change order.</p>
         */
        @NameInMap("ChangeOrderId")
        public String changeOrderId;

        public static RescaleApplicationResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            RescaleApplicationResponseBodyData self = new RescaleApplicationResponseBodyData();
            return TeaModel.build(map, self);
        }

        public RescaleApplicationResponseBodyData setChangeOrderId(String changeOrderId) {
            this.changeOrderId = changeOrderId;
            return this;
        }
        public String getChangeOrderId() {
            return this.changeOrderId;
        }

    }

}
