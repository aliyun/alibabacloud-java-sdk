// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLDCOpsplanDetailResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("AppCount")
    public Long appCount;

    @NameInMap("Executor")
    public String executor;

    @NameInMap("FinishTime")
    public String finishTime;

    @NameInMap("Id")
    public String id;

    @NameInMap("MessageDetail")
    public String messageDetail;

    @NameInMap("Mode")
    public String mode;

    @NameInMap("Name")
    public String name;

    @NameInMap("Remark")
    public String remark;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("State")
    public String state;

    @NameInMap("TimeSeriesId")
    public String timeSeriesId;

    @NameInMap("Type")
    public String type;

    @NameInMap("AppInfos")
    public java.util.List<QueryLDCOpsplanDetailResponseBodyAppInfos> appInfos;

    @NameInMap("GroupCollectionList")
    public java.util.List<QueryLDCOpsplanDetailResponseBodyGroupCollectionList> groupCollectionList;

    public static QueryLDCOpsplanDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryLDCOpsplanDetailResponseBody self = new QueryLDCOpsplanDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryLDCOpsplanDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryLDCOpsplanDetailResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryLDCOpsplanDetailResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryLDCOpsplanDetailResponseBody setAppCount(Long appCount) {
        this.appCount = appCount;
        return this;
    }
    public Long getAppCount() {
        return this.appCount;
    }

    public QueryLDCOpsplanDetailResponseBody setExecutor(String executor) {
        this.executor = executor;
        return this;
    }
    public String getExecutor() {
        return this.executor;
    }

    public QueryLDCOpsplanDetailResponseBody setFinishTime(String finishTime) {
        this.finishTime = finishTime;
        return this;
    }
    public String getFinishTime() {
        return this.finishTime;
    }

    public QueryLDCOpsplanDetailResponseBody setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public QueryLDCOpsplanDetailResponseBody setMessageDetail(String messageDetail) {
        this.messageDetail = messageDetail;
        return this;
    }
    public String getMessageDetail() {
        return this.messageDetail;
    }

    public QueryLDCOpsplanDetailResponseBody setMode(String mode) {
        this.mode = mode;
        return this;
    }
    public String getMode() {
        return this.mode;
    }

    public QueryLDCOpsplanDetailResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public QueryLDCOpsplanDetailResponseBody setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public QueryLDCOpsplanDetailResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public QueryLDCOpsplanDetailResponseBody setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public QueryLDCOpsplanDetailResponseBody setTimeSeriesId(String timeSeriesId) {
        this.timeSeriesId = timeSeriesId;
        return this;
    }
    public String getTimeSeriesId() {
        return this.timeSeriesId;
    }

    public QueryLDCOpsplanDetailResponseBody setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public QueryLDCOpsplanDetailResponseBody setAppInfos(java.util.List<QueryLDCOpsplanDetailResponseBodyAppInfos> appInfos) {
        this.appInfos = appInfos;
        return this;
    }
    public java.util.List<QueryLDCOpsplanDetailResponseBodyAppInfos> getAppInfos() {
        return this.appInfos;
    }

    public QueryLDCOpsplanDetailResponseBody setGroupCollectionList(java.util.List<QueryLDCOpsplanDetailResponseBodyGroupCollectionList> groupCollectionList) {
        this.groupCollectionList = groupCollectionList;
        return this;
    }
    public java.util.List<QueryLDCOpsplanDetailResponseBodyGroupCollectionList> getGroupCollectionList() {
        return this.groupCollectionList;
    }

    public static class QueryLDCOpsplanDetailResponseBodyAppInfos extends TeaModel {
        @NameInMap("AppId")
        public String appId;

        @NameInMap("AppInstanceGroupName")
        public String appInstanceGroupName;

        @NameInMap("AppName")
        public String appName;

        @NameInMap("Executor")
        public String executor;

        @NameInMap("FinishTime")
        public String finishTime;

        @NameInMap("GroupNum")
        public Long groupNum;

        @NameInMap("GroupStrategy")
        public String groupStrategy;

        @NameInMap("Id")
        public String id;

        @NameInMap("Namespace")
        public String namespace;

        @NameInMap("OperationType")
        public String operationType;

        @NameInMap("Revision")
        public String revision;

        @NameInMap("RollbackRevision")
        public String rollbackRevision;

        @NameInMap("StandaloneExecutable")
        public Boolean standaloneExecutable;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("State")
        public String state;

        public static QueryLDCOpsplanDetailResponseBodyAppInfos build(java.util.Map<String, ?> map) throws Exception {
            QueryLDCOpsplanDetailResponseBodyAppInfos self = new QueryLDCOpsplanDetailResponseBodyAppInfos();
            return TeaModel.build(map, self);
        }

        public QueryLDCOpsplanDetailResponseBodyAppInfos setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public QueryLDCOpsplanDetailResponseBodyAppInfos setAppInstanceGroupName(String appInstanceGroupName) {
            this.appInstanceGroupName = appInstanceGroupName;
            return this;
        }
        public String getAppInstanceGroupName() {
            return this.appInstanceGroupName;
        }

        public QueryLDCOpsplanDetailResponseBodyAppInfos setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public QueryLDCOpsplanDetailResponseBodyAppInfos setExecutor(String executor) {
            this.executor = executor;
            return this;
        }
        public String getExecutor() {
            return this.executor;
        }

        public QueryLDCOpsplanDetailResponseBodyAppInfos setFinishTime(String finishTime) {
            this.finishTime = finishTime;
            return this;
        }
        public String getFinishTime() {
            return this.finishTime;
        }

        public QueryLDCOpsplanDetailResponseBodyAppInfos setGroupNum(Long groupNum) {
            this.groupNum = groupNum;
            return this;
        }
        public Long getGroupNum() {
            return this.groupNum;
        }

        public QueryLDCOpsplanDetailResponseBodyAppInfos setGroupStrategy(String groupStrategy) {
            this.groupStrategy = groupStrategy;
            return this;
        }
        public String getGroupStrategy() {
            return this.groupStrategy;
        }

        public QueryLDCOpsplanDetailResponseBodyAppInfos setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryLDCOpsplanDetailResponseBodyAppInfos setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public QueryLDCOpsplanDetailResponseBodyAppInfos setOperationType(String operationType) {
            this.operationType = operationType;
            return this;
        }
        public String getOperationType() {
            return this.operationType;
        }

        public QueryLDCOpsplanDetailResponseBodyAppInfos setRevision(String revision) {
            this.revision = revision;
            return this;
        }
        public String getRevision() {
            return this.revision;
        }

        public QueryLDCOpsplanDetailResponseBodyAppInfos setRollbackRevision(String rollbackRevision) {
            this.rollbackRevision = rollbackRevision;
            return this;
        }
        public String getRollbackRevision() {
            return this.rollbackRevision;
        }

        public QueryLDCOpsplanDetailResponseBodyAppInfos setStandaloneExecutable(Boolean standaloneExecutable) {
            this.standaloneExecutable = standaloneExecutable;
            return this;
        }
        public Boolean getStandaloneExecutable() {
            return this.standaloneExecutable;
        }

        public QueryLDCOpsplanDetailResponseBodyAppInfos setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public QueryLDCOpsplanDetailResponseBodyAppInfos setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

    }

    public static class QueryLDCOpsplanDetailResponseBodyGroupCollectionListAppGroupList extends TeaModel {
        @NameInMap("Id")
        public String id;

        @NameInMap("State")
        public String state;

        @NameInMap("AppIdList")
        public java.util.List<String> appIdList;

        public static QueryLDCOpsplanDetailResponseBodyGroupCollectionListAppGroupList build(java.util.Map<String, ?> map) throws Exception {
            QueryLDCOpsplanDetailResponseBodyGroupCollectionListAppGroupList self = new QueryLDCOpsplanDetailResponseBodyGroupCollectionListAppGroupList();
            return TeaModel.build(map, self);
        }

        public QueryLDCOpsplanDetailResponseBodyGroupCollectionListAppGroupList setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryLDCOpsplanDetailResponseBodyGroupCollectionListAppGroupList setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public QueryLDCOpsplanDetailResponseBodyGroupCollectionListAppGroupList setAppIdList(java.util.List<String> appIdList) {
            this.appIdList = appIdList;
            return this;
        }
        public java.util.List<String> getAppIdList() {
            return this.appIdList;
        }

    }

    public static class QueryLDCOpsplanDetailResponseBodyGroupCollectionList extends TeaModel {
        @NameInMap("AppGroupList")
        public java.util.List<QueryLDCOpsplanDetailResponseBodyGroupCollectionListAppGroupList> appGroupList;

        public static QueryLDCOpsplanDetailResponseBodyGroupCollectionList build(java.util.Map<String, ?> map) throws Exception {
            QueryLDCOpsplanDetailResponseBodyGroupCollectionList self = new QueryLDCOpsplanDetailResponseBodyGroupCollectionList();
            return TeaModel.build(map, self);
        }

        public QueryLDCOpsplanDetailResponseBodyGroupCollectionList setAppGroupList(java.util.List<QueryLDCOpsplanDetailResponseBodyGroupCollectionListAppGroupList> appGroupList) {
            this.appGroupList = appGroupList;
            return this;
        }
        public java.util.List<QueryLDCOpsplanDetailResponseBodyGroupCollectionListAppGroupList> getAppGroupList() {
            return this.appGroupList;
        }

    }

}
