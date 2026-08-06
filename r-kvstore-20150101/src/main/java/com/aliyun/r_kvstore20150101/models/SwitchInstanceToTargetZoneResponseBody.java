// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class SwitchInstanceToTargetZoneResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>5D622714-AEDD-4609-9167-F5DDD3D1****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TaskId")
    public String taskId;

    public static SwitchInstanceToTargetZoneResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SwitchInstanceToTargetZoneResponseBody self = new SwitchInstanceToTargetZoneResponseBody();
        return TeaModel.build(map, self);
    }

    public SwitchInstanceToTargetZoneResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SwitchInstanceToTargetZoneResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
