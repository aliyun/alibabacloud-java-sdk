// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class UpdateClusterAgentConfigResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     * <ul>
     * <li>If the value is <code>Success</code>, the authorization is successful.</li>
     * <li>Other status codes indicate that the authorization failed. If the authorization fails, check the <code>message</code> field for the detailed fault message.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>SysomOpenAPI.ServerError</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("data")
    public UpdateClusterAgentConfigResponseBodyData data;

    /**
     * <p>The error message.</p>
     * <ul>
     * <li>If the value of <code>code</code> is <code>Success</code>, this field is empty.</li>
     * <li>Otherwise, this field contains the error message of the request.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>success</p>
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

    public static UpdateClusterAgentConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateClusterAgentConfigResponseBody self = new UpdateClusterAgentConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateClusterAgentConfigResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateClusterAgentConfigResponseBody setData(UpdateClusterAgentConfigResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UpdateClusterAgentConfigResponseBodyData getData() {
        return this.data;
    }

    public UpdateClusterAgentConfigResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateClusterAgentConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class UpdateClusterAgentConfigResponseBodyData extends TeaModel {
        /**
         * <p>The task ID.</p>
         * <p>You can call the GetAgentTask operation by using this task ID to check the execution status of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>bbe94a98-4192-4172-b856-95777e0a55d7</p>
         */
        @NameInMap("taskId")
        public String taskId;

        public static UpdateClusterAgentConfigResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UpdateClusterAgentConfigResponseBodyData self = new UpdateClusterAgentConfigResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UpdateClusterAgentConfigResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
