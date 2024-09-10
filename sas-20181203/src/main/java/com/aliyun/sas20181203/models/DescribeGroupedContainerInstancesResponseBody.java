// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeGroupedContainerInstancesResponseBody extends TeaModel {
    /**
     * <p>The information about the container.</p>
     */
    @NameInMap("GroupedContainerInstanceList")
    public java.util.List<DescribeGroupedContainerInstancesResponseBodyGroupedContainerInstanceList> groupedContainerInstanceList;

    /**
     * <p>The pagination information.</p>
     */
    @NameInMap("PageInfo")
    public DescribeGroupedContainerInstancesResponseBodyPageInfo pageInfo;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>4E5BFDCF-B9DD-430D-9DA4-151BCB581C9D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeGroupedContainerInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeGroupedContainerInstancesResponseBody self = new DescribeGroupedContainerInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeGroupedContainerInstancesResponseBody setGroupedContainerInstanceList(java.util.List<DescribeGroupedContainerInstancesResponseBodyGroupedContainerInstanceList> groupedContainerInstanceList) {
        this.groupedContainerInstanceList = groupedContainerInstanceList;
        return this;
    }
    public java.util.List<DescribeGroupedContainerInstancesResponseBodyGroupedContainerInstanceList> getGroupedContainerInstanceList() {
        return this.groupedContainerInstanceList;
    }

    public DescribeGroupedContainerInstancesResponseBody setPageInfo(DescribeGroupedContainerInstancesResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public DescribeGroupedContainerInstancesResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public DescribeGroupedContainerInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeGroupedContainerInstancesResponseBodyGroupedContainerInstanceList extends TeaModel {
        /**
         * <p>The number of alerts that are detected for the current pod, application, namespace, or cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AlarmCount")
        public Integer alarmCount;

        /**
         * <p>The name of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>oss-liveness-probe</p>
         */
        @NameInMap("AppName")
        public String appName;

        /**
         * <p>The ID of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>cf3824769c85441b4bf3****</p>
         */
        @NameInMap("ClusterId")
        public String clusterId;

        /**
         * <p>The name of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("ClusterName")
        public String clusterName;

        /**
         * <p>The type of the cluster. Valid values:</p>
         * <ul>
         * <li><strong>Kubernetes</strong>: dedicated Kubernetes cluster.</li>
         * <li><strong>ManagedKubernetes</strong>: standard managed cluster (edge cluster).</li>
         * <li><strong>Ask</strong>: serverless Kubernetes (ASK) cluster.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ManagedKubernetes</p>
         */
        @NameInMap("ClusterType")
        public String clusterType;

        /**
         * <p>The timestamp when the cluster was created. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1600076893000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The status of the cluster. Valid values:</p>
         * <ul>
         * <li><strong>running</strong>: The cluster is running.</li>
         * <li><strong>stopped</strong>: The cluster is stopped.</li>
         * <li><strong>deleted</strong>: The cluster is deleted.</li>
         * <li><strong>delete_failed</strong>: The cluster failed to be deleted.</li>
         * <li><strong>failed</strong>: The cluster failed to be created.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>running</p>
         */
        @NameInMap("CusterState")
        public String custerState;

        /**
         * <p>The number of baseline risks that are detected for the current pod, application, namespace, or cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("HcCount")
        public Integer hcCount;

        /**
         * <p>The IP address of the host in the container cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>172.114.XX.XX</p>
         */
        @NameInMap("HostIp")
        public String hostIp;

        /**
         * <p>The container image.</p>
         * 
         * <strong>example:</strong>
         * <p>registry-vpc.ap-southeast-5.aliyuncs.com/log-service-release/sls-connector:1.1.77</p>
         */
        @NameInMap("Image")
        public String image;

        /**
         * <p>The digest value of the image.</p>
         * 
         * <strong>example:</strong>
         * <p>58e58c013f70bbfde140c8a55c1078074b3483479428d4069aa946827fd566cf</p>
         */
        @NameInMap("ImageDigest")
        public String imageDigest;

        /**
         * <p>The name of the image repository.</p>
         * 
         * <strong>example:</strong>
         * <p>test-003</p>
         */
        @NameInMap("ImageRepoName")
        public String imageRepoName;

        /**
         * <p>The namespace of the image repository.</p>
         * 
         * <strong>example:</strong>
         * <p>name001</p>
         */
        @NameInMap("ImageRepoNamespace")
        public String imageRepoNamespace;

        /**
         * <p>The tag that is added to the image repository.</p>
         * 
         * <strong>example:</strong>
         * <p>dev-20220512-2</p>
         */
        @NameInMap("ImageRepoTag")
        public String imageRepoTag;

        /**
         * <p>The UUID of the image.</p>
         * 
         * <strong>example:</strong>
         * <p>e4bdec1d9ba7e0967111a7ea467c****</p>
         */
        @NameInMap("ImageUuid")
        public String imageUuid;

        /**
         * <p>The number of pods, applications, clusters, or namespaces.</p>
         * 
         * <strong>example:</strong>
         * <p>9</p>
         */
        @NameInMap("InstanceCount")
        public Integer instanceCount;

        /**
         * <p>The ID of the server.</p>
         * 
         * <strong>example:</strong>
         * <p>i-8vb9ul5xec4tua4q****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The namespace of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>kube-system</p>
         */
        @NameInMap("Namespace")
        public String namespace;

        /**
         * <p>The name of the pod.</p>
         * 
         * <strong>example:</strong>
         * <p>csi-plugin-2n****</p>
         */
        @NameInMap("Pod")
        public String pod;

        /**
         * <p>The IP address of the pod.</p>
         * 
         * <strong>example:</strong>
         * <p>172.114.XX.XX</p>
         */
        @NameInMap("PodIp")
        public String podIp;

        /**
         * <p>The region ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The number of at-risk instances.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RiskInstanceCount")
        public Integer riskInstanceCount;

        /**
         * <p>The risk level. Valid values:</p>
         * <ul>
         * <li><strong>high</strong></li>
         * <li><strong>medium</strong></li>
         * <li><strong>low</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>low</p>
         */
        @NameInMap("RiskLevel")
        public String riskLevel;

        /**
         * <p>Indicates whether risks were detected. Valid values:</p>
         * <ul>
         * <li><strong>NO</strong></li>
         * <li><strong>YES</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NO</p>
         */
        @NameInMap("RiskStatus")
        public String riskStatus;

        /**
         * <p>Indicates whether the synchronization of cluster audit logs is enabled. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: disabled.</li>
         * <li><strong>1</strong>: enabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SyncOpen")
        public Integer syncOpen;

        /**
         * <p>The status of the synchronization of cluster audit logs. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: The synchronization failed.</li>
         * <li><strong>1</strong>: The synchronization is successful.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SyncStatus")
        public Integer syncStatus;

        /**
         * <p>The number of vulnerabilities that are detected for the current pod, application, namespace, or cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("VulCount")
        public Integer vulCount;

        public static DescribeGroupedContainerInstancesResponseBodyGroupedContainerInstanceList build(java.util.Map<String, ?> map) throws Exception {
            DescribeGroupedContainerInstancesResponseBodyGroupedContainerInstanceList self = new DescribeGroupedContainerInstancesResponseBodyGroupedContainerInstanceList();
            return TeaModel.build(map, self);
        }

        public DescribeGroupedContainerInstancesResponseBodyGroupedContainerInstanceList setAlarmCount(Integer alarmCount) {
            this.alarmCount = alarmCount;
            return this;
        }
        public Integer getAlarmCount() {
            return this.alarmCount;
        }

        public DescribeGroupedContainerInstancesResponseBodyGroupedContainerInstanceList setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public DescribeGroupedContainerInstancesResponseBodyGroupedContainerInstanceList setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public DescribeGroupedContainerInstancesResponseBodyGroupedContainerInstanceList setClusterName(String clusterName) {
            this.clusterName = clusterName;
            return this;
        }
        public String getClusterName() {
            return this.clusterName;
        }

        public DescribeGroupedContainerInstancesResponseBodyGroupedContainerInstanceList setClusterType(String clusterType) {
            this.clusterType = clusterType;
            return this;
        }
        public String getClusterType() {
            return this.clusterType;
        }

        public DescribeGroupedContainerInstancesResponseBodyGroupedContainerInstanceList setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public DescribeGroupedContainerInstancesResponseBodyGroupedContainerInstanceList setCusterState(String custerState) {
            this.custerState = custerState;
            return this;
        }
        public String getCusterState() {
            return this.custerState;
        }

        public DescribeGroupedContainerInstancesResponseBodyGroupedContainerInstanceList setHcCount(Integer hcCount) {
            this.hcCount = hcCount;
            return this;
        }
        public Integer getHcCount() {
            return this.hcCount;
        }

        public DescribeGroupedContainerInstancesResponseBodyGroupedContainerInstanceList setHostIp(String hostIp) {
            this.hostIp = hostIp;
            return this;
        }
        public String getHostIp() {
            return this.hostIp;
        }

        public DescribeGroupedContainerInstancesResponseBodyGroupedContainerInstanceList setImage(String image) {
            this.image = image;
            return this;
        }
        public String getImage() {
            return this.image;
        }

        public DescribeGroupedContainerInstancesResponseBodyGroupedContainerInstanceList setImageDigest(String imageDigest) {
            this.imageDigest = imageDigest;
            return this;
        }
        public String getImageDigest() {
            return this.imageDigest;
        }

        public DescribeGroupedContainerInstancesResponseBodyGroupedContainerInstanceList setImageRepoName(String imageRepoName) {
            this.imageRepoName = imageRepoName;
            return this;
        }
        public String getImageRepoName() {
            return this.imageRepoName;
        }

        public DescribeGroupedContainerInstancesResponseBodyGroupedContainerInstanceList setImageRepoNamespace(String imageRepoNamespace) {
            this.imageRepoNamespace = imageRepoNamespace;
            return this;
        }
        public String getImageRepoNamespace() {
            return this.imageRepoNamespace;
        }

        public DescribeGroupedContainerInstancesResponseBodyGroupedContainerInstanceList setImageRepoTag(String imageRepoTag) {
            this.imageRepoTag = imageRepoTag;
            return this;
        }
        public String getImageRepoTag() {
            return this.imageRepoTag;
        }

        public DescribeGroupedContainerInstancesResponseBodyGroupedContainerInstanceList setImageUuid(String imageUuid) {
            this.imageUuid = imageUuid;
            return this;
        }
        public String getImageUuid() {
            return this.imageUuid;
        }

        public DescribeGroupedContainerInstancesResponseBodyGroupedContainerInstanceList setInstanceCount(Integer instanceCount) {
            this.instanceCount = instanceCount;
            return this;
        }
        public Integer getInstanceCount() {
            return this.instanceCount;
        }

        public DescribeGroupedContainerInstancesResponseBodyGroupedContainerInstanceList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeGroupedContainerInstancesResponseBodyGroupedContainerInstanceList setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public DescribeGroupedContainerInstancesResponseBodyGroupedContainerInstanceList setPod(String pod) {
            this.pod = pod;
            return this;
        }
        public String getPod() {
            return this.pod;
        }

        public DescribeGroupedContainerInstancesResponseBodyGroupedContainerInstanceList setPodIp(String podIp) {
            this.podIp = podIp;
            return this;
        }
        public String getPodIp() {
            return this.podIp;
        }

        public DescribeGroupedContainerInstancesResponseBodyGroupedContainerInstanceList setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeGroupedContainerInstancesResponseBodyGroupedContainerInstanceList setRiskInstanceCount(Integer riskInstanceCount) {
            this.riskInstanceCount = riskInstanceCount;
            return this;
        }
        public Integer getRiskInstanceCount() {
            return this.riskInstanceCount;
        }

        public DescribeGroupedContainerInstancesResponseBodyGroupedContainerInstanceList setRiskLevel(String riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }
        public String getRiskLevel() {
            return this.riskLevel;
        }

        public DescribeGroupedContainerInstancesResponseBodyGroupedContainerInstanceList setRiskStatus(String riskStatus) {
            this.riskStatus = riskStatus;
            return this;
        }
        public String getRiskStatus() {
            return this.riskStatus;
        }

        public DescribeGroupedContainerInstancesResponseBodyGroupedContainerInstanceList setSyncOpen(Integer syncOpen) {
            this.syncOpen = syncOpen;
            return this;
        }
        public Integer getSyncOpen() {
            return this.syncOpen;
        }

        public DescribeGroupedContainerInstancesResponseBodyGroupedContainerInstanceList setSyncStatus(Integer syncStatus) {
            this.syncStatus = syncStatus;
            return this;
        }
        public Integer getSyncStatus() {
            return this.syncStatus;
        }

        public DescribeGroupedContainerInstancesResponseBodyGroupedContainerInstanceList setVulCount(Integer vulCount) {
            this.vulCount = vulCount;
            return this;
        }
        public Integer getVulCount() {
            return this.vulCount;
        }

    }

    public static class DescribeGroupedContainerInstancesResponseBodyPageInfo extends TeaModel {
        /**
         * <p>The number of container assets returned on the current page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
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
         * <p>The number of entries returned per page. Default value: <strong>20</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of container assets returned.</p>
         * 
         * <strong>example:</strong>
         * <p>25</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static DescribeGroupedContainerInstancesResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeGroupedContainerInstancesResponseBodyPageInfo self = new DescribeGroupedContainerInstancesResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public DescribeGroupedContainerInstancesResponseBodyPageInfo setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public DescribeGroupedContainerInstancesResponseBodyPageInfo setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public DescribeGroupedContainerInstancesResponseBodyPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public DescribeGroupedContainerInstancesResponseBodyPageInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
