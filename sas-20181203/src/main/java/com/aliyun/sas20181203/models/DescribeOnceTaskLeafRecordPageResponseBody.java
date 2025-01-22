// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeOnceTaskLeafRecordPageResponseBody extends TeaModel {
    /**
     * <p>The details of the sub-task.</p>
     */
    @NameInMap("OnceTasks")
    public java.util.List<DescribeOnceTaskLeafRecordPageResponseBodyOnceTasks> onceTasks;

    /**
     * <p>The pagination information.</p>
     */
    @NameInMap("PageInfo")
    public DescribeOnceTaskLeafRecordPageResponseBodyPageInfo pageInfo;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A4EB8B1C-1DEC-5E18-BCD0-D1BBB393****</p>
     */
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
         * <p>The cluster name.</p>
         * 
         * <strong>example:</strong>
         * <p>ACK-test-****</p>
         */
        @NameInMap("ClusterName")
        public String clusterName;

        /**
         * <p>The time consumed. The value is in the JSON format. The end time of each item is displayed.</p>
         * <ul>
         * <li><strong>vul</strong>: system vulnerabilities</li>
         * <li><strong>scaVul</strong>: application vulnerabilities</li>
         * <li><strong>scaVul</strong>: baseline</li>
         * <li><strong>binary</strong>: binary</li>
         * <li><strong>forbiddenPackageInfo</strong>: information about the prohibited package</li>
         * <li><strong>identificationInfo</strong>: identity authentication</li>
         * <li><strong>script</strong>: malicious scripts</li>
         * <li><strong>sensitiveFile</strong>: sensitive files</li>
         * <li><strong>sensitiveInfo</strong>: AccessKey pair leaks</li>
         * <li><strong>webshell</strong>: website scripts</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{&quot;scaVul&quot;:&quot;2023-09-04 09:37:21&quot;,&quot;identificationInfo&quot;:&quot;2023-09-04 09:37:30&quot;,&quot;forbiddenPackageInfo&quot;:&quot;2023-09-04 09:37:16&quot;,&quot;binary&quot;:&quot;2023-09-04 09:37:25&quot;,&quot;baseline&quot;:&quot;2023-09-04 09:37:19&quot;,&quot;sensitiveFile&quot;:&quot;2023-09-04 09:38:34&quot;,&quot;vul&quot;:&quot;2023-09-04 09:37:31&quot;,&quot;webshell&quot;:&quot;2023-09-04 09:38:27&quot;,&quot;sensitiveInfo&quot;:&quot;2023-09-04 09:37:16&quot;,&quot;script&quot;:&quot;2023-09-04 09:39:44&quot;}</p>
         */
        @NameInMap("CostTimeInfo")
        public String costTimeInfo;

        /**
         * <p>The digest of the image.</p>
         * 
         * <strong>example:</strong>
         * <p>9e0dc29d872d2e386cc5c0c92b529a84e3acfade16f5cb1d054a2ee3c99****</p>
         */
        @NameInMap("Digest")
        public String digest;

        /**
         * <p>The image of the container.</p>
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

        @NameInMap("RegistryType")
        public String registryType;

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
         * <p>The name of the namespace to which the image repository belongs.</p>
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
         * <p>The tag that is added to the image.</p>
         * 
         * <strong>example:</strong>
         * <p>v1.20-002-a2*****</p>
         */
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

        public DescribeOnceTaskLeafRecordPageResponseBodyOnceTasksTaskImageInfo setCostTimeInfo(String costTimeInfo) {
            this.costTimeInfo = costTimeInfo;
            return this;
        }
        public String getCostTimeInfo() {
            return this.costTimeInfo;
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

        public DescribeOnceTaskLeafRecordPageResponseBodyOnceTasksTaskImageInfo setRegistryType(String registryType) {
            this.registryType = registryType;
            return this;
        }
        public String getRegistryType() {
            return this.registryType;
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
        /**
         * <p>The time when the sub-task ends.</p>
         * 
         * <strong>example:</strong>
         * <p>1670307567000</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        /**
         * <p>Indicates whether the sub-task is complete.</p>
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
         * <p>The number of the assets that are scanned.</p>
         * 
         * <strong>example:</strong>
         * <p>67</p>
         */
        @NameInMap("FinishCount")
        public String finishCount;

        /**
         * <p>The progress percentage of the sub-task.</p>
         * 
         * <strong>example:</strong>
         * <p>75</p>
         */
        @NameInMap("Progress")
        public Long progress;

        /**
         * <p>The execution duration of the sub-task.</p>
         * 
         * <strong>example:</strong>
         * <p>1670307567000</p>
         */
        @NameInMap("RealRunTime")
        public Long realRunTime;

        /**
         * <p>The execution result.</p>
         * 
         * <strong>example:</strong>
         * <p>TASK_NOT_SUPPORT_REGION</p>
         */
        @NameInMap("ResultInfo")
        public String resultInfo;

        /**
         * <p>The time when the sub-task starts.</p>
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
         * <p>0</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The sub-task status. Valid values:</p>
         * <ul>
         * <li><strong>INIT</strong>: The sub-task is not started.</li>
         * <li><strong>START</strong>: The sub-task is started.</li>
         * <li><strong>SUCCESS</strong>: The sub-task is complete.</li>
         * <li><strong>TIMEOUT</strong>: The sub-task timed out.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        @NameInMap("StatusText")
        public String statusText;

        /**
         * <p>The objective of the sub-task.</p>
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
         * <p>The sub-task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>9fb50f2af8bb67c9fdb684194c83****</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <p>The information about the image scan.</p>
         */
        @NameInMap("TaskImageInfo")
        public DescribeOnceTaskLeafRecordPageResponseBodyOnceTasksTaskImageInfo taskImageInfo;

        /**
         * <p>The name of the sub-task.</p>
         * 
         * <strong>example:</strong>
         * <p>IMAGE_SCAN</p>
         */
        @NameInMap("TaskName")
        public String taskName;

        /**
         * <p>The type of the sub-task.</p>
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
        /**
         * <p>The number of entries returned on the current page.</p>
         * 
         * <strong>example:</strong>
         * <p>6</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>16</p>
         */
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
