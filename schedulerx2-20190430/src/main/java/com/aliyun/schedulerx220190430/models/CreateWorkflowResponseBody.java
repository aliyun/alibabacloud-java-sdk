// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx220190430.models;

import com.aliyun.tea.*;

public class CreateWorkflowResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The data that was returned for the request.</p>
     */
    @NameInMap("Data")
    public CreateWorkflowResponseBodyData data;

    /**
     * <p>The returned error message.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the workflow was created. Valid values:</p>
     * <br>
     * <p>*   true</p>
     * <p>*   false</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static CreateWorkflowResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateWorkflowResponseBody self = new CreateWorkflowResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateWorkflowResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateWorkflowResponseBody setData(CreateWorkflowResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateWorkflowResponseBodyData getData() {
        return this.data;
    }

    public CreateWorkflowResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateWorkflowResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateWorkflowResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateWorkflowResponseBodyData extends TeaModel {
        /**
         * <p>The workflow ID.</p>
         */
        @NameInMap("WorkflowId")
        public Long workflowId;

        public static CreateWorkflowResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateWorkflowResponseBodyData self = new CreateWorkflowResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateWorkflowResponseBodyData setWorkflowId(Long workflowId) {
            this.workflowId = workflowId;
            return this;
        }
        public Long getWorkflowId() {
            return this.workflowId;
        }

    }

}
