// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class DeleteDialogueFlowRequest extends TeaModel {
    @NameInMap("DialogueFlowId")
    public String dialogueFlowId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("ScriptId")
    public String scriptId;

    public static DeleteDialogueFlowRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDialogueFlowRequest self = new DeleteDialogueFlowRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDialogueFlowRequest setDialogueFlowId(String dialogueFlowId) {
        this.dialogueFlowId = dialogueFlowId;
        return this;
    }
    public String getDialogueFlowId() {
        return this.dialogueFlowId;
    }

    public DeleteDialogueFlowRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DeleteDialogueFlowRequest setScriptId(String scriptId) {
        this.scriptId = scriptId;
        return this;
    }
    public String getScriptId() {
        return this.scriptId;
    }

}
