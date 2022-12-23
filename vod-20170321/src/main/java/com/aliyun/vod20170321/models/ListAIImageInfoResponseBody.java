// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class ListAIImageInfoResponseBody extends TeaModel {
    // The image files that are uploaded for AI processing.
    @NameInMap("AIImageInfoList")
    public java.util.List<ListAIImageInfoResponseBodyAIImageInfoList> AIImageInfoList;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    public static ListAIImageInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAIImageInfoResponseBody self = new ListAIImageInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAIImageInfoResponseBody setAIImageInfoList(java.util.List<ListAIImageInfoResponseBodyAIImageInfoList> AIImageInfoList) {
        this.AIImageInfoList = AIImageInfoList;
        return this;
    }
    public java.util.List<ListAIImageInfoResponseBodyAIImageInfoList> getAIImageInfoList() {
        return this.AIImageInfoList;
    }

    public ListAIImageInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListAIImageInfoResponseBodyAIImageInfoList extends TeaModel {
        // The ID of the image information.
        @NameInMap("AIImageInfoId")
        public String AIImageInfoId;

        // The time when the file was created. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.
        @NameInMap("CreationTime")
        public String creationTime;

        // The URL of the image file.
        @NameInMap("FileURL")
        public String fileURL;

        // The format of the image. Valid values: **gif** and **png**.
        @NameInMap("Format")
        public String format;

        // The ID of the image AI processing job.
        @NameInMap("JobId")
        public String jobId;

        // The score of the image.
        @NameInMap("Score")
        public String score;

        // The data version ID.
        @NameInMap("Version")
        public String version;

        // The ID of the video.
        @NameInMap("VideoId")
        public String videoId;

        public static ListAIImageInfoResponseBodyAIImageInfoList build(java.util.Map<String, ?> map) throws Exception {
            ListAIImageInfoResponseBodyAIImageInfoList self = new ListAIImageInfoResponseBodyAIImageInfoList();
            return TeaModel.build(map, self);
        }

        public ListAIImageInfoResponseBodyAIImageInfoList setAIImageInfoId(String AIImageInfoId) {
            this.AIImageInfoId = AIImageInfoId;
            return this;
        }
        public String getAIImageInfoId() {
            return this.AIImageInfoId;
        }

        public ListAIImageInfoResponseBodyAIImageInfoList setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public ListAIImageInfoResponseBodyAIImageInfoList setFileURL(String fileURL) {
            this.fileURL = fileURL;
            return this;
        }
        public String getFileURL() {
            return this.fileURL;
        }

        public ListAIImageInfoResponseBodyAIImageInfoList setFormat(String format) {
            this.format = format;
            return this;
        }
        public String getFormat() {
            return this.format;
        }

        public ListAIImageInfoResponseBodyAIImageInfoList setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public ListAIImageInfoResponseBodyAIImageInfoList setScore(String score) {
            this.score = score;
            return this;
        }
        public String getScore() {
            return this.score;
        }

        public ListAIImageInfoResponseBodyAIImageInfoList setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public ListAIImageInfoResponseBodyAIImageInfoList setVideoId(String videoId) {
            this.videoId = videoId;
            return this;
        }
        public String getVideoId() {
            return this.videoId;
        }

    }

}
