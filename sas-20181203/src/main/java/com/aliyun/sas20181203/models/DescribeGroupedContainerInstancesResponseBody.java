// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeGroupedContainerInstancesResponseBody extends TeaModel {
    // An array that consists of the container assets returned.
    @NameInMap("GroupedContainerInstanceList")
    public java.util.List<DescribeGroupedContainerInstancesResponseBodyGroupedContainerInstanceList> groupedContainerInstanceList;

    // The pagination information.
    @NameInMap("PageInfo")
    public DescribeGroupedContainerInstancesResponseBodyPageInfo pageInfo;

    // The ID of the request, which is used to locate and troubleshoot issues.
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
        // The number of alerts that are generated on the current pod, application, namespace, or cluster.
        @NameInMap("AlarmCount")
        public Integer alarmCount;

        // The name of the application.
        @NameInMap("AppName")
        public String appName;

        // The ID of cluster.
        @NameInMap("ClusterId")
        public String clusterId;

        // The name of the instance.
        @NameInMap("ClusterName")
        public String clusterName;

        // The type of the cluster. Valid values:
        // 
        // *   **Kubernetes**: dedicated Kubernetes cluster
        // *   **ManagedKubernetes**: standard managed cluster (edge cluster)
        // *   **Ask**: standard serverless cluster
        @NameInMap("ClusterType")
        public String clusterType;

        // The timestamp when the cluster was created. Unit: milliseconds.
        @NameInMap("CreateTime")
        public Long createTime;

        // The status of the cluster. Valid values:
        // 
        // *   **running**: The cluster is running.
        // *   **stopped**: The cluster is stopped.
        // *   **deleted**: The cluster is deleted.
        // *   **delete_failed**: The cluster fails to be deleted.
        // *   **failed**: The cluster fails to be created.
        @NameInMap("CusterState")
        public String custerState;

        // The number of baseline risks that are detected on the current pod, application, namespace, or cluster.
        @NameInMap("HcCount")
        public Integer hcCount;

        // The IP address of the host in the container cluster.
        @NameInMap("HostIp")
        public String hostIp;

        // The image of the container.
        @NameInMap("Image")
        public String image;

        // The digest value of the image.
        @NameInMap("ImageDigest")
        public String imageDigest;

        // The name of the image repository.
        @NameInMap("ImageRepoName")
        public String imageRepoName;

        // The namespace to which the image repository belongs.
        @NameInMap("ImageRepoNamespace")
        public String imageRepoNamespace;

        // The tag that is added to the image repository.
        @NameInMap("ImageRepoTag")
        public String imageRepoTag;

        // The UUID of the image.
        @NameInMap("ImageUuid")
        public String imageUuid;

        // The number of queried pods, applications, clusters, or namespaces.
        @NameInMap("InstanceCount")
        public Integer instanceCount;

        // The ID of the server.
        @NameInMap("InstanceId")
        public String instanceId;

        // The namespace of the cluster.
        @NameInMap("Namespace")
        public String namespace;

        // The name of the pod.
        @NameInMap("Pod")
        public String pod;

        // The IP address of the pod.
        @NameInMap("PodIp")
        public String podIp;

        // The ID of the region in which the server resides.
        @NameInMap("RegionId")
        public String regionId;

        // The number of at-risk instances.
        @NameInMap("RiskInstanceCount")
        public Integer riskInstanceCount;

        // The risk level. Valid values:
        // 
        // *   **high**
        // *   **medium**
        // *   **low**
        @NameInMap("RiskLevel")
        public String riskLevel;

        // Indicates whether risks were detected. Valid values:
        // 
        // *   **NO**: No risks were detected.
        // *   **YES**: Risks were detected.
        @NameInMap("RiskStatus")
        public String riskStatus;

        // The number of vulnerabilities that are detected on the current pod, application, namespace, or cluster.
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

        public DescribeGroupedContainerInstancesResponseBodyGroupedContainerInstanceList setVulCount(Integer vulCount) {
            this.vulCount = vulCount;
            return this;
        }
        public Integer getVulCount() {
            return this.vulCount;
        }

    }

    public static class DescribeGroupedContainerInstancesResponseBodyPageInfo extends TeaModel {
        // The number of container assets returned on the current page.
        @NameInMap("Count")
        public Integer count;

        // The page number of the returned page.
        @NameInMap("CurrentPage")
        public Integer currentPage;

        // The number of entries returned per page. Default value: **20**.
        @NameInMap("PageSize")
        public Integer pageSize;

        // The total number of container assets returned.
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
