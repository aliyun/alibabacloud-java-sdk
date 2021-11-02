// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SubmitTranscodeJobsRequest extends TeaModel {
    @NameInMap("EncryptConfig")
    public String encryptConfig;

    @NameInMap("OverrideParams")
    public String overrideParams;

    @NameInMap("PipelineId")
    public String pipelineId;

    @NameInMap("Priority")
    public String priority;

    @NameInMap("TemplateGroupId")
    public String templateGroupId;

    @NameInMap("UserData")
    public String userData;

    @NameInMap("VideoId")
    public String videoId;

    public static SubmitTranscodeJobsRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitTranscodeJobsRequest self = new SubmitTranscodeJobsRequest();
        return TeaModel.build(map, self);
    }

    public SubmitTranscodeJobsRequest setEncryptConfig(String encryptConfig) {
        this.encryptConfig = encryptConfig;
        return this;
    }
    public String getEncryptConfig() {
        return this.encryptConfig;
    }

    public SubmitTranscodeJobsRequest setOverrideParams(String overrideParams) {
        this.overrideParams = overrideParams;
        return this;
    }
    public String getOverrideParams() {
        return this.overrideParams;
    }

    public SubmitTranscodeJobsRequest setPipelineId(String pipelineId) {
        this.pipelineId = pipelineId;
        return this;
    }
    public String getPipelineId() {
        return this.pipelineId;
    }

    public SubmitTranscodeJobsRequest setPriority(String priority) {
        this.priority = priority;
        return this;
    }
    public String getPriority() {
        return this.priority;
    }

    public SubmitTranscodeJobsRequest setTemplateGroupId(String templateGroupId) {
        this.templateGroupId = templateGroupId;
        return this;
    }
    public String getTemplateGroupId() {
        return this.templateGroupId;
    }

    public SubmitTranscodeJobsRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

    public SubmitTranscodeJobsRequest setVideoId(String videoId) {
        this.videoId = videoId;
        return this;
    }
    public String getVideoId() {
        return this.videoId;
    }

}
