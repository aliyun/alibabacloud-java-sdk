// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetVideoListResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of media files returned.</p>
     */
    @NameInMap("Total")
    public Integer total;

    /**
     * <p>The information about the media file. Information about a maximum of 5,000 media files can be returned.</p>
     */
    @NameInMap("VideoList")
    public GetVideoListResponseBodyVideoList videoList;

    public static GetVideoListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetVideoListResponseBody self = new GetVideoListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetVideoListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetVideoListResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public GetVideoListResponseBody setVideoList(GetVideoListResponseBodyVideoList videoList) {
        this.videoList = videoList;
        return this;
    }
    public GetVideoListResponseBodyVideoList getVideoList() {
        return this.videoList;
    }

    public static class GetVideoListResponseBodyVideoListVideoSnapshots extends TeaModel {
        @NameInMap("Snapshot")
        public java.util.List<String> snapshot;

        public static GetVideoListResponseBodyVideoListVideoSnapshots build(java.util.Map<String, ?> map) throws Exception {
            GetVideoListResponseBodyVideoListVideoSnapshots self = new GetVideoListResponseBodyVideoListVideoSnapshots();
            return TeaModel.build(map, self);
        }

        public GetVideoListResponseBodyVideoListVideoSnapshots setSnapshot(java.util.List<String> snapshot) {
            this.snapshot = snapshot;
            return this;
        }
        public java.util.List<String> getSnapshot() {
            return this.snapshot;
        }

    }

    public static class GetVideoListResponseBodyVideoListVideo extends TeaModel {
        /**
         * <p>The application ID. Default value: **app-1000000**.</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>The category ID.</p>
         */
        @NameInMap("CateId")
        public Long cateId;

        /**
         * <p>The category name.</p>
         */
        @NameInMap("CateName")
        public String cateName;

        /**
         * <p>The thumbnail URL of the media file.</p>
         */
        @NameInMap("CoverURL")
        public String coverURL;

        /**
         * <p>The time when the media file was created. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The description of the media file.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The duration of the media file. Unit: seconds.</p>
         */
        @NameInMap("Duration")
        public Float duration;

        /**
         * <p>The time when the video was updated. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.</p>
         */
        @NameInMap("ModificationTime")
        public String modificationTime;

        @NameInMap("RestoreExpiration")
        public String restoreExpiration;

        @NameInMap("RestoreStatus")
        public String restoreStatus;

        /**
         * <p>The size of the source file. Unit: bytes.</p>
         */
        @NameInMap("Size")
        public Long size;

        /**
         * <p>The video snapshot URLs.</p>
         */
        @NameInMap("Snapshots")
        public GetVideoListResponseBodyVideoListVideoSnapshots snapshots;

        /**
         * <p>The video status. Valid values:</p>
         * <br>
         * <p>*   **Uploading**: The video is being uploaded.</p>
         * <p>*   **UploadFail**: The video failed to be uploaded.</p>
         * <p>*   **UploadSucc**: The video has been uploaded.</p>
         * <p>*   **Transcoding**: The video is being transcoded.</p>
         * <p>*   **TranscodeFail**: The video failed to be transcoded.</p>
         * <p>*   **checking**: The video is being reviewed.</p>
         * <p>*   **Blocked**: The video is blocked.</p>
         * <p>*   **Normal**: The video is normal.</p>
         * <p>*   **ProduceFail**: The video failed to be produced.</p>
         * <br>
         * <p>For more information about each video status, see the "Status: the status of a video" section of the [Basic data types](~~52839#section-p7c-jgy-070~~) topic.</p>
         */
        @NameInMap("Status")
        public String status;

        @NameInMap("StorageClass")
        public String storageClass;

        /**
         * <p>The storage address of the media file.</p>
         */
        @NameInMap("StorageLocation")
        public String storageLocation;

        /**
         * <p>The tags of the media file. Multiple tags are separated by commas (,).</p>
         */
        @NameInMap("Tags")
        public String tags;

        /**
         * <p>The title of the media file.</p>
         */
        @NameInMap("Title")
        public String title;

        /**
         * <p>The ID of the media file.</p>
         */
        @NameInMap("VideoId")
        public String videoId;

        public static GetVideoListResponseBodyVideoListVideo build(java.util.Map<String, ?> map) throws Exception {
            GetVideoListResponseBodyVideoListVideo self = new GetVideoListResponseBodyVideoListVideo();
            return TeaModel.build(map, self);
        }

        public GetVideoListResponseBodyVideoListVideo setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public GetVideoListResponseBodyVideoListVideo setCateId(Long cateId) {
            this.cateId = cateId;
            return this;
        }
        public Long getCateId() {
            return this.cateId;
        }

        public GetVideoListResponseBodyVideoListVideo setCateName(String cateName) {
            this.cateName = cateName;
            return this;
        }
        public String getCateName() {
            return this.cateName;
        }

        public GetVideoListResponseBodyVideoListVideo setCoverURL(String coverURL) {
            this.coverURL = coverURL;
            return this;
        }
        public String getCoverURL() {
            return this.coverURL;
        }

        public GetVideoListResponseBodyVideoListVideo setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public GetVideoListResponseBodyVideoListVideo setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetVideoListResponseBodyVideoListVideo setDuration(Float duration) {
            this.duration = duration;
            return this;
        }
        public Float getDuration() {
            return this.duration;
        }

        public GetVideoListResponseBodyVideoListVideo setModificationTime(String modificationTime) {
            this.modificationTime = modificationTime;
            return this;
        }
        public String getModificationTime() {
            return this.modificationTime;
        }

        public GetVideoListResponseBodyVideoListVideo setRestoreExpiration(String restoreExpiration) {
            this.restoreExpiration = restoreExpiration;
            return this;
        }
        public String getRestoreExpiration() {
            return this.restoreExpiration;
        }

        public GetVideoListResponseBodyVideoListVideo setRestoreStatus(String restoreStatus) {
            this.restoreStatus = restoreStatus;
            return this;
        }
        public String getRestoreStatus() {
            return this.restoreStatus;
        }

        public GetVideoListResponseBodyVideoListVideo setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

        public GetVideoListResponseBodyVideoListVideo setSnapshots(GetVideoListResponseBodyVideoListVideoSnapshots snapshots) {
            this.snapshots = snapshots;
            return this;
        }
        public GetVideoListResponseBodyVideoListVideoSnapshots getSnapshots() {
            return this.snapshots;
        }

        public GetVideoListResponseBodyVideoListVideo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetVideoListResponseBodyVideoListVideo setStorageClass(String storageClass) {
            this.storageClass = storageClass;
            return this;
        }
        public String getStorageClass() {
            return this.storageClass;
        }

        public GetVideoListResponseBodyVideoListVideo setStorageLocation(String storageLocation) {
            this.storageLocation = storageLocation;
            return this;
        }
        public String getStorageLocation() {
            return this.storageLocation;
        }

        public GetVideoListResponseBodyVideoListVideo setTags(String tags) {
            this.tags = tags;
            return this;
        }
        public String getTags() {
            return this.tags;
        }

        public GetVideoListResponseBodyVideoListVideo setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public GetVideoListResponseBodyVideoListVideo setVideoId(String videoId) {
            this.videoId = videoId;
            return this;
        }
        public String getVideoId() {
            return this.videoId;
        }

    }

    public static class GetVideoListResponseBodyVideoList extends TeaModel {
        @NameInMap("Video")
        public java.util.List<GetVideoListResponseBodyVideoListVideo> video;

        public static GetVideoListResponseBodyVideoList build(java.util.Map<String, ?> map) throws Exception {
            GetVideoListResponseBodyVideoList self = new GetVideoListResponseBodyVideoList();
            return TeaModel.build(map, self);
        }

        public GetVideoListResponseBodyVideoList setVideo(java.util.List<GetVideoListResponseBodyVideoListVideo> video) {
            this.video = video;
            return this;
        }
        public java.util.List<GetVideoListResponseBodyVideoListVideo> getVideo() {
            return this.video;
        }

    }

}
