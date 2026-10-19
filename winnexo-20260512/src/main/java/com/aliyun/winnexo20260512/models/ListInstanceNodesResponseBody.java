// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class ListInstanceNodesResponseBody extends TeaModel {
    /**
     * <p>业务状态码；成功为200</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>物理实例ID</p>
     * 
     * <strong>example:</strong>
     * <p>plan_example</p>
     */
    @NameInMap("instanceId")
    public String instanceId;

    /**
     * <p>错误描述</p>
     * 
     * <strong>example:</strong>
     * <p>请求的资源不存在</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>按拓扑顺序排列的可见节点，数量由实际动态图决定</p>
     * 
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("nodes")
    public java.util.List<ListInstanceNodesResponseBodyNodes> nodes;

    /**
     * <p>请求追踪ID</p>
     * 
     * <strong>example:</strong>
     * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>状态版本</p>
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
         * <p>节点结果结论，无结论时为空</p>
         * 
         * <strong>example:</strong>
         * <p>分析完成</p>
         */
        @NameInMap("conclusion")
        public String conclusion;

        /**
         * <p>从首次运行到终态的整秒数，缺时间时为空</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("duration")
        public Long duration;

        /**
         * <p>节点首次运行时间，历史或未运行节点为空</p>
         * 
         * <strong>example:</strong>
         * <p>2026-10-14T08:00:00Z</p>
         */
        @NameInMap("enteredAt")
        public String enteredAt;

        /**
         * <p>节点实际进入终态的时间，未结束时为空</p>
         * 
         * <strong>example:</strong>
         * <p>2026-10-14T08:02:03Z</p>
         */
        @NameInMap("finishedAt")
        public String finishedAt;

        /**
         * <p>节点负责人展示名称，未知时为空</p>
         * 
         * <strong>example:</strong>
         * <p>客户成功经理助理</p>
         */
        @NameInMap("handler")
        public String handler;

        /**
         * <p>节点在工作流图中的泳道位置</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("lane")
        public Long lane;

        /**
         * <p>所属节点key（nodeKey），不是会话ID</p>
         * 
         * <strong>example:</strong>
         * <p>query.amount</p>
         */
        @NameInMap("nodeId")
        public String nodeId;

        /**
         * <p>节点展示名称</p>
         * 
         * <strong>example:</strong>
         * <p>查询签单金额</p>
         */
        @NameInMap("nodeName")
        public String nodeName;

        /**
         * <p>节点在返回拓扑列表中的展示序号，从1开始</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("nodeOrder")
        public Long nodeOrder;

        /**
         * <p>实际节点类型，例如AGENT或HUMAN</p>
         * 
         * <strong>example:</strong>
         * <p>AGENT</p>
         */
        @NameInMap("nodeType")
        public String nodeType;

        /**
         * <p>节点在工作流图中的层级，从0开始</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("rank")
        public Long rank;

        /**
         * <p>原始节点运行状态，例如READY、RUNNING、WAITING、SUCCEEDED或FAILED</p>
         * 
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>等待原因：HUMAN_INPUT、HUMAN_STEP、REVIEW、MANUAL_PAUSE或UNBLOCK；未等待时为空</p>
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
