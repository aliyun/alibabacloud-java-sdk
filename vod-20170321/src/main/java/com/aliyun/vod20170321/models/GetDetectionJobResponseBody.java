// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetDetectionJobResponseBody extends TeaModel {
    @NameInMap("DetectionJob")
    public GetDetectionJobResponseBodyDetectionJob detectionJob;

    @NameInMap("RequestId")
    public String requestId;

    public static GetDetectionJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDetectionJobResponseBody self = new GetDetectionJobResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDetectionJobResponseBody setDetectionJob(GetDetectionJobResponseBodyDetectionJob detectionJob) {
        this.detectionJob = detectionJob;
        return this;
    }
    public GetDetectionJobResponseBodyDetectionJob getDetectionJob() {
        return this.detectionJob;
    }

    public GetDetectionJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetDetectionJobResponseBodyDetectionJob extends TeaModel {
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

        public static GetDetectionJobResponseBodyDetectionJob build(java.util.Map<String, ?> map) throws Exception {
            GetDetectionJobResponseBodyDetectionJob self = new GetDetectionJobResponseBodyDetectionJob();
            return TeaModel.build(map, self);
        }

        public GetDetectionJobResponseBodyDetectionJob setBeginTime(String beginTime) {
            this.beginTime = beginTime;
            return this;
        }
        public String getBeginTime() {
            return this.beginTime;
        }

        public GetDetectionJobResponseBodyDetectionJob setCopyrightBeginTime(String copyrightBeginTime) {
            this.copyrightBeginTime = copyrightBeginTime;
            return this;
        }
        public String getCopyrightBeginTime() {
            return this.copyrightBeginTime;
        }

        public GetDetectionJobResponseBodyDetectionJob setCopyrightEndTime(String copyrightEndTime) {
            this.copyrightEndTime = copyrightEndTime;
            return this;
        }
        public String getCopyrightEndTime() {
            return this.copyrightEndTime;
        }

        public GetDetectionJobResponseBodyDetectionJob setCopyrightFile(String copyrightFile) {
            this.copyrightFile = copyrightFile;
            return this;
        }
        public String getCopyrightFile() {
            return this.copyrightFile;
        }

        public GetDetectionJobResponseBodyDetectionJob setCopyrightStatus(String copyrightStatus) {
            this.copyrightStatus = copyrightStatus;
            return this;
        }
        public String getCopyrightStatus() {
            return this.copyrightStatus;
        }

        public GetDetectionJobResponseBodyDetectionJob setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetDetectionJobResponseBodyDetectionJob setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public GetDetectionJobResponseBodyDetectionJob setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public GetDetectionJobResponseBodyDetectionJob setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

        public GetDetectionJobResponseBodyDetectionJob setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

        public GetDetectionJobResponseBodyDetectionJob setVideoId(String videoId) {
            this.videoId = videoId;
            return this;
        }
        public String getVideoId() {
            return this.videoId;
        }

        public GetDetectionJobResponseBodyDetectionJob setWhitelistUrls(String whitelistUrls) {
            this.whitelistUrls = whitelistUrls;
            return this;
        }
        public String getWhitelistUrls() {
            return this.whitelistUrls;
        }

    }

}
