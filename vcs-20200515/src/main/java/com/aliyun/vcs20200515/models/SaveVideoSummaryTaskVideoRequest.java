// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class SaveVideoSummaryTaskVideoRequest extends TeaModel {
    @NameInMap("CorpId")
    public String corpId;

    @NameInMap("TaskId")
    public Long taskId;

    @NameInMap("SaveVideo")
    public Boolean saveVideo;

    public static SaveVideoSummaryTaskVideoRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveVideoSummaryTaskVideoRequest self = new SaveVideoSummaryTaskVideoRequest();
        return TeaModel.build(map, self);
    }

    public SaveVideoSummaryTaskVideoRequest setCorpId(String corpId) {
        this.corpId = corpId;
        return this;
    }
    public String getCorpId() {
        return this.corpId;
    }

    public SaveVideoSummaryTaskVideoRequest setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

    public SaveVideoSummaryTaskVideoRequest setSaveVideo(Boolean saveVideo) {
        this.saveVideo = saveVideo;
        return this;
    }
    public Boolean getSaveVideo() {
        return this.saveVideo;
    }

}
