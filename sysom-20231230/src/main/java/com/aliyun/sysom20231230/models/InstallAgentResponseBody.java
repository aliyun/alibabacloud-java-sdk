// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class InstallAgentResponseBody extends TeaModel {
    /**
     * <p>The request ID, which can be used for end-to-end diagnostics.</p>
     * 
     * <strong>example:</strong>
     * <p>1D8887FC-4BDB-5A1C-AB19-135C29A9E481</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The status code.</p>
     * <ul>
     * <li>If <code>code == Success</code>, the authorization is successful.</li>
     * <li>Other status codes indicate authorization failed. Check the <code>message</code> field for the detailed fault information.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The response data.</p>
     */
    @NameInMap("data")
    public InstallAgentResponseBodyData data;

    /**
     * <p>The error message.</p>
     * <ul>
     * <li>If <code>code == Success</code>, this field is empty.</li>
     * <li>Otherwise, this field contains the request error information.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("message")
    public String message;

    public static InstallAgentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        InstallAgentResponseBody self = new InstallAgentResponseBody();
        return TeaModel.build(map, self);
    }

    public InstallAgentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public InstallAgentResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public InstallAgentResponseBody setData(InstallAgentResponseBodyData data) {
        this.data = data;
        return this;
    }
    public InstallAgentResponseBodyData getData() {
        return this.data;
    }

    public InstallAgentResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public static class InstallAgentResponseBodyData extends TeaModel {
        /**
         * <p>The task ID.</p>
         * <p>You can use this task ID to call the GetAgentTask operation to retrieve the task execution status.</p>
         * 
         * <strong>example:</strong>
         * <p>26b3cd97389c43dcad6bc4901c36fcec</p>
         */
        @NameInMap("task_id")
        public String taskId;

        public static InstallAgentResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            InstallAgentResponseBodyData self = new InstallAgentResponseBodyData();
            return TeaModel.build(map, self);
        }

        public InstallAgentResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
