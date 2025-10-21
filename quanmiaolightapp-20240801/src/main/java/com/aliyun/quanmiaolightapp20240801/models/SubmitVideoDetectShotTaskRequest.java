// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quanmiaolightapp20240801.models;

import com.aliyun.tea.*;

public class SubmitVideoDetectShotTaskRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("deduplicationId")
    public String deduplicationId;

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

    @NameInMap("options")
    public java.util.List<String> options;

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

    @NameInMap("recognitionOptions")
    public java.util.List<String> recognitionOptions;

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

    public static SubmitVideoDetectShotTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitVideoDetectShotTaskRequest self = new SubmitVideoDetectShotTaskRequest();
        return TeaModel.build(map, self);
    }

    public SubmitVideoDetectShotTaskRequest setDeduplicationId(String deduplicationId) {
        this.deduplicationId = deduplicationId;
        return this;
    }
    public String getDeduplicationId() {
        return this.deduplicationId;
    }

    public SubmitVideoDetectShotTaskRequest setIntelliSimpPrompt(String intelliSimpPrompt) {
        this.intelliSimpPrompt = intelliSimpPrompt;
        return this;
    }
    public String getIntelliSimpPrompt() {
        return this.intelliSimpPrompt;
    }

    public SubmitVideoDetectShotTaskRequest setIntelliSimpPromptTemplateId(String intelliSimpPromptTemplateId) {
        this.intelliSimpPromptTemplateId = intelliSimpPromptTemplateId;
        return this;
    }
    public String getIntelliSimpPromptTemplateId() {
        return this.intelliSimpPromptTemplateId;
    }

    public SubmitVideoDetectShotTaskRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public SubmitVideoDetectShotTaskRequest setModelCustomPromptTemplateId(String modelCustomPromptTemplateId) {
        this.modelCustomPromptTemplateId = modelCustomPromptTemplateId;
        return this;
    }
    public String getModelCustomPromptTemplateId() {
        return this.modelCustomPromptTemplateId;
    }

    public SubmitVideoDetectShotTaskRequest setModelId(String modelId) {
        this.modelId = modelId;
        return this;
    }
    public String getModelId() {
        return this.modelId;
    }

    public SubmitVideoDetectShotTaskRequest setModelVlCustomPromptTemplateId(String modelVlCustomPromptTemplateId) {
        this.modelVlCustomPromptTemplateId = modelVlCustomPromptTemplateId;
        return this;
    }
    public String getModelVlCustomPromptTemplateId() {
        return this.modelVlCustomPromptTemplateId;
    }

    public SubmitVideoDetectShotTaskRequest setOptions(java.util.List<String> options) {
        this.options = options;
        return this;
    }
    public java.util.List<String> getOptions() {
        return this.options;
    }

    public SubmitVideoDetectShotTaskRequest setOriginalSessionId(String originalSessionId) {
        this.originalSessionId = originalSessionId;
        return this;
    }
    public String getOriginalSessionId() {
        return this.originalSessionId;
    }

    public SubmitVideoDetectShotTaskRequest setPreModelId(String preModelId) {
        this.preModelId = preModelId;
        return this;
    }
    public String getPreModelId() {
        return this.preModelId;
    }

    public SubmitVideoDetectShotTaskRequest setPrompt(String prompt) {
        this.prompt = prompt;
        return this;
    }
    public String getPrompt() {
        return this.prompt;
    }

    public SubmitVideoDetectShotTaskRequest setRecognitionOptions(java.util.List<String> recognitionOptions) {
        this.recognitionOptions = recognitionOptions;
        return this;
    }
    public java.util.List<String> getRecognitionOptions() {
        return this.recognitionOptions;
    }

    public SubmitVideoDetectShotTaskRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public SubmitVideoDetectShotTaskRequest setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
        return this;
    }
    public String getVideoUrl() {
        return this.videoUrl;
    }

    public SubmitVideoDetectShotTaskRequest setVlPrompt(String vlPrompt) {
        this.vlPrompt = vlPrompt;
        return this;
    }
    public String getVlPrompt() {
        return this.vlPrompt;
    }

}
