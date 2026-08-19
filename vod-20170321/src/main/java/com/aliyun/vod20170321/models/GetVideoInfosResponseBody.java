// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetVideoInfosResponseBody extends TeaModel {
    /**
     * <p>The list of custom IDs that do not exist.</p>
     */
    @NameInMap("NonExistReferenceIds")
    public java.util.List<String> nonExistReferenceIds;

    /**
     * <p>The list of audio or video IDs that do not exist.</p>
     */
    @NameInMap("NonExistVideoIds")
    public java.util.List<String> nonExistVideoIds;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>25818875-5F78-4AF6-D7393642CA58****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information about the audio and video files.</p>
     */
    @NameInMap("VideoList")
    public java.util.List<GetVideoInfosResponseBodyVideoList> videoList;

    public static GetVideoInfosResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetVideoInfosResponseBody self = new GetVideoInfosResponseBody();
        return TeaModel.build(map, self);
    }

    public GetVideoInfosResponseBody setNonExistReferenceIds(java.util.List<String> nonExistReferenceIds) {
        this.nonExistReferenceIds = nonExistReferenceIds;
        return this;
    }
    public java.util.List<String> getNonExistReferenceIds() {
        return this.nonExistReferenceIds;
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
        /**
         * <p>The application ID.</p>
         * 
         * <strong>example:</strong>
         * <p>app-****</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>The category ID.</p>
         * 
         * <strong>example:</strong>
         * <p>781111****</p>
         */
        @NameInMap("CateId")
        public Long cateId;

        /**
         * <p>The category name.</p>
         * 
         * <strong>example:</strong>
         * <p>cate1</p>
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
         * <p>The time when the audio or video file was created. The time follows the ISO 8601 standard in the <i>yyyy-MM-dd</i>T<i>HH:mm:ss</i>Z format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2017-06-26T05:38:48Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The description of the audio or video file.</p>
         * 
         * <strong>example:</strong>
         * <p>Alibaba Cloud VOD video description</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The status of the offline download switch. If the offline download feature is enabled, mobile users can cache videos to their local devices for offline viewing by using ApsaraVideo Player. For more information, see <a href="https://help.aliyun.com/document_detail/86107.html">Offline download</a>. Valid values:</p>
         * <ul>
         * <li><strong>on</strong>: enabled. Offline download is allowed.</li>
         * <li><strong>off</strong>: disabled. Offline download is not allowed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("DownloadSwitch")
        public String downloadSwitch;

        /**
         * <p>The duration of the audio or video file. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>120</p>
         */
        @NameInMap("Duration")
        public Float duration;

        /**
         * <p>The last time when the audio or video file was updated. The time follows the ISO 8601 standard in the <i>yyyy-MM-dd</i>T<i>HH:mm:ss</i>Z format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2017-06-26T06:38:48Z</p>
         */
        @NameInMap("ModificationTime")
        public String modificationTime;

        /**
         * <p>The custom ID. The value can contain only lowercase letters, uppercase letters, digits, hyphens (-), and underscores (_), and must be 6 to 64 characters in length. The value is unique at the user level.</p>
         * 
         * <strong>example:</strong>
         * <p>123-123</p>
         */
        @NameInMap("ReferenceId")
        public String referenceId;

        /**
         * <p>The expiration time of the media asset restoration.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-03-30T10:14:14Z</p>
         */
        @NameInMap("RestoreExpiration")
        public String restoreExpiration;

        /**
         * <p>The restoration status of the media asset. Valid values:</p>
         * <ul>
         * <li><strong>Processing</strong>: The media asset is being restored.</li>
         * <li><strong>Success</strong>: The media asset is restored.</li>
         * <li><strong>Failed</strong>: The media asset failed to be restored.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        @NameInMap("RestoreStatus")
        public String restoreStatus;

        /**
         * <p>The size of the audio or video source file. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>453</p>
         */
        @NameInMap("Size")
        public Long size;

        /**
         * <p>The array of video snapshot URLs.</p>
         */
        @NameInMap("Snapshots")
        public java.util.List<String> snapshots;

        /**
         * <p>The video status. Valid values:</p>
         * <ul>
         * <li><strong>Uploading</strong>: The video is being uploaded.</li>
         * <li><strong>UploadFail</strong>: The video failed to be uploaded.</li>
         * <li><strong>UploadSucc</strong>: The video has been uploaded.</li>
         * <li><strong>Transcoding</strong>: The video is being transcoded.</li>
         * <li><strong>TranscodeFail</strong>: The video failed to be transcoded.</li>
         * <li><strong>Blocked</strong>: The video is blocked.</li>
         * <li><strong>Normal</strong>: The video is in a normal state.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The storage class of the media asset. Valid values:</p>
         * <ul>
         * <li><strong>Standard</strong>: standard.</li>
         * <li><strong>IA</strong>: media asset Infrequent Access.</li>
         * <li><strong>Archive</strong>: media asset Archive.</li>
         * <li><strong>ColdArchive</strong>: media asset Cold Archive.</li>
         * <li><strong>SourceIA</strong>: source file Infrequent Access.</li>
         * <li><strong>SourceArchive</strong>: source file Archive.</li>
         * <li><strong>SourceColdArchive</strong>: source file Cold Archive.</li>
         * <li><strong>Changing</strong>: the media asset storage class is being changed.</li>
         * <li><strong>SourceChanging</strong>: the source file storage class is being changed.</li>
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
         * <p>tag1, tag2</p>
         */
        @NameInMap("Tags")
        public String tags;

        /**
         * <p>The transcoding template group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>b4039216985f4312a5382a4ed****</p>
         */
        @NameInMap("TemplateGroupId")
        public String templateGroupId;

        /**
         * <p>The title of the audio or video file.</p>
         * 
         * <strong>example:</strong>
         * <p>Alibaba Cloud VOD Video Title</p>
         */
        @NameInMap("Title")
        public String title;

        /**
         * <p>The custom settings. The value is a JSON string that supports settings such as message callbacks and upload acceleration. For more information, see <a href="https://help.aliyun.com/document_detail/86952.html">UserData</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;MessageCallback&quot;:{&quot;CallbackURL&quot;:&quot;<a href="http://example.aliyundoc.com%22%7D,%22Extend%22:%7B%22localId%22:%22*****%22,%22test%22:%22www%22%7D%7D">http://example.aliyundoc.com&quot;},&quot;Extend&quot;:{&quot;localId&quot;:&quot;*****&quot;,&quot;test&quot;:&quot;www&quot;}}</a></p>
         */
        @NameInMap("UserData")
        public String userData;

        /**
         * <p>The audio or video ID.</p>
         * 
         * <strong>example:</strong>
         * <p>7753d144efd74d6c45fe0570****</p>
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

        public GetVideoInfosResponseBodyVideoList setDownloadSwitch(String downloadSwitch) {
            this.downloadSwitch = downloadSwitch;
            return this;
        }
        public String getDownloadSwitch() {
            return this.downloadSwitch;
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

        public GetVideoInfosResponseBodyVideoList setReferenceId(String referenceId) {
            this.referenceId = referenceId;
            return this;
        }
        public String getReferenceId() {
            return this.referenceId;
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

        public GetVideoInfosResponseBodyVideoList setUserData(String userData) {
            this.userData = userData;
            return this;
        }
        public String getUserData() {
            return this.userData;
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
