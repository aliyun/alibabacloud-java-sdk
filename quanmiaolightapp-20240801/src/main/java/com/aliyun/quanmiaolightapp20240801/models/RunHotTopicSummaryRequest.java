// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quanmiaolightapp20240801.models;

import com.aliyun.tea.*;

public class RunHotTopicSummaryRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-10-16_8</p>
     */
    @NameInMap("hotTopicVersion")
    public String hotTopicVersion;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("stepForCustomSummaryStyleConfig")
    public RunHotTopicSummaryRequestStepForCustomSummaryStyleConfig stepForCustomSummaryStyleConfig;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxxx</p>
     */
    @NameInMap("topicIds")
    public java.util.List<String> topicIds;

    public static RunHotTopicSummaryRequest build(java.util.Map<String, ?> map) throws Exception {
        RunHotTopicSummaryRequest self = new RunHotTopicSummaryRequest();
        return TeaModel.build(map, self);
    }

    public RunHotTopicSummaryRequest setHotTopicVersion(String hotTopicVersion) {
        this.hotTopicVersion = hotTopicVersion;
        return this;
    }
    public String getHotTopicVersion() {
        return this.hotTopicVersion;
    }

    public RunHotTopicSummaryRequest setStepForCustomSummaryStyleConfig(RunHotTopicSummaryRequestStepForCustomSummaryStyleConfig stepForCustomSummaryStyleConfig) {
        this.stepForCustomSummaryStyleConfig = stepForCustomSummaryStyleConfig;
        return this;
    }
    public RunHotTopicSummaryRequestStepForCustomSummaryStyleConfig getStepForCustomSummaryStyleConfig() {
        return this.stepForCustomSummaryStyleConfig;
    }

    public RunHotTopicSummaryRequest setTopicIds(java.util.List<String> topicIds) {
        this.topicIds = topicIds;
        return this;
    }
    public java.util.List<String> getTopicIds() {
        return this.topicIds;
    }

    public static class RunHotTopicSummaryRequestStepForCustomSummaryStyleConfig extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("summaryImageCount")
        public Integer summaryImageCount;

        /**
         * <strong>example:</strong>
         * <p>qwen-max</p>
         */
        @NameInMap("summaryModel")
        public String summaryModel;

        /**
         * <strong>example:</strong>
         * <p>xxxx</p>
         */
        @NameInMap("summaryPrompt")
        public String summaryPrompt;

        public static RunHotTopicSummaryRequestStepForCustomSummaryStyleConfig build(java.util.Map<String, ?> map) throws Exception {
            RunHotTopicSummaryRequestStepForCustomSummaryStyleConfig self = new RunHotTopicSummaryRequestStepForCustomSummaryStyleConfig();
            return TeaModel.build(map, self);
        }

        public RunHotTopicSummaryRequestStepForCustomSummaryStyleConfig setSummaryImageCount(Integer summaryImageCount) {
            this.summaryImageCount = summaryImageCount;
            return this;
        }
        public Integer getSummaryImageCount() {
            return this.summaryImageCount;
        }

        public RunHotTopicSummaryRequestStepForCustomSummaryStyleConfig setSummaryModel(String summaryModel) {
            this.summaryModel = summaryModel;
            return this;
        }
        public String getSummaryModel() {
            return this.summaryModel;
        }

        public RunHotTopicSummaryRequestStepForCustomSummaryStyleConfig setSummaryPrompt(String summaryPrompt) {
            this.summaryPrompt = summaryPrompt;
            return this;
        }
        public String getSummaryPrompt() {
            return this.summaryPrompt;
        }

    }

}
