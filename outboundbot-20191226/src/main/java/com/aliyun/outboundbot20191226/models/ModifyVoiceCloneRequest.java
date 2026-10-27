// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class ModifyVoiceCloneRequest extends TeaModel {
    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>af81a389-91f0-4157-8d82-720edd02b66a</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The status of the voice. Note: For a newly created voice, you must call the ModifyVoiceClone operation and set Status to Enabled before it can be used.</p>
     * 
     * <strong>example:</strong>
     * <p>Enabled</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The ID of the cloned voice to modify.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cosyvoice-v2-067dc4b2e9d34dbeb5de20b5b093d1e3</p>
     */
    @NameInMap("VoiceId")
    public String voiceId;

    /**
     * <p>The name of the voice.</p>
     * 
     * <strong>example:</strong>
     * <p>Cloned voice 1</p>
     */
    @NameInMap("VoiceName")
    public String voiceName;

    public static ModifyVoiceCloneRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyVoiceCloneRequest self = new ModifyVoiceCloneRequest();
        return TeaModel.build(map, self);
    }

    public ModifyVoiceCloneRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyVoiceCloneRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ModifyVoiceCloneRequest setVoiceId(String voiceId) {
        this.voiceId = voiceId;
        return this;
    }
    public String getVoiceId() {
        return this.voiceId;
    }

    public ModifyVoiceCloneRequest setVoiceName(String voiceName) {
        this.voiceName = voiceName;
        return this;
    }
    public String getVoiceName() {
        return this.voiceName;
    }

}
