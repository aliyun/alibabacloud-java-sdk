// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetImageInfoResponseBody extends TeaModel {
    // The information about the image.
    @NameInMap("ImageInfo")
    public GetImageInfoResponseBodyImageInfo imageInfo;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    public static GetImageInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetImageInfoResponseBody self = new GetImageInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetImageInfoResponseBody setImageInfo(GetImageInfoResponseBodyImageInfo imageInfo) {
        this.imageInfo = imageInfo;
        return this;
    }
    public GetImageInfoResponseBodyImageInfo getImageInfo() {
        return this.imageInfo;
    }

    public GetImageInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetImageInfoResponseBodyImageInfoMezzanine extends TeaModel {
        // The size of the file. Unit: byte.
        @NameInMap("FileSize")
        public String fileSize;

        // The OSS URL of the image.
        @NameInMap("FileURL")
        public String fileURL;

        // The height of the image. Unit: pixel.
        @NameInMap("Height")
        public Integer height;

        // The name of the uploaded file.
        @NameInMap("OriginalFileName")
        public String originalFileName;

        // The width of the image. Unit: pixel.
        @NameInMap("Width")
        public Integer width;

        public static GetImageInfoResponseBodyImageInfoMezzanine build(java.util.Map<String, ?> map) throws Exception {
            GetImageInfoResponseBodyImageInfoMezzanine self = new GetImageInfoResponseBodyImageInfoMezzanine();
            return TeaModel.build(map, self);
        }

        public GetImageInfoResponseBodyImageInfoMezzanine setFileSize(String fileSize) {
            this.fileSize = fileSize;
            return this;
        }
        public String getFileSize() {
            return this.fileSize;
        }

        public GetImageInfoResponseBodyImageInfoMezzanine setFileURL(String fileURL) {
            this.fileURL = fileURL;
            return this;
        }
        public String getFileURL() {
            return this.fileURL;
        }

        public GetImageInfoResponseBodyImageInfoMezzanine setHeight(Integer height) {
            this.height = height;
            return this;
        }
        public Integer getHeight() {
            return this.height;
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

    }

    public static class GetImageInfoResponseBodyImageInfo extends TeaModel {
        // The ID of the application.
        @NameInMap("AppId")
        public String appId;

        // The ID of the category.
        @NameInMap("CateId")
        public Long cateId;

        // The name of the category.
        @NameInMap("CateName")
        public String cateName;

        // The time when the image file was created. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.
        @NameInMap("CreationTime")
        public String creationTime;

        // The description of the image.
        @NameInMap("Description")
        public String description;

        // The ID of the image.
        @NameInMap("ImageId")
        public String imageId;

        // The type of the image. Valid values:
        // 
        // - **CoverSnapshot**: thumbnail snapshot.
        // - **NormalSnapshot**: normal snapshot.
        // - **SpriteSnapshot**: sprite snapshot.
        // - **SpriteOriginSnapshot**: sprite source snapshot.
        // - **All**: images of all the preceding types. If this parameter is not set to All, you can specify multiple types and separate them with commas (,).
        @NameInMap("ImageType")
        public String imageType;

        // The information about the image mezzanine file.
        @NameInMap("Mezzanine")
        public GetImageInfoResponseBodyImageInfoMezzanine mezzanine;

        // The status of the image. Valid values:
        // 
        // - **Uploading**: The image is being uploaded. This is the initial status.
        // - **Normal**: The image is uploaded.
        // - **UploadFail**: The image fails to be uploaded.
        @NameInMap("Status")
        public String status;

        // The OSS bucket where the image is stored.
        @NameInMap("StorageLocation")
        public String storageLocation;

        // The tag of the image. Multiple tags are separated by commas (,).
        @NameInMap("Tags")
        public String tags;

        // The title of the image.
        @NameInMap("Title")
        public String title;

        // The URL of the image. If a CDN domain name is specified, a CDN URL is returned. Otherwise, an OSS URL is returned.
        @NameInMap("URL")
        public String URL;

        public static GetImageInfoResponseBodyImageInfo build(java.util.Map<String, ?> map) throws Exception {
            GetImageInfoResponseBodyImageInfo self = new GetImageInfoResponseBodyImageInfo();
            return TeaModel.build(map, self);
        }

        public GetImageInfoResponseBodyImageInfo setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public GetImageInfoResponseBodyImageInfo setCateId(Long cateId) {
            this.cateId = cateId;
            return this;
        }
        public Long getCateId() {
            return this.cateId;
        }

        public GetImageInfoResponseBodyImageInfo setCateName(String cateName) {
            this.cateName = cateName;
            return this;
        }
        public String getCateName() {
            return this.cateName;
        }

        public GetImageInfoResponseBodyImageInfo setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public GetImageInfoResponseBodyImageInfo setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetImageInfoResponseBodyImageInfo setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public GetImageInfoResponseBodyImageInfo setImageType(String imageType) {
            this.imageType = imageType;
            return this;
        }
        public String getImageType() {
            return this.imageType;
        }

        public GetImageInfoResponseBodyImageInfo setMezzanine(GetImageInfoResponseBodyImageInfoMezzanine mezzanine) {
            this.mezzanine = mezzanine;
            return this;
        }
        public GetImageInfoResponseBodyImageInfoMezzanine getMezzanine() {
            return this.mezzanine;
        }

        public GetImageInfoResponseBodyImageInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetImageInfoResponseBodyImageInfo setStorageLocation(String storageLocation) {
            this.storageLocation = storageLocation;
            return this;
        }
        public String getStorageLocation() {
            return this.storageLocation;
        }

        public GetImageInfoResponseBodyImageInfo setTags(String tags) {
            this.tags = tags;
            return this;
        }
        public String getTags() {
            return this.tags;
        }

        public GetImageInfoResponseBodyImageInfo setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public GetImageInfoResponseBodyImageInfo setURL(String URL) {
            this.URL = URL;
            return this;
        }
        public String getURL() {
            return this.URL;
        }

    }

}
