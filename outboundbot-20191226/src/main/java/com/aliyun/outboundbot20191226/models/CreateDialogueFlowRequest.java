// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class CreateDialogueFlowRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>MainFlow</p>
     */
    @NameInMap("DialogueFlowType")
    public String dialogueFlowType;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DialogueName")
    public String dialogueName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>174952ab-9825-4cc9-a5e2-de82d7fa4cdd</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>d0bf93dd-1a54-4f00-819e-c75502d38681</p>
     */
    @NameInMap("ScriptId")
    public String scriptId;

    public static CreateDialogueFlowRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDialogueFlowRequest self = new CreateDialogueFlowRequest();
        return TeaModel.build(map, self);
    }

    public CreateDialogueFlowRequest setDialogueFlowType(String dialogueFlowType) {
        this.dialogueFlowType = dialogueFlowType;
        return this;
    }
    public String getDialogueFlowType() {
        return this.dialogueFlowType;
    }

    public CreateDialogueFlowRequest setDialogueName(String dialogueName) {
        this.dialogueName = dialogueName;
        return this;
    }
    public String getDialogueName() {
        return this.dialogueName;
    }

    public CreateDialogueFlowRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateDialogueFlowRequest setScriptId(String scriptId) {
        this.scriptId = scriptId;
        return this;
    }
    public String getScriptId() {
        return this.scriptId;
    }

}
