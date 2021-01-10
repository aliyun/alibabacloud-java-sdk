// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DisableLinkelinkflowLinkflowTaskRequest extends TeaModel {
    @NameInMap("Comment")
    public String comment;

    @NameInMap("OperatorId")
    public String operatorId;

    @NameInMap("TaskId")
    public String taskId;

    public static DisableLinkelinkflowLinkflowTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        DisableLinkelinkflowLinkflowTaskRequest self = new DisableLinkelinkflowLinkflowTaskRequest();
        return TeaModel.build(map, self);
    }

    public DisableLinkelinkflowLinkflowTaskRequest setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public DisableLinkelinkflowLinkflowTaskRequest setOperatorId(String operatorId) {
        this.operatorId = operatorId;
        return this;
    }
    public String getOperatorId() {
        return this.operatorId;
    }

    public DisableLinkelinkflowLinkflowTaskRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
