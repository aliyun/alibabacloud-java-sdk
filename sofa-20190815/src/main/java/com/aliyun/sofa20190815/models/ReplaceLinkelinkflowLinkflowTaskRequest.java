// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ReplaceLinkelinkflowLinkflowTaskRequest extends TeaModel {
    @NameInMap("OperatorId")
    public String operatorId;

    @NameInMap("ReAssignUserIdsRepeatList")
    public java.util.List<String> reAssignUserIdsRepeatList;

    @NameInMap("TaskId")
    public String taskId;

    public static ReplaceLinkelinkflowLinkflowTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        ReplaceLinkelinkflowLinkflowTaskRequest self = new ReplaceLinkelinkflowLinkflowTaskRequest();
        return TeaModel.build(map, self);
    }

    public ReplaceLinkelinkflowLinkflowTaskRequest setOperatorId(String operatorId) {
        this.operatorId = operatorId;
        return this;
    }
    public String getOperatorId() {
        return this.operatorId;
    }

    public ReplaceLinkelinkflowLinkflowTaskRequest setReAssignUserIdsRepeatList(java.util.List<String> reAssignUserIdsRepeatList) {
        this.reAssignUserIdsRepeatList = reAssignUserIdsRepeatList;
        return this;
    }
    public java.util.List<String> getReAssignUserIdsRepeatList() {
        return this.reAssignUserIdsRepeatList;
    }

    public ReplaceLinkelinkflowLinkflowTaskRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
