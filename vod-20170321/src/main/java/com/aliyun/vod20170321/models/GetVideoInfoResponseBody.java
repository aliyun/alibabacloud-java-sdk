// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetVideoInfoResponseBody extends TeaModel {
    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // The information about the video.
    @NameInMap("Video")
    public GetVideoInfoResponseBodyVideo video;

    public static GetVideoInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetVideoInfoResponseBody self = new GetVideoInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetVideoInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetVideoInfoResponseBody setVideo(GetVideoInfoResponseBodyVideo video) {
        this.video = video;
        return this;
    }
    public GetVideoInfoResponseBodyVideo getVideo() {
        return this.video;
    }

    public static class GetVideoInfoResponseBodyVideoSnapshots extends TeaModel {
        @NameInMap("Snapshot")
        public java.util.List<String> snapshot;

        public static GetVideoInfoResponseBodyVideoSnapshots build(java.util.Map<String, ?> map) throws Exception {
            GetVideoInfoResponseBodyVideoSnapshots self = new GetVideoInfoResponseBodyVideoSnapshots();
            return TeaModel.build(map, self);
        }

        public GetVideoInfoResponseBodyVideoSnapshots setSnapshot(java.util.List<String> snapshot) {
            this.snapshot = snapshot;
            return this;
        }
        public java.util.List<String> getSnapshot() {
            return this.snapshot;
        }

    }

    public static class GetVideoInfoResponseBodyVideo extends TeaModel {
        // The ID of the application.
        @NameInMap("AppId")
        public String appId;

        // The review status of the video. Valid values:
        // 
        // *   **Normal**: pass
        // *   **Blocked**: failed
        @NameInMap("AuditStatus")
        public String auditStatus;

        // The category ID of the video.
        @NameInMap("CateId")
        public Long cateId;

        // The category of the video.
        @NameInMap("CateName")
        public String cateName;

        // The thumbnail URL of the video.
        @NameInMap("CoverURL")
        public String coverURL;

        // The time when the video was created. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.
        @NameInMap("CreationTime")
        public String creationTime;

        // The information about the custom media asset.
        // > This parameter has been deprecated. This parameter is no longer returned when you call the API.
        @NameInMap("CustomMediaInfo")
        public String customMediaInfo;

        // The description of the video.
        @NameInMap("Description")
        public String description;

        // The duration of the video. Unit: seconds.
        @NameInMap("Duration")
        public Float duration;

        // The time when the video was updated. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.
        @NameInMap("ModificationTime")
        public String modificationTime;

        // The region ID of the Object Storage Service (OSS) bucket.
        @NameInMap("RegionId")
        public String regionId;

        // The size of the source video file. Unit: byte.
        @NameInMap("Size")
        public Long size;

        // The URL array of video snapshots.
        @NameInMap("Snapshots")
        public GetVideoInfoResponseBodyVideoSnapshots snapshots;

        // The video status. Valid values:
        // *   **Uploading**: The video is being uploaded.
        // *   **UploadFail**: The video failed to be uploaded.
        // *   **UploadSucc**: The video has been uploaded.
        // *   **Transcoding**: The video is being transcoded.
        // *   **TranscodeFail**: The video failed to be transcoded.
        // *   **Blocked**: The video failed the review.
        // *   **Normal**: The video passed the review.
        @NameInMap("Status")
        public String status;

        // The OSS bucket where the video is stored.
        @NameInMap("StorageLocation")
        public String storageLocation;

        // The tags of the video. Separate multiple tags with commas (,).
        @NameInMap("Tags")
        public String tags;

        // The ID of the template group.
        @NameInMap("TemplateGroupId")
        public String templateGroupId;

        // The title of the video.
        @NameInMap("Title")
        public String title;

        // The ID of the video.
        @NameInMap("VideoId")
        public String videoId;

        public static GetVideoInfoResponseBodyVideo build(java.util.Map<String, ?> map) throws Exception {
            GetVideoInfoResponseBodyVideo self = new GetVideoInfoResponseBodyVideo();
            return TeaModel.build(map, self);
        }

        public GetVideoInfoResponseBodyVideo setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public GetVideoInfoResponseBodyVideo setAuditStatus(String auditStatus) {
            this.auditStatus = auditStatus;
            return this;
        }
        public String getAuditStatus() {
            return this.auditStatus;
        }

        public GetVideoInfoResponseBodyVideo setCateId(Long cateId) {
            this.cateId = cateId;
            return this;
        }
        public Long getCateId() {
            return this.cateId;
        }

        public GetVideoInfoResponseBodyVideo setCateName(String cateName) {
            this.cateName = cateName;
            return this;
        }
        public String getCateName() {
            return this.cateName;
        }

        public GetVideoInfoResponseBodyVideo setCoverURL(String coverURL) {
            this.coverURL = coverURL;
            return this;
        }
        public String getCoverURL() {
            return this.coverURL;
        }

        public GetVideoInfoResponseBodyVideo setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public GetVideoInfoResponseBodyVideo setCustomMediaInfo(String customMediaInfo) {
            this.customMediaInfo = customMediaInfo;
            return this;
        }
        public String getCustomMediaInfo() {
            return this.customMediaInfo;
        }

        public GetVideoInfoResponseBodyVideo setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetVideoInfoResponseBodyVideo setDuration(Float duration) {
            this.duration = duration;
            return this;
        }
        public Float getDuration() {
            return this.duration;
        }

        public GetVideoInfoResponseBodyVideo setModificationTime(String modificationTime) {
            this.modificationTime = modificationTime;
            return this;
        }
        public String getModificationTime() {
            return this.modificationTime;
        }

        public GetVideoInfoResponseBodyVideo setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetVideoInfoResponseBodyVideo setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

        public GetVideoInfoResponseBodyVideo setSnapshots(GetVideoInfoResponseBodyVideoSnapshots snapshots) {
            this.snapshots = snapshots;
            return this;
        }
        public GetVideoInfoResponseBodyVideoSnapshots getSnapshots() {
            return this.snapshots;
        }

        public GetVideoInfoResponseBodyVideo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetVideoInfoResponseBodyVideo setStorageLocation(String storageLocation) {
            this.storageLocation = storageLocation;
            return this;
        }
        public String getStorageLocation() {
            return this.storageLocation;
        }

        public GetVideoInfoResponseBodyVideo setTags(String tags) {
            this.tags = tags;
            return this;
        }
        public String getTags() {
            return this.tags;
        }

        public GetVideoInfoResponseBodyVideo setTemplateGroupId(String templateGroupId) {
            this.templateGroupId = templateGroupId;
            return this;
        }
        public String getTemplateGroupId() {
            return this.templateGroupId;
        }

        public GetVideoInfoResponseBodyVideo setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public GetVideoInfoResponseBodyVideo setVideoId(String videoId) {
            this.videoId = videoId;
            return this;
        }
        public String getVideoId() {
            return this.videoId;
        }

    }

}
