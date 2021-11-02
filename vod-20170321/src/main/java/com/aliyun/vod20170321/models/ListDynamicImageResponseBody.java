// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class ListDynamicImageResponseBody extends TeaModel {
    @NameInMap("DynamicImageList")
    public java.util.List<ListDynamicImageResponseBodyDynamicImageList> dynamicImageList;

    @NameInMap("RequestId")
    public String requestId;

    public static ListDynamicImageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDynamicImageResponseBody self = new ListDynamicImageResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDynamicImageResponseBody setDynamicImageList(java.util.List<ListDynamicImageResponseBodyDynamicImageList> dynamicImageList) {
        this.dynamicImageList = dynamicImageList;
        return this;
    }
    public java.util.List<ListDynamicImageResponseBodyDynamicImageList> getDynamicImageList() {
        return this.dynamicImageList;
    }

    public ListDynamicImageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListDynamicImageResponseBodyDynamicImageList extends TeaModel {
        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("Duration")
        public String duration;

        @NameInMap("DynamicImageId")
        public String dynamicImageId;

        @NameInMap("FileSize")
        public String fileSize;

        @NameInMap("FileURL")
        public String fileURL;

        @NameInMap("Format")
        public String format;

        @NameInMap("Fps")
        public String fps;

        @NameInMap("Height")
        public String height;

        @NameInMap("JobId")
        public String jobId;

        @NameInMap("VideoId")
        public String videoId;

        @NameInMap("Width")
        public String width;

        public static ListDynamicImageResponseBodyDynamicImageList build(java.util.Map<String, ?> map) throws Exception {
            ListDynamicImageResponseBodyDynamicImageList self = new ListDynamicImageResponseBodyDynamicImageList();
            return TeaModel.build(map, self);
        }

        public ListDynamicImageResponseBodyDynamicImageList setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public ListDynamicImageResponseBodyDynamicImageList setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public ListDynamicImageResponseBodyDynamicImageList setDynamicImageId(String dynamicImageId) {
            this.dynamicImageId = dynamicImageId;
            return this;
        }
        public String getDynamicImageId() {
            return this.dynamicImageId;
        }

        public ListDynamicImageResponseBodyDynamicImageList setFileSize(String fileSize) {
            this.fileSize = fileSize;
            return this;
        }
        public String getFileSize() {
            return this.fileSize;
        }

        public ListDynamicImageResponseBodyDynamicImageList setFileURL(String fileURL) {
            this.fileURL = fileURL;
            return this;
        }
        public String getFileURL() {
            return this.fileURL;
        }

        public ListDynamicImageResponseBodyDynamicImageList setFormat(String format) {
            this.format = format;
            return this;
        }
        public String getFormat() {
            return this.format;
        }

        public ListDynamicImageResponseBodyDynamicImageList setFps(String fps) {
            this.fps = fps;
            return this;
        }
        public String getFps() {
            return this.fps;
        }

        public ListDynamicImageResponseBodyDynamicImageList setHeight(String height) {
            this.height = height;
            return this;
        }
        public String getHeight() {
            return this.height;
        }

        public ListDynamicImageResponseBodyDynamicImageList setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public ListDynamicImageResponseBodyDynamicImageList setVideoId(String videoId) {
            this.videoId = videoId;
            return this;
        }
        public String getVideoId() {
            return this.videoId;
        }

        public ListDynamicImageResponseBodyDynamicImageList setWidth(String width) {
            this.width = width;
            return this;
        }
        public String getWidth() {
            return this.width;
        }

    }

}
