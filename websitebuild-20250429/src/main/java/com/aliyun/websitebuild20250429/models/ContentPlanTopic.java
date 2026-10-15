// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class ContentPlanTopic extends TeaModel {
    /**
     * <p>The article generation session ID.</p>
     * 
     * <strong>example:</strong>
     * <p>conv_8a2b3c</p>
     */
    @NameInMap("ArticleConversationId")
    public String articleConversationId;

    /**
     * <p>The generated article ID.</p>
     * 
     * <strong>example:</strong>
     * <p>art_9f2k3d</p>
     */
    @NameInMap("ArticleId")
    public String articleId;

    /**
     * <p>The status of the associated article. Valid values: DRAFT, PUBLISHED, and PUBLISH_FAILED. This parameter is empty if the article is not generated.</p>
     * 
     * <strong>example:</strong>
     * <p>PUBLISHED</p>
     */
    @NameInMap("ArticleStatus")
    public String articleStatus;

    /**
     * <p>The GEO diagnostic item references.</p>
     */
    @NameInMap("DiagnosisReferences")
    public java.util.List<String> diagnosisReferences;

    /**
     * <p>The content direction.</p>
     * 
     * <strong>example:</strong>
     * <p>Introduction to product capabilities</p>
     */
    @NameInMap("Direction")
    public String direction;

    /**
     * <p>The reason for the execution failure.</p>
     * 
     * <strong>example:</strong>
     * <p>Article generation failed. Try again later</p>
     */
    @NameInMap("FailReason")
    public String failReason;

    /**
     * <p>The content plan ID.</p>
     * 
     * <strong>example:</strong>
     * <p>plan_3f7a1c2e9b7d4a5f8c0e1d2b3a4c5d6e</p>
     */
    @NameInMap("PlanId")
    public String planId;

    /**
     * <p>The workspace ID. This refers to the GEO workspace for brand marketing, which is the appWorkspaceId.</p>
     * 
     * <strong>example:</strong>
     * <p>d4e5f60718293a4b5c6d7e8f90a1b2c3</p>
     */
    @NameInMap("ProjectId")
    public String projectId;

    /**
     * <p>The rationale for topic selection.</p>
     * 
     * <strong>example:</strong>
     * <p>Users show high interest in AI website builder capabilities, making it a suitable entry point for brand awareness</p>
     */
    @NameInMap("Rationale")
    public String rationale;

    /**
     * <p>The recommended publishing channels.</p>
     */
    @NameInMap("RecommendedChannels")
    public java.util.List<String> recommendedChannels;

    /**
     * <p>The scheduled publish date in the yyyy-MM-dd format.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-10-12</p>
     */
    @NameInMap("ScheduledAt")
    public String scheduledAt;

    /**
     * <p>The reason for skipping.</p>
     * 
     * <strong>example:</strong>
     * <p>This topic duplicates a published article and has been skipped</p>
     */
    @NameInMap("SkipReason")
    public String skipReason;

    /**
     * <p>The topic status.</p>
     * 
     * <strong>example:</strong>
     * <p>PENDING</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The content title.</p>
     * 
     * <strong>example:</strong>
     * <p>Analysis of the core capabilities of Wanxiaozhi AI website builder</p>
     */
    @NameInMap("Title")
    public String title;

    /**
     * <p>The topic ID.</p>
     * 
     * <strong>example:</strong>
     * <p>topic_3f7a1c2e9b7d4a5f8c0e1d2b3a4c5d6e</p>
     */
    @NameInMap("TopicId")
    public String topicId;

    /**
     * <p>The writing direction, which only describes the structure and perspective.</p>
     * 
     * <strong>example:</strong>
     * <p>First summarize the product positioning, then introduce the core capabilities point by point, and finally provide the applicable scenarios</p>
     */
    @NameInMap("WritingDirection")
    public String writingDirection;

    public static ContentPlanTopic build(java.util.Map<String, ?> map) throws Exception {
        ContentPlanTopic self = new ContentPlanTopic();
        return TeaModel.build(map, self);
    }

    public ContentPlanTopic setArticleConversationId(String articleConversationId) {
        this.articleConversationId = articleConversationId;
        return this;
    }
    public String getArticleConversationId() {
        return this.articleConversationId;
    }

    public ContentPlanTopic setArticleId(String articleId) {
        this.articleId = articleId;
        return this;
    }
    public String getArticleId() {
        return this.articleId;
    }

    public ContentPlanTopic setArticleStatus(String articleStatus) {
        this.articleStatus = articleStatus;
        return this;
    }
    public String getArticleStatus() {
        return this.articleStatus;
    }

    public ContentPlanTopic setDiagnosisReferences(java.util.List<String> diagnosisReferences) {
        this.diagnosisReferences = diagnosisReferences;
        return this;
    }
    public java.util.List<String> getDiagnosisReferences() {
        return this.diagnosisReferences;
    }

    public ContentPlanTopic setDirection(String direction) {
        this.direction = direction;
        return this;
    }
    public String getDirection() {
        return this.direction;
    }

    public ContentPlanTopic setFailReason(String failReason) {
        this.failReason = failReason;
        return this;
    }
    public String getFailReason() {
        return this.failReason;
    }

    public ContentPlanTopic setPlanId(String planId) {
        this.planId = planId;
        return this;
    }
    public String getPlanId() {
        return this.planId;
    }

    public ContentPlanTopic setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public ContentPlanTopic setRationale(String rationale) {
        this.rationale = rationale;
        return this;
    }
    public String getRationale() {
        return this.rationale;
    }

    public ContentPlanTopic setRecommendedChannels(java.util.List<String> recommendedChannels) {
        this.recommendedChannels = recommendedChannels;
        return this;
    }
    public java.util.List<String> getRecommendedChannels() {
        return this.recommendedChannels;
    }

    public ContentPlanTopic setScheduledAt(String scheduledAt) {
        this.scheduledAt = scheduledAt;
        return this;
    }
    public String getScheduledAt() {
        return this.scheduledAt;
    }

    public ContentPlanTopic setSkipReason(String skipReason) {
        this.skipReason = skipReason;
        return this;
    }
    public String getSkipReason() {
        return this.skipReason;
    }

    public ContentPlanTopic setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ContentPlanTopic setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public ContentPlanTopic setTopicId(String topicId) {
        this.topicId = topicId;
        return this;
    }
    public String getTopicId() {
        return this.topicId;
    }

    public ContentPlanTopic setWritingDirection(String writingDirection) {
        this.writingDirection = writingDirection;
        return this;
    }
    public String getWritingDirection() {
        return this.writingDirection;
    }

}
