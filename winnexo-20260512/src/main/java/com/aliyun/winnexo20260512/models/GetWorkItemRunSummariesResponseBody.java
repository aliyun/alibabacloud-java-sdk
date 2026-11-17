// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class GetWorkItemRunSummariesResponseBody extends TeaModel {
    /**
     * <p>The common business status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The execution summaries generated for the current plan and current turn. Previous summaries are not returned until new summaries are generated for affected nodes that are re-run.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;attemptId&quot;:&quot;attempt_1&quot;,&quot;planId&quot;:&quot;plan_v3&quot;,&quot;nodeKey&quot;:&quot;query.amount&quot;,&quot;nodeStatus&quot;:&quot;COMPLETED&quot;}]</p>
     */
    @NameInMap("items")
    public java.util.List<GetWorkItemRunSummariesResponseBodyItems> items;

    /**
     * <p>The common error description.</p>
     * 
     * <strong>example:</strong>
     * <p>The requested resource does not exist</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The request tracking ID.</p>
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
         * <p>The name of the tool.</p>
         * 
         * <strong>example:</strong>
         * <p>Sales Analysis Assistant</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The tool type, such as SKILL or MCP.</p>
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
         * <p>The ID of the node attempt.</p>
         * 
         * <strong>example:</strong>
         * <p>attempt_1</p>
         */
        @NameInMap("attemptId")
        public String attemptId;

        /**
         * <p>The sequence number of the node attempt, starting from 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("attemptSeq")
        public Long attemptSeq;

        /**
         * <p>The ID of the executor.</p>
         * 
         * <strong>example:</strong>
         * <p>agent_1001</p>
         */
        @NameInMap("executorId")
        public String executorId;

        /**
         * <p>The name of the executor.</p>
         * 
         * <strong>example:</strong>
         * <p>Sales Analysis Assistant</p>
         */
        @NameInMap("executorName")
        public String executorName;

        /**
         * <p>The executor type, such as AGENT or HUMAN.</p>
         * 
         * <strong>example:</strong>
         * <p>AGENT</p>
         */
        @NameInMap("executorType")
        public String executorType;

        /**
         * <p>The end time of the node, in ISO 8601 format.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-11-05T08:05:00Z</p>
         */
        @NameInMap("finishedAt")
        public String finishedAt;

        /**
         * <p>The node key.</p>
         * 
         * <strong>example:</strong>
         * <p>query.amount</p>
         */
        @NameInMap("nodeKey")
        public String nodeKey;

        /**
         * <p>The name of the node.</p>
         * 
         * <strong>example:</strong>
         * <p>Query sales amount</p>
         */
        @NameInMap("nodeName")
        public String nodeName;

        /**
         * <p>The node status, such as COMPLETED or FAILED.</p>
         * 
         * <strong>example:</strong>
         * <p>COMPLETED</p>
         */
        @NameInMap("nodeStatus")
        public String nodeStatus;

        /**
         * <p>The ID of the associated physical plan.</p>
         * 
         * <strong>example:</strong>
         * <p>plan_v3</p>
         */
        @NameInMap("planId")
        public String planId;

        /**
         * <p>The execution result of the node, as a JSON object.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;rows&quot;:3}</p>
         */
        @NameInMap("result")
        public Object result;

        /**
         * <p>The content of the execution summary. This field is empty if the summary is not generated.</p>
         * 
         * <strong>example:</strong>
         * <p>Completed the sales amount query, returning a total of 3 rows of data</p>
         */
        @NameInMap("runSummary")
        public Object runSummary;

        /**
         * <p>The reason for the execution summary failure. This field is empty if the generation is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>Model invocation timed out</p>
         */
        @NameInMap("runSummaryError")
        public String runSummaryError;

        /**
         * <p>The generation time of the execution summary, in ISO 8601 format.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-11-05T08:06:00Z</p>
         */
        @NameInMap("runSummaryGeneratedAt")
        public String runSummaryGeneratedAt;

        /**
         * <p>The list of data sources referenced in the execution summary.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;name&quot;:&quot;report.md&quot;}]</p>
         */
        @NameInMap("runSummarySources")
        public java.util.List<?> runSummarySources;

        /**
         * <p>The generation status of the execution summary, such as COMPLETED, FAILED, or PROCESSING.</p>
         * 
         * <strong>example:</strong>
         * <p>COMPLETED</p>
         */
        @NameInMap("runSummaryStatus")
        public String runSummaryStatus;

        /**
         * <p>The list of tools used in the execution summary.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;type&quot;:&quot;SKILL&quot;,&quot;name&quot;:&quot;sql_query&quot;}]</p>
         */
        @NameInMap("runSummaryTools")
        public java.util.List<GetWorkItemRunSummariesResponseBodyItemsRunSummaryTools> runSummaryTools;

        /**
         * <p>The start time of the node, in ISO 8601 format.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-11-05T08:00:00Z</p>
         */
        @NameInMap("startedAt")
        public String startedAt;

        /**
         * <p>The sequence number of the node turn, starting from 1.</p>
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
