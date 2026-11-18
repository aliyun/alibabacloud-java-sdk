// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CreateApplicationPromptRequest extends TeaModel {
    /**
     * <p>The application ID. You must specify an application with <code>ApplicationType</code> set to <code>mem0</code>. You can first call the CreateApplication operation with <code>ApplicationType</code> set to <code>mem0</code> to create an application, and then pass the returned ApplicationId to this operation. This parameter does not apply to other application types such as standard PolarClaw or Supabase.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pa-**************</p>
     */
    @NameInMap("ApplicationId")
    public String applicationId;

    /**
     * <p>The prompt name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>my_prompt</p>
     */
    @NameInMap("PromptName")
    public String promptName;

    /**
     * <p>The prompt type.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>CONVERSATION_SUMMERY
     * SEMANTIC_MEMORY
     * MEMORY_ANSWER_PROMPT
     * USER_MEMORY_EXTRACTION_PROMPT
     * AGENT_MEMORY_EXTRACTION_PROMPT
     * PROCEDURAL_MEMORY_SYSTEM_PROMPT
     * RETRIEVE_NODES_PROMPT
     * EXTRACT_RELATIONS_PROMPT
     * UPDATE_GRAPH_PROMPT
     * DELETE_RELATIONS_SYSTEM_PROMPT</p>
     */
    @NameInMap("PromptType")
    public String promptType;

    /**
     * <p>The prompt content.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>prompt content</p>
     */
    @NameInMap("PromptValue")
    public String promptValue;

    public static CreateApplicationPromptRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateApplicationPromptRequest self = new CreateApplicationPromptRequest();
        return TeaModel.build(map, self);
    }

    public CreateApplicationPromptRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public CreateApplicationPromptRequest setPromptName(String promptName) {
        this.promptName = promptName;
        return this;
    }
    public String getPromptName() {
        return this.promptName;
    }

    public CreateApplicationPromptRequest setPromptType(String promptType) {
        this.promptType = promptType;
        return this;
    }
    public String getPromptType() {
        return this.promptType;
    }

    public CreateApplicationPromptRequest setPromptValue(String promptValue) {
        this.promptValue = promptValue;
        return this;
    }
    public String getPromptValue() {
        return this.promptValue;
    }

}
