// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quanmiaolightapp20240801.models;

import com.aliyun.tea.*;

public class RunHotTopicChatRequest extends TeaModel {
    @NameInMap("category")
    public String category;

    @NameInMap("generateOptions")
    public java.util.List<String> generateOptions;

    /**
     * <strong>example:</strong>
     * <p>2024-09-13_12</p>
     */
    @NameInMap("hotTopicVersion")
    public String hotTopicVersion;

    @NameInMap("hotTopics")
    public java.util.List<String> hotTopics;

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
    public RunHotTopicChatRequestStepForBroadcastContentConfig stepForBroadcastContentConfig;

    /**
     * <strong>example:</strong>
     * <p>a3d1c2ac-f086-4a21-9069-f5631542f5a2</p>
     */
    @NameInMap("taskId")
    public String taskId;

    public static RunHotTopicChatRequest build(java.util.Map<String, ?> map) throws Exception {
        RunHotTopicChatRequest self = new RunHotTopicChatRequest();
        return TeaModel.build(map, self);
    }

    public RunHotTopicChatRequest setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public RunHotTopicChatRequest setGenerateOptions(java.util.List<String> generateOptions) {
        this.generateOptions = generateOptions;
        return this;
    }
    public java.util.List<String> getGenerateOptions() {
        return this.generateOptions;
    }

    public RunHotTopicChatRequest setHotTopicVersion(String hotTopicVersion) {
        this.hotTopicVersion = hotTopicVersion;
        return this;
    }
    public String getHotTopicVersion() {
        return this.hotTopicVersion;
    }

    public RunHotTopicChatRequest setHotTopics(java.util.List<String> hotTopics) {
        this.hotTopics = hotTopics;
        return this;
    }
    public java.util.List<String> getHotTopics() {
        return this.hotTopics;
    }

    public RunHotTopicChatRequest setImageCount(Integer imageCount) {
        this.imageCount = imageCount;
        return this;
    }
    public Integer getImageCount() {
        return this.imageCount;
    }

    public RunHotTopicChatRequest setModelCustomPromptTemplate(String modelCustomPromptTemplate) {
        this.modelCustomPromptTemplate = modelCustomPromptTemplate;
        return this;
    }
    public String getModelCustomPromptTemplate() {
        return this.modelCustomPromptTemplate;
    }

    public RunHotTopicChatRequest setModelId(String modelId) {
        this.modelId = modelId;
        return this;
    }
    public String getModelId() {
        return this.modelId;
    }

    public RunHotTopicChatRequest setOriginalSessionId(String originalSessionId) {
        this.originalSessionId = originalSessionId;
        return this;
    }
    public String getOriginalSessionId() {
        return this.originalSessionId;
    }

    public RunHotTopicChatRequest setPrompt(String prompt) {
        this.prompt = prompt;
        return this;
    }
    public String getPrompt() {
        return this.prompt;
    }

    public RunHotTopicChatRequest setStepForBroadcastContentConfig(RunHotTopicChatRequestStepForBroadcastContentConfig stepForBroadcastContentConfig) {
        this.stepForBroadcastContentConfig = stepForBroadcastContentConfig;
        return this;
    }
    public RunHotTopicChatRequestStepForBroadcastContentConfig getStepForBroadcastContentConfig() {
        return this.stepForBroadcastContentConfig;
    }

    public RunHotTopicChatRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public static class RunHotTopicChatRequestStepForBroadcastContentConfigCustomHotValueWeights extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>comments</p>
         */
        @NameInMap("dimension")
        public String dimension;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("weight")
        public Integer weight;

        public static RunHotTopicChatRequestStepForBroadcastContentConfigCustomHotValueWeights build(java.util.Map<String, ?> map) throws Exception {
            RunHotTopicChatRequestStepForBroadcastContentConfigCustomHotValueWeights self = new RunHotTopicChatRequestStepForBroadcastContentConfigCustomHotValueWeights();
            return TeaModel.build(map, self);
        }

        public RunHotTopicChatRequestStepForBroadcastContentConfigCustomHotValueWeights setDimension(String dimension) {
            this.dimension = dimension;
            return this;
        }
        public String getDimension() {
            return this.dimension;
        }

        public RunHotTopicChatRequestStepForBroadcastContentConfigCustomHotValueWeights setWeight(Integer weight) {
            this.weight = weight;
            return this;
        }
        public Integer getWeight() {
            return this.weight;
        }

    }

    public static class RunHotTopicChatRequestStepForBroadcastContentConfig extends TeaModel {
        @NameInMap("categories")
        public java.util.List<String> categories;

        @NameInMap("customHotValueWeights")
        public java.util.List<RunHotTopicChatRequestStepForBroadcastContentConfigCustomHotValueWeights> customHotValueWeights;

        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("topicCount")
        public Integer topicCount;

        public static RunHotTopicChatRequestStepForBroadcastContentConfig build(java.util.Map<String, ?> map) throws Exception {
            RunHotTopicChatRequestStepForBroadcastContentConfig self = new RunHotTopicChatRequestStepForBroadcastContentConfig();
            return TeaModel.build(map, self);
        }

        public RunHotTopicChatRequestStepForBroadcastContentConfig setCategories(java.util.List<String> categories) {
            this.categories = categories;
            return this;
        }
        public java.util.List<String> getCategories() {
            return this.categories;
        }

        public RunHotTopicChatRequestStepForBroadcastContentConfig setCustomHotValueWeights(java.util.List<RunHotTopicChatRequestStepForBroadcastContentConfigCustomHotValueWeights> customHotValueWeights) {
            this.customHotValueWeights = customHotValueWeights;
            return this;
        }
        public java.util.List<RunHotTopicChatRequestStepForBroadcastContentConfigCustomHotValueWeights> getCustomHotValueWeights() {
            return this.customHotValueWeights;
        }

        public RunHotTopicChatRequestStepForBroadcastContentConfig setTopicCount(Integer topicCount) {
            this.topicCount = topicCount;
            return this;
        }
        public Integer getTopicCount() {
            return this.topicCount;
        }

    }

}
