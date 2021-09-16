// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetImageInfoResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ImageInfo")
    public GetImageInfoResponseBodyImageInfo imageInfo;

    public static GetImageInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetImageInfoResponseBody self = new GetImageInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetImageInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetImageInfoResponseBody setImageInfo(GetImageInfoResponseBodyImageInfo imageInfo) {
        this.imageInfo = imageInfo;
        return this;
    }
    public GetImageInfoResponseBodyImageInfo getImageInfo() {
        return this.imageInfo;
    }

    public static class GetImageInfoResponseBodyImageInfoMezzanine extends TeaModel {
        @NameInMap("FileURL")
        public String fileURL;

        @NameInMap("OriginalFileName")
        public String originalFileName;

        @NameInMap("Width")
        public Integer width;

        @NameInMap("Height")
        public Integer height;

        @NameInMap("FileSize")
        public String fileSize;

        public static GetImageInfoResponseBodyImageInfoMezzanine build(java.util.Map<String, ?> map) throws Exception {
            GetImageInfoResponseBodyImageInfoMezzanine self = new GetImageInfoResponseBodyImageInfoMezzanine();
            return TeaModel.build(map, self);
        }

        public GetImageInfoResponseBodyImageInfoMezzanine setFileURL(String fileURL) {
            this.fileURL = fileURL;
            return this;
        }
        public String getFileURL() {
            return this.fileURL;
        }

        public GetImageInfoResponseBodyImageInfoMezzanine setOriginalFileName(String originalFileName) {
            this.originalFileName = originalFileName;
            return this;
        }
        public String getOriginalFileName() {
            return this.originalFileName;
        }

        public GetImageInfoResponseBodyImageInfoMezzanine setWidth(Integer width) {
            this.width = width;
            return this;
        }
        public Integer getWidth() {
            return this.width;
        }

        public GetImageInfoResponseBodyImageInfoMezzanine setHeight(Integer height) {
            this.height = height;
            return this;
        }
        public Integer getHeight() {
            return this.height;
        }

        public GetImageInfoResponseBodyImageInfoMezzanine setFileSize(String fileSize) {
            this.fileSize = fileSize;
            return this;
        }
        public String getFileSize() {
            return this.fileSize;
        }

    }

    public static class GetImageInfoResponseBodyImageInfo extends TeaModel {
        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("StorageLocation")
        public String storageLocation;

        @NameInMap("Status")
        public String status;

        @NameInMap("CateId")
        public Long cateId;

        @NameInMap("Tags")
        public String tags;

        @NameInMap("ImageType")
        public String imageType;

        @NameInMap("CateName")
        public String cateName;

        @NameInMap("Description")
        public String description;

        @NameInMap("AppId")
        public String appId;

        @NameInMap("URL")
        public String URL;

        @NameInMap("Title")
        public String title;

        @NameInMap("ImageId")
        public String imageId;

        @NameInMap("Mezzanine")
        public GetImageInfoResponseBodyImageInfoMezzanine mezzanine;

        public static GetImageInfoResponseBodyImageInfo build(java.util.Map<String, ?> map) throws Exception {
            GetImageInfoResponseBodyImageInfo self = new GetImageInfoResponseBodyImageInfo();
            return TeaModel.build(map, self);
        }

        public GetImageInfoResponseBodyImageInfo setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public GetImageInfoResponseBodyImageInfo setStorageLocation(String storageLocation) {
            this.storageLocation = storageLocation;
            return this;
        }
        public String getStorageLocation() {
            return this.storageLocation;
        }

        public GetImageInfoResponseBodyImageInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetImageInfoResponseBodyImageInfo setCateId(Long cateId) {
            this.cateId = cateId;
            return this;
        }
        public Long getCateId() {
            return this.cateId;
        }

        public GetImageInfoResponseBodyImageInfo setTags(String tags) {
            this.tags = tags;
            return this;
        }
        public String getTags() {
            return this.tags;
        }

        public GetImageInfoResponseBodyImageInfo setImageType(String imageType) {
            this.imageType = imageType;
            return this;
        }
        public String getImageType() {
            return this.imageType;
        }

        public GetImageInfoResponseBodyImageInfo setCateName(String cateName) {
            this.cateName = cateName;
            return this;
        }
        public String getCateName() {
            return this.cateName;
        }

        public GetImageInfoResponseBodyImageInfo setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetImageInfoResponseBodyImageInfo setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public GetImageInfoResponseBodyImageInfo setURL(String URL) {
            this.URL = URL;
            return this;
        }
        public String getURL() {
            return this.URL;
        }

        public GetImageInfoResponseBodyImageInfo setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public GetImageInfoResponseBodyImageInfo setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public GetImageInfoResponseBodyImageInfo setMezzanine(GetImageInfoResponseBodyImageInfoMezzanine mezzanine) {
            this.mezzanine = mezzanine;
            return this;
        }
        public GetImageInfoResponseBodyImageInfoMezzanine getMezzanine() {
            return this.mezzanine;
        }

    }

}
