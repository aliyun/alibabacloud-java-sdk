// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class ListAIImageInfoResponseBody extends TeaModel {
    /**
     * <p>The image files that are uploaded for AI processing.</p>
     */
    @NameInMap("AIImageInfoList")
    public java.util.List<ListAIImageInfoResponseBodyAIImageInfoList> AIImageInfoList;

    /**
     * <p>The ID of the request.</p>
     */
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
        /**
         * <p>The ID of the image information.</p>
         */
        @NameInMap("AIImageInfoId")
        public String AIImageInfoId;

        /**
         * <p>The time when the file was created. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The URL of the image file.</p>
         */
        @NameInMap("FileURL")
        public String fileURL;

        /**
         * <p>The format of the image. Valid values: **gif** and **png**.</p>
         */
        @NameInMap("Format")
        public String format;

        /**
         * <p>The ID of the image AI processing job.</p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <p>The score of the image.</p>
         */
        @NameInMap("Score")
        public String score;

        /**
         * <p>The data version ID.</p>
         */
        @NameInMap("Version")
        public String version;

        /**
         * <p>The ID of the video.</p>
         */
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
