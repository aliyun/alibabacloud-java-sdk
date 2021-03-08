// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class ListAIImageInfoResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("AIImageInfoList")
    public java.util.List<ListAIImageInfoResponseBodyAIImageInfoList> AIImageInfoList;

    public static ListAIImageInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAIImageInfoResponseBody self = new ListAIImageInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAIImageInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAIImageInfoResponseBody setAIImageInfoList(java.util.List<ListAIImageInfoResponseBodyAIImageInfoList> AIImageInfoList) {
        this.AIImageInfoList = AIImageInfoList;
        return this;
    }
    public java.util.List<ListAIImageInfoResponseBodyAIImageInfoList> getAIImageInfoList() {
        return this.AIImageInfoList;
    }

    public static class ListAIImageInfoResponseBodyAIImageInfoList extends TeaModel {
        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("AIImageInfoId")
        public String AIImageInfoId;

        @NameInMap("FileURL")
        public String fileURL;

        @NameInMap("Version")
        public String version;

        @NameInMap("VideoId")
        public String videoId;

        @NameInMap("JobId")
        public String jobId;

        @NameInMap("Score")
        public String score;

        @NameInMap("Format")
        public String format;

        public static ListAIImageInfoResponseBodyAIImageInfoList build(java.util.Map<String, ?> map) throws Exception {
            ListAIImageInfoResponseBodyAIImageInfoList self = new ListAIImageInfoResponseBodyAIImageInfoList();
            return TeaModel.build(map, self);
        }

        public ListAIImageInfoResponseBodyAIImageInfoList setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public ListAIImageInfoResponseBodyAIImageInfoList setAIImageInfoId(String AIImageInfoId) {
            this.AIImageInfoId = AIImageInfoId;
            return this;
        }
        public String getAIImageInfoId() {
            return this.AIImageInfoId;
        }

        public ListAIImageInfoResponseBodyAIImageInfoList setFileURL(String fileURL) {
            this.fileURL = fileURL;
            return this;
        }
        public String getFileURL() {
            return this.fileURL;
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

        public ListAIImageInfoResponseBodyAIImageInfoList setFormat(String format) {
            this.format = format;
            return this;
        }
        public String getFormat() {
            return this.format;
        }

    }

}
