// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListUnfinishedOnceTaskResponseBody extends TeaModel {
    /**
     * <p>The details of the tasks.</p>
     */
    @NameInMap("OnceTasks")
    public java.util.List<ListUnfinishedOnceTaskResponseBodyOnceTasks> onceTasks;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>F5CF78A7-30AA-59DB-847F-13EE3AE7****</p>
     */
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
        /**
         * <p>The name of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>ack-jenkins-****</p>
         */
        @NameInMap("AppName")
        public String appName;

        /**
         * <p>The ID of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>a765ba1435e7f9446065370e9a41****</p>
         */
        @NameInMap("ClusterId")
        public String clusterId;

        /**
         * <p>The name of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>ACK-test-****</p>
         */
        @NameInMap("ClusterName")
        public String clusterName;

        /**
         * <p>The image digest.</p>
         * 
         * <strong>example:</strong>
         * <p>default_digest</p>
         */
        @NameInMap("Digest")
        public String digest;

        /**
         * <p>The container image.</p>
         * 
         * <strong>example:</strong>
         * <p><em><strong>s.com/sas_test/baseli</strong></em></p>
         */
        @NameInMap("Image")
        public String image;

        /**
         * <p>The instance ID of the node.</p>
         * 
         * <strong>example:</strong>
         * <p>i-0xi5mxvtmfw9****</p>
         */
        @NameInMap("NodeInstanceId")
        public String nodeInstanceId;

        /**
         * <p>The IP address of the node.</p>
         * 
         * <strong>example:</strong>
         * <p>172.18.XXX.XXX</p>
         */
        @NameInMap("NodeIp")
        public String nodeIp;

        /**
         * <p>The name of the node.</p>
         * 
         * <strong>example:</strong>
         * <p>pztest****</p>
         */
        @NameInMap("NodeName")
        public String nodeName;

        /**
         * <p>The pod of the image.</p>
         * 
         * <strong>example:</strong>
         * <p>expoit-law-****</p>
         */
        @NameInMap("Pod")
        public String pod;

        /**
         * <p>The region ID of the server image.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The ID of the image repository.</p>
         * 
         * <strong>example:</strong>
         * <p>crr-r88w2vryp8m****</p>
         */
        @NameInMap("RepoId")
        public String repoId;

        /**
         * <p>The name of the image repository.</p>
         * 
         * <strong>example:</strong>
         * <p>testyyy</p>
         */
        @NameInMap("RepoName")
        public String repoName;

        /**
         * <p>The namespace to which the image repository belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>bitn***</p>
         */
        @NameInMap("RepoNamespace")
        public String repoNamespace;

        /**
         * <p>The region ID of the image repository.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RepoRegionId")
        public String repoRegionId;

        /**
         * <p>The image tag.</p>
         * 
         * <strong>example:</strong>
         * <p>v1.20-002-a2*****</p>
         */
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
        /**
         * <p>The time when the task ends.</p>
         * 
         * <strong>example:</strong>
         * <p>1670307567000</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        /**
         * <p>Indicates whether the task is complete. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: no</li>
         * <li><strong>1</strong>: yes</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Finish")
        public Integer finish;

        /**
         * <p>The number of assets on which the task is complete.</p>
         * 
         * <strong>example:</strong>
         * <p>67</p>
         */
        @NameInMap("FinishCount")
        public Integer finishCount;

        /**
         * <p>The progress percentage of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>75</p>
         */
        @NameInMap("Progress")
        public Long progress;

        /**
         * <p>The execution duration of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>1670307567000</p>
         */
        @NameInMap("RealRunTime")
        public Long realRunTime;

        /**
         * <p>The execution result of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>TASK_NOT_SUPPORT_REGION</p>
         */
        @NameInMap("ResultInfo")
        public String resultInfo;

        /**
         * <p>The time when the task is started.</p>
         * 
         * <strong>example:</strong>
         * <p>1640102400000</p>
         */
        @NameInMap("StartTime")
        public Long startTime;

        /**
         * <p>The status.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>The status of the task. Valid values:</p>
         * <ul>
         * <li><strong>INIT</strong>: The task is not started.</li>
         * <li><strong>START</strong>: The task is started.</li>
         * <li><strong>SUCCESS</strong>: The task is complete.</li>
         * <li><strong>TIMEOUT</strong>: The task timed out.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        @NameInMap("StatusText")
        public String statusText;

        /**
         * <p>The objective of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>238cf050a7270dd6940602e70f1e5a11eeaf4e02035f445b7f613ff5e064****</p>
         */
        @NameInMap("Target")
        public String target;

        /**
         * <p>The type of the assets that are scanned. Valid values:</p>
         * <ul>
         * <li><strong>IMAGE_REPO</strong>: image repository</li>
         * <li><strong>IMAGE</strong>: image</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>IMAGE</p>
         */
        @NameInMap("TargetType")
        public String targetType;

        /**
         * <p>The ID of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>9fb50f2af8bb67c9fdb684194c83****</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <p>The information about the image scan task.</p>
         */
        @NameInMap("TaskImageInfo")
        public ListUnfinishedOnceTaskResponseBodyOnceTasksTaskImageInfo taskImageInfo;

        /**
         * <p>The name of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>IMAGE_SCAN</p>
         */
        @NameInMap("TaskName")
        public String taskName;

        /**
         * <p>The type of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>IMAGE_SCAN</p>
         */
        @NameInMap("TaskType")
        public String taskType;

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
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
