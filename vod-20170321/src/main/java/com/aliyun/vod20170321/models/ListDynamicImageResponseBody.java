// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class ListDynamicImageResponseBody extends TeaModel {
    /**
     * <p>The format of the animated sticker. Valid values: gif and webp.</p>
     */
    @NameInMap("DynamicImageList")
    public java.util.List<ListDynamicImageResponseBodyDynamicImageList> dynamicImageList;

    /**
     * <p>The operation that you want to perform. Set the value to **ListDynamicImage**.</p>
     */
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
        /**
         * <p>The job ID for creating the animated sticker.</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("Duration")
        public String duration;

        @NameInMap("DynamicImageId")
        public String dynamicImageId;

        @NameInMap("FileSize")
        public String fileSize;

        /**
         * <p>The time when the animated sticker was created. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.</p>
         */
        @NameInMap("FileURL")
        public String fileURL;

        @NameInMap("Format")
        public String format;

        /**
         * <p>Queries the information about animated stickers of a video based on the video ID.</p>
         */
        @NameInMap("Fps")
        public String fps;

        /**
         * <p>The frame rate of the animated sticker. Unit: frames per second.</p>
         */
        @NameInMap("Height")
        public String height;

        /**
         * <p>The ID of the request.</p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <p>The duration of the animated sticker. Unit: seconds.</p>
         */
        @NameInMap("VideoId")
        public String videoId;

        /**
         * <p>The list of animated stickers.</p>
         */
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
