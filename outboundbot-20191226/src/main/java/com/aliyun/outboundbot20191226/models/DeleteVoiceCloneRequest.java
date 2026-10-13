// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class DeleteVoiceCloneRequest extends TeaModel {
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
     * <p>The ID of the cloned voice to delete.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cosyvoice-v2-067dc4b2e9d34dbeb5de20b5b093d1e3</p>
     */
    @NameInMap("VoiceId")
    public String voiceId;

    public static DeleteVoiceCloneRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteVoiceCloneRequest self = new DeleteVoiceCloneRequest();
        return TeaModel.build(map, self);
    }

    public DeleteVoiceCloneRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DeleteVoiceCloneRequest setVoiceId(String voiceId) {
        this.voiceId = voiceId;
        return this;
    }
    public String getVoiceId() {
        return this.voiceId;
    }

}
