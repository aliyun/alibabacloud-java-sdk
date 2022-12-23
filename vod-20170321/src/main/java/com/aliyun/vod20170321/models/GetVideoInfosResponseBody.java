// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetVideoInfosResponseBody extends TeaModel {
    // The IDs of the videos that do not exist.
    @NameInMap("NonExistVideoIds")
    public java.util.List<String> nonExistVideoIds;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // The information about the video.
    @NameInMap("VideoList")
    public java.util.List<GetVideoInfosResponseBodyVideoList> videoList;

    public static GetVideoInfosResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetVideoInfosResponseBody self = new GetVideoInfosResponseBody();
        return TeaModel.build(map, self);
    }

    public GetVideoInfosResponseBody setNonExistVideoIds(java.util.List<String> nonExistVideoIds) {
        this.nonExistVideoIds = nonExistVideoIds;
        return this;
    }
    public java.util.List<String> getNonExistVideoIds() {
        return this.nonExistVideoIds;
    }

    public GetVideoInfosResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetVideoInfosResponseBody setVideoList(java.util.List<GetVideoInfosResponseBodyVideoList> videoList) {
        this.videoList = videoList;
        return this;
    }
    public java.util.List<GetVideoInfosResponseBodyVideoList> getVideoList() {
        return this.videoList;
    }

    public static class GetVideoInfosResponseBodyVideoList extends TeaModel {
        // The ID of the application.
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
        public java.util.List<String> snapshots;

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

        // The Object Storage Service (OSS) bucket where the video file is stored.
        @NameInMap("StorageLocation")
        public String storageLocation;

        // The tags of the video. Multiple tags are separated by commas (,).
        @NameInMap("Tags")
        public String tags;

        // The ID of the template group that was used to transcode the video.
        @NameInMap("TemplateGroupId")
        public String templateGroupId;

        // The title of the video.
        @NameInMap("Title")
        public String title;

        // The ID of the video.
        @NameInMap("VideoId")
        public String videoId;

        public static GetVideoInfosResponseBodyVideoList build(java.util.Map<String, ?> map) throws Exception {
            GetVideoInfosResponseBodyVideoList self = new GetVideoInfosResponseBodyVideoList();
            return TeaModel.build(map, self);
        }

        public GetVideoInfosResponseBodyVideoList setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public GetVideoInfosResponseBodyVideoList setCateId(Long cateId) {
            this.cateId = cateId;
            return this;
        }
        public Long getCateId() {
            return this.cateId;
        }

        public GetVideoInfosResponseBodyVideoList setCateName(String cateName) {
            this.cateName = cateName;
            return this;
        }
        public String getCateName() {
            return this.cateName;
        }

        public GetVideoInfosResponseBodyVideoList setCoverURL(String coverURL) {
            this.coverURL = coverURL;
            return this;
        }
        public String getCoverURL() {
            return this.coverURL;
        }

        public GetVideoInfosResponseBodyVideoList setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public GetVideoInfosResponseBodyVideoList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetVideoInfosResponseBodyVideoList setDuration(Float duration) {
            this.duration = duration;
            return this;
        }
        public Float getDuration() {
            return this.duration;
        }

        public GetVideoInfosResponseBodyVideoList setModificationTime(String modificationTime) {
            this.modificationTime = modificationTime;
            return this;
        }
        public String getModificationTime() {
            return this.modificationTime;
        }

        public GetVideoInfosResponseBodyVideoList setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

        public GetVideoInfosResponseBodyVideoList setSnapshots(java.util.List<String> snapshots) {
            this.snapshots = snapshots;
            return this;
        }
        public java.util.List<String> getSnapshots() {
            return this.snapshots;
        }

        public GetVideoInfosResponseBodyVideoList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetVideoInfosResponseBodyVideoList setStorageLocation(String storageLocation) {
            this.storageLocation = storageLocation;
            return this;
        }
        public String getStorageLocation() {
            return this.storageLocation;
        }

        public GetVideoInfosResponseBodyVideoList setTags(String tags) {
            this.tags = tags;
            return this;
        }
        public String getTags() {
            return this.tags;
        }

        public GetVideoInfosResponseBodyVideoList setTemplateGroupId(String templateGroupId) {
            this.templateGroupId = templateGroupId;
            return this;
        }
        public String getTemplateGroupId() {
            return this.templateGroupId;
        }

        public GetVideoInfosResponseBodyVideoList setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public GetVideoInfosResponseBodyVideoList setVideoId(String videoId) {
            this.videoId = videoId;
            return this;
        }
        public String getVideoId() {
            return this.videoId;
        }

    }

}
