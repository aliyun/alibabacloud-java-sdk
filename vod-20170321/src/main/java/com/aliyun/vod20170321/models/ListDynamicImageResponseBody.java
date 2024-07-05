// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class ListDynamicImageResponseBody extends TeaModel {
    /**
     * <p>The list of animated stickers.</p>
     */
    @NameInMap("DynamicImageList")
    public java.util.List<ListDynamicImageResponseBodyDynamicImageList> dynamicImageList;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>570189B6-572E-4953-13B4278EE0D8****</p>
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
         * <p>The time when the animated sticker was created. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-07-28T02:01:06Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The duration of the animated sticker. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Duration")
        public String duration;

        /**
         * <p>The ID of the animated sticker.</p>
         * 
         * <strong>example:</strong>
         * <p>2b4e51df60323ef43d6e336ecf****</p>
         */
        @NameInMap("DynamicImageId")
        public String dynamicImageId;

        /**
         * <p>The size of the animated sticker file. Unit: byte.</p>
         * 
         * <strong>example:</strong>
         * <p>119866</p>
         */
        @NameInMap("FileSize")
        public String fileSize;

        /**
         * <p>The URL of the animated sticker file.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.aliyundoc.com/2e114f110059*****0c3193918fd449a/image/dynamic/2b4e51df60*****323ef43d6e336ecf.webp?auth_key=1597296785-0-0-4a48e85*****bd2bb358e0b3cade">https://example.aliyundoc.com/2e114f110059*****0c3193918fd449a/image/dynamic/2b4e51df60*****323ef43d6e336ecf.webp?auth_key=1597296785-0-0-4a48e85*****bd2bb358e0b3cade</a></p>
         */
        @NameInMap("FileURL")
        public String fileURL;

        /**
         * <p>The format of the animated sticker. Valid values: gif and webp.</p>
         * 
         * <strong>example:</strong>
         * <p>webp</p>
         */
        @NameInMap("Format")
        public String format;

        /**
         * <p>The frame rate of the animated sticker. Unit: frames per second.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Fps")
        public String fps;

        /**
         * <p>The height of the animated sticker. Unit: pixel.</p>
         * 
         * <strong>example:</strong>
         * <p>360</p>
         */
        @NameInMap("Height")
        public String height;

        /**
         * <p>The job ID for creating the animated sticker.</p>
         * 
         * <strong>example:</strong>
         * <p>2bf4390af9e5491c09cc720ad****</p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <p>The ID of the video.</p>
         * 
         * <strong>example:</strong>
         * <p>2e114f1100590c3193918fd449a****</p>
         */
        @NameInMap("VideoId")
        public String videoId;

        /**
         * <p>The width of the animated sticker. Unit: pixel.</p>
         * 
         * <strong>example:</strong>
         * <p>640</p>
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
