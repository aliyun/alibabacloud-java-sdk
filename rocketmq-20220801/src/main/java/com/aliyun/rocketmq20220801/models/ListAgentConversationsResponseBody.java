// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class ListAgentConversationsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>[{&quot;id&quot;:&quot;0198c8a91f4d7f01a3c21e97&quot;,&quot;title&quot;:&quot;消息堆积排查&quot;}]</p>
     */
    @NameInMap("data")
    public java.util.List<ListAgentConversationsResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>eyJpZCI6IjAxOThjOGE5In0=</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    public static ListAgentConversationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAgentConversationsResponseBody self = new ListAgentConversationsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAgentConversationsResponseBody setData(java.util.List<ListAgentConversationsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListAgentConversationsResponseBodyData> getData() {
        return this.data;
    }

    public ListAgentConversationsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListAgentConversationsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public static class ListAgentConversationsResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>{&quot;role&quot;:&quot;owner&quot;,&quot;admin&quot;:false,&quot;canRead&quot;:true,&quot;canWrite&quot;:true,&quot;canManage&quot;:true}</p>
         */
        @NameInMap("access")
        public Object access;

        /**
         * <strong>example:</strong>
         * <p>{&quot;runtime&quot;:&quot;claude&quot;,&quot;connectionId&quot;:&quot;connection-example&quot;,&quot;modelId&quot;:&quot;model-example&quot;,&quot;connectionName&quot;:&quot;示例连接&quot;,&quot;modelDisplayName&quot;:&quot;示例模型&quot;}</p>
         */
        @NameInMap("agent")
        public Object agent;

        /**
         * <strong>example:</strong>
         * <p>{&quot;sessionId&quot;:&quot;0198c8a91f4d7f01a3c21e97&quot;,&quot;purposes&quot;:[]}</p>
         */
        @NameInMap("analysisCoverage")
        public Object analysisCoverage;

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
         * <p>1000000000000001</p>
         */
        @NameInMap("createdBy")
        public String createdBy;

        /**
         * <strong>example:</strong>
         * <p>waiting</p>
         */
        @NameInMap("currentRunStatus")
        public String currentRunStatus;

        /**
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("editMonitorId")
        public String editMonitorId;

        /**
         * <strong>example:</strong>
         * <p>0198c8a91f4d7f01a3c21e97</p>
         */
        @NameInMap("id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>{&quot;userId&quot;:&quot;1000000000000001&quot;,&quot;name&quot;:null,&quot;nickName&quot;:null,&quot;email&quot;:null,&quot;avatar&quot;:null}</p>
         */
        @NameInMap("owner")
        public Object owner;

        /**
         * <strong>example:</strong>
         * <p>{&quot;id&quot;:&quot;project-example&quot;,&quot;name&quot;:&quot;RocketMQ 诊断&quot;,&quot;color&quot;:&quot;#1677ff&quot;,&quot;initial&quot;:&quot;R&quot;,&quot;agentProfile&quot;:&quot;customer&quot;}</p>
         */
        @NameInMap("project")
        public Object project;

        /**
         * <strong>example:</strong>
         * <p>rocketmq-customer</p>
         */
        @NameInMap("scenarioId")
        public String scenarioId;

        /**
         * <strong>example:</strong>
         * <p>private</p>
         */
        @NameInMap("shareScope")
        public String shareScope;

        /**
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("sourceSessionId")
        public String sourceSessionId;

        /**
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("tagging")
        public Object tagging;

        /**
         * <strong>example:</strong>
         * <p>消息堆积排查</p>
         */
        @NameInMap("title")
        public String title;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("toolCallCount")
        public Long toolCallCount;

        /**
         * <strong>example:</strong>
         * <p>2026-08-19T12:05:00.000Z</p>
         */
        @NameInMap("updatedAt")
        public String updatedAt;

        /**
         * <strong>example:</strong>
         * <p>[&quot;rocketmq-agent&quot;]</p>
         */
        @NameInMap("usedSkills")
        public java.util.List<String> usedSkills;

        public static ListAgentConversationsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListAgentConversationsResponseBodyData self = new ListAgentConversationsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListAgentConversationsResponseBodyData setAccess(Object access) {
            this.access = access;
            return this;
        }
        public Object getAccess() {
            return this.access;
        }

        public ListAgentConversationsResponseBodyData setAgent(Object agent) {
            this.agent = agent;
            return this;
        }
        public Object getAgent() {
            return this.agent;
        }

        public ListAgentConversationsResponseBodyData setAnalysisCoverage(Object analysisCoverage) {
            this.analysisCoverage = analysisCoverage;
            return this;
        }
        public Object getAnalysisCoverage() {
            return this.analysisCoverage;
        }

        public ListAgentConversationsResponseBodyData setConversationId(String conversationId) {
            this.conversationId = conversationId;
            return this;
        }
        public String getConversationId() {
            return this.conversationId;
        }

        public ListAgentConversationsResponseBodyData setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public ListAgentConversationsResponseBodyData setCreatedBy(String createdBy) {
            this.createdBy = createdBy;
            return this;
        }
        public String getCreatedBy() {
            return this.createdBy;
        }

        public ListAgentConversationsResponseBodyData setCurrentRunStatus(String currentRunStatus) {
            this.currentRunStatus = currentRunStatus;
            return this;
        }
        public String getCurrentRunStatus() {
            return this.currentRunStatus;
        }

        public ListAgentConversationsResponseBodyData setEditMonitorId(String editMonitorId) {
            this.editMonitorId = editMonitorId;
            return this;
        }
        public String getEditMonitorId() {
            return this.editMonitorId;
        }

        public ListAgentConversationsResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListAgentConversationsResponseBodyData setOwner(Object owner) {
            this.owner = owner;
            return this;
        }
        public Object getOwner() {
            return this.owner;
        }

        public ListAgentConversationsResponseBodyData setProject(Object project) {
            this.project = project;
            return this;
        }
        public Object getProject() {
            return this.project;
        }

        public ListAgentConversationsResponseBodyData setScenarioId(String scenarioId) {
            this.scenarioId = scenarioId;
            return this;
        }
        public String getScenarioId() {
            return this.scenarioId;
        }

        public ListAgentConversationsResponseBodyData setShareScope(String shareScope) {
            this.shareScope = shareScope;
            return this;
        }
        public String getShareScope() {
            return this.shareScope;
        }

        public ListAgentConversationsResponseBodyData setSourceSessionId(String sourceSessionId) {
            this.sourceSessionId = sourceSessionId;
            return this;
        }
        public String getSourceSessionId() {
            return this.sourceSessionId;
        }

        public ListAgentConversationsResponseBodyData setTagging(Object tagging) {
            this.tagging = tagging;
            return this;
        }
        public Object getTagging() {
            return this.tagging;
        }

        public ListAgentConversationsResponseBodyData setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public ListAgentConversationsResponseBodyData setToolCallCount(Long toolCallCount) {
            this.toolCallCount = toolCallCount;
            return this;
        }
        public Long getToolCallCount() {
            return this.toolCallCount;
        }

        public ListAgentConversationsResponseBodyData setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public ListAgentConversationsResponseBodyData setUsedSkills(java.util.List<String> usedSkills) {
            this.usedSkills = usedSkills;
            return this;
        }
        public java.util.List<String> getUsedSkills() {
            return this.usedSkills;
        }

    }

}
