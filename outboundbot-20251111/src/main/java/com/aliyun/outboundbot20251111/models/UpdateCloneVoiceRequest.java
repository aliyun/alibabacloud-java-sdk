// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20251111.models;

import com.aliyun.tea.*;

public class UpdateCloneVoiceRequest extends TeaModel {
    /**
     * <p>克隆音色ID</p>
     * 
     * <strong>example:</strong>
     * <p>4f9a8e2b-6c1d-4a7e-9b3f-2d5c8a1e7b15</p>
     */
    @NameInMap("CloneVoiceId")
    public String cloneVoiceId;

    /**
     * <p>实例ID</p>
     * 
     * <strong>example:</strong>
     * <p>4f9a8e2b-6c1d-4a7e-9b3f-2d5c8a1e7b04</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>名称</p>
     * 
     * <strong>example:</strong>
     * <p>测试克隆音</p>
     */
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
