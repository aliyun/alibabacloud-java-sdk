// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class GetWorkflowInstanceResponseBody extends TeaModel {
    /**
     * <p>The unique external requirement number within the workspace.</p>
     * 
     * <strong>example:</strong>
     * <p>REQ-1001</p>
     */
    @NameInMap("businessId")
    public String businessId;

    /**
     * <p>The business status code from the unified POP response wrapper.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The ID of the collaboration workspace.</p>
     * 
     * <strong>example:</strong>
     * <p>cg_20261016_abc123</p>
     */
    @NameInMap("collaborationGroupId")
    public String collaborationGroupId;

    /**
     * <p>The creation time of the logical instance in ISO 8601 format.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-10-16T10:30:00+08:00</p>
     */
    @NameInMap("createdAt")
    public String createdAt;

    /**
     * <p>The first active node. This value is null when the instance reaches a terminal state.</p>
     */
    @NameInMap("currentNode")
    public GetWorkflowInstanceResponseBodyCurrentNode currentNode;

    /**
     * <p>All active nodes. Parallel DAGs are supported.</p>
     */
    @NameInMap("currentNodes")
    public java.util.List<GetWorkflowInstanceResponseBodyCurrentNodes> currentNodes;

    /**
     * <p>The time when the current plan reached a terminal state. This value is null if the plan has not ended.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-10-16T10:30:00+08:00</p>
     */
    @NameInMap("endedAt")
    public String endedAt;

    /**
     * <p>The external initiator label. This label is not used for authentication.</p>
     * 
     * <strong>example:</strong>
     * <p>External Initiator Zhang San</p>
     */
    @NameInMap("initiator")
    public String initiator;

    /**
     * <p>The stable logical instance ID. This ID does not change when the work item is restarted.</p>
     * 
     * <strong>example:</strong>
     * <p>wfi_20261016_abc123</p>
     */
    @NameInMap("instanceId")
    public String instanceId;

    /**
     * <p>The user-visible error description from the unified POP response wrapper.</p>
     * 
     * <strong>example:</strong>
     * <p>The requested resource does not exist</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The raw plan pause scope.</p>
     * 
     * <strong>example:</strong>
     * <p>ALL</p>
     */
    @NameInMap("pauseScope")
    public String pauseScope;

    /**
     * <p>The revision ID of the current physical plan.</p>
     * 
     * <strong>example:</strong>
     * <p>plan_20261016_abc123</p>
     */
    @NameInMap("planId")
    public String planId;

    /**
     * <p>The visible graph progress.</p>
     */
    @NameInMap("progress")
    public GetWorkflowInstanceResponseBodyProgress progress;

    /**
     * <p>The request tracking ID.</p>
     * 
     * <strong>example:</strong>
     * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The raw plan review status.</p>
     * 
     * <strong>example:</strong>
     * <p>APPROVED</p>
     */
    @NameInMap("reviewStatus")
    public String reviewStatus;

    /**
     * <p>The revision number of the current physical plan.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("revision")
    public Long revision;

    /**
     * <p>The current run ID. This ID changes after a restart.</p>
     * 
     * <strong>example:</strong>
     * <p>run_20261016_abc123</p>
     */
    @NameInMap("runId")
    public String runId;

    /**
     * <p>The raw runtime status. Valid values: BUILDING, RUNNING, SUCCEEDED, FAILED, and CANCELLED.</p>
     * 
     * <strong>example:</strong>
     * <p>RUNNING</p>
     */
    @NameInMap("runtimeStatus")
    public String runtimeStatus;

    /**
     * <p>The time when the current plan node started for the first time. This value is null if the node has not been executed.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-10-16T10:30:00+08:00</p>
     */
    @NameInMap("startedAt")
    public String startedAt;

    /**
     * <p>The runtime status version.</p>
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
     * <p>The ID of the workflow template bound at creation.</p>
     * 
     * <strong>example:</strong>
     * <p>wft_20261016_abc123</p>
     */
    @NameInMap("templateId")
    public String templateId;

    /**
     * <p>The current requirement title.</p>
     * 
     * <strong>example:</strong>
     * <p>Quarterly Business Analysis Report</p>
     */
    @NameInMap("title")
    public String title;

    /**
     * <p>The ID of the associated work item.</p>
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
         * <p>The display name of the current handler.</p>
         * 
         * <strong>example:</strong>
         * <p>Zhang San</p>
         */
        @NameInMap("handler")
        public String handler;

        /**
         * <p>The identifier of the handler or digital worker.</p>
         * 
         * <strong>example:</strong>
         * <p>user_10086</p>
         */
        @NameInMap("handlerId")
        public String handlerId;

        /**
         * <p>The nodeKey of the actual running node.</p>
         * 
         * <strong>example:</strong>
         * <p>node_key_confirm</p>
         */
        @NameInMap("nodeId")
        public String nodeId;

        /**
         * <p>The display name of the node.</p>
         * 
         * <strong>example:</strong>
         * <p>Requirement Confirmation</p>
         */
        @NameInMap("nodeName")
        public String nodeName;

        /**
         * <p>The actual node type. Valid values: AGENT, HUMAN, and CONDITION.</p>
         * 
         * <strong>example:</strong>
         * <p>AGENT</p>
         */
        @NameInMap("nodeType")
        public String nodeType;

        /**
         * <p>The running status of the node.</p>
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
         * <p>The display name of the current handler.</p>
         * 
         * <strong>example:</strong>
         * <p>Zhang San</p>
         */
        @NameInMap("handler")
        public String handler;

        /**
         * <p>The identifier of the handler or digital worker.</p>
         * 
         * <strong>example:</strong>
         * <p>user_10086</p>
         */
        @NameInMap("handlerId")
        public String handlerId;

        /**
         * <p>The nodeKey of the actual running node.</p>
         * 
         * <strong>example:</strong>
         * <p>node_key_confirm</p>
         */
        @NameInMap("nodeId")
        public String nodeId;

        /**
         * <p>The display name of the node.</p>
         * 
         * <strong>example:</strong>
         * <p>Requirement Confirmation</p>
         */
        @NameInMap("nodeName")
        public String nodeName;

        /**
         * <p>The actual node type. Valid values: AGENT, HUMAN, and CONDITION.</p>
         * 
         * <strong>example:</strong>
         * <p>AGENT</p>
         */
        @NameInMap("nodeType")
        public String nodeType;

        /**
         * <p>The running status of the node.</p>
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
         * <p>The number of visible nodes that have succeeded or been skipped.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("completedCount")
        public Long completedCount;

        /**
         * <p>The total number of visible nodes in the current graph. This number is not fixed to six.</p>
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
