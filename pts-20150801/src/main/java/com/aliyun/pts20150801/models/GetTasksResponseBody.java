// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20150801.models;

import com.aliyun.tea.*;

public class GetTasksResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Tasks")
    public String tasks;

    public static GetTasksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTasksResponseBody self = new GetTasksResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTasksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTasksResponseBody setTasks(String tasks) {
        this.tasks = tasks;
        return this;
    }
    public String getTasks() {
        return this.tasks;
    }

}
