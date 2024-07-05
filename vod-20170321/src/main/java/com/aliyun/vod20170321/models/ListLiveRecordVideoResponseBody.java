// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class ListLiveRecordVideoResponseBody extends TeaModel {
    /**
     * <p>The list of videos.</p>
     */
    @NameInMap("LiveRecordVideoList")
    public ListLiveRecordVideoResponseBodyLiveRecordVideoList liveRecordVideoList;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>25818875-5F78-4A13-****-D7393642CA58</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of videos.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("Total")
    public Integer total;

    public static ListLiveRecordVideoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListLiveRecordVideoResponseBody self = new ListLiveRecordVideoResponseBody();
        return TeaModel.build(map, self);
    }

    public ListLiveRecordVideoResponseBody setLiveRecordVideoList(ListLiveRecordVideoResponseBodyLiveRecordVideoList liveRecordVideoList) {
        this.liveRecordVideoList = liveRecordVideoList;
        return this;
    }
    public ListLiveRecordVideoResponseBodyLiveRecordVideoList getLiveRecordVideoList() {
        return this.liveRecordVideoList;
    }

    public ListLiveRecordVideoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListLiveRecordVideoResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public static class ListLiveRecordVideoResponseBodyLiveRecordVideoListLiveRecordVideoVideoSnapshots extends TeaModel {
        @NameInMap("Snapshot")
        public java.util.List<String> snapshot;

        public static ListLiveRecordVideoResponseBodyLiveRecordVideoListLiveRecordVideoVideoSnapshots build(java.util.Map<String, ?> map) throws Exception {
            ListLiveRecordVideoResponseBodyLiveRecordVideoListLiveRecordVideoVideoSnapshots self = new ListLiveRecordVideoResponseBodyLiveRecordVideoListLiveRecordVideoVideoSnapshots();
            return TeaModel.build(map, self);
        }

        public ListLiveRecordVideoResponseBodyLiveRecordVideoListLiveRecordVideoVideoSnapshots setSnapshot(java.util.List<String> snapshot) {
            this.snapshot = snapshot;
            return this;
        }
        public java.util.List<String> getSnapshot() {
            return this.snapshot;
        }

    }

    public static class ListLiveRecordVideoResponseBodyLiveRecordVideoListLiveRecordVideoVideo extends TeaModel {
        /**
         * <p>The ID of the video category.</p>
         * 
         * <strong>example:</strong>
         * <p>78</p>
         */
        @NameInMap("CateId")
        public Integer cateId;

        /**
         * <p>The category of the video.</p>
         * 
         * <strong>example:</strong>
         * <p>Category name</p>
         */
        @NameInMap("CateName")
        public String cateName;

        /**
         * <p>The URL of the video thumbnail.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.aliyundoc.com/coversample.jpg">https://example.aliyundoc.com/coversample.jpg</a></p>
         */
        @NameInMap("CoverURL")
        public String coverURL;

        /**
         * <p>The time when the audio or video file was created. The time is in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2017-12-08T07:40:56Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The description of the video file.</p>
         * 
         * <strong>example:</strong>
         * <p>Description of the ApsaraVideo VOD video</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The duration of the video file. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>135.6</p>
         */
        @NameInMap("Duration")
        public Float duration;

        /**
         * <p>The time when the video was updated. The time is in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2017-12-08T09:40:56Z</p>
         */
        @NameInMap("ModifyTime")
        public String modifyTime;

        /**
         * <p>The size of the source video file. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>10897890</p>
         */
        @NameInMap("Size")
        public Long size;

        /**
         * <p>The array of video snapshot URLs.</p>
         */
        @NameInMap("Snapshots")
        public ListLiveRecordVideoResponseBodyLiveRecordVideoListLiveRecordVideoVideoSnapshots snapshots;

        /**
         * <p>The status of the video. Valid values:</p>
         * <ul>
         * <li><strong>Uploading</strong></li>
         * <li><strong>UploadFail</strong></li>
         * <li><strong>UploadSuccess</strong></li>
         * <li><strong>Transcoding</strong></li>
         * <li><strong>TranscodeFail</strong></li>
         * <li><strong>Blocked</strong></li>
         * <li><strong>Normal</strong>: The video is normal.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The tags of the video. Multiple tags are separated with commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>tag1, tag2</p>
         */
        @NameInMap("Tags")
        public String tags;

        /**
         * <p>The ID of the transcoding template group.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TemplateGroupId")
        public String templateGroupId;

        /**
         * <p>The title of the video.</p>
         * 
         * <strong>example:</strong>
         * <p>Title of the ApsaraVideo VOD video</p>
         */
        @NameInMap("Title")
        public String title;

        /**
         * <p>The ID of the video.</p>
         * 
         * <strong>example:</strong>
         * <p>93ab850b4f6f*****54b6e91d24d81d4</p>
         */
        @NameInMap("VideoId")
        public String videoId;

        public static ListLiveRecordVideoResponseBodyLiveRecordVideoListLiveRecordVideoVideo build(java.util.Map<String, ?> map) throws Exception {
            ListLiveRecordVideoResponseBodyLiveRecordVideoListLiveRecordVideoVideo self = new ListLiveRecordVideoResponseBodyLiveRecordVideoListLiveRecordVideoVideo();
            return TeaModel.build(map, self);
        }

        public ListLiveRecordVideoResponseBodyLiveRecordVideoListLiveRecordVideoVideo setCateId(Integer cateId) {
            this.cateId = cateId;
            return this;
        }
        public Integer getCateId() {
            return this.cateId;
        }

        public ListLiveRecordVideoResponseBodyLiveRecordVideoListLiveRecordVideoVideo setCateName(String cateName) {
            this.cateName = cateName;
            return this;
        }
        public String getCateName() {
            return this.cateName;
        }

        public ListLiveRecordVideoResponseBodyLiveRecordVideoListLiveRecordVideoVideo setCoverURL(String coverURL) {
            this.coverURL = coverURL;
            return this;
        }
        public String getCoverURL() {
            return this.coverURL;
        }

        public ListLiveRecordVideoResponseBodyLiveRecordVideoListLiveRecordVideoVideo setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public ListLiveRecordVideoResponseBodyLiveRecordVideoListLiveRecordVideoVideo setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListLiveRecordVideoResponseBodyLiveRecordVideoListLiveRecordVideoVideo setDuration(Float duration) {
            this.duration = duration;
            return this;
        }
        public Float getDuration() {
            return this.duration;
        }

        public ListLiveRecordVideoResponseBodyLiveRecordVideoListLiveRecordVideoVideo setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

        public ListLiveRecordVideoResponseBodyLiveRecordVideoListLiveRecordVideoVideo setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

        public ListLiveRecordVideoResponseBodyLiveRecordVideoListLiveRecordVideoVideo setSnapshots(ListLiveRecordVideoResponseBodyLiveRecordVideoListLiveRecordVideoVideoSnapshots snapshots) {
            this.snapshots = snapshots;
            return this;
        }
        public ListLiveRecordVideoResponseBodyLiveRecordVideoListLiveRecordVideoVideoSnapshots getSnapshots() {
            return this.snapshots;
        }

        public ListLiveRecordVideoResponseBodyLiveRecordVideoListLiveRecordVideoVideo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListLiveRecordVideoResponseBodyLiveRecordVideoListLiveRecordVideoVideo setTags(String tags) {
            this.tags = tags;
            return this;
        }
        public String getTags() {
            return this.tags;
        }

        public ListLiveRecordVideoResponseBodyLiveRecordVideoListLiveRecordVideoVideo setTemplateGroupId(String templateGroupId) {
            this.templateGroupId = templateGroupId;
            return this;
        }
        public String getTemplateGroupId() {
            return this.templateGroupId;
        }

        public ListLiveRecordVideoResponseBodyLiveRecordVideoListLiveRecordVideoVideo setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public ListLiveRecordVideoResponseBodyLiveRecordVideoListLiveRecordVideoVideo setVideoId(String videoId) {
            this.videoId = videoId;
            return this;
        }
        public String getVideoId() {
            return this.videoId;
        }

    }

    public static class ListLiveRecordVideoResponseBodyLiveRecordVideoListLiveRecordVideo extends TeaModel {
        /**
         * <p>The name of the app.</p>
         * 
         * <strong>example:</strong>
         * <p>testApp</p>
         */
        @NameInMap("AppName")
        public String appName;

        /**
         * <p>The domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        @NameInMap("DomainName")
        public String domainName;

        /**
         * <p>The ID of the playlist.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        @NameInMap("PlaylistId")
        public String playlistId;

        /**
         * <p>The recording end time. The time is in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2017-12-08T08:44:56Z</p>
         */
        @NameInMap("RecordEndTime")
        public String recordEndTime;

        /**
         * <p>The recording start time. The time is in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2017-12-08T07:40:56Z</p>
         */
        @NameInMap("RecordStartTime")
        public String recordStartTime;

        /**
         * <p>The name of the live-to-VOD file.</p>
         * 
         * <strong>example:</strong>
         * <p>live-test</p>
         */
        @NameInMap("StreamName")
        public String streamName;

        /**
         * <p>The information about the live-to-VOD file.</p>
         */
        @NameInMap("Video")
        public ListLiveRecordVideoResponseBodyLiveRecordVideoListLiveRecordVideoVideo video;

        public static ListLiveRecordVideoResponseBodyLiveRecordVideoListLiveRecordVideo build(java.util.Map<String, ?> map) throws Exception {
            ListLiveRecordVideoResponseBodyLiveRecordVideoListLiveRecordVideo self = new ListLiveRecordVideoResponseBodyLiveRecordVideoListLiveRecordVideo();
            return TeaModel.build(map, self);
        }

        public ListLiveRecordVideoResponseBodyLiveRecordVideoListLiveRecordVideo setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public ListLiveRecordVideoResponseBodyLiveRecordVideoListLiveRecordVideo setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public ListLiveRecordVideoResponseBodyLiveRecordVideoListLiveRecordVideo setPlaylistId(String playlistId) {
            this.playlistId = playlistId;
            return this;
        }
        public String getPlaylistId() {
            return this.playlistId;
        }

        public ListLiveRecordVideoResponseBodyLiveRecordVideoListLiveRecordVideo setRecordEndTime(String recordEndTime) {
            this.recordEndTime = recordEndTime;
            return this;
        }
        public String getRecordEndTime() {
            return this.recordEndTime;
        }

        public ListLiveRecordVideoResponseBodyLiveRecordVideoListLiveRecordVideo setRecordStartTime(String recordStartTime) {
            this.recordStartTime = recordStartTime;
            return this;
        }
        public String getRecordStartTime() {
            return this.recordStartTime;
        }

        public ListLiveRecordVideoResponseBodyLiveRecordVideoListLiveRecordVideo setStreamName(String streamName) {
            this.streamName = streamName;
            return this;
        }
        public String getStreamName() {
            return this.streamName;
        }

        public ListLiveRecordVideoResponseBodyLiveRecordVideoListLiveRecordVideo setVideo(ListLiveRecordVideoResponseBodyLiveRecordVideoListLiveRecordVideoVideo video) {
            this.video = video;
            return this;
        }
        public ListLiveRecordVideoResponseBodyLiveRecordVideoListLiveRecordVideoVideo getVideo() {
            return this.video;
        }

    }

    public static class ListLiveRecordVideoResponseBodyLiveRecordVideoList extends TeaModel {
        @NameInMap("LiveRecordVideo")
        public java.util.List<ListLiveRecordVideoResponseBodyLiveRecordVideoListLiveRecordVideo> liveRecordVideo;

        public static ListLiveRecordVideoResponseBodyLiveRecordVideoList build(java.util.Map<String, ?> map) throws Exception {
            ListLiveRecordVideoResponseBodyLiveRecordVideoList self = new ListLiveRecordVideoResponseBodyLiveRecordVideoList();
            return TeaModel.build(map, self);
        }

        public ListLiveRecordVideoResponseBodyLiveRecordVideoList setLiveRecordVideo(java.util.List<ListLiveRecordVideoResponseBodyLiveRecordVideoListLiveRecordVideo> liveRecordVideo) {
            this.liveRecordVideo = liveRecordVideo;
            return this;
        }
        public java.util.List<ListLiveRecordVideoResponseBodyLiveRecordVideoListLiveRecordVideo> getLiveRecordVideo() {
            return this.liveRecordVideo;
        }

    }

}
