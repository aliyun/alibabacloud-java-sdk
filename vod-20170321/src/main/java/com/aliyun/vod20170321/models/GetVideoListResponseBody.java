// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetVideoListResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>25818875-5F78-4AF6-D7393642CA58****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of media files returned.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("Total")
    public Integer total;

    /**
     * <p>The information about the audio or video files. Information about a maximum of 5,000 audio or video files can be returned.</p>
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
         * <p>The ID of the application. Default value: <strong>app-1000000</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>app-1000000</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>The category ID of the audio or video file.</p>
         * 
         * <strong>example:</strong>
         * <p>781111</p>
         */
        @NameInMap("CateId")
        public Long cateId;

        /**
         * <p>The name of the category.</p>
         * 
         * <strong>example:</strong>
         * <p>Category name</p>
         */
        @NameInMap("CateName")
        public String cateName;

        /**
         * <p>The thumbnail URL of the audio or video file.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.aliyundoc.com/****.jpg">https://example.aliyundoc.com/****.jpg</a></p>
         */
        @NameInMap("CoverURL")
        public String coverURL;

        /**
         * <p>The time when the audio or video file was created. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>hh:mm:ss</em>Z format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2017-11-14T09:15:50Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The description of the audio or video file.</p>
         * 
         * <strong>example:</strong>
         * <p>Video description in ApsaraVideo VOD</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The duration of the audio or video file. Unit: seconds. 86,400 seconds is equivalent to 24 hours.</p>
         * 
         * <strong>example:</strong>
         * <p>135.6</p>
         */
        @NameInMap("Duration")
        public Float duration;

        /**
         * <p>The time when the video was updated. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>hh:mm:ss</em>Z format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2017-11-14T09:16:50Z</p>
         */
        @NameInMap("ModificationTime")
        public String modificationTime;

        /**
         * <p>The period of time in which the audio or video file remains in the restored state.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-03-30T10:14:14Z</p>
         */
        @NameInMap("RestoreExpiration")
        public String restoreExpiration;

        /**
         * <p>The restoration status of the audio or video file. Valid values:</p>
         * <ul>
         * <li><strong>Processing</strong></li>
         * <li><strong>Success</strong></li>
         * <li><strong>Failed</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        @NameInMap("RestoreStatus")
        public String restoreStatus;

        /**
         * <p>The size of the source file. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>10897890</p>
         */
        @NameInMap("Size")
        public Long size;

        /**
         * <p>The URL array of video snapshots.</p>
         */
        @NameInMap("Snapshots")
        public GetVideoListResponseBodyVideoListVideoSnapshots snapshots;

        /**
         * <p>The status of the audio or video file. Valid values:</p>
         * <ul>
         * <li><strong>Uploading</strong>: The video is being uploaded.</li>
         * <li><strong>UploadFail</strong>: The video failed to be uploaded.</li>
         * <li><strong>UploadSucc</strong>: The video is uploaded.</li>
         * <li><strong>Transcoding</strong>: The video is being transcoded.</li>
         * <li><strong>TranscodeFail</strong>: The video failed to be transcoded.</li>
         * <li><strong>checking</strong>: The video is being reviewed.</li>
         * <li><strong>Blocked</strong>: The video is blocked.</li>
         * <li><strong>Normal</strong>: The video is normal.</li>
         * <li><strong>ProduceFail</strong>: The video failed to be produced.</li>
         * </ul>
         * <p>For more information about each video status, see the &quot;Status: the status of a video&quot; section of the <a href="~~52839#section-p7c-jgy-070~~">Basic data types</a> topic.</p>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The storage class of the audio or video file. Valid values:</p>
         * <ul>
         * <li><strong>Standard</strong>: All media resources are stored as Standard objects.</li>
         * <li><strong>IA</strong>: All media resources are stored as IA objects.</li>
         * <li><strong>Archive</strong>: All media resources are stored as Archive objects.</li>
         * <li><strong>ColdArchive</strong>: All media resources are stored as Cold Archive objects.</li>
         * <li><strong>SourceIA</strong>: Only the source files are IA objects.</li>
         * <li><strong>SourceArchive</strong>: Only the source files are Archive objects.</li>
         * <li><strong>SourceColdArchive</strong>: Only the source files are Cold Archive objects.</li>
         * <li><strong>Changing</strong>: The storage class of the audio or video file is being changed.</li>
         * <li><strong>SourceChanging</strong>: The storage class of the source file is being changed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Standard</p>
         */
        @NameInMap("StorageClass")
        public String storageClass;

        /**
         * <p>The storage address of the audio or video file.</p>
         * 
         * <strong>example:</strong>
         * <p>out-****.oss-cn-shanghai.aliyuncs.com</p>
         */
        @NameInMap("StorageLocation")
        public String storageLocation;

        /**
         * <p>The tags of the audio or video file. Multiple tags are separated by commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>Tag 1,Tag 2</p>
         */
        @NameInMap("Tags")
        public String tags;

        /**
         * <p>The title of the audio or video file.</p>
         * 
         * <strong>example:</strong>
         * <p>Video title in ApsaraVideo VOD</p>
         */
        @NameInMap("Title")
        public String title;

        /**
         * <p>The ID of the audio or video file.</p>
         * 
         * <strong>example:</strong>
         * <p>9ae2af636ca6c10412f44891fc****</p>
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
