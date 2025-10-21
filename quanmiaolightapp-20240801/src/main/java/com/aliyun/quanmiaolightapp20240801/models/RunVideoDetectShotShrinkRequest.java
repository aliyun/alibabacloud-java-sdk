// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quanmiaolightapp20240801.models;

import com.aliyun.tea.*;

public class RunVideoDetectShotShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("intelliSimpPrompt")
    public String intelliSimpPrompt;

    /**
     * <strong>example:</strong>
     * <p>intelliSimpShowPrompt</p>
     */
    @NameInMap("intelliSimpPromptTemplateId")
    public String intelliSimpPromptTemplateId;

    /**
     * <strong>example:</strong>
     * <p>chinese</p>
     */
    @NameInMap("language")
    public String language;

    /**
     * <strong>example:</strong>
     * <p>videoDetectShotShowPrompt</p>
     */
    @NameInMap("modelCustomPromptTemplateId")
    public String modelCustomPromptTemplateId;

    /**
     * <strong>example:</strong>
     * <p>deepseek-r1</p>
     */
    @NameInMap("modelId")
    public String modelId;

    /**
     * <strong>example:</strong>
     * <p>videoDetectShotVlShowPrompt</p>
     */
    @NameInMap("modelVlCustomPromptTemplateId")
    public String modelVlCustomPromptTemplateId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("options")
    public String optionsShrink;

    /**
     * <strong>example:</strong>
     * <p>a3d1c2ac-f086-4a21-9069-f5631542f5ax</p>
     */
    @NameInMap("originalSessionId")
    public String originalSessionId;

    /**
     * <strong>example:</strong>
     * <p>deepseek-v3.1</p>
     */
    @NameInMap("preModelId")
    public String preModelId;

    /**
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("prompt")
    public String prompt;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("recognitionOptions")
    public String recognitionOptionsShrink;

    /**
     * <strong>example:</strong>
     * <p>a3d1c2ac-f086-4a21-9069-f5631542f5a2</p>
     */
    @NameInMap("taskId")
    public String taskId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://xxx.mp4">https://xxx.mp4</a></p>
     */
    @NameInMap("videoUrl")
    public String videoUrl;

    /**
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("vlPrompt")
    public String vlPrompt;

    public static RunVideoDetectShotShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        RunVideoDetectShotShrinkRequest self = new RunVideoDetectShotShrinkRequest();
        return TeaModel.build(map, self);
    }

    public RunVideoDetectShotShrinkRequest setIntelliSimpPrompt(String intelliSimpPrompt) {
        this.intelliSimpPrompt = intelliSimpPrompt;
        return this;
    }
    public String getIntelliSimpPrompt() {
        return this.intelliSimpPrompt;
    }

    public RunVideoDetectShotShrinkRequest setIntelliSimpPromptTemplateId(String intelliSimpPromptTemplateId) {
        this.intelliSimpPromptTemplateId = intelliSimpPromptTemplateId;
        return this;
    }
    public String getIntelliSimpPromptTemplateId() {
        return this.intelliSimpPromptTemplateId;
    }

    public RunVideoDetectShotShrinkRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public RunVideoDetectShotShrinkRequest setModelCustomPromptTemplateId(String modelCustomPromptTemplateId) {
        this.modelCustomPromptTemplateId = modelCustomPromptTemplateId;
        return this;
    }
    public String getModelCustomPromptTemplateId() {
        return this.modelCustomPromptTemplateId;
    }

    public RunVideoDetectShotShrinkRequest setModelId(String modelId) {
        this.modelId = modelId;
        return this;
    }
    public String getModelId() {
        return this.modelId;
    }

    public RunVideoDetectShotShrinkRequest setModelVlCustomPromptTemplateId(String modelVlCustomPromptTemplateId) {
        this.modelVlCustomPromptTemplateId = modelVlCustomPromptTemplateId;
        return this;
    }
    public String getModelVlCustomPromptTemplateId() {
        return this.modelVlCustomPromptTemplateId;
    }

    public RunVideoDetectShotShrinkRequest setOptionsShrink(String optionsShrink) {
        this.optionsShrink = optionsShrink;
        return this;
    }
    public String getOptionsShrink() {
        return this.optionsShrink;
    }

    public RunVideoDetectShotShrinkRequest setOriginalSessionId(String originalSessionId) {
        this.originalSessionId = originalSessionId;
        return this;
    }
    public String getOriginalSessionId() {
        return this.originalSessionId;
    }

    public RunVideoDetectShotShrinkRequest setPreModelId(String preModelId) {
        this.preModelId = preModelId;
        return this;
    }
    public String getPreModelId() {
        return this.preModelId;
    }

    public RunVideoDetectShotShrinkRequest setPrompt(String prompt) {
        this.prompt = prompt;
        return this;
    }
    public String getPrompt() {
        return this.prompt;
    }

    public RunVideoDetectShotShrinkRequest setRecognitionOptionsShrink(String recognitionOptionsShrink) {
        this.recognitionOptionsShrink = recognitionOptionsShrink;
        return this;
    }
    public String getRecognitionOptionsShrink() {
        return this.recognitionOptionsShrink;
    }

    public RunVideoDetectShotShrinkRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public RunVideoDetectShotShrinkRequest setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
        return this;
    }
    public String getVideoUrl() {
        return this.videoUrl;
    }

    public RunVideoDetectShotShrinkRequest setVlPrompt(String vlPrompt) {
        this.vlPrompt = vlPrompt;
        return this;
    }
    public String getVlPrompt() {
        return this.vlPrompt;
    }

}
