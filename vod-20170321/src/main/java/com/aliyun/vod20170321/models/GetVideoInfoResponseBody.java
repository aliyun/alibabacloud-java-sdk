// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetVideoInfoResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("AppId")
        public String appId;

        @NameInMap("AuditStatus")
        public String auditStatus;

        @NameInMap("CateId")
        public Long cateId;

        @NameInMap("CateName")
        public String cateName;

        @NameInMap("CoverURL")
        public String coverURL;

        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("CustomMediaInfo")
        public String customMediaInfo;

        @NameInMap("Description")
        public String description;

        @NameInMap("Duration")
        public Float duration;

        @NameInMap("ModificationTime")
        public String modificationTime;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("RestoreExpiration")
        public String restoreExpiration;

        @NameInMap("RestoreStatus")
        public String restoreStatus;

        @NameInMap("Size")
        public Long size;

        @NameInMap("Snapshots")
        public GetVideoInfoResponseBodyVideoSnapshots snapshots;

        @NameInMap("Status")
        public String status;

        @NameInMap("StorageClass")
        public String storageClass;

        @NameInMap("StorageLocation")
        public String storageLocation;

        @NameInMap("Tags")
        public String tags;

        @NameInMap("TemplateGroupId")
        public String templateGroupId;

        @NameInMap("Title")
        public String title;

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

        public GetVideoInfoResponseBodyVideo setRestoreExpiration(String restoreExpiration) {
            this.restoreExpiration = restoreExpiration;
            return this;
        }
        public String getRestoreExpiration() {
            return this.restoreExpiration;
        }

        public GetVideoInfoResponseBodyVideo setRestoreStatus(String restoreStatus) {
            this.restoreStatus = restoreStatus;
            return this;
        }
        public String getRestoreStatus() {
            return this.restoreStatus;
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

        public GetVideoInfoResponseBodyVideo setStorageClass(String storageClass) {
            this.storageClass = storageClass;
            return this;
        }
        public String getStorageClass() {
            return this.storageClass;
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
