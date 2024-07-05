// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetVideoInfoResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>25818875-5F78-4AF6-D7393642CA58****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information about the audio or video file.</p>
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
         * <p>The ID of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>app-****</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>The final review result of the audio or video file. Valid values:</p>
         * <ul>
         * <li><strong>Normal</strong>: pass</li>
         * <li><strong>Blocked</strong>: blocked</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("AuditStatus")
        public String auditStatus;

        /**
         * <p>The category ID of the media file.</p>
         * 
         * <strong>example:</strong>
         * <p>781111****</p>
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
         * <p>The thumbnail URL of the media file.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.aliyundoc.com/****.jpg">https://example.aliyundoc.com/****.jpg</a></p>
         */
        @NameInMap("CoverURL")
        public String coverURL;

        /**
         * <p>The time when the media file was created. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2017-11-14T09:15:50Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The custom information about the media file.\n\n&gt; This parameter has been deprecated. This parameter is no longer returned after you call the operation.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;aaa&quot;:&quot;test&quot;}</p>
         */
        @NameInMap("CustomMediaInfo")
        public String customMediaInfo;

        /**
         * <p>The description of the media file.</p>
         * 
         * <strong>example:</strong>
         * <p>Video description in ApsaraVideo VOD</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>Indicates whether the offline download feature is enabled. If you enable the offline download feature, users can download and play videos by using the ApsaraVideo Player on a local PC. For more information, see <a href="https://help.aliyun.com/document_detail/86107.html">Configure download settings</a>. Valid values:</p>
         * <ul>
         * <li><strong>on</strong>: the offline download feature is enabled.</li>
         * <li><strong>off</strong>: the offline download feature is not enabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("DownloadSwitch")
        public String downloadSwitch;

        /**
         * <p>The duration of the media file. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>135.6</p>
         */
        @NameInMap("Duration")
        public Float duration;

        /**
         * <p>The time when the audio or video file was last updated. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2017-11-14T10:15:50Z</p>
         */
        @NameInMap("ModificationTime")
        public String modificationTime;

        /**
         * <p>The region where the media file is stored.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The period of time in which the object remains in the restored state.</p>
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
         * <p>The video snapshot URLs.</p>
         */
        @NameInMap("Snapshots")
        public GetVideoInfoResponseBodyVideoSnapshots snapshots;

        /**
         * <p>The status of the media file. For more information about the operations that you can perform on files in different statuses and usage limits, see <a href="~~52839#title-vqg-8cz-7p8~~">Status: the status of a video</a>. Valid values:</p>
         * <ul>
         * <li><strong>Uploading</strong></li>
         * <li><strong>UploadFail</strong></li>
         * <li><strong>UploadSucc</strong></li>
         * <li><strong>Transcoding</strong></li>
         * <li><strong>TranscodeFail</strong></li>
         * <li><strong>Blocked</strong></li>
         * <li><strong>Normal</strong></li>
         * </ul>
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
         * <p>The storage address of the media file.</p>
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
         * <p>Tag 1,Tag 2</p>
         */
        @NameInMap("Tags")
        public String tags;

        /**
         * <p>The ID of the transcoding template group.</p>
         * 
         * <strong>example:</strong>
         * <p>9ae2af636ca64835b0c10412f448****</p>
         */
        @NameInMap("TemplateGroupId")
        public String templateGroupId;

        /**
         * <p>The title of the media file.</p>
         * 
         * <strong>example:</strong>
         * <p>Video title in ApsaraVideo VOD</p>
         */
        @NameInMap("Title")
        public String title;

        /**
         * <p>The ID of the media file.</p>
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

        public GetVideoInfoResponseBodyVideo setVideoId(String videoId) {
            this.videoId = videoId;
            return this;
        }
        public String getVideoId() {
            return this.videoId;
        }

    }

}
