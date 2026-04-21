// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260319.models;

import com.aliyun.tea.*;

public class BatchGetYikeAssetMediaInfosResponseBody extends TeaModel {
    @NameInMap("IgnoredList")
    public java.util.List<String> ignoredList;

    @NameInMap("MediaInfos")
    public java.util.List<BatchGetYikeAssetMediaInfosResponseBodyMediaInfos> mediaInfos;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong><strong>11-DB8D-4A9A-875B-275798</strong></strong></strong></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static BatchGetYikeAssetMediaInfosResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchGetYikeAssetMediaInfosResponseBody self = new BatchGetYikeAssetMediaInfosResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchGetYikeAssetMediaInfosResponseBody setIgnoredList(java.util.List<String> ignoredList) {
        this.ignoredList = ignoredList;
        return this;
    }
    public java.util.List<String> getIgnoredList() {
        return this.ignoredList;
    }

    public BatchGetYikeAssetMediaInfosResponseBody setMediaInfos(java.util.List<BatchGetYikeAssetMediaInfosResponseBodyMediaInfos> mediaInfos) {
        this.mediaInfos = mediaInfos;
        return this;
    }
    public java.util.List<BatchGetYikeAssetMediaInfosResponseBodyMediaInfos> getMediaInfos() {
        return this.mediaInfos;
    }

    public BatchGetYikeAssetMediaInfosResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class BatchGetYikeAssetMediaInfosResponseBodyMediaInfosBizData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>Label</p>
         */
        @NameInMap("AuditBlockedLabel")
        public String auditBlockedLabel;

        /**
         * <strong>example:</strong>
         * <p>pass</p>
         */
        @NameInMap("AuditStatus")
        public String auditStatus;

        /**
         * <strong>example:</strong>
         * <p>ID</p>
         */
        @NameInMap("CreationJobId")
        public String creationJobId;

        /**
         * <strong>example:</strong>
         * <p>pd_0617169475</p>
         */
        @NameInMap("FolderId")
        public String folderId;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("IsFavorite")
        public String isFavorite;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("IsLogicalDeleted")
        public String isLogicalDeleted;

        /**
         * <strong>example:</strong>
         * <p>Image</p>
         */
        @NameInMap("MediaAssetSubType")
        public String mediaAssetSubType;

        /**
         * <strong>example:</strong>
         * <p>HistoricalUpload</p>
         */
        @NameInMap("MediaAssetType")
        public String mediaAssetType;

        /**
         * <strong>example:</strong>
         * <p>pd_0617169475</p>
         */
        @NameInMap("ProductionId")
        public String productionId;

        /**
         * <strong>example:</strong>
         * <p>f4a26390f02371f0a1f4e6e7c7586706</p>
         */
        @NameInMap("SourceId")
        public String sourceId;

        /**
         * <strong>example:</strong>
         * <p>name</p>
         */
        @NameInMap("SourceName")
        public String sourceName;

        /**
         * <strong>example:</strong>
         * <p>MainBody</p>
         */
        @NameInMap("SourceType")
        public String sourceType;

        public static BatchGetYikeAssetMediaInfosResponseBodyMediaInfosBizData build(java.util.Map<String, ?> map) throws Exception {
            BatchGetYikeAssetMediaInfosResponseBodyMediaInfosBizData self = new BatchGetYikeAssetMediaInfosResponseBodyMediaInfosBizData();
            return TeaModel.build(map, self);
        }

        public BatchGetYikeAssetMediaInfosResponseBodyMediaInfosBizData setAuditBlockedLabel(String auditBlockedLabel) {
            this.auditBlockedLabel = auditBlockedLabel;
            return this;
        }
        public String getAuditBlockedLabel() {
            return this.auditBlockedLabel;
        }

        public BatchGetYikeAssetMediaInfosResponseBodyMediaInfosBizData setAuditStatus(String auditStatus) {
            this.auditStatus = auditStatus;
            return this;
        }
        public String getAuditStatus() {
            return this.auditStatus;
        }

        public BatchGetYikeAssetMediaInfosResponseBodyMediaInfosBizData setCreationJobId(String creationJobId) {
            this.creationJobId = creationJobId;
            return this;
        }
        public String getCreationJobId() {
            return this.creationJobId;
        }

        public BatchGetYikeAssetMediaInfosResponseBodyMediaInfosBizData setFolderId(String folderId) {
            this.folderId = folderId;
            return this;
        }
        public String getFolderId() {
            return this.folderId;
        }

