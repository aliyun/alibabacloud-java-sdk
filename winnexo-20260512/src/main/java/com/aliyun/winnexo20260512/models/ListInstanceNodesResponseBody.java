// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class ListInstanceNodesResponseBody extends TeaModel {
    /**
     * <p>The business status code. A value of 200 indicates success.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The physical instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>plan_example</p>
     */
    @NameInMap("instanceId")
    public String instanceId;

    /**
     * <p>The error description.</p>
     * 
     * <strong>example:</strong>
     * <p>The requested resource does not exist</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The visible nodes arranged in topological order. The number of nodes is determined by the actual dynamic graph.</p>
     * 
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("nodes")
    public java.util.List<ListInstanceNodesResponseBodyNodes> nodes;

    /**
     * <p>The request tracking ID.</p>
     * 
     * <strong>example:</strong>
     * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The state version.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("stateVersion")
    public Long stateVersion;

    public static ListInstanceNodesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListInstanceNodesResponseBody self = new ListInstanceNodesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListInstanceNodesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListInstanceNodesResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListInstanceNodesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListInstanceNodesResponseBody setNodes(java.util.List<ListInstanceNodesResponseBodyNodes> nodes) {
        this.nodes = nodes;
        return this;
    }
    public java.util.List<ListInstanceNodesResponseBodyNodes> getNodes() {
        return this.nodes;
    }

    public ListInstanceNodesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListInstanceNodesResponseBody setStateVersion(Long stateVersion) {
        this.stateVersion = stateVersion;
        return this;
    }
    public Long getStateVersion() {
        return this.stateVersion;
    }

    public static class ListInstanceNodesResponseBodyNodes extends TeaModel {
        /**
         * <p>The conclusion of the node result. This field is empty if there is no conclusion.</p>
         * 
         * <strong>example:</strong>
         * <p>Analysis completed</p>
         */
        @NameInMap("conclusion")
        public String conclusion;

        /**
         * <p>The total number of seconds from the first run to the desired state. This field is empty if the time is missing.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("duration")
        public Long duration;

        /**
         * <p>The time when the node was first run. This field is empty for historical or unrun nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-10-14T08:00:00Z</p>
         */
        @NameInMap("enteredAt")
        public String enteredAt;

        /**
         * <p>The time when the node actually entered the desired state. This field is empty if the node has not finished.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-10-14T08:02:03Z</p>
         */
        @NameInMap("finishedAt")
        public String finishedAt;

        /**
         * <p>The display name of the node assignee. This field is empty if the assignee is unknown.</p>
         * 
         * <strong>example:</strong>
         * <p>Assistant Customer Success Manager (CSM)</p>
         */
        @NameInMap("handler")
        public String handler;

        /**
         * <p>The lane position of the node in the workflow graph.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("lane")
        public Long lane;

        /**
         * <p>The key of the node (nodeKey). This is not the session ID.</p>
         * 
         * <strong>example:</strong>
         * <p>query.amount</p>
         */
        @NameInMap("nodeId")
        public String nodeId;

        /**
         * <p>The display name of the node.</p>
         * 
         * <strong>example:</strong>
         * <p>Query signed contract amount</p>
         */
        @NameInMap("nodeName")
        public String nodeName;

        /**
         * <p>The display sequence number of the node in the returned topology list, starting from 1.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("nodeOrder")
        public Long nodeOrder;

        /**
         * <p>The actual node type, such as AGENT or HUMAN.</p>
         * 
         * <strong>example:</strong>
         * <p>AGENT</p>
         */
        @NameInMap("nodeType")
        public String nodeType;

        /**
         * <p>The level of the node in the workflow graph, starting from 0.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("rank")
        public Long rank;

        /**
         * <p>The original running status of the node, such as READY, RUNNING, WAITING, SUCCEEDED, or FAILED.</p>
         * 
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The reason for waiting, such as HUMAN_INPUT, HUMAN_STEP, REVIEW, MANUAL_PAUSE, or UNBLOCK. This field is empty if the node is not waiting.</p>
         * 
         * <strong>example:</strong>
         * <p>REVIEW</p>
         */
        @NameInMap("waitType")
        public String waitType;

        public static ListInstanceNodesResponseBodyNodes build(java.util.Map<String, ?> map) throws Exception {
            ListInstanceNodesResponseBodyNodes self = new ListInstanceNodesResponseBodyNodes();
            return TeaModel.build(map, self);
        }

        public ListInstanceNodesResponseBodyNodes setConclusion(String conclusion) {
            this.conclusion = conclusion;
            return this;
        }
        public String getConclusion() {
            return this.conclusion;
        }

        public ListInstanceNodesResponseBodyNodes setDuration(Long duration) {
            this.duration = duration;
            return this;
        }
        public Long getDuration() {
            return this.duration;
        }

        public ListInstanceNodesResponseBodyNodes setEnteredAt(String enteredAt) {
            this.enteredAt = enteredAt;
            return this;
        }
        public String getEnteredAt() {
            return this.enteredAt;
        }

        public ListInstanceNodesResponseBodyNodes setFinishedAt(String finishedAt) {
            this.finishedAt = finishedAt;
            return this;
        }
        public String getFinishedAt() {
            return this.finishedAt;
        }

        public ListInstanceNodesResponseBodyNodes setHandler(String handler) {
            this.handler = handler;
            return this;
        }
        public String getHandler() {
            return this.handler;
        }

        public ListInstanceNodesResponseBodyNodes setLane(Long lane) {
            this.lane = lane;
            return this;
        }
        public Long getLane() {
            return this.lane;
        }

        public ListInstanceNodesResponseBodyNodes setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public ListInstanceNodesResponseBodyNodes setNodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }
        public String getNodeName() {
            return this.nodeName;
        }

        public ListInstanceNodesResponseBodyNodes setNodeOrder(Long nodeOrder) {
            this.nodeOrder = nodeOrder;
            return this;
        }
        public Long getNodeOrder() {
            return this.nodeOrder;
        }

        public ListInstanceNodesResponseBodyNodes setNodeType(String nodeType) {
            this.nodeType = nodeType;
            return this;
        }
        public String getNodeType() {
            return this.nodeType;
        }

        public ListInstanceNodesResponseBodyNodes setRank(Long rank) {
            this.rank = rank;
            return this;
        }
        public Long getRank() {
            return this.rank;
        }

        public ListInstanceNodesResponseBodyNodes setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListInstanceNodesResponseBodyNodes setWaitType(String waitType) {
            this.waitType = waitType;
            return this;
        }
        public String getWaitType() {
            return this.waitType;
        }

    }

}
