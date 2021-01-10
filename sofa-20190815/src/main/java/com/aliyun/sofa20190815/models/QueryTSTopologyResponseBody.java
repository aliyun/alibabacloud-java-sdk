// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryTSTopologyResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Data")
    public QueryTSTopologyResponseBodyData data;

    public static QueryTSTopologyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryTSTopologyResponseBody self = new QueryTSTopologyResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryTSTopologyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryTSTopologyResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryTSTopologyResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryTSTopologyResponseBody setData(QueryTSTopologyResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryTSTopologyResponseBodyData getData() {
        return this.data;
    }

    public static class QueryTSTopologyResponseBodyDataEdges extends TeaModel {
        @NameInMap("ConditionValue")
        public Boolean conditionValue;

        @NameInMap("Source")
        public String source;

        @NameInMap("Status")
        public String status;

        @NameInMap("Target")
        public String target;

        public static QueryTSTopologyResponseBodyDataEdges build(java.util.Map<String, ?> map) throws Exception {
            QueryTSTopologyResponseBodyDataEdges self = new QueryTSTopologyResponseBodyDataEdges();
            return TeaModel.build(map, self);
        }

        public QueryTSTopologyResponseBodyDataEdges setConditionValue(Boolean conditionValue) {
            this.conditionValue = conditionValue;
            return this;
        }
        public Boolean getConditionValue() {
            return this.conditionValue;
        }

        public QueryTSTopologyResponseBodyDataEdges setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public QueryTSTopologyResponseBodyDataEdges setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryTSTopologyResponseBodyDataEdges setTarget(String target) {
            this.target = target;
            return this;
        }
        public String getTarget() {
            return this.target;
        }

    }

    public static class QueryTSTopologyResponseBodyDataNodesActivityEvents extends TeaModel {
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

        public static QueryTSTopologyResponseBodyDataNodesActivityEvents build(java.util.Map<String, ?> map) throws Exception {
            QueryTSTopologyResponseBodyDataNodesActivityEvents self = new QueryTSTopologyResponseBodyDataNodesActivityEvents();
            return TeaModel.build(map, self);
        }

        public QueryTSTopologyResponseBodyDataNodesActivityEvents setActivityId(Long activityId) {
            this.activityId = activityId;
            return this;
        }
        public Long getActivityId() {
            return this.activityId;
        }

        public QueryTSTopologyResponseBodyDataNodesActivityEvents setExtra(String extra) {
            this.extra = extra;
            return this;
        }
        public String getExtra() {
            return this.extra;
        }

        public QueryTSTopologyResponseBodyDataNodesActivityEvents setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QueryTSTopologyResponseBodyDataNodesActivityEvents setProcessId(Long processId) {
            this.processId = processId;
            return this;
        }
        public Long getProcessId() {
            return this.processId;
        }

        public QueryTSTopologyResponseBodyDataNodesActivityEvents setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class QueryTSTopologyResponseBodyDataNodesEvents extends TeaModel {
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

        public static QueryTSTopologyResponseBodyDataNodesEvents build(java.util.Map<String, ?> map) throws Exception {
            QueryTSTopologyResponseBodyDataNodesEvents self = new QueryTSTopologyResponseBodyDataNodesEvents();
            return TeaModel.build(map, self);
        }

        public QueryTSTopologyResponseBodyDataNodesEvents setActivityId(Long activityId) {
            this.activityId = activityId;
            return this;
        }
        public Long getActivityId() {
            return this.activityId;
        }

        public QueryTSTopologyResponseBodyDataNodesEvents setExtra(String extra) {
            this.extra = extra;
            return this;
        }
        public String getExtra() {
            return this.extra;
        }

        public QueryTSTopologyResponseBodyDataNodesEvents setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QueryTSTopologyResponseBodyDataNodesEvents setProcessId(Long processId) {
            this.processId = processId;
            return this;
        }
        public Long getProcessId() {
            return this.processId;
        }

        public QueryTSTopologyResponseBodyDataNodesEvents setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class QueryTSTopologyResponseBodyDataNodes extends TeaModel {
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
        public java.util.List<QueryTSTopologyResponseBodyDataNodesActivityEvents> activityEvents;

        @NameInMap("Events")
        public java.util.List<QueryTSTopologyResponseBodyDataNodesEvents> events;

        public static QueryTSTopologyResponseBodyDataNodes build(java.util.Map<String, ?> map) throws Exception {
            QueryTSTopologyResponseBodyDataNodes self = new QueryTSTopologyResponseBodyDataNodes();
            return TeaModel.build(map, self);
        }

        public QueryTSTopologyResponseBodyDataNodes setActivityId(Long activityId) {
            this.activityId = activityId;
            return this;
        }
        public Long getActivityId() {
            return this.activityId;
        }

        public QueryTSTopologyResponseBodyDataNodes setActivityInstanceId(Long activityInstanceId) {
            this.activityInstanceId = activityInstanceId;
            return this;
        }
        public Long getActivityInstanceId() {
            return this.activityInstanceId;
        }

        public QueryTSTopologyResponseBodyDataNodes setApp(String app) {
            this.app = app;
            return this;
        }
        public String getApp() {
            return this.app;
        }

        public QueryTSTopologyResponseBodyDataNodes setCanSuspend(Boolean canSuspend) {
            this.canSuspend = canSuspend;
            return this;
        }
        public Boolean getCanSuspend() {
            return this.canSuspend;
        }

        public QueryTSTopologyResponseBodyDataNodes setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public QueryTSTopologyResponseBodyDataNodes setCondition(String condition) {
            this.condition = condition;
            return this;
        }
        public String getCondition() {
            return this.condition;
        }

        public QueryTSTopologyResponseBodyDataNodes setConsume(Long consume) {
            this.consume = consume;
            return this;
        }
        public Long getConsume() {
            return this.consume;
        }

        public QueryTSTopologyResponseBodyDataNodes setCreateTimestamp(Long createTimestamp) {
            this.createTimestamp = createTimestamp;
            return this;
        }
        public Long getCreateTimestamp() {
            return this.createTimestamp;
        }

        public QueryTSTopologyResponseBodyDataNodes setCurSharding(Long curSharding) {
            this.curSharding = curSharding;
            return this;
        }
        public Long getCurSharding() {
            return this.curSharding;
        }

        public QueryTSTopologyResponseBodyDataNodes setGmtBegin(String gmtBegin) {
            this.gmtBegin = gmtBegin;
            return this;
        }
        public String getGmtBegin() {
            return this.gmtBegin;
        }

        public QueryTSTopologyResponseBodyDataNodes setGmtEnd(String gmtEnd) {
            this.gmtEnd = gmtEnd;
            return this;
        }
        public String getGmtEnd() {
            return this.gmtEnd;
        }

        public QueryTSTopologyResponseBodyDataNodes setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QueryTSTopologyResponseBodyDataNodes setIsInShardingGateway(Boolean isInShardingGateway) {
            this.isInShardingGateway = isInShardingGateway;
            return this;
        }
        public Boolean getIsInShardingGateway() {
            return this.isInShardingGateway;
        }

        public QueryTSTopologyResponseBodyDataNodes setJobDes(String jobDes) {
            this.jobDes = jobDes;
            return this;
        }
        public String getJobDes() {
            return this.jobDes;
        }

        public QueryTSTopologyResponseBodyDataNodes setJobId(Long jobId) {
            this.jobId = jobId;
            return this;
        }
        public Long getJobId() {
            return this.jobId;
        }

        public QueryTSTopologyResponseBodyDataNodes setJobType(String jobType) {
            this.jobType = jobType;
            return this;
        }
        public String getJobType() {
            return this.jobType;
        }

        public QueryTSTopologyResponseBodyDataNodes setLock(Boolean lock) {
            this.lock = lock;
            return this;
        }
        public Boolean getLock() {
            return this.lock;
        }

        public QueryTSTopologyResponseBodyDataNodes setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryTSTopologyResponseBodyDataNodes setNeedConfirm(Boolean needConfirm) {
            this.needConfirm = needConfirm;
            return this;
        }
        public Boolean getNeedConfirm() {
            return this.needConfirm;
        }

        public QueryTSTopologyResponseBodyDataNodes setParallelCount(Long parallelCount) {
            this.parallelCount = parallelCount;
            return this;
        }
        public Long getParallelCount() {
            return this.parallelCount;
        }

        public QueryTSTopologyResponseBodyDataNodes setParentActivityInstanceId(Long parentActivityInstanceId) {
            this.parentActivityInstanceId = parentActivityInstanceId;
            return this;
        }
        public Long getParentActivityInstanceId() {
            return this.parentActivityInstanceId;
        }

        public QueryTSTopologyResponseBodyDataNodes setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryTSTopologyResponseBodyDataNodes setSubProcessRequestId(String subProcessRequestId) {
            this.subProcessRequestId = subProcessRequestId;
            return this;
        }
        public String getSubProcessRequestId() {
            return this.subProcessRequestId;
        }

        public QueryTSTopologyResponseBodyDataNodes setSucceedShardingNum(Long succeedShardingNum) {
            this.succeedShardingNum = succeedShardingNum;
            return this;
        }
        public Long getSucceedShardingNum() {
            return this.succeedShardingNum;
        }

        public QueryTSTopologyResponseBodyDataNodes setTopologyStatus(String topologyStatus) {
            this.topologyStatus = topologyStatus;
            return this;
        }
        public String getTopologyStatus() {
            return this.topologyStatus;
        }

        public QueryTSTopologyResponseBodyDataNodes setTotalShardingNum(Long totalShardingNum) {
            this.totalShardingNum = totalShardingNum;
            return this;
        }
        public Long getTotalShardingNum() {
            return this.totalShardingNum;
        }

        public QueryTSTopologyResponseBodyDataNodes setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public QueryTSTopologyResponseBodyDataNodes setActivityEvents(java.util.List<QueryTSTopologyResponseBodyDataNodesActivityEvents> activityEvents) {
            this.activityEvents = activityEvents;
            return this;
        }
        public java.util.List<QueryTSTopologyResponseBodyDataNodesActivityEvents> getActivityEvents() {
            return this.activityEvents;
        }

        public QueryTSTopologyResponseBodyDataNodes setEvents(java.util.List<QueryTSTopologyResponseBodyDataNodesEvents> events) {
            this.events = events;
            return this;
        }
        public java.util.List<QueryTSTopologyResponseBodyDataNodesEvents> getEvents() {
            return this.events;
        }

    }

    public static class QueryTSTopologyResponseBodyData extends TeaModel {
        @NameInMap("BaseVersion")
        public Long baseVersion;

        @NameInMap("ProcessId")
        public Long processId;

        @NameInMap("Edges")
        public java.util.List<QueryTSTopologyResponseBodyDataEdges> edges;

        @NameInMap("Nodes")
        public java.util.List<QueryTSTopologyResponseBodyDataNodes> nodes;

        public static QueryTSTopologyResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryTSTopologyResponseBodyData self = new QueryTSTopologyResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryTSTopologyResponseBodyData setBaseVersion(Long baseVersion) {
            this.baseVersion = baseVersion;
            return this;
        }
        public Long getBaseVersion() {
            return this.baseVersion;
        }

        public QueryTSTopologyResponseBodyData setProcessId(Long processId) {
            this.processId = processId;
            return this;
        }
        public Long getProcessId() {
            return this.processId;
        }

        public QueryTSTopologyResponseBodyData setEdges(java.util.List<QueryTSTopologyResponseBodyDataEdges> edges) {
            this.edges = edges;
            return this;
        }
        public java.util.List<QueryTSTopologyResponseBodyDataEdges> getEdges() {
            return this.edges;
        }

        public QueryTSTopologyResponseBodyData setNodes(java.util.List<QueryTSTopologyResponseBodyDataNodes> nodes) {
            this.nodes = nodes;
            return this;
        }
        public java.util.List<QueryTSTopologyResponseBodyDataNodes> getNodes() {
            return this.nodes;
        }

    }

}