        public BatchGetYikeAssetMediaInfosResponseBodyMediaInfosBizData setIsFavorite(String isFavorite) {
            this.isFavorite = isFavorite;
            return this;
        }
        public String getIsFavorite() {
            return this.isFavorite;
        }

        public BatchGetYikeAssetMediaInfosResponseBodyMediaInfosBizData setIsLogicalDeleted(String isLogicalDeleted) {
            this.isLogicalDeleted = isLogicalDeleted;
            return this;
        }
        public String getIsLogicalDeleted() {
            return this.isLogicalDeleted;
        }

        public BatchGetYikeAssetMediaInfosResponseBodyMediaInfosBizData setMediaAssetSubType(String mediaAssetSubType) {
            this.mediaAssetSubType = mediaAssetSubType;
            return this;
        }
        public String getMediaAssetSubType() {
            return this.mediaAssetSubType;
        }

        public BatchGetYikeAssetMediaInfosResponseBodyMediaInfosBizData setMediaAssetType(String mediaAssetType) {
            this.mediaAssetType = mediaAssetType;
            return this;
        }
        public String getMediaAssetType() {
            return this.mediaAssetType;
        }

        public BatchGetYikeAssetMediaInfosResponseBodyMediaInfosBizData setProductionId(String productionId) {
            this.productionId = productionId;
            return this;
        }
        public String getProductionId() {
            return this.productionId;
        }

        public BatchGetYikeAssetMediaInfosResponseBodyMediaInfosBizData setSourceId(String sourceId) {
            this.sourceId = sourceId;
            return this;
        }
        public String getSourceId() {
            return this.sourceId;
        }

        public BatchGetYikeAssetMediaInfosResponseBodyMediaInfosBizData setSourceName(String sourceName) {
            this.sourceName = sourceName;
            return this;
        }
        public String getSourceName() {
            return this.sourceName;
        }

