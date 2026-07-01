// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class DeleteScheduledPlanResponseBody extends TeaModel {
    /**
     * <p>The data structure of the deleted scheduled plan.</p>
     */
    @NameInMap("data")
    public ScheduledPlan data;

    /**
     * <p>The error code returned if the request fails. This parameter is empty if the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("errorCode")
    public String errorCode;

    /**
     * <p>The error message returned if the request fails. This parameter is empty if the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("errorMessage")
    public String errorMessage;

    /**
     * <p>The business status code. This is always 200. Use the \<code>success\\</code> parameter to check if the request was successful.</p>
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

    public static DeleteScheduledPlanResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteScheduledPlanResponseBody self = new DeleteScheduledPlanResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteScheduledPlanResponseBody setData(ScheduledPlan data) {
        this.data = data;
        return this;
    }
    public ScheduledPlan getData() {
        return this.data;
    }

    public DeleteScheduledPlanResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public DeleteScheduledPlanResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public DeleteScheduledPlanResponseBody setHttpCode(Integer httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public Integer getHttpCode() {
        return this.httpCode;
    }

    public DeleteScheduledPlanResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteScheduledPlanResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
