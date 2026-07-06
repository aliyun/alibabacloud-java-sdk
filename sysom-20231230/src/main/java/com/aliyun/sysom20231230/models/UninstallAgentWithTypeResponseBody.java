// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class UninstallAgentWithTypeResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public UninstallAgentWithTypeResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>“”</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>13772206-1162-5A0F-81F0-79A10C249A5E</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static UninstallAgentWithTypeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UninstallAgentWithTypeResponseBody self = new UninstallAgentWithTypeResponseBody();
        return TeaModel.build(map, self);
    }

    public UninstallAgentWithTypeResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UninstallAgentWithTypeResponseBody setData(UninstallAgentWithTypeResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UninstallAgentWithTypeResponseBodyData getData() {
        return this.data;
    }

    public UninstallAgentWithTypeResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UninstallAgentWithTypeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class UninstallAgentWithTypeResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>63fc5acb99e642d793f42912612e8001</p>
         */
        @NameInMap("taskId")
        public String taskId;

        public static UninstallAgentWithTypeResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UninstallAgentWithTypeResponseBodyData self = new UninstallAgentWithTypeResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UninstallAgentWithTypeResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
