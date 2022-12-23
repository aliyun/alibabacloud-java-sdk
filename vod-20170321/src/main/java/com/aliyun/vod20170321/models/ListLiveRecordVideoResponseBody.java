// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class ListLiveRecordVideoResponseBody extends TeaModel {
    // The list of videos.
    @NameInMap("LiveRecordVideoList")
    public ListLiveRecordVideoResponseBodyLiveRecordVideoList liveRecordVideoList;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // The total number of videos returned.
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
        // The ID of the video category.
        @NameInMap("CateId")
        public Integer cateId;

        // The name of the video category.
        @NameInMap("CateName")
        public String cateName;

        // The thumbnail URL of the video.
        @NameInMap("CoverURL")
        public String coverURL;

        // The time when the video was created. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.
        @NameInMap("CreationTime")
        public String creationTime;

        // The description of the video.
        @NameInMap("Description")
        public String description;

        // The duration of the video. Unit: seconds.
        @NameInMap("Duration")
        public Float duration;

        // The last time when the video was updated. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.
        @NameInMap("ModifyTime")
        public String modifyTime;

        // The size of the mezzanine file. Unit: byte.
        @NameInMap("Size")
        public Long size;

        // The array of video snapshot URLs.
        @NameInMap("Snapshots")
        public ListLiveRecordVideoResponseBodyLiveRecordVideoListLiveRecordVideoVideoSnapshots snapshots;

        // The status of the video. Valid values:
        // *   **Uploading:**: indicates that the video is being uploaded.
        // *   **UploadFail**: indicates that the video failed to be uploaded.
        // *   **UploadSucces**: indicates that the video was uploaded.
        // *   **Transcoding**: indicates that the video is being transcoded.
        // *   **TranscodeFail**: indicates that the video failed to be transcoded.
        // *   **Blocked**: indicates that the video is blocked.
        // *   **Normal**: indicates that the video is in a normal state.
        @NameInMap("Status")
        public String status;

        // The tags of the video. Separate multiple tags with commas (,).
        @NameInMap("Tags")
        public String tags;

        // The ID of the transcoding template group.
        @NameInMap("TemplateGroupId")
        public String templateGroupId;

        // The title of the video.
        @NameInMap("Title")
        public String title;

        // The ID of the video.
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
        // The name of the application.
        @NameInMap("AppName")
        public String appName;

        // The domain name.
        @NameInMap("DomainName")
        public String domainName;

        // The ID of the playlist.
        @NameInMap("PlaylistId")
        public String playlistId;

        // The end of the time range in which data was queried. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.
        @NameInMap("RecordEndTime")
        public String recordEndTime;

        // The beginning of the time range in which data was queried. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.
        @NameInMap("RecordStartTime")
        public String recordStartTime;

        // The name of the live stream.
        @NameInMap("StreamName")
        public String streamName;

        // The information about the video.
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
