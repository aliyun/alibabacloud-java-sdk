// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetAttachedMediaInfoResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("NonExistMediaIds")
    public java.util.List<String> nonExistMediaIds;

    @NameInMap("AttachedMediaList")
    public java.util.List<GetAttachedMediaInfoResponseBodyAttachedMediaList> attachedMediaList;

    public static GetAttachedMediaInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAttachedMediaInfoResponseBody self = new GetAttachedMediaInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAttachedMediaInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAttachedMediaInfoResponseBody setNonExistMediaIds(java.util.List<String> nonExistMediaIds) {
        this.nonExistMediaIds = nonExistMediaIds;
        return this;
    }
    public java.util.List<String> getNonExistMediaIds() {
        return this.nonExistMediaIds;
    }

    public GetAttachedMediaInfoResponseBody setAttachedMediaList(java.util.List<GetAttachedMediaInfoResponseBodyAttachedMediaList> attachedMediaList) {
        this.attachedMediaList = attachedMediaList;
        return this;
    }
    public java.util.List<GetAttachedMediaInfoResponseBodyAttachedMediaList> getAttachedMediaList() {
        return this.attachedMediaList;
    }

    public static class GetAttachedMediaInfoResponseBodyAttachedMediaListCategories extends TeaModel {
        @NameInMap("ParentId")
        public Long parentId;

        @NameInMap("CateName")
        public String cateName;

        @NameInMap("CateId")
        public Long cateId;

        @NameInMap("Level")
        public Long level;

        public static GetAttachedMediaInfoResponseBodyAttachedMediaListCategories build(java.util.Map<String, ?> map) throws Exception {
            GetAttachedMediaInfoResponseBodyAttachedMediaListCategories self = new GetAttachedMediaInfoResponseBodyAttachedMediaListCategories();
            return TeaModel.build(map, self);
        }

        public GetAttachedMediaInfoResponseBodyAttachedMediaListCategories setParentId(Long parentId) {
            this.parentId = parentId;
            return this;
        }
        public Long getParentId() {
            return this.parentId;
        }

        public GetAttachedMediaInfoResponseBodyAttachedMediaListCategories setCateName(String cateName) {
            this.cateName = cateName;
            return this;
        }
        public String getCateName() {
            return this.cateName;
        }

        public GetAttachedMediaInfoResponseBodyAttachedMediaListCategories setCateId(Long cateId) {
            this.cateId = cateId;
            return this;
        }
        public Long getCateId() {
            return this.cateId;
        }

        public GetAttachedMediaInfoResponseBodyAttachedMediaListCategories setLevel(Long level) {
            this.level = level;
            return this;
        }
        public Long getLevel() {
            return this.level;
        }

    }

    public static class GetAttachedMediaInfoResponseBodyAttachedMediaList extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("StorageLocation")
        public String storageLocation;

        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("Status")
        public String status;

        @NameInMap("Tags")
        public String tags;

        @NameInMap("ModificationTime")
        public String modificationTime;

        @NameInMap("MediaId")
        public String mediaId;

        @NameInMap("Description")
        public String description;

        @NameInMap("AppId")
        public String appId;

        @NameInMap("URL")
        public String URL;

        @NameInMap("Title")
        public String title;

        @NameInMap("Categories")
        public java.util.List<GetAttachedMediaInfoResponseBodyAttachedMediaListCategories> categories;

        public static GetAttachedMediaInfoResponseBodyAttachedMediaList build(java.util.Map<String, ?> map) throws Exception {
            GetAttachedMediaInfoResponseBodyAttachedMediaList self = new GetAttachedMediaInfoResponseBodyAttachedMediaList();
            return TeaModel.build(map, self);
        }

        public GetAttachedMediaInfoResponseBodyAttachedMediaList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetAttachedMediaInfoResponseBodyAttachedMediaList setStorageLocation(String storageLocation) {
            this.storageLocation = storageLocation;
            return this;
        }
        public String getStorageLocation() {
            return this.storageLocation;
        }

        public GetAttachedMediaInfoResponseBodyAttachedMediaList setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public GetAttachedMediaInfoResponseBodyAttachedMediaList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetAttachedMediaInfoResponseBodyAttachedMediaList setTags(String tags) {
            this.tags = tags;
            return this;
        }
        public String getTags() {
            return this.tags;
        }

        public GetAttachedMediaInfoResponseBodyAttachedMediaList setModificationTime(String modificationTime) {
            this.modificationTime = modificationTime;
            return this;
        }
        public String getModificationTime() {
            return this.modificationTime;
        }

        public GetAttachedMediaInfoResponseBodyAttachedMediaList setMediaId(String mediaId) {
            this.mediaId = mediaId;
            return this;
        }
        public String getMediaId() {
            return this.mediaId;
        }

        public GetAttachedMediaInfoResponseBodyAttachedMediaList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetAttachedMediaInfoResponseBodyAttachedMediaList setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public GetAttachedMediaInfoResponseBodyAttachedMediaList setURL(String URL) {
            this.URL = URL;
            return this;
        }
        public String getURL() {
            return this.URL;
        }

        public GetAttachedMediaInfoResponseBodyAttachedMediaList setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public GetAttachedMediaInfoResponseBodyAttachedMediaList setCategories(java.util.List<GetAttachedMediaInfoResponseBodyAttachedMediaListCategories> categories) {
            this.categories = categories;
            return this;
        }
        public java.util.List<GetAttachedMediaInfoResponseBodyAttachedMediaListCategories> getCategories() {
            return this.categories;
        }

    }

}
