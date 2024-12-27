// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class UninstallAgentForClusterResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>44841312-7227-55C9-AE03-D59729BFAE38</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public UninstallAgentForClusterResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>SysomOpenAPIException: SysomOpenAPI.NotAuthorizedInstance Instance 21 is not authorized</p>
     */
    @NameInMap("message")
    public String message;

    public static UninstallAgentForClusterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UninstallAgentForClusterResponseBody self = new UninstallAgentForClusterResponseBody();
        return TeaModel.build(map, self);
    }

    public UninstallAgentForClusterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UninstallAgentForClusterResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UninstallAgentForClusterResponseBody setData(UninstallAgentForClusterResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UninstallAgentForClusterResponseBodyData getData() {
        return this.data;
    }

    public UninstallAgentForClusterResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public static class UninstallAgentForClusterResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>049ea0609515414b9e19c3389d7ba638</p>
         */
        @NameInMap("task_id")
        public String taskId;

        public static UninstallAgentForClusterResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UninstallAgentForClusterResponseBodyData self = new UninstallAgentForClusterResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UninstallAgentForClusterResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