        public BatchGetYikeAssetMediaInfosResponseBodyMediaInfosBizData setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

    }

    public static class BatchGetYikeAssetMediaInfosResponseBodyMediaInfosFileInfoListFileBasicInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("Bitrate")
        public String bitrate;

        /**
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("Duration")
        public String duration;

        /**
         * <strong>example:</strong>
         * <p>example.mp4</p>
         */
        @NameInMap("FileName")
        public String fileName;

        /**
         * <strong>example:</strong>
         * <p>191</p>
         */
        @NameInMap("FileSize")
        public String fileSize;

        /**
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("FileStatus")
        public String fileStatus;

        /**
         * <strong>example:</strong>
         * <p>source_file</p>
         */
        @NameInMap("FileType")
        public String fileType;

        /**
         * <strong>example:</strong>
         * <p><a href="http://example-bucket.oss-cn-shanghai.aliyuncs.com/example.mp4?Expires=">http://example-bucket.oss-cn-shanghai.aliyuncs.com/example.mp4?Expires=</a><ExpireTime>&amp;OSSAccessKeyId=<OSSAccessKeyId>&amp;Signature=<Signature>&amp;security-token=<SecurityToken></p>
         */
        @NameInMap("FileUrl")
        public String fileUrl;

        /**
         * <strong>example:</strong>
         * <p>jpg</p>
         */
        @NameInMap("FormatName")
        public String formatName;

        /**
         * <strong>example:</strong>
         * <p>416</p>
         */
        @NameInMap("Height")
        public String height;

        /**
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <strong>example:</strong>
         * <p>640</p>
         */
        @NameInMap("Width")
        public String width;

        public static BatchGetYikeAssetMediaInfosResponseBodyMediaInfosFileInfoListFileBasicInfo build(java.util.Map<String, ?> map) throws Exception {
            BatchGetYikeAssetMediaInfosResponseBodyMediaInfosFileInfoListFileBasicInfo self = new BatchGetYikeAssetMediaInfosResponseBodyMediaInfosFileInfoListFileBasicInfo();
            return TeaModel.build(map, self);
        }

        public BatchGetYikeAssetMediaInfosResponseBodyMediaInfosFileInfoListFileBasicInfo setBitrate(String bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public String getBitrate() {
            return this.bitrate;
        }

        public BatchGetYikeAssetMediaInfosResponseBodyMediaInfosFileInfoListFileBasicInfo setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public BatchGetYikeAssetMediaInfosResponseBodyMediaInfosFileInfoListFileBasicInfo setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public BatchGetYikeAssetMediaInfosResponseBodyMediaInfosFileInfoListFileBasicInfo setFileSize(String fileSize) {
            this.fileSize = fileSize;
            return this;
        }
        public String getFileSize() {
            return this.fileSize;
        }

        public BatchGetYikeAssetMediaInfosResponseBodyMediaInfosFileInfoListFileBasicInfo setFileStatus(String fileStatus) {
            this.fileStatus = fileStatus;
            return this;
        }
        public String getFileStatus() {
            return this.fileStatus;
        }

        public BatchGetYikeAssetMediaInfosResponseBodyMediaInfosFileInfoListFileBasicInfo setFileType(String fileType) {
            this.fileType = fileType;
            return this;
        }
        public String getFileType() {
            return this.fileType;
        }

        public BatchGetYikeAssetMediaInfosResponseBodyMediaInfosFileInfoListFileBasicInfo setFileUrl(String fileUrl) {
            this.fileUrl = fileUrl;
            return this;
        }
        public String getFileUrl() {
            return this.fileUrl;
        }

        public BatchGetYikeAssetMediaInfosResponseBodyMediaInfosFileInfoListFileBasicInfo setFormatName(String formatName) {
            this.formatName = formatName;
            return this;
        }
        public String getFormatName() {
            return this.formatName;
        }

        public BatchGetYikeAssetMediaInfosResponseBodyMediaInfosFileInfoListFileBasicInfo setHeight(String height) {
            this.height = height;
            return this;
        }
        public String getHeight() {
            return this.height;
        }

        public BatchGetYikeAssetMediaInfosResponseBodyMediaInfosFileInfoListFileBasicInfo setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public BatchGetYikeAssetMediaInfosResponseBodyMediaInfosFileInfoListFileBasicInfo setWidth(String width) {
            this.width = width;
            return this;
        }
        public String getWidth() {
            return this.width;
        }

    }

    public static class BatchGetYikeAssetMediaInfosResponseBodyMediaInfosFileInfoList extends TeaModel {
        @NameInMap("FileBasicInfo")
        public BatchGetYikeAssetMediaInfosResponseBodyMediaInfosFileInfoListFileBasicInfo fileBasicInfo;

        public static BatchGetYikeAssetMediaInfosResponseBodyMediaInfosFileInfoList build(java.util.Map<String, ?> map) throws Exception {
            BatchGetYikeAssetMediaInfosResponseBodyMediaInfosFileInfoList self = new BatchGetYikeAssetMediaInfosResponseBodyMediaInfosFileInfoList();
            return TeaModel.build(map, self);
        }

        public BatchGetYikeAssetMediaInfosResponseBodyMediaInfosFileInfoList setFileBasicInfo(BatchGetYikeAssetMediaInfosResponseBodyMediaInfosFileInfoListFileBasicInfo fileBasicInfo) {
            this.fileBasicInfo = fileBasicInfo;
            return this;
        }
        public BatchGetYikeAssetMediaInfosResponseBodyMediaInfosFileInfoListFileBasicInfo getFileBasicInfo() {
            return this.fileBasicInfo;
        }

    }

    public static class BatchGetYikeAssetMediaInfosResponseBodyMediaInfosMediaBasicInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>ICE</p>
         */
        @NameInMap("Biz")
        public String biz;

        /**
         * <strong>example:</strong>
         * <p>general</p>
         */
        @NameInMap("BusinessType")
        public String businessType;

        /**
         * <strong>example:</strong>
         * <p>category</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <strong>example:</strong>
         * <p><a href="https://dtlive-bj.oss-cn-beijing.aliyuncs.com/cover/01e1271d-ff4f-4689-9c20-e1df81486859_open_live_cover.jpg">https://dtlive-bj.oss-cn-beijing.aliyuncs.com/cover/01e1271d-ff4f-4689-9c20-e1df81486859_open_live_cover.jpg</a></p>
         */
        @NameInMap("CoverURL")
        public String coverURL;

        /**
         * <strong>example:</strong>
         * <p>2020-12-26T04:11:08Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>2021-01-08T16:52:07Z</p>
         */
        @NameInMap("DeletedTime")
        public String deletedTime;

        /**
         * <strong>example:</strong>
         * <p>sample_description</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p><a href="https://example-bucket.oss-cn-shanghai.aliyuncs.com/example.mp4">https://example-bucket.oss-cn-shanghai.aliyuncs.com/example.mp4</a></p>
         */
        @NameInMap("InputURL")
        public String inputURL;

        /**
         * <p>MediaId</p>
         * 
         * <strong>example:</strong>
         * <p><em><strong><strong>64623a94eca8516569c8f</strong></strong></em></p>
         */
        @NameInMap("MediaId")
        public String mediaId;

        /**
         * <strong>example:</strong>
         * <p>tag1，tag2</p>
         */
        @NameInMap("MediaTags")
        public String mediaTags;

        /**
         * <strong>example:</strong>
         * <p>video</p>
         */
        @NameInMap("MediaType")
        public String mediaType;

        /**
         * <strong>example:</strong>
         * <p>2021-01-08T16:52:04Z</p>
         */
        @NameInMap("ModifiedTime")
        public String modifiedTime;

        /**
         * <strong>example:</strong>
         * <p>[]</p>
         */
        @NameInMap("Snapshots")
        public String snapshots;

        /**
         * <strong>example:</strong>
         * <p>oss</p>
         */
        @NameInMap("Source")
        public String source;

        /**
         * <strong>example:</strong>
         * <p>[{&quot;bucket&quot;:&quot;example-bucket&quot;,&quot;count&quot;:&quot;32&quot;,&quot;iceJobId&quot;:&quot;<strong><strong><strong>83ec44d58b2069def2e</strong></strong></strong>&quot;,&quot;location&quot;:&quot;oss-cn-shanghai&quot;,&quot;snapshotRegular&quot;:&quot;example/example-{Count}.jpg&quot;,&quot;spriteRegular&quot;:&quot;example/example-{TileCount}.jpg&quot;,&quot;templateId&quot;:&quot;<strong><strong><strong>e438b14ff39293eaec25</strong></strong></strong>&quot;,&quot;tileCount&quot;:&quot;1&quot;}]</p>
         */
        @NameInMap("SpriteImages")
        public String spriteImages;

        /**
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>title</p>
         */
        @NameInMap("Title")
        public String title;

        /**
         * <strong>example:</strong>
         * <p>Init</p>
         */
        @NameInMap("TranscodeStatus")
        public String transcodeStatus;

        /**
         * <strong>example:</strong>
         * <p>UserData</p>
         */
        @NameInMap("UserData")
        public String userData;

        public static BatchGetYikeAssetMediaInfosResponseBodyMediaInfosMediaBasicInfo build(java.util.Map<String, ?> map) throws Exception {
            BatchGetYikeAssetMediaInfosResponseBodyMediaInfosMediaBasicInfo self = new BatchGetYikeAssetMediaInfosResponseBodyMediaInfosMediaBasicInfo();
            return TeaModel.build(map, self);
        }

        public BatchGetYikeAssetMediaInfosResponseBodyMediaInfosMediaBasicInfo setBiz(String biz) {
            this.biz = biz;
            return this;
        }
        public String getBiz() {
            return this.biz;
        }

        public BatchGetYikeAssetMediaInfosResponseBodyMediaInfosMediaBasicInfo setBusinessType(String businessType) {
            this.businessType = businessType;
            return this;
        }
        public String getBusinessType() {
            return this.businessType;
        }

        public BatchGetYikeAssetMediaInfosResponseBodyMediaInfosMediaBasicInfo setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public BatchGetYikeAssetMediaInfosResponseBodyMediaInfosMediaBasicInfo setCoverURL(String coverURL) {
            this.coverURL = coverURL;
            return this;
        }
        public String getCoverURL() {
            return this.coverURL;
        }

        public BatchGetYikeAssetMediaInfosResponseBodyMediaInfosMediaBasicInfo setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public BatchGetYikeAssetMediaInfosResponseBodyMediaInfosMediaBasicInfo setDeletedTime(String deletedTime) {
            this.deletedTime = deletedTime;
            return this;
        }
        public String getDeletedTime() {
            return this.deletedTime;
        }

        public BatchGetYikeAssetMediaInfosResponseBodyMediaInfosMediaBasicInfo setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public BatchGetYikeAssetMediaInfosResponseBodyMediaInfosMediaBasicInfo setInputURL(String inputURL) {
            this.inputURL = inputURL;
            return this;
        }
        public String getInputURL() {
            return this.inputURL;
        }

        public BatchGetYikeAssetMediaInfosResponseBodyMediaInfosMediaBasicInfo setMediaId(String mediaId) {
            this.mediaId = mediaId;
            return this;
        }
        public String getMediaId() {
            return this.mediaId;
        }

        public BatchGetYikeAssetMediaInfosResponseBodyMediaInfosMediaBasicInfo setMediaTags(String mediaTags) {
            this.mediaTags = mediaTags;
            return this;
        }
        public String getMediaTags() {
            return this.mediaTags;
        }

        public BatchGetYikeAssetMediaInfosResponseBodyMediaInfosMediaBasicInfo setMediaType(String mediaType) {
            this.mediaType = mediaType;
            return this;
        }
        public String getMediaType() {
            return this.mediaType;
        }

        public BatchGetYikeAssetMediaInfosResponseBodyMediaInfosMediaBasicInfo setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public BatchGetYikeAssetMediaInfosResponseBodyMediaInfosMediaBasicInfo setSnapshots(String snapshots) {
            this.snapshots = snapshots;
            return this;
        }
        public String getSnapshots() {
            return this.snapshots;
        }

        public BatchGetYikeAssetMediaInfosResponseBodyMediaInfosMediaBasicInfo setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public BatchGetYikeAssetMediaInfosResponseBodyMediaInfosMediaBasicInfo setSpriteImages(String spriteImages) {
            this.spriteImages = spriteImages;
            return this;
        }
        public String getSpriteImages() {
            return this.spriteImages;
        }

        public BatchGetYikeAssetMediaInfosResponseBodyMediaInfosMediaBasicInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public BatchGetYikeAssetMediaInfosResponseBodyMediaInfosMediaBasicInfo setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public BatchGetYikeAssetMediaInfosResponseBodyMediaInfosMediaBasicInfo setTranscodeStatus(String transcodeStatus) {
            this.transcodeStatus = transcodeStatus;
            return this;
        }
        public String getTranscodeStatus() {
            return this.transcodeStatus;
        }

        public BatchGetYikeAssetMediaInfosResponseBodyMediaInfosMediaBasicInfo setUserData(String userData) {
            this.userData = userData;
            return this;
        }
        public String getUserData() {
            return this.userData;
        }

    }

    public static class BatchGetYikeAssetMediaInfosResponseBodyMediaInfos extends TeaModel {
        @NameInMap("BizData")
        public BatchGetYikeAssetMediaInfosResponseBodyMediaInfosBizData bizData;

        /**
         * <p>FileInfos</p>
         */
        @NameInMap("FileInfoList")
        public java.util.List<BatchGetYikeAssetMediaInfosResponseBodyMediaInfosFileInfoList> fileInfoList;

        /**
         * <p>BasicInfo</p>
         */
        @NameInMap("MediaBasicInfo")
        public BatchGetYikeAssetMediaInfosResponseBodyMediaInfosMediaBasicInfo mediaBasicInfo;

        /**
         * <strong>example:</strong>
         * <p><strong><strong><strong>c48fb37407365d4f2cd8</strong></strong></strong></p>
         */
        @NameInMap("MediaId")
        public String mediaId;

        public static BatchGetYikeAssetMediaInfosResponseBodyMediaInfos build(java.util.Map<String, ?> map) throws Exception {
            BatchGetYikeAssetMediaInfosResponseBodyMediaInfos self = new BatchGetYikeAssetMediaInfosResponseBodyMediaInfos();
            return TeaModel.build(map, self);
        }

        public BatchGetYikeAssetMediaInfosResponseBodyMediaInfos setBizData(BatchGetYikeAssetMediaInfosResponseBodyMediaInfosBizData bizData) {
            this.bizData = bizData;
            return this;
        }
        public BatchGetYikeAssetMediaInfosResponseBodyMediaInfosBizData getBizData() {
            return this.bizData;
        }

        public BatchGetYikeAssetMediaInfosResponseBodyMediaInfos setFileInfoList(java.util.List<BatchGetYikeAssetMediaInfosResponseBodyMediaInfosFileInfoList> fileInfoList) {
            this.fileInfoList = fileInfoList;
            return this;
        }
        public java.util.List<BatchGetYikeAssetMediaInfosResponseBodyMediaInfosFileInfoList> getFileInfoList() {
            return this.fileInfoList;
        }

        public BatchGetYikeAssetMediaInfosResponseBodyMediaInfos setMediaBasicInfo(BatchGetYikeAssetMediaInfosResponseBodyMediaInfosMediaBasicInfo mediaBasicInfo) {
            this.mediaBasicInfo = mediaBasicInfo;
            return this;
        }
        public BatchGetYikeAssetMediaInfosResponseBodyMediaInfosMediaBasicInfo getMediaBasicInfo() {
            return this.mediaBasicInfo;
        }

        public BatchGetYikeAssetMediaInfosResponseBodyMediaInfos setMediaId(String mediaId) {
            this.mediaId = mediaId;
            return this;
        }
        public String getMediaId() {
            return this.mediaId;
        }

    }

}
