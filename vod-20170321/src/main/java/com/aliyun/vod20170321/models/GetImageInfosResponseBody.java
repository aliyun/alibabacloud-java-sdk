// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetImageInfosResponseBody extends TeaModel {
    /**
     * <p>The image information.</p>
     */
    @NameInMap("ImageInfo")
    public java.util.List<GetImageInfosResponseBodyImageInfo> imageInfo;

    /**
     * <p>The IDs of the images that do not exist.</p>
     */
    @NameInMap("NonExistImageIds")
    public java.util.List<String> nonExistImageIds;

    /**
     * <p>The ID of the request.</p>
     */
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
        /**
         * <p>The size of the image file. Unit: bytes.</p>
         */
        @NameInMap("FileSize")
        public String fileSize;

        /**
         * <p>The OSS URL of the image file.</p>
         */
        @NameInMap("FileURL")
        public String fileURL;

        /**
         * <p>The height of the image. Unit: pixels.</p>
         */
        @NameInMap("Height")
        public Integer height;

        /**
         * <p>The name of the source file.</p>
         */
        @NameInMap("OriginalFileName")
        public String originalFileName;

        /**
         * <p>The width of the image. Unit: pixels.</p>
         */
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
        /**
         * <p>The ID of the application.</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>The ID of the category to which the image belongs.</p>
         */
        @NameInMap("CateId")
        public Long cateId;

        /**
         * <p>The name of the category.</p>
         */
        @NameInMap("CateName")
        public String cateName;

        /**
         * <p>The time when the image was created. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The description of the image.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The ID of the image file.</p>
         */
        @NameInMap("ImageId")
        public String imageId;

        /**
         * <p>The type of the image. Valid values:</p>
         * <br>
         * <p>*   **CoverSnapshot**: thumbnail snapshot</p>
         * <p>*   **NormalSnapshot**: normal snapshot</p>
         * <p>*   **SpriteSnapshot**: sprite snapshot</p>
         * <p>*   **SpriteOriginSnapshot**: sprite source snapshot</p>
         * <p>*   **All**: images of all the preceding types. If this parameter is not set to All, you can specify multiple types and separate the types with commas (,).</p>
         */
        @NameInMap("ImageType")
        public String imageType;

        /**
         * <p>The source information about the image.</p>
         */
        @NameInMap("Mezzanine")
        public GetImageInfosResponseBodyImageInfoMezzanine mezzanine;

        /**
         * <p>The status of the image file. Valid values:</p>
         * <br>
         * <p>*   **Uploading**: The image is being uploaded. This is the initial status.</p>
         * <p>*   **Normal**: The image is uploaded.</p>
         * <p>*   **UploadFail**: The image fails to be uploaded.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The bucket in which the image is stored.</p>
         */
        @NameInMap("StorageLocation")
        public String storageLocation;

        /**
         * <p>The tags of the image. Separate multiple tags with commas (,).</p>
         */
        @NameInMap("Tags")
        public String tags;

        /**
         * <p>The title of the image.</p>
         */
        @NameInMap("Title")
        public String title;

        /**
         * <p>The image URL. If a domain name for CDN is specified, a CDN URL is returned. Otherwise, an OSS URL is returned.</p>
         */
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
