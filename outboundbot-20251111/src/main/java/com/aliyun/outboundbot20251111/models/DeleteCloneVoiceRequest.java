// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20251111.models;

import com.aliyun.tea.*;

public class DeleteCloneVoiceRequest extends TeaModel {
    /**
     * <p>The UUID of the cloned voice.</p>
     * 
     * <strong>example:</strong>
     * <p>4f9a8e2b-6c1d-4a7e-9b3f-2d5c8a1e7b15</p>
     */
    @NameInMap("CloneVoiceId")
    public String cloneVoiceId;

    /**
     * <p>The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4f9a8e2b-6c1d-4a7e-9b3f-2d5c8a1e7b04</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static DeleteCloneVoiceRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteCloneVoiceRequest self = new DeleteCloneVoiceRequest();
        return TeaModel.build(map, self);
    }

    public DeleteCloneVoiceRequest setCloneVoiceId(String cloneVoiceId) {
        this.cloneVoiceId = cloneVoiceId;
        return this;
    }
    public String getCloneVoiceId() {
        return this.cloneVoiceId;
    }

    public DeleteCloneVoiceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
