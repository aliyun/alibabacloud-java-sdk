// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ApplyApplicationPromptsRequest extends TeaModel {
    /**
     * <p>The application ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pa-**************</p>
     */
    @NameInMap("ApplicationId")
    public String applicationId;

    /**
     * <p>The list of prompt IDs to disable. You must provide a non-empty list for at least one of EnabledPromptIds and DisabledPromptIds. Otherwise, the InvalidApplicationPromptId.Malformed error is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;papt-************&quot;]</p>
     */
    @NameInMap("DisabledPromptIds")
    public java.util.List<String> disabledPromptIds;

    /**
     * <p>The list of prompt IDs to enable. You must provide a non-empty list for at least one of EnabledPromptIds and DisabledPromptIds. Otherwise, the InvalidApplicationPromptId.Malformed error is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;papt-************&quot;]</p>
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
