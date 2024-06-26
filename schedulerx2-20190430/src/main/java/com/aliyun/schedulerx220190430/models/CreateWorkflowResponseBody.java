// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx220190430.models;

import com.aliyun.tea.*;

public class CreateWorkflowResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
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
     * 
     * <strong>example:</strong>
     * <p>timetype is invalid</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>39090022-1F3B-4797-8518-6B61095F1AF0</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the workflow was created. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
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
         * 
         * <strong>example:</strong>
         * <p>92583</p>
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
