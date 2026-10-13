// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class CreateVoiceCloneRequest extends TeaModel {
    /**
     * <p>The Folder field returned after a file is uploaded by calling the GetJobDataUploadParams operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>voiceclone/recordings/demo.mp3</p>
     */
    @NameInMap("FileId")
    public String fileId;

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
     * <p>The model used for voice cloning.</p>
     * 
     * <strong>example:</strong>
     * <p>cosyvoice-v3.5-flash</p>
     */
    @NameInMap("Model")
    public String model;

    /**
     * <p>The name of the cloned voice. The names of enabled voices within the same instance must be unique.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Cloned voice 1</p>
     */
    @NameInMap("VoiceName")
    public String voiceName;

    public static CreateVoiceCloneRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateVoiceCloneRequest self = new CreateVoiceCloneRequest();
        return TeaModel.build(map, self);
    }

    public CreateVoiceCloneRequest setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

    public CreateVoiceCloneRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateVoiceCloneRequest setModel(String model) {
        this.model = model;
        return this;
    }
    public String getModel() {
        return this.model;
    }

    public CreateVoiceCloneRequest setVoiceName(String voiceName) {
        this.voiceName = voiceName;
        return this;
    }
    public String getVoiceName() {
        return this.voiceName;
    }

}
