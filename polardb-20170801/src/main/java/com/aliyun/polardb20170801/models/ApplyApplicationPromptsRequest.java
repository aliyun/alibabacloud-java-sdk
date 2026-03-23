// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ApplyApplicationPromptsRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pa-**************</p>
     */
    @NameInMap("ApplicationId")
    public String applicationId;

    /**
     * <strong>example:</strong>
     * <p>papt-************</p>
     */
    @NameInMap("DisabledPromptIds")
    public java.util.List<String> disabledPromptIds;

    /**
     * <strong>example:</strong>
     * <p>papt-************</p>
     */
    @NameInMap("EnabledPromptIds")
    public java.util.List<String> enabledPromptIds;

    public static ApplyApplicationPromptsRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyApplicationPromptsRequest self = new ApplyApplicationPromptsRequest();
        return TeaModel.build(map, self);
    }

    public ApplyApplicationPromptsRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public ApplyApplicationPromptsRequest setDisabledPromptIds(java.util.List<String> disabledPromptIds) {
        this.disabledPromptIds = disabledPromptIds;
        return this;
    }
    public java.util.List<String> getDisabledPromptIds() {
        return this.disabledPromptIds;
    }

    public ApplyApplicationPromptsRequest setEnabledPromptIds(java.util.List<String> enabledPromptIds) {
        this.enabledPromptIds = enabledPromptIds;
        return this;
    }
    public java.util.List<String> getEnabledPromptIds() {
        return this.enabledPromptIds;
    }

}
