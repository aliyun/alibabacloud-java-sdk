// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SubmitDetectionJobRequest extends TeaModel {
    @NameInMap("VideoId")
    public String videoId;

    @NameInMap("CopyrightStatus")
    public String copyrightStatus;

    @NameInMap("CopyrightBeginTime")
    public String copyrightBeginTime;

    @NameInMap("CopyrightEndTime")
    public String copyrightEndTime;

    @NameInMap("CopyrightFile")
    public String copyrightFile;

    @NameInMap("WhiteListUrls")
    public String whiteListUrls;

    @NameInMap("TemplateId")
    public String templateId;

    @NameInMap("BeginTime")
    public String beginTime;

    @NameInMap("Duration")
    public Integer duration;

    @NameInMap("ShortVideo")
    public Boolean shortVideo;

    public static SubmitDetectionJobRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitDetectionJobRequest self = new SubmitDetectionJobRequest();
        return TeaModel.build(map, self);
    }

    public SubmitDetectionJobRequest setVideoId(String videoId) {
        this.videoId = videoId;
        return this;
    }
    public String getVideoId() {
        return this.videoId;
    }

    public SubmitDetectionJobRequest setCopyrightStatus(String copyrightStatus) {
        this.copyrightStatus = copyrightStatus;
        return this;
    }
    public String getCopyrightStatus() {
        return this.copyrightStatus;
    }

    public SubmitDetectionJobRequest setCopyrightBeginTime(String copyrightBeginTime) {
        this.copyrightBeginTime = copyrightBeginTime;
        return this;
    }
    public String getCopyrightBeginTime() {
        return this.copyrightBeginTime;
    }

    public SubmitDetectionJobRequest setCopyrightEndTime(String copyrightEndTime) {
        this.copyrightEndTime = copyrightEndTime;
        return this;
    }
    public String getCopyrightEndTime() {
        return this.copyrightEndTime;
    }

    public SubmitDetectionJobRequest setCopyrightFile(String copyrightFile) {
        this.copyrightFile = copyrightFile;
        return this;
    }
    public String getCopyrightFile() {
        return this.copyrightFile;
    }

    public SubmitDetectionJobRequest setWhiteListUrls(String whiteListUrls) {
        this.whiteListUrls = whiteListUrls;
        return this;
    }
    public String getWhiteListUrls() {
        return this.whiteListUrls;
    }

    public SubmitDetectionJobRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public SubmitDetectionJobRequest setBeginTime(String beginTime) {
        this.beginTime = beginTime;
        return this;
    }
    public String getBeginTime() {
        return this.beginTime;
    }

    public SubmitDetectionJobRequest setDuration(Integer duration) {
        this.duration = duration;
        return this;
    }
    public Integer getDuration() {
        return this.duration;
    }

    public SubmitDetectionJobRequest setShortVideo(Boolean shortVideo) {
        this.shortVideo = shortVideo;
        return this;
    }
    public Boolean getShortVideo() {
        return this.shortVideo;
    }

}
