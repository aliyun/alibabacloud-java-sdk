// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class GetNodeDetailResponseBody extends TeaModel {
    /**
     * <p>按思考、技能、工具、回复和产物分组的实际工作过程</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;thoughts&quot;:[],&quot;skillCalls&quot;:[],&quot;toolCalls&quot;:[],&quot;replies&quot;:[],&quot;artifacts&quot;:[]}</p>
     */
    @NameInMap("agentWorkProcess")
    public GetNodeDetailResponseBodyAgentWorkProcess agentWorkProcess;

    /**
     * <p>已保存的节点产物摘要与稳定引用，不包含inline正文；无产物时为空列表</p>
     * 
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("artifacts")
    public java.util.List<GetNodeDetailResponseBodyArtifacts> artifacts;

    /**
     * <p>节点执行尝试序号</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("attemptSeq")
    public Long attemptSeq;

    /**
     * <p>业务状态码；成功为200</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>节点会话ID，未创建时为空</p>
     * 
     * <strong>example:</strong>
     * <p>conversation_example</p>
     */
    @NameInMap("conversationId")
    public String conversationId;

    /**
     * <p>当前节点会话是否可以继续输入</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("conversationWritable")
    public Boolean conversationWritable;

    /**
     * <p>节点负责人展示名称，未知时为空</p>
     * 
     * <strong>example:</strong>
     * <p>数字员工</p>
     */
    @NameInMap("handler")
    public String handler;

    /**
     * <p>错误描述</p>
     * 
     * <strong>example:</strong>
     * <p>请求的资源不存在</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>节点 key（nodeKey）</p>
     * 
     * <strong>example:</strong>
     * <p>query.amount</p>
     */
    @NameInMap("nodeId")
    public String nodeId;

    /**
     * <p>节点展示名称，与节点列表同源</p>
     * 
     * <strong>example:</strong>
     * <p>查询签单金额</p>
     */
    @NameInMap("nodeName")
    public String nodeName;

    /**
     * <p>节点类型，返回实际枚举</p>
     * 
     * <strong>example:</strong>
     * <p>AGENT</p>
     */
    @NameInMap("nodeType")
    public String nodeType;

    /**
     * <p>请求追踪ID</p>
     * 
     * <strong>example:</strong>
     * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>节点结果摘要，不含inline正文</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("result")
    public java.util.Map<String, ?> result;

    /**
     * <p>是否有待派发续轮</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("resumePending")
    public Boolean resumePending;

    /**
     * <p>节点AI工作记录时间线，与GetAgentWorkLog同源，duration单位毫秒；无记录时为空列表</p>
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
     * <p>节点运行状态，返回实际枚举</p>
     * 
     * <strong>example:</strong>
     * <p>RUNNING</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <p>当前节点关联的待办ID列表，元素为待办ID字符串</p>
     * 
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("todoIds")
    public java.util.List<String> todoIds;

    /**
     * <p>当前尝试的对话轮序号</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("turnSeq")
    public Long turnSeq;

    /**
     * <p>节点等待原因，未等待时为空</p>
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
         * <p>登记产物ID；仅来自结果摘要的产物可能为空</p>
         * 
         * <strong>example:</strong>
         * <p>artifact_example</p>
         */
        @NameInMap("artifactId")
        public String artifactId;

        /**
         * <p>产物在节点结果中的唯一key</p>
         * 
         * <strong>example:</strong>
         * <p>amount_report</p>
         */
        @NameInMap("artifactKey")
        public String artifactKey;

        /**
         * <p>产物稳定引用，包含kind、id、url；登记产物URL为重新鉴权入口，可为空</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;kind&quot;:&quot;INLINE&quot;,&quot;id&quot;:&quot;amount_report&quot;,&quot;url&quot;:&quot;inline://amount_report&quot;}</p>
         */
        @NameInMap("ref")
        public java.util.Map<String, String> ref;

        /**
         * <p>产物摘要，不含inline正文</p>
         * 
         * <strong>example:</strong>
         * <p>已完成签单金额统计</p>
         */
        @NameInMap("summary")
        public String summary;

        /**
         * <p>产物展示标题</p>
         * 
         * <strong>example:</strong>
         * <p>签单金额统计报告</p>
         */
        @NameInMap("title")
        public String title;

        /**
         * <p>产物类型</p>
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
         * <p>记录类型：THINK、REPLY、TOOL_CALL、SKILL_CALL或ARTIFACT</p>
         * 
         * <strong>example:</strong>
         * <p>REPLY</p>
         */
        @NameInMap("action")
        public String action;

        /**
         * <p>已保存的原始记录内容；工具调用与产物元数据为JSON字符串</p>
         * 
         * <strong>example:</strong>
         * <p>已完成本轮数据查询</p>
         */
        @NameInMap("detail")
        public String detail;

        /**
         * <p>该条工作记录耗时，单位毫秒；产物记录为0</p>
         * 
         * <strong>example:</strong>
         * <p>1200</p>
         */
        @NameInMap("duration")
        public Long duration;

        /**
         * <p>所属节点key（nodeKey），不是会话ID</p>
         * 
         * <strong>example:</strong>
         * <p>query.amount</p>
         */
        @NameInMap("nodeId")
        public String nodeId;

        /**
         * <p>记录事件时间，ISO-8601格式；源记录无时间时为空字符串</p>
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
         * <p>记录类型：THINK、REPLY、TOOL_CALL、SKILL_CALL或ARTIFACT</p>
         * 
         * <strong>example:</strong>
         * <p>SKILL_CALL</p>
         */
        @NameInMap("action")
        public String action;

        /**
         * <p>已保存的原始记录内容；工具调用与产物元数据为JSON字符串</p>
         * 
         * <strong>example:</strong>
         * <p>已完成本轮数据查询</p>
         */
        @NameInMap("detail")
        public String detail;

        /**
         * <p>该条工作记录耗时，单位毫秒；产物记录为0</p>
         * 
         * <strong>example:</strong>
         * <p>1200</p>
         */
        @NameInMap("duration")
        public Long duration;

        /**
         * <p>所属节点key（nodeKey），不是会话ID</p>
         * 
         * <strong>example:</strong>
         * <p>query.amount</p>
         */
        @NameInMap("nodeId")
        public String nodeId;

        /**
         * <p>记录事件时间，ISO-8601格式；源记录无时间时为空字符串</p>
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
         * <p>记录类型：THINK、REPLY、TOOL_CALL、SKILL_CALL或ARTIFACT</p>
         * 
         * <strong>example:</strong>
         * <p>THINK</p>
         */
        @NameInMap("action")
        public String action;

        /**
         * <p>已保存的原始记录内容；工具调用与产物元数据为JSON字符串</p>
         * 
         * <strong>example:</strong>
         * <p>已完成本轮数据查询</p>
         */
        @NameInMap("detail")
        public String detail;

        /**
         * <p>该条工作记录耗时，单位毫秒；产物记录为0</p>
         * 
         * <strong>example:</strong>
         * <p>1200</p>
         */
        @NameInMap("duration")
        public Long duration;

        /**
         * <p>所属节点key（nodeKey），不是会话ID</p>
         * 
         * <strong>example:</strong>
         * <p>query.amount</p>
         */
        @NameInMap("nodeId")
        public String nodeId;

        /**
         * <p>记录事件时间，ISO-8601格式；源记录无时间时为空字符串</p>
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
         * <p>记录类型：THINK、REPLY、TOOL_CALL、SKILL_CALL或ARTIFACT</p>
         * 
         * <strong>example:</strong>
         * <p>TOOL_CALL</p>
         */
        @NameInMap("action")
        public String action;

        /**
         * <p>已保存的原始记录内容；工具调用与产物元数据为JSON字符串</p>
         * 
         * <strong>example:</strong>
         * <p>已完成本轮数据查询</p>
         */
        @NameInMap("detail")
        public String detail;

        /**
         * <p>该条工作记录耗时，单位毫秒；产物记录为0</p>
         * 
         * <strong>example:</strong>
         * <p>1200</p>
         */
        @NameInMap("duration")
        public Long duration;

        /**
         * <p>所属节点key（nodeKey），不是会话ID</p>
         * 
         * <strong>example:</strong>
         * <p>query.amount</p>
         */
        @NameInMap("nodeId")
        public String nodeId;

        /**
         * <p>记录事件时间，ISO-8601格式；源记录无时间时为空字符串</p>
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
         * <p>节点产物摘要与稳定引用，与顶层artifacts一致；无产物时为空列表</p>
         * 
         * <strong>example:</strong>
         * <p>[]</p>
         */
        @NameInMap("artifacts")
        public java.util.List<GetNodeDetailResponseBodyAgentWorkProcessArtifacts> artifacts;

        /**
         * <p>已保存的回复记录，action为REPLY；无记录时为空列表</p>
         * 
         * <strong>example:</strong>
         * <p>[]</p>
         */
        @NameInMap("replies")
        public java.util.List<GetNodeDetailResponseBodyAgentWorkProcessReplies> replies;

        /**
         * <p>已保存的技能调用记录，action为SKILL_CALL；无记录时为空列表</p>
         * 
         * <strong>example:</strong>
         * <p>[]</p>
         */
        @NameInMap("skillCalls")
        public java.util.List<GetNodeDetailResponseBodyAgentWorkProcessSkillCalls> skillCalls;

        /**
         * <p>已保存的思考记录，action为THINK；无记录时为空列表</p>
         * 
         * <strong>example:</strong>
         * <p>[]</p>
         */
        @NameInMap("thoughts")
        public java.util.List<GetNodeDetailResponseBodyAgentWorkProcessThoughts> thoughts;

        /**
         * <p>已保存的工具调用记录，action为TOOL_CALL；无记录时为空列表</p>
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
         * <p>登记产物ID；仅来自结果摘要的产物可能为空</p>
         * 
         * <strong>example:</strong>
         * <p>artifact_example</p>
         */
        @NameInMap("artifactId")
        public String artifactId;

        /**
         * <p>产物在节点结果中的唯一key</p>
         * 
         * <strong>example:</strong>
         * <p>amount_report</p>
         */
        @NameInMap("artifactKey")
        public String artifactKey;

        /**
         * <p>产物稳定引用，包含kind、id、url；登记产物URL为重新鉴权入口，可为空</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;kind&quot;:&quot;INLINE&quot;,&quot;id&quot;:&quot;amount_report&quot;,&quot;url&quot;:&quot;inline://amount_report&quot;}</p>
         */
        @NameInMap("ref")
        public java.util.Map<String, String> ref;

        /**
         * <p>产物摘要，不含inline正文</p>
         * 
         * <strong>example:</strong>
         * <p>已完成签单金额统计</p>
         */
        @NameInMap("summary")
        public String summary;

        /**
         * <p>产物展示标题</p>
         * 
         * <strong>example:</strong>
         * <p>签单金额统计报告</p>
         */
        @NameInMap("title")
        public String title;

        /**
         * <p>产物类型</p>
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
         * <p>记录类型：THINK、REPLY、TOOL_CALL、SKILL_CALL或ARTIFACT</p>
         * 
         * <strong>example:</strong>
         * <p>REPLY</p>
         */
        @NameInMap("action")
        public String action;

        /**
         * <p>已保存的原始记录内容；工具调用与产物元数据为JSON字符串</p>
         * 
         * <strong>example:</strong>
         * <p>已完成本轮数据查询</p>
         */
        @NameInMap("detail")
        public String detail;

        /**
         * <p>该条工作记录耗时，单位毫秒；产物记录为0</p>
         * 
         * <strong>example:</strong>
         * <p>1200</p>
         */
        @NameInMap("duration")
        public Long duration;

        /**
         * <p>所属节点key（nodeKey），不是会话ID</p>
         * 
         * <strong>example:</strong>
         * <p>query.amount</p>
         */
        @NameInMap("nodeId")
        public String nodeId;

        /**
         * <p>记录事件时间，ISO-8601格式；源记录无时间时为空字符串</p>
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
