// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class UpgradePolarClawSkillsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>45D24263-7E3A-4140-9472-************</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>32077061</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static UpgradePolarClawSkillsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpgradePolarClawSkillsResponseBody self = new UpgradePolarClawSkillsResponseBody();
        return TeaModel.build(map, self);
    }

    public UpgradePolarClawSkillsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpgradePolarClawSkillsResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
