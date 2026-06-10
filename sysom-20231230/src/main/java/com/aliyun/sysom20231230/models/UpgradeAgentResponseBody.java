// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class UpgradeAgentResponseBody extends TeaModel {
    /**
     * <p>Request ID, which can be used for end-to-end Diagnosis</p>
     * 
     * <strong>example:</strong>
     * <p>B149FD9C-ED5C-5765-B3AD-05AA4A4D64D7</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Status code  </p>
     * <ul>
     * <li>If <code>code == Success</code>, authorization Succeeded.  </li>
     * <li>Other status codes indicate Failed to Authorize. When authorization fails, view the <code>message</code> field to obtain the detailed error message.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>Returned Data</p>
     */
    @NameInMap("data")
    public UpgradeAgentResponseBodyData data;

    /**
     * <p>Error message  </p>
     * <ul>
     * <li>If <code>code == Success</code>, this field is empty.  </li>
     * <li>Otherwise, this field contains the request error message.</li>
     * </ul>
     * 
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
        /**
         * <p>Job ID.</p>
         * 
         * <strong>example:</strong>
         * <p>391f5aeba2054f66b3aaef0136142fe2</p>
         */
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
