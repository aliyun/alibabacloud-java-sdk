// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class BrandKnowledgeDocument extends TeaModel {
    /**
     * <p>Specifies whether the content is sufficient to be considered for plan summary candidates.</p>
     */
    @NameInMap("ContentSufficient")
    public Boolean contentSufficient;

    /**
     * <p>The MIME type of the file.</p>
     * 
     * <strong>example:</strong>
     * <p>application/pdf</p>
     */
    @NameInMap("ContentType")
    public String contentType;

    /**
     * <p>The creation time in Unix milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1735660800000</p>
     */
    @NameInMap("CreatedAt")
    public Long createdAt;

    /**
     * <p>Specifies whether deletion is currently allowed.</p>
     */
    @NameInMap("Deletable")
    public Boolean deletable;

    /**
     * <p>The display title.</p>
     * 
     * <strong>example:</strong>
     * <p>Wanxiaozhi product introduction</p>
     */
    @NameInMap("DisplayTitle")
    public String displayTitle;

    /**
     * <p>The document category.</p>
     * 
     * <strong>example:</strong>
     * <p>PRODUCT</p>
     */
    @NameInMap("DocCategory")
    public String docCategory;

    /**
     * <p>The ID of the brand knowledge document.</p>
     * 
     * <strong>example:</strong>
     * <p>bkd_3f7a1c2e9b7d4a5f8c0e1d2b3a4c5d6e</p>
     */
    @NameInMap("DocumentId")
    public String documentId;

    /**
     * <p>The stable error code for main processing failures.</p>
     * 
     * <strong>example:</strong>
     * <p>BRAND_KNOWLEDGE_PARSE_FAILED</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The desensitized error message for main processing failures.</p>
     * 
     * <strong>example:</strong>
     * <p>Document parsing failed. Please re-upload</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The file size in bytes.</p>
     * 
     * <strong>example:</strong>
     * <p>1048576</p>
     */
    @NameInMap("FileSize")
    public Long fileSize;

    /**
     * <p>The summary keywords.</p>
     */
    @NameInMap("KeyTopics")
    public java.util.List<String> keyTopics;

    /**
     * <p>The one-line summary, which is used only to construct search queries and cannot be used as factual evidence.</p>
     * 
     * <strong>example:</strong>
     * <p>Introduces the product positioning and core capabilities of the Wanxiaozhi AI website building platform. It can be used as a reference for content topic selection</p>
     */
    @NameInMap("OneLineSummary")
    public String oneLineSummary;

    /**
     * <p>The original file name.</p>
     * 
     * <strong>example:</strong>
     * <p>Wanxiaozhi product introduction.pdf</p>
     */
    @NameInMap("OriginalName")
    public String originalName;

    /**
     * <p>The ID of the business workspace. For GEO business workspaces of the brand marketing type, this is the appWorkspaceId.</p>
     * 
     * <strong>example:</strong>
     * <p>d4e5f60718293a4b5c6d7e8f90a1b2c3</p>
     */
    @NameInMap("ProjectId")
    public String projectId;

    /**
     * <p>The time when the document is ready for reference, in Unix milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1735660900000</p>
     */
    @NameInMap("ReadyAt")
    public Long readyAt;

    /**
     * <p>The document processing status.</p>
     * 
     * <strong>example:</strong>
     * <p>READY</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The message displayed on the status page.</p>
     * 
     * <strong>example:</strong>
     * <p>Parsing completed and available for content plans</p>
     */
    @NameInMap("StatusMessage")
    public String statusMessage;

    /**
     * <p>The stable error code for summary failures.</p>
     * 
     * <strong>example:</strong>
     * <p>BRAND_KNOWLEDGE_SUMMARY_TIMEOUT</p>
     */
    @NameInMap("SummaryErrorCode")
    public String summaryErrorCode;

    /**
     * <p>The summary status.</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCEEDED</p>
     */
    @NameInMap("SummaryStatus")
    public String summaryStatus;

    /**
     * <p>The last update time in Unix milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1735660900000</p>
     */
    @NameInMap("UpdatedAt")
    public Long updatedAt;

    public static BrandKnowledgeDocument build(java.util.Map<String, ?> map) throws Exception {
        BrandKnowledgeDocument self = new BrandKnowledgeDocument();
        return TeaModel.build(map, self);
    }

    public BrandKnowledgeDocument setContentSufficient(Boolean contentSufficient) {
        this.contentSufficient = contentSufficient;
        return this;
    }
    public Boolean getContentSufficient() {
        return this.contentSufficient;
    }

    public BrandKnowledgeDocument setContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public String getContentType() {
        return this.contentType;
    }

    public BrandKnowledgeDocument setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public Long getCreatedAt() {
        return this.createdAt;
    }

    public BrandKnowledgeDocument setDeletable(Boolean deletable) {
        this.deletable = deletable;
        return this;
    }
    public Boolean getDeletable() {
        return this.deletable;
    }

    public BrandKnowledgeDocument setDisplayTitle(String displayTitle) {
        this.displayTitle = displayTitle;
        return this;
    }
    public String getDisplayTitle() {
        return this.displayTitle;
    }

    public BrandKnowledgeDocument setDocCategory(String docCategory) {
        this.docCategory = docCategory;
        return this;
    }
    public String getDocCategory() {
        return this.docCategory;
    }

    public BrandKnowledgeDocument setDocumentId(String documentId) {
        this.documentId = documentId;
        return this;
    }
    public String getDocumentId() {
        return this.documentId;
    }

    public BrandKnowledgeDocument setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public BrandKnowledgeDocument setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public BrandKnowledgeDocument setFileSize(Long fileSize) {
        this.fileSize = fileSize;
        return this;
    }
    public Long getFileSize() {
        return this.fileSize;
    }

    public BrandKnowledgeDocument setKeyTopics(java.util.List<String> keyTopics) {
        this.keyTopics = keyTopics;
        return this;
    }
    public java.util.List<String> getKeyTopics() {
        return this.keyTopics;
    }

    public BrandKnowledgeDocument setOneLineSummary(String oneLineSummary) {
        this.oneLineSummary = oneLineSummary;
        return this;
    }
    public String getOneLineSummary() {
        return this.oneLineSummary;
    }

    public BrandKnowledgeDocument setOriginalName(String originalName) {
        this.originalName = originalName;
        return this;
    }
    public String getOriginalName() {
        return this.originalName;
    }

    public BrandKnowledgeDocument setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public BrandKnowledgeDocument setReadyAt(Long readyAt) {
        this.readyAt = readyAt;
        return this;
    }
    public Long getReadyAt() {
        return this.readyAt;
    }

    public BrandKnowledgeDocument setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public BrandKnowledgeDocument setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
        return this;
    }
    public String getStatusMessage() {
        return this.statusMessage;
    }

    public BrandKnowledgeDocument setSummaryErrorCode(String summaryErrorCode) {
        this.summaryErrorCode = summaryErrorCode;
        return this;
    }
    public String getSummaryErrorCode() {
        return this.summaryErrorCode;
    }

    public BrandKnowledgeDocument setSummaryStatus(String summaryStatus) {
        this.summaryStatus = summaryStatus;
        return this;
    }
    public String getSummaryStatus() {
        return this.summaryStatus;
    }

    public BrandKnowledgeDocument setUpdatedAt(Long updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    public Long getUpdatedAt() {
        return this.updatedAt;
    }

}
