// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx220190430.models;

import com.aliyun.tea.*;

public class DisableWorkflowResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code that is returned.</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The error message that is returned only if the error occurs.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the workflow is disabled. Valid values:</p>
     * <br>
     * <p>*   **true**: The workflow is disabled.</p>
     * <p>*   **false**: Failed to disable the workflow.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DisableWorkflowResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DisableWorkflowResponseBody self = new DisableWorkflowResponseBody();
        return TeaModel.build(map, self);
    }

    public DisableWorkflowResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DisableWorkflowResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DisableWorkflowResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DisableWorkflowResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
