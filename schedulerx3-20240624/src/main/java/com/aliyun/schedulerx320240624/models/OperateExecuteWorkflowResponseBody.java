// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx320240624.models;

import com.aliyun.tea.*;

public class OperateExecuteWorkflowResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("Data")
    public OperateExecuteWorkflowResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>Parameter error: content is null.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>3835AA29-2298-5434-BC53-9CC377CDFD2C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static OperateExecuteWorkflowResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OperateExecuteWorkflowResponseBody self = new OperateExecuteWorkflowResponseBody();
        return TeaModel.build(map, self);
    }

    public OperateExecuteWorkflowResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public OperateExecuteWorkflowResponseBody setData(OperateExecuteWorkflowResponseBodyData data) {
        this.data = data;
        return this;
    }
    public OperateExecuteWorkflowResponseBodyData getData() {
        return this.data;
    }

    public OperateExecuteWorkflowResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public OperateExecuteWorkflowResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public OperateExecuteWorkflowResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class OperateExecuteWorkflowResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("WorkflowExecutionId")
        public String workflowExecutionId;

        public static OperateExecuteWorkflowResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            OperateExecuteWorkflowResponseBodyData self = new OperateExecuteWorkflowResponseBodyData();
            return TeaModel.build(map, self);
        }

        public OperateExecuteWorkflowResponseBodyData setWorkflowExecutionId(String workflowExecutionId) {
            this.workflowExecutionId = workflowExecutionId;
            return this;
        }
        public String getWorkflowExecutionId() {
            return this.workflowExecutionId;
        }

    }

}
