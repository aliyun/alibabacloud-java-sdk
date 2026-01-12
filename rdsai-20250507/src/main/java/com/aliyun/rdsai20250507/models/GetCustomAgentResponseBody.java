// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class GetCustomAgentResponseBody extends TeaModel {
    /**
     * <p>The creation time of the agent.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-06-04T02:25:43Z</p>
     */
    @NameInMap("CreatedAt")
    public String createdAt;

    /**
     * <p>Indicates whether tools are enabled.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableTools")
    public Boolean enableTools;

    /**
     * <p>The ID of the backup set.</p>
     * 
     * <strong>example:</strong>
     * <p>17053</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>The name of the dedicated agent.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>FE9C65D7-930F-57A5-A207-8C396329241C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The system prompts.</p>
     */
    @NameInMap("SystemPrompt")
    public String systemPrompt;

    /**
     * <p>The details of the tools.</p>
     */
    @NameInMap("Tools")
    public java.util.List<String> tools;

    /**
     * <p>The modification time of the agent.</p>
     * 
     * <strong>example:</strong>
     * <p>2020-11-27 16:02:28</p>
     */
    @NameInMap("UpdatedAt")
    public String updatedAt;

    public static GetCustomAgentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCustomAgentResponseBody self = new GetCustomAgentResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCustomAgentResponseBody setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public String getCreatedAt() {
        return this.createdAt;
    }

    public GetCustomAgentResponseBody setEnableTools(Boolean enableTools) {
        this.enableTools = enableTools;
        return this;
    }
    public Boolean getEnableTools() {
        return this.enableTools;
    }

    public GetCustomAgentResponseBody setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public GetCustomAgentResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetCustomAgentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetCustomAgentResponseBody setSystemPrompt(String systemPrompt) {
        this.systemPrompt = systemPrompt;
        return this;
    }
    public String getSystemPrompt() {
        return this.systemPrompt;
    }

    public GetCustomAgentResponseBody setTools(java.util.List<String> tools) {
        this.tools = tools;
        return this;
    }
    public java.util.List<String> getTools() {
        return this.tools;
    }

    public GetCustomAgentResponseBody setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    public String getUpdatedAt() {
        return this.updatedAt;
    }

}
