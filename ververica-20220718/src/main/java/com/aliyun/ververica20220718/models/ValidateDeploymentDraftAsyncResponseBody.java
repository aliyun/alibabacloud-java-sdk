// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class ValidateDeploymentDraftAsyncResponseBody extends TeaModel {
    /**
     * <p>The response data.</p>
     */
    @NameInMap("data")
    public ValidateDeploymentDraftAsyncResponseBodyData data;

    /**
     * <p>The error code. This parameter is returned when the request fails. If the request is successful, this parameter is empty.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("errorCode")
    public String errorCode;

    /**
     * <p>The error message. This parameter is returned when the request fails. If the request is successful, this parameter is empty.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("errorMessage")
    public String errorMessage;

    /**
     * <p>The status code. This is always 200. Use the success parameter to determine if the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpCode")
    public Integer httpCode;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>CBC799F0-AS7S-1D30-8A4F-882ED4DD****</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static ValidateDeploymentDraftAsyncResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ValidateDeploymentDraftAsyncResponseBody self = new ValidateDeploymentDraftAsyncResponseBody();
        return TeaModel.build(map, self);
    }

    public ValidateDeploymentDraftAsyncResponseBody setData(ValidateDeploymentDraftAsyncResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ValidateDeploymentDraftAsyncResponseBodyData getData() {
        return this.data;
    }

    public ValidateDeploymentDraftAsyncResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ValidateDeploymentDraftAsyncResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ValidateDeploymentDraftAsyncResponseBody setHttpCode(Integer httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public Integer getHttpCode() {
        return this.httpCode;
    }

    public ValidateDeploymentDraftAsyncResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ValidateDeploymentDraftAsyncResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ValidateDeploymentDraftAsyncResponseBodyData extends TeaModel {
        /**
         * <p>The ID of the asynchronous ticket. Use this ID to query the result of the asynchronous operation.</p>
         * 
         * <strong>example:</strong>
         * <p>b3dcdb25-bf36-457d-92ba-a36077e8****</p>
         */
        @NameInMap("ticketId")
        public String ticketId;

        public static ValidateDeploymentDraftAsyncResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ValidateDeploymentDraftAsyncResponseBodyData self = new ValidateDeploymentDraftAsyncResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ValidateDeploymentDraftAsyncResponseBodyData setTicketId(String ticketId) {
            this.ticketId = ticketId;
            return this;
        }
        public String getTicketId() {
            return this.ticketId;
        }

    }

}
