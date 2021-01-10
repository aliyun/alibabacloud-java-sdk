// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLDCOpsplanAppprogressResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("AppDeployProgress")
    public QueryLDCOpsplanAppprogressResponseBodyAppDeployProgress appDeployProgress;

    public static QueryLDCOpsplanAppprogressResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryLDCOpsplanAppprogressResponseBody self = new QueryLDCOpsplanAppprogressResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryLDCOpsplanAppprogressResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryLDCOpsplanAppprogressResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryLDCOpsplanAppprogressResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryLDCOpsplanAppprogressResponseBody setAppDeployProgress(QueryLDCOpsplanAppprogressResponseBodyAppDeployProgress appDeployProgress) {
        this.appDeployProgress = appDeployProgress;
        return this;
    }
    public QueryLDCOpsplanAppprogressResponseBodyAppDeployProgress getAppDeployProgress() {
        return this.appDeployProgress;
    }

    public static class QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressExecuteGroupsPostTasksAppDeployCellsPodList extends TeaModel {
        @NameInMap("Cluster")
        public String cluster;

        @NameInMap("CreatedTime")
        public String createdTime;

        @NameInMap("LifecycleStage")
        public String lifecycleStage;

        @NameInMap("Message")
        public String message;

        @NameInMap("Name")
        public String name;

        @NameInMap("Namespace")
        public String namespace;

        @NameInMap("PodIp")
        public String podIp;

        @NameInMap("Revision")
        public String revision;

        @NameInMap("Status")
        public String status;

        @NameInMap("Uid")
        public String uid;

        @NameInMap("Finalizers")
        public java.util.List<String> finalizers;

        public static QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressExecuteGroupsPostTasksAppDeployCellsPodList build(java.util.Map<String, ?> map) throws Exception {
            QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressExecuteGroupsPostTasksAppDeployCellsPodList self = new QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressExecuteGroupsPostTasksAppDeployCellsPodList();
            return TeaModel.build(map, self);
        }

        public QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressExecuteGroupsPostTasksAppDeployCellsPodList setCluster(String cluster) {
            this.cluster = cluster;
            return this;
        }
        public String getCluster() {
            return this.cluster;
        }

        public QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressExecuteGroupsPostTasksAppDeployCellsPodList setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressExecuteGroupsPostTasksAppDeployCellsPodList setLifecycleStage(String lifecycleStage) {
            this.lifecycleStage = lifecycleStage;
            return this;
        }
        public String getLifecycleStage() {
            return this.lifecycleStage;
        }

        public QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressExecuteGroupsPostTasksAppDeployCellsPodList setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressExecuteGroupsPostTasksAppDeployCellsPodList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressExecuteGroupsPostTasksAppDeployCellsPodList setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressExecuteGroupsPostTasksAppDeployCellsPodList setPodIp(String podIp) {
            this.podIp = podIp;
            return this;
        }
        public String getPodIp() {
            return this.podIp;
        }

        public QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressExecuteGroupsPostTasksAppDeployCellsPodList setRevision(String revision) {
            this.revision = revision;
            return this;
        }
        public String getRevision() {
            return this.revision;
        }

        public QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressExecuteGroupsPostTasksAppDeployCellsPodList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressExecuteGroupsPostTasksAppDeployCellsPodList setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

        public QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressExecuteGroupsPostTasksAppDeployCellsPodList setFinalizers(java.util.List<String> finalizers) {
            this.finalizers = finalizers;
            return this;
        }
        public java.util.List<String> getFinalizers() {
            return this.finalizers;
        }

    }

    public static class QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressExecuteGroupsPostTasksAppDeployCells extends TeaModel {
        @NameInMap("CellName")
        public String cellName;

        @NameInMap("Partition")
        public Long partition;

        @NameInMap("ReleaseCount")
        public Long releaseCount;

        @NameInMap("PodList")
        public java.util.List<QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressExecuteGroupsPostTasksAppDeployCellsPodList> podList;

        public static QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressExecuteGroupsPostTasksAppDeployCells build(java.util.Map<String, ?> map) throws Exception {
            QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressExecuteGroupsPostTasksAppDeployCells self = new QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressExecuteGroupsPostTasksAppDeployCells();
            return TeaModel.build(map, self);
        }

        public QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressExecuteGroupsPostTasksAppDeployCells setCellName(String cellName) {
            this.cellName = cellName;
            return this;
        }
        public String getCellName() {
            return this.cellName;
        }

        public QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressExecuteGroupsPostTasksAppDeployCells setPartition(Long partition) {
            this.partition = partition;
            return this;
        }
        public Long getPartition() {
            return this.partition;
        }

        public QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressExecuteGroupsPostTasksAppDeployCells setReleaseCount(Long releaseCount) {
            this.releaseCount = releaseCount;
            return this;
        }
        public Long getReleaseCount() {
            return this.releaseCount;
        }

        public QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressExecuteGroupsPostTasksAppDeployCells setPodList(java.util.List<QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressExecuteGroupsPostTasksAppDeployCellsPodList> podList) {
            this.podList = podList;
            return this;
        }
        public java.util.List<QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressExecuteGroupsPostTasksAppDeployCellsPodList> getPodList() {
            return this.podList;
        }

    }

    public static class QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressExecuteGroupsPostTasks extends TeaModel {
        @NameInMap("ActionCode")
        public String actionCode;

        @NameInMap("ConfirmSupported")
        public Boolean confirmSupported;

        @NameInMap("Data")
        public String data;

        @NameInMap("FinishedTime")
        public String finishedTime;

        @NameInMap("Id")
        public String id;

        @NameInMap("IgnoreSupported")
        public Boolean ignoreSupported;

        @NameInMap("RetrySupported")
        public Boolean retrySupported;

        @NameInMap("StartedTime")
        public String startedTime;

        @NameInMap("State")
        public String state;

        @NameInMap("AppDeployCells")
        public java.util.List<QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressExecuteGroupsPostTasksAppDeployCells> appDeployCells;

        public static QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressExecuteGroupsPostTasks build(java.util.Map<String, ?> map) throws Exception {
            QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressExecuteGroupsPostTasks self = new QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressExecuteGroupsPostTasks();
            return TeaModel.build(map, self);
        }

        public QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressExecuteGroupsPostTasks setActionCode(String actionCode) {
            this.actionCode = actionCode;
            return this;
        }
        public String getActionCode() {
            return this.actionCode;
        }

        public QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressExecuteGroupsPostTasks setConfirmSupported(Boolean confirmSupported) {
            this.confirmSupported = confirmSupported;
            return this;
        }
        public Boolean getConfirmSupported() {
            return this.confirmSupported;
        }

        public QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressExecuteGroupsPostTasks setData(String data) {
            this.data = data;
            return this;
        }
        public String getData() {
            return this.data;
        }

        public QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressExecuteGroupsPostTasks setFinishedTime(String finishedTime) {
            this.finishedTime = finishedTime;
            return this;
        }
        public String getFinishedTime() {
            return this.finishedTime;
        }

        public QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressExecuteGroupsPostTasks setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressExecuteGroupsPostTasks setIgnoreSupported(Boolean ignoreSupported) {
            this.ignoreSupported = ignoreSupported;
            return this;
        }
        public Boolean getIgnoreSupported() {
            return this.ignoreSupported;
        }

        public QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressExecuteGroupsPostTasks setRetrySupported(Boolean retrySupported) {
            this.retrySupported = retrySupported;
            return this;
        }
        public Boolean getRetrySupported() {
            return this.retrySupported;
        }

        public QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressExecuteGroupsPostTasks setStartedTime(String startedTime) {
            this.startedTime = startedTime;
            return this;
        }
        public String getStartedTime() {
            return this.startedTime;
        }

        public QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressExecuteGroupsPostTasks setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressExecuteGroupsPostTasks setAppDeployCells(java.util.List<QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressExecuteGroupsPostTasksAppDeployCells> appDeployCells) {
            this.appDeployCells = appDeployCells;
            return this;
        }
        public java.util.List<QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressExecuteGroupsPostTasksAppDeployCells> getAppDeployCells() {
            return this.appDeployCells;
        }

    }

    public static class QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressExecuteGroupsPreTasksAppDeployCellsPodList extends TeaModel {
        @NameInMap("Cluster")
        public String cluster;

        @NameInMap("CreatedTime")
        public String createdTime;

        @NameInMap("LifecycleStage")
        public String lifecycleStage;

        @NameInMap("Message")
        public String message;

        @NameInMap("Name")
        public String name;

        @NameInMap("Namespace")
        public String namespace;

        @NameInMap("PodIp")
        public String podIp;

        @NameInMap("Revision")
        public String revision;

        @NameInMap("Status")
        public String status;

        @NameInMap("Uid")
        public String uid;

        @NameInMap("Finalizers")
        public java.util.List<String> finalizers;

        public static QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressExecuteGroupsPreTasksAppDeployCellsPodList build(java.util.Map<String, ?> map) throws Exception {
            QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressExecuteGroupsPreTasksAppDeployCellsPodList self = new QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressExecuteGroupsPreTasksAppDeployCellsPodList();
            return TeaModel.build(map, self);
        }

        public QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressExecuteGroupsPreTasksAppDeployCellsPodList setCluster(String cluster) {
            this.cluster = cluster;
            return this;
        }
        public String getCluster() {
            return this.cluster;
        }

        public QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressExecuteGroupsPreTasksAppDeployCellsPodList setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressExecuteGroupsPreTasksAppDeployCellsPodList setLifecycleStage(String lifecycleStage) {
            this.lifecycleStage = lifecycleStage;
            return this;
        }
        public String getLifecycleStage() {
            return this.lifecycleStage;
        }

        public QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressExecuteGroupsPreTasksAppDeployCellsPodList setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressExecuteGroupsPreTasksAppDeployCellsPodList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressExecuteGroupsPreTasksAppDeployCellsPodList setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressExecuteGroupsPreTasksAppDeployCellsPodList setPodIp(String podIp) {
            this.podIp = podIp;
            return this;
        }
        public String getPodIp() {
            return this.podIp;
        }

        public QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressExecuteGroupsPreTasksAppDeployCellsPodList setRevision(String revision) {
            this.revision = revision;
            return this;
        }
        public String getRevision() {
            return this.revision;
        }

        public QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressExecuteGroupsPreTasksAppDeployCellsPodList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressExecuteGroupsPreTasksAppDeployCellsPodList setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

        public QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressExecuteGroupsPreTasksAppDeployCellsPodList setFinalizers(java.util.List<String> finalizers) {
            this.finalizers = finalizers;
            return this;
        }
        public java.util.List<String> getFinalizers() {
            return this.finalizers;
        }

    }

    public static class QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressExecuteGroupsPreTasksAppDeployCells extends TeaModel {
        @NameInMap("CellName")
        public String cellName;

        @NameInMap("Partition")
        public Long partition;

        @NameInMap("ReleaseCount")
        public Long releaseCount;

        @NameInMap("PodList")
        public java.util.List<QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressExecuteGroupsPreTasksAppDeployCellsPodList> podList;

        public static QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressExecuteGroupsPreTasksAppDeployCells build(java.util.Map<String, ?> map) throws Exception {
            QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressExecuteGroupsPreTasksAppDeployCells self = new QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressExecuteGroupsPreTasksAppDeployCells();
            return TeaModel.build(map, self);
        }

        public QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressExecuteGroupsPreTasksAppDeployCells setCellName(String cellName) {
            this.cellName = cellName;
            return this;
        }
        public String getCellName() {
            return this.cellName;
        }

        public QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressExecuteGroupsPreTasksAppDeployCells setPartition(Long partition) {
            this.partition = partition;
            return this;
        }
        public Long getPartition() {
            return this.partition;
        }

        public QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressExecuteGroupsPreTasksAppDeployCells setReleaseCount(Long releaseCount) {
            this.releaseCount = releaseCount;
            return this;
        }
        public Long getReleaseCount() {
            return this.releaseCount;
        }

        public QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressExecuteGroupsPreTasksAppDeployCells setPodList(java.util.List<QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressExecuteGroupsPreTasksAppDeployCellsPodList> podList) {
            this.podList = podList;
            return this;
        }
        public java.util.List<QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressExecuteGroupsPreTasksAppDeployCellsPodList> getPodList() {
            return this.podList;
        }

    }

    public static class QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressExecuteGroupsPreTasks extends TeaModel {
        @NameInMap("ActionCode")
        public String actionCode;

        @NameInMap("ConfirmSupported")
        public Boolean confirmSupported;

        @NameInMap("Data")
        public String data;

        @NameInMap("FinishedTime")
        public String finishedTime;

        @NameInMap("Id")
        public String id;

        @NameInMap("IgnoreSupported")
        public Boolean ignoreSupported;

        @NameInMap("RetrySupported")
        public Boolean retrySupported;

        @NameInMap("StartedTime")
        public String startedTime;

        @NameInMap("State")
        public String state;

        @NameInMap("AppDeployCells")
        public java.util.List<QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressExecuteGroupsPreTasksAppDeployCells> appDeployCells;

        public static QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressExecuteGroupsPreTasks build(java.util.Map<String, ?> map) throws Exception {
            QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressExecuteGroupsPreTasks self = new QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressExecuteGroupsPreTasks();
            return TeaModel.build(map, self);
        }

        public QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressExecuteGroupsPreTasks setActionCode(String actionCode) {
            this.actionCode = actionCode;
            return this;
        }
        public String getActionCode() {
            return this.actionCode;
        }

        public QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressExecuteGroupsPreTasks setConfirmSupported(Boolean confirmSupported) {
            this.confirmSupported = confirmSupported;
            return this;
        }
        public Boolean getConfirmSupported() {
            return this.confirmSupported;
        }

        public QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressExecuteGroupsPreTasks setData(String data) {
            this.data = data;
            return this;
        }
        public String getData() {
            return this.data;
        }

        public QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressExecuteGroupsPreTasks setFinishedTime(String finishedTime) {
            this.finishedTime = finishedTime;
            return this;
        }
        public String getFinishedTime() {
            return this.finishedTime;
        }

        public QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressExecuteGroupsPreTasks setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressExecuteGroupsPreTasks setIgnoreSupported(Boolean ignoreSupported) {
            this.ignoreSupported = ignoreSupported;
            return this;
        }
        public Boolean getIgnoreSupported() {
            return this.ignoreSupported;
        }

        public QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressExecuteGroupsPreTasks setRetrySupported(Boolean retrySupported) {
            this.retrySupported = retrySupported;
            return this;
        }
        public Boolean getRetrySupported() {
            return this.retrySupported;
        }

        public QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressExecuteGroupsPreTasks setStartedTime(String startedTime) {
            this.startedTime = startedTime;
            return this;
        }
        public String getStartedTime() {
            return this.startedTime;
        }

        public QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressExecuteGroupsPreTasks setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressExecuteGroupsPreTasks setAppDeployCells(java.util.List<QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressExecuteGroupsPreTasksAppDeployCells> appDeployCells) {
            this.appDeployCells = appDeployCells;
            return this;
        }
        public java.util.List<QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressExecuteGroupsPreTasksAppDeployCells> getAppDeployCells() {
            return this.appDeployCells;
        }

    }

    public static class QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressExecuteGroupsDeployTaskAppDeployCellsPodList extends TeaModel {
        @NameInMap("Cluster")
        public String cluster;

        @NameInMap("CreatedTime")
        public String createdTime;

        @NameInMap("LifecycleStage")
        public String lifecycleStage;

        @NameInMap("Message")
        public String message;

        @NameInMap("Name")
        public String name;

        @NameInMap("Namespace")
        public String namespace;

        @NameInMap("PodIp")
        public String podIp;

        @NameInMap("Revision")
        public String revision;

        @NameInMap("Status")
        public String status;

        @NameInMap("Uid")
        public String uid;

        @NameInMap("Finalizers")
        public java.util.List<String> finalizers;

        public static QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressExecuteGroupsDeployTaskAppDeployCellsPodList build(java.util.Map<String, ?> map) throws Exception {
            QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressExecuteGroupsDeployTaskAppDeployCellsPodList self = new QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressExecuteGroupsDeployTaskAppDeployCellsPodList();
            return TeaModel.build(map, self);
        }

        public QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressExecuteGroupsDeployTaskAppDeployCellsPodList setCluster(String cluster) {
            this.cluster = cluster;
            return this;
        }
        public String getCluster() {
            return this.cluster;
        }

        public QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressExecuteGroupsDeployTaskAppDeployCellsPodList setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressExecuteGroupsDeployTaskAppDeployCellsPodList setLifecycleStage(String lifecycleStage) {
            this.lifecycleStage = lifecycleStage;
            return this;
        }
        public String getLifecycleStage() {
            return this.lifecycleStage;
        }

        public QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressExecuteGroupsDeployTaskAppDeployCellsPodList setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressExecuteGroupsDeployTaskAppDeployCellsPodList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressExecuteGroupsDeployTaskAppDeployCellsPodList setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressExecuteGroupsDeployTaskAppDeployCellsPodList setPodIp(String podIp) {
            this.podIp = podIp;
            return this;
        }
        public String getPodIp() {
            return this.podIp;
        }

        public QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressExecuteGroupsDeployTaskAppDeployCellsPodList setRevision(String revision) {
            this.revision = revision;
            return this;
        }
        public String getRevision() {
            return this.revision;
        }

        public QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressExecuteGroupsDeployTaskAppDeployCellsPodList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressExecuteGroupsDeployTaskAppDeployCellsPodList setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

        public QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressExecuteGroupsDeployTaskAppDeployCellsPodList setFinalizers(java.util.List<String> finalizers) {
            this.finalizers = finalizers;
            return this;
        }
        public java.util.List<String> getFinalizers() {
            return this.finalizers;
        }

    }

    public static class QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressExecuteGroupsDeployTaskAppDeployCells extends TeaModel {
        @NameInMap("CellName")
        public String cellName;

        @NameInMap("Partition")
        public Long partition;

        @NameInMap("ReleaseCount")
        public Long releaseCount;

        @NameInMap("PodList")
        public java.util.List<QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressExecuteGroupsDeployTaskAppDeployCellsPodList> podList;

        public static QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressExecuteGroupsDeployTaskAppDeployCells build(java.util.Map<String, ?> map) throws Exception {
            QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressExecuteGroupsDeployTaskAppDeployCells self = new QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressExecuteGroupsDeployTaskAppDeployCells();
            return TeaModel.build(map, self);
        }

        public QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressExecuteGroupsDeployTaskAppDeployCells setCellName(String cellName) {
            this.cellName = cellName;
            return this;
        }
        public String getCellName() {
            return this.cellName;
        }

        public QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressExecuteGroupsDeployTaskAppDeployCells setPartition(Long partition) {
            this.partition = partition;
            return this;
        }
        public Long getPartition() {
            return this.partition;
        }

        public QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressExecuteGroupsDeployTaskAppDeployCells setReleaseCount(Long releaseCount) {
            this.releaseCount = releaseCount;
            return this;
        }
        public Long getReleaseCount() {
            return this.releaseCount;
        }

        public QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressExecuteGroupsDeployTaskAppDeployCells setPodList(java.util.List<QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressExecuteGroupsDeployTaskAppDeployCellsPodList> podList) {
            this.podList = podList;
            return this;
        }
        public java.util.List<QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressExecuteGroupsDeployTaskAppDeployCellsPodList> getPodList() {
            return this.podList;
        }

    }

    public static class QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressExecuteGroupsDeployTask extends TeaModel {
        @NameInMap("ActionCode")
        public String actionCode;

        @NameInMap("ConfirmSupported")
        public Boolean confirmSupported;

        @NameInMap("Data")
        public String data;

        @NameInMap("FinishedTime")
        public String finishedTime;

        @NameInMap("Id")
        public String id;

        @NameInMap("IgnoreSupported")
        public Boolean ignoreSupported;

        @NameInMap("RetrySupported")
        public Boolean retrySupported;

        @NameInMap("StartedTime")
        public String startedTime;

        @NameInMap("State")
        public String state;

        @NameInMap("AppDeployCells")
        public java.util.List<QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressExecuteGroupsDeployTaskAppDeployCells> appDeployCells;

        public static QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressExecuteGroupsDeployTask build(java.util.Map<String, ?> map) throws Exception {
            QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressExecuteGroupsDeployTask self = new QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressExecuteGroupsDeployTask();
            return TeaModel.build(map, self);
        }

        public QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressExecuteGroupsDeployTask setActionCode(String actionCode) {
            this.actionCode = actionCode;
            return this;
        }
        public String getActionCode() {
            return this.actionCode;
        }

        public QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressExecuteGroupsDeployTask setConfirmSupported(Boolean confirmSupported) {
            this.confirmSupported = confirmSupported;
            return this;
        }
        public Boolean getConfirmSupported() {
            return this.confirmSupported;
        }

        public QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressExecuteGroupsDeployTask setData(String data) {
            this.data = data;
            return this;
        }
        public String getData() {
            return this.data;
        }

        public QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressExecuteGroupsDeployTask setFinishedTime(String finishedTime) {
            this.finishedTime = finishedTime;
            return this;
        }
        public String getFinishedTime() {
            return this.finishedTime;
        }

        public QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressExecuteGroupsDeployTask setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressExecuteGroupsDeployTask setIgnoreSupported(Boolean ignoreSupported) {
            this.ignoreSupported = ignoreSupported;
            return this;
        }
        public Boolean getIgnoreSupported() {
            return this.ignoreSupported;
        }

        public QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressExecuteGroupsDeployTask setRetrySupported(Boolean retrySupported) {
            this.retrySupported = retrySupported;
            return this;
        }
        public Boolean getRetrySupported() {
            return this.retrySupported;
        }

        public QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressExecuteGroupsDeployTask setStartedTime(String startedTime) {
            this.startedTime = startedTime;
            return this;
        }
        public String getStartedTime() {
            return this.startedTime;
        }

        public QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressExecuteGroupsDeployTask setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressExecuteGroupsDeployTask setAppDeployCells(java.util.List<QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressExecuteGroupsDeployTaskAppDeployCells> appDeployCells) {
            this.appDeployCells = appDeployCells;
            return this;
        }
        public java.util.List<QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressExecuteGroupsDeployTaskAppDeployCells> getAppDeployCells() {
            return this.appDeployCells;
        }

    }

    public static class QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressExecuteGroups extends TeaModel {
        @NameInMap("PostTasks")
        public java.util.List<QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressExecuteGroupsPostTasks> postTasks;

        @NameInMap("PreTasks")
        public java.util.List<QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressExecuteGroupsPreTasks> preTasks;

        @NameInMap("DeployTask")
        public QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressExecuteGroupsDeployTask deployTask;

        public static QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressExecuteGroups build(java.util.Map<String, ?> map) throws Exception {
            QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressExecuteGroups self = new QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressExecuteGroups();
            return TeaModel.build(map, self);
        }

        public QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressExecuteGroups setPostTasks(java.util.List<QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressExecuteGroupsPostTasks> postTasks) {
            this.postTasks = postTasks;
            return this;
        }
        public java.util.List<QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressExecuteGroupsPostTasks> getPostTasks() {
            return this.postTasks;
        }

        public QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressExecuteGroups setPreTasks(java.util.List<QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressExecuteGroupsPreTasks> preTasks) {
            this.preTasks = preTasks;
            return this;
        }
        public java.util.List<QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressExecuteGroupsPreTasks> getPreTasks() {
            return this.preTasks;
        }

        public QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressExecuteGroups setDeployTask(QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressExecuteGroupsDeployTask deployTask) {
            this.deployTask = deployTask;
            return this;
        }
        public QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressExecuteGroupsDeployTask getDeployTask() {
            return this.deployTask;
        }

    }

    public static class QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressPostTasksAppDeployCellsPodList extends TeaModel {
        @NameInMap("Cluster")
        public String cluster;

        @NameInMap("CreatedTime")
        public String createdTime;

        @NameInMap("LifecycleStage")
        public String lifecycleStage;

        @NameInMap("Message")
        public String message;

        @NameInMap("Name")
        public String name;

        @NameInMap("Namespace")
        public String namespace;

        @NameInMap("PodIp")
        public String podIp;

        @NameInMap("Revision")
        public String revision;

        @NameInMap("Status")
        public String status;

        @NameInMap("Uid")
        public String uid;

        @NameInMap("Finalizers")
        public java.util.List<String> finalizers;

        public static QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressPostTasksAppDeployCellsPodList build(java.util.Map<String, ?> map) throws Exception {
            QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressPostTasksAppDeployCellsPodList self = new QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressPostTasksAppDeployCellsPodList();
            return TeaModel.build(map, self);
        }

        public QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressPostTasksAppDeployCellsPodList setCluster(String cluster) {
            this.cluster = cluster;
            return this;
        }
        public String getCluster() {
            return this.cluster;
        }

        public QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressPostTasksAppDeployCellsPodList setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressPostTasksAppDeployCellsPodList setLifecycleStage(String lifecycleStage) {
            this.lifecycleStage = lifecycleStage;
            return this;
        }
        public String getLifecycleStage() {
            return this.lifecycleStage;
        }

        public QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressPostTasksAppDeployCellsPodList setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressPostTasksAppDeployCellsPodList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressPostTasksAppDeployCellsPodList setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressPostTasksAppDeployCellsPodList setPodIp(String podIp) {
            this.podIp = podIp;
            return this;
        }
        public String getPodIp() {
            return this.podIp;
        }

        public QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressPostTasksAppDeployCellsPodList setRevision(String revision) {
            this.revision = revision;
            return this;
        }
        public String getRevision() {
            return this.revision;
        }

        public QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressPostTasksAppDeployCellsPodList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressPostTasksAppDeployCellsPodList setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

        public QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressPostTasksAppDeployCellsPodList setFinalizers(java.util.List<String> finalizers) {
            this.finalizers = finalizers;
            return this;
        }
        public java.util.List<String> getFinalizers() {
            return this.finalizers;
        }

    }

    public static class QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressPostTasksAppDeployCells extends TeaModel {
        @NameInMap("CellName")
        public String cellName;

        @NameInMap("Partition")
        public Long partition;

        @NameInMap("ReleaseCount")
        public Long releaseCount;

        @NameInMap("PodList")
        public java.util.List<QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressPostTasksAppDeployCellsPodList> podList;

        public static QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressPostTasksAppDeployCells build(java.util.Map<String, ?> map) throws Exception {
            QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressPostTasksAppDeployCells self = new QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressPostTasksAppDeployCells();
            return TeaModel.build(map, self);
        }

        public QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressPostTasksAppDeployCells setCellName(String cellName) {
            this.cellName = cellName;
            return this;
        }
        public String getCellName() {
            return this.cellName;
        }

        public QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressPostTasksAppDeployCells setPartition(Long partition) {
            this.partition = partition;
            return this;
        }
        public Long getPartition() {
            return this.partition;
        }

        public QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressPostTasksAppDeployCells setReleaseCount(Long releaseCount) {
            this.releaseCount = releaseCount;
            return this;
        }
        public Long getReleaseCount() {
            return this.releaseCount;
        }

        public QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressPostTasksAppDeployCells setPodList(java.util.List<QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressPostTasksAppDeployCellsPodList> podList) {
            this.podList = podList;
            return this;
        }
        public java.util.List<QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressPostTasksAppDeployCellsPodList> getPodList() {
            return this.podList;
        }

    }

    public static class QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressPostTasks extends TeaModel {
        @NameInMap("ActionCode")
        public String actionCode;

        @NameInMap("ConfirmSupported")
        public Boolean confirmSupported;

        @NameInMap("Data")
        public String data;

        @NameInMap("FinishedTime")
        public String finishedTime;

        @NameInMap("Id")
        public String id;

        @NameInMap("IgnoreSupported")
        public Boolean ignoreSupported;

        @NameInMap("RetrySupported")
        public Boolean retrySupported;

        @NameInMap("StartedTime")
        public String startedTime;

        @NameInMap("State")
        public String state;

        @NameInMap("AppDeployCells")
        public java.util.List<QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressPostTasksAppDeployCells> appDeployCells;

        public static QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressPostTasks build(java.util.Map<String, ?> map) throws Exception {
            QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressPostTasks self = new QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressPostTasks();
            return TeaModel.build(map, self);
        }

        public QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressPostTasks setActionCode(String actionCode) {
            this.actionCode = actionCode;
            return this;
        }
        public String getActionCode() {
            return this.actionCode;
        }

        public QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressPostTasks setConfirmSupported(Boolean confirmSupported) {
            this.confirmSupported = confirmSupported;
            return this;
        }
        public Boolean getConfirmSupported() {
            return this.confirmSupported;
        }

        public QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressPostTasks setData(String data) {
            this.data = data;
            return this;
        }
        public String getData() {
            return this.data;
        }

        public QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressPostTasks setFinishedTime(String finishedTime) {
            this.finishedTime = finishedTime;
            return this;
        }
        public String getFinishedTime() {
            return this.finishedTime;
        }

        public QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressPostTasks setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressPostTasks setIgnoreSupported(Boolean ignoreSupported) {
            this.ignoreSupported = ignoreSupported;
            return this;
        }
        public Boolean getIgnoreSupported() {
            return this.ignoreSupported;
        }

        public QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressPostTasks setRetrySupported(Boolean retrySupported) {
            this.retrySupported = retrySupported;
            return this;
        }
        public Boolean getRetrySupported() {
            return this.retrySupported;
        }

        public QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressPostTasks setStartedTime(String startedTime) {
            this.startedTime = startedTime;
            return this;
        }
        public String getStartedTime() {
            return this.startedTime;
        }

        public QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressPostTasks setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressPostTasks setAppDeployCells(java.util.List<QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressPostTasksAppDeployCells> appDeployCells) {
            this.appDeployCells = appDeployCells;
            return this;
        }
        public java.util.List<QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressPostTasksAppDeployCells> getAppDeployCells() {
            return this.appDeployCells;
        }

    }

    public static class QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressPreTasksAppDeployCellsPodList extends TeaModel {
        @NameInMap("Cluster")
        public String cluster;

        @NameInMap("CreatedTime")
        public String createdTime;

        @NameInMap("LifecycleStage")
        public String lifecycleStage;

        @NameInMap("Message")
        public String message;

        @NameInMap("Name")
        public String name;

        @NameInMap("Namespace")
        public String namespace;

        @NameInMap("PodIp")
        public String podIp;

        @NameInMap("Revision")
        public String revision;

        @NameInMap("Status")
        public String status;

        @NameInMap("Uid")
        public String uid;

        @NameInMap("Finalizers")
        public java.util.List<String> finalizers;

        public static QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressPreTasksAppDeployCellsPodList build(java.util.Map<String, ?> map) throws Exception {
            QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressPreTasksAppDeployCellsPodList self = new QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressPreTasksAppDeployCellsPodList();
            return TeaModel.build(map, self);
        }

        public QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressPreTasksAppDeployCellsPodList setCluster(String cluster) {
            this.cluster = cluster;
            return this;
        }
        public String getCluster() {
            return this.cluster;
        }

        public QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressPreTasksAppDeployCellsPodList setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressPreTasksAppDeployCellsPodList setLifecycleStage(String lifecycleStage) {
            this.lifecycleStage = lifecycleStage;
            return this;
        }
        public String getLifecycleStage() {
            return this.lifecycleStage;
        }

        public QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressPreTasksAppDeployCellsPodList setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressPreTasksAppDeployCellsPodList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressPreTasksAppDeployCellsPodList setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressPreTasksAppDeployCellsPodList setPodIp(String podIp) {
            this.podIp = podIp;
            return this;
        }
        public String getPodIp() {
            return this.podIp;
        }

        public QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressPreTasksAppDeployCellsPodList setRevision(String revision) {
            this.revision = revision;
            return this;
        }
        public String getRevision() {
            return this.revision;
        }

        public QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressPreTasksAppDeployCellsPodList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressPreTasksAppDeployCellsPodList setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

        public QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressPreTasksAppDeployCellsPodList setFinalizers(java.util.List<String> finalizers) {
            this.finalizers = finalizers;
            return this;
        }
        public java.util.List<String> getFinalizers() {
            return this.finalizers;
        }

    }

    public static class QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressPreTasksAppDeployCells extends TeaModel {
        @NameInMap("CellName")
        public String cellName;

        @NameInMap("Partition")
        public Long partition;

        @NameInMap("ReleaseCount")
        public Long releaseCount;

        @NameInMap("PodList")
        public java.util.List<QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressPreTasksAppDeployCellsPodList> podList;

        public static QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressPreTasksAppDeployCells build(java.util.Map<String, ?> map) throws Exception {
            QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressPreTasksAppDeployCells self = new QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressPreTasksAppDeployCells();
            return TeaModel.build(map, self);
        }

        public QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressPreTasksAppDeployCells setCellName(String cellName) {
            this.cellName = cellName;
            return this;
        }
        public String getCellName() {
            return this.cellName;
        }

        public QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressPreTasksAppDeployCells setPartition(Long partition) {
            this.partition = partition;
            return this;
        }
        public Long getPartition() {
            return this.partition;
        }

        public QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressPreTasksAppDeployCells setReleaseCount(Long releaseCount) {
            this.releaseCount = releaseCount;
            return this;
        }
        public Long getReleaseCount() {
            return this.releaseCount;
        }

        public QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressPreTasksAppDeployCells setPodList(java.util.List<QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressPreTasksAppDeployCellsPodList> podList) {
            this.podList = podList;
            return this;
        }
        public java.util.List<QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressPreTasksAppDeployCellsPodList> getPodList() {
            return this.podList;
        }

    }

    public static class QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressPreTasks extends TeaModel {
        @NameInMap("ActionCode")
        public String actionCode;

        @NameInMap("ConfirmSupported")
        public Boolean confirmSupported;

        @NameInMap("Data")
        public String data;

        @NameInMap("FinishedTime")
        public String finishedTime;

        @NameInMap("Id")
        public String id;

        @NameInMap("IgnoreSupported")
        public Boolean ignoreSupported;

        @NameInMap("RetrySupported")
        public Boolean retrySupported;

        @NameInMap("StartedTime")
        public String startedTime;

        @NameInMap("State")
        public String state;

        @NameInMap("AppDeployCells")
        public java.util.List<QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressPreTasksAppDeployCells> appDeployCells;

        public static QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressPreTasks build(java.util.Map<String, ?> map) throws Exception {
            QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressPreTasks self = new QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressPreTasks();
            return TeaModel.build(map, self);
        }

        public QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressPreTasks setActionCode(String actionCode) {
            this.actionCode = actionCode;
            return this;
        }
        public String getActionCode() {
            return this.actionCode;
        }

        public QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressPreTasks setConfirmSupported(Boolean confirmSupported) {
            this.confirmSupported = confirmSupported;
            return this;
        }
        public Boolean getConfirmSupported() {
            return this.confirmSupported;
        }

        public QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressPreTasks setData(String data) {
            this.data = data;
            return this;
        }
        public String getData() {
            return this.data;
        }

        public QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressPreTasks setFinishedTime(String finishedTime) {
            this.finishedTime = finishedTime;
            return this;
        }
        public String getFinishedTime() {
            return this.finishedTime;
        }

        public QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressPreTasks setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressPreTasks setIgnoreSupported(Boolean ignoreSupported) {
            this.ignoreSupported = ignoreSupported;
            return this;
        }
        public Boolean getIgnoreSupported() {
            return this.ignoreSupported;
        }

        public QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressPreTasks setRetrySupported(Boolean retrySupported) {
            this.retrySupported = retrySupported;
            return this;
        }
        public Boolean getRetrySupported() {
            return this.retrySupported;
        }

        public QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressPreTasks setStartedTime(String startedTime) {
            this.startedTime = startedTime;
            return this;
        }
        public String getStartedTime() {
            return this.startedTime;
        }

        public QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressPreTasks setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressPreTasks setAppDeployCells(java.util.List<QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressPreTasksAppDeployCells> appDeployCells) {
            this.appDeployCells = appDeployCells;
            return this;
        }
        public java.util.List<QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressPreTasksAppDeployCells> getAppDeployCells() {
            return this.appDeployCells;
        }

    }

    public static class QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressPodStateSummary extends TeaModel {
        @NameInMap("Blocked")
        public Long blocked;

        @NameInMap("Executing")
        public Long executing;

        @NameInMap("Failed")
        public Long failed;

        @NameInMap("Id")
        public String id;

        @NameInMap("Inited")
        public Long inited;

        @NameInMap("State")
        public String state;

        @NameInMap("Succeeded")
        public Long succeeded;

        @NameInMap("Total")
        public Long total;

        @NameInMap("Waiting")
        public Long waiting;

        public static QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressPodStateSummary build(java.util.Map<String, ?> map) throws Exception {
            QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressPodStateSummary self = new QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressPodStateSummary();
            return TeaModel.build(map, self);
        }

        public QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressPodStateSummary setBlocked(Long blocked) {
            this.blocked = blocked;
            return this;
        }
        public Long getBlocked() {
            return this.blocked;
        }

        public QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressPodStateSummary setExecuting(Long executing) {
            this.executing = executing;
            return this;
        }
        public Long getExecuting() {
            return this.executing;
        }

        public QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressPodStateSummary setFailed(Long failed) {
            this.failed = failed;
            return this;
        }
        public Long getFailed() {
            return this.failed;
        }

        public QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressPodStateSummary setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressPodStateSummary setInited(Long inited) {
            this.inited = inited;
            return this;
        }
        public Long getInited() {
            return this.inited;
        }

        public QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressPodStateSummary setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressPodStateSummary setSucceeded(Long succeeded) {
            this.succeeded = succeeded;
            return this;
        }
        public Long getSucceeded() {
            return this.succeeded;
        }

        public QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressPodStateSummary setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

        public QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressPodStateSummary setWaiting(Long waiting) {
            this.waiting = waiting;
            return this;
        }
        public Long getWaiting() {
            return this.waiting;
        }

    }

    public static class QueryLDCOpsplanAppprogressResponseBodyAppDeployProgress extends TeaModel {
        @NameInMap("FinishTime")
        public String finishTime;

        @NameInMap("Id")
        public String id;

        @NameInMap("IsRollBack")
        public Boolean isRollBack;

        @NameInMap("Namespace")
        public String namespace;

        @NameInMap("RollBackServiceId")
        public String rollBackServiceId;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("State")
        public String state;

        @NameInMap("ComponentList")
        public java.util.List<String> componentList;

        @NameInMap("ExecuteGroups")
        public java.util.List<QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressExecuteGroups> executeGroups;

        @NameInMap("PostTasks")
        public java.util.List<QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressPostTasks> postTasks;

        @NameInMap("PreTasks")
        public java.util.List<QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressPreTasks> preTasks;

        @NameInMap("PodStateSummary")
        public QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressPodStateSummary podStateSummary;

        public static QueryLDCOpsplanAppprogressResponseBodyAppDeployProgress build(java.util.Map<String, ?> map) throws Exception {
            QueryLDCOpsplanAppprogressResponseBodyAppDeployProgress self = new QueryLDCOpsplanAppprogressResponseBodyAppDeployProgress();
            return TeaModel.build(map, self);
        }

        public QueryLDCOpsplanAppprogressResponseBodyAppDeployProgress setFinishTime(String finishTime) {
            this.finishTime = finishTime;
            return this;
        }
        public String getFinishTime() {
            return this.finishTime;
        }

        public QueryLDCOpsplanAppprogressResponseBodyAppDeployProgress setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryLDCOpsplanAppprogressResponseBodyAppDeployProgress setIsRollBack(Boolean isRollBack) {
            this.isRollBack = isRollBack;
            return this;
        }
        public Boolean getIsRollBack() {
            return this.isRollBack;
        }

        public QueryLDCOpsplanAppprogressResponseBodyAppDeployProgress setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public QueryLDCOpsplanAppprogressResponseBodyAppDeployProgress setRollBackServiceId(String rollBackServiceId) {
            this.rollBackServiceId = rollBackServiceId;
            return this;
        }
        public String getRollBackServiceId() {
            return this.rollBackServiceId;
        }

        public QueryLDCOpsplanAppprogressResponseBodyAppDeployProgress setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public QueryLDCOpsplanAppprogressResponseBodyAppDeployProgress setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public QueryLDCOpsplanAppprogressResponseBodyAppDeployProgress setComponentList(java.util.List<String> componentList) {
            this.componentList = componentList;
            return this;
        }
        public java.util.List<String> getComponentList() {
            return this.componentList;
        }

        public QueryLDCOpsplanAppprogressResponseBodyAppDeployProgress setExecuteGroups(java.util.List<QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressExecuteGroups> executeGroups) {
            this.executeGroups = executeGroups;
            return this;
        }
        public java.util.List<QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressExecuteGroups> getExecuteGroups() {
            return this.executeGroups;
        }

        public QueryLDCOpsplanAppprogressResponseBodyAppDeployProgress setPostTasks(java.util.List<QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressPostTasks> postTasks) {
            this.postTasks = postTasks;
            return this;
        }
        public java.util.List<QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressPostTasks> getPostTasks() {
            return this.postTasks;
        }

        public QueryLDCOpsplanAppprogressResponseBodyAppDeployProgress setPreTasks(java.util.List<QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressPreTasks> preTasks) {
            this.preTasks = preTasks;
            return this;
        }
        public java.util.List<QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressPreTasks> getPreTasks() {
            return this.preTasks;
        }

        public QueryLDCOpsplanAppprogressResponseBodyAppDeployProgress setPodStateSummary(QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressPodStateSummary podStateSummary) {
            this.podStateSummary = podStateSummary;
            return this;
        }
        public QueryLDCOpsplanAppprogressResponseBodyAppDeployProgressPodStateSummary getPodStateSummary() {
            return this.podStateSummary;
        }

    }

}
