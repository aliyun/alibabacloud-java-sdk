// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class GetNodeDetailResponseBody extends TeaModel {
    /**
     * <p>The actual work process grouped by thoughts, skills, tools, replies, and artifacts.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;thoughts&quot;:[],&quot;skillCalls&quot;:[],&quot;toolCalls&quot;:[],&quot;replies&quot;:[],&quot;artifacts&quot;:[]}</p>
     */
    @NameInMap("agentWorkProcess")
    public GetNodeDetailResponseBodyAgentWorkProcess agentWorkProcess;

    /**
     * <p>The artifacts: saved node work records and artifacts.</p>
     * 
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("artifacts")
    public java.util.List<GetNodeDetailResponseBodyArtifacts> artifacts;

    /**
     * <p>The sequence number of the node execution attempt.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("attemptSeq")
    public Long attemptSeq;

    /**
     * <p>The business status code. A value of 200 indicates success.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The node conversation ID. This parameter is empty if no conversation is created.</p>
     * 
     * <strong>example:</strong>
     * <p>conversation_example</p>
     */
    @NameInMap("conversationId")
    public String conversationId;

    /**
     * <p>Indicates whether the current node conversation can continue to receive input.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("conversationWritable")
    public Boolean conversationWritable;

    /**
     * <p>The display name of the node owner. This parameter is empty if the owner is unknown.</p>
     * 
     * <strong>example:</strong>
     * <p>Digital worker</p>
     */
    @NameInMap("handler")
    public String handler;

    /**
     * <p>The error description.</p>
     * 
     * <strong>example:</strong>
     * <p>The requested resource does not exist</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The node key.</p>
     * 
     * <strong>example:</strong>
     * <p>query.amount</p>
     */
    @NameInMap("nodeId")
    public String nodeId;

    /**
     * <p>The display name of the node, which shares the same source as the node list.</p>
     * 
     * <strong>example:</strong>
     * <p>Query signed amount</p>
     */
    @NameInMap("nodeName")
    public String nodeName;

    /**
     * <p>The node type. The actual enum value is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>AGENT</p>
     */
    @NameInMap("nodeType")
    public String nodeType;

    /**
     * <p>The request tracking ID.</p>
     * 
     * <strong>example:</strong>
     * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The node result summary, excluding inline content.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("result")
    public java.util.Map<String, ?> result;

    /**
     * <p>Indicates whether there are pending follow-up turns to be dispatched.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("resumePending")
    public Boolean resumePending;

    /**
     * <p>The run log: saved node work records and artifacts.</p>
     * 
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("runLog")
    public java.util.List<GetNodeDetailResponseBodyRunLog> runLog;

    /**
     * <p>stateVersion</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("stateVersion")
    public Long stateVersion;

    /**
     * <p>The node running status. The actual enum value is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>RUNNING</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <p>The list of to-do IDs associated with the current node.</p>
     * 
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("todoIds")
    public java.util.List<String> todoIds;

    /**
     * <p>The sequence number of the conversation turn in the current attempt.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("turnSeq")
    public Long turnSeq;

    /**
     * <p>The reason why the node is waiting. This parameter is empty if the node is not waiting.</p>
     * 
     * <strong>example:</strong>
     * <p>HUMAN_INPUT</p>
     */
    @NameInMap("waitType")
    public String waitType;

    public static GetNodeDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetNodeDetailResponseBody self = new GetNodeDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public GetNodeDetailResponseBody setAgentWorkProcess(GetNodeDetailResponseBodyAgentWorkProcess agentWorkProcess) {
        this.agentWorkProcess = agentWorkProcess;
        return this;
    }
    public GetNodeDetailResponseBodyAgentWorkProcess getAgentWorkProcess() {
        return this.agentWorkProcess;
    }

    public GetNodeDetailResponseBody setArtifacts(java.util.List<GetNodeDetailResponseBodyArtifacts> artifacts) {
        this.artifacts = artifacts;
        return this;
    }
    public java.util.List<GetNodeDetailResponseBodyArtifacts> getArtifacts() {
        return this.artifacts;
    }

    public GetNodeDetailResponseBody setAttemptSeq(Long attemptSeq) {
        this.attemptSeq = attemptSeq;
        return this;
    }
    public Long getAttemptSeq() {
        return this.attemptSeq;
    }

    public GetNodeDetailResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetNodeDetailResponseBody setConversationId(String conversationId) {
        this.conversationId = conversationId;
        return this;
    }
    public String getConversationId() {
        return this.conversationId;
    }

    public GetNodeDetailResponseBody setConversationWritable(Boolean conversationWritable) {
        this.conversationWritable = conversationWritable;
        return this;
    }
    public Boolean getConversationWritable() {
        return this.conversationWritable;
    }

    public GetNodeDetailResponseBody setHandler(String handler) {
        this.handler = handler;
        return this;
    }
    public String getHandler() {
        return this.handler;
    }

    public GetNodeDetailResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetNodeDetailResponseBody setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

    public GetNodeDetailResponseBody setNodeName(String nodeName) {
        this.nodeName = nodeName;
        return this;
    }
    public String getNodeName() {
        return this.nodeName;
    }

    public GetNodeDetailResponseBody setNodeType(String nodeType) {
        this.nodeType = nodeType;
        return this;
    }
    public String getNodeType() {
        return this.nodeType;
    }

    public GetNodeDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetNodeDetailResponseBody setResult(java.util.Map<String, ?> result) {
        this.result = result;
        return this;
    }
    public java.util.Map<String, ?> getResult() {
        return this.result;
    }

    public GetNodeDetailResponseBody setResumePending(Boolean resumePending) {
        this.resumePending = resumePending;
        return this;
    }
    public Boolean getResumePending() {
        return this.resumePending;
    }

    public GetNodeDetailResponseBody setRunLog(java.util.List<GetNodeDetailResponseBodyRunLog> runLog) {
        this.runLog = runLog;
        return this;
    }
    public java.util.List<GetNodeDetailResponseBodyRunLog> getRunLog() {
        return this.runLog;
    }

    public GetNodeDetailResponseBody setStateVersion(Long stateVersion) {
        this.stateVersion = stateVersion;
        return this;
    }
    public Long getStateVersion() {
        return this.stateVersion;
    }

    public GetNodeDetailResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetNodeDetailResponseBody setTodoIds(java.util.List<String> todoIds) {
        this.todoIds = todoIds;
        return this;
    }
    public java.util.List<String> getTodoIds() {
        return this.todoIds;
    }

    public GetNodeDetailResponseBody setTurnSeq(Long turnSeq) {
        this.turnSeq = turnSeq;
        return this;
    }
    public Long getTurnSeq() {
        return this.turnSeq;
    }

    public GetNodeDetailResponseBody setWaitType(String waitType) {
        this.waitType = waitType;
        return this;
    }
    public String getWaitType() {
        return this.waitType;
    }

    public static class GetNodeDetailResponseBodyAgentWorkProcessArtifacts extends TeaModel {
        /**
         * <p>The registered artifact ID. This parameter may be empty for artifacts derived only from the result summary.</p>
         * 
         * <strong>example:</strong>
         * <p>artifact_example</p>
         */
        @NameInMap("artifactId")
        public String artifactId;

        /**
         * <p>The unique key of the artifact in the node result.</p>
         * 
         * <strong>example:</strong>
         * <p>amount_report</p>
         */
        @NameInMap("artifactKey")
        public String artifactKey;

        /**
         * <p>The stable reference of the artifact, including kind, id, and url. The URL of a registered artifact is a re-authentication entry point and can be empty.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;kind&quot;:&quot;INLINE&quot;,&quot;id&quot;:&quot;amount_report&quot;,&quot;url&quot;:&quot;inline://amount_report&quot;}</p>
         */
        @NameInMap("ref")
        public java.util.Map<String, String> ref;

        /**
         * <p>The artifact summary, excluding inline content.</p>
         * 
         * <strong>example:</strong>
         * <p>Signed amount statistics completed</p>
         */
        @NameInMap("summary")
        public String summary;

        /**
         * <p>The display title of the artifact.</p>
         * 
         * <strong>example:</strong>
         * <p>Signed amount statistics report</p>
         */
        @NameInMap("title")
        public String title;

        /**
         * <p>The artifact type.</p>
         * 
         * <strong>example:</strong>
         * <p>TEXT</p>
         */
        @NameInMap("type")
        public String type;

        public static GetNodeDetailResponseBodyAgentWorkProcessArtifacts build(java.util.Map<String, ?> map) throws Exception {
            GetNodeDetailResponseBodyAgentWorkProcessArtifacts self = new GetNodeDetailResponseBodyAgentWorkProcessArtifacts();
            return TeaModel.build(map, self);
        }

        public GetNodeDetailResponseBodyAgentWorkProcessArtifacts setArtifactId(String artifactId) {
            this.artifactId = artifactId;
            return this;
        }
        public String getArtifactId() {
            return this.artifactId;
        }

        public GetNodeDetailResponseBodyAgentWorkProcessArtifacts setArtifactKey(String artifactKey) {
            this.artifactKey = artifactKey;
            return this;
        }
        public String getArtifactKey() {
            return this.artifactKey;
        }

        public GetNodeDetailResponseBodyAgentWorkProcessArtifacts setRef(java.util.Map<String, String> ref) {
            this.ref = ref;
            return this;
        }
        public java.util.Map<String, String> getRef() {
            return this.ref;
        }

        public GetNodeDetailResponseBodyAgentWorkProcessArtifacts setSummary(String summary) {
            this.summary = summary;
            return this;
        }
        public String getSummary() {
            return this.summary;
        }

        public GetNodeDetailResponseBodyAgentWorkProcessArtifacts setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public GetNodeDetailResponseBodyAgentWorkProcessArtifacts setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetNodeDetailResponseBodyAgentWorkProcessReplies extends TeaModel {
        /**
         * <p>The record type. Valid values: THINK, REPLY, TOOL_CALL, SKILL_CALL, or ARTIFACT.</p>
         * 
         * <strong>example:</strong>
         * <p>REPLY</p>
         */
        @NameInMap("action")
        public String action;

        /**
         * <p>The saved original record content. Tool invocation and artifact metadata are JSON strings.</p>
         * 
         * <strong>example:</strong>
         * <p>Data query for this turn completed</p>
         */
        @NameInMap("detail")
        public String detail;

        /**
         * <p>The time taken for this work record, in milliseconds. The value is 0 for artifact records.</p>
         * 
         * <strong>example:</strong>
         * <p>1200</p>
         */
        @NameInMap("duration")
        public Long duration;

        /**
         * <p>The key of the parent node, not the conversation ID.</p>
         * 
         * <strong>example:</strong>
         * <p>query.amount</p>
         */
        @NameInMap("nodeId")
        public String nodeId;

        /**
         * <p>The time when the event is recorded, in ISO-8601 format. This is an empty string if the source record has no time.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-10-14T08:00:00Z</p>
         */
        @NameInMap("timestamp")
        public String timestamp;

        public static GetNodeDetailResponseBodyAgentWorkProcessReplies build(java.util.Map<String, ?> map) throws Exception {
            GetNodeDetailResponseBodyAgentWorkProcessReplies self = new GetNodeDetailResponseBodyAgentWorkProcessReplies();
            return TeaModel.build(map, self);
        }

        public GetNodeDetailResponseBodyAgentWorkProcessReplies setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public GetNodeDetailResponseBodyAgentWorkProcessReplies setDetail(String detail) {
            this.detail = detail;
            return this;
        }
        public String getDetail() {
            return this.detail;
        }

        public GetNodeDetailResponseBodyAgentWorkProcessReplies setDuration(Long duration) {
            this.duration = duration;
            return this;
        }
        public Long getDuration() {
            return this.duration;
        }

        public GetNodeDetailResponseBodyAgentWorkProcessReplies setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public GetNodeDetailResponseBodyAgentWorkProcessReplies setTimestamp(String timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public String getTimestamp() {
            return this.timestamp;
        }

    }

    public static class GetNodeDetailResponseBodyAgentWorkProcessSkillCalls extends TeaModel {
        /**
         * <p>The record type. Valid values: THINK, REPLY, TOOL_CALL, SKILL_CALL, or ARTIFACT.</p>
         * 
         * <strong>example:</strong>
         * <p>SKILL_CALL</p>
         */
        @NameInMap("action")
        public String action;

        /**
         * <p>The saved original record content. Tool invocation and artifact metadata are JSON strings.</p>
         * 
         * <strong>example:</strong>
         * <p>Data query for this turn completed</p>
         */
        @NameInMap("detail")
        public String detail;

        /**
         * <p>The time taken for this work record, in milliseconds. The value is 0 for artifact records.</p>
         * 
         * <strong>example:</strong>
         * <p>1200</p>
         */
        @NameInMap("duration")
        public Long duration;

        /**
         * <p>The key of the parent node, not the conversation ID.</p>
         * 
         * <strong>example:</strong>
         * <p>query.amount</p>
         */
        @NameInMap("nodeId")
        public String nodeId;

        /**
         * <p>The time when the event is recorded, in ISO-8601 format. This is an empty string if the source record has no time.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-10-14T08:00:00Z</p>
         */
        @NameInMap("timestamp")
        public String timestamp;

        public static GetNodeDetailResponseBodyAgentWorkProcessSkillCalls build(java.util.Map<String, ?> map) throws Exception {
            GetNodeDetailResponseBodyAgentWorkProcessSkillCalls self = new GetNodeDetailResponseBodyAgentWorkProcessSkillCalls();
            return TeaModel.build(map, self);
        }

        public GetNodeDetailResponseBodyAgentWorkProcessSkillCalls setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public GetNodeDetailResponseBodyAgentWorkProcessSkillCalls setDetail(String detail) {
            this.detail = detail;
            return this;
        }
        public String getDetail() {
            return this.detail;
        }

        public GetNodeDetailResponseBodyAgentWorkProcessSkillCalls setDuration(Long duration) {
            this.duration = duration;
            return this;
        }
        public Long getDuration() {
            return this.duration;
        }

        public GetNodeDetailResponseBodyAgentWorkProcessSkillCalls setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public GetNodeDetailResponseBodyAgentWorkProcessSkillCalls setTimestamp(String timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public String getTimestamp() {
            return this.timestamp;
        }

    }

    public static class GetNodeDetailResponseBodyAgentWorkProcessThoughts extends TeaModel {
        /**
         * <p>The record type. Valid values: THINK, REPLY, TOOL_CALL, SKILL_CALL, or ARTIFACT.</p>
         * 
         * <strong>example:</strong>
         * <p>THINK</p>
         */
        @NameInMap("action")
        public String action;

        /**
         * <p>The saved original record content. Tool invocation and artifact metadata are JSON strings.</p>
         * 
         * <strong>example:</strong>
         * <p>Data query for this turn completed</p>
         */
        @NameInMap("detail")
        public String detail;

        /**
         * <p>The time taken for this work record, in milliseconds. The value is 0 for artifact records.</p>
         * 
         * <strong>example:</strong>
         * <p>1200</p>
         */
        @NameInMap("duration")
        public Long duration;

        /**
         * <p>The key of the parent node, not the conversation ID.</p>
         * 
         * <strong>example:</strong>
         * <p>query.amount</p>
         */
        @NameInMap("nodeId")
        public String nodeId;

        /**
         * <p>The time when the event is recorded, in ISO-8601 format. This is an empty string if the source record has no time.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-10-14T08:00:00Z</p>
         */
        @NameInMap("timestamp")
        public String timestamp;

        public static GetNodeDetailResponseBodyAgentWorkProcessThoughts build(java.util.Map<String, ?> map) throws Exception {
            GetNodeDetailResponseBodyAgentWorkProcessThoughts self = new GetNodeDetailResponseBodyAgentWorkProcessThoughts();
            return TeaModel.build(map, self);
        }

        public GetNodeDetailResponseBodyAgentWorkProcessThoughts setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public GetNodeDetailResponseBodyAgentWorkProcessThoughts setDetail(String detail) {
            this.detail = detail;
            return this;
        }
        public String getDetail() {
            return this.detail;
        }

        public GetNodeDetailResponseBodyAgentWorkProcessThoughts setDuration(Long duration) {
            this.duration = duration;
            return this;
        }
        public Long getDuration() {
            return this.duration;
        }

        public GetNodeDetailResponseBodyAgentWorkProcessThoughts setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public GetNodeDetailResponseBodyAgentWorkProcessThoughts setTimestamp(String timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public String getTimestamp() {
            return this.timestamp;
        }

    }

    public static class GetNodeDetailResponseBodyAgentWorkProcessToolCalls extends TeaModel {
        /**
         * <p>The record type. Valid values: THINK, REPLY, TOOL_CALL, SKILL_CALL, or ARTIFACT.</p>
         * 
         * <strong>example:</strong>
         * <p>TOOL_CALL</p>
         */
        @NameInMap("action")
        public String action;

        /**
         * <p>The saved original record content. Tool invocation and artifact metadata are JSON strings.</p>
         * 
         * <strong>example:</strong>
         * <p>Data query for this turn completed</p>
         */
        @NameInMap("detail")
        public String detail;

        /**
         * <p>The time taken for this work record, in milliseconds. The value is 0 for artifact records.</p>
         * 
         * <strong>example:</strong>
         * <p>1200</p>
         */
        @NameInMap("duration")
        public Long duration;

        /**
         * <p>The key of the parent node, not the conversation ID.</p>
         * 
         * <strong>example:</strong>
         * <p>query.amount</p>
         */
        @NameInMap("nodeId")
        public String nodeId;

        /**
         * <p>The time when the event is recorded, in ISO-8601 format. This is an empty string if the source record has no time.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-10-14T08:00:00Z</p>
         */
        @NameInMap("timestamp")
        public String timestamp;

        public static GetNodeDetailResponseBodyAgentWorkProcessToolCalls build(java.util.Map<String, ?> map) throws Exception {
            GetNodeDetailResponseBodyAgentWorkProcessToolCalls self = new GetNodeDetailResponseBodyAgentWorkProcessToolCalls();
            return TeaModel.build(map, self);
        }

        public GetNodeDetailResponseBodyAgentWorkProcessToolCalls setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public GetNodeDetailResponseBodyAgentWorkProcessToolCalls setDetail(String detail) {
            this.detail = detail;
            return this;
        }
        public String getDetail() {
            return this.detail;
        }

        public GetNodeDetailResponseBodyAgentWorkProcessToolCalls setDuration(Long duration) {
            this.duration = duration;
            return this;
        }
        public Long getDuration() {
            return this.duration;
        }

        public GetNodeDetailResponseBodyAgentWorkProcessToolCalls setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public GetNodeDetailResponseBodyAgentWorkProcessToolCalls setTimestamp(String timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public String getTimestamp() {
            return this.timestamp;
        }

    }

    public static class GetNodeDetailResponseBodyAgentWorkProcess extends TeaModel {
        /**
         * <p>The artifacts: saved node work records and artifacts.</p>
         * 
         * <strong>example:</strong>
         * <p>[]</p>
         */
        @NameInMap("artifacts")
        public java.util.List<GetNodeDetailResponseBodyAgentWorkProcessArtifacts> artifacts;

        /**
         * <p>The replies: saved node work records and artifacts.</p>
         * 
         * <strong>example:</strong>
         * <p>[]</p>
         */
        @NameInMap("replies")
        public java.util.List<GetNodeDetailResponseBodyAgentWorkProcessReplies> replies;

        /**
         * <p>The skill calls: saved node work records and artifacts.</p>
         * 
         * <strong>example:</strong>
         * <p>[]</p>
         */
        @NameInMap("skillCalls")
        public java.util.List<GetNodeDetailResponseBodyAgentWorkProcessSkillCalls> skillCalls;

        /**
         * <p>The thoughts: saved node work records and artifacts.</p>
         * 
         * <strong>example:</strong>
         * <p>[]</p>
         */
        @NameInMap("thoughts")
        public java.util.List<GetNodeDetailResponseBodyAgentWorkProcessThoughts> thoughts;

        /**
         * <p>The tool calls: saved node work records and artifacts.</p>
         * 
         * <strong>example:</strong>
         * <p>[]</p>
         */
        @NameInMap("toolCalls")
        public java.util.List<GetNodeDetailResponseBodyAgentWorkProcessToolCalls> toolCalls;

        public static GetNodeDetailResponseBodyAgentWorkProcess build(java.util.Map<String, ?> map) throws Exception {
            GetNodeDetailResponseBodyAgentWorkProcess self = new GetNodeDetailResponseBodyAgentWorkProcess();
            return TeaModel.build(map, self);
        }

        public GetNodeDetailResponseBodyAgentWorkProcess setArtifacts(java.util.List<GetNodeDetailResponseBodyAgentWorkProcessArtifacts> artifacts) {
            this.artifacts = artifacts;
            return this;
        }
        public java.util.List<GetNodeDetailResponseBodyAgentWorkProcessArtifacts> getArtifacts() {
            return this.artifacts;
        }

        public GetNodeDetailResponseBodyAgentWorkProcess setReplies(java.util.List<GetNodeDetailResponseBodyAgentWorkProcessReplies> replies) {
            this.replies = replies;
            return this;
        }
        public java.util.List<GetNodeDetailResponseBodyAgentWorkProcessReplies> getReplies() {
            return this.replies;
        }

        public GetNodeDetailResponseBodyAgentWorkProcess setSkillCalls(java.util.List<GetNodeDetailResponseBodyAgentWorkProcessSkillCalls> skillCalls) {
            this.skillCalls = skillCalls;
            return this;
        }
        public java.util.List<GetNodeDetailResponseBodyAgentWorkProcessSkillCalls> getSkillCalls() {
            return this.skillCalls;
        }

        public GetNodeDetailResponseBodyAgentWorkProcess setThoughts(java.util.List<GetNodeDetailResponseBodyAgentWorkProcessThoughts> thoughts) {
            this.thoughts = thoughts;
            return this;
        }
        public java.util.List<GetNodeDetailResponseBodyAgentWorkProcessThoughts> getThoughts() {
            return this.thoughts;
        }

        public GetNodeDetailResponseBodyAgentWorkProcess setToolCalls(java.util.List<GetNodeDetailResponseBodyAgentWorkProcessToolCalls> toolCalls) {
            this.toolCalls = toolCalls;
            return this;
        }
        public java.util.List<GetNodeDetailResponseBodyAgentWorkProcessToolCalls> getToolCalls() {
            return this.toolCalls;
        }

    }

    public static class GetNodeDetailResponseBodyArtifacts extends TeaModel {
        /**
         * <p>The registered artifact ID. This parameter may be empty for artifacts derived only from the result summary.</p>
         * 
         * <strong>example:</strong>
         * <p>artifact_example</p>
         */
        @NameInMap("artifactId")
        public String artifactId;

        /**
         * <p>The unique key of the artifact in the node result.</p>
         * 
         * <strong>example:</strong>
         * <p>amount_report</p>
         */
        @NameInMap("artifactKey")
        public String artifactKey;

        /**
         * <p>The stable reference of the artifact, including kind, id, and url. The URL of a registered artifact is a re-authentication entry point and can be empty.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;kind&quot;:&quot;INLINE&quot;,&quot;id&quot;:&quot;amount_report&quot;,&quot;url&quot;:&quot;inline://amount_report&quot;}</p>
         */
        @NameInMap("ref")
        public java.util.Map<String, String> ref;

        /**
         * <p>The artifact summary, excluding inline content.</p>
         * 
         * <strong>example:</strong>
         * <p>Signed amount statistics completed</p>
         */
        @NameInMap("summary")
        public String summary;

        /**
         * <p>The display title of the artifact.</p>
         * 
         * <strong>example:</strong>
         * <p>Signed amount statistics report</p>
         */
        @NameInMap("title")
        public String title;

        /**
         * <p>The artifact type.</p>
         * 
         * <strong>example:</strong>
         * <p>TEXT</p>
         */
        @NameInMap("type")
        public String type;

        public static GetNodeDetailResponseBodyArtifacts build(java.util.Map<String, ?> map) throws Exception {
            GetNodeDetailResponseBodyArtifacts self = new GetNodeDetailResponseBodyArtifacts();
            return TeaModel.build(map, self);
        }

        public GetNodeDetailResponseBodyArtifacts setArtifactId(String artifactId) {
            this.artifactId = artifactId;
            return this;
        }
        public String getArtifactId() {
            return this.artifactId;
        }

        public GetNodeDetailResponseBodyArtifacts setArtifactKey(String artifactKey) {
            this.artifactKey = artifactKey;
            return this;
        }
        public String getArtifactKey() {
            return this.artifactKey;
        }

        public GetNodeDetailResponseBodyArtifacts setRef(java.util.Map<String, String> ref) {
            this.ref = ref;
            return this;
        }
        public java.util.Map<String, String> getRef() {
            return this.ref;
        }

        public GetNodeDetailResponseBodyArtifacts setSummary(String summary) {
            this.summary = summary;
            return this;
        }
        public String getSummary() {
            return this.summary;
        }

        public GetNodeDetailResponseBodyArtifacts setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public GetNodeDetailResponseBodyArtifacts setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetNodeDetailResponseBodyRunLog extends TeaModel {
        /**
         * <p>The record type. Valid values: THINK, REPLY, TOOL_CALL, SKILL_CALL, or ARTIFACT.</p>
         * 
         * <strong>example:</strong>
         * <p>REPLY</p>
         */
        @NameInMap("action")
        public String action;

        /**
         * <p>The saved original record content. Tool invocation and artifact metadata are JSON strings.</p>
         * 
         * <strong>example:</strong>
         * <p>Data query for this turn completed</p>
         */
        @NameInMap("detail")
        public String detail;

        /**
         * <p>The time taken for this work record, in milliseconds. The value is 0 for artifact records.</p>
         * 
         * <strong>example:</strong>
         * <p>1200</p>
         */
        @NameInMap("duration")
        public Long duration;

        /**
         * <p>The key of the parent node, not the conversation ID.</p>
         * 
         * <strong>example:</strong>
         * <p>query.amount</p>
         */
        @NameInMap("nodeId")
        public String nodeId;

        /**
         * <p>The time when the event is recorded, in ISO-8601 format. This is an empty string if the source record has no time.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-10-14T08:00:00Z</p>
         */
        @NameInMap("timestamp")
        public String timestamp;

        public static GetNodeDetailResponseBodyRunLog build(java.util.Map<String, ?> map) throws Exception {
            GetNodeDetailResponseBodyRunLog self = new GetNodeDetailResponseBodyRunLog();
            return TeaModel.build(map, self);
        }

        public GetNodeDetailResponseBodyRunLog setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public GetNodeDetailResponseBodyRunLog setDetail(String detail) {
            this.detail = detail;
            return this;
        }
        public String getDetail() {
            return this.detail;
        }

        public GetNodeDetailResponseBodyRunLog setDuration(Long duration) {
            this.duration = duration;
            return this;
        }
        public Long getDuration() {
            return this.duration;
        }

        public GetNodeDetailResponseBodyRunLog setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public GetNodeDetailResponseBodyRunLog setTimestamp(String timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public String getTimestamp() {
            return this.timestamp;
        }

    }

}
