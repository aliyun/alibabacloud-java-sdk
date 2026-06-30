// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.realtranslationagent20260622.models;

import com.aliyun.tea.*;

public class SubmitTranslationTaskShrinkRequest extends TeaModel {
    @NameInMap("APIKey")
    public String APIKey;

    @NameInMap("BaseTaskId")
    public String baseTaskId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Config")
    public String configShrink;

    @NameInMap("CustomTerms")
    public String customTermsShrink;

    @NameInMap("TaskId")
    public String taskId;

    public static SubmitTranslationTaskShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitTranslationTaskShrinkRequest self = new SubmitTranslationTaskShrinkRequest();
        return TeaModel.build(map, self);
    }

    public SubmitTranslationTaskShrinkRequest setAPIKey(String APIKey) {
        this.APIKey = APIKey;
        return this;
    }
    public String getAPIKey() {
        return this.APIKey;
    }

    public SubmitTranslationTaskShrinkRequest setBaseTaskId(String baseTaskId) {
        this.baseTaskId = baseTaskId;
        return this;
    }
    public String getBaseTaskId() {
        return this.baseTaskId;
    }

    public SubmitTranslationTaskShrinkRequest setConfigShrink(String configShrink) {
        this.configShrink = configShrink;
        return this;
    }
    public String getConfigShrink() {
        return this.configShrink;
    }

    public SubmitTranslationTaskShrinkRequest setCustomTermsShrink(String customTermsShrink) {
        this.customTermsShrink = customTermsShrink;
        return this;
    }
    public String getCustomTermsShrink() {
        return this.customTermsShrink;
    }

    public SubmitTranslationTaskShrinkRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
