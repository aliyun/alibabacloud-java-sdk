// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20251111.models;

import com.aliyun.tea.*;

public class DeleteCloneVoiceRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>e48e45dd-e47a-4744-a063-f08cbebb1c5b</p>
     */
    @NameInMap("CloneVoiceId")
    public String cloneVoiceId;

    /**
     * <strong>example:</strong>
     * <p>e48e45dd-e47a-4744-a063-f08cbebb1c5a</p>
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
