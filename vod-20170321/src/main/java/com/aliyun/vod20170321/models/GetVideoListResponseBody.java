// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetVideoListResponseBody extends TeaModel {
    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // The total number of videos.
    @NameInMap("Total")
    public Integer total;

    // The information about the video. The information about a maximum of first 5,000 video records can be obtained in a single request.
    @NameInMap("VideoList")
    public GetVideoListResponseBodyVideoList videoList;

    public static GetVideoListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetVideoListResponseBody self = new GetVideoListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetVideoListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetVideoListResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public GetVideoListResponseBody setVideoList(GetVideoListResponseBodyVideoList videoList) {
        this.videoList = videoList;
        return this;
    }
    public GetVideoListResponseBodyVideoList getVideoList() {
        return this.videoList;
    }

    public static class GetVideoListResponseBodyVideoListVideoSnapshots extends TeaModel {
        @NameInMap("Snapshot")
        public java.util.List<String> snapshot;

        public static GetVideoListResponseBodyVideoListVideoSnapshots build(java.util.Map<String, ?> map) throws Exception {
            GetVideoListResponseBodyVideoListVideoSnapshots self = new GetVideoListResponseBodyVideoListVideoSnapshots();
            return TeaModel.build(map, self);
        }

        public GetVideoListResponseBodyVideoListVideoSnapshots setSnapshot(java.util.List<String> snapshot) {
            this.snapshot = snapshot;
            return this;
        }
        public java.util.List<String> getSnapshot() {
            return this.snapshot;
        }

    }

    public static class GetVideoListResponseBodyVideoListVideo extends TeaModel {
        // The ID of the application. Default value: **app-1000000**.
        @NameInMap("AppId")
        public String appId;

        // The ID of the video category.
        @NameInMap("CateId")
        public Long cateId;

        // The name of the video category.
        @NameInMap("CateName")
        public String cateName;

        // The URL of the video thumbnail.
        @NameInMap("CoverURL")
        public String coverURL;

        // The time when the video file was created. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.
        @NameInMap("CreationTime")
        public String creationTime;

        // The description of the video.
        @NameInMap("Description")
        public String description;

        // The duration of the video. Unit: seconds.
        @NameInMap("Duration")
        public Float duration;

        // The time when the video file was updated. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.
        @NameInMap("ModificationTime")
        public String modificationTime;

        // The size of the video mezzanine file. Unit: byte.
        @NameInMap("Size")
        public Long size;

        // The URL array of video snapshots.
        @NameInMap("Snapshots")
        public GetVideoListResponseBodyVideoListVideoSnapshots snapshots;

        // The status of the video. By default, videos in all states are returned. Multiple states are separated by commas (,). Valid values:
        // 
        // *   **Uploading**: The video is being uploaded.
        // *   **UploadFail**: The video fails to be uploaded.
        // *   **UploadSucc**: The video is uploaded.
        // *   **Transcoding**: The video is being transcoded.
        // *   **TranscodeFail**: The video fails to be transcoded.
        // *   **Blocked**: The video is blocked.
        // *   **Normal**: The video can be played.
        @NameInMap("Status")
        public String status;

        // The OSS bucket where the video file is stored.
        @NameInMap("StorageLocation")
        public String storageLocation;

        // The tags of the video. Multiple tags are separated by commas (,).
        @NameInMap("Tags")
        public String tags;

        // The title of the video.
        @NameInMap("Title")
        public String title;

        // The ID of the video.
        @NameInMap("VideoId")
        public String videoId;

        public static GetVideoListResponseBodyVideoListVideo build(java.util.Map<String, ?> map) throws Exception {
            GetVideoListResponseBodyVideoListVideo self = new GetVideoListResponseBodyVideoListVideo();
            return TeaModel.build(map, self);
        }

        public GetVideoListResponseBodyVideoListVideo setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public GetVideoListResponseBodyVideoListVideo setCateId(Long cateId) {
            this.cateId = cateId;
            return this;
        }
        public Long getCateId() {
            return this.cateId;
        }

        public GetVideoListResponseBodyVideoListVideo setCateName(String cateName) {
            this.cateName = cateName;
            return this;
        }
        public String getCateName() {
            return this.cateName;
        }

        public GetVideoListResponseBodyVideoListVideo setCoverURL(String coverURL) {
            this.coverURL = coverURL;
            return this;
        }
        public String getCoverURL() {
            return this.coverURL;
        }

        public GetVideoListResponseBodyVideoListVideo setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public GetVideoListResponseBodyVideoListVideo setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetVideoListResponseBodyVideoListVideo setDuration(Float duration) {
            this.duration = duration;
            return this;
        }
        public Float getDuration() {
            return this.duration;
        }

        public GetVideoListResponseBodyVideoListVideo setModificationTime(String modificationTime) {
            this.modificationTime = modificationTime;
            return this;
        }
        public String getModificationTime() {
            return this.modificationTime;
        }

        public GetVideoListResponseBodyVideoListVideo setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

        public GetVideoListResponseBodyVideoListVideo setSnapshots(GetVideoListResponseBodyVideoListVideoSnapshots snapshots) {
            this.snapshots = snapshots;
            return this;
        }
        public GetVideoListResponseBodyVideoListVideoSnapshots getSnapshots() {
            return this.snapshots;
        }

        public GetVideoListResponseBodyVideoListVideo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetVideoListResponseBodyVideoListVideo setStorageLocation(String storageLocation) {
            this.storageLocation = storageLocation;
            return this;
        }
        public String getStorageLocation() {
            return this.storageLocation;
        }

        public GetVideoListResponseBodyVideoListVideo setTags(String tags) {
            this.tags = tags;
            return this;
        }
        public String getTags() {
            return this.tags;
        }

        public GetVideoListResponseBodyVideoListVideo setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public GetVideoListResponseBodyVideoListVideo setVideoId(String videoId) {
            this.videoId = videoId;
            return this;
        }
        public String getVideoId() {
            return this.videoId;
        }

    }

    public static class GetVideoListResponseBodyVideoList extends TeaModel {
        @NameInMap("Video")
        public java.util.List<GetVideoListResponseBodyVideoListVideo> video;

        public static GetVideoListResponseBodyVideoList build(java.util.Map<String, ?> map) throws Exception {
            GetVideoListResponseBodyVideoList self = new GetVideoListResponseBodyVideoList();
            return TeaModel.build(map, self);
        }

        public GetVideoListResponseBodyVideoList setVideo(java.util.List<GetVideoListResponseBodyVideoListVideo> video) {
            this.video = video;
            return this;
        }
        public java.util.List<GetVideoListResponseBodyVideoListVideo> getVideo() {
            return this.video;
        }

    }

}
