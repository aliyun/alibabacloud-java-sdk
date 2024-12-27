// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class UninstallAgentResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public UninstallAgentResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>SysomOpenAPIAssumeRoleException: EntityNotExist.Role The role not exists: acs:ram::xxxxx:role/aliyunserviceroleforsysom</p>
     */
    @NameInMap("message")
    public String message;

    public static UninstallAgentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UninstallAgentResponseBody self = new UninstallAgentResponseBody();
        return TeaModel.build(map, self);
    }

    public UninstallAgentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UninstallAgentResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UninstallAgentResponseBody setData(UninstallAgentResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UninstallAgentResponseBodyData getData() {
        return this.data;
    }

    public UninstallAgentResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public static class UninstallAgentResponseBodyData extends TeaModel {
        @NameInMap("task_id")
        public String taskId;

        public static UninstallAgentResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UninstallAgentResponseBodyData self = new UninstallAgentResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UninstallAgentResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
