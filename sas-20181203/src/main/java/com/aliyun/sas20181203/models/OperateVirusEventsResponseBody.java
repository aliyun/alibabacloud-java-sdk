// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class OperateVirusEventsResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the task to handle multiple alert events at a time.</p>
     */
    @NameInMap("TaskId")
    public Long taskId;

    public static OperateVirusEventsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OperateVirusEventsResponseBody self = new OperateVirusEventsResponseBody();
        return TeaModel.build(map, self);
    }

    public OperateVirusEventsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public OperateVirusEventsResponseBody setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

}
