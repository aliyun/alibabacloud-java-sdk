// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20251111.models;

import com.aliyun.tea.*;

public class CreateVoiceAccessProfileShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>af81a389-91f0-4157-8d82-720edd02b66a</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>VOLC</p>
     */
    @NameInMap("NlsEngine")
    public String nlsEngine;

    @NameInMap("Profile")
    public String profileShrink;

    public static CreateVoiceAccessProfileShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateVoiceAccessProfileShrinkRequest self = new CreateVoiceAccessProfileShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateVoiceAccessProfileShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateVoiceAccessProfileShrinkRequest setNlsEngine(String nlsEngine) {
        this.nlsEngine = nlsEngine;
        return this;
    }
    public String getNlsEngine() {
        return this.nlsEngine;
    }

    public CreateVoiceAccessProfileShrinkRequest setProfileShrink(String profileShrink) {
        this.profileShrink = profileShrink;
        return this;
    }
    public String getProfileShrink() {
        return this.profileShrink;
    }

}
