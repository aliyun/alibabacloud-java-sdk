// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class ValidateDeploymentDraftAsyncResponseBody extends TeaModel {
    @NameInMap("data")
    public ValidateDeploymentDraftAsyncResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("errorCode")
    public String errorCode;

    /**
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("errorMessage")
    public String errorMessage;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpCode")
    public Integer httpCode;

    /**
     * <strong>example:</strong>
     * <p>CBC799F0-AS7S-1D30-8A4F-882ED4DD****</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
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
