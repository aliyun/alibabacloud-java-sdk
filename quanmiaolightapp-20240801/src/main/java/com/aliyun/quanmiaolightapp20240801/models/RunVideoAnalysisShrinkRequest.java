// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quanmiaolightapp20240801.models;

import com.aliyun.tea.*;

public class RunVideoAnalysisShrinkRequest extends TeaModel {
    @NameInMap("addDocumentParam")
    public String addDocumentParamShrink;

    @NameInMap("autoRoleRecognitionVideoUrl")
    public String autoRoleRecognitionVideoUrl;

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
     * <p>english</p>
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
     * <p>a3d1c2ac-f086-4a21-9069-f5631542f5ax</p>
     */
    @NameInMap("originalSessionId")
    public String originalSessionId;

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

    /**
     * <strong>example:</strong>
     * <p>a3d1c2ac-f086-4a21-9069-f5631542f5a2</p>
     */
    @NameInMap("taskId")
    public String taskId;

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
     * <p>qwen-vl-max</p>
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

    public static RunVideoAnalysisShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        RunVideoAnalysisShrinkRequest self = new RunVideoAnalysisShrinkRequest();
        return TeaModel.build(map, self);
    }

    public RunVideoAnalysisShrinkRequest setAddDocumentParamShrink(String addDocumentParamShrink) {
        this.addDocumentParamShrink = addDocumentParamShrink;
        return this;
    }
    public String getAddDocumentParamShrink() {
        return this.addDocumentParamShrink;
    }

    public RunVideoAnalysisShrinkRequest setAutoRoleRecognitionVideoUrl(String autoRoleRecognitionVideoUrl) {
        this.autoRoleRecognitionVideoUrl = autoRoleRecognitionVideoUrl;
        return this;
    }
    public String getAutoRoleRecognitionVideoUrl() {
        return this.autoRoleRecognitionVideoUrl;
    }

    public RunVideoAnalysisShrinkRequest setExcludeGenerateOptionsShrink(String excludeGenerateOptionsShrink) {
        this.excludeGenerateOptionsShrink = excludeGenerateOptionsShrink;
        return this;
    }
    public String getExcludeGenerateOptionsShrink() {
        return this.excludeGenerateOptionsShrink;
    }

    public RunVideoAnalysisShrinkRequest setFaceIdentitySimilarityMinScore(Float faceIdentitySimilarityMinScore) {
        this.faceIdentitySimilarityMinScore = faceIdentitySimilarityMinScore;
        return this;
    }
    public Float getFaceIdentitySimilarityMinScore() {
        return this.faceIdentitySimilarityMinScore;
    }

    public RunVideoAnalysisShrinkRequest setFrameSampleMethodShrink(String frameSampleMethodShrink) {
        this.frameSampleMethodShrink = frameSampleMethodShrink;
        return this;
    }
    public String getFrameSampleMethodShrink() {
        return this.frameSampleMethodShrink;
    }

    public RunVideoAnalysisShrinkRequest setGenerateOptionsShrink(String generateOptionsShrink) {
        this.generateOptionsShrink = generateOptionsShrink;
        return this;
    }
    public String getGenerateOptionsShrink() {
        return this.generateOptionsShrink;
    }

    public RunVideoAnalysisShrinkRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public RunVideoAnalysisShrinkRequest setModelCustomPromptTemplate(String modelCustomPromptTemplate) {
        this.modelCustomPromptTemplate = modelCustomPromptTemplate;
        return this;
    }
    public String getModelCustomPromptTemplate() {
        return this.modelCustomPromptTemplate;
    }

    public RunVideoAnalysisShrinkRequest setModelCustomPromptTemplateId(String modelCustomPromptTemplateId) {
        this.modelCustomPromptTemplateId = modelCustomPromptTemplateId;
        return this;
    }
    public String getModelCustomPromptTemplateId() {
        return this.modelCustomPromptTemplateId;
    }

    public RunVideoAnalysisShrinkRequest setModelId(String modelId) {
        this.modelId = modelId;
        return this;
    }
    public String getModelId() {
        return this.modelId;
    }

    public RunVideoAnalysisShrinkRequest setOriginalSessionId(String originalSessionId) {
        this.originalSessionId = originalSessionId;
        return this;
    }
    public String getOriginalSessionId() {
        return this.originalSessionId;
    }

    public RunVideoAnalysisShrinkRequest setSnapshotInterval(Double snapshotInterval) {
        this.snapshotInterval = snapshotInterval;
        return this;
    }
    public Double getSnapshotInterval() {
        return this.snapshotInterval;
    }

    public RunVideoAnalysisShrinkRequest setSplitInterval(Integer splitInterval) {
        this.splitInterval = splitInterval;
        return this;
    }
    public Integer getSplitInterval() {
        return this.splitInterval;
    }

    public RunVideoAnalysisShrinkRequest setSplitType(String splitType) {
        this.splitType = splitType;
        return this;
    }
    public String getSplitType() {
        return this.splitType;
    }

    public RunVideoAnalysisShrinkRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public RunVideoAnalysisShrinkRequest setTextProcessTasksShrink(String textProcessTasksShrink) {
        this.textProcessTasksShrink = textProcessTasksShrink;
        return this;
    }
    public String getTextProcessTasksShrink() {
        return this.textProcessTasksShrink;
    }

    public RunVideoAnalysisShrinkRequest setVideoCaptionInfoShrink(String videoCaptionInfoShrink) {
        this.videoCaptionInfoShrink = videoCaptionInfoShrink;
        return this;
    }
    public String getVideoCaptionInfoShrink() {
        return this.videoCaptionInfoShrink;
    }

    public RunVideoAnalysisShrinkRequest setVideoExtraInfo(String videoExtraInfo) {
        this.videoExtraInfo = videoExtraInfo;
        return this;
    }
    public String getVideoExtraInfo() {
        return this.videoExtraInfo;
    }

    public RunVideoAnalysisShrinkRequest setVideoModelCustomPromptTemplate(String videoModelCustomPromptTemplate) {
        this.videoModelCustomPromptTemplate = videoModelCustomPromptTemplate;
        return this;
    }
    public String getVideoModelCustomPromptTemplate() {
        return this.videoModelCustomPromptTemplate;
    }

    public RunVideoAnalysisShrinkRequest setVideoModelId(String videoModelId) {
        this.videoModelId = videoModelId;
        return this;
    }
    public String getVideoModelId() {
        return this.videoModelId;
    }

    public RunVideoAnalysisShrinkRequest setVideoRolesShrink(String videoRolesShrink) {
        this.videoRolesShrink = videoRolesShrink;
        return this;
    }
    public String getVideoRolesShrink() {
        return this.videoRolesShrink;
    }

    public RunVideoAnalysisShrinkRequest setVideoShotFaceIdentityCount(Integer videoShotFaceIdentityCount) {
        this.videoShotFaceIdentityCount = videoShotFaceIdentityCount;
        return this;
    }
    public Integer getVideoShotFaceIdentityCount() {
        return this.videoShotFaceIdentityCount;
    }

    public RunVideoAnalysisShrinkRequest setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
        return this;
    }
    public String getVideoUrl() {
        return this.videoUrl;
    }

}
