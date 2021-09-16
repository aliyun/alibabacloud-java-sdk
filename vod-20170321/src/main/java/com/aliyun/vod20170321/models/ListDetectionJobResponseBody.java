// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class ListDetectionJobResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("DetectionJobList")
    public java.util.List<ListDetectionJobResponseBodyDetectionJobList> detectionJobList;

    public static ListDetectionJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDetectionJobResponseBody self = new ListDetectionJobResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDetectionJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDetectionJobResponseBody setDetectionJobList(java.util.List<ListDetectionJobResponseBodyDetectionJobList> detectionJobList) {
        this.detectionJobList = detectionJobList;
        return this;
    }
    public java.util.List<ListDetectionJobResponseBodyDetectionJobList> getDetectionJobList() {
        return this.detectionJobList;
    }

    public static class ListDetectionJobResponseBodyDetectionJobList extends TeaModel {
        @NameInMap("JobId")
        public String jobId;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("ModifyTime")
        public String modifyTime;

        @NameInMap("BeginTime")
        public String beginTime;

        @NameInMap("EndTime")
        public String endTime;

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

        @NameInMap("WhitelistUrls")
        public String whitelistUrls;

        @NameInMap("TemplateId")
        public String templateId;

        public static ListDetectionJobResponseBodyDetectionJobList build(java.util.Map<String, ?> map) throws Exception {
            ListDetectionJobResponseBodyDetectionJobList self = new ListDetectionJobResponseBodyDetectionJobList();
            return TeaModel.build(map, self);
        }

        public ListDetectionJobResponseBodyDetectionJobList setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public ListDetectionJobResponseBodyDetectionJobList setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListDetectionJobResponseBodyDetectionJobList setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

        public ListDetectionJobResponseBodyDetectionJobList setBeginTime(String beginTime) {
            this.beginTime = beginTime;
            return this;
        }
        public String getBeginTime() {
            return this.beginTime;
        }

        public ListDetectionJobResponseBodyDetectionJobList setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public ListDetectionJobResponseBodyDetectionJobList setVideoId(String videoId) {
            this.videoId = videoId;
            return this;
        }
        public String getVideoId() {
            return this.videoId;
        }

        public ListDetectionJobResponseBodyDetectionJobList setCopyrightStatus(String copyrightStatus) {
            this.copyrightStatus = copyrightStatus;
            return this;
        }
        public String getCopyrightStatus() {
            return this.copyrightStatus;
        }

        public ListDetectionJobResponseBodyDetectionJobList setCopyrightBeginTime(String copyrightBeginTime) {
            this.copyrightBeginTime = copyrightBeginTime;
            return this;
        }
        public String getCopyrightBeginTime() {
            return this.copyrightBeginTime;
        }

        public ListDetectionJobResponseBodyDetectionJobList setCopyrightEndTime(String copyrightEndTime) {
            this.copyrightEndTime = copyrightEndTime;
            return this;
        }
        public String getCopyrightEndTime() {
            return this.copyrightEndTime;
        }

        public ListDetectionJobResponseBodyDetectionJobList setCopyrightFile(String copyrightFile) {
            this.copyrightFile = copyrightFile;
            return this;
        }
        public String getCopyrightFile() {
            return this.copyrightFile;
        }

        public ListDetectionJobResponseBodyDetectionJobList setWhitelistUrls(String whitelistUrls) {
            this.whitelistUrls = whitelistUrls;
            return this;
        }
        public String getWhitelistUrls() {
            return this.whitelistUrls;
        }

        public ListDetectionJobResponseBodyDetectionJobList setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

    }

}
