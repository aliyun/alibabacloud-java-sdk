// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class GenerateResourcePlanWithFlinkConfAsyncResponseBody extends TeaModel {
    @NameInMap("data")
    public GenerateResourcePlanWithFlinkConfAsyncResponseBodyData data;

    @NameInMap("errorCode")
    public String errorCode;

    @NameInMap("errorMessage")
    public String errorMessage;

    @NameInMap("httpCode")
    public Integer httpCode;

    @NameInMap("requestId")
    public String requestId;

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
