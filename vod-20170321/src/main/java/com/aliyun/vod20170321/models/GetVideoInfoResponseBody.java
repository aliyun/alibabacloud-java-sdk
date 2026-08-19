// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetVideoInfoResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>25818875-5F78-4AF6-D7393642CA58****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The audio or video information.</p>
     */
    @NameInMap("Video")
    public GetVideoInfoResponseBodyVideo video;

    public static GetVideoInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetVideoInfoResponseBody self = new GetVideoInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetVideoInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetVideoInfoResponseBody setVideo(GetVideoInfoResponseBodyVideo video) {
        this.video = video;
        return this;
    }
    public GetVideoInfoResponseBodyVideo getVideo() {
        return this.video;
    }

    public static class GetVideoInfoResponseBodyVideoSnapshots extends TeaModel {
        @NameInMap("Snapshot")
        public java.util.List<String> snapshot;

        public static GetVideoInfoResponseBodyVideoSnapshots build(java.util.Map<String, ?> map) throws Exception {
            GetVideoInfoResponseBodyVideoSnapshots self = new GetVideoInfoResponseBodyVideoSnapshots();
            return TeaModel.build(map, self);
        }

        public GetVideoInfoResponseBodyVideoSnapshots setSnapshot(java.util.List<String> snapshot) {
            this.snapshot = snapshot;
            return this;
        }
        public java.util.List<String> getSnapshot() {
            return this.snapshot;
        }

    }

    public static class GetVideoInfoResponseBodyVideo extends TeaModel {
        /**
         * <p>The application ID.</p>
         * 
         * <strong>example:</strong>
         * <p>app-****</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>The final review result of the audio or video file. Valid values:</p>
         * <ul>
         * <li><strong>Normal</strong>: Approved.</li>
         * <li><strong>Blocked</strong>: Blocked.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("AuditStatus")
        public String auditStatus;

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
         * <p>The time when the audio or video file was created. The time is in the <i>yyyy-MM-dd</i>T<i>HH:mm:ss</i>Z format (UTC).</p>
         * 
         * <strong>example:</strong>
         * <p>2017-11-14T09:15:50Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The custom media asset information.</p>
         * <blockquote>
         * <p>This parameter is deprecated. The API no longer returns this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>{&quot;aaa&quot;:&quot;test&quot;}</p>
         */
        @NameInMap("CustomMediaInfo")
        public String customMediaInfo;

        /**
         * <p>The description of the audio or video file.</p>
         * 
         * <strong>example:</strong>
         * <p>Alibaba Cloud VOD video description</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The status of the offline download switch. After the offline download feature is enabled, mobile users can cache videos to their local devices for offline viewing by using ApsaraVideo Player. For more information, see <a href="https://help.aliyun.com/document_detail/86107.html">Offline download</a>. Valid values:</p>
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
         * <p>135.6</p>
         */
        @NameInMap("Duration")
        public Float duration;

        /**
         * <p>The time when the audio or video file was last updated. The time is in the <i>yyyy-MM-dd</i>T<i>HH:mm:ss</i>Z format (UTC).</p>
         * 
         * <strong>example:</strong>
         * <p>2017-11-14T10:15:50Z</p>
         */
        @NameInMap("ModificationTime")
        public String modificationTime;

        /**
         * <p>The custom ID. Only lowercase letters, uppercase letters, digits, hyphens, and underscores are supported. The length is 6 to 64 characters. The ID is unique at the user level.</p>
         * 
         * <strong>example:</strong>
         * <p>123-123</p>
         */
        @NameInMap("ReferenceId")
        public String referenceId;

        /**
         * <p>The region where the audio or video file is stored.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        @NameInMap("RegionId")
        public String regionId;

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
         * <p>10897890</p>
         */
        @NameInMap("Size")
        public Long size;

        @NameInMap("Snapshots")
        public GetVideoInfoResponseBodyVideoSnapshots snapshots;

        /**
         * <p>The status of the audio or video file. For more information about the operations that can be performed on audio and video files in each status and the limits, see <a href="~~52839#title-vqg-8cz-7p8~~">Status: audio and video status</a>. Valid values:</p>
         * <ul>
         * <li><strong>Uploading</strong>: The file is being uploaded.</li>
         * <li><strong>UploadFail</strong>: The file failed to be uploaded.</li>
         * <li><strong>UploadSucc</strong>: The file is uploaded.</li>
         * <li><strong>Transcoding</strong>: The file is being transcoded.</li>
         * <li><strong>TranscodeFail</strong>: The file failed to be transcoded.</li>
         * <li><strong>Blocked</strong>: The file is blocked.</li>
         * <li><strong>Normal</strong>: The file is in a normal state.</li>
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
         * <li><strong>IA</strong>: Infrequent Access (media asset).</li>
         * <li><strong>Archive</strong>: Archive (media asset).</li>
         * <li><strong>ColdArchive</strong>: Cold Archive (media asset).</li>
         * <li><strong>SourceIA</strong>: Infrequent Access (source file).</li>
         * <li><strong>SourceArchive</strong>: Archive (source file).</li>
         * <li><strong>SourceColdArchive</strong>: Cold Archive (source file).</li>
         * <li><strong>Changing</strong>: The storage class of the media asset is being changed.</li>
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
         * <p>out-201703232251****.oss-cn-shanghai.aliyuncs.com</p>
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
         * <p>9ae2af636ca64835b0c10412f448****</p>
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
         * <p>9b73864d75f1d231e9001cd5f8****</p>
         */
        @NameInMap("VideoId")
        public String videoId;

        public static GetVideoInfoResponseBodyVideo build(java.util.Map<String, ?> map) throws Exception {
            GetVideoInfoResponseBodyVideo self = new GetVideoInfoResponseBodyVideo();
            return TeaModel.build(map, self);
        }

        public GetVideoInfoResponseBodyVideo setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public GetVideoInfoResponseBodyVideo setAuditStatus(String auditStatus) {
            this.auditStatus = auditStatus;
            return this;
        }
        public String getAuditStatus() {
            return this.auditStatus;
        }

        public GetVideoInfoResponseBodyVideo setCateId(Long cateId) {
            this.cateId = cateId;
            return this;
        }
        public Long getCateId() {
            return this.cateId;
        }

        public GetVideoInfoResponseBodyVideo setCateName(String cateName) {
            this.cateName = cateName;
            return this;
        }
        public String getCateName() {
            return this.cateName;
        }

        public GetVideoInfoResponseBodyVideo setCoverURL(String coverURL) {
            this.coverURL = coverURL;
            return this;
        }
        public String getCoverURL() {
            return this.coverURL;
        }

        public GetVideoInfoResponseBodyVideo setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public GetVideoInfoResponseBodyVideo setCustomMediaInfo(String customMediaInfo) {
            this.customMediaInfo = customMediaInfo;
            return this;
        }
        public String getCustomMediaInfo() {
            return this.customMediaInfo;
        }

        public GetVideoInfoResponseBodyVideo setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetVideoInfoResponseBodyVideo setDownloadSwitch(String downloadSwitch) {
            this.downloadSwitch = downloadSwitch;
            return this;
        }
        public String getDownloadSwitch() {
            return this.downloadSwitch;
        }

        public GetVideoInfoResponseBodyVideo setDuration(Float duration) {
            this.duration = duration;
            return this;
        }
        public Float getDuration() {
            return this.duration;
        }

        public GetVideoInfoResponseBodyVideo setModificationTime(String modificationTime) {
            this.modificationTime = modificationTime;
            return this;
        }
        public String getModificationTime() {
            return this.modificationTime;
        }

        public GetVideoInfoResponseBodyVideo setReferenceId(String referenceId) {
            this.referenceId = referenceId;
            return this;
        }
        public String getReferenceId() {
            return this.referenceId;
        }

        public GetVideoInfoResponseBodyVideo setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetVideoInfoResponseBodyVideo setRestoreExpiration(String restoreExpiration) {
            this.restoreExpiration = restoreExpiration;
            return this;
        }
        public String getRestoreExpiration() {
            return this.restoreExpiration;
        }

        public GetVideoInfoResponseBodyVideo setRestoreStatus(String restoreStatus) {
            this.restoreStatus = restoreStatus;
            return this;
        }
        public String getRestoreStatus() {
            return this.restoreStatus;
        }

        public GetVideoInfoResponseBodyVideo setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

        public GetVideoInfoResponseBodyVideo setSnapshots(GetVideoInfoResponseBodyVideoSnapshots snapshots) {
            this.snapshots = snapshots;
            return this;
        }
        public GetVideoInfoResponseBodyVideoSnapshots getSnapshots() {
            return this.snapshots;
        }

        public GetVideoInfoResponseBodyVideo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetVideoInfoResponseBodyVideo setStorageClass(String storageClass) {
            this.storageClass = storageClass;
            return this;
        }
        public String getStorageClass() {
            return this.storageClass;
        }

        public GetVideoInfoResponseBodyVideo setStorageLocation(String storageLocation) {
            this.storageLocation = storageLocation;
            return this;
        }
        public String getStorageLocation() {
            return this.storageLocation;
        }

        public GetVideoInfoResponseBodyVideo setTags(String tags) {
            this.tags = tags;
            return this;
        }
        public String getTags() {
            return this.tags;
        }

        public GetVideoInfoResponseBodyVideo setTemplateGroupId(String templateGroupId) {
            this.templateGroupId = templateGroupId;
            return this;
        }
        public String getTemplateGroupId() {
            return this.templateGroupId;
        }

        public GetVideoInfoResponseBodyVideo setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public GetVideoInfoResponseBodyVideo setUserData(String userData) {
            this.userData = userData;
            return this;
        }
        public String getUserData() {
            return this.userData;
        }

        public GetVideoInfoResponseBodyVideo setVideoId(String videoId) {
            this.videoId = videoId;
            return this;
        }
        public String getVideoId() {
            return this.videoId;
        }

    }

}
