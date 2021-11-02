// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class ListLiveRecordVideoResponseBody extends TeaModel {
    @NameInMap("LiveRecordVideoList")
    public ListLiveRecordVideoResponseBodyLiveRecordVideoList liveRecordVideoList;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("CateId")
        public Integer cateId;

        @NameInMap("CateName")
        public String cateName;

        @NameInMap("CoverURL")
        public String coverURL;

        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("Description")
        public String description;

        @NameInMap("Duration")
        public Float duration;

        @NameInMap("ModifyTime")
        public String modifyTime;

        @NameInMap("Size")
        public Long size;

        @NameInMap("Snapshots")
        public ListLiveRecordVideoResponseBodyLiveRecordVideoListLiveRecordVideoVideoSnapshots snapshots;

        @NameInMap("Status")
        public String status;

        @NameInMap("Tags")
        public String tags;

        @NameInMap("TemplateGroupId")
        public String templateGroupId;

        @NameInMap("Title")
        public String title;

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
        @NameInMap("AppName")
        public String appName;

        @NameInMap("DomainName")
        public String domainName;

        @NameInMap("PlaylistId")
        public String playlistId;

        @NameInMap("RecordEndTime")
        public String recordEndTime;

        @NameInMap("RecordStartTime")
        public String recordStartTime;

        @NameInMap("StreamName")
        public String streamName;

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
