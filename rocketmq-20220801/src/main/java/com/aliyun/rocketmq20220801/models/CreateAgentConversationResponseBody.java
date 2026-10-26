// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class CreateAgentConversationResponseBody extends TeaModel {
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
     * <p>running</p>
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
     * <p>0198c8a91f4d7f01a3c21e98</p>
     */
    @NameInMap("runId")
    public String runId;

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
     * <p>2026-08-19T12:00:00.000Z</p>
     */
    @NameInMap("updatedAt")
    public String updatedAt;

    public static CreateAgentConversationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAgentConversationResponseBody self = new CreateAgentConversationResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAgentConversationResponseBody setConversationId(String conversationId) {
        this.conversationId = conversationId;
        return this;
    }
    public String getConversationId() {
        return this.conversationId;
    }

    public CreateAgentConversationResponseBody setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public String getCreatedAt() {
        return this.createdAt;
    }

    public CreateAgentConversationResponseBody setCurrentRunStatus(String currentRunStatus) {
        this.currentRunStatus = currentRunStatus;
        return this;
    }
    public String getCurrentRunStatus() {
        return this.currentRunStatus;
    }

    public CreateAgentConversationResponseBody setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public CreateAgentConversationResponseBody setRunId(String runId) {
        this.runId = runId;
        return this;
    }
    public String getRunId() {
        return this.runId;
    }

    public CreateAgentConversationResponseBody setScenarioId(String scenarioId) {
        this.scenarioId = scenarioId;
        return this;
    }
    public String getScenarioId() {
        return this.scenarioId;
    }

    public CreateAgentConversationResponseBody setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public CreateAgentConversationResponseBody setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    public String getUpdatedAt() {
        return this.updatedAt;
    }

}
