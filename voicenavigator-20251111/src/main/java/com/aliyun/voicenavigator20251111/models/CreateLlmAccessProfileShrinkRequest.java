// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20251111.models;

import com.aliyun.tea.*;

public class CreateLlmAccessProfileShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>af81a389-91f0-4157-8d82-720edd02b66a</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Profile")
    public String profileShrink;

    public static CreateLlmAccessProfileShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLlmAccessProfileShrinkRequest self = new CreateLlmAccessProfileShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateLlmAccessProfileShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateLlmAccessProfileShrinkRequest setProfileShrink(String profileShrink) {
        this.profileShrink = profileShrink;
        return this;
    }
    public String getProfileShrink() {
        return this.profileShrink;
    }

}
