// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetImageInfosResponseBody extends TeaModel {
    @NameInMap("ImageInfo")
    public java.util.List<GetImageInfosResponseBodyImageInfo> imageInfo;

    @NameInMap("NonExistImageIds")
    public java.util.List<String> nonExistImageIds;

    @NameInMap("RequestId")
    public String requestId;

    public static GetImageInfosResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetImageInfosResponseBody self = new GetImageInfosResponseBody();
        return TeaModel.build(map, self);
    }

    public GetImageInfosResponseBody setImageInfo(java.util.List<GetImageInfosResponseBodyImageInfo> imageInfo) {
        this.imageInfo = imageInfo;
        return this;
    }
    public java.util.List<GetImageInfosResponseBodyImageInfo> getImageInfo() {
        return this.imageInfo;
    }

    public GetImageInfosResponseBody setNonExistImageIds(java.util.List<String> nonExistImageIds) {
        this.nonExistImageIds = nonExistImageIds;
        return this;
    }
    public java.util.List<String> getNonExistImageIds() {
        return this.nonExistImageIds;
    }

    public GetImageInfosResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetImageInfosResponseBodyImageInfoMezzanine extends TeaModel {
        @NameInMap("FileSize")
        public String fileSize;

        @NameInMap("FileURL")
        public String fileURL;

        @NameInMap("Height")
        public Integer height;

        @NameInMap("OriginalFileName")
        public String originalFileName;

        @NameInMap("Width")
        public Integer width;

        public static GetImageInfosResponseBodyImageInfoMezzanine build(java.util.Map<String, ?> map) throws Exception {
            GetImageInfosResponseBodyImageInfoMezzanine self = new GetImageInfosResponseBodyImageInfoMezzanine();
            return TeaModel.build(map, self);
        }

        public GetImageInfosResponseBodyImageInfoMezzanine setFileSize(String fileSize) {
            this.fileSize = fileSize;
            return this;
        }
        public String getFileSize() {
            return this.fileSize;
        }

        public GetImageInfosResponseBodyImageInfoMezzanine setFileURL(String fileURL) {
            this.fileURL = fileURL;
            return this;
        }
        public String getFileURL() {
            return this.fileURL;
        }

        public GetImageInfosResponseBodyImageInfoMezzanine setHeight(Integer height) {
            this.height = height;
            return this;
        }
        public Integer getHeight() {
            return this.height;
        }

        public GetImageInfosResponseBodyImageInfoMezzanine setOriginalFileName(String originalFileName) {
            this.originalFileName = originalFileName;
            return this;
        }
        public String getOriginalFileName() {
            return this.originalFileName;
        }

        public GetImageInfosResponseBodyImageInfoMezzanine setWidth(Integer width) {
            this.width = width;
            return this;
        }
        public Integer getWidth() {
            return this.width;
        }

    }

    public static class GetImageInfosResponseBodyImageInfo extends TeaModel {
        @NameInMap("AppId")
        public String appId;

        @NameInMap("CateId")
        public Long cateId;

        @NameInMap("CateName")
        public String cateName;

        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("Description")
        public String description;

        @NameInMap("ImageId")
        public String imageId;

        @NameInMap("ImageType")
        public String imageType;

        @NameInMap("Mezzanine")
        public GetImageInfosResponseBodyImageInfoMezzanine mezzanine;

        @NameInMap("Status")
        public String status;

        @NameInMap("StorageLocation")
        public String storageLocation;

        @NameInMap("Tags")
        public String tags;

        @NameInMap("Title")
        public String title;

        @NameInMap("URL")
        public String URL;

        public static GetImageInfosResponseBodyImageInfo build(java.util.Map<String, ?> map) throws Exception {
            GetImageInfosResponseBodyImageInfo self = new GetImageInfosResponseBodyImageInfo();
            return TeaModel.build(map, self);
        }

        public GetImageInfosResponseBodyImageInfo setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public GetImageInfosResponseBodyImageInfo setCateId(Long cateId) {
            this.cateId = cateId;
            return this;
        }
        public Long getCateId() {
            return this.cateId;
        }

        public GetImageInfosResponseBodyImageInfo setCateName(String cateName) {
            this.cateName = cateName;
            return this;
        }
        public String getCateName() {
            return this.cateName;
        }

        public GetImageInfosResponseBodyImageInfo setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public GetImageInfosResponseBodyImageInfo setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetImageInfosResponseBodyImageInfo setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public GetImageInfosResponseBodyImageInfo setImageType(String imageType) {
            this.imageType = imageType;
            return this;
        }
        public String getImageType() {
            return this.imageType;
        }

        public GetImageInfosResponseBodyImageInfo setMezzanine(GetImageInfosResponseBodyImageInfoMezzanine mezzanine) {
            this.mezzanine = mezzanine;
            return this;
        }
        public GetImageInfosResponseBodyImageInfoMezzanine getMezzanine() {
            return this.mezzanine;
        }

        public GetImageInfosResponseBodyImageInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetImageInfosResponseBodyImageInfo setStorageLocation(String storageLocation) {
            this.storageLocation = storageLocation;
            return this;
        }
        public String getStorageLocation() {
            return this.storageLocation;
        }

        public GetImageInfosResponseBodyImageInfo setTags(String tags) {
            this.tags = tags;
            return this;
        }
        public String getTags() {
            return this.tags;
        }

        public GetImageInfosResponseBodyImageInfo setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public GetImageInfosResponseBodyImageInfo setURL(String URL) {
            this.URL = URL;
            return this;
        }
        public String getURL() {
            return this.URL;
        }

    }

}
