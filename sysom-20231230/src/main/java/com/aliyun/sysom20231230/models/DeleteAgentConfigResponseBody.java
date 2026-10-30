// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class DeleteAgentConfigResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     * <ul>
     * <li><code>code == Success</code>: Authorization succeeded.</li>
     * <li>Other status codes indicate that authorization failed. If authorization failed, check the <code>message</code> field for detailed error messages.</li>
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
    public DeleteAgentConfigResponseBodyData data;

    /**
     * <p>The error message.</p>
     * <ul>
     * <li>If <code>code == Success</code>, this field is empty.</li>
     * <li>Otherwise, this field contains the request error message.</li>
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

    public static DeleteAgentConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteAgentConfigResponseBody self = new DeleteAgentConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteAgentConfigResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DeleteAgentConfigResponseBody setData(DeleteAgentConfigResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DeleteAgentConfigResponseBodyData getData() {
        return this.data;
    }

    public DeleteAgentConfigResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteAgentConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DeleteAgentConfigResponseBodyData extends TeaModel {
        /**
         * <p>The task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>The ID of the currently running task</p>
         */
        @NameInMap("taskId")
        public String taskId;

        public static DeleteAgentConfigResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DeleteAgentConfigResponseBodyData self = new DeleteAgentConfigResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DeleteAgentConfigResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
