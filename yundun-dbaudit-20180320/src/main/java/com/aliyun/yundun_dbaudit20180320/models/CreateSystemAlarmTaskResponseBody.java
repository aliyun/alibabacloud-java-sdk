// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class CreateSystemAlarmTaskResponseBody extends TeaModel {
    @NameInMap("TaskId")
    public Integer taskId;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateSystemAlarmTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateSystemAlarmTaskResponseBody self = new CreateSystemAlarmTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateSystemAlarmTaskResponseBody setTaskId(Integer taskId) {
        this.taskId = taskId;
        return this;
    }
    public Integer getTaskId() {
        return this.taskId;
    }

    public CreateSystemAlarmTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
