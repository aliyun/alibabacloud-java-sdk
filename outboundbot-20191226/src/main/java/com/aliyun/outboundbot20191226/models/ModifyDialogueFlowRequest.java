// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class ModifyDialogueFlowRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DialogueFlowDefinition")
    public String dialogueFlowDefinition;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>390515b5-6115-4ccf-83e2-52d5bfaf2ddf</p>
     */
    @NameInMap("DialogueFlowId")
    public String dialogueFlowId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>da37319b-6c83-4268-9f19-814aed62e401</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsDrafted")
    public Boolean isDrafted;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>b0f35dd1-0337-402e-9c4f-3a6c2426950a</p>
     */
    @NameInMap("ScriptId")
    public String scriptId;

    public static ModifyDialogueFlowRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDialogueFlowRequest self = new ModifyDialogueFlowRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDialogueFlowRequest setDialogueFlowDefinition(String dialogueFlowDefinition) {
        this.dialogueFlowDefinition = dialogueFlowDefinition;
        return this;
    }
    public String getDialogueFlowDefinition() {
        return this.dialogueFlowDefinition;
    }

    public ModifyDialogueFlowRequest setDialogueFlowId(String dialogueFlowId) {
        this.dialogueFlowId = dialogueFlowId;
        return this;
    }
    public String getDialogueFlowId() {
        return this.dialogueFlowId;
    }

    public ModifyDialogueFlowRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyDialogueFlowRequest setIsDrafted(Boolean isDrafted) {
        this.isDrafted = isDrafted;
        return this;
    }
    public Boolean getIsDrafted() {
        return this.isDrafted;
    }

    public ModifyDialogueFlowRequest setScriptId(String scriptId) {
        this.scriptId = scriptId;
        return this;
    }
    public String getScriptId() {
        return this.scriptId;
    }

}
