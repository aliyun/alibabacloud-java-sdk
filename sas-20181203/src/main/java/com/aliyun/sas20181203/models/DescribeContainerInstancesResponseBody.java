// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeContainerInstancesResponseBody extends TeaModel {
    /**
     * <p>The details of the container asset.</p>
     */
    @NameInMap("ContainerInstanceList")
    public java.util.List<DescribeContainerInstancesResponseBodyContainerInstanceList> containerInstanceList;

    /**
     * <p>The pagination information.</p>
     */
    @NameInMap("PageInfo")
    public DescribeContainerInstancesResponseBodyPageInfo pageInfo;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>79CFF74D-E967-5407-8A78-EE03B925FDAA</p>
     */
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
        /**
         * <p>The number of alerts.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AlarmCount")
        public Integer alarmCount;

        /**
         * <p>Indicates whether alerts are generated for the container. Valid values:</p>
         * <ul>
         * <li><strong>YES</strong></li>
         * <li><strong>NO</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>YES</p>
         */
        @NameInMap("AlarmStatus")
        public String alarmStatus;

        /**
         * <p>The name of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>alibaba-log-controller</p>
         */
        @NameInMap("AppName")
        public String appName;

        /**
         * <p>The ID of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>cfb41a869c71e4678a97021582dd8a****</p>
         */
        @NameInMap("ClusterId")
        public String clusterId;

        /**
         * <p>The cluster name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("ClusterName")
        public String clusterName;

        /**
         * <p>The ID of the container.</p>
         * 
         * <strong>example:</strong>
         * <p>48a6d9a92435a13ad573372c3f3c63b7e04d106458141df9f92155709d****</p>
         */
        @NameInMap("ContainerId")
        public String containerId;

        /**
         * <p>The timestamp when the cluster was created. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1670368337000</p>
         */
        @NameInMap("CreateTimestamp")
        public Long createTimestamp;

        /**
         * <p>Indicates whether the asset is exposed to the Internet.</p>
         * <ul>
         * <li><strong>1</strong>: exposed</li>
         * <li><strong>0</strong>: not exposed</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Exposed")
        public Integer exposed;

        /**
         * <p>The exposure details. The value is a JSON string.</p>
         * 
         * <strong>example:</strong>
         * <p>[{}]</p>
         */
        @NameInMap("ExposedDetail")
        public String exposedDetail;

        /**
         * <p>The number of baseline risks.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("HcCount")
        public Integer hcCount;

        /**
         * <p>Indicates whether baseline risks are detected. Valid values:</p>
         * <ul>
         * <li><strong>NO</strong></li>
         * <li><strong>YES</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>YES</p>
         */
        @NameInMap("HcStatus")
        public String hcStatus;

        /**
         * <p>The IP address of the host.</p>
         * 
         * <strong>example:</strong>
         * <p>172.24.XX.XX</p>
         */
        @NameInMap("HostIp")
        public String hostIp;

        /**
         * <p>The image of the container.</p>
         * 
         * <strong>example:</strong>
         * <p>docker.io/library/nginx:latest</p>
         */
        @NameInMap("Image")
        public String image;

        /**
         * <p>The digest value of the image.</p>
         * 
         * <strong>example:</strong>
         * <p>5b046e2de8c490819125193ee2eb71a66f2cc16c032dcd8b69ead4be1024****</p>
         */
        @NameInMap("ImageDigest")
        public String imageDigest;

        /**
         * <p>The image ID.</p>
         * 
         * <strong>example:</strong>
         * <p>registry-vpc.cn-beijing.aliyuncs.com/acs/log-controller@sha256:5b046e2de8c490819125193ee2eb71a66f2cc16c032dcd8b69ead4be1024****</p>
         */
        @NameInMap("ImageId")
        public String imageId;

        /**
         * <p>The name of the image repository.</p>
         * 
         * <strong>example:</strong>
         * <p>log-controller</p>
         */
        @NameInMap("ImageRepoName")
        public String imageRepoName;

        /**
         * <p>The namespace of the image repository.</p>
         * 
         * <strong>example:</strong>
         * <p>acs</p>
         */
        @NameInMap("ImageRepoNamespace")
        public String imageRepoNamespace;

        /**
         * <p>The tag that is added to the image.</p>
         * 
         * <strong>example:</strong>
         * <p>0.3.1.0-dfa2010-aliyun</p>
         */
        @NameInMap("ImageRepoTag")
        public String imageRepoTag;

        /**
         * <p>The UUID of the image.</p>
         * 
         * <strong>example:</strong>
         * <p>5f23dfbceec289a49ac94e035e2****</p>
         */
        @NameInMap("ImageUuid")
        public String imageUuid;

        /**
         * <p>The instance ID of the asset.</p>
         * 
         * <strong>example:</strong>
         * <p>i-2zegzjyotydfkz9****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The namespace.</p>
         * 
         * <strong>example:</strong>
         * <p>kube-system</p>
         */
        @NameInMap("Namespace")
        public String namespace;

        /**
         * <p>The node information.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("NodeInfo")
        public String nodeInfo;

        /**
         * <p>The name of the node.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("NodeName")
        public String nodeName;

        /**
         * <p>The pod.</p>
         * 
         * <strong>example:</strong>
         * <p>alibaba-log-controller-6f847f8786-mk2mg</p>
         */
        @NameInMap("Pod")
        public String pod;

        /**
         * <p>The IP address of the pod.</p>
         * 
         * <strong>example:</strong>
         * <p>172.24.XX.XX</p>
         */
        @NameInMap("PodIp")
        public String podIp;

        /**
         * <p>The region ID of the container.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The number of risks.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RiskCount")
        public String riskCount;

        /**
         * <p>Indicates whether risks exist. Valid values:</p>
         * <ul>
         * <li><strong>NO</strong></li>
         * <li><strong>YES</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>YES</p>
         */
        @NameInMap("RiskStatus")
        public String riskStatus;

        /**
         * <p>The update identifier of the container.</p>
         * 
         * <strong>example:</strong>
         * <p>79cff74d-e967-5407-8a78-ee03b9****</p>
         */
        @NameInMap("UpdateMark")
        public String updateMark;

        /**
         * <p>The number of vulnerabilities that are detected in the container cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>15</p>
         */
        @NameInMap("VulCount")
        public Integer vulCount;

        /**
         * <p>Indicates whether vulnerabilities are detected in the container. Valid values:</p>
         * <ul>
         * <li><strong>YES</strong></li>
         * <li><strong>NO</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>YES</p>
         */
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

        public DescribeContainerInstancesResponseBodyContainerInstanceList setExposed(Integer exposed) {
            this.exposed = exposed;
            return this;
        }
        public Integer getExposed() {
            return this.exposed;
        }

        public DescribeContainerInstancesResponseBodyContainerInstanceList setExposedDetail(String exposedDetail) {
            this.exposedDetail = exposedDetail;
            return this;
        }
        public String getExposedDetail() {
            return this.exposedDetail;
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
        /**
         * <p>The number of entries returned on the current page.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
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
         * <p>45</p>
         */
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
