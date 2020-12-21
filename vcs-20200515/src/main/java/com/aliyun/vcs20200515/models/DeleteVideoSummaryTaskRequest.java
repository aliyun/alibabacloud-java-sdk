// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class DeleteVideoSummaryTaskRequest extends TeaModel {
    @NameInMap("CorpId")
    public String corpId;

    @NameInMap("TaskId")
    public String taskId;

    public static DeleteVideoSummaryTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteVideoSummaryTaskRequest self = new DeleteVideoSummaryTaskRequest();
        return TeaModel.build(map, self);
    }

    public DeleteVideoSummaryTaskRequest setCorpId(String corpId) {
        this.corpId = corpId;
        return this;
    }
    public String getCorpId() {
        return this.corpId;
    }

    public DeleteVideoSummaryTaskRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
