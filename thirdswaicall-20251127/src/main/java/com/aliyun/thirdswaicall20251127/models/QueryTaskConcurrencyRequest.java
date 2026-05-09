// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.thirdswaicall20251127.models;

import com.aliyun.tea.*;

public class QueryTaskConcurrencyRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12345</p>
     */
    @NameInMap("TaskId")
    public Long taskId;

    public static QueryTaskConcurrencyRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryTaskConcurrencyRequest self = new QueryTaskConcurrencyRequest();
        return TeaModel.build(map, self);
    }

    public QueryTaskConcurrencyRequest setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

}
