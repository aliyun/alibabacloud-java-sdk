// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class GetAgentConversationResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>0198c8a91f4d7f01a3c21e97</p>
     */
    @NameInMap("conversationId")
    public String conversationId;

    /**
     * <strong>example:</strong>
     * <p>2026-08-19T12:00:00.000Z</p>
     */
    @NameInMap("createdAt")
    public String createdAt;

    /**
     * <strong>example:</strong>
     * <p>waiting_input</p>
     */
    @NameInMap("currentRunStatus")
    public String currentRunStatus;

    /**
     * <strong>example:</strong>
     * <p>0198c8a91f4d7f01a3c21e97</p>
     */
    @NameInMap("id")
    public String id;

    /**
     * <strong>example:</strong>
     * <p>{&quot;toolUseId&quot;:&quot;tool_01&quot;,&quot;tool&quot;:&quot;AskUserQuestion&quot;}</p>
     */
    @NameInMap("pendingTool")
    public Object pendingTool;

    /**
     * <strong>example:</strong>
     * <p>diagnosis</p>
     */
    @NameInMap("scenarioId")
    public String scenarioId;

    /**
     * <strong>example:</strong>
     * <p>消息堆积排查</p>
     */
    @NameInMap("title")
    public String title;

    /**
     * <strong>example:</strong>
     * <p>2026-08-19T12:05:00.000Z</p>
     */
    @NameInMap("updatedAt")
    public String updatedAt;

    public static GetAgentConversationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAgentConversationResponseBody self = new GetAgentConversationResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAgentConversationResponseBody setConversationId(String conversationId) {
        this.conversationId = conversationId;
        return this;
    }
    public String getConversationId() {
        return this.conversationId;
    }

    public GetAgentConversationResponseBody setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public String getCreatedAt() {
        return this.createdAt;
    }

    public GetAgentConversationResponseBody setCurrentRunStatus(String currentRunStatus) {
        this.currentRunStatus = currentRunStatus;
        return this;
    }
    public String getCurrentRunStatus() {
        return this.currentRunStatus;
    }

    public GetAgentConversationResponseBody setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public GetAgentConversationResponseBody setPendingTool(Object pendingTool) {
        this.pendingTool = pendingTool;
        return this;
    }
    public Object getPendingTool() {
        return this.pendingTool;
    }

    public GetAgentConversationResponseBody setScenarioId(String scenarioId) {
        this.scenarioId = scenarioId;
        return this;
    }
    public String getScenarioId() {
        return this.scenarioId;
    }

    public GetAgentConversationResponseBody setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public GetAgentConversationResponseBody setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    public String getUpdatedAt() {
        return this.updatedAt;
    }

}
