// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class GetVideoSummaryTaskResultRequest extends TeaModel {
    @NameInMap("CorpId")
    public String corpId;

    @NameInMap("TaskId")
    public String taskId;

    public static GetVideoSummaryTaskResultRequest build(java.util.Map<String, ?> map) throws Exception {
        GetVideoSummaryTaskResultRequest self = new GetVideoSummaryTaskResultRequest();
        return TeaModel.build(map, self);
    }

    public GetVideoSummaryTaskResultRequest setCorpId(String corpId) {
        this.corpId = corpId;
        return this;
    }
    public String getCorpId() {
        return this.corpId;
    }

    public GetVideoSummaryTaskResultRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
