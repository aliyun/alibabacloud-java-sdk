// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class UpgradeAgentWithTypeResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public UpgradeAgentWithTypeResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>“”</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>B149FD9C-ED5C-5765-B3AD-05AA4A4D64D7</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static UpgradeAgentWithTypeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpgradeAgentWithTypeResponseBody self = new UpgradeAgentWithTypeResponseBody();
        return TeaModel.build(map, self);
    }

    public UpgradeAgentWithTypeResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpgradeAgentWithTypeResponseBody setData(UpgradeAgentWithTypeResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UpgradeAgentWithTypeResponseBodyData getData() {
        return this.data;
    }

    public UpgradeAgentWithTypeResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpgradeAgentWithTypeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class UpgradeAgentWithTypeResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>391f5aeba2054f66b3aaef0136142fe2</p>
         */
        @NameInMap("taskId")
        public String taskId;

        public static UpgradeAgentWithTypeResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UpgradeAgentWithTypeResponseBodyData self = new UpgradeAgentWithTypeResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UpgradeAgentWithTypeResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
