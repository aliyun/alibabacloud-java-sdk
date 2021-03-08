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
        @NameInMap("Status")
        public String status;

        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("StorageLocation")
        public String storageLocation;

        @NameInMap("CateId")
        public Long cateId;

        @NameInMap("Tags")
        public String tags;

        @NameInMap("ModificationTime")
        public String modificationTime;

        @NameInMap("Description")
        public String description;

        @NameInMap("AppId")
        public String appId;

        @NameInMap("CoverURL")
        public String coverURL;

        @NameInMap("TemplateGroupId")
        public String templateGroupId;

        @NameInMap("AuditStatus")
        public String auditStatus;

        @NameInMap("VideoId")
        public String videoId;

        @NameInMap("Snapshots")
        public GetVideoInfoResponseBodyVideoSnapshots snapshots;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("CustomMediaInfo")
        public String customMediaInfo;

        @NameInMap("CateName")
        public String cateName;

        @NameInMap("Size")
        public Long size;

        @NameInMap("Duration")
        public Float duration;

        @NameInMap("Title")
        public String title;

        public static GetVideoInfoResponseBodyVideo build(java.util.Map<String, ?> map) throws Exception {
            GetVideoInfoResponseBodyVideo self = new GetVideoInfoResponseBodyVideo();
            return TeaModel.build(map, self);
        }

        public GetVideoInfoResponseBodyVideo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetVideoInfoResponseBodyVideo setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public GetVideoInfoResponseBodyVideo setStorageLocation(String storageLocation) {
            this.storageLocation = storageLocation;
            return this;
        }
        public String getStorageLocation() {
            return this.storageLocation;
        }

        public GetVideoInfoResponseBodyVideo setCateId(Long cateId) {
            this.cateId = cateId;
            return this;
        }
        public Long getCateId() {
            return this.cateId;
        }

        public GetVideoInfoResponseBodyVideo setTags(String tags) {
            this.tags = tags;
            return this;
        }
        public String getTags() {
            return this.tags;
        }

        public GetVideoInfoResponseBodyVideo setModificationTime(String modificationTime) {
            this.modificationTime = modificationTime;
            return this;
        }
        public String getModificationTime() {
            return this.modificationTime;
        }

        public GetVideoInfoResponseBodyVideo setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetVideoInfoResponseBodyVideo setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public GetVideoInfoResponseBodyVideo setCoverURL(String coverURL) {
            this.coverURL = coverURL;
            return this;
        }
        public String getCoverURL() {
            return this.coverURL;
        }

        public GetVideoInfoResponseBodyVideo setTemplateGroupId(String templateGroupId) {
            this.templateGroupId = templateGroupId;
            return this;
        }
        public String getTemplateGroupId() {
            return this.templateGroupId;
        }

        public GetVideoInfoResponseBodyVideo setAuditStatus(String auditStatus) {
            this.auditStatus = auditStatus;
            return this;
        }
        public String getAuditStatus() {
            return this.auditStatus;
        }

        public GetVideoInfoResponseBodyVideo setVideoId(String videoId) {
            this.videoId = videoId;
            return this;
        }
        public String getVideoId() {
            return this.videoId;
        }

        public GetVideoInfoResponseBodyVideo setSnapshots(GetVideoInfoResponseBodyVideoSnapshots snapshots) {
            this.snapshots = snapshots;
            return this;
        }
        public GetVideoInfoResponseBodyVideoSnapshots getSnapshots() {
            return this.snapshots;
        }

        public GetVideoInfoResponseBodyVideo setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetVideoInfoResponseBodyVideo setCustomMediaInfo(String customMediaInfo) {
            this.customMediaInfo = customMediaInfo;
            return this;
        }
        public String getCustomMediaInfo() {
            return this.customMediaInfo;
        }

        public GetVideoInfoResponseBodyVideo setCateName(String cateName) {
            this.cateName = cateName;
            return this;
        }
        public String getCateName() {
            return this.cateName;
        }

        public GetVideoInfoResponseBodyVideo setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

        public GetVideoInfoResponseBodyVideo setDuration(Float duration) {
            this.duration = duration;
            return this;
        }
        public Float getDuration() {
            return this.duration;
        }

        public GetVideoInfoResponseBodyVideo setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

}
