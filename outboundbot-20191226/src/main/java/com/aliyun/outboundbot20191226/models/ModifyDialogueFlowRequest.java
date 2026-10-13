// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class ModifyDialogueFlowRequest extends TeaModel {
    /**
     * <p>The dialog flow data.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;transitions&quot;:[{&quot;id&quot;:&quot;a91c4023&quot;,&quot;index&quot;:1,&quot;source&quot;:&quot;cc31e02b&quot;,&quot;sourceAnchor&quot;:0,&quot;target&quot;:&quot;946045be&quot;,&quot;targetAnchor&quot;:0}],&quot;nodes&quot;:[{&quot;collectedNumberEnabled&quot;:false,&quot;content&quot;:{&quot;branches&quot;:[{&quot;branchId&quot;:&quot;f5450420-09ab-11ea-b107-e9059c6a79d8&quot;,&quot;branchName&quot;:&quot;Initiate conversation&quot;}]},&quot;coordinates&quot;:{&quot;x&quot;:180,&quot;y&quot;:134},&quot;id&quot;:&quot;cc31e02b&quot;,&quot;index&quot;:0,&quot;interruptible&quot;:false,&quot;nodeIndex&quot;:0,&quot;shape&quot;:&quot;start-html&quot;,&quot;size&quot;:&quot;170<em>34&quot;,&quot;type&quot;:&quot;start&quot;,&quot;x&quot;:180,&quot;y&quot;:134},{&quot;collectedNumberEnabled&quot;:false,&quot;content&quot;:{&quot;actionParams&quot;:&quot;&quot;,&quot;action&quot;:&quot;Hangup&quot;},&quot;coordinates&quot;:{&quot;x&quot;:487.65625,&quot;y&quot;:155},&quot;id&quot;:&quot;946045be&quot;,&quot;index&quot;:2,&quot;interruptible&quot;:false,&quot;labels&quot;:[],&quot;name&quot;:&quot;Function node&quot;,&quot;nodeIndex&quot;:1,&quot;questions&quot;:[&quot;OK, we have noted your situation. We will arrange a senior consultant to provide you with a more detailed study abroad assessment and academic guidance. Please stay available for the call.&quot;],&quot;script&quot;:&quot;OK, we have noted your situation. We will arrange a senior consultant to provide you with a more detailed study abroad assessment and academic guidance. Please stay available for the call.&quot;,&quot;shape&quot;:&quot;function-html&quot;,&quot;size&quot;:&quot;170</em>34&quot;,&quot;type&quot;:&quot;transfer&quot;,&quot;x&quot;:500,&quot;y&quot;:182}]}</p>
     */
    @NameInMap("DialogueFlowDefinition")
    public String dialogueFlowDefinition;

    /**
     * <p>The dialog flow ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>390515b5-6115-4ccf-83e2-52d5bfaf2ddf</p>
     */
    @NameInMap("DialogueFlowId")
    public String dialogueFlowId;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>da37319b-6c83-4268-9f19-814aed62e401</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>Specifies whether the dialog flow is in draft state.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsDrafted")
    public Boolean isDrafted;

    /**
     * <p>The script ID.</p>
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
