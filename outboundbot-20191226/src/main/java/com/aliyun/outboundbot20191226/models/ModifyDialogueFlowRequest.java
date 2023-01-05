// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class ModifyDialogueFlowRequest extends TeaModel {
    @NameInMap("DialogueFlowDefinition")
    public String dialogueFlowDefinition;

    @NameInMap("DialogueFlowId")
    public String dialogueFlowId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("IsDrafted")
    public Boolean isDrafted;

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
