// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class InitDWSTaskRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("TaskModelJsonStr")
    public String taskModelJsonStr;

    public static InitDWSTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        InitDWSTaskRequest self = new InitDWSTaskRequest();
        return TeaModel.build(map, self);
    }

    public InitDWSTaskRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public InitDWSTaskRequest setTaskModelJsonStr(String taskModelJsonStr) {
        this.taskModelJsonStr = taskModelJsonStr;
        return this;
    }
    public String getTaskModelJsonStr() {
        return this.taskModelJsonStr;
    }

}
