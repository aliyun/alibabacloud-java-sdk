// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SearchMediaResponseBody extends TeaModel {
    /**
     * <p>The information about the media assets.</p>
     */
    @NameInMap("MediaList")
    public java.util.List<SearchMediaResponseBodyMediaList> mediaList;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>3E0CEF83-FB09-4E34-BA1451814B03****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The pagination identifier.</p>
     * 
     * <strong>example:</strong>
     * <p>24e0fba7188fae707e146esa54****</p>
     */
    @NameInMap("ScrollToken")
    public String scrollToken;

    /**
     * <p>The total number of data records that meet the specified filter criteria.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Total")
    public Long total;

    public static SearchMediaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SearchMediaResponseBody self = new SearchMediaResponseBody();
        return TeaModel.build(map, self);
    }

    public SearchMediaResponseBody setMediaList(java.util.List<SearchMediaResponseBodyMediaList> mediaList) {
        this.mediaList = mediaList;
        return this;
    }
    public java.util.List<SearchMediaResponseBodyMediaList> getMediaList() {
        return this.mediaList;
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

    public SearchMediaResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public static class SearchMediaResponseBodyMediaListAiDataAiLabelInfoOccurrences extends TeaModel {
        /**
         * <p>The start time of the clip.</p>
         * 
         * <strong>example:</strong>
         * <p>1.4</p>
         */
        @NameInMap("From")
        public Double from;

        /**
         * <p>The score.</p>
         * 
         * <strong>example:</strong>
         * <p>0.75287705</p>
         */
        @NameInMap("Score")
        public Double score;

        /**
         * <p>The end time of the clip.</p>
         * 
         * <strong>example:</strong>
         * <p>2.5</p>
         */
        @NameInMap("To")
        public Double to;

        public static SearchMediaResponseBodyMediaListAiDataAiLabelInfoOccurrences build(java.util.Map<String, ?> map) throws Exception {
            SearchMediaResponseBodyMediaListAiDataAiLabelInfoOccurrences self = new SearchMediaResponseBodyMediaListAiDataAiLabelInfoOccurrences();
            return TeaModel.build(map, self);
        }

        public SearchMediaResponseBodyMediaListAiDataAiLabelInfoOccurrences setFrom(Double from) {
            this.from = from;
            return this;
        }
        public Double getFrom() {
            return this.from;
        }

        public SearchMediaResponseBodyMediaListAiDataAiLabelInfoOccurrences setScore(Double score) {
            this.score = score;
            return this;
        }
        public Double getScore() {
            return this.score;
        }

        public SearchMediaResponseBodyMediaListAiDataAiLabelInfoOccurrences setTo(Double to) {
            this.to = to;
            return this;
        }
        public Double getTo() {
            return this.to;
        }

    }

    public static class SearchMediaResponseBodyMediaListAiDataAiLabelInfo extends TeaModel {
        /**
         * <p>The category.</p>
         * 
         * <strong>example:</strong>
         * <p>Transportation</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <p>The ID of the tag.</p>
         * 
         * <strong>example:</strong>
         * <p>10310250338</p>
         */
        @NameInMap("LabelId")
        public String labelId;

        /**
         * <p>The name of the tag.</p>
         * 
         * <strong>example:</strong>
         * <p>Vehicles</p>
         */
        @NameInMap("LabelName")
        public String labelName;

        /**
         * <p>The clips.</p>
         */
        @NameInMap("Occurrences")
        public java.util.List<SearchMediaResponseBodyMediaListAiDataAiLabelInfoOccurrences> occurrences;

        public static SearchMediaResponseBodyMediaListAiDataAiLabelInfo build(java.util.Map<String, ?> map) throws Exception {
            SearchMediaResponseBodyMediaListAiDataAiLabelInfo self = new SearchMediaResponseBodyMediaListAiDataAiLabelInfo();
            return TeaModel.build(map, self);
        }

        public SearchMediaResponseBodyMediaListAiDataAiLabelInfo setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public SearchMediaResponseBodyMediaListAiDataAiLabelInfo setLabelId(String labelId) {
            this.labelId = labelId;
            return this;
        }
        public String getLabelId() {
            return this.labelId;
        }

        public SearchMediaResponseBodyMediaListAiDataAiLabelInfo setLabelName(String labelName) {
            this.labelName = labelName;
            return this;
        }
        public String getLabelName() {
            return this.labelName;
        }

        public SearchMediaResponseBodyMediaListAiDataAiLabelInfo setOccurrences(java.util.List<SearchMediaResponseBodyMediaListAiDataAiLabelInfoOccurrences> occurrences) {
            this.occurrences = occurrences;
            return this;
        }
        public java.util.List<SearchMediaResponseBodyMediaListAiDataAiLabelInfoOccurrences> getOccurrences() {
            return this.occurrences;
        }

    }

    public static class SearchMediaResponseBodyMediaListAiDataOcrInfo extends TeaModel {
        /**
         * <p>The text content.</p>
         * 
         * <strong>example:</strong>
         * <p>I\&quot;m Jane.</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>The start time of the subtitle.</p>
         * 
         * <strong>example:</strong>
         * <p>1.4</p>
         */
        @NameInMap("From")
        public Double from;

        /**
         * <p>The end time of the subtitle.</p>
         * 
         * <strong>example:</strong>
         * <p>2.5</p>
         */
        @NameInMap("To")
        public Double to;

        public static SearchMediaResponseBodyMediaListAiDataOcrInfo build(java.util.Map<String, ?> map) throws Exception {
            SearchMediaResponseBodyMediaListAiDataOcrInfo self = new SearchMediaResponseBodyMediaListAiDataOcrInfo();
            return TeaModel.build(map, self);
        }

        public SearchMediaResponseBodyMediaListAiDataOcrInfo setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public SearchMediaResponseBodyMediaListAiDataOcrInfo setFrom(Double from) {
            this.from = from;
            return this;
        }
        public Double getFrom() {
            return this.from;
        }

        public SearchMediaResponseBodyMediaListAiDataOcrInfo setTo(Double to) {
            this.to = to;
            return this;
        }
        public Double getTo() {
            return this.to;
        }

    }

    public static class SearchMediaResponseBodyMediaListAiData extends TeaModel {
        /**
         * <p>The AI tags.</p>
         */
        @NameInMap("AiLabelInfo")
        public java.util.List<SearchMediaResponseBodyMediaListAiDataAiLabelInfo> aiLabelInfo;

        /**
         * <p>The information about subtitles.</p>
         */
        @NameInMap("OcrInfo")
        public java.util.List<SearchMediaResponseBodyMediaListAiDataOcrInfo> ocrInfo;

        public static SearchMediaResponseBodyMediaListAiData build(java.util.Map<String, ?> map) throws Exception {
            SearchMediaResponseBodyMediaListAiData self = new SearchMediaResponseBodyMediaListAiData();
            return TeaModel.build(map, self);
        }

        public SearchMediaResponseBodyMediaListAiData setAiLabelInfo(java.util.List<SearchMediaResponseBodyMediaListAiDataAiLabelInfo> aiLabelInfo) {
            this.aiLabelInfo = aiLabelInfo;
            return this;
        }
        public java.util.List<SearchMediaResponseBodyMediaListAiDataAiLabelInfo> getAiLabelInfo() {
            return this.aiLabelInfo;
        }

        public SearchMediaResponseBodyMediaListAiData setOcrInfo(java.util.List<SearchMediaResponseBodyMediaListAiDataOcrInfo> ocrInfo) {
            this.ocrInfo = ocrInfo;
            return this;
        }
        public java.util.List<SearchMediaResponseBodyMediaListAiDataOcrInfo> getOcrInfo() {
            return this.ocrInfo;
        }

    }

    public static class SearchMediaResponseBodyMediaListAiRoughData extends TeaModel {
        /**
         * <p>The AI category.</p>
         * 
         * <strong>example:</strong>
         * <p>TV series</p>
         */
        @NameInMap("AiCategory")
        public String aiCategory;

        /**
         * <p>The ID of the AI task.</p>
         * 
         * <strong>example:</strong>
         * <p>cd35b0b0025f71edbfcb472190a9xxxx</p>
         */
        @NameInMap("AiJobId")
        public String aiJobId;

        /**
         * <p>The save type.</p>
         * 
         * <strong>example:</strong>
         * <p>TEXT</p>
         */
        @NameInMap("SaveType")
        public String saveType;

        /**
         * <p>The data status.</p>
         * 
         * <strong>example:</strong>
         * <p>SaveSuccess</p>
         */
        @NameInMap("Status")
        public String status;

        public static SearchMediaResponseBodyMediaListAiRoughData build(java.util.Map<String, ?> map) throws Exception {
            SearchMediaResponseBodyMediaListAiRoughData self = new SearchMediaResponseBodyMediaListAiRoughData();
            return TeaModel.build(map, self);
        }

        public SearchMediaResponseBodyMediaListAiRoughData setAiCategory(String aiCategory) {
            this.aiCategory = aiCategory;
            return this;
        }
        public String getAiCategory() {
            return this.aiCategory;
        }

        public SearchMediaResponseBodyMediaListAiRoughData setAiJobId(String aiJobId) {
            this.aiJobId = aiJobId;
            return this;
        }
        public String getAiJobId() {
            return this.aiJobId;
        }

        public SearchMediaResponseBodyMediaListAiRoughData setSaveType(String saveType) {
            this.saveType = saveType;
            return this;
        }
        public String getSaveType() {
            return this.saveType;
        }

        public SearchMediaResponseBodyMediaListAiRoughData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class SearchMediaResponseBodyMediaListAttachedMediaCategories extends TeaModel {
        /**
         * <p>The category ID of the auxiliary media asset.</p>
         * 
         * <strong>example:</strong>
         * <p>10027394</p>
         */
        @NameInMap("CateId")
        public Long cateId;

        /**
         * <p>The name of the category.</p>
         * 
         * <strong>example:</strong>
         * <p>test1</p>
         */
        @NameInMap("CateName")
        public String cateName;

        /**
         * <p>The level of the category.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Level")
        public Long level;

        /**
         * <p>The ID of the parent node.</p>
         * 
         * <strong>example:</strong>
         * <p>-1</p>
         */
        @NameInMap("ParentId")
        public Long parentId;

        public static SearchMediaResponseBodyMediaListAttachedMediaCategories build(java.util.Map<String, ?> map) throws Exception {
            SearchMediaResponseBodyMediaListAttachedMediaCategories self = new SearchMediaResponseBodyMediaListAttachedMediaCategories();
            return TeaModel.build(map, self);
        }

        public SearchMediaResponseBodyMediaListAttachedMediaCategories setCateId(Long cateId) {
            this.cateId = cateId;
            return this;
        }
        public Long getCateId() {
            return this.cateId;
        }

        public SearchMediaResponseBodyMediaListAttachedMediaCategories setCateName(String cateName) {
            this.cateName = cateName;
            return this;
        }
        public String getCateName() {
            return this.cateName;
        }

        public SearchMediaResponseBodyMediaListAttachedMediaCategories setLevel(Long level) {
            this.level = level;
            return this;
        }
        public Long getLevel() {
            return this.level;
        }

        public SearchMediaResponseBodyMediaListAttachedMediaCategories setParentId(Long parentId) {
            this.parentId = parentId;
            return this;
        }
        public Long getParentId() {
            return this.parentId;
        }

    }

    public static class SearchMediaResponseBodyMediaListAttachedMedia extends TeaModel {
        /**
         * <p>The ID of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>app-****</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>The type of the auxiliary media asset. Valid values:</p>
         * <ul>
         * <li><strong>watermark</strong></li>
         * <li><strong>subtitle</strong></li>
         * <li><strong>material</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>watermark</p>
         */
        @NameInMap("BusinessType")
        public String businessType;

        /**
         * <p>The list of category IDs.</p>
         */
        @NameInMap("Categories")
        public java.util.List<SearchMediaResponseBodyMediaListAttachedMediaCategories> categories;

        /**
         * <p>The time when the auxiliary media asset was created. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>hh:mm:ss</em>Z format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2018-07-19T03:45:25Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The description of the auxiliary media asset.</p>
         * 
         * <strong>example:</strong>
         * <p>test3</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The ID of the auxiliary media asset.</p>
         * 
         * <strong>example:</strong>
         * <p>a82a2cd7d4e147ba0ed6c1ee372****</p>
         */
        @NameInMap("MediaId")
        public String mediaId;

        /**
         * <p>The time when the auxiliary media asset was updated. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>hh:mm:ss</em>Z format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2018-07-19T03:48:25Z</p>
         */
        @NameInMap("ModificationTime")
        public String modificationTime;

        /**
         * <p>The status of the auxiliary media asset. Valid values:</p>
         * <ul>
         * <li><strong>Uploading</strong></li>
         * <li><strong>Normal</strong></li>
         * <li><strong>UploadFail</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The region in which the auxiliary media asset is stored.</p>
         * 
         * <strong>example:</strong>
         * <p>outin-bfefbb90a47c11*****7426.oss-cn-shanghai.aliyuncs.com</p>
         */
        @NameInMap("StorageLocation")
        public String storageLocation;

        /**
         * <p>The tags of the auxiliary media asset.</p>
         * 
         * <strong>example:</strong>
         * <p>test2</p>
         */
        @NameInMap("Tags")
        public String tags;

        /**
         * <p>The title of the auxiliary media asset.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Title")
        public String title;

        /**
         * <p>The URL of the auxiliary media asset.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/****.png">https://example.com/****.png</a></p>
         */
        @NameInMap("URL")
        public String URL;

        public static SearchMediaResponseBodyMediaListAttachedMedia build(java.util.Map<String, ?> map) throws Exception {
            SearchMediaResponseBodyMediaListAttachedMedia self = new SearchMediaResponseBodyMediaListAttachedMedia();
            return TeaModel.build(map, self);
        }

        public SearchMediaResponseBodyMediaListAttachedMedia setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public SearchMediaResponseBodyMediaListAttachedMedia setBusinessType(String businessType) {
            this.businessType = businessType;
            return this;
        }
        public String getBusinessType() {
            return this.businessType;
        }

        public SearchMediaResponseBodyMediaListAttachedMedia setCategories(java.util.List<SearchMediaResponseBodyMediaListAttachedMediaCategories> categories) {
            this.categories = categories;
            return this;
        }
        public java.util.List<SearchMediaResponseBodyMediaListAttachedMediaCategories> getCategories() {
            return this.categories;
        }

        public SearchMediaResponseBodyMediaListAttachedMedia setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public SearchMediaResponseBodyMediaListAttachedMedia setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public SearchMediaResponseBodyMediaListAttachedMedia setMediaId(String mediaId) {
            this.mediaId = mediaId;
            return this;
        }
        public String getMediaId() {
            return this.mediaId;
        }

        public SearchMediaResponseBodyMediaListAttachedMedia setModificationTime(String modificationTime) {
            this.modificationTime = modificationTime;
            return this;
        }
        public String getModificationTime() {
            return this.modificationTime;
        }

        public SearchMediaResponseBodyMediaListAttachedMedia setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public SearchMediaResponseBodyMediaListAttachedMedia setStorageLocation(String storageLocation) {
            this.storageLocation = storageLocation;
            return this;
        }
        public String getStorageLocation() {
            return this.storageLocation;
        }

        public SearchMediaResponseBodyMediaListAttachedMedia setTags(String tags) {
            this.tags = tags;
            return this;
        }
        public String getTags() {
            return this.tags;
        }

        public SearchMediaResponseBodyMediaListAttachedMedia setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public SearchMediaResponseBodyMediaListAttachedMedia setURL(String URL) {
            this.URL = URL;
            return this;
        }
        public String getURL() {
            return this.URL;
        }

    }

    public static class SearchMediaResponseBodyMediaListAudio extends TeaModel {
        /**
         * <p>The ID of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>app-****</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>The ID of the audio file.</p>
         * 
         * <strong>example:</strong>
         * <p>a82a2cd7d4e147bbed6c1ee372****</p>
         */
        @NameInMap("AudioId")
        public String audioId;

        /**
         * <p>The ID of the category.</p>
         * 
         * <strong>example:</strong>
         * <p>10000123</p>
         */
        @NameInMap("CateId")
        public Long cateId;

        /**
         * <p>The name of the category.</p>
         * 
         * <strong>example:</strong>
         * <p>ceshi</p>
         */
        @NameInMap("CateName")
        public String cateName;

        /**
         * <p>The URL of the thumbnail.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://example.com/image04.jpg">http://example.com/image04.jpg</a></p>
         */
        @NameInMap("CoverURL")
        public String coverURL;

        /**
         * <p>The time when the audio stream was created. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>hh:mm:ss</em>Z format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2018-07-19T03:45:25Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The description of the audio file.</p>
         * 
         * <strong>example:</strong>
         * <p>audio description</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The download switch. The audio file can be downloaded offline only when the download switch is turned on. Valid values:</p>
         * <ul>
         * <li><strong>on</strong></li>
         * <li><strong>off</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("DownloadSwitch")
        public String downloadSwitch;

        /**
         * <p>The duration of the audio file.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("Duration")
        public Float duration;

        /**
         * <p>The source of the audio file. Valid values:</p>
         * <ul>
         * <li><strong>general</strong>: The audio file is uploaded by using ApsaraVideo VOD.</li>
         * <li><strong>short_video</strong>: The audio file is uploaded to ApsaraVideo VOD by using the short video SDK. For more information, see <a href="https://help.aliyun.com/document_detail/53407.html">Introduction</a>.</li>
         * <li><strong>editing</strong>: The audio file is uploaded to ApsaraVideo VOD after online editing and production. For more information, see <a href="https://help.aliyun.com/document_detail/68536.html">ProduceEditingProjectVideo</a>.</li>
         * <li><strong>live</strong>: The audio file is recorded and uploaded as a file to ApsaraVideo VOD.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>general</p>
         */
        @NameInMap("MediaSource")
        public String mediaSource;

        /**
         * <p>The time when the audio file was updated. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>hh:mm:ss</em>Z format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2018-07-19T03:48:25Z</p>
         */
        @NameInMap("ModificationTime")
        public String modificationTime;

        /**
         * <p>The preprocessing status. Only preprocessed videos can be used for live streaming in the production studio. Valid values:</p>
         * <ul>
         * <li><strong>UnPreprocess</strong></li>
         * <li><strong>Preprocessing</strong></li>
         * <li><strong>PreprocessSucceed</strong></li>
         * <li><strong>PreprocessFailed</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>UnPreprocess</p>
         */
        @NameInMap("PreprocessStatus")
        public String preprocessStatus;

        /**
         * <p>The period of time in which the audio file remains in the restored state.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-03-30T10:14:14Z</p>
         */
        @NameInMap("RestoreExpiration")
        public String restoreExpiration;

        /**
         * <p>The restoration status of the audio file. Valid values:</p>
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
         * <p>The size of the audio file.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("Size")
        public Long size;

        /**
         * <p>The automatic snapshots.</p>
         */
        @NameInMap("Snapshots")
        public java.util.List<String> snapshots;

        /**
         * <p>The sprite snapshots.</p>
         */
        @NameInMap("SpriteSnapshots")
        public java.util.List<String> spriteSnapshots;

        /**
         * <p>The status of the audio file. Valid values:</p>
         * <ul>
         * <li><strong>Uploading</strong></li>
         * <li><strong>Normal</strong></li>
         * <li><strong>UploadFail</strong></li>
         * <li><strong>Deleted</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The storage class of the audio file. Valid values:</p>
         * <ul>
         * <li><strong>Standard</strong>: All media resources are stored as Standard objects.</li>
         * <li><strong>IA</strong>: All media resources are stored as IA objects.</li>
         * <li><strong>Archive</strong>: All media resources are stored as Archive objects.</li>
         * <li><strong>ColdArchive</strong>: All media resources are stored as Cold Archive objects.</li>
         * <li><strong>SourceIA</strong>: Only the source file is stored as an IA object.</li>
         * <li><strong>SourceArchive</strong>: Only the source file is stored as an Archive object.</li>
         * <li><strong>SourceColdArchive</strong>: Only the source file is stored as a Cold Archive object.</li>
         * <li><strong>Changing</strong>: The storage class is being modified.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Standard</p>
         */
        @NameInMap("StorageClass")
        public String storageClass;

        /**
         * <p>The region in which the audio is stored.</p>
         * 
         * <strong>example:</strong>
         * <p>outin-aaa*****aa.oss-cn-shanghai.aliyuncs.com</p>
         */
        @NameInMap("StorageLocation")
        public String storageLocation;

        /**
         * <p>The tags of the audio file.</p>
         * 
         * <strong>example:</strong>
         * <p>tag1,tag2</p>
         */
        @NameInMap("Tags")
        public String tags;

        /**
         * <p>The title of the audio file</p>
         * 
         * <strong>example:</strong>
         * <p>audio</p>
         */
        @NameInMap("Title")
        public String title;

        /**
         * <p>The transcoding mode. Valid values:</p>
         * <ul>
         * <li><strong>FastTranscode</strong>: The audio file is immediately transcoded after it is uploaded. You cannot play the file before it is transcoded.</li>
         * <li><strong>NoTranscode</strong>: The audio file can be played without being transcoded. You can immediately play the file after it is uploaded.</li>
         * <li><strong>AsyncTranscode</strong>: The audio file can be immediately played and asynchronously transcoded after it is uploaded.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>FastTranscode</p>
         */
        @NameInMap("TranscodeMode")
        public String transcodeMode;

        public static SearchMediaResponseBodyMediaListAudio build(java.util.Map<String, ?> map) throws Exception {
            SearchMediaResponseBodyMediaListAudio self = new SearchMediaResponseBodyMediaListAudio();
            return TeaModel.build(map, self);
        }

        public SearchMediaResponseBodyMediaListAudio setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public SearchMediaResponseBodyMediaListAudio setAudioId(String audioId) {
            this.audioId = audioId;
            return this;
        }
        public String getAudioId() {
            return this.audioId;
        }

        public SearchMediaResponseBodyMediaListAudio setCateId(Long cateId) {
            this.cateId = cateId;
            return this;
        }
        public Long getCateId() {
            return this.cateId;
        }

        public SearchMediaResponseBodyMediaListAudio setCateName(String cateName) {
            this.cateName = cateName;
            return this;
        }
        public String getCateName() {
            return this.cateName;
        }

        public SearchMediaResponseBodyMediaListAudio setCoverURL(String coverURL) {
            this.coverURL = coverURL;
            return this;
        }
        public String getCoverURL() {
            return this.coverURL;
        }

        public SearchMediaResponseBodyMediaListAudio setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public SearchMediaResponseBodyMediaListAudio setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public SearchMediaResponseBodyMediaListAudio setDownloadSwitch(String downloadSwitch) {
            this.downloadSwitch = downloadSwitch;
            return this;
        }
        public String getDownloadSwitch() {
            return this.downloadSwitch;
        }

        public SearchMediaResponseBodyMediaListAudio setDuration(Float duration) {
            this.duration = duration;
            return this;
        }
        public Float getDuration() {
            return this.duration;
        }

        public SearchMediaResponseBodyMediaListAudio setMediaSource(String mediaSource) {
            this.mediaSource = mediaSource;
            return this;
        }
        public String getMediaSource() {
            return this.mediaSource;
        }

        public SearchMediaResponseBodyMediaListAudio setModificationTime(String modificationTime) {
            this.modificationTime = modificationTime;
            return this;
        }
        public String getModificationTime() {
            return this.modificationTime;
        }

        public SearchMediaResponseBodyMediaListAudio setPreprocessStatus(String preprocessStatus) {
            this.preprocessStatus = preprocessStatus;
            return this;
        }
        public String getPreprocessStatus() {
            return this.preprocessStatus;
        }

        public SearchMediaResponseBodyMediaListAudio setRestoreExpiration(String restoreExpiration) {
            this.restoreExpiration = restoreExpiration;
            return this;
        }
        public String getRestoreExpiration() {
            return this.restoreExpiration;
        }

        public SearchMediaResponseBodyMediaListAudio setRestoreStatus(String restoreStatus) {
            this.restoreStatus = restoreStatus;
            return this;
        }
        public String getRestoreStatus() {
            return this.restoreStatus;
        }

        public SearchMediaResponseBodyMediaListAudio setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

        public SearchMediaResponseBodyMediaListAudio setSnapshots(java.util.List<String> snapshots) {
            this.snapshots = snapshots;
            return this;
        }
        public java.util.List<String> getSnapshots() {
            return this.snapshots;
        }

        public SearchMediaResponseBodyMediaListAudio setSpriteSnapshots(java.util.List<String> spriteSnapshots) {
            this.spriteSnapshots = spriteSnapshots;
            return this;
        }
        public java.util.List<String> getSpriteSnapshots() {
            return this.spriteSnapshots;
        }

        public SearchMediaResponseBodyMediaListAudio setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public SearchMediaResponseBodyMediaListAudio setStorageClass(String storageClass) {
            this.storageClass = storageClass;
            return this;
        }
        public String getStorageClass() {
            return this.storageClass;
        }

        public SearchMediaResponseBodyMediaListAudio setStorageLocation(String storageLocation) {
            this.storageLocation = storageLocation;
            return this;
        }
        public String getStorageLocation() {
            return this.storageLocation;
        }

        public SearchMediaResponseBodyMediaListAudio setTags(String tags) {
            this.tags = tags;
            return this;
        }
        public String getTags() {
            return this.tags;
        }

        public SearchMediaResponseBodyMediaListAudio setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public SearchMediaResponseBodyMediaListAudio setTranscodeMode(String transcodeMode) {
            this.transcodeMode = transcodeMode;
            return this;
        }
        public String getTranscodeMode() {
            return this.transcodeMode;
        }

    }

    public static class SearchMediaResponseBodyMediaListImage extends TeaModel {
        /**
         * <p>The ID of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>app-****</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>The ID of the category.</p>
         * 
         * <strong>example:</strong>
         * <p>1000123</p>
         */
        @NameInMap("CateId")
        public Long cateId;

        /**
         * <p>The name of the category.</p>
         * 
         * <strong>example:</strong>
         * <p>beauty</p>
         */
        @NameInMap("CateName")
        public String cateName;

        /**
         * <p>The time when the image was created. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>hh:mm:ss</em>Z format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2018-07-19T03:45:25Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The description of the image file.</p>
         * 
         * <strong>example:</strong>
         * <p>image test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The ID of the image file.</p>
         * 
         * <strong>example:</strong>
         * <p>11130843741se99wqmoes****</p>
         */
        @NameInMap("ImageId")
        public String imageId;

        /**
         * <p>The time when the image file was updated. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>hh:mm:ss</em>Z format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2018-07-19T03:48:25Z</p>
         */
        @NameInMap("ModificationTime")
        public String modificationTime;

        /**
         * <p>The status of the image file.</p>
         * <ul>
         * <li><strong>Uploading</strong></li>
         * <li><strong>Normal</strong></li>
         * <li><strong>UploadFail</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Uploading</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The region in which the image is stored.</p>
         * 
         * <strong>example:</strong>
         * <p>outin-bfefbb90a47c******163e1c7426.oss-cn-shanghai.aliyuncs.com</p>
         */
        @NameInMap("StorageLocation")
        public String storageLocation;

        /**
         * <p>The tags of the image file.</p>
         * 
         * <strong>example:</strong>
         * <p>tag1</p>
         */
        @NameInMap("Tags")
        public String tags;

        /**
         * <p>The title of the image file.</p>
         * 
         * <strong>example:</strong>
         * <p>image1</p>
         */
        @NameInMap("Title")
        public String title;

        /**
         * <p>The URL of the image file.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/****.png">https://example.com/****.png</a></p>
         */
        @NameInMap("URL")
        public String URL;

        public static SearchMediaResponseBodyMediaListImage build(java.util.Map<String, ?> map) throws Exception {
            SearchMediaResponseBodyMediaListImage self = new SearchMediaResponseBodyMediaListImage();
            return TeaModel.build(map, self);
        }

        public SearchMediaResponseBodyMediaListImage setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public SearchMediaResponseBodyMediaListImage setCateId(Long cateId) {
            this.cateId = cateId;
            return this;
        }
        public Long getCateId() {
            return this.cateId;
        }

        public SearchMediaResponseBodyMediaListImage setCateName(String cateName) {
            this.cateName = cateName;
            return this;
        }
        public String getCateName() {
            return this.cateName;
        }

        public SearchMediaResponseBodyMediaListImage setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public SearchMediaResponseBodyMediaListImage setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public SearchMediaResponseBodyMediaListImage setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public SearchMediaResponseBodyMediaListImage setModificationTime(String modificationTime) {
            this.modificationTime = modificationTime;
            return this;
        }
        public String getModificationTime() {
            return this.modificationTime;
        }

        public SearchMediaResponseBodyMediaListImage setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public SearchMediaResponseBodyMediaListImage setStorageLocation(String storageLocation) {
            this.storageLocation = storageLocation;
            return this;
        }
        public String getStorageLocation() {
            return this.storageLocation;
        }

        public SearchMediaResponseBodyMediaListImage setTags(String tags) {
            this.tags = tags;
            return this;
        }
        public String getTags() {
            return this.tags;
        }

        public SearchMediaResponseBodyMediaListImage setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public SearchMediaResponseBodyMediaListImage setURL(String URL) {
            this.URL = URL;
            return this;
        }
        public String getURL() {
            return this.URL;
        }

    }

    public static class SearchMediaResponseBodyMediaListVideo extends TeaModel {
        /**
         * <p>The ID of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>app-****</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>The ID of the category.</p>
         * 
         * <strong>example:</strong>
         * <p>10000123</p>
         */
        @NameInMap("CateId")
        public Long cateId;

        /**
         * <p>The name of the category.</p>
         * 
         * <strong>example:</strong>
         * <p>video1</p>
         */
        @NameInMap("CateName")
        public String cateName;

        /**
         * <p>The URL of the thumbnail.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.aliyundoc.com/image01.png">https://example.aliyundoc.com/image01.png</a></p>
         */
        @NameInMap("CoverURL")
        public String coverURL;

        /**
         * <p>The time when the video file was created. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>hh:mm:ss</em>Z format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2018-07-19T03:45:25Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The description of the video file.</p>
         * 
         * <strong>example:</strong>
         * <p>Video test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The download switch. The video file can be downloaded offline only when the download switch is turned on. Valid values:</p>
         * <ul>
         * <li><strong>on</strong></li>
         * <li><strong>off</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("DownloadSwitch")
        public String downloadSwitch;

        /**
         * <p>The duration of the video file. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("Duration")
        public Float duration;

        /**
         * <p>The source of the video file. Valid values:</p>
         * <ul>
         * <li><strong>general</strong>: The video file is uploaded by using ApsaraVideo VOD.</li>
         * <li><strong>short_video</strong>: The video file is uploaded by using the short video SDK.</li>
         * <li><strong>editing</strong>: The video file is produced after online editing.</li>
         * <li><strong>live</strong>: The video stream is recorded and uploaded as a file.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>general</p>
         */
        @NameInMap("MediaSource")
        public String mediaSource;

        /**
         * <p>The time when the video file was updated. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>hh:mm:ss</em>Z format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2018-07-19T03:48:25Z</p>
         */
        @NameInMap("ModificationTime")
        public String modificationTime;

        /**
         * <p>The preprocessing status. Valid values:</p>
         * <ul>
         * <li><strong>UnPreprocess</strong></li>
         * <li><strong>Preprocessing</strong></li>
         * <li><strong>PreprocessSucceed</strong></li>
         * <li><strong>PreprocessFailed</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Preprocessing</p>
         */
        @NameInMap("PreprocessStatus")
        public String preprocessStatus;

        /**
         * <p>The period of time in which the video file remains in the restored state.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-03-30T10:14:14Z</p>
         */
        @NameInMap("RestoreExpiration")
        public String restoreExpiration;

        /**
         * <p>The restoration status of the video file. Valid values:</p>
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
         * <p>The size of the video file.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("Size")
        public Long size;

        /**
         * <p>The automatic snapshots.</p>
         */
        @NameInMap("Snapshots")
        public java.util.List<String> snapshots;

        /**
         * <p>The sprite snapshots.</p>
         */
        @NameInMap("SpriteSnapshots")
        public java.util.List<String> spriteSnapshots;

        /**
         * <p>The status of the file. Valid values:</p>
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
         * <p>UploadSucc</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The storage class of the video file. Valid values:</p>
         * <ul>
         * <li><strong>Standard</strong>: All media resources are stored as Standard objects.</li>
         * <li><strong>IA</strong>: All media resources are stored as IA objects.</li>
         * <li><strong>Archive</strong>: All media resources are stored as Archive objects.</li>
         * <li><strong>ColdArchive</strong>: All media resources are stored as Cold Archive objects.</li>
         * <li><strong>SourceIA</strong>: Only the source file is stored as an IA object.</li>
         * <li><strong>SourceArchive</strong>: Only the source file is stored as an Archive object.</li>
         * <li><strong>SourceColdArchive</strong>: Only the source file is stored as a Cold Archive object.</li>
         * <li><strong>Changing</strong>: The storage class of the video file is being changed.</li>
         * <li><strong>SourceChanging</strong>: The storage class of the source file is being changed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Standard</p>
         */
        @NameInMap("StorageClass")
        public String storageClass;

        /**
         * <p>The region in which the video is stored.</p>
         * 
         * <strong>example:</strong>
         * <p>outin-bfefbb90a47c******163e1c7426.oss-cn-shanghai.aliyuncs.com</p>
         */
        @NameInMap("StorageLocation")
        public String storageLocation;

        /**
         * <p>The tags of the video file.</p>
         * 
         * <strong>example:</strong>
         * <p>tag1</p>
         */
        @NameInMap("Tags")
        public String tags;

        /**
         * <p>The title of the video.</p>
         * 
         * <strong>example:</strong>
         * <p>ceshi</p>
         */
        @NameInMap("Title")
        public String title;

        /**
         * <p>The transcoding mode. Valid values:</p>
         * <ul>
         * <li><strong>FastTranscode</strong>: The video file is immediately transcoded after it is uploaded. You cannot play the file before it is transcoded.</li>
         * <li><strong>NoTranscode</strong>: The video file can be played without being transcoded. You can immediately play the file after it is uploaded.</li>
         * <li><strong>AsyncTranscode</strong>: The video file can be immediately played and asynchronously transcoded after it is uploaded.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>FastTranscode</p>
         */
        @NameInMap("TranscodeMode")
        public String transcodeMode;

        /**
         * <p>The ID of the video file.</p>
         * 
         * <strong>example:</strong>
         * <p>a82a2asdasqadaf3faa0ed6c1ee372****</p>
         */
        @NameInMap("VideoId")
        public String videoId;

        public static SearchMediaResponseBodyMediaListVideo build(java.util.Map<String, ?> map) throws Exception {
            SearchMediaResponseBodyMediaListVideo self = new SearchMediaResponseBodyMediaListVideo();
            return TeaModel.build(map, self);
        }

        public SearchMediaResponseBodyMediaListVideo setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public SearchMediaResponseBodyMediaListVideo setCateId(Long cateId) {
            this.cateId = cateId;
            return this;
        }
        public Long getCateId() {
            return this.cateId;
        }

        public SearchMediaResponseBodyMediaListVideo setCateName(String cateName) {
            this.cateName = cateName;
            return this;
        }
        public String getCateName() {
            return this.cateName;
        }

        public SearchMediaResponseBodyMediaListVideo setCoverURL(String coverURL) {
            this.coverURL = coverURL;
            return this;
        }
        public String getCoverURL() {
            return this.coverURL;
        }

        public SearchMediaResponseBodyMediaListVideo setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public SearchMediaResponseBodyMediaListVideo setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public SearchMediaResponseBodyMediaListVideo setDownloadSwitch(String downloadSwitch) {
            this.downloadSwitch = downloadSwitch;
            return this;
        }
        public String getDownloadSwitch() {
            return this.downloadSwitch;
        }

        public SearchMediaResponseBodyMediaListVideo setDuration(Float duration) {
            this.duration = duration;
            return this;
        }
        public Float getDuration() {
            return this.duration;
        }

        public SearchMediaResponseBodyMediaListVideo setMediaSource(String mediaSource) {
            this.mediaSource = mediaSource;
            return this;
        }
        public String getMediaSource() {
            return this.mediaSource;
        }

        public SearchMediaResponseBodyMediaListVideo setModificationTime(String modificationTime) {
            this.modificationTime = modificationTime;
            return this;
        }
        public String getModificationTime() {
            return this.modificationTime;
        }

        public SearchMediaResponseBodyMediaListVideo setPreprocessStatus(String preprocessStatus) {
            this.preprocessStatus = preprocessStatus;
            return this;
        }
        public String getPreprocessStatus() {
            return this.preprocessStatus;
        }

        public SearchMediaResponseBodyMediaListVideo setRestoreExpiration(String restoreExpiration) {
            this.restoreExpiration = restoreExpiration;
            return this;
        }
        public String getRestoreExpiration() {
            return this.restoreExpiration;
        }

        public SearchMediaResponseBodyMediaListVideo setRestoreStatus(String restoreStatus) {
            this.restoreStatus = restoreStatus;
            return this;
        }
        public String getRestoreStatus() {
            return this.restoreStatus;
        }

        public SearchMediaResponseBodyMediaListVideo setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

        public SearchMediaResponseBodyMediaListVideo setSnapshots(java.util.List<String> snapshots) {
            this.snapshots = snapshots;
            return this;
        }
        public java.util.List<String> getSnapshots() {
            return this.snapshots;
        }

        public SearchMediaResponseBodyMediaListVideo setSpriteSnapshots(java.util.List<String> spriteSnapshots) {
            this.spriteSnapshots = spriteSnapshots;
            return this;
        }
        public java.util.List<String> getSpriteSnapshots() {
            return this.spriteSnapshots;
        }

        public SearchMediaResponseBodyMediaListVideo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public SearchMediaResponseBodyMediaListVideo setStorageClass(String storageClass) {
            this.storageClass = storageClass;
            return this;
        }
        public String getStorageClass() {
            return this.storageClass;
        }

        public SearchMediaResponseBodyMediaListVideo setStorageLocation(String storageLocation) {
            this.storageLocation = storageLocation;
            return this;
        }
        public String getStorageLocation() {
            return this.storageLocation;
        }

        public SearchMediaResponseBodyMediaListVideo setTags(String tags) {
            this.tags = tags;
            return this;
        }
        public String getTags() {
            return this.tags;
        }

        public SearchMediaResponseBodyMediaListVideo setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public SearchMediaResponseBodyMediaListVideo setTranscodeMode(String transcodeMode) {
            this.transcodeMode = transcodeMode;
            return this;
        }
        public String getTranscodeMode() {
            return this.transcodeMode;
        }

        public SearchMediaResponseBodyMediaListVideo setVideoId(String videoId) {
            this.videoId = videoId;
            return this;
        }
        public String getVideoId() {
            return this.videoId;
        }

    }

    public static class SearchMediaResponseBodyMediaList extends TeaModel {
        /**
         * <p>Details about AI data.</p>
         */
        @NameInMap("AiData")
        public SearchMediaResponseBodyMediaListAiData aiData;

        /**
         * <p>The basic information about AI data.</p>
         */
        @NameInMap("AiRoughData")
        public SearchMediaResponseBodyMediaListAiRoughData aiRoughData;

        /**
         * <p><a href="https://help.aliyun.com/document_detail/86991.html">The information about the auxiliary media asset</a>.</p>
         */
        @NameInMap("AttachedMedia")
        public SearchMediaResponseBodyMediaListAttachedMedia attachedMedia;

        /**
         * <p><a href="https://help.aliyun.com/document_detail/86991.html">The information about the audio</a>.</p>
         */
        @NameInMap("Audio")
        public SearchMediaResponseBodyMediaListAudio audio;

        /**
         * <p>The time when the media asset was created. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>hh:mm:ss</em>Z format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2018-07-19T03:45:25Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p><a href="https://help.aliyun.com/document_detail/86991.html">The information about the image</a>.</p>
         */
        @NameInMap("Image")
        public SearchMediaResponseBodyMediaListImage image;

        /**
         * <p>The ID of the file.</p>
         * 
         * <strong>example:</strong>
         * <p>a82a2cd7d4e147bbed6c1ee372****</p>
         */
        @NameInMap("MediaId")
        public String mediaId;

        /**
         * <p>The type of the media asset. Valid values:</p>
         * <ul>
         * <li><strong>video</strong></li>
         * <li><strong>audio</strong></li>
         * <li><strong>image</strong></li>
         * <li><strong>attached</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>video</p>
         */
        @NameInMap("MediaType")
        public String mediaType;

        /**
         * <p><a href="https://help.aliyun.com/document_detail/86991.html">The information about the video</a>.</p>
         */
        @NameInMap("Video")
        public SearchMediaResponseBodyMediaListVideo video;

        public static SearchMediaResponseBodyMediaList build(java.util.Map<String, ?> map) throws Exception {
            SearchMediaResponseBodyMediaList self = new SearchMediaResponseBodyMediaList();
            return TeaModel.build(map, self);
        }

        public SearchMediaResponseBodyMediaList setAiData(SearchMediaResponseBodyMediaListAiData aiData) {
            this.aiData = aiData;
            return this;
        }
        public SearchMediaResponseBodyMediaListAiData getAiData() {
            return this.aiData;
        }

        public SearchMediaResponseBodyMediaList setAiRoughData(SearchMediaResponseBodyMediaListAiRoughData aiRoughData) {
            this.aiRoughData = aiRoughData;
            return this;
        }
        public SearchMediaResponseBodyMediaListAiRoughData getAiRoughData() {
            return this.aiRoughData;
        }

        public SearchMediaResponseBodyMediaList setAttachedMedia(SearchMediaResponseBodyMediaListAttachedMedia attachedMedia) {
            this.attachedMedia = attachedMedia;
            return this;
        }
        public SearchMediaResponseBodyMediaListAttachedMedia getAttachedMedia() {
            return this.attachedMedia;
        }

        public SearchMediaResponseBodyMediaList setAudio(SearchMediaResponseBodyMediaListAudio audio) {
            this.audio = audio;
            return this;
        }
        public SearchMediaResponseBodyMediaListAudio getAudio() {
            return this.audio;
        }

        public SearchMediaResponseBodyMediaList setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public SearchMediaResponseBodyMediaList setImage(SearchMediaResponseBodyMediaListImage image) {
            this.image = image;
            return this;
        }
        public SearchMediaResponseBodyMediaListImage getImage() {
            return this.image;
        }

        public SearchMediaResponseBodyMediaList setMediaId(String mediaId) {
            this.mediaId = mediaId;
            return this;
        }
        public String getMediaId() {
            return this.mediaId;
        }

        public SearchMediaResponseBodyMediaList setMediaType(String mediaType) {
            this.mediaType = mediaType;
            return this;
        }
        public String getMediaType() {
            return this.mediaType;
        }

        public SearchMediaResponseBodyMediaList setVideo(SearchMediaResponseBodyMediaListVideo video) {
            this.video = video;
            return this;
        }
        public SearchMediaResponseBodyMediaListVideo getVideo() {
            return this.video;
        }

    }

}
