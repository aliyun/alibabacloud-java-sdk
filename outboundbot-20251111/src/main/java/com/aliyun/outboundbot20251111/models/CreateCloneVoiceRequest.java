// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20251111.models;

import com.aliyun.tea.*;

public class CreateCloneVoiceRequest extends TeaModel {
    /**
     * <p>The file upload identifier.</p>
     * 
     * <strong>example:</strong>
     * <p>voice_clone/upload/d25ace5f-c8c6-45af-a5b1-8fd6b8595747/019FDB17-4901-17A9-99D6-27B77BC047C0_record.wav</p>
     */
    @NameInMap("FileKey")
    public String fileKey;

    /**
     * <p>The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4f9a8e2b-6c1d-4a7e-9b3f-2d5c8a1e7b04</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The model name.</p>
     * 
     * <strong>example:</strong>
     * <p>CosyVoice</p>
     */
    @NameInMap("Model")
    public String model;

    public static CreateCloneVoiceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCloneVoiceRequest self = new CreateCloneVoiceRequest();
        return TeaModel.build(map, self);
    }

    public CreateCloneVoiceRequest setFileKey(String fileKey) {
        this.fileKey = fileKey;
        return this;
    }
    public String getFileKey() {
        return this.fileKey;
    }

    public CreateCloneVoiceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateCloneVoiceRequest setModel(String model) {
        this.model = model;
        return this;
    }
    public String getModel() {
        return this.model;
    }

}
