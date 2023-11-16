// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListUnfinishedOnceTaskResponseBody extends TeaModel {
    @NameInMap("OnceTasks")
    public java.util.List<ListUnfinishedOnceTaskResponseBodyOnceTasks> onceTasks;

    @NameInMap("RequestId")
    public String requestId;

    public static ListUnfinishedOnceTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListUnfinishedOnceTaskResponseBody self = new ListUnfinishedOnceTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public ListUnfinishedOnceTaskResponseBody setOnceTasks(java.util.List<ListUnfinishedOnceTaskResponseBodyOnceTasks> onceTasks) {
        this.onceTasks = onceTasks;
        return this;
    }
    public java.util.List<ListUnfinishedOnceTaskResponseBodyOnceTasks> getOnceTasks() {
        return this.onceTasks;
    }

    public ListUnfinishedOnceTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListUnfinishedOnceTaskResponseBodyOnceTasksTaskImageInfo extends TeaModel {
        @NameInMap("AppName")
        public String appName;

        @NameInMap("ClusterId")
        public String clusterId;

        @NameInMap("ClusterName")
        public String clusterName;

        @NameInMap("Digest")
        public String digest;

        @NameInMap("Image")
        public String image;

        @NameInMap("NodeInstanceId")
        public String nodeInstanceId;

        @NameInMap("NodeIp")
        public String nodeIp;

        @NameInMap("NodeName")
        public String nodeName;

        @NameInMap("Pod")
        public String pod;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("RepoId")
        public String repoId;

        @NameInMap("RepoName")
        public String repoName;

        @NameInMap("RepoNamespace")
        public String repoNamespace;

        @NameInMap("RepoRegionId")
        public String repoRegionId;

        @NameInMap("Tag")
        public String tag;

        public static ListUnfinishedOnceTaskResponseBodyOnceTasksTaskImageInfo build(java.util.Map<String, ?> map) throws Exception {
            ListUnfinishedOnceTaskResponseBodyOnceTasksTaskImageInfo self = new ListUnfinishedOnceTaskResponseBodyOnceTasksTaskImageInfo();
            return TeaModel.build(map, self);
        }

        public ListUnfinishedOnceTaskResponseBodyOnceTasksTaskImageInfo setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public ListUnfinishedOnceTaskResponseBodyOnceTasksTaskImageInfo setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public ListUnfinishedOnceTaskResponseBodyOnceTasksTaskImageInfo setClusterName(String clusterName) {
            this.clusterName = clusterName;
            return this;
        }
        public String getClusterName() {
            return this.clusterName;
        }

        public ListUnfinishedOnceTaskResponseBodyOnceTasksTaskImageInfo setDigest(String digest) {
            this.digest = digest;
            return this;
        }
        public String getDigest() {
            return this.digest;
        }

        public ListUnfinishedOnceTaskResponseBodyOnceTasksTaskImageInfo setImage(String image) {
            this.image = image;
            return this;
        }
        public String getImage() {
            return this.image;
        }

        public ListUnfinishedOnceTaskResponseBodyOnceTasksTaskImageInfo setNodeInstanceId(String nodeInstanceId) {
            this.nodeInstanceId = nodeInstanceId;
            return this;
        }
        public String getNodeInstanceId() {
            return this.nodeInstanceId;
        }

        public ListUnfinishedOnceTaskResponseBodyOnceTasksTaskImageInfo setNodeIp(String nodeIp) {
            this.nodeIp = nodeIp;
            return this;
        }
        public String getNodeIp() {
            return this.nodeIp;
        }

        public ListUnfinishedOnceTaskResponseBodyOnceTasksTaskImageInfo setNodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }
        public String getNodeName() {
            return this.nodeName;
        }

        public ListUnfinishedOnceTaskResponseBodyOnceTasksTaskImageInfo setPod(String pod) {
            this.pod = pod;
            return this;
        }
        public String getPod() {
            return this.pod;
        }

        public ListUnfinishedOnceTaskResponseBodyOnceTasksTaskImageInfo setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListUnfinishedOnceTaskResponseBodyOnceTasksTaskImageInfo setRepoId(String repoId) {
            this.repoId = repoId;
            return this;
        }
        public String getRepoId() {
            return this.repoId;
        }

        public ListUnfinishedOnceTaskResponseBodyOnceTasksTaskImageInfo setRepoName(String repoName) {
            this.repoName = repoName;
            return this;
        }
        public String getRepoName() {
            return this.repoName;
        }

        public ListUnfinishedOnceTaskResponseBodyOnceTasksTaskImageInfo setRepoNamespace(String repoNamespace) {
            this.repoNamespace = repoNamespace;
            return this;
        }
        public String getRepoNamespace() {
            return this.repoNamespace;
        }

        public ListUnfinishedOnceTaskResponseBodyOnceTasksTaskImageInfo setRepoRegionId(String repoRegionId) {
            this.repoRegionId = repoRegionId;
            return this;
        }
        public String getRepoRegionId() {
            return this.repoRegionId;
        }

        public ListUnfinishedOnceTaskResponseBodyOnceTasksTaskImageInfo setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

    }

    public static class ListUnfinishedOnceTaskResponseBodyOnceTasks extends TeaModel {
        @NameInMap("EndTime")
        public Long endTime;

        @NameInMap("Finish")
        public Integer finish;

        @NameInMap("FinishCount")
        public Integer finishCount;

        @NameInMap("Progress")
        public Long progress;

        @NameInMap("RealRunTime")
        public Long realRunTime;

        @NameInMap("ResultInfo")
        public String resultInfo;

        @NameInMap("StartTime")
        public Long startTime;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("StatusText")
        public String statusText;

        @NameInMap("Target")
        public String target;

        @NameInMap("TargetType")
        public String targetType;

        @NameInMap("TaskId")
        public String taskId;

        @NameInMap("TaskImageInfo")
        public ListUnfinishedOnceTaskResponseBodyOnceTasksTaskImageInfo taskImageInfo;

        @NameInMap("TaskName")
        public String taskName;

        @NameInMap("TaskType")
        public String taskType;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListUnfinishedOnceTaskResponseBodyOnceTasks build(java.util.Map<String, ?> map) throws Exception {
            ListUnfinishedOnceTaskResponseBodyOnceTasks self = new ListUnfinishedOnceTaskResponseBodyOnceTasks();
            return TeaModel.build(map, self);
        }

        public ListUnfinishedOnceTaskResponseBodyOnceTasks setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public ListUnfinishedOnceTaskResponseBodyOnceTasks setFinish(Integer finish) {
            this.finish = finish;
            return this;
        }
        public Integer getFinish() {
            return this.finish;
        }

        public ListUnfinishedOnceTaskResponseBodyOnceTasks setFinishCount(Integer finishCount) {
            this.finishCount = finishCount;
            return this;
        }
        public Integer getFinishCount() {
            return this.finishCount;
        }

        public ListUnfinishedOnceTaskResponseBodyOnceTasks setProgress(Long progress) {
            this.progress = progress;
            return this;
        }
        public Long getProgress() {
            return this.progress;
        }

        public ListUnfinishedOnceTaskResponseBodyOnceTasks setRealRunTime(Long realRunTime) {
            this.realRunTime = realRunTime;
            return this;
        }
        public Long getRealRunTime() {
            return this.realRunTime;
        }

        public ListUnfinishedOnceTaskResponseBodyOnceTasks setResultInfo(String resultInfo) {
            this.resultInfo = resultInfo;
            return this;
        }
        public String getResultInfo() {
            return this.resultInfo;
        }

        public ListUnfinishedOnceTaskResponseBodyOnceTasks setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public ListUnfinishedOnceTaskResponseBodyOnceTasks setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ListUnfinishedOnceTaskResponseBodyOnceTasks setStatusText(String statusText) {
            this.statusText = statusText;
            return this;
        }
        public String getStatusText() {
            return this.statusText;
        }

        public ListUnfinishedOnceTaskResponseBodyOnceTasks setTarget(String target) {
            this.target = target;
            return this;
        }
        public String getTarget() {
            return this.target;
        }

        public ListUnfinishedOnceTaskResponseBodyOnceTasks setTargetType(String targetType) {
            this.targetType = targetType;
            return this;
        }
        public String getTargetType() {
            return this.targetType;
        }

        public ListUnfinishedOnceTaskResponseBodyOnceTasks setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public ListUnfinishedOnceTaskResponseBodyOnceTasks setTaskImageInfo(ListUnfinishedOnceTaskResponseBodyOnceTasksTaskImageInfo taskImageInfo) {
            this.taskImageInfo = taskImageInfo;
            return this;
        }
        public ListUnfinishedOnceTaskResponseBodyOnceTasksTaskImageInfo getTaskImageInfo() {
            return this.taskImageInfo;
        }

        public ListUnfinishedOnceTaskResponseBodyOnceTasks setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

        public ListUnfinishedOnceTaskResponseBodyOnceTasks setTaskType(String taskType) {
            this.taskType = taskType;
            return this;
        }
        public String getTaskType() {
            return this.taskType;
        }

        public ListUnfinishedOnceTaskResponseBodyOnceTasks setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
