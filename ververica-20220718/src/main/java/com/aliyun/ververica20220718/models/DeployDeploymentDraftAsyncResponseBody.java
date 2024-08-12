// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class DeployDeploymentDraftAsyncResponseBody extends TeaModel {
    @NameInMap("data")
    public DeployDeploymentDraftAsyncResponseBodyData data;

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

    public static DeployDeploymentDraftAsyncResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeployDeploymentDraftAsyncResponseBody self = new DeployDeploymentDraftAsyncResponseBody();
        return TeaModel.build(map, self);
    }

    public DeployDeploymentDraftAsyncResponseBody setData(DeployDeploymentDraftAsyncResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DeployDeploymentDraftAsyncResponseBodyData getData() {
        return this.data;
    }

    public DeployDeploymentDraftAsyncResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public DeployDeploymentDraftAsyncResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public DeployDeploymentDraftAsyncResponseBody setHttpCode(Integer httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public Integer getHttpCode() {
        return this.httpCode;
    }

    public DeployDeploymentDraftAsyncResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeployDeploymentDraftAsyncResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DeployDeploymentDraftAsyncResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>b3dcdb25-bf36-457d-92ba-a36077e8****</p>
         */
        @NameInMap("ticketId")
        public String ticketId;

        public static DeployDeploymentDraftAsyncResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DeployDeploymentDraftAsyncResponseBodyData self = new DeployDeploymentDraftAsyncResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DeployDeploymentDraftAsyncResponseBodyData setTicketId(String ticketId) {
            this.ticketId = ticketId;
            return this;
        }
        public String getTicketId() {
            return this.ticketId;
        }

    }

}
