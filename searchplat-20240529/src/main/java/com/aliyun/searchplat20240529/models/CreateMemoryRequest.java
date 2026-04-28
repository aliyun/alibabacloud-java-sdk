// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchplat20240529.models;

import com.aliyun.tea.*;

public class CreateMemoryRequest extends TeaModel {
    @NameInMap("agent_id")
    public String agentId;

    @NameInMap("enhancements")
    public java.util.Map<String, ?> enhancements;

    @NameInMap("messages")
    public Object messages;

    @NameInMap("run_id")
    public String runId;

    @NameInMap("user_id")
    public String userId;

    public static CreateMemoryRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMemoryRequest self = new CreateMemoryRequest();
        return TeaModel.build(map, self);
    }

    public CreateMemoryRequest setAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }
    public String getAgentId() {
        return this.agentId;
    }

    public CreateMemoryRequest setEnhancements(java.util.Map<String, ?> enhancements) {
        this.enhancements = enhancements;
        return this;
    }
    public java.util.Map<String, ?> getEnhancements() {
        return this.enhancements;
    }

    public CreateMemoryRequest setMessages(Object messages) {
        this.messages = messages;
        return this;
    }
    public Object getMessages() {
        return this.messages;
    }

    public CreateMemoryRequest setRunId(String runId) {
        this.runId = runId;
        return this;
    }
    public String getRunId() {
        return this.runId;
    }

    public CreateMemoryRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
