// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryTSTopologyInstanceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Data")
    public QueryTSTopologyInstanceResponseBodyData data;

    public static QueryTSTopologyInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryTSTopologyInstanceResponseBody self = new QueryTSTopologyInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryTSTopologyInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryTSTopologyInstanceResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryTSTopologyInstanceResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryTSTopologyInstanceResponseBody setData(QueryTSTopologyInstanceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryTSTopologyInstanceResponseBodyData getData() {
        return this.data;
    }

    public static class QueryTSTopologyInstanceResponseBodyDataEdges extends TeaModel {
        @NameInMap("ConditionValue")
        public Boolean conditionValue;

        @NameInMap("Source")
        public String source;

        @NameInMap("Status")
        public String status;

        @NameInMap("Target")
        public String target;

        public static QueryTSTopologyInstanceResponseBodyDataEdges build(java.util.Map<String, ?> map) throws Exception {
            QueryTSTopologyInstanceResponseBodyDataEdges self = new QueryTSTopologyInstanceResponseBodyDataEdges();
            return TeaModel.build(map, self);
        }

        public QueryTSTopologyInstanceResponseBodyDataEdges setConditionValue(Boolean conditionValue) {
            this.conditionValue = conditionValue;
            return this;
        }
        public Boolean getConditionValue() {
            return this.conditionValue;
        }

        public QueryTSTopologyInstanceResponseBodyDataEdges setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public QueryTSTopologyInstanceResponseBodyDataEdges setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryTSTopologyInstanceResponseBodyDataEdges setTarget(String target) {
            this.target = target;
            return this;
        }
        public String getTarget() {
            return this.target;
        }

    }

    public static class QueryTSTopologyInstanceResponseBodyDataNodesActivityEvents extends TeaModel {
        @NameInMap("ActivityId")
        public Long activityId;

        @NameInMap("Extra")
        public String extra;

        @NameInMap("Id")
        public Long id;

        @NameInMap("ProcessId")
        public Long processId;

        @NameInMap("Type")
        public String type;

        public static QueryTSTopologyInstanceResponseBodyDataNodesActivityEvents build(java.util.Map<String, ?> map) throws Exception {
            QueryTSTopologyInstanceResponseBodyDataNodesActivityEvents self = new QueryTSTopologyInstanceResponseBodyDataNodesActivityEvents();
            return TeaModel.build(map, self);
        }

        public QueryTSTopologyInstanceResponseBodyDataNodesActivityEvents setActivityId(Long activityId) {
            this.activityId = activityId;
            return this;
        }
        public Long getActivityId() {
            return this.activityId;
        }

        public QueryTSTopologyInstanceResponseBodyDataNodesActivityEvents setExtra(String extra) {
            this.extra = extra;
            return this;
        }
        public String getExtra() {
            return this.extra;
        }

        public QueryTSTopologyInstanceResponseBodyDataNodesActivityEvents setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QueryTSTopologyInstanceResponseBodyDataNodesActivityEvents setProcessId(Long processId) {
            this.processId = processId;
            return this;
        }
        public Long getProcessId() {
            return this.processId;
        }

        public QueryTSTopologyInstanceResponseBodyDataNodesActivityEvents setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class QueryTSTopologyInstanceResponseBodyDataNodesEvents extends TeaModel {
        @NameInMap("ActivityId")
        public Long activityId;

        @NameInMap("Extra")
        public String extra;

        @NameInMap("Id")
        public Long id;

        @NameInMap("ProcessId")
        public Long processId;

        @NameInMap("Type")
        public String type;

        public static QueryTSTopologyInstanceResponseBodyDataNodesEvents build(java.util.Map<String, ?> map) throws Exception {
            QueryTSTopologyInstanceResponseBodyDataNodesEvents self = new QueryTSTopologyInstanceResponseBodyDataNodesEvents();
            return TeaModel.build(map, self);
        }

        public QueryTSTopologyInstanceResponseBodyDataNodesEvents setActivityId(Long activityId) {
            this.activityId = activityId;
            return this;
        }
        public Long getActivityId() {
            return this.activityId;
        }

        public QueryTSTopologyInstanceResponseBodyDataNodesEvents setExtra(String extra) {
            this.extra = extra;
            return this;
        }
        public String getExtra() {
            return this.extra;
        }

        public QueryTSTopologyInstanceResponseBodyDataNodesEvents setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QueryTSTopologyInstanceResponseBodyDataNodesEvents setProcessId(Long processId) {
            this.processId = processId;
            return this;
        }
        public Long getProcessId() {
            return this.processId;
        }

        public QueryTSTopologyInstanceResponseBodyDataNodesEvents setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class QueryTSTopologyInstanceResponseBodyDataNodes extends TeaModel {
        @NameInMap("ActivityId")
        public Long activityId;

        @NameInMap("ActivityInstanceId")
        public Long activityInstanceId;

        @NameInMap("App")
        public String app;

        @NameInMap("CanSuspend")
        public Boolean canSuspend;

        @NameInMap("Comment")
        public String comment;

        @NameInMap("Condition")
        public String condition;

        @NameInMap("Consume")
        public Long consume;

        @NameInMap("CreateTimestamp")
        public Long createTimestamp;

        @NameInMap("CurSharding")
        public Long curSharding;

        @NameInMap("GmtBegin")
        public String gmtBegin;

        @NameInMap("GmtEnd")
        public String gmtEnd;

        @NameInMap("Id")
        public Long id;

        @NameInMap("IsInShardingGateway")
        public Boolean isInShardingGateway;

        @NameInMap("JobDes")
        public String jobDes;

        @NameInMap("JobId")
        public Long jobId;

        @NameInMap("JobType")
        public String jobType;

        @NameInMap("Lock")
        public Boolean lock;

        @NameInMap("Name")
        public String name;

        @NameInMap("NeedConfirm")
        public Boolean needConfirm;

        @NameInMap("ParallelCount")
        public Long parallelCount;

        @NameInMap("ParentActivityInstanceId")
        public Long parentActivityInstanceId;

        @NameInMap("Status")
        public String status;

        @NameInMap("SubProcessRequestId")
        public String subProcessRequestId;

        @NameInMap("SucceedShardingNum")
        public Long succeedShardingNum;

        @NameInMap("TopologyStatus")
        public String topologyStatus;

        @NameInMap("TotalShardingNum")
        public Long totalShardingNum;

        @NameInMap("Type")
        public String type;

        @NameInMap("ActivityEvents")
        public java.util.List<QueryTSTopologyInstanceResponseBodyDataNodesActivityEvents> activityEvents;

        @NameInMap("Events")
        public java.util.List<QueryTSTopologyInstanceResponseBodyDataNodesEvents> events;

        public static QueryTSTopologyInstanceResponseBodyDataNodes build(java.util.Map<String, ?> map) throws Exception {
            QueryTSTopologyInstanceResponseBodyDataNodes self = new QueryTSTopologyInstanceResponseBodyDataNodes();
            return TeaModel.build(map, self);
        }

        public QueryTSTopologyInstanceResponseBodyDataNodes setActivityId(Long activityId) {
            this.activityId = activityId;
            return this;
        }
        public Long getActivityId() {
            return this.activityId;
        }

        public QueryTSTopologyInstanceResponseBodyDataNodes setActivityInstanceId(Long activityInstanceId) {
            this.activityInstanceId = activityInstanceId;
            return this;
        }
        public Long getActivityInstanceId() {
            return this.activityInstanceId;
        }

        public QueryTSTopologyInstanceResponseBodyDataNodes setApp(String app) {
            this.app = app;
            return this;
        }
        public String getApp() {
            return this.app;
        }

        public QueryTSTopologyInstanceResponseBodyDataNodes setCanSuspend(Boolean canSuspend) {
            this.canSuspend = canSuspend;
            return this;
        }
        public Boolean getCanSuspend() {
            return this.canSuspend;
        }

        public QueryTSTopologyInstanceResponseBodyDataNodes setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public QueryTSTopologyInstanceResponseBodyDataNodes setCondition(String condition) {
            this.condition = condition;
            return this;
        }
        public String getCondition() {
            return this.condition;
        }

        public QueryTSTopologyInstanceResponseBodyDataNodes setConsume(Long consume) {
            this.consume = consume;
            return this;
        }
        public Long getConsume() {
            return this.consume;
        }

        public QueryTSTopologyInstanceResponseBodyDataNodes setCreateTimestamp(Long createTimestamp) {
            this.createTimestamp = createTimestamp;
            return this;
        }
        public Long getCreateTimestamp() {
            return this.createTimestamp;
        }

        public QueryTSTopologyInstanceResponseBodyDataNodes setCurSharding(Long curSharding) {
            this.curSharding = curSharding;
            return this;
        }
        public Long getCurSharding() {
            return this.curSharding;
        }

        public QueryTSTopologyInstanceResponseBodyDataNodes setGmtBegin(String gmtBegin) {
            this.gmtBegin = gmtBegin;
            return this;
        }
        public String getGmtBegin() {
            return this.gmtBegin;
        }

        public QueryTSTopologyInstanceResponseBodyDataNodes setGmtEnd(String gmtEnd) {
            this.gmtEnd = gmtEnd;
            return this;
        }
        public String getGmtEnd() {
            return this.gmtEnd;
        }

        public QueryTSTopologyInstanceResponseBodyDataNodes setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QueryTSTopologyInstanceResponseBodyDataNodes setIsInShardingGateway(Boolean isInShardingGateway) {
            this.isInShardingGateway = isInShardingGateway;
            return this;
        }
        public Boolean getIsInShardingGateway() {
            return this.isInShardingGateway;
        }

        public QueryTSTopologyInstanceResponseBodyDataNodes setJobDes(String jobDes) {
            this.jobDes = jobDes;
            return this;
        }
        public String getJobDes() {
            return this.jobDes;
        }

        public QueryTSTopologyInstanceResponseBodyDataNodes setJobId(Long jobId) {
            this.jobId = jobId;
            return this;
        }
        public Long getJobId() {
            return this.jobId;
        }

        public QueryTSTopologyInstanceResponseBodyDataNodes setJobType(String jobType) {
            this.jobType = jobType;
            return this;
        }
        public String getJobType() {
            return this.jobType;
        }

        public QueryTSTopologyInstanceResponseBodyDataNodes setLock(Boolean lock) {
            this.lock = lock;
            return this;
        }
        public Boolean getLock() {
            return this.lock;
        }

        public QueryTSTopologyInstanceResponseBodyDataNodes setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryTSTopologyInstanceResponseBodyDataNodes setNeedConfirm(Boolean needConfirm) {
            this.needConfirm = needConfirm;
            return this;
        }
        public Boolean getNeedConfirm() {
            return this.needConfirm;
        }

        public QueryTSTopologyInstanceResponseBodyDataNodes setParallelCount(Long parallelCount) {
            this.parallelCount = parallelCount;
            return this;
        }
        public Long getParallelCount() {
            return this.parallelCount;
        }

        public QueryTSTopologyInstanceResponseBodyDataNodes setParentActivityInstanceId(Long parentActivityInstanceId) {
            this.parentActivityInstanceId = parentActivityInstanceId;
            return this;
        }
        public Long getParentActivityInstanceId() {
            return this.parentActivityInstanceId;
        }

        public QueryTSTopologyInstanceResponseBodyDataNodes setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryTSTopologyInstanceResponseBodyDataNodes setSubProcessRequestId(String subProcessRequestId) {
            this.subProcessRequestId = subProcessRequestId;
            return this;
        }
        public String getSubProcessRequestId() {
            return this.subProcessRequestId;
        }

        public QueryTSTopologyInstanceResponseBodyDataNodes setSucceedShardingNum(Long succeedShardingNum) {
            this.succeedShardingNum = succeedShardingNum;
            return this;
        }
        public Long getSucceedShardingNum() {
            return this.succeedShardingNum;
        }

        public QueryTSTopologyInstanceResponseBodyDataNodes setTopologyStatus(String topologyStatus) {
            this.topologyStatus = topologyStatus;
            return this;
        }
        public String getTopologyStatus() {
            return this.topologyStatus;
        }

        public QueryTSTopologyInstanceResponseBodyDataNodes setTotalShardingNum(Long totalShardingNum) {
            this.totalShardingNum = totalShardingNum;
            return this;
        }
        public Long getTotalShardingNum() {
            return this.totalShardingNum;
        }

        public QueryTSTopologyInstanceResponseBodyDataNodes setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public QueryTSTopologyInstanceResponseBodyDataNodes setActivityEvents(java.util.List<QueryTSTopologyInstanceResponseBodyDataNodesActivityEvents> activityEvents) {
            this.activityEvents = activityEvents;
            return this;
        }
        public java.util.List<QueryTSTopologyInstanceResponseBodyDataNodesActivityEvents> getActivityEvents() {
            return this.activityEvents;
        }

        public QueryTSTopologyInstanceResponseBodyDataNodes setEvents(java.util.List<QueryTSTopologyInstanceResponseBodyDataNodesEvents> events) {
            this.events = events;
            return this;
        }
        public java.util.List<QueryTSTopologyInstanceResponseBodyDataNodesEvents> getEvents() {
            return this.events;
        }

    }

    public static class QueryTSTopologyInstanceResponseBodyData extends TeaModel {
        @NameInMap("BaseVersion")
        public Long baseVersion;

        @NameInMap("ProcessId")
        public Long processId;

        @NameInMap("Edges")
        public java.util.List<QueryTSTopologyInstanceResponseBodyDataEdges> edges;

        @NameInMap("Nodes")
        public java.util.List<QueryTSTopologyInstanceResponseBodyDataNodes> nodes;

        public static QueryTSTopologyInstanceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryTSTopologyInstanceResponseBodyData self = new QueryTSTopologyInstanceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryTSTopologyInstanceResponseBodyData setBaseVersion(Long baseVersion) {
            this.baseVersion = baseVersion;
            return this;
        }
        public Long getBaseVersion() {
            return this.baseVersion;
        }

        public QueryTSTopologyInstanceResponseBodyData setProcessId(Long processId) {
            this.processId = processId;
            return this;
        }
        public Long getProcessId() {
            return this.processId;
        }

        public QueryTSTopologyInstanceResponseBodyData setEdges(java.util.List<QueryTSTopologyInstanceResponseBodyDataEdges> edges) {
            this.edges = edges;
            return this;
        }
        public java.util.List<QueryTSTopologyInstanceResponseBodyDataEdges> getEdges() {
            return this.edges;
        }

        public QueryTSTopologyInstanceResponseBodyData setNodes(java.util.List<QueryTSTopologyInstanceResponseBodyDataNodes> nodes) {
            this.nodes = nodes;
            return this;
        }
        public java.util.List<QueryTSTopologyInstanceResponseBodyDataNodes> getNodes() {
            return this.nodes;
        }

    }

}
