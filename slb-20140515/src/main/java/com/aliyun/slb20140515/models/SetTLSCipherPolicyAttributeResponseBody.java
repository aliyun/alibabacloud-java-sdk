// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class SetTLSCipherPolicyAttributeResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>CEF72CEB-54B6-4AE8-B225-F876FF7BA984</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the asynchronous task.</p>
     * 
     * <strong>example:</strong>
     * <p>72dcd26b-f12d-4c27-b3af****-18f6aed5</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static SetTLSCipherPolicyAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetTLSCipherPolicyAttributeResponseBody self = new SetTLSCipherPolicyAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public SetTLSCipherPolicyAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SetTLSCipherPolicyAttributeResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
