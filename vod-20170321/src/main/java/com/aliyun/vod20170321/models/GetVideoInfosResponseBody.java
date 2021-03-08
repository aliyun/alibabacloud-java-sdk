// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetVideoInfosResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("NonExistVideoIds")
    public java.util.List<String> nonExistVideoIds;

    @NameInMap("VideoList")
    public java.util.List<GetVideoInfosResponseBodyVideoList> videoList;

    public static GetVideoInfosResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetVideoInfosResponseBody self = new GetVideoInfosResponseBody();
        return TeaModel.build(map, self);
    }

    public GetVideoInfosResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetVideoInfosResponseBody setNonExistVideoIds(java.util.List<String> nonExistVideoIds) {
        this.nonExistVideoIds = nonExistVideoIds;
        return this;
    }
    public java.util.List<String> getNonExistVideoIds() {
        return this.nonExistVideoIds;
    }

    public GetVideoInfosResponseBody setVideoList(java.util.List<GetVideoInfosResponseBodyVideoList> videoList) {
        this.videoList = videoList;
        return this;
    }
    public java.util.List<GetVideoInfosResponseBodyVideoList> getVideoList() {
        return this.videoList;
    }

    public static class GetVideoInfosResponseBodyVideoList extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("StorageLocation")
        public String storageLocation;

        @NameInMap("CateId")
        public Long cateId;

        @NameInMap("VideoId")
        public String videoId;

        @NameInMap("Tags")
        public String tags;

        @NameInMap("ModificationTime")
        public String modificationTime;

        @NameInMap("Snapshots")
        public java.util.List<String> snapshots;

        @NameInMap("CateName")
        public String cateName;

        @NameInMap("Description")
        public String description;

        @NameInMap("AppId")
        public String appId;

        @NameInMap("Size")
        public Long size;

        @NameInMap("CoverURL")
        public String coverURL;

        @NameInMap("TemplateGroupId")
        public String templateGroupId;

        @NameInMap("Duration")
        public Float duration;

        @NameInMap("Title")
        public String title;

        public static GetVideoInfosResponseBodyVideoList build(java.util.Map<String, ?> map) throws Exception {
            GetVideoInfosResponseBodyVideoList self = new GetVideoInfosResponseBodyVideoList();
            return TeaModel.build(map, self);
        }

        public GetVideoInfosResponseBodyVideoList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetVideoInfosResponseBodyVideoList setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public GetVideoInfosResponseBodyVideoList setStorageLocation(String storageLocation) {
            this.storageLocation = storageLocation;
            return this;
        }
        public String getStorageLocation() {
            return this.storageLocation;
        }

        public GetVideoInfosResponseBodyVideoList setCateId(Long cateId) {
            this.cateId = cateId;
            return this;
        }
        public Long getCateId() {
            return this.cateId;
        }

        public GetVideoInfosResponseBodyVideoList setVideoId(String videoId) {
            this.videoId = videoId;
            return this;
        }
        public String getVideoId() {
            return this.videoId;
        }

        public GetVideoInfosResponseBodyVideoList setTags(String tags) {
            this.tags = tags;
            return this;
        }
        public String getTags() {
            return this.tags;
        }

        public GetVideoInfosResponseBodyVideoList setModificationTime(String modificationTime) {
            this.modificationTime = modificationTime;
            return this;
        }
        public String getModificationTime() {
            return this.modificationTime;
        }

        public GetVideoInfosResponseBodyVideoList setSnapshots(java.util.List<String> snapshots) {
            this.snapshots = snapshots;
            return this;
        }
        public java.util.List<String> getSnapshots() {
            return this.snapshots;
        }

        public GetVideoInfosResponseBodyVideoList setCateName(String cateName) {
            this.cateName = cateName;
            return this;
        }
        public String getCateName() {
            return this.cateName;
        }

        public GetVideoInfosResponseBodyVideoList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetVideoInfosResponseBodyVideoList setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public GetVideoInfosResponseBodyVideoList setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

        public GetVideoInfosResponseBodyVideoList setCoverURL(String coverURL) {
            this.coverURL = coverURL;
            return this;
        }
        public String getCoverURL() {
            return this.coverURL;
        }

        public GetVideoInfosResponseBodyVideoList setTemplateGroupId(String templateGroupId) {
            this.templateGroupId = templateGroupId;
            return this;
        }
        public String getTemplateGroupId() {
            return this.templateGroupId;
        }

        public GetVideoInfosResponseBodyVideoList setDuration(Float duration) {
            this.duration = duration;
            return this;
        }
        public Float getDuration() {
            return this.duration;
        }

        public GetVideoInfosResponseBodyVideoList setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

}
