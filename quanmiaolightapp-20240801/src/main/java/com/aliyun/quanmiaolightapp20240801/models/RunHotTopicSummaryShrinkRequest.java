// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quanmiaolightapp20240801.models;

import com.aliyun.tea.*;

public class RunHotTopicSummaryShrinkRequest extends TeaModel {
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
    public String stepForCustomSummaryStyleConfigShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxxx</p>
     */
    @NameInMap("topicIds")
    public String topicIdsShrink;

    public static RunHotTopicSummaryShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        RunHotTopicSummaryShrinkRequest self = new RunHotTopicSummaryShrinkRequest();
        return TeaModel.build(map, self);
    }

    public RunHotTopicSummaryShrinkRequest setHotTopicVersion(String hotTopicVersion) {
        this.hotTopicVersion = hotTopicVersion;
        return this;
    }
    public String getHotTopicVersion() {
        return this.hotTopicVersion;
    }

    public RunHotTopicSummaryShrinkRequest setStepForCustomSummaryStyleConfigShrink(String stepForCustomSummaryStyleConfigShrink) {
        this.stepForCustomSummaryStyleConfigShrink = stepForCustomSummaryStyleConfigShrink;
        return this;
    }
    public String getStepForCustomSummaryStyleConfigShrink() {
        return this.stepForCustomSummaryStyleConfigShrink;
    }

    public RunHotTopicSummaryShrinkRequest setTopicIdsShrink(String topicIdsShrink) {
        this.topicIdsShrink = topicIdsShrink;
        return this;
    }
    public String getTopicIdsShrink() {
        return this.topicIdsShrink;
    }

}
