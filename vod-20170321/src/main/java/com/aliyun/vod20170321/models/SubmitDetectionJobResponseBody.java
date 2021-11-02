// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SubmitDetectionJobResponseBody extends TeaModel {
    @NameInMap("DetectionJob")
    public SubmitDetectionJobResponseBodyDetectionJob detectionJob;

    @NameInMap("RequestId")
    public String requestId;

    public static SubmitDetectionJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitDetectionJobResponseBody self = new SubmitDetectionJobResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitDetectionJobResponseBody setDetectionJob(SubmitDetectionJobResponseBodyDetectionJob detectionJob) {
        this.detectionJob = detectionJob;
        return this;
    }
    public SubmitDetectionJobResponseBodyDetectionJob getDetectionJob() {
        return this.detectionJob;
    }

    public SubmitDetectionJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class SubmitDetectionJobResponseBodyDetectionJob extends TeaModel {
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

        public static SubmitDetectionJobResponseBodyDetectionJob build(java.util.Map<String, ?> map) throws Exception {
            SubmitDetectionJobResponseBodyDetectionJob self = new SubmitDetectionJobResponseBodyDetectionJob();
            return TeaModel.build(map, self);
        }

        public SubmitDetectionJobResponseBodyDetectionJob setBeginTime(String beginTime) {
            this.beginTime = beginTime;
            return this;
        }
        public String getBeginTime() {
            return this.beginTime;
        }

        public SubmitDetectionJobResponseBodyDetectionJob setCopyrightBeginTime(String copyrightBeginTime) {
            this.copyrightBeginTime = copyrightBeginTime;
            return this;
        }
        public String getCopyrightBeginTime() {
            return this.copyrightBeginTime;
        }

        public SubmitDetectionJobResponseBodyDetectionJob setCopyrightEndTime(String copyrightEndTime) {
            this.copyrightEndTime = copyrightEndTime;
            return this;
        }
        public String getCopyrightEndTime() {
            return this.copyrightEndTime;
        }

        public SubmitDetectionJobResponseBodyDetectionJob setCopyrightFile(String copyrightFile) {
            this.copyrightFile = copyrightFile;
            return this;
        }
        public String getCopyrightFile() {
            return this.copyrightFile;
        }

        public SubmitDetectionJobResponseBodyDetectionJob setCopyrightStatus(String copyrightStatus) {
            this.copyrightStatus = copyrightStatus;
            return this;
        }
        public String getCopyrightStatus() {
            return this.copyrightStatus;
        }

        public SubmitDetectionJobResponseBodyDetectionJob setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public SubmitDetectionJobResponseBodyDetectionJob setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public SubmitDetectionJobResponseBodyDetectionJob setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public SubmitDetectionJobResponseBodyDetectionJob setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

        public SubmitDetectionJobResponseBodyDetectionJob setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

        public SubmitDetectionJobResponseBodyDetectionJob setVideoId(String videoId) {
            this.videoId = videoId;
            return this;
        }
        public String getVideoId() {
            return this.videoId;
        }

        public SubmitDetectionJobResponseBodyDetectionJob setWhitelistUrls(String whitelistUrls) {
            this.whitelistUrls = whitelistUrls;
            return this;
        }
        public String getWhitelistUrls() {
            return this.whitelistUrls;
        }

    }

}
