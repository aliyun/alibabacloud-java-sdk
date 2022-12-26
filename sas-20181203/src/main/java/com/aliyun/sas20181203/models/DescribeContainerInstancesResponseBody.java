// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeContainerInstancesResponseBody extends TeaModel {
    @NameInMap("ContainerInstanceList")
    public java.util.List<DescribeContainerInstancesResponseBodyContainerInstanceList> containerInstanceList;

    @NameInMap("PageInfo")
    public DescribeContainerInstancesResponseBodyPageInfo pageInfo;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeContainerInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeContainerInstancesResponseBody self = new DescribeContainerInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeContainerInstancesResponseBody setContainerInstanceList(java.util.List<DescribeContainerInstancesResponseBodyContainerInstanceList> containerInstanceList) {
        this.containerInstanceList = containerInstanceList;
        return this;
    }
    public java.util.List<DescribeContainerInstancesResponseBodyContainerInstanceList> getContainerInstanceList() {
        return this.containerInstanceList;
    }

    public DescribeContainerInstancesResponseBody setPageInfo(DescribeContainerInstancesResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public DescribeContainerInstancesResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public DescribeContainerInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeContainerInstancesResponseBodyContainerInstanceList extends TeaModel {
        @NameInMap("AlarmCount")
        public Integer alarmCount;

        @NameInMap("AlarmStatus")
        public String alarmStatus;

        @NameInMap("AppName")
        public String appName;

        @NameInMap("ClusterId")
        public String clusterId;

        @NameInMap("ClusterName")
        public String clusterName;

        @NameInMap("ContainerId")
        public String containerId;

        @NameInMap("CreateTimestamp")
        public Long createTimestamp;

        @NameInMap("HcCount")
        public Integer hcCount;

        @NameInMap("HcStatus")
        public String hcStatus;

        @NameInMap("HostIp")
        public String hostIp;

        @NameInMap("Image")
        public String image;

        @NameInMap("ImageDigest")
        public String imageDigest;

        @NameInMap("ImageId")
        public String imageId;

        @NameInMap("ImageRepoName")
        public String imageRepoName;

        @NameInMap("ImageRepoNamespace")
        public String imageRepoNamespace;

        @NameInMap("ImageRepoTag")
        public String imageRepoTag;

        @NameInMap("ImageUuid")
        public String imageUuid;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Namespace")
        public String namespace;

        @NameInMap("NodeInfo")
        public String nodeInfo;

        @NameInMap("NodeName")
        public String nodeName;

        @NameInMap("Pod")
        public String pod;

        @NameInMap("PodIp")
        public String podIp;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("RiskCount")
        public String riskCount;

        @NameInMap("RiskStatus")
        public String riskStatus;

        @NameInMap("UpdateMark")
        public String updateMark;

        @NameInMap("VulCount")
        public Integer vulCount;

        @NameInMap("VulStatus")
        public String vulStatus;

        public static DescribeContainerInstancesResponseBodyContainerInstanceList build(java.util.Map<String, ?> map) throws Exception {
            DescribeContainerInstancesResponseBodyContainerInstanceList self = new DescribeContainerInstancesResponseBodyContainerInstanceList();
            return TeaModel.build(map, self);
        }

        public DescribeContainerInstancesResponseBodyContainerInstanceList setAlarmCount(Integer alarmCount) {
            this.alarmCount = alarmCount;
            return this;
        }
        public Integer getAlarmCount() {
            return this.alarmCount;
        }

        public DescribeContainerInstancesResponseBodyContainerInstanceList setAlarmStatus(String alarmStatus) {
            this.alarmStatus = alarmStatus;
            return this;
        }
        public String getAlarmStatus() {
            return this.alarmStatus;
        }

        public DescribeContainerInstancesResponseBodyContainerInstanceList setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public DescribeContainerInstancesResponseBodyContainerInstanceList setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public DescribeContainerInstancesResponseBodyContainerInstanceList setClusterName(String clusterName) {
            this.clusterName = clusterName;
            return this;
        }
        public String getClusterName() {
            return this.clusterName;
        }

        public DescribeContainerInstancesResponseBodyContainerInstanceList setContainerId(String containerId) {
            this.containerId = containerId;
            return this;
        }
        public String getContainerId() {
            return this.containerId;
        }

        public DescribeContainerInstancesResponseBodyContainerInstanceList setCreateTimestamp(Long createTimestamp) {
            this.createTimestamp = createTimestamp;
            return this;
        }
        public Long getCreateTimestamp() {
            return this.createTimestamp;
        }

        public DescribeContainerInstancesResponseBodyContainerInstanceList setHcCount(Integer hcCount) {
            this.hcCount = hcCount;
            return this;
        }
        public Integer getHcCount() {
            return this.hcCount;
        }

        public DescribeContainerInstancesResponseBodyContainerInstanceList setHcStatus(String hcStatus) {
            this.hcStatus = hcStatus;
            return this;
        }
        public String getHcStatus() {
            return this.hcStatus;
        }

        public DescribeContainerInstancesResponseBodyContainerInstanceList setHostIp(String hostIp) {
            this.hostIp = hostIp;
            return this;
        }
        public String getHostIp() {
            return this.hostIp;
        }

        public DescribeContainerInstancesResponseBodyContainerInstanceList setImage(String image) {
            this.image = image;
            return this;
        }
        public String getImage() {
            return this.image;
        }

        public DescribeContainerInstancesResponseBodyContainerInstanceList setImageDigest(String imageDigest) {
            this.imageDigest = imageDigest;
            return this;
        }
        public String getImageDigest() {
            return this.imageDigest;
        }

        public DescribeContainerInstancesResponseBodyContainerInstanceList setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public DescribeContainerInstancesResponseBodyContainerInstanceList setImageRepoName(String imageRepoName) {
            this.imageRepoName = imageRepoName;
            return this;
        }
        public String getImageRepoName() {
            return this.imageRepoName;
        }

        public DescribeContainerInstancesResponseBodyContainerInstanceList setImageRepoNamespace(String imageRepoNamespace) {
            this.imageRepoNamespace = imageRepoNamespace;
            return this;
        }
        public String getImageRepoNamespace() {
            return this.imageRepoNamespace;
        }

        public DescribeContainerInstancesResponseBodyContainerInstanceList setImageRepoTag(String imageRepoTag) {
            this.imageRepoTag = imageRepoTag;
            return this;
        }
        public String getImageRepoTag() {
            return this.imageRepoTag;
        }

        public DescribeContainerInstancesResponseBodyContainerInstanceList setImageUuid(String imageUuid) {
            this.imageUuid = imageUuid;
            return this;
        }
        public String getImageUuid() {
            return this.imageUuid;
        }

        public DescribeContainerInstancesResponseBodyContainerInstanceList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeContainerInstancesResponseBodyContainerInstanceList setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public DescribeContainerInstancesResponseBodyContainerInstanceList setNodeInfo(String nodeInfo) {
            this.nodeInfo = nodeInfo;
            return this;
        }
        public String getNodeInfo() {
            return this.nodeInfo;
        }

        public DescribeContainerInstancesResponseBodyContainerInstanceList setNodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }
        public String getNodeName() {
            return this.nodeName;
        }

        public DescribeContainerInstancesResponseBodyContainerInstanceList setPod(String pod) {
            this.pod = pod;
            return this;
        }
        public String getPod() {
            return this.pod;
        }

        public DescribeContainerInstancesResponseBodyContainerInstanceList setPodIp(String podIp) {
            this.podIp = podIp;
            return this;
        }
        public String getPodIp() {
            return this.podIp;
        }

        public DescribeContainerInstancesResponseBodyContainerInstanceList setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeContainerInstancesResponseBodyContainerInstanceList setRiskCount(String riskCount) {
            this.riskCount = riskCount;
            return this;
        }
        public String getRiskCount() {
            return this.riskCount;
        }

        public DescribeContainerInstancesResponseBodyContainerInstanceList setRiskStatus(String riskStatus) {
            this.riskStatus = riskStatus;
            return this;
        }
        public String getRiskStatus() {
            return this.riskStatus;
        }

        public DescribeContainerInstancesResponseBodyContainerInstanceList setUpdateMark(String updateMark) {
            this.updateMark = updateMark;
            return this;
        }
        public String getUpdateMark() {
            return this.updateMark;
        }

        public DescribeContainerInstancesResponseBodyContainerInstanceList setVulCount(Integer vulCount) {
            this.vulCount = vulCount;
            return this;
        }
        public Integer getVulCount() {
            return this.vulCount;
        }

        public DescribeContainerInstancesResponseBodyContainerInstanceList setVulStatus(String vulStatus) {
            this.vulStatus = vulStatus;
            return this;
        }
        public String getVulStatus() {
            return this.vulStatus;
        }

    }

    public static class DescribeContainerInstancesResponseBodyPageInfo extends TeaModel {
        @NameInMap("Count")
        public Integer count;

        @NameInMap("CurrentPage")
        public Integer currentPage;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static DescribeContainerInstancesResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeContainerInstancesResponseBodyPageInfo self = new DescribeContainerInstancesResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public DescribeContainerInstancesResponseBodyPageInfo setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public DescribeContainerInstancesResponseBodyPageInfo setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public DescribeContainerInstancesResponseBodyPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public DescribeContainerInstancesResponseBodyPageInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
