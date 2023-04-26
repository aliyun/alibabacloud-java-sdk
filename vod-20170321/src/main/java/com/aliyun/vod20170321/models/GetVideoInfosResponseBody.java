// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetVideoInfosResponseBody extends TeaModel {
    /**
     * <p>The status of the video. By default, videos in all states are returned. Multiple states are separated by commas (,). Valid values:</p>
     * <br>
     * <p>*   **Uploading**: The video is being uploaded.</p>
     * <p>*   **UploadFail**: The video fails to be uploaded.</p>
     * <p>*   **UploadSucc**: The video is uploaded.</p>
     * <p>*   **Transcoding**: The video is being transcoded.</p>
     * <p>*   **TranscodeFail**: The video fails to be transcoded.</p>
     * <p>*   **Blocked**: The video is blocked.</p>
     * <p>*   **Normal**: The video can be played.</p>
     */
    @NameInMap("NonExistVideoIds")
    public java.util.List<String> nonExistVideoIds;

    /**
     * <p>The title of the video.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The description of the video.</p>
     */
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
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>The Object Storage Service (OSS) bucket where the video file is stored.</p>
         */
        @NameInMap("CateId")
        public Long cateId;

        /**
         * <p>The name of the video category.</p>
         */
        @NameInMap("CateName")
        public String cateName;

        @NameInMap("CoverURL")
        public String coverURL;

        /**
         * <p>The time when the video file was created. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>Queries the information about multiple videos at a time.</p>
         */
        @NameInMap("Description")
        public String description;

        @NameInMap("Duration")
        public Float duration;

        /**
         * <p>The URL array of video snapshots.</p>
         */
        @NameInMap("ModificationTime")
        public String modificationTime;

        @NameInMap("RestoreExpiration")
        public String restoreExpiration;

        @NameInMap("RestoreStatus")
        public String restoreStatus;

        @NameInMap("Size")
        public Long size;

        @NameInMap("Snapshots")
        public java.util.List<String> snapshots;

        /**
         * <p>The URL of the video thumbnail.</p>
         */
        @NameInMap("Status")
        public String status;

        @NameInMap("StorageClass")
        public String storageClass;

        /**
         * <p>The information about the video.</p>
         */
        @NameInMap("StorageLocation")
        public String storageLocation;

        /**
         * <p>The ID of the video category.</p>
         */
        @NameInMap("Tags")
        public String tags;

        @NameInMap("TemplateGroupId")
        public String templateGroupId;

        @NameInMap("Title")
        public String title;

        /**
         * <p>The list of video IDs. Separate multiple IDs with commas (,). A maximum of 20 IDs can be specified.</p>
         */
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

        public GetVideoInfosResponseBodyVideoList setRestoreExpiration(String restoreExpiration) {
            this.restoreExpiration = restoreExpiration;
            return this;
        }
        public String getRestoreExpiration() {
            return this.restoreExpiration;
        }

        public GetVideoInfosResponseBodyVideoList setRestoreStatus(String restoreStatus) {
            this.restoreStatus = restoreStatus;
            return this;
        }
        public String getRestoreStatus() {
            return this.restoreStatus;
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

        public GetVideoInfosResponseBodyVideoList setStorageClass(String storageClass) {
            this.storageClass = storageClass;
            return this;
        }
        public String getStorageClass() {
            return this.storageClass;
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
