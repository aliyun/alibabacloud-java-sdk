// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class PreviewOutputFileResponseBody extends TeaModel {
    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The text content. This parameter is used for the CONTENT type.</p>
     * 
     * <strong>example:</strong>
     * <h1>Quarterly Review</h1>
     */
    @NameInMap("content")
    public String content;

    /**
     * <p>Indicates whether the preview is degraded to a download. A value of true indicates that the preview is degraded to a download and cannot be opened in an online previewer.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("degraded")
    public Boolean degraded;

    /**
     * <p>The expiration time of the download ticket.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-11-16T14:00:00+00:00</p>
     */
    @NameInMap("downloadExpiresAt")
    public String downloadExpiresAt;

    /**
     * <p>The short-term signed download URL for the output. You can send a GET request to this URL before it expires.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://example.com/download/file">https://example.com/download/file</a></p>
     */
    @NameInMap("downloadUrl")
    public String downloadUrl;

    /**
     * <p>The file name extension. This parameter is used for the OSS_IMM type.</p>
     * 
     * <strong>example:</strong>
     * <p>pptx</p>
     */
    @NameInMap("fileExt")
    public String fileExt;

    /**
     * <p>The modification time in ISO8601 format.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-11-16T13:00:00+00:00</p>
     */
    @NameInMap("gmtModified")
    public String gmtModified;

    /**
     * <p>The output name.</p>
     * 
     * <strong>example:</strong>
     * <p>Quarterly_Review.pptx</p>
     */
    @NameInMap("itemName")
    public String itemName;

    /**
     * <p>The output item type. Valid values: ppt, html, document, picture, slides, video, audio, email, and others.</p>
     * 
     * <strong>example:</strong>
     * <p>ppt</p>
     */
    @NameInMap("itemType")
    public String itemType;

    /**
     * <p>The message.</p>
     * 
     * <strong>example:</strong>
     * <p>Invalid request parameters</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The output item ID.</p>
     * 
     * <strong>example:</strong>
     * <p>exampleOutputItemId</p>
     */
    @NameInMap("outputItemId")
    public String outputItemId;

    /**
     * <p>The expiration time of the preview ticket.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-11-16T14:00:00+00:00</p>
     */
    @NameInMap("previewExpiresAt")
    public String previewExpiresAt;

    /**
     * <p>The preview type. Valid values: OSS_IMM, IMAGE, AUDIO, VIDEO, HTML, DING_TALK, VOICE_MEETING, and CONTENT.</p>
     * 
     * <strong>example:</strong>
     * <p>OSS_IMM</p>
     */
    @NameInMap("previewType")
    public String previewType;

    /**
     * <p>The preview URL. This parameter is used for OSS_IMM, DING_TALK, and VOICE_MEETING.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://example.com/preview/document">https://example.com/preview/document</a></p>
     */
    @NameInMap("previewUrl")
    public String previewUrl;

    /**
     * <p>The read state. Valid values: AVAILABLE, PRUNED, PENDING, and UNVERSIONED.</p>
     * 
     * <strong>example:</strong>
     * <p>AVAILABLE</p>
     */
    @NameInMap("readState")
    public String readState;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The list of slides for the slide deck output.</p>
     * 
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("slides")
    public java.util.List<PreviewOutputFileResponseBodySlides> slides;

    /**
     * <p>The reason why the content is unavailable.</p>
     * 
     * <strong>example:</strong>
     * <p>The output content is still being generated</p>
     */
    @NameInMap("unavailableReason")
    public String unavailableReason;

    /**
     * <p>The optimistic version number.</p>
     */
    @NameInMap("version")
    public PreviewOutputFileResponseBodyVersion version;

    public static PreviewOutputFileResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PreviewOutputFileResponseBody self = new PreviewOutputFileResponseBody();
        return TeaModel.build(map, self);
    }

    public PreviewOutputFileResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public PreviewOutputFileResponseBody setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public PreviewOutputFileResponseBody setDegraded(Boolean degraded) {
        this.degraded = degraded;
        return this;
    }
    public Boolean getDegraded() {
        return this.degraded;
    }

    public PreviewOutputFileResponseBody setDownloadExpiresAt(String downloadExpiresAt) {
        this.downloadExpiresAt = downloadExpiresAt;
        return this;
    }
    public String getDownloadExpiresAt() {
        return this.downloadExpiresAt;
    }

    public PreviewOutputFileResponseBody setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
        return this;
    }
    public String getDownloadUrl() {
        return this.downloadUrl;
    }

    public PreviewOutputFileResponseBody setFileExt(String fileExt) {
        this.fileExt = fileExt;
        return this;
    }
    public String getFileExt() {
        return this.fileExt;
    }

    public PreviewOutputFileResponseBody setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public PreviewOutputFileResponseBody setItemName(String itemName) {
        this.itemName = itemName;
        return this;
    }
    public String getItemName() {
        return this.itemName;
    }

    public PreviewOutputFileResponseBody setItemType(String itemType) {
        this.itemType = itemType;
        return this;
    }
    public String getItemType() {
        return this.itemType;
    }

    public PreviewOutputFileResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public PreviewOutputFileResponseBody setOutputItemId(String outputItemId) {
        this.outputItemId = outputItemId;
        return this;
    }
    public String getOutputItemId() {
        return this.outputItemId;
    }

    public PreviewOutputFileResponseBody setPreviewExpiresAt(String previewExpiresAt) {
        this.previewExpiresAt = previewExpiresAt;
        return this;
    }
    public String getPreviewExpiresAt() {
        return this.previewExpiresAt;
    }

    public PreviewOutputFileResponseBody setPreviewType(String previewType) {
        this.previewType = previewType;
        return this;
    }
    public String getPreviewType() {
        return this.previewType;
    }

    public PreviewOutputFileResponseBody setPreviewUrl(String previewUrl) {
        this.previewUrl = previewUrl;
        return this;
    }
    public String getPreviewUrl() {
        return this.previewUrl;
    }

    public PreviewOutputFileResponseBody setReadState(String readState) {
        this.readState = readState;
        return this;
    }
    public String getReadState() {
        return this.readState;
    }

    public PreviewOutputFileResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PreviewOutputFileResponseBody setSlides(java.util.List<PreviewOutputFileResponseBodySlides> slides) {
        this.slides = slides;
        return this;
    }
    public java.util.List<PreviewOutputFileResponseBodySlides> getSlides() {
        return this.slides;
    }

    public PreviewOutputFileResponseBody setUnavailableReason(String unavailableReason) {
        this.unavailableReason = unavailableReason;
        return this;
    }
    public String getUnavailableReason() {
        return this.unavailableReason;
    }

    public PreviewOutputFileResponseBody setVersion(PreviewOutputFileResponseBodyVersion version) {
        this.version = version;
        return this;
    }
    public PreviewOutputFileResponseBodyVersion getVersion() {
        return this.version;
    }

    public static class PreviewOutputFileResponseBodySlides extends TeaModel {
        /**
         * <p>The display text of the slide.</p>
         * 
         * <strong>example:</strong>
         * <p>Market Overview</p>
         */
        @NameInMap("displayText")
        public String displayText;

        /**
         * <p>Specifies the detail level of the image. Valid values: low, high, and auto. Default value: auto.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/slide/1">https://example.com/slide/1</a></p>
         */
        @NameInMap("imageUrl")
        public String imageUrl;

        /**
         * <p>The slide ID.</p>
         * 
         * <strong>example:</strong>
         * <p>exampleSlideId</p>
         */
        @NameInMap("slideId")
        public String slideId;

        /**
         * <p>The slide order.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("slideIndex")
        public Long slideIndex;

        /**
         * <p>The signing status. Valid values:</p>
         * <ul>
         * <li>CREATED: created but not signed</li>
         * <li>SUCCESS: signed successfully</li>
         * <li>STOP: terminated</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        @NameInMap("status")
        public String status;

        public static PreviewOutputFileResponseBodySlides build(java.util.Map<String, ?> map) throws Exception {
            PreviewOutputFileResponseBodySlides self = new PreviewOutputFileResponseBodySlides();
            return TeaModel.build(map, self);
        }

        public PreviewOutputFileResponseBodySlides setDisplayText(String displayText) {
            this.displayText = displayText;
            return this;
        }
        public String getDisplayText() {
            return this.displayText;
        }

        public PreviewOutputFileResponseBodySlides setImageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
            return this;
        }
        public String getImageUrl() {
            return this.imageUrl;
        }

        public PreviewOutputFileResponseBodySlides setSlideId(String slideId) {
            this.slideId = slideId;
            return this;
        }
        public String getSlideId() {
            return this.slideId;
        }

        public PreviewOutputFileResponseBodySlides setSlideIndex(Long slideIndex) {
            this.slideIndex = slideIndex;
            return this;
        }
        public Long getSlideIndex() {
            return this.slideIndex;
        }

        public PreviewOutputFileResponseBodySlides setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class PreviewOutputFileResponseBodyVersionCapabilities extends TeaModel {
        /**
         * <p>Indicates whether the version can be opened in a browser.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("canBrowserOpen")
        public Boolean canBrowserOpen;

        /**
         * <p>Indicates whether the version can be downloaded.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("canDownload")
        public Boolean canDownload;

        /**
         * <p>Indicates whether the course can be edited or deleted.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("canEdit")
        public Boolean canEdit;

        /**
         * <p>Indicates whether the version can be restored to the latest version.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("canRestore")
        public Boolean canRestore;

        /**
         * <p>Indicates whether the version can be saved as knowledge.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("canSaveAsKnowledge")
        public Boolean canSaveAsKnowledge;

        /**
         * <p>Indicates whether the version can be shared.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("canShare")
        public Boolean canShare;

        public static PreviewOutputFileResponseBodyVersionCapabilities build(java.util.Map<String, ?> map) throws Exception {
            PreviewOutputFileResponseBodyVersionCapabilities self = new PreviewOutputFileResponseBodyVersionCapabilities();
            return TeaModel.build(map, self);
        }

        public PreviewOutputFileResponseBodyVersionCapabilities setCanBrowserOpen(Boolean canBrowserOpen) {
            this.canBrowserOpen = canBrowserOpen;
            return this;
        }
        public Boolean getCanBrowserOpen() {
            return this.canBrowserOpen;
        }

        public PreviewOutputFileResponseBodyVersionCapabilities setCanDownload(Boolean canDownload) {
            this.canDownload = canDownload;
            return this;
        }
        public Boolean getCanDownload() {
            return this.canDownload;
        }

        public PreviewOutputFileResponseBodyVersionCapabilities setCanEdit(Boolean canEdit) {
            this.canEdit = canEdit;
            return this;
        }
        public Boolean getCanEdit() {
            return this.canEdit;
        }

        public PreviewOutputFileResponseBodyVersionCapabilities setCanRestore(Boolean canRestore) {
            this.canRestore = canRestore;
            return this;
        }
        public Boolean getCanRestore() {
            return this.canRestore;
        }

        public PreviewOutputFileResponseBodyVersionCapabilities setCanSaveAsKnowledge(Boolean canSaveAsKnowledge) {
            this.canSaveAsKnowledge = canSaveAsKnowledge;
            return this;
        }
        public Boolean getCanSaveAsKnowledge() {
            return this.canSaveAsKnowledge;
        }

        public PreviewOutputFileResponseBodyVersionCapabilities setCanShare(Boolean canShare) {
            this.canShare = canShare;
            return this;
        }
        public Boolean getCanShare() {
            return this.canShare;
        }

    }

    public static class PreviewOutputFileResponseBodyVersion extends TeaModel {
        /**
         * <p>The number of remaining seats.</p>
         * 
         * <strong>example:</strong>
         * <p>AVAILABLE</p>
         */
        @NameInMap("availability")
        public String availability;

        /**
         * <p>Specifies whether the model supports multiple tool calls in a single response.</p>
         */
        @NameInMap("capabilities")
        public PreviewOutputFileResponseBodyVersionCapabilities capabilities;

        /**
         * <p>The content revision number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("contentRevision")
        public Long contentRevision;

        /**
         * <p>Indicates whether the version is the latest version.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("isLatest")
        public Boolean isLatest;

        /**
         * <p>The ID of the current latest version.</p>
         * 
         * <strong>example:</strong>
         * <p>exampleLatestVersionId</p>
         */
        @NameInMap("latestVersionId")
        public String latestVersionId;

        /**
         * <p>The read state of the version.</p>
         * 
         * <strong>example:</strong>
         * <p>AVAILABLE</p>
         */
        @NameInMap("readState")
        public String readState;

        /**
         * <p>The ID of the version that is actually read.</p>
         * 
         * <strong>example:</strong>
         * <p>exampleVersionId</p>
         */
        @NameInMap("selectedVersionId")
        public String selectedVersionId;

        /**
         * <p>The ID of the message that generated this version.</p>
         * 
         * <strong>example:</strong>
         * <p>exampleMessageId</p>
         */
        @NameInMap("sourceMessageId")
        public String sourceMessageId;

        /**
         * <p>The update time.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-11-16T13:00:00+00:00</p>
         */
        @NameInMap("updatedAt")
        public String updatedAt;

        /**
         * <p>The version serial number.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("versionNo")
        public Long versionNo;

        public static PreviewOutputFileResponseBodyVersion build(java.util.Map<String, ?> map) throws Exception {
            PreviewOutputFileResponseBodyVersion self = new PreviewOutputFileResponseBodyVersion();
            return TeaModel.build(map, self);
        }

        public PreviewOutputFileResponseBodyVersion setAvailability(String availability) {
            this.availability = availability;
            return this;
        }
        public String getAvailability() {
            return this.availability;
        }

        public PreviewOutputFileResponseBodyVersion setCapabilities(PreviewOutputFileResponseBodyVersionCapabilities capabilities) {
            this.capabilities = capabilities;
            return this;
        }
        public PreviewOutputFileResponseBodyVersionCapabilities getCapabilities() {
            return this.capabilities;
        }

        public PreviewOutputFileResponseBodyVersion setContentRevision(Long contentRevision) {
            this.contentRevision = contentRevision;
            return this;
        }
        public Long getContentRevision() {
            return this.contentRevision;
        }

        public PreviewOutputFileResponseBodyVersion setIsLatest(Boolean isLatest) {
            this.isLatest = isLatest;
            return this;
        }
        public Boolean getIsLatest() {
            return this.isLatest;
        }

        public PreviewOutputFileResponseBodyVersion setLatestVersionId(String latestVersionId) {
            this.latestVersionId = latestVersionId;
            return this;
        }
        public String getLatestVersionId() {
            return this.latestVersionId;
        }

        public PreviewOutputFileResponseBodyVersion setReadState(String readState) {
            this.readState = readState;
            return this;
        }
        public String getReadState() {
            return this.readState;
        }

        public PreviewOutputFileResponseBodyVersion setSelectedVersionId(String selectedVersionId) {
            this.selectedVersionId = selectedVersionId;
            return this;
        }
        public String getSelectedVersionId() {
            return this.selectedVersionId;
        }

        public PreviewOutputFileResponseBodyVersion setSourceMessageId(String sourceMessageId) {
            this.sourceMessageId = sourceMessageId;
            return this;
        }
        public String getSourceMessageId() {
            return this.sourceMessageId;
        }

        public PreviewOutputFileResponseBodyVersion setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public PreviewOutputFileResponseBodyVersion setVersionNo(Long versionNo) {
            this.versionNo = versionNo;
            return this;
        }
        public Long getVersionNo() {
            return this.versionNo;
        }

    }

}
