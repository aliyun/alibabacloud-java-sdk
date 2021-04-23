// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videosearch20200225.models;

import com.aliyun.tea.*;

public class ModifyPriorityRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("TaskId")
    @Validation(required = true)
    public String taskId;

    @NameInMap("Sort")
    @Validation(required = true)
    public Integer sort;

    public static ModifyPriorityRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyPriorityRequest self = new ModifyPriorityRequest();
        return TeaModel.build(map, self);
    }

    public ModifyPriorityRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ModifyPriorityRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public ModifyPriorityRequest setSort(Integer sort) {
        this.sort = sort;
        return this;
    }
    public Integer getSort() {
        return this.sort;
    }

}
