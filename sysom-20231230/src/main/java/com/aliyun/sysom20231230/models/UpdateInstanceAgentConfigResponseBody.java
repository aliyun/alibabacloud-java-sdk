// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class UpdateInstanceAgentConfigResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     * 
     * <strong>example:</strong>
     * <p>SysomOpenAPI.ServerError</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The returned result.</p>
     */
    @NameInMap("data")
    public UpdateInstanceAgentConfigResponseBodyData data;

    /**
     * <p>The error message.</p>
     * <ul>
     * <li>If <code>code == Success</code>, this field is empty.</li>
     * <li>Otherwise, this field contains the request error message.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Analysis ID: 56dae746-ef55-4f77-8373-cb3594c41457
     * Analysis failed for instance i-bp164ns76pzirbwv0snt. Cause: Not get GPU trace data for \&quot;56dae746-ef55-4f77-8373-cb3594c41457\&quot; \&quot;[\&quot;93811\&quot;]\&quot;!</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>2D693121-C925-5154-8DF6-C09A8B369822</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static UpdateInstanceAgentConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateInstanceAgentConfigResponseBody self = new UpdateInstanceAgentConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateInstanceAgentConfigResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateInstanceAgentConfigResponseBody setData(UpdateInstanceAgentConfigResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UpdateInstanceAgentConfigResponseBodyData getData() {
        return this.data;
    }

    public UpdateInstanceAgentConfigResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateInstanceAgentConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class UpdateInstanceAgentConfigResponseBodyData extends TeaModel {
        /**
         * <p>The task ID.</p>
         * <p>You can use this task ID to call the GetAgentTask operation to check the task execution status.</p>
         * 
         * <strong>example:</strong>
         * <p>bbe94a98-4192-4172-b856-95777e0a55d7</p>
         */
        @NameInMap("taskId")
        public String taskId;

        public static UpdateInstanceAgentConfigResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UpdateInstanceAgentConfigResponseBodyData self = new UpdateInstanceAgentConfigResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UpdateInstanceAgentConfigResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
