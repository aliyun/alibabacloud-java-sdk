// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20251111.models;

import com.aliyun.tea.*;

public class CreateCloneVoiceRequest extends TeaModel {
    /**
     * <p>The path of the uploaded file.</p>
     * 
     * <strong>example:</strong>
     * <p>voice_clone/VoiceCloneUnitTest.wav</p>
     */
    @NameInMap("FileKey")
    public String fileKey;

    /**
     * <p>The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>da37319b-6c83-4268-9f19-814aed62e401</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The voice cloning model.</p>
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
