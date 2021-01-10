// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryCasTaskLogRequest extends TeaModel {
    @NameInMap("ExecutionTimes")
    public Long executionTimes;

    @NameInMap("TaskId")
    public String taskId;

    public static QueryCasTaskLogRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryCasTaskLogRequest self = new QueryCasTaskLogRequest();
        return TeaModel.build(map, self);
    }

    public QueryCasTaskLogRequest setExecutionTimes(Long executionTimes) {
        this.executionTimes = executionTimes;
        return this;
    }
    public Long getExecutionTimes() {
        return this.executionTimes;
    }

    public QueryCasTaskLogRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
