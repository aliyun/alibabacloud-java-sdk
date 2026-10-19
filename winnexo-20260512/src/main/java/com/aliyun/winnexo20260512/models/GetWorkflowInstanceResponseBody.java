// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class GetWorkflowInstanceResponseBody extends TeaModel {
    /**
     * <p>空间内唯一外部需求编号</p>
     * 
     * <strong>example:</strong>
     * <p>REQ-1001</p>
     */
    @NameInMap("businessId")
    public String businessId;

    /**
     * <p>业务状态码，来自统一 POP 响应包装</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>协作空间 ID</p>
     * 
     * <strong>example:</strong>
     * <p>cg_20261016_abc123</p>
     */
    @NameInMap("collaborationGroupId")
    public String collaborationGroupId;

    /**
     * <p>逻辑实例创建时间，ISO8601</p>
     * 
     * <strong>example:</strong>
     * <p>2026-10-16T10:30:00+08:00</p>
     */
    @NameInMap("createdAt")
    public String createdAt;

    /**
     * <p>首个活动节点，终态为 null</p>
     */
    @NameInMap("currentNode")
    public GetWorkflowInstanceResponseBodyCurrentNode currentNode;

    /**
     * <p>全部活动节点，支持并行 DAG</p>
     */
    @NameInMap("currentNodes")
    public java.util.List<GetWorkflowInstanceResponseBodyCurrentNodes> currentNodes;

    /**
     * <p>当前计划终态时间，未结束为 null</p>
     * 
     * <strong>example:</strong>
     * <p>2026-10-16T10:30:00+08:00</p>
     */
    @NameInMap("endedAt")
    public String endedAt;

    /**
     * <p>外部发起人标签，不参与鉴权</p>
     * 
     * <strong>example:</strong>
     * <p>外部发起人张三</p>
     */
    @NameInMap("initiator")
    public String initiator;

    /**
     * <p>稳定逻辑实例 ID，工作项重启不改变</p>
     * 
     * <strong>example:</strong>
     * <p>wfi_20261016_abc123</p>
     */
    @NameInMap("instanceId")
    public String instanceId;

    /**
     * <p>用户可见错误描述，来自统一 POP 响应包装</p>
     * 
     * <strong>example:</strong>
     * <p>请求的资源不存在</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>原始计划暂停范围</p>
     * 
     * <strong>example:</strong>
     * <p>ALL</p>
     */
    @NameInMap("pauseScope")
    public String pauseScope;

    /**
     * <p>当前物理计划修订 ID</p>
     * 
     * <strong>example:</strong>
     * <p>plan_20261016_abc123</p>
     */
    @NameInMap("planId")
    public String planId;

    /**
     * <p>可见图进度</p>
     */
    @NameInMap("progress")
    public GetWorkflowInstanceResponseBodyProgress progress;

    /**
     * <p>请求追踪 ID</p>
     * 
     * <strong>example:</strong>
     * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>原始计划审核状态</p>
     * 
     * <strong>example:</strong>
     * <p>APPROVED</p>
     */
    @NameInMap("reviewStatus")
    public String reviewStatus;

    /**
     * <p>当前物理计划修订号</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("revision")
    public Long revision;

    /**
     * <p>当前运行 ID，重启后会改变</p>
     * 
     * <strong>example:</strong>
     * <p>run_20261016_abc123</p>
     */
    @NameInMap("runId")
    public String runId;

    /**
     * <p>原始 BUILDING/RUNNING/SUCCEEDED/FAILED/CANCELLED</p>
     * 
     * <strong>example:</strong>
     * <p>RUNNING</p>
     */
    @NameInMap("runtimeStatus")
    public String runtimeStatus;

    /**
     * <p>当前计划节点首次开始时间，未执行为 null</p>
     * 
     * <strong>example:</strong>
     * <p>2026-10-16T10:30:00+08:00</p>
     */
    @NameInMap("startedAt")
    public String startedAt;

    /**
     * <p>运行状态版本</p>
     * 
     * <strong>example:</strong>
     * <p>7</p>
     */
    @NameInMap("stateVersion")
    public Long stateVersion;

    /**
     * <p>Running/Completed/Failed/Terminated</p>
     * 
     * <strong>example:</strong>
     * <p>Running</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <p>创建时绑定的工作流模板 ID</p>
     * 
     * <strong>example:</strong>
     * <p>wft_20261016_abc123</p>
     */
    @NameInMap("templateId")
    public String templateId;

    /**
     * <p>当前需求标题</p>
     * 
     * <strong>example:</strong>
     * <p>季度经营分析报告</p>
     */
    @NameInMap("title")
    public String title;

    /**
     * <p>关联工作项 ID</p>
     * 
     * <strong>example:</strong>
     * <p>wi_20261016_abc123</p>
     */
    @NameInMap("workItemId")
    public String workItemId;

    public static GetWorkflowInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetWorkflowInstanceResponseBody self = new GetWorkflowInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetWorkflowInstanceResponseBody setBusinessId(String businessId) {
        this.businessId = businessId;
        return this;
    }
    public String getBusinessId() {
        return this.businessId;
    }

    public GetWorkflowInstanceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetWorkflowInstanceResponseBody setCollaborationGroupId(String collaborationGroupId) {
        this.collaborationGroupId = collaborationGroupId;
        return this;
    }
    public String getCollaborationGroupId() {
        return this.collaborationGroupId;
    }

    public GetWorkflowInstanceResponseBody setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public String getCreatedAt() {
        return this.createdAt;
    }

    public GetWorkflowInstanceResponseBody setCurrentNode(GetWorkflowInstanceResponseBodyCurrentNode currentNode) {
        this.currentNode = currentNode;
        return this;
    }
    public GetWorkflowInstanceResponseBodyCurrentNode getCurrentNode() {
        return this.currentNode;
    }

    public GetWorkflowInstanceResponseBody setCurrentNodes(java.util.List<GetWorkflowInstanceResponseBodyCurrentNodes> currentNodes) {
        this.currentNodes = currentNodes;
        return this;
    }
    public java.util.List<GetWorkflowInstanceResponseBodyCurrentNodes> getCurrentNodes() {
        return this.currentNodes;
    }

    public GetWorkflowInstanceResponseBody setEndedAt(String endedAt) {
        this.endedAt = endedAt;
        return this;
    }
    public String getEndedAt() {
        return this.endedAt;
    }

    public GetWorkflowInstanceResponseBody setInitiator(String initiator) {
        this.initiator = initiator;
        return this;
    }
    public String getInitiator() {
        return this.initiator;
    }

    public GetWorkflowInstanceResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetWorkflowInstanceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetWorkflowInstanceResponseBody setPauseScope(String pauseScope) {
        this.pauseScope = pauseScope;
        return this;
    }
    public String getPauseScope() {
        return this.pauseScope;
    }

    public GetWorkflowInstanceResponseBody setPlanId(String planId) {
        this.planId = planId;
        return this;
    }
    public String getPlanId() {
        return this.planId;
    }

    public GetWorkflowInstanceResponseBody setProgress(GetWorkflowInstanceResponseBodyProgress progress) {
        this.progress = progress;
        return this;
    }
    public GetWorkflowInstanceResponseBodyProgress getProgress() {
        return this.progress;
    }

    public GetWorkflowInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetWorkflowInstanceResponseBody setReviewStatus(String reviewStatus) {
        this.reviewStatus = reviewStatus;
        return this;
    }
    public String getReviewStatus() {
        return this.reviewStatus;
    }

    public GetWorkflowInstanceResponseBody setRevision(Long revision) {
        this.revision = revision;
        return this;
    }
    public Long getRevision() {
        return this.revision;
    }

    public GetWorkflowInstanceResponseBody setRunId(String runId) {
        this.runId = runId;
        return this;
    }
    public String getRunId() {
        return this.runId;
    }

    public GetWorkflowInstanceResponseBody setRuntimeStatus(String runtimeStatus) {
        this.runtimeStatus = runtimeStatus;
        return this;
    }
    public String getRuntimeStatus() {
        return this.runtimeStatus;
    }

    public GetWorkflowInstanceResponseBody setStartedAt(String startedAt) {
        this.startedAt = startedAt;
        return this;
    }
    public String getStartedAt() {
        return this.startedAt;
    }

    public GetWorkflowInstanceResponseBody setStateVersion(Long stateVersion) {
        this.stateVersion = stateVersion;
        return this;
    }
    public Long getStateVersion() {
        return this.stateVersion;
    }

    public GetWorkflowInstanceResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetWorkflowInstanceResponseBody setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public GetWorkflowInstanceResponseBody setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public GetWorkflowInstanceResponseBody setWorkItemId(String workItemId) {
        this.workItemId = workItemId;
        return this;
    }
    public String getWorkItemId() {
        return this.workItemId;
    }

    public static class GetWorkflowInstanceResponseBodyCurrentNode extends TeaModel {
        /**
         * <p>当前处理人展示名</p>
         * 
         * <strong>example:</strong>
         * <p>张三</p>
         */
        @NameInMap("handler")
        public String handler;

        /**
         * <p>处理人或数字员工标识</p>
         * 
         * <strong>example:</strong>
         * <p>user_10086</p>
         */
        @NameInMap("handlerId")
        public String handlerId;

        /**
         * <p>真实运行节点 nodeKey</p>
         * 
         * <strong>example:</strong>
         * <p>node_key_confirm</p>
         */
        @NameInMap("nodeId")
        public String nodeId;

        /**
         * <p>节点展示名</p>
         * 
         * <strong>example:</strong>
         * <p>需求确认</p>
         */
        @NameInMap("nodeName")
        public String nodeName;

        /**
         * <p>真实节点类型 AGENT/HUMAN/CONDITION</p>
         * 
         * <strong>example:</strong>
         * <p>AGENT</p>
         */
        @NameInMap("nodeType")
        public String nodeType;

        /**
         * <p>节点运行状态</p>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("status")
        public String status;

        public static GetWorkflowInstanceResponseBodyCurrentNode build(java.util.Map<String, ?> map) throws Exception {
            GetWorkflowInstanceResponseBodyCurrentNode self = new GetWorkflowInstanceResponseBodyCurrentNode();
            return TeaModel.build(map, self);
        }

        public GetWorkflowInstanceResponseBodyCurrentNode setHandler(String handler) {
            this.handler = handler;
            return this;
        }
        public String getHandler() {
            return this.handler;
        }

        public GetWorkflowInstanceResponseBodyCurrentNode setHandlerId(String handlerId) {
            this.handlerId = handlerId;
            return this;
        }
        public String getHandlerId() {
            return this.handlerId;
        }

        public GetWorkflowInstanceResponseBodyCurrentNode setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public GetWorkflowInstanceResponseBodyCurrentNode setNodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }
        public String getNodeName() {
            return this.nodeName;
        }

        public GetWorkflowInstanceResponseBodyCurrentNode setNodeType(String nodeType) {
            this.nodeType = nodeType;
            return this;
        }
        public String getNodeType() {
            return this.nodeType;
        }

        public GetWorkflowInstanceResponseBodyCurrentNode setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class GetWorkflowInstanceResponseBodyCurrentNodes extends TeaModel {
        /**
         * <p>当前处理人展示名</p>
         * 
         * <strong>example:</strong>
         * <p>张三</p>
         */
        @NameInMap("handler")
        public String handler;

        /**
         * <p>处理人或数字员工标识</p>
         * 
         * <strong>example:</strong>
         * <p>user_10086</p>
         */
        @NameInMap("handlerId")
        public String handlerId;

        /**
         * <p>真实运行节点 nodeKey</p>
         * 
         * <strong>example:</strong>
         * <p>node_key_confirm</p>
         */
        @NameInMap("nodeId")
        public String nodeId;

        /**
         * <p>节点展示名</p>
         * 
         * <strong>example:</strong>
         * <p>需求确认</p>
         */
        @NameInMap("nodeName")
        public String nodeName;

        /**
         * <p>真实节点类型 AGENT/HUMAN/CONDITION</p>
         * 
         * <strong>example:</strong>
         * <p>AGENT</p>
         */
        @NameInMap("nodeType")
        public String nodeType;

        /**
         * <p>节点运行状态</p>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("status")
        public String status;

        public static GetWorkflowInstanceResponseBodyCurrentNodes build(java.util.Map<String, ?> map) throws Exception {
            GetWorkflowInstanceResponseBodyCurrentNodes self = new GetWorkflowInstanceResponseBodyCurrentNodes();
            return TeaModel.build(map, self);
        }

        public GetWorkflowInstanceResponseBodyCurrentNodes setHandler(String handler) {
            this.handler = handler;
            return this;
        }
        public String getHandler() {
            return this.handler;
        }

        public GetWorkflowInstanceResponseBodyCurrentNodes setHandlerId(String handlerId) {
            this.handlerId = handlerId;
            return this;
        }
        public String getHandlerId() {
            return this.handlerId;
        }

        public GetWorkflowInstanceResponseBodyCurrentNodes setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public GetWorkflowInstanceResponseBodyCurrentNodes setNodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }
        public String getNodeName() {
            return this.nodeName;
        }

        public GetWorkflowInstanceResponseBodyCurrentNodes setNodeType(String nodeType) {
            this.nodeType = nodeType;
            return this;
        }
        public String getNodeType() {
            return this.nodeType;
        }

        public GetWorkflowInstanceResponseBodyCurrentNodes setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class GetWorkflowInstanceResponseBodyProgress extends TeaModel {
        /**
         * <p>已成功或跳过的可见节点数</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("completedCount")
        public Long completedCount;

        /**
         * <p>当前图可见节点总数，非固定六节点</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("totalCount")
        public Long totalCount;

        public static GetWorkflowInstanceResponseBodyProgress build(java.util.Map<String, ?> map) throws Exception {
            GetWorkflowInstanceResponseBodyProgress self = new GetWorkflowInstanceResponseBodyProgress();
            return TeaModel.build(map, self);
        }

        public GetWorkflowInstanceResponseBodyProgress setCompletedCount(Long completedCount) {
            this.completedCount = completedCount;
            return this;
        }
        public Long getCompletedCount() {
            return this.completedCount;
        }

        public GetWorkflowInstanceResponseBodyProgress setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
