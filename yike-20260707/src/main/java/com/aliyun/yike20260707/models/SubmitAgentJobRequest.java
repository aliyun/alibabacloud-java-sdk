// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260707.models;

import com.aliyun.tea.*;

public class SubmitAgentJobRequest extends TeaModel {
    /**
     * <p>The large language model (LLM) used to execute the agent task.</p>
     * 
     * <strong>example:</strong>
     * <p>qwen3.7-plus</p>
     */
    @NameInMap("Model")
    public String model;

    /**
     * <p>The callback URL. Currently, only HTTP and HTTPS addresses are supported.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://api.ai-x.vip/callback">https://api.ai-x.vip/callback</a></p>
     */
    @NameInMap("NotifyUrl")
    public String notifyUrl;

    /**
     * <p>The prompt. Defined by the business as needed.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Compare the battle records of Yue Jin and Guan Yu in real history to determine who was stronger</p>
     */
    @NameInMap("Prompt")
    public String prompt;

    /**
     * <p>The skill identifier, provided by the skill provider.</p>
     * 
     * <strong>example:</strong>
     * <p>wf://xxx</p>
     */
    @NameInMap("Skill")
    public String skill;

    /**
     * <p>The custom user data. This value is returned as-is in the callback.</p>
     * 
     * <strong>example:</strong>
     * <p>{“x”: 1}</p>
     */
    @NameInMap("UserData")
    public String userData;

    /**
     * <p>The workspace ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ws_1151222932383236</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static SubmitAgentJobRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitAgentJobRequest self = new SubmitAgentJobRequest();
        return TeaModel.build(map, self);
    }

    public SubmitAgentJobRequest setModel(String model) {
        this.model = model;
        return this;
    }
    public String getModel() {
        return this.model;
    }

    public SubmitAgentJobRequest setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
        return this;
    }
    public String getNotifyUrl() {
        return this.notifyUrl;
    }

    public SubmitAgentJobRequest setPrompt(String prompt) {
        this.prompt = prompt;
        return this;
    }
    public String getPrompt() {
        return this.prompt;
    }

    public SubmitAgentJobRequest setSkill(String skill) {
        this.skill = skill;
        return this;
    }
    public String getSkill() {
        return this.skill;
    }

    public SubmitAgentJobRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

    public SubmitAgentJobRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
