// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class GetAsyncTaskRequest extends TeaModel {
    @NameInMap("async_task_id")
    public String asyncTaskId;

    public static GetAsyncTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAsyncTaskRequest self = new GetAsyncTaskRequest();
        return TeaModel.build(map, self);
    }

    public GetAsyncTaskRequest setAsyncTaskId(String asyncTaskId) {
        this.asyncTaskId = asyncTaskId;
        return this;
    }
    public String getAsyncTaskId() {
        return this.asyncTaskId;
    }

}
