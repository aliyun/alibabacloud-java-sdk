// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SubmitAICaptionExtractionJobRequest extends TeaModel {
    @NameInMap("VideoId")
    public String videoId;

    @NameInMap("JobConfig")
    public String jobConfig;

    @NameInMap("AIPipelineId")
    public String AIPipelineId;

    @NameInMap("UserData")
    public String userData;

    public static SubmitAICaptionExtractionJobRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitAICaptionExtractionJobRequest self = new SubmitAICaptionExtractionJobRequest();
        return TeaModel.build(map, self);
    }

    public SubmitAICaptionExtractionJobRequest setVideoId(String videoId) {
        this.videoId = videoId;
        return this;
    }
    public String getVideoId() {
        return this.videoId;
    }

    public SubmitAICaptionExtractionJobRequest setJobConfig(String jobConfig) {
        this.jobConfig = jobConfig;
        return this;
    }
    public String getJobConfig() {
        return this.jobConfig;
    }

    public SubmitAICaptionExtractionJobRequest setAIPipelineId(String AIPipelineId) {
        this.AIPipelineId = AIPipelineId;
        return this;
    }
    public String getAIPipelineId() {
        return this.AIPipelineId;
    }

    public SubmitAICaptionExtractionJobRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

}
