// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class UpgradeAgentForClusterResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>B149FD9C-ED5C-5765-B3AD-05AA4A4D64D7</p>
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
    public UpgradeAgentForClusterResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    public static UpgradeAgentForClusterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpgradeAgentForClusterResponseBody self = new UpgradeAgentForClusterResponseBody();
        return TeaModel.build(map, self);
    }

    public UpgradeAgentForClusterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpgradeAgentForClusterResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpgradeAgentForClusterResponseBody setData(UpgradeAgentForClusterResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UpgradeAgentForClusterResponseBodyData getData() {
        return this.data;
    }

    public UpgradeAgentForClusterResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public static class UpgradeAgentForClusterResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>7523e9e0ddc74d99a5236f4f4d5056e6</p>
         */
        @NameInMap("task_id")
        public String taskId;

        public static UpgradeAgentForClusterResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UpgradeAgentForClusterResponseBodyData self = new UpgradeAgentForClusterResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UpgradeAgentForClusterResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
