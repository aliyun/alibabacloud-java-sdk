// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class RetryLinkefabricFabricTaskRequest extends TeaModel {
    @NameInMap("TaskId")
    public String taskId;

    public static RetryLinkefabricFabricTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        RetryLinkefabricFabricTaskRequest self = new RetryLinkefabricFabricTaskRequest();
        return TeaModel.build(map, self);
    }

    public RetryLinkefabricFabricTaskRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
