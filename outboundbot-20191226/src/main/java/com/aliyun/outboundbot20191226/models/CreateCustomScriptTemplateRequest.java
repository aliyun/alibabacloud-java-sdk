// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class CreateCustomScriptTemplateRequest extends TeaModel {
    /**
     * <p>The description of the custom scenario.</p>
     * 
     * <strong>example:</strong>
     * <p>This is a large language model bot</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0ec0c897-b92c-40e4-9ad7-e6e4f5ce13bb</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The label descriptions in JSON array format.</p>
     * 
     * <strong>example:</strong>
     * <p>[{\&quot;name\&quot;:\&quot;Delivered\&quot;,\&quot;description\&quot;:\&quot;Whether the purchased home appliance has been delivered\&quot;,\&quot;valueList\&quot;:\&quot;[\\\&quot;Yes\\\&quot;,\\\&quot;No\\\&quot;]\&quot;},{\&quot;name\&quot;:\&quot;On-site Appointment Time\&quot;,\&quot;description\&quot;:\&quot;Collect the customer\&quot;s expected on-site installation time\&quot;,\&quot;valueList\&quot;:\&quot;[]\&quot;}]</p>
     */
    @NameInMap("LabelsJson")
    public String labelsJson;

    /**
     * <p>The ID of the model used to create the template.</p>
     * 
     * <strong>example:</strong>
     * <p>model_002</p>
     */
    @NameInMap("Model")
    public String model;

    /**
     * <p>The name of the custom scenario.</p>
     * 
     * <strong>example:</strong>
     * <p>Test scenario</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The prompt in professional mode.</p>
     * 
     * <strong>example:</strong>
     * <p>\nName: Annie \nRole: Game Promoter\nBackground: Promote the latest benefit activities to players over the phone, ensuring that every player stays informed and enjoys the game.\nSkills: As a game customer service representative, recommend time-limited game benefit activities to users, highlight the benefits, and explain the participation process.\nConstraints: You must remember that you are Annie,</p>
     */
    @NameInMap("Prompt")
    public String prompt;

    /**
     * <p>The agent configuration in JSON format.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;name&quot;:&quot;Xiao X&quot;,&quot;gender&quot;:&quot;Male&quot;,&quot;age&quot;:18,&quot;role&quot;:&quot;Game Promoter&quot;,&quot;communicationStyle&quot;:[&quot;Friendly&quot;],&quot;goals&quot;:&quot;Hello&quot;,&quot;background&quot;:&quot;Not very good&quot;,&quot;openingPrompt&quot;:&quot;Hello, I am XXX&quot;}</p>
     */
    @NameInMap("PromptJson")
    public String promptJson;

    /**
     * <p>The script ID.</p>
     * 
     * <strong>example:</strong>
     * <p>43972417-0657-452a-81c2-c59d8245a9b2</p>
     */
    @NameInMap("ScriptId")
    public String scriptId;

    public static CreateCustomScriptTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCustomScriptTemplateRequest self = new CreateCustomScriptTemplateRequest();
        return TeaModel.build(map, self);
    }

    public CreateCustomScriptTemplateRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateCustomScriptTemplateRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateCustomScriptTemplateRequest setLabelsJson(String labelsJson) {
        this.labelsJson = labelsJson;
        return this;
    }
    public String getLabelsJson() {
        return this.labelsJson;
    }

    public CreateCustomScriptTemplateRequest setModel(String model) {
        this.model = model;
        return this;
    }
    public String getModel() {
        return this.model;
    }

    public CreateCustomScriptTemplateRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateCustomScriptTemplateRequest setPrompt(String prompt) {
        this.prompt = prompt;
        return this;
    }
    public String getPrompt() {
        return this.prompt;
    }

    public CreateCustomScriptTemplateRequest setPromptJson(String promptJson) {
        this.promptJson = promptJson;
        return this;
    }
    public String getPromptJson() {
        return this.promptJson;
    }

    public CreateCustomScriptTemplateRequest setScriptId(String scriptId) {
        this.scriptId = scriptId;
        return this;
    }
    public String getScriptId() {
        return this.scriptId;
    }

}
