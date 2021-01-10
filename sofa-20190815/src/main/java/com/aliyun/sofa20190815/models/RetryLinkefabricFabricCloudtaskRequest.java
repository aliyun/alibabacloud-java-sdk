// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class RetryLinkefabricFabricCloudtaskRequest extends TeaModel {
    @NameInMap("TaskId")
    public String taskId;

    public static RetryLinkefabricFabricCloudtaskRequest build(java.util.Map<String, ?> map) throws Exception {
        RetryLinkefabricFabricCloudtaskRequest self = new RetryLinkefabricFabricCloudtaskRequest();
        return TeaModel.build(map, self);
    }

    public RetryLinkefabricFabricCloudtaskRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
