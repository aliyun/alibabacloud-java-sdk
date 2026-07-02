// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class InstallAgentWithTypeResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public InstallAgentWithTypeResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>1D8887FC-4BDB-5A1C-AB19-135C29A9E481</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static InstallAgentWithTypeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        InstallAgentWithTypeResponseBody self = new InstallAgentWithTypeResponseBody();
        return TeaModel.build(map, self);
    }

    public InstallAgentWithTypeResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public InstallAgentWithTypeResponseBody setData(InstallAgentWithTypeResponseBodyData data) {
        this.data = data;
        return this;
    }
    public InstallAgentWithTypeResponseBodyData getData() {
        return this.data;
    }

    public InstallAgentWithTypeResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public InstallAgentWithTypeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class InstallAgentWithTypeResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>26b3cd97389c43dcad6bc4901c36fcec</p>
         */
        @NameInMap("taskId")
        public String taskId;

        public static InstallAgentWithTypeResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            InstallAgentWithTypeResponseBodyData self = new InstallAgentWithTypeResponseBodyData();
            return TeaModel.build(map, self);
        }

        public InstallAgentWithTypeResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
