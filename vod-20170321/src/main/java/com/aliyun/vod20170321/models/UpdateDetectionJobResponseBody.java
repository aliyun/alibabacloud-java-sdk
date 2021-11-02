// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class UpdateDetectionJobResponseBody extends TeaModel {
    @NameInMap("DetectionJob")
    public UpdateDetectionJobResponseBodyDetectionJob detectionJob;

    @NameInMap("RequestId")
    public String requestId;

    public static UpdateDetectionJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateDetectionJobResponseBody self = new UpdateDetectionJobResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateDetectionJobResponseBody setDetectionJob(UpdateDetectionJobResponseBodyDetectionJob detectionJob) {
        this.detectionJob = detectionJob;
        return this;
    }
    public UpdateDetectionJobResponseBodyDetectionJob getDetectionJob() {
        return this.detectionJob;
    }

    public UpdateDetectionJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class UpdateDetectionJobResponseBodyDetectionJob extends TeaModel {
        @NameInMap("BeginTime")
        public String beginTime;

        @NameInMap("CopyrightBeginTime")
        public String copyrightBeginTime;

        @NameInMap("CopyrightEndTime")
        public String copyrightEndTime;

        @NameInMap("CopyrightFile")
        public String copyrightFile;

        @NameInMap("CopyrightStatus")
        public String copyrightStatus;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("JobId")
        public String jobId;

        @NameInMap("ModifyTime")
        public String modifyTime;

        @NameInMap("TemplateId")
        public String templateId;

        @NameInMap("VideoId")
        public String videoId;

        @NameInMap("WhitelistUrls")
        public String whitelistUrls;

        public static UpdateDetectionJobResponseBodyDetectionJob build(java.util.Map<String, ?> map) throws Exception {
            UpdateDetectionJobResponseBodyDetectionJob self = new UpdateDetectionJobResponseBodyDetectionJob();
            return TeaModel.build(map, self);
        }

        public UpdateDetectionJobResponseBodyDetectionJob setBeginTime(String beginTime) {
            this.beginTime = beginTime;
            return this;
        }
        public String getBeginTime() {
            return this.beginTime;
        }

        public UpdateDetectionJobResponseBodyDetectionJob setCopyrightBeginTime(String copyrightBeginTime) {
            this.copyrightBeginTime = copyrightBeginTime;
            return this;
        }
        public String getCopyrightBeginTime() {
            return this.copyrightBeginTime;
        }

        public UpdateDetectionJobResponseBodyDetectionJob setCopyrightEndTime(String copyrightEndTime) {
            this.copyrightEndTime = copyrightEndTime;
            return this;
        }
        public String getCopyrightEndTime() {
            return this.copyrightEndTime;
        }

        public UpdateDetectionJobResponseBodyDetectionJob setCopyrightFile(String copyrightFile) {
            this.copyrightFile = copyrightFile;
            return this;
        }
        public String getCopyrightFile() {
            return this.copyrightFile;
        }

        public UpdateDetectionJobResponseBodyDetectionJob setCopyrightStatus(String copyrightStatus) {
            this.copyrightStatus = copyrightStatus;
            return this;
        }
        public String getCopyrightStatus() {
            return this.copyrightStatus;
        }

        public UpdateDetectionJobResponseBodyDetectionJob setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public UpdateDetectionJobResponseBodyDetectionJob setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public UpdateDetectionJobResponseBodyDetectionJob setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public UpdateDetectionJobResponseBodyDetectionJob setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

        public UpdateDetectionJobResponseBodyDetectionJob setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

        public UpdateDetectionJobResponseBodyDetectionJob setVideoId(String videoId) {
            this.videoId = videoId;
            return this;
        }
        public String getVideoId() {
            return this.videoId;
        }

        public UpdateDetectionJobResponseBodyDetectionJob setWhitelistUrls(String whitelistUrls) {
            this.whitelistUrls = whitelistUrls;
            return this;
        }
        public String getWhitelistUrls() {
            return this.whitelistUrls;
        }

    }

}
