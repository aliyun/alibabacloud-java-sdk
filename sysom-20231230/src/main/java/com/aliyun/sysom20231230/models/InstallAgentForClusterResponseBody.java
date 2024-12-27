// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class InstallAgentForClusterResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>B149FD9C-ED5C-5765-B3AD-05AA4A4D64D7</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>SysomOpenAPI.ServerError</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public InstallAgentForClusterResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    public static InstallAgentForClusterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        InstallAgentForClusterResponseBody self = new InstallAgentForClusterResponseBody();
        return TeaModel.build(map, self);
    }

    public InstallAgentForClusterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public InstallAgentForClusterResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public InstallAgentForClusterResponseBody setData(InstallAgentForClusterResponseBodyData data) {
        this.data = data;
        return this;
    }
    public InstallAgentForClusterResponseBodyData getData() {
        return this.data;
    }

    public InstallAgentForClusterResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public static class InstallAgentForClusterResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>049ea0609515414b9e19c3389d7ba638</p>
         */
        @NameInMap("task_id")
        public String taskId;

        public static InstallAgentForClusterResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            InstallAgentForClusterResponseBodyData self = new InstallAgentForClusterResponseBodyData();
            return TeaModel.build(map, self);
        }

        public InstallAgentForClusterResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
