// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20251111.models;

import com.aliyun.tea.*;

public class UpdateVoiceAccessProfileShrinkRequest extends TeaModel {
    /**
     * <p>接入配置ID</p>
     * 
     * <strong>example:</strong>
     * <p>4f9a8e2b-6c1d-4a7e-9b3f-2d5c8a1e7b15</p>
     */
    @NameInMap("AccessProfileId")
    public String accessProfileId;

    /**
     * <p>实例ID</p>
     * 
     * <strong>example:</strong>
     * <p>4f9a8e2b-6c1d-4a7e-9b3f-2d5c8a1e7b04</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>目前支持IFLYTEK、VOLC</p>
     * 
     * <strong>example:</strong>
     * <p>BAILIAN</p>
     */
    @NameInMap("NlsEngine")
    public String nlsEngine;

    /**
     * <p>配置</p>
     */
    @NameInMap("Profile")
    public String profileShrink;

    public static UpdateVoiceAccessProfileShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateVoiceAccessProfileShrinkRequest self = new UpdateVoiceAccessProfileShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateVoiceAccessProfileShrinkRequest setAccessProfileId(String accessProfileId) {
        this.accessProfileId = accessProfileId;
        return this;
    }
    public String getAccessProfileId() {
        return this.accessProfileId;
    }

    public UpdateVoiceAccessProfileShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateVoiceAccessProfileShrinkRequest setNlsEngine(String nlsEngine) {
        this.nlsEngine = nlsEngine;
        return this;
    }
    public String getNlsEngine() {
        return this.nlsEngine;
    }

    public UpdateVoiceAccessProfileShrinkRequest setProfileShrink(String profileShrink) {
        this.profileShrink = profileShrink;
        return this;
    }
    public String getProfileShrink() {
        return this.profileShrink;
    }

}
