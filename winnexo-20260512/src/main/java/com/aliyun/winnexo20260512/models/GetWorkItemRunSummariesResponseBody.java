// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class GetWorkItemRunSummariesResponseBody extends TeaModel {
    /**
     * <p>公共业务状态码</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>当前计划、当前轮次已经生成的运行总结；重跑受影响节点的新总结生成前不会返回旧总结</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;attemptId&quot;:&quot;attempt_example&quot;,&quot;planId&quot;:&quot;plan_example&quot;,&quot;nodeKey&quot;:&quot;query.amount&quot;,&quot;nodeStatus&quot;:&quot;COMPLETED&quot;}]</p>
     */
    @NameInMap("items")
    public java.util.List<GetWorkItemRunSummariesResponseBodyItems> items;

    /**
     * <p>公共错误描述</p>
     * 
     * <strong>example:</strong>
     * <p>请求的资源不存在</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>请求追踪ID</p>
     * 
     * <strong>example:</strong>
     * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static GetWorkItemRunSummariesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetWorkItemRunSummariesResponseBody self = new GetWorkItemRunSummariesResponseBody();
        return TeaModel.build(map, self);
    }

    public GetWorkItemRunSummariesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetWorkItemRunSummariesResponseBody setItems(java.util.List<GetWorkItemRunSummariesResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<GetWorkItemRunSummariesResponseBodyItems> getItems() {
        return this.items;
    }

    public GetWorkItemRunSummariesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetWorkItemRunSummariesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetWorkItemRunSummariesResponseBodyItemsRunSummaryTools extends TeaModel {
        /**
         * <p>工具名称</p>
         * 
         * <strong>example:</strong>
         * <p>销售分析助手</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>工具类型，如 SKILL、MCP</p>
         * 
         * <strong>example:</strong>
         * <p>AGENT</p>
         */
        @NameInMap("type")
        public String type;

        public static GetWorkItemRunSummariesResponseBodyItemsRunSummaryTools build(java.util.Map<String, ?> map) throws Exception {
            GetWorkItemRunSummariesResponseBodyItemsRunSummaryTools self = new GetWorkItemRunSummariesResponseBodyItemsRunSummaryTools();
            return TeaModel.build(map, self);
        }

        public GetWorkItemRunSummariesResponseBodyItemsRunSummaryTools setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetWorkItemRunSummariesResponseBodyItemsRunSummaryTools setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetWorkItemRunSummariesResponseBodyItems extends TeaModel {
        /**
         * <p>节点尝试 ID</p>
         * 
         * <strong>example:</strong>
         * <p>attempt_1</p>
         */
        @NameInMap("attemptId")
        public String attemptId;

        /**
         * <p>节点尝试序号，从 1 开始</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("attemptSeq")
        public Long attemptSeq;

        /**
         * <p>执行器 ID</p>
         * 
         * <strong>example:</strong>
         * <p>agent_1001</p>
         */
        @NameInMap("executorId")
        public String executorId;

        /**
         * <p>执行器名称</p>
         * 
         * <strong>example:</strong>
         * <p>销售分析助手</p>
         */
        @NameInMap("executorName")
        public String executorName;

        /**
         * <p>执行器类型，如 AGENT、HUMAN</p>
         * 
         * <strong>example:</strong>
         * <p>AGENT</p>
         */
        @NameInMap("executorType")
        public String executorType;

        /**
         * <p>节点结束时间，ISO8601 格式</p>
         * 
         * <strong>example:</strong>
         * <p>2026-11-05T08:05:00Z</p>
         */
        @NameInMap("finishedAt")
        public String finishedAt;

        /**
         * <p>节点 key</p>
         * 
         * <strong>example:</strong>
         * <p>query.amount</p>
         */
        @NameInMap("nodeKey")
        public String nodeKey;

        /**
         * <p>节点名称</p>
         * 
         * <strong>example:</strong>
         * <p>查询销售金额</p>
         */
        @NameInMap("nodeName")
        public String nodeName;

        /**
         * <p>节点状态，如 COMPLETED、FAILED</p>
         * 
         * <strong>example:</strong>
         * <p>COMPLETED</p>
         */
        @NameInMap("nodeStatus")
        public String nodeStatus;

        /**
         * <p>所属物理计划 ID</p>
         * 
         * <strong>example:</strong>
         * <p>plan_v3</p>
         */
        @NameInMap("planId")
        public String planId;

        /**
         * <p>节点执行结果，JSON 对象</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;rows&quot;:3}</p>
         */
        @NameInMap("result")
        public Object result;

        /**
         * <p>运行总结正文；未生成时为空</p>
         * 
         * <strong>example:</strong>
         * <p>已完成销售金额查询，共返回 3 行数据</p>
         */
        @NameInMap("runSummary")
        public Object runSummary;

        /**
         * <p>运行总结失败原因；成功时为空</p>
         * 
         * <strong>example:</strong>
         * <p>模型调用超时</p>
         */
        @NameInMap("runSummaryError")
        public String runSummaryError;

        /**
         * <p>运行总结生成时间，ISO8601 格式</p>
         * 
         * <strong>example:</strong>
         * <p>2026-11-05T08:06:00Z</p>
         */
        @NameInMap("runSummaryGeneratedAt")
        public String runSummaryGeneratedAt;

        /**
         * <p>运行总结引用的数据来源列表</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;name&quot;:&quot;report.md&quot;}]</p>
         */
        @NameInMap("runSummarySources")
        public java.util.List<?> runSummarySources;

        /**
         * <p>运行总结生成状态，如 COMPLETED、FAILED、PROCESSING</p>
         * 
         * <strong>example:</strong>
         * <p>COMPLETED</p>
         */
        @NameInMap("runSummaryStatus")
        public String runSummaryStatus;

        /**
         * <p>运行总结使用的工具列表</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;type&quot;:&quot;SKILL&quot;,&quot;name&quot;:&quot;sql_query&quot;}]</p>
         */
        @NameInMap("runSummaryTools")
        public java.util.List<GetWorkItemRunSummariesResponseBodyItemsRunSummaryTools> runSummaryTools;

        /**
         * <p>节点开始时间，ISO8601 格式</p>
         * 
         * <strong>example:</strong>
         * <p>2026-11-05T08:00:00Z</p>
         */
        @NameInMap("startedAt")
        public String startedAt;

        /**
         * <p>节点轮次序号，从 1 开始</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("turnSeq")
        public Long turnSeq;

        public static GetWorkItemRunSummariesResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            GetWorkItemRunSummariesResponseBodyItems self = new GetWorkItemRunSummariesResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public GetWorkItemRunSummariesResponseBodyItems setAttemptId(String attemptId) {
            this.attemptId = attemptId;
            return this;
        }
        public String getAttemptId() {
            return this.attemptId;
        }

        public GetWorkItemRunSummariesResponseBodyItems setAttemptSeq(Long attemptSeq) {
            this.attemptSeq = attemptSeq;
            return this;
        }
        public Long getAttemptSeq() {
            return this.attemptSeq;
        }

        public GetWorkItemRunSummariesResponseBodyItems setExecutorId(String executorId) {
            this.executorId = executorId;
            return this;
        }
        public String getExecutorId() {
            return this.executorId;
        }

        public GetWorkItemRunSummariesResponseBodyItems setExecutorName(String executorName) {
            this.executorName = executorName;
            return this;
        }
        public String getExecutorName() {
            return this.executorName;
        }

        public GetWorkItemRunSummariesResponseBodyItems setExecutorType(String executorType) {
            this.executorType = executorType;
            return this;
        }
        public String getExecutorType() {
            return this.executorType;
        }

        public GetWorkItemRunSummariesResponseBodyItems setFinishedAt(String finishedAt) {
            this.finishedAt = finishedAt;
            return this;
        }
        public String getFinishedAt() {
            return this.finishedAt;
        }

        public GetWorkItemRunSummariesResponseBodyItems setNodeKey(String nodeKey) {
            this.nodeKey = nodeKey;
            return this;
        }
        public String getNodeKey() {
            return this.nodeKey;
        }

        public GetWorkItemRunSummariesResponseBodyItems setNodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }
        public String getNodeName() {
            return this.nodeName;
        }

        public GetWorkItemRunSummariesResponseBodyItems setNodeStatus(String nodeStatus) {
            this.nodeStatus = nodeStatus;
            return this;
        }
        public String getNodeStatus() {
            return this.nodeStatus;
        }

        public GetWorkItemRunSummariesResponseBodyItems setPlanId(String planId) {
            this.planId = planId;
            return this;
        }
        public String getPlanId() {
            return this.planId;
        }

        public GetWorkItemRunSummariesResponseBodyItems setResult(Object result) {
            this.result = result;
            return this;
        }
        public Object getResult() {
            return this.result;
        }

        public GetWorkItemRunSummariesResponseBodyItems setRunSummary(Object runSummary) {
            this.runSummary = runSummary;
            return this;
        }
        public Object getRunSummary() {
            return this.runSummary;
        }

        public GetWorkItemRunSummariesResponseBodyItems setRunSummaryError(String runSummaryError) {
            this.runSummaryError = runSummaryError;
            return this;
        }
        public String getRunSummaryError() {
            return this.runSummaryError;
        }

        public GetWorkItemRunSummariesResponseBodyItems setRunSummaryGeneratedAt(String runSummaryGeneratedAt) {
            this.runSummaryGeneratedAt = runSummaryGeneratedAt;
            return this;
        }
        public String getRunSummaryGeneratedAt() {
            return this.runSummaryGeneratedAt;
        }

        public GetWorkItemRunSummariesResponseBodyItems setRunSummarySources(java.util.List<?> runSummarySources) {
            this.runSummarySources = runSummarySources;
            return this;
        }
        public java.util.List<?> getRunSummarySources() {
            return this.runSummarySources;
        }

        public GetWorkItemRunSummariesResponseBodyItems setRunSummaryStatus(String runSummaryStatus) {
            this.runSummaryStatus = runSummaryStatus;
            return this;
        }
        public String getRunSummaryStatus() {
            return this.runSummaryStatus;
        }

        public GetWorkItemRunSummariesResponseBodyItems setRunSummaryTools(java.util.List<GetWorkItemRunSummariesResponseBodyItemsRunSummaryTools> runSummaryTools) {
            this.runSummaryTools = runSummaryTools;
            return this;
        }
        public java.util.List<GetWorkItemRunSummariesResponseBodyItemsRunSummaryTools> getRunSummaryTools() {
            return this.runSummaryTools;
        }

        public GetWorkItemRunSummariesResponseBodyItems setStartedAt(String startedAt) {
            this.startedAt = startedAt;
            return this;
        }
        public String getStartedAt() {
            return this.startedAt;
        }

        public GetWorkItemRunSummariesResponseBodyItems setTurnSeq(Long turnSeq) {
            this.turnSeq = turnSeq;
            return this;
        }
        public Long getTurnSeq() {
            return this.turnSeq;
        }

    }

}
