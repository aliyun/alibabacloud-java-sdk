// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class CreateLogAlarmTaskResponseBody extends TeaModel {
    @NameInMap("TaskId")
    public Integer taskId;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateLogAlarmTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateLogAlarmTaskResponseBody self = new CreateLogAlarmTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateLogAlarmTaskResponseBody setTaskId(Integer taskId) {
        this.taskId = taskId;
        return this;
    }
    public Integer getTaskId() {
        return this.taskId;
    }

    public CreateLogAlarmTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
