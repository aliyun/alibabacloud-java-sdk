// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quanmiaolightapp20240801.models;

import com.aliyun.tea.*;

public class SubmitVideoAnalysisTaskShrinkRequest extends TeaModel {
    @NameInMap("addDocumentParam")
    public String addDocumentParamShrink;

    @NameInMap("autoRoleRecognitionVideoUrl")
    public String autoRoleRecognitionVideoUrl;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("deduplicationId")
    public String deduplicationId;

    @NameInMap("excludeGenerateOptions")
    public String excludeGenerateOptionsShrink;

    @NameInMap("faceIdentitySimilarityMinScore")
    public Float faceIdentitySimilarityMinScore;

    @NameInMap("frameSampleMethod")
    public String frameSampleMethodShrink;

    @NameInMap("generateOptions")
    public String generateOptionsShrink;

    /**
     * <strong>example:</strong>
     * <p>chinese</p>
     */
    @NameInMap("language")
    public String language;

    @NameInMap("modelCustomPromptTemplate")
    public String modelCustomPromptTemplate;

    /**
     * <strong>example:</strong>
     * <p>PlotDetail</p>
     */
    @NameInMap("modelCustomPromptTemplateId")
    public String modelCustomPromptTemplateId;

    /**
     * <strong>example:</strong>
     * <p>qwen-max</p>
     */
    @NameInMap("modelId")
    public String modelId;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("snapshotInterval")
    public Double snapshotInterval;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("splitInterval")
    public Integer splitInterval;

    /**
     * <strong>example:</strong>
     * <p>fixDuration</p>
     */
    @NameInMap("splitType")
    public String splitType;

    @NameInMap("textProcessTasks")
    public String textProcessTasksShrink;

    @NameInMap("videoCaptionInfo")
    public String videoCaptionInfoShrink;

    @NameInMap("videoExtraInfo")
    public String videoExtraInfo;

    @NameInMap("videoModelCustomPromptTemplate")
    public String videoModelCustomPromptTemplate;

    /**
     * <strong>example:</strong>
     * <p>qwen-vl-max-latest</p>
     */
    @NameInMap("videoModelId")
    public String videoModelId;

    @NameInMap("videoRoles")
    public String videoRolesShrink;

    @NameInMap("videoShotFaceIdentityCount")
    public Integer videoShotFaceIdentityCount;

    /**
     * <strong>example:</strong>
     * <p><a href="http://xxxx.mp4">http://xxxx.mp4</a></p>
     */
    @NameInMap("videoUrl")
    public String videoUrl;

    @NameInMap("videoUrls")
    public String videoUrlsShrink;

    public static SubmitVideoAnalysisTaskShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitVideoAnalysisTaskShrinkRequest self = new SubmitVideoAnalysisTaskShrinkRequest();
        return TeaModel.build(map, self);
    }

    public SubmitVideoAnalysisTaskShrinkRequest setAddDocumentParamShrink(String addDocumentParamShrink) {
        this.addDocumentParamShrink = addDocumentParamShrink;
        return this;
    }
    public String getAddDocumentParamShrink() {
        return this.addDocumentParamShrink;
    }

    public SubmitVideoAnalysisTaskShrinkRequest setAutoRoleRecognitionVideoUrl(String autoRoleRecognitionVideoUrl) {
        this.autoRoleRecognitionVideoUrl = autoRoleRecognitionVideoUrl;
        return this;
    }
    public String getAutoRoleRecognitionVideoUrl() {
        return this.autoRoleRecognitionVideoUrl;
    }

    public SubmitVideoAnalysisTaskShrinkRequest setDeduplicationId(String deduplicationId) {
        this.deduplicationId = deduplicationId;
        return this;
    }
    public String getDeduplicationId() {
        return this.deduplicationId;
    }

    public SubmitVideoAnalysisTaskShrinkRequest setExcludeGenerateOptionsShrink(String excludeGenerateOptionsShrink) {
        this.excludeGenerateOptionsShrink = excludeGenerateOptionsShrink;
        return this;
    }
    public String getExcludeGenerateOptionsShrink() {
        return this.excludeGenerateOptionsShrink;
    }

    public SubmitVideoAnalysisTaskShrinkRequest setFaceIdentitySimilarityMinScore(Float faceIdentitySimilarityMinScore) {
        this.faceIdentitySimilarityMinScore = faceIdentitySimilarityMinScore;
        return this;
    }
    public Float getFaceIdentitySimilarityMinScore() {
        return this.faceIdentitySimilarityMinScore;
    }

    public SubmitVideoAnalysisTaskShrinkRequest setFrameSampleMethodShrink(String frameSampleMethodShrink) {
        this.frameSampleMethodShrink = frameSampleMethodShrink;
        return this;
    }
    public String getFrameSampleMethodShrink() {
        return this.frameSampleMethodShrink;
    }

    public SubmitVideoAnalysisTaskShrinkRequest setGenerateOptionsShrink(String generateOptionsShrink) {
        this.generateOptionsShrink = generateOptionsShrink;
        return this;
    }
    public String getGenerateOptionsShrink() {
        return this.generateOptionsShrink;
    }

    public SubmitVideoAnalysisTaskShrinkRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public SubmitVideoAnalysisTaskShrinkRequest setModelCustomPromptTemplate(String modelCustomPromptTemplate) {
        this.modelCustomPromptTemplate = modelCustomPromptTemplate;
        return this;
    }
    public String getModelCustomPromptTemplate() {
        return this.modelCustomPromptTemplate;
    }

    public SubmitVideoAnalysisTaskShrinkRequest setModelCustomPromptTemplateId(String modelCustomPromptTemplateId) {
        this.modelCustomPromptTemplateId = modelCustomPromptTemplateId;
        return this;
    }
    public String getModelCustomPromptTemplateId() {
        return this.modelCustomPromptTemplateId;
    }

    public SubmitVideoAnalysisTaskShrinkRequest setModelId(String modelId) {
        this.modelId = modelId;
        return this;
    }
    public String getModelId() {
        return this.modelId;
    }

    public SubmitVideoAnalysisTaskShrinkRequest setSnapshotInterval(Double snapshotInterval) {
        this.snapshotInterval = snapshotInterval;
        return this;
    }
    public Double getSnapshotInterval() {
        return this.snapshotInterval;
    }

    public SubmitVideoAnalysisTaskShrinkRequest setSplitInterval(Integer splitInterval) {
        this.splitInterval = splitInterval;
        return this;
    }
    public Integer getSplitInterval() {
        return this.splitInterval;
    }

    public SubmitVideoAnalysisTaskShrinkRequest setSplitType(String splitType) {
        this.splitType = splitType;
        return this;
    }
    public String getSplitType() {
        return this.splitType;
    }

    public SubmitVideoAnalysisTaskShrinkRequest setTextProcessTasksShrink(String textProcessTasksShrink) {
        this.textProcessTasksShrink = textProcessTasksShrink;
        return this;
    }
    public String getTextProcessTasksShrink() {
        return this.textProcessTasksShrink;
    }

    public SubmitVideoAnalysisTaskShrinkRequest setVideoCaptionInfoShrink(String videoCaptionInfoShrink) {
        this.videoCaptionInfoShrink = videoCaptionInfoShrink;
        return this;
    }
    public String getVideoCaptionInfoShrink() {
        return this.videoCaptionInfoShrink;
    }

    public SubmitVideoAnalysisTaskShrinkRequest setVideoExtraInfo(String videoExtraInfo) {
        this.videoExtraInfo = videoExtraInfo;
        return this;
    }
    public String getVideoExtraInfo() {
        return this.videoExtraInfo;
    }

    public SubmitVideoAnalysisTaskShrinkRequest setVideoModelCustomPromptTemplate(String videoModelCustomPromptTemplate) {
        this.videoModelCustomPromptTemplate = videoModelCustomPromptTemplate;
        return this;
    }
    public String getVideoModelCustomPromptTemplate() {
        return this.videoModelCustomPromptTemplate;
    }

    public SubmitVideoAnalysisTaskShrinkRequest setVideoModelId(String videoModelId) {
        this.videoModelId = videoModelId;
        return this;
    }
    public String getVideoModelId() {
        return this.videoModelId;
    }

    public SubmitVideoAnalysisTaskShrinkRequest setVideoRolesShrink(String videoRolesShrink) {
        this.videoRolesShrink = videoRolesShrink;
        return this;
    }
    public String getVideoRolesShrink() {
        return this.videoRolesShrink;
    }

    public SubmitVideoAnalysisTaskShrinkRequest setVideoShotFaceIdentityCount(Integer videoShotFaceIdentityCount) {
        this.videoShotFaceIdentityCount = videoShotFaceIdentityCount;
        return this;
    }
    public Integer getVideoShotFaceIdentityCount() {
        return this.videoShotFaceIdentityCount;
    }

    public SubmitVideoAnalysisTaskShrinkRequest setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
        return this;
    }
    public String getVideoUrl() {
        return this.videoUrl;
    }

    public SubmitVideoAnalysisTaskShrinkRequest setVideoUrlsShrink(String videoUrlsShrink) {
        this.videoUrlsShrink = videoUrlsShrink;
        return this;
    }
    public String getVideoUrlsShrink() {
        return this.videoUrlsShrink;
    }

}
