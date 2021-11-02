// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyPushAllTaskRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("Tasks")
    public String tasks;

    @NameInMap("Uuids")
    public String uuids;

    public static ModifyPushAllTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyPushAllTaskRequest self = new ModifyPushAllTaskRequest();
        return TeaModel.build(map, self);
    }

    public ModifyPushAllTaskRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public ModifyPushAllTaskRequest setTasks(String tasks) {
        this.tasks = tasks;
        return this;
    }
    public String getTasks() {
        return this.tasks;
    }

    public ModifyPushAllTaskRequest setUuids(String uuids) {
        this.uuids = uuids;
        return this;
    }
    public String getUuids() {
        return this.uuids;
    }

}
