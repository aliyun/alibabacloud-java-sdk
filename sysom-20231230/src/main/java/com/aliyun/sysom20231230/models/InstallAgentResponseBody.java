// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class InstallAgentResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public InstallAgentResponseBodyData data;

    /**
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
