// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class UninstallAgentResponseBody extends TeaModel {
    /**
     * <p>Request ID, which can be used for end-to-end diagnosis</p>
     * 
     * <strong>example:</strong>
     * <p>13772206-1162-5A0F-81F0-79A10C249A5E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Status code  </p>
     * <ul>
     * <li><code>code == Success</code> indicates that authorization succeeded.  </li>
     * <li>Other status codes indicate that authorization failed. When authorization fails, view the <code>message</code> field to obtain detailed error message.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>Returned data</p>
     */
    @NameInMap("data")
    public UninstallAgentResponseBodyData data;

    /**
     * <p>Error message  </p>
     * <ul>
     * <li>If <code>code == Success</code>, this field is empty.  </li>
     * <li>Otherwise, this field contains the request error message.</li>
     * </ul>
     * 
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
        /**
         * <p>Job ID.</p>
         * 
         * <strong>example:</strong>
         * <p>63fc5acb99e642d793f42912612e8001</p>
         */
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
