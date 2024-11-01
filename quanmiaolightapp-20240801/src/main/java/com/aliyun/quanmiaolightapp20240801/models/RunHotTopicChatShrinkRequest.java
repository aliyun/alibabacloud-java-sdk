// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quanmiaolightapp20240801.models;

import com.aliyun.tea.*;

public class RunHotTopicChatShrinkRequest extends TeaModel {
    @NameInMap("category")
    public String category;

    @NameInMap("generateOptions")
    public String generateOptionsShrink;

    /**
     * <strong>example:</strong>
     * <p>2024-09-13_12</p>
     */
    @NameInMap("hotTopicVersion")
    public String hotTopicVersion;

    @NameInMap("hotTopics")
    public String hotTopicsShrink;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("imageCount")
    public Integer imageCount;

    /**
     * <strong>example:</strong>
     * <p>xx</p>
     */
    @NameInMap("modelCustomPromptTemplate")
    public String modelCustomPromptTemplate;

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

    @NameInMap("prompt")
    public String prompt;

    @NameInMap("stepForBroadcastContentConfig")
    public String stepForBroadcastContentConfigShrink;

    /**
     * <strong>example:</strong>
     * <p>a3d1c2ac-f086-4a21-9069-f5631542f5a2</p>
     */
    @NameInMap("taskId")
    public String taskId;

    public static RunHotTopicChatShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        RunHotTopicChatShrinkRequest self = new RunHotTopicChatShrinkRequest();
        return TeaModel.build(map, self);
    }

    public RunHotTopicChatShrinkRequest setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public RunHotTopicChatShrinkRequest setGenerateOptionsShrink(String generateOptionsShrink) {
        this.generateOptionsShrink = generateOptionsShrink;
        return this;
    }
    public String getGenerateOptionsShrink() {
        return this.generateOptionsShrink;
    }

    public RunHotTopicChatShrinkRequest setHotTopicVersion(String hotTopicVersion) {
        this.hotTopicVersion = hotTopicVersion;
        return this;
    }
    public String getHotTopicVersion() {
        return this.hotTopicVersion;
    }

    public RunHotTopicChatShrinkRequest setHotTopicsShrink(String hotTopicsShrink) {
        this.hotTopicsShrink = hotTopicsShrink;
        return this;
    }
    public String getHotTopicsShrink() {
        return this.hotTopicsShrink;
    }

    public RunHotTopicChatShrinkRequest setImageCount(Integer imageCount) {
        this.imageCount = imageCount;
        return this;
    }
    public Integer getImageCount() {
        return this.imageCount;
    }

    public RunHotTopicChatShrinkRequest setModelCustomPromptTemplate(String modelCustomPromptTemplate) {
        this.modelCustomPromptTemplate = modelCustomPromptTemplate;
        return this;
    }
    public String getModelCustomPromptTemplate() {
        return this.modelCustomPromptTemplate;
    }

    public RunHotTopicChatShrinkRequest setModelId(String modelId) {
        this.modelId = modelId;
        return this;
    }
    public String getModelId() {
        return this.modelId;
    }

    public RunHotTopicChatShrinkRequest setOriginalSessionId(String originalSessionId) {
        this.originalSessionId = originalSessionId;
        return this;
    }
    public String getOriginalSessionId() {
        return this.originalSessionId;
    }

    public RunHotTopicChatShrinkRequest setPrompt(String prompt) {
        this.prompt = prompt;
        return this;
    }
    public String getPrompt() {
        return this.prompt;
    }

    public RunHotTopicChatShrinkRequest setStepForBroadcastContentConfigShrink(String stepForBroadcastContentConfigShrink) {
        this.stepForBroadcastContentConfigShrink = stepForBroadcastContentConfigShrink;
        return this;
    }
    public String getStepForBroadcastContentConfigShrink() {
        return this.stepForBroadcastContentConfigShrink;
    }

    public RunHotTopicChatShrinkRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
