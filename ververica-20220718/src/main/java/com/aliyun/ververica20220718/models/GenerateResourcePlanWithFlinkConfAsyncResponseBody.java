// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class GenerateResourcePlanWithFlinkConfAsyncResponseBody extends TeaModel {
    /**
     * <ul>
     * <li>If the value of success was true, the asynchronous generation result was returned.</li>
     * <li>If the value of success was false, a null value was returned.</li>
     * </ul>
     */
    @NameInMap("data")
    public GenerateResourcePlanWithFlinkConfAsyncResponseBodyData data;

    /**
     * <ul>
     * <li>If the value of success was false, an error code was returned.</li>
     * <li>If the value of success was true, a null value was returned.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("errorCode")
    public String errorCode;

    /**
     * <ul>
     * <li>If the value of success was false, an error message was returned.</li>
     * <li>If the value of success was true, a null value was returned.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("errorMessage")
    public String errorMessage;

    /**
     * <p>The value was fixed to 200.</p>
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

    public static GenerateResourcePlanWithFlinkConfAsyncResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GenerateResourcePlanWithFlinkConfAsyncResponseBody self = new GenerateResourcePlanWithFlinkConfAsyncResponseBody();
        return TeaModel.build(map, self);
    }

    public GenerateResourcePlanWithFlinkConfAsyncResponseBody setData(GenerateResourcePlanWithFlinkConfAsyncResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GenerateResourcePlanWithFlinkConfAsyncResponseBodyData getData() {
        return this.data;
    }

    public GenerateResourcePlanWithFlinkConfAsyncResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GenerateResourcePlanWithFlinkConfAsyncResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GenerateResourcePlanWithFlinkConfAsyncResponseBody setHttpCode(Integer httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public Integer getHttpCode() {
        return this.httpCode;
    }

    public GenerateResourcePlanWithFlinkConfAsyncResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GenerateResourcePlanWithFlinkConfAsyncResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GenerateResourcePlanWithFlinkConfAsyncResponseBodyData extends TeaModel {
        /**
         * <p>The ID of the ticket for you to query the asynchronous generation result.</p>
         * 
         * <strong>example:</strong>
         * <p>b3dcdb25-bf36-457d-92ba-a36077e8****</p>
         */
        @NameInMap("ticketId")
        public String ticketId;

        public static GenerateResourcePlanWithFlinkConfAsyncResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GenerateResourcePlanWithFlinkConfAsyncResponseBodyData self = new GenerateResourcePlanWithFlinkConfAsyncResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GenerateResourcePlanWithFlinkConfAsyncResponseBodyData setTicketId(String ticketId) {
            this.ticketId = ticketId;
            return this;
        }
        public String getTicketId() {
            return this.ticketId;
        }

    }

}
