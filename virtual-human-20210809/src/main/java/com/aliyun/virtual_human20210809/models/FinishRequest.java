// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.virtual_human20210809.models;

import com.aliyun.tea.*;

public class FinishRequest extends TeaModel {
    @NameInMap("TaskId")
    public String taskId;

    @NameInMap("VirtualHumanCode")
    public String virtualHumanCode;

    public static FinishRequest build(java.util.Map<String, ?> map) throws Exception {
        FinishRequest self = new FinishRequest();
        return TeaModel.build(map, self);
    }

    public FinishRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public FinishRequest setVirtualHumanCode(String virtualHumanCode) {
        this.virtualHumanCode = virtualHumanCode;
        return this;
    }
    public String getVirtualHumanCode() {
        return this.virtualHumanCode;
    }

}
