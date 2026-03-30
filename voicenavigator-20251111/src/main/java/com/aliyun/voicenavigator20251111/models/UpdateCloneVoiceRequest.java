// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20251111.models;

import com.aliyun.tea.*;

public class UpdateCloneVoiceRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>8ee1160a-6999-478f-8df6-f33ef21f27d5</p>
     */
    @NameInMap("CloneVoiceId")
    public String cloneVoiceId;

    /**
     * <strong>example:</strong>
     * <p>0099b75d-60fd-4c63-8541-7fbba0ae6bb0</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Name")
    public String name;

    public static UpdateCloneVoiceRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateCloneVoiceRequest self = new UpdateCloneVoiceRequest();
        return TeaModel.build(map, self);
    }

    public UpdateCloneVoiceRequest setCloneVoiceId(String cloneVoiceId) {
        this.cloneVoiceId = cloneVoiceId;
        return this;
    }
    public String getCloneVoiceId() {
        return this.cloneVoiceId;
    }

    public UpdateCloneVoiceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateCloneVoiceRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
