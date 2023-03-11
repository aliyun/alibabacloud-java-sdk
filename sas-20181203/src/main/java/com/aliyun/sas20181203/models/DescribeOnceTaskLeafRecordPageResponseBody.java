// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeOnceTaskLeafRecordPageResponseBody extends TeaModel {
    @NameInMap("OnceTasks")
    public java.util.List<DescribeOnceTaskLeafRecordPageResponseBodyOnceTasks> onceTasks;

    @NameInMap("PageInfo")
    public DescribeOnceTaskLeafRecordPageResponseBodyPageInfo pageInfo;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeOnceTaskLeafRecordPageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeOnceTaskLeafRecordPageResponseBody self = new DescribeOnceTaskLeafRecordPageResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeOnceTaskLeafRecordPageResponseBody setOnceTasks(java.util.List<DescribeOnceTaskLeafRecordPageResponseBodyOnceTasks> onceTasks) {
        this.onceTasks = onceTasks;
        return this;
    }
    public java.util.List<DescribeOnceTaskLeafRecordPageResponseBodyOnceTasks> getOnceTasks() {
        return this.onceTasks;
    }

    public DescribeOnceTaskLeafRecordPageResponseBody setPageInfo(DescribeOnceTaskLeafRecordPageResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public DescribeOnceTaskLeafRecordPageResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public DescribeOnceTaskLeafRecordPageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeOnceTaskLeafRecordPageResponseBodyOnceTasksTaskImageInfo extends TeaModel {
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

        public static DescribeOnceTaskLeafRecordPageResponseBodyOnceTasksTaskImageInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeOnceTaskLeafRecordPageResponseBodyOnceTasksTaskImageInfo self = new DescribeOnceTaskLeafRecordPageResponseBodyOnceTasksTaskImageInfo();
            return TeaModel.build(map, self);
        }

        public DescribeOnceTaskLeafRecordPageResponseBodyOnceTasksTaskImageInfo setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public DescribeOnceTaskLeafRecordPageResponseBodyOnceTasksTaskImageInfo setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public DescribeOnceTaskLeafRecordPageResponseBodyOnceTasksTaskImageInfo setClusterName(String clusterName) {
            this.clusterName = clusterName;
            return this;
        }
        public String getClusterName() {
            return this.clusterName;
        }

        public DescribeOnceTaskLeafRecordPageResponseBodyOnceTasksTaskImageInfo setDigest(String digest) {
            this.digest = digest;
            return this;
        }
        public String getDigest() {
            return this.digest;
        }

        public DescribeOnceTaskLeafRecordPageResponseBodyOnceTasksTaskImageInfo setImage(String image) {
            this.image = image;
            return this;
        }
        public String getImage() {
            return this.image;
        }

        public DescribeOnceTaskLeafRecordPageResponseBodyOnceTasksTaskImageInfo setNodeInstanceId(String nodeInstanceId) {
            this.nodeInstanceId = nodeInstanceId;
            return this;
        }
        public String getNodeInstanceId() {
            return this.nodeInstanceId;
        }

        public DescribeOnceTaskLeafRecordPageResponseBodyOnceTasksTaskImageInfo setNodeIp(String nodeIp) {
            this.nodeIp = nodeIp;
            return this;
        }
        public String getNodeIp() {
            return this.nodeIp;
        }

        public DescribeOnceTaskLeafRecordPageResponseBodyOnceTasksTaskImageInfo setNodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }
        public String getNodeName() {
            return this.nodeName;
        }

        public DescribeOnceTaskLeafRecordPageResponseBodyOnceTasksTaskImageInfo setPod(String pod) {
            this.pod = pod;
            return this;
        }
        public String getPod() {
            return this.pod;
        }

        public DescribeOnceTaskLeafRecordPageResponseBodyOnceTasksTaskImageInfo setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeOnceTaskLeafRecordPageResponseBodyOnceTasksTaskImageInfo setRepoId(String repoId) {
            this.repoId = repoId;
            return this;
        }
        public String getRepoId() {
            return this.repoId;
        }

        public DescribeOnceTaskLeafRecordPageResponseBodyOnceTasksTaskImageInfo setRepoName(String repoName) {
            this.repoName = repoName;
            return this;
        }
        public String getRepoName() {
            return this.repoName;
        }

        public DescribeOnceTaskLeafRecordPageResponseBodyOnceTasksTaskImageInfo setRepoNamespace(String repoNamespace) {
            this.repoNamespace = repoNamespace;
            return this;
        }
        public String getRepoNamespace() {
            return this.repoNamespace;
        }

        public DescribeOnceTaskLeafRecordPageResponseBodyOnceTasksTaskImageInfo setRepoRegionId(String repoRegionId) {
            this.repoRegionId = repoRegionId;
            return this;
        }
        public String getRepoRegionId() {
            return this.repoRegionId;
        }

        public DescribeOnceTaskLeafRecordPageResponseBodyOnceTasksTaskImageInfo setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

    }

    public static class DescribeOnceTaskLeafRecordPageResponseBodyOnceTasks extends TeaModel {
        @NameInMap("EndTime")
        public Long endTime;

        @NameInMap("Finish")
        public Integer finish;

        @NameInMap("FinishCount")
        public String finishCount;

        @NameInMap("Progress")
        public Long progress;

        @NameInMap("RealRunTime")
        public Long realRunTime;

        @NameInMap("ResultInfo")
        public String resultInfo;

        @NameInMap("StartTime")
        public Long startTime;

        @NameInMap("Status")
        public String status;

        @NameInMap("StatusText")
        public String statusText;

        @NameInMap("Target")
        public String target;

        @NameInMap("TargetType")
        public String targetType;

        @NameInMap("TaskId")
        public String taskId;

        @NameInMap("TaskImageInfo")
        public DescribeOnceTaskLeafRecordPageResponseBodyOnceTasksTaskImageInfo taskImageInfo;

        @NameInMap("TaskName")
        public String taskName;

        @NameInMap("TaskType")
        public String taskType;

        @NameInMap("TotalCount")
        public String totalCount;

        public static DescribeOnceTaskLeafRecordPageResponseBodyOnceTasks build(java.util.Map<String, ?> map) throws Exception {
            DescribeOnceTaskLeafRecordPageResponseBodyOnceTasks self = new DescribeOnceTaskLeafRecordPageResponseBodyOnceTasks();
            return TeaModel.build(map, self);
        }

        public DescribeOnceTaskLeafRecordPageResponseBodyOnceTasks setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public DescribeOnceTaskLeafRecordPageResponseBodyOnceTasks setFinish(Integer finish) {
            this.finish = finish;
            return this;
        }
        public Integer getFinish() {
            return this.finish;
        }

        public DescribeOnceTaskLeafRecordPageResponseBodyOnceTasks setFinishCount(String finishCount) {
            this.finishCount = finishCount;
            return this;
        }
        public String getFinishCount() {
            return this.finishCount;
        }

        public DescribeOnceTaskLeafRecordPageResponseBodyOnceTasks setProgress(Long progress) {
            this.progress = progress;
            return this;
        }
        public Long getProgress() {
            return this.progress;
        }

        public DescribeOnceTaskLeafRecordPageResponseBodyOnceTasks setRealRunTime(Long realRunTime) {
            this.realRunTime = realRunTime;
            return this;
        }
        public Long getRealRunTime() {
            return this.realRunTime;
        }

        public DescribeOnceTaskLeafRecordPageResponseBodyOnceTasks setResultInfo(String resultInfo) {
            this.resultInfo = resultInfo;
            return this;
        }
        public String getResultInfo() {
            return this.resultInfo;
        }

        public DescribeOnceTaskLeafRecordPageResponseBodyOnceTasks setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public DescribeOnceTaskLeafRecordPageResponseBodyOnceTasks setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeOnceTaskLeafRecordPageResponseBodyOnceTasks setStatusText(String statusText) {
            this.statusText = statusText;
            return this;
        }
        public String getStatusText() {
            return this.statusText;
        }

        public DescribeOnceTaskLeafRecordPageResponseBodyOnceTasks setTarget(String target) {
            this.target = target;
            return this;
        }
        public String getTarget() {
            return this.target;
        }

        public DescribeOnceTaskLeafRecordPageResponseBodyOnceTasks setTargetType(String targetType) {
            this.targetType = targetType;
            return this;
        }
        public String getTargetType() {
            return this.targetType;
        }

        public DescribeOnceTaskLeafRecordPageResponseBodyOnceTasks setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public DescribeOnceTaskLeafRecordPageResponseBodyOnceTasks setTaskImageInfo(DescribeOnceTaskLeafRecordPageResponseBodyOnceTasksTaskImageInfo taskImageInfo) {
            this.taskImageInfo = taskImageInfo;
            return this;
        }
        public DescribeOnceTaskLeafRecordPageResponseBodyOnceTasksTaskImageInfo getTaskImageInfo() {
            return this.taskImageInfo;
        }

        public DescribeOnceTaskLeafRecordPageResponseBodyOnceTasks setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

        public DescribeOnceTaskLeafRecordPageResponseBodyOnceTasks setTaskType(String taskType) {
            this.taskType = taskType;
            return this;
        }
        public String getTaskType() {
            return this.taskType;
        }

        public DescribeOnceTaskLeafRecordPageResponseBodyOnceTasks setTotalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public String getTotalCount() {
            return this.totalCount;
        }

    }

    public static class DescribeOnceTaskLeafRecordPageResponseBodyPageInfo extends TeaModel {
        @NameInMap("Count")
        public Integer count;

        @NameInMap("CurrentPage")
        public Integer currentPage;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static DescribeOnceTaskLeafRecordPageResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeOnceTaskLeafRecordPageResponseBodyPageInfo self = new DescribeOnceTaskLeafRecordPageResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public DescribeOnceTaskLeafRecordPageResponseBodyPageInfo setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public DescribeOnceTaskLeafRecordPageResponseBodyPageInfo setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public DescribeOnceTaskLeafRecordPageResponseBodyPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public DescribeOnceTaskLeafRecordPageResponseBodyPageInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
