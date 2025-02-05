// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quanmiaolightapp20240801.models;

import com.aliyun.tea.*;

public class SubmitVideoAnalysisTaskShrinkRequest extends TeaModel {
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

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://xxxx.mp4">http://xxxx.mp4</a></p>
     */
    @NameInMap("videoUrl")
    public String videoUrl;

    public static SubmitVideoAnalysisTaskShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitVideoAnalysisTaskShrinkRequest self = new SubmitVideoAnalysisTaskShrinkRequest();
        return TeaModel.build(map, self);
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

    public SubmitVideoAnalysisTaskShrinkRequest setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
        return this;
    }
    public String getVideoUrl() {
        return this.videoUrl;
    }

}
