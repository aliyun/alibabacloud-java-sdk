// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DisableDWSTaskSubscribeRequest extends TeaModel {
    @NameInMap("DestroyStore")
    public Boolean destroyStore;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("TaskId")
    public String taskId;

    public static DisableDWSTaskSubscribeRequest build(java.util.Map<String, ?> map) throws Exception {
        DisableDWSTaskSubscribeRequest self = new DisableDWSTaskSubscribeRequest();
        return TeaModel.build(map, self);
    }

    public DisableDWSTaskSubscribeRequest setDestroyStore(Boolean destroyStore) {
        this.destroyStore = destroyStore;
        return this;
    }
    public Boolean getDestroyStore() {
        return this.destroyStore;
    }

    public DisableDWSTaskSubscribeRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DisableDWSTaskSubscribeRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
