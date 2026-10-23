// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class ListWorkflowInstancesResponseBody extends TeaModel {
    /**
     * <p>The business status code from the unified POP response wrapper.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The list of instances on the current page.</p>
     */
    @NameInMap("items")
    public java.util.List<ListWorkflowInstancesResponseBodyItems> items;

    /**
     * <p>The user-visible error message from the unified POP response wrapper.</p>
     * 
     * <strong>example:</strong>
     * <p>The requested resource does not exist</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The current page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("page")
    public Long page;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("pageSize")
    public Long pageSize;

    /**
     * <p>The request tracking ID.</p>
     * 
     * <strong>example:</strong>
     * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The total number of visible instances after filtering.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("total")
    public Long total;

    public static ListWorkflowInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListWorkflowInstancesResponseBody self = new ListWorkflowInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListWorkflowInstancesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListWorkflowInstancesResponseBody setItems(java.util.List<ListWorkflowInstancesResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<ListWorkflowInstancesResponseBodyItems> getItems() {
        return this.items;
    }

    public ListWorkflowInstancesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListWorkflowInstancesResponseBody setPage(Long page) {
        this.page = page;
        return this;
    }
    public Long getPage() {
        return this.page;
    }

    public ListWorkflowInstancesResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListWorkflowInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListWorkflowInstancesResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public static class ListWorkflowInstancesResponseBodyItemsCurrentNode extends TeaModel {
        /**
         * <p>The display name of the current handler.</p>
         * 
         * <strong>example:</strong>
         * <p>Zhang San</p>
         */
        @NameInMap("handler")
        public String handler;

        /**
         * <p>The identifier of the handler or digital employee.</p>
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
         * <p>Requirement confirmation</p>
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

        public static ListWorkflowInstancesResponseBodyItemsCurrentNode build(java.util.Map<String, ?> map) throws Exception {
            ListWorkflowInstancesResponseBodyItemsCurrentNode self = new ListWorkflowInstancesResponseBodyItemsCurrentNode();
            return TeaModel.build(map, self);
        }

        public ListWorkflowInstancesResponseBodyItemsCurrentNode setHandler(String handler) {
            this.handler = handler;
            return this;
        }
        public String getHandler() {
            return this.handler;
        }

        public ListWorkflowInstancesResponseBodyItemsCurrentNode setHandlerId(String handlerId) {
            this.handlerId = handlerId;
            return this;
        }
        public String getHandlerId() {
            return this.handlerId;
        }

        public ListWorkflowInstancesResponseBodyItemsCurrentNode setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public ListWorkflowInstancesResponseBodyItemsCurrentNode setNodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }
        public String getNodeName() {
            return this.nodeName;
        }

        public ListWorkflowInstancesResponseBodyItemsCurrentNode setNodeType(String nodeType) {
            this.nodeType = nodeType;
            return this;
        }
        public String getNodeType() {
            return this.nodeType;
        }

        public ListWorkflowInstancesResponseBodyItemsCurrentNode setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class ListWorkflowInstancesResponseBodyItemsCurrentNodes extends TeaModel {
        /**
         * <p>The display name of the current handler.</p>
         * 
         * <strong>example:</strong>
         * <p>Zhang San</p>
         */
        @NameInMap("handler")
        public String handler;

        /**
         * <p>The identifier of the handler or digital employee.</p>
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
         * <p>Requirement confirmation</p>
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

        public static ListWorkflowInstancesResponseBodyItemsCurrentNodes build(java.util.Map<String, ?> map) throws Exception {
            ListWorkflowInstancesResponseBodyItemsCurrentNodes self = new ListWorkflowInstancesResponseBodyItemsCurrentNodes();
            return TeaModel.build(map, self);
        }

        public ListWorkflowInstancesResponseBodyItemsCurrentNodes setHandler(String handler) {
            this.handler = handler;
            return this;
        }
        public String getHandler() {
            return this.handler;
        }

        public ListWorkflowInstancesResponseBodyItemsCurrentNodes setHandlerId(String handlerId) {
            this.handlerId = handlerId;
            return this;
        }
        public String getHandlerId() {
            return this.handlerId;
        }

        public ListWorkflowInstancesResponseBodyItemsCurrentNodes setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public ListWorkflowInstancesResponseBodyItemsCurrentNodes setNodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }
        public String getNodeName() {
            return this.nodeName;
        }

        public ListWorkflowInstancesResponseBodyItemsCurrentNodes setNodeType(String nodeType) {
            this.nodeType = nodeType;
            return this;
        }
        public String getNodeType() {
            return this.nodeType;
        }

        public ListWorkflowInstancesResponseBodyItemsCurrentNodes setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class ListWorkflowInstancesResponseBodyItemsProgress extends TeaModel {
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

        public static ListWorkflowInstancesResponseBodyItemsProgress build(java.util.Map<String, ?> map) throws Exception {
            ListWorkflowInstancesResponseBodyItemsProgress self = new ListWorkflowInstancesResponseBodyItemsProgress();
            return TeaModel.build(map, self);
        }

        public ListWorkflowInstancesResponseBodyItemsProgress setCompletedCount(Long completedCount) {
            this.completedCount = completedCount;
            return this;
        }
        public Long getCompletedCount() {
            return this.completedCount;
        }

        public ListWorkflowInstancesResponseBodyItemsProgress setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

    public static class ListWorkflowInstancesResponseBodyItems extends TeaModel {
        /**
         * <p>The unique external requirement ID in the space.</p>
         * 
         * <strong>example:</strong>
         * <p>REQ-1001</p>
         */
        @NameInMap("businessId")
        public String businessId;

        /**
         * <p>The collaboration space ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cg_20261016_abc123</p>
         */
        @NameInMap("collaborationGroupId")
        public String collaborationGroupId;

        /**
         * <p>The time when the logical instance was created. The time is in the ISO 8601 format.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-10-16T10:30:00+08:00</p>
         */
        @NameInMap("createdAt")
        public String createdAt;

        /**
         * <p>The first active node. This value is null if the instance is in a terminal state.</p>
         */
        @NameInMap("currentNode")
        public ListWorkflowInstancesResponseBodyItemsCurrentNode currentNode;

        /**
         * <p>All active nodes. Parallel DAGs are supported.</p>
         */
        @NameInMap("currentNodes")
        public java.util.List<ListWorkflowInstancesResponseBodyItemsCurrentNodes> currentNodes;

        /**
         * <p>The time when the current plan reached a terminal state. This value is null if the plan has not ended.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-10-16T10:30:00+08:00</p>
         */
        @NameInMap("endedAt")
        public String endedAt;

        /**
         * <p>The external initiator tag. This tag is not used for authentication.</p>
         * 
         * <strong>example:</strong>
         * <p>External initiator Zhang San</p>
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
         * <p>The original plan pause scope.</p>
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
         * <p>The progress of the visible graph.</p>
         */
        @NameInMap("progress")
        public ListWorkflowInstancesResponseBodyItemsProgress progress;

        /**
         * <p>The original plan review status.</p>
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
         * <p>The original runtime status. Valid values: BUILDING, RUNNING, SUCCEEDED, FAILED, and CANCELLED.</p>
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
         * <p>Quarterly business analysis report</p>
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

        public static ListWorkflowInstancesResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            ListWorkflowInstancesResponseBodyItems self = new ListWorkflowInstancesResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public ListWorkflowInstancesResponseBodyItems setBusinessId(String businessId) {
            this.businessId = businessId;
            return this;
        }
        public String getBusinessId() {
            return this.businessId;
        }

        public ListWorkflowInstancesResponseBodyItems setCollaborationGroupId(String collaborationGroupId) {
            this.collaborationGroupId = collaborationGroupId;
            return this;
        }
        public String getCollaborationGroupId() {
            return this.collaborationGroupId;
        }

        public ListWorkflowInstancesResponseBodyItems setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public ListWorkflowInstancesResponseBodyItems setCurrentNode(ListWorkflowInstancesResponseBodyItemsCurrentNode currentNode) {
            this.currentNode = currentNode;
            return this;
        }
        public ListWorkflowInstancesResponseBodyItemsCurrentNode getCurrentNode() {
            return this.currentNode;
        }

        public ListWorkflowInstancesResponseBodyItems setCurrentNodes(java.util.List<ListWorkflowInstancesResponseBodyItemsCurrentNodes> currentNodes) {
            this.currentNodes = currentNodes;
            return this;
        }
        public java.util.List<ListWorkflowInstancesResponseBodyItemsCurrentNodes> getCurrentNodes() {
            return this.currentNodes;
        }

        public ListWorkflowInstancesResponseBodyItems setEndedAt(String endedAt) {
            this.endedAt = endedAt;
            return this;
        }
        public String getEndedAt() {
            return this.endedAt;
        }

        public ListWorkflowInstancesResponseBodyItems setInitiator(String initiator) {
            this.initiator = initiator;
            return this;
        }
        public String getInitiator() {
            return this.initiator;
        }

        public ListWorkflowInstancesResponseBodyItems setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListWorkflowInstancesResponseBodyItems setPauseScope(String pauseScope) {
            this.pauseScope = pauseScope;
            return this;
        }
        public String getPauseScope() {
            return this.pauseScope;
        }

        public ListWorkflowInstancesResponseBodyItems setPlanId(String planId) {
            this.planId = planId;
            return this;
        }
        public String getPlanId() {
            return this.planId;
        }

        public ListWorkflowInstancesResponseBodyItems setProgress(ListWorkflowInstancesResponseBodyItemsProgress progress) {
            this.progress = progress;
            return this;
        }
        public ListWorkflowInstancesResponseBodyItemsProgress getProgress() {
            return this.progress;
        }

        public ListWorkflowInstancesResponseBodyItems setReviewStatus(String reviewStatus) {
            this.reviewStatus = reviewStatus;
            return this;
        }
        public String getReviewStatus() {
            return this.reviewStatus;
        }

        public ListWorkflowInstancesResponseBodyItems setRevision(Long revision) {
            this.revision = revision;
            return this;
        }
        public Long getRevision() {
            return this.revision;
        }

        public ListWorkflowInstancesResponseBodyItems setRunId(String runId) {
            this.runId = runId;
            return this;
        }
        public String getRunId() {
            return this.runId;
        }

        public ListWorkflowInstancesResponseBodyItems setRuntimeStatus(String runtimeStatus) {
            this.runtimeStatus = runtimeStatus;
            return this;
        }
        public String getRuntimeStatus() {
            return this.runtimeStatus;
        }

        public ListWorkflowInstancesResponseBodyItems setStartedAt(String startedAt) {
            this.startedAt = startedAt;
            return this;
        }
        public String getStartedAt() {
            return this.startedAt;
        }

        public ListWorkflowInstancesResponseBodyItems setStateVersion(Long stateVersion) {
            this.stateVersion = stateVersion;
            return this;
        }
        public Long getStateVersion() {
            return this.stateVersion;
        }

        public ListWorkflowInstancesResponseBodyItems setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListWorkflowInstancesResponseBodyItems setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

        public ListWorkflowInstancesResponseBodyItems setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public ListWorkflowInstancesResponseBodyItems setWorkItemId(String workItemId) {
            this.workItemId = workItemId;
            return this;
        }
        public String getWorkItemId() {
            return this.workItemId;
        }

    }

}
