// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20251111.models;

import com.aliyun.tea.*;

public class CreateVoiceAccessProfileShrinkRequest extends TeaModel {
    /**
     * <p>The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4f9a8e2b-6c1d-4a7e-9b3f-2d5c8a1e7b04</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The voice service provider.
     * BAILIAN: Bailian.
     * VOLC: Doubao.
     * IFLYTEK: iFLYTEK.
     * TENCENT: Tencent.</p>
     * 
     * <strong>example:</strong>
     * <p>BAILIAN</p>
     */
    @NameInMap("NlsEngine")
    public String nlsEngine;

    /**
     * <p>The provider configuration information.</p>
     */
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
