// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class SwitchNetworkResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>F0997EE8-F4C2-4503-9168-85177ED78C70</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the task.</p>
     * 
     * <strong>example:</strong>
     * <p>578678678</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static SwitchNetworkResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SwitchNetworkResponseBody self = new SwitchNetworkResponseBody();
        return TeaModel.build(map, self);
    }

    public SwitchNetworkResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SwitchNetworkResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
