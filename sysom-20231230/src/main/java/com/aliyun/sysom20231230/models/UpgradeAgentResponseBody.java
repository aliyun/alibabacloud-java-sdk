// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class UpgradeAgentResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public UpgradeAgentResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>SysomOpenAPIException: SysomOpenAPI.InvalidParameter Invalid params, should be json string or dict</p>
     */
    @NameInMap("message")
    public String message;

    public static UpgradeAgentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpgradeAgentResponseBody self = new UpgradeAgentResponseBody();
        return TeaModel.build(map, self);
    }

    public UpgradeAgentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpgradeAgentResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpgradeAgentResponseBody setData(UpgradeAgentResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UpgradeAgentResponseBodyData getData() {
        return this.data;
    }

    public UpgradeAgentResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public static class UpgradeAgentResponseBodyData extends TeaModel {
        @NameInMap("task_id")
        public String taskId;

        public static UpgradeAgentResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UpgradeAgentResponseBodyData self = new UpgradeAgentResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UpgradeAgentResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
