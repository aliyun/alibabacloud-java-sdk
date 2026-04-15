// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20251111.models;

import com.aliyun.tea.*;

public class UpdateLlmAccessProfileShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>af81a389-91f0-4157-8d82-720edd02b66b</p>
     */
    @NameInMap("AccessProfileId")
    public String accessProfileId;

    /**
     * <strong>example:</strong>
     * <p>d74d6290-7cbe-4436-b5d7-014ebb0f4060</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Profile")
    public String profileShrink;

    public static UpdateLlmAccessProfileShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLlmAccessProfileShrinkRequest self = new UpdateLlmAccessProfileShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLlmAccessProfileShrinkRequest setAccessProfileId(String accessProfileId) {
        this.accessProfileId = accessProfileId;
        return this;
    }
    public String getAccessProfileId() {
        return this.accessProfileId;
    }

    public UpdateLlmAccessProfileShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateLlmAccessProfileShrinkRequest setProfileShrink(String profileShrink) {
        this.profileShrink = profileShrink;
        return this;
    }
    public String getProfileShrink() {
        return this.profileShrink;
    }

}
