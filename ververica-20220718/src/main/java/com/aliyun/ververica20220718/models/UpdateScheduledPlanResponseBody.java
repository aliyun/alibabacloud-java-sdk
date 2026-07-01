// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class UpdateScheduledPlanResponseBody extends TeaModel {
    /**
     * <p>The data structure of the updated scheduled plan.</p>
     */
    @NameInMap("data")
    public ScheduledPlan data;

    /**
     * <p>The business error code. This parameter is not empty when the success parameter is false. This parameter is empty when the success parameter is true.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("errorCode")
    public String errorCode;

    /**
     * <p>The business error message. This parameter is not empty when the success parameter is false. This parameter is empty when the success parameter is true.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("errorMessage")
    public String errorMessage;

    /**
     * <p>The business status code. This is always 200. Use the success parameter to determine if the request was successful.</p>
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

    public static UpdateScheduledPlanResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateScheduledPlanResponseBody self = new UpdateScheduledPlanResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateScheduledPlanResponseBody setData(ScheduledPlan data) {
        this.data = data;
        return this;
    }
    public ScheduledPlan getData() {
        return this.data;
    }

    public UpdateScheduledPlanResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public UpdateScheduledPlanResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public UpdateScheduledPlanResponseBody setHttpCode(Integer httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public Integer getHttpCode() {
        return this.httpCode;
    }

    public UpdateScheduledPlanResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateScheduledPlanResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
