// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class CreateGreyTagRouteResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the information of the change order was queried. Valid values:</p>
     * <br>
     * <p>*   **true**: The information was queried.</p>
     * <p>*   **false**: The information failed to be queried.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The ID of the canary release rule. The ID is globally unique.</p>
     */
    @NameInMap("Data")
    public CreateGreyTagRouteResponseBodyData data;

    /**
     * <p>The HTTP status code. Valid values:</p>
     * <br>
     * <p>*   **2xx**: The call was successful.</p>
     * <p>*   **3xx**: The call was redirected.</p>
     * <p>*   **4xx**: The call failed.</p>
     * <p>*   **5xx**: A server error occurred.</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The trace ID that is used to query the details of the request.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The returned information.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The information about the canary release rule.</p>
     */
    @NameInMap("TraceId")
    public String traceId;

    public static CreateGreyTagRouteResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateGreyTagRouteResponseBody self = new CreateGreyTagRouteResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateGreyTagRouteResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateGreyTagRouteResponseBody setData(CreateGreyTagRouteResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateGreyTagRouteResponseBodyData getData() {
        return this.data;
    }

    public CreateGreyTagRouteResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public CreateGreyTagRouteResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateGreyTagRouteResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateGreyTagRouteResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public CreateGreyTagRouteResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class CreateGreyTagRouteResponseBodyData extends TeaModel {
        /**
         * <p>The returned error code. Valid values:</p>
         * <br>
         * <p>*   If the call is successful, the **ErrorCode** parameter is not returned.</p>
         * <p>*   If the call fails, the **ErrorCode** parameter is returned. For more information, see the "**Error codes**" section of this topic.</p>
         */
        @NameInMap("GreyTagRouteId")
        public Long greyTagRouteId;

        public static CreateGreyTagRouteResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateGreyTagRouteResponseBodyData self = new CreateGreyTagRouteResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateGreyTagRouteResponseBodyData setGreyTagRouteId(Long greyTagRouteId) {
            this.greyTagRouteId = greyTagRouteId;
            return this;
        }
        public Long getGreyTagRouteId() {
            return this.greyTagRouteId;
        }

    }

}
