// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260707.models;

import com.aliyun.tea.*;

public class SearchMediaResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("MediaInfoList")
    public java.util.List<SearchMediaResponseBodyMediaInfoList> mediaInfoList;

    /**
     * <strong>example:</strong>
     * <p><strong><strong>63E8B7C7-4812-46AD-0FA56029AC86</strong></strong></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>F8C4F642184DBDA5D93907A70AAE****</p>
     */
    @NameInMap("ScrollToken")
    public String scrollToken;

    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public String success;

    /**
     * <strong>example:</strong>
     * <p>163</p>
     */
    @NameInMap("Total")
    public Long total;

    public static SearchMediaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SearchMediaResponseBody self = new SearchMediaResponseBody();
        return TeaModel.build(map, self);
    }

    public SearchMediaResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SearchMediaResponseBody setMediaInfoList(java.util.List<SearchMediaResponseBodyMediaInfoList> mediaInfoList) {
        this.mediaInfoList = mediaInfoList;
        return this;
    }
    public java.util.List<SearchMediaResponseBodyMediaInfoList> getMediaInfoList() {
        return this.mediaInfoList;
    }

    public SearchMediaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SearchMediaResponseBody setScrollToken(String scrollToken) {
        this.scrollToken = scrollToken;
        return this;
    }
    public String getScrollToken() {
        return this.scrollToken;
    }

    public SearchMediaResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public SearchMediaResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public static class SearchMediaResponseBodyMediaInfoListFileInfoListFileBasicInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1912.13</p>
         */
        @NameInMap("Bitrate")
        public String bitrate;

        /**
         * <strong>example:</strong>
         * <p>2026-05-01T19:48Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>60.00000</p>
         */
        @NameInMap("Duration")
        public String duration;

        /**
         * <strong>example:</strong>
         * <p>1642650802***0527050.wav</p>
         */
        @NameInMap("FileName")
        public String fileName;

        /**
         * <strong>example:</strong>
         * <p>48524</p>
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
         * <p><a href="https://test-bucket-***.oss-cn-shanghai.aliyuncs.com/sv/23d5cdd1-18180984899/23d5cdd1-1818098****.mp4">https://test-bucket-***.oss-cn-shanghai.aliyuncs.com/sv/23d5cdd1-18180984899/23d5cdd1-1818098****.mp4</a></p>
         */
        @NameInMap("FileUrl")
        public String fileUrl;

        /**
         * <strong>example:</strong>
         * <p>mov,mp4,m4a,3gp,3g2,mj2</p>
         */
        @NameInMap("FormatName")
        public String formatName;

        /**
         * <strong>example:</strong>
         * <p>480</p>
         */
        @NameInMap("Height")
        public String height;

        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("ImagesInput")
        public String imagesInput;

        /**
         * <strong>example:</strong>
         * <p>2026-05-01T19:48Z</p>
         */
        @NameInMap("ModifiedTime")
        public String modifiedTime;

        /**
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <strong>example:</strong>
         * <p>1920</p>
         */
        @NameInMap("Width")
        public String width;

        public static SearchMediaResponseBodyMediaInfoListFileInfoListFileBasicInfo build(java.util.Map<String, ?> map) throws Exception {
            SearchMediaResponseBodyMediaInfoListFileInfoListFileBasicInfo self = new SearchMediaResponseBodyMediaInfoListFileInfoListFileBasicInfo();
            return TeaModel.build(map, self);
        }

        public SearchMediaResponseBodyMediaInfoListFileInfoListFileBasicInfo setBitrate(String bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public String getBitrate() {
            return this.bitrate;
        }

        public SearchMediaResponseBodyMediaInfoListFileInfoListFileBasicInfo setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public SearchMediaResponseBodyMediaInfoListFileInfoListFileBasicInfo setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public SearchMediaResponseBodyMediaInfoListFileInfoListFileBasicInfo setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public SearchMediaResponseBodyMediaInfoListFileInfoListFileBasicInfo setFileSize(String fileSize) {
            this.fileSize = fileSize;
            return this;
        }
        public String getFileSize() {
            return this.fileSize;
        }

        public SearchMediaResponseBodyMediaInfoListFileInfoListFileBasicInfo setFileStatus(String fileStatus) {
            this.fileStatus = fileStatus;
            return this;
        }
        public String getFileStatus() {
            return this.fileStatus;
        }

        public SearchMediaResponseBodyMediaInfoListFileInfoListFileBasicInfo setFileType(String fileType) {
            this.fileType = fileType;
            return this;
        }
        public String getFileType() {
            return this.fileType;
        }

        public SearchMediaResponseBodyMediaInfoListFileInfoListFileBasicInfo setFileUrl(String fileUrl) {
            this.fileUrl = fileUrl;
            return this;
        }
        public String getFileUrl() {
            return this.fileUrl;
        }

        public SearchMediaResponseBodyMediaInfoListFileInfoListFileBasicInfo setFormatName(String formatName) {
            this.formatName = formatName;
            return this;
        }
        public String getFormatName() {
            return this.formatName;
        }

        public SearchMediaResponseBodyMediaInfoListFileInfoListFileBasicInfo setHeight(String height) {
            this.height = height;
            return this;
        }
        public String getHeight() {
            return this.height;
        }

        public SearchMediaResponseBodyMediaInfoListFileInfoListFileBasicInfo setImagesInput(String imagesInput) {
            this.imagesInput = imagesInput;
            return this;
        }
        public String getImagesInput() {
            return this.imagesInput;
        }

        public SearchMediaResponseBodyMediaInfoListFileInfoListFileBasicInfo setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public SearchMediaResponseBodyMediaInfoListFileInfoListFileBasicInfo setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public SearchMediaResponseBodyMediaInfoListFileInfoListFileBasicInfo setWidth(String width) {
            this.width = width;
            return this;
        }
        public String getWidth() {
            return this.width;
        }

    }

    public static class SearchMediaResponseBodyMediaInfoListFileInfoList extends TeaModel {
        @NameInMap("FileBasicInfo")
        public SearchMediaResponseBodyMediaInfoListFileInfoListFileBasicInfo fileBasicInfo;

        public static SearchMediaResponseBodyMediaInfoListFileInfoList build(java.util.Map<String, ?> map) throws Exception {
            SearchMediaResponseBodyMediaInfoListFileInfoList self = new SearchMediaResponseBodyMediaInfoListFileInfoList();
            return TeaModel.build(map, self);
        }

        public SearchMediaResponseBodyMediaInfoListFileInfoList setFileBasicInfo(SearchMediaResponseBodyMediaInfoListFileInfoListFileBasicInfo fileBasicInfo) {
            this.fileBasicInfo = fileBasicInfo;
            return this;
        }
        public SearchMediaResponseBodyMediaInfoListFileInfoListFileBasicInfo getFileBasicInfo() {
            return this.fileBasicInfo;
        }

    }

    public static class SearchMediaResponseBodyMediaInfoListMediaBasicInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>opening</p>
         */
        @NameInMap("BusinessType")
        public String businessType;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("CategoryId")
        public Long categoryId;

        /**
         * <strong>example:</strong>
         * <p>test-category-01</p>
         */
        @NameInMap("CategoryName")
        public String categoryName;

        /**
         * <strong>example:</strong>
         * <p><a href="https://test-bucket-***.oss-cn-shanghai.aliyuncs.com/cover/e694372e-4f5b-4821-ae09-efd064f2****_large_cover_url.jpg">https://test-bucket-***.oss-cn-shanghai.aliyuncs.com/cover/e694372e-4f5b-4821-ae09-efd064f2****_large_cover_url.jpg</a></p>
         */
        @NameInMap("CoverURL")
        public String coverURL;

        /**
         * <strong>example:</strong>
         * <p>2026-05-01T19:48Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>This is a test video.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>BaseMedia</p>
         */
        @NameInMap("EntityId")
        public String entityId;

        /**
         * <strong>example:</strong>
         * <p><a href="https://test-bucket-***.oss-cn-shanghai.aliyuncs.com/sv/23d5cdd1-18180984899/23d5cdd1-1818098****.mp4">https://test-bucket-***.oss-cn-shanghai.aliyuncs.com/sv/23d5cdd1-18180984899/23d5cdd1-1818098****.mp4</a></p>
         */
        @NameInMap("InputURL")
        public String inputURL;

        /**
         * <strong>example:</strong>
         * <p>3b187b3620c8490886cfc2a9578c****</p>
         */
        @NameInMap("MediaId")
        public String mediaId;

        /**
         * <strong>example:</strong>
         * <p>tags,tags2</p>
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
         * <p>2026-05-01T20:48Z</p>
         */
        @NameInMap("ModifiedTime")
        public String modifiedTime;

        /**
         * <strong>example:</strong>
         * <p>[{&quot;bucket&quot;:&quot;test-bucket-***&quot;,&quot;count&quot;:&quot;3&quot;,&quot;location&quot;:&quot;oss-cn-shanghai&quot;,&quot;snapshotRegular&quot;:&quot;example.jpg&quot;,&quot;templateId&quot;:&quot;<strong><strong><strong>e6a6440b29eb60bd7c</strong></strong></strong>&quot;}]</p>
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
         * <p>[{&quot;bucket&quot;:&quot;test-bucket-***&quot;,&quot;count&quot;:&quot;32&quot;,&quot;location&quot;:&quot;oss-cn-shanghai&quot;,&quot;snapshotRegular&quot;:&quot;example/example-{Count}.jpg&quot;,&quot;spriteRegular&quot;:&quot;example/example-{TileCount}.jpg&quot;,&quot;templateId&quot;:&quot;<strong><strong><strong>e438b14ff39293eaec25</strong></strong></strong>&quot;,&quot;tileCount&quot;:&quot;1&quot;}]</p>
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
         * <p>test-title</p>
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
         * <p>oss</p>
         */
        @NameInMap("UploadSource")
        public String uploadSource;

        /**
         * <strong>example:</strong>
         * <p>userData</p>
         */
        @NameInMap("UserData")
        public String userData;

        public static SearchMediaResponseBodyMediaInfoListMediaBasicInfo build(java.util.Map<String, ?> map) throws Exception {
            SearchMediaResponseBodyMediaInfoListMediaBasicInfo self = new SearchMediaResponseBodyMediaInfoListMediaBasicInfo();
            return TeaModel.build(map, self);
        }

        public SearchMediaResponseBodyMediaInfoListMediaBasicInfo setBusinessType(String businessType) {
            this.businessType = businessType;
            return this;
        }
        public String getBusinessType() {
            return this.businessType;
        }

        public SearchMediaResponseBodyMediaInfoListMediaBasicInfo setCategoryId(Long categoryId) {
            this.categoryId = categoryId;
            return this;
        }
        public Long getCategoryId() {
            return this.categoryId;
        }

        public SearchMediaResponseBodyMediaInfoListMediaBasicInfo setCategoryName(String categoryName) {
            this.categoryName = categoryName;
            return this;
        }
        public String getCategoryName() {
            return this.categoryName;
        }

        public SearchMediaResponseBodyMediaInfoListMediaBasicInfo setCoverURL(String coverURL) {
            this.coverURL = coverURL;
            return this;
        }
        public String getCoverURL() {
            return this.coverURL;
        }

        public SearchMediaResponseBodyMediaInfoListMediaBasicInfo setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public SearchMediaResponseBodyMediaInfoListMediaBasicInfo setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public SearchMediaResponseBodyMediaInfoListMediaBasicInfo setEntityId(String entityId) {
            this.entityId = entityId;
            return this;
        }
        public String getEntityId() {
            return this.entityId;
        }

        public SearchMediaResponseBodyMediaInfoListMediaBasicInfo setInputURL(String inputURL) {
            this.inputURL = inputURL;
            return this;
        }
        public String getInputURL() {
            return this.inputURL;
        }

        public SearchMediaResponseBodyMediaInfoListMediaBasicInfo setMediaId(String mediaId) {
            this.mediaId = mediaId;
            return this;
        }
        public String getMediaId() {
            return this.mediaId;
        }

        public SearchMediaResponseBodyMediaInfoListMediaBasicInfo setMediaTags(String mediaTags) {
            this.mediaTags = mediaTags;
            return this;
        }
        public String getMediaTags() {
            return this.mediaTags;
        }

        public SearchMediaResponseBodyMediaInfoListMediaBasicInfo setMediaType(String mediaType) {
            this.mediaType = mediaType;
            return this;
        }
        public String getMediaType() {
            return this.mediaType;
        }

        public SearchMediaResponseBodyMediaInfoListMediaBasicInfo setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public SearchMediaResponseBodyMediaInfoListMediaBasicInfo setSnapshots(String snapshots) {
            this.snapshots = snapshots;
            return this;
        }
        public String getSnapshots() {
            return this.snapshots;
        }

        public SearchMediaResponseBodyMediaInfoListMediaBasicInfo setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public SearchMediaResponseBodyMediaInfoListMediaBasicInfo setSpriteImages(String spriteImages) {
            this.spriteImages = spriteImages;
            return this;
        }
        public String getSpriteImages() {
            return this.spriteImages;
        }

        public SearchMediaResponseBodyMediaInfoListMediaBasicInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public SearchMediaResponseBodyMediaInfoListMediaBasicInfo setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public SearchMediaResponseBodyMediaInfoListMediaBasicInfo setTranscodeStatus(String transcodeStatus) {
            this.transcodeStatus = transcodeStatus;
            return this;
        }
        public String getTranscodeStatus() {
            return this.transcodeStatus;
        }

        public SearchMediaResponseBodyMediaInfoListMediaBasicInfo setUploadSource(String uploadSource) {
            this.uploadSource = uploadSource;
            return this;
        }
        public String getUploadSource() {
            return this.uploadSource;
        }

        public SearchMediaResponseBodyMediaInfoListMediaBasicInfo setUserData(String userData) {
            this.userData = userData;
            return this;
        }
        public String getUserData() {
            return this.userData;
        }

    }

    public static class SearchMediaResponseBodyMediaInfoListMediaDynamicInfoDynamicMetaData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>&quot;{\&quot;ThirdPartyAssetStatus\&quot;:\&quot;Success\&quot;}&quot;</p>
         */
        @NameInMap("Data")
        public String data;

        /**
         * <strong>example:</strong>
         * <p>BaseMedia</p>
         */
        @NameInMap("EntityId")
        public String entityId;

        /**
         * <strong>example:</strong>
         * <p>system</p>
         */
        @NameInMap("Type")
        public String type;

        public static SearchMediaResponseBodyMediaInfoListMediaDynamicInfoDynamicMetaData build(java.util.Map<String, ?> map) throws Exception {
            SearchMediaResponseBodyMediaInfoListMediaDynamicInfoDynamicMetaData self = new SearchMediaResponseBodyMediaInfoListMediaDynamicInfoDynamicMetaData();
            return TeaModel.build(map, self);
        }

        public SearchMediaResponseBodyMediaInfoListMediaDynamicInfoDynamicMetaData setData(String data) {
            this.data = data;
            return this;
        }
        public String getData() {
            return this.data;
        }

        public SearchMediaResponseBodyMediaInfoListMediaDynamicInfoDynamicMetaData setEntityId(String entityId) {
            this.entityId = entityId;
            return this;
        }
        public String getEntityId() {
            return this.entityId;
        }

        public SearchMediaResponseBodyMediaInfoListMediaDynamicInfoDynamicMetaData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class SearchMediaResponseBodyMediaInfoListMediaDynamicInfoMediaExtraInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p><em><strong>cd4754a89b6</strong></em>*</p>
         */
        @NameInMap("AiAuditJobId")
        public String aiAuditJobId;

        /**
         * <strong>example:</strong>
         * <p>normal</p>
         */
        @NameInMap("AiAuditLabel")
        public String aiAuditLabel;

        /**
         * <strong>example:</strong>
         * <p>Passed</p>
         */
        @NameInMap("AiAuditResult")
        public String aiAuditResult;

        /**
         * <strong>example:</strong>
         * <p>Success</p>
         */
        @NameInMap("AiAuditStatus")
        public String aiAuditStatus;

        /**
         * <strong>example:</strong>
         * <p>*<em><strong>aed4739c394b38c</strong></em></p>
         */
        @NameInMap("AiAuditTemplate")
        public String aiAuditTemplate;

        /**
         * <strong>example:</strong>
         * <p>Init</p>
         */
        @NameInMap("ManualAuditResult")
        public String manualAuditResult;

        /**
         * <strong>example:</strong>
         * <p>Init</p>
         */
        @NameInMap("ManualAuditStatus")
        public String manualAuditStatus;

        public static SearchMediaResponseBodyMediaInfoListMediaDynamicInfoMediaExtraInfo build(java.util.Map<String, ?> map) throws Exception {
            SearchMediaResponseBodyMediaInfoListMediaDynamicInfoMediaExtraInfo self = new SearchMediaResponseBodyMediaInfoListMediaDynamicInfoMediaExtraInfo();
            return TeaModel.build(map, self);
        }

        public SearchMediaResponseBodyMediaInfoListMediaDynamicInfoMediaExtraInfo setAiAuditJobId(String aiAuditJobId) {
            this.aiAuditJobId = aiAuditJobId;
            return this;
        }
        public String getAiAuditJobId() {
            return this.aiAuditJobId;
        }

        public SearchMediaResponseBodyMediaInfoListMediaDynamicInfoMediaExtraInfo setAiAuditLabel(String aiAuditLabel) {
            this.aiAuditLabel = aiAuditLabel;
            return this;
        }
        public String getAiAuditLabel() {
            return this.aiAuditLabel;
        }

        public SearchMediaResponseBodyMediaInfoListMediaDynamicInfoMediaExtraInfo setAiAuditResult(String aiAuditResult) {
            this.aiAuditResult = aiAuditResult;
            return this;
        }
        public String getAiAuditResult() {
            return this.aiAuditResult;
        }

        public SearchMediaResponseBodyMediaInfoListMediaDynamicInfoMediaExtraInfo setAiAuditStatus(String aiAuditStatus) {
            this.aiAuditStatus = aiAuditStatus;
            return this;
        }
        public String getAiAuditStatus() {
            return this.aiAuditStatus;
        }

        public SearchMediaResponseBodyMediaInfoListMediaDynamicInfoMediaExtraInfo setAiAuditTemplate(String aiAuditTemplate) {
            this.aiAuditTemplate = aiAuditTemplate;
            return this;
        }
        public String getAiAuditTemplate() {
            return this.aiAuditTemplate;
        }

        public SearchMediaResponseBodyMediaInfoListMediaDynamicInfoMediaExtraInfo setManualAuditResult(String manualAuditResult) {
            this.manualAuditResult = manualAuditResult;
            return this;
        }
        public String getManualAuditResult() {
            return this.manualAuditResult;
        }

        public SearchMediaResponseBodyMediaInfoListMediaDynamicInfoMediaExtraInfo setManualAuditStatus(String manualAuditStatus) {
            this.manualAuditStatus = manualAuditStatus;
            return this;
        }
        public String getManualAuditStatus() {
            return this.manualAuditStatus;
        }

    }

    public static class SearchMediaResponseBodyMediaInfoListMediaDynamicInfo extends TeaModel {
        @NameInMap("DynamicMetaData")
        public SearchMediaResponseBodyMediaInfoListMediaDynamicInfoDynamicMetaData dynamicMetaData;

        @NameInMap("MediaExtraInfo")
        public SearchMediaResponseBodyMediaInfoListMediaDynamicInfoMediaExtraInfo mediaExtraInfo;

        public static SearchMediaResponseBodyMediaInfoListMediaDynamicInfo build(java.util.Map<String, ?> map) throws Exception {
            SearchMediaResponseBodyMediaInfoListMediaDynamicInfo self = new SearchMediaResponseBodyMediaInfoListMediaDynamicInfo();
            return TeaModel.build(map, self);
        }

        public SearchMediaResponseBodyMediaInfoListMediaDynamicInfo setDynamicMetaData(SearchMediaResponseBodyMediaInfoListMediaDynamicInfoDynamicMetaData dynamicMetaData) {
            this.dynamicMetaData = dynamicMetaData;
            return this;
        }
        public SearchMediaResponseBodyMediaInfoListMediaDynamicInfoDynamicMetaData getDynamicMetaData() {
            return this.dynamicMetaData;
        }

        public SearchMediaResponseBodyMediaInfoListMediaDynamicInfo setMediaExtraInfo(SearchMediaResponseBodyMediaInfoListMediaDynamicInfoMediaExtraInfo mediaExtraInfo) {
            this.mediaExtraInfo = mediaExtraInfo;
            return this;
        }
        public SearchMediaResponseBodyMediaInfoListMediaDynamicInfoMediaExtraInfo getMediaExtraInfo() {
            return this.mediaExtraInfo;
        }

    }

    public static class SearchMediaResponseBodyMediaInfoList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>{\&quot;intField1\&quot;:12,\&quot;strField1\&quot;:\&quot;abc\&quot;}</p>
         */
        @NameInMap("CustomFields")
        public String customFields;

        @NameInMap("FileInfoList")
        public java.util.List<SearchMediaResponseBodyMediaInfoListFileInfoList> fileInfoList;

        @NameInMap("MediaBasicInfo")
        public SearchMediaResponseBodyMediaInfoListMediaBasicInfo mediaBasicInfo;

        @NameInMap("MediaDynamicInfo")
        public SearchMediaResponseBodyMediaInfoListMediaDynamicInfo mediaDynamicInfo;

        /**
         * <strong>example:</strong>
         * <p>3b187b3620c8490886cfc2a9578c****</p>
         */
        @NameInMap("MediaId")
        public String mediaId;

        public static SearchMediaResponseBodyMediaInfoList build(java.util.Map<String, ?> map) throws Exception {
            SearchMediaResponseBodyMediaInfoList self = new SearchMediaResponseBodyMediaInfoList();
            return TeaModel.build(map, self);
        }

        public SearchMediaResponseBodyMediaInfoList setCustomFields(String customFields) {
            this.customFields = customFields;
            return this;
        }
        public String getCustomFields() {
            return this.customFields;
        }

        public SearchMediaResponseBodyMediaInfoList setFileInfoList(java.util.List<SearchMediaResponseBodyMediaInfoListFileInfoList> fileInfoList) {
            this.fileInfoList = fileInfoList;
            return this;
        }
        public java.util.List<SearchMediaResponseBodyMediaInfoListFileInfoList> getFileInfoList() {
            return this.fileInfoList;
        }

        public SearchMediaResponseBodyMediaInfoList setMediaBasicInfo(SearchMediaResponseBodyMediaInfoListMediaBasicInfo mediaBasicInfo) {
            this.mediaBasicInfo = mediaBasicInfo;
            return this;
        }
        public SearchMediaResponseBodyMediaInfoListMediaBasicInfo getMediaBasicInfo() {
            return this.mediaBasicInfo;
        }

        public SearchMediaResponseBodyMediaInfoList setMediaDynamicInfo(SearchMediaResponseBodyMediaInfoListMediaDynamicInfo mediaDynamicInfo) {
            this.mediaDynamicInfo = mediaDynamicInfo;
            return this;
        }
        public SearchMediaResponseBodyMediaInfoListMediaDynamicInfo getMediaDynamicInfo() {
            return this.mediaDynamicInfo;
        }

        public SearchMediaResponseBodyMediaInfoList setMediaId(String mediaId) {
            this.mediaId = mediaId;
            return this;
        }
        public String getMediaId() {
            return this.mediaId;
        }

    }

}
