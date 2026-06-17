// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ApplyApplicationPromptsShrinkRequest extends TeaModel {
    /**
     * <p>The ID of the application.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pa-**************</p>
     */
    @NameInMap("ApplicationId")
    public String applicationId;

    /**
     * <p>An array of prompt IDs to disable.</p>
     * 
     * <strong>example:</strong>
     * <p>papt-************</p>
     */
    @NameInMap("DisabledPromptIds")
    public String disabledPromptIdsShrink;

    /**
     * <p>An array of prompt IDs to enable.</p>
     * 
     * <strong>example:</strong>
     * <p>papt-************</p>
     */
    @NameInMap("EnabledPromptIds")
    public String enabledPromptIdsShrink;

    public static ApplyApplicationPromptsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyApplicationPromptsShrinkRequest self = new ApplyApplicationPromptsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ApplyApplicationPromptsShrinkRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public ApplyApplicationPromptsShrinkRequest setDisabledPromptIdsShrink(String disabledPromptIdsShrink) {
        this.disabledPromptIdsShrink = disabledPromptIdsShrink;
        return this;
    }
    public String getDisabledPromptIdsShrink() {
        return this.disabledPromptIdsShrink;
    }

    public ApplyApplicationPromptsShrinkRequest setEnabledPromptIdsShrink(String enabledPromptIdsShrink) {
        this.enabledPromptIdsShrink = enabledPromptIdsShrink;
        return this;
    }
    public String getEnabledPromptIdsShrink() {
        return this.enabledPromptIdsShrink;
    }

}
