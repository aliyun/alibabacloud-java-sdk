// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class SetTLSCipherPolicyAttributeResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the asynchronous task.</p>
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
