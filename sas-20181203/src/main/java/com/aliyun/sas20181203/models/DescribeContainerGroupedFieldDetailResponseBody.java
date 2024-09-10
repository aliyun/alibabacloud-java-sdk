// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeContainerGroupedFieldDetailResponseBody extends TeaModel {
    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public DescribeContainerGroupedFieldDetailResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>7532B7EE-7CE7-5F4D-BF04-B12447DD****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeContainerGroupedFieldDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeContainerGroupedFieldDetailResponseBody self = new DescribeContainerGroupedFieldDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeContainerGroupedFieldDetailResponseBody setData(DescribeContainerGroupedFieldDetailResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeContainerGroupedFieldDetailResponseBodyData getData() {
        return this.data;
    }

    public DescribeContainerGroupedFieldDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeContainerGroupedFieldDetailResponseBodyData extends TeaModel {
        /**
         * <p>The number of alerts.</p>
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
         * <p>node-local-dns</p>
         */
        @NameInMap("AppName")
        public String appName;

        /**
         * <p>The version of the current online server in the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>1.14.8-aliyun.1</p>
         */
        @NameInMap("ClusterCurrentVersion")
        public String clusterCurrentVersion;

        /**
         * <p>The ID of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>c8ca91e0907d94efaba7fb0827eb9****</p>
         */
        @NameInMap("ClusterId")
        public String clusterId;

        /**
         * <p>The name of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>zhhtest</p>
         */
        @NameInMap("ClusterName")
        public String clusterName;

        /**
         * <p>The status of the cluster. Valid values:</p>
         * <ul>
         * <li>STARTING: The cluster is being started.</li>
         * <li>START_FAILED: The cluster fails to be started.</li>
         * <li>BOOTSTRAPPING: The bootstrap action is being performed for the cluster.</li>
         * <li>RUNNING: The cluster is running.</li>
         * <li>TERMINATING: The cluster is being terminated.</li>
         * <li>TERMINATED: The cluster is terminated.</li>
         * <li>TERMINATED_WITH_ERRORS: The cluster is terminated due to an exception.</li>
         * <li>TERMINATE_FAILED: The cluster fails to be terminated.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        @NameInMap("ClusterState")
        public String clusterState;

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
         * <p>The number of containers.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ContainerCount")
        public Integer containerCount;

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>1702433618301</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The number of instances.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("InstanceCount")
        public Integer instanceCount;

        /**
         * <p>The namespace.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("Namespace")
        public String namespace;

        /**
         * <p>The name of the node.</p>
         * 
         * <strong>example:</strong>
         * <p>shangliang-test</p>
         */
        @NameInMap("NodeName")
        public String nodeName;

        /**
         * <p>The name of the pod.</p>
         * 
         * <strong>example:</strong>
         * <p>node-local-dns-zwsxl</p>
         */
        @NameInMap("Pod")
        public String pod;

        /**
         * <p>The number of pods.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PodCount")
        public Integer podCount;

        /**
         * <p>The IP address of the pod.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.1.1</p>
         */
        @NameInMap("PodIp")
        public String podIp;

        /**
         * <p>The ID of the region.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The number of vulnerabilities.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("VulCount")
        public Integer vulCount;

        public static DescribeContainerGroupedFieldDetailResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeContainerGroupedFieldDetailResponseBodyData self = new DescribeContainerGroupedFieldDetailResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeContainerGroupedFieldDetailResponseBodyData setAlarmCount(Integer alarmCount) {
            this.alarmCount = alarmCount;
            return this;
        }
        public Integer getAlarmCount() {
            return this.alarmCount;
        }

        public DescribeContainerGroupedFieldDetailResponseBodyData setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public DescribeContainerGroupedFieldDetailResponseBodyData setClusterCurrentVersion(String clusterCurrentVersion) {
            this.clusterCurrentVersion = clusterCurrentVersion;
            return this;
        }
        public String getClusterCurrentVersion() {
            return this.clusterCurrentVersion;
        }

        public DescribeContainerGroupedFieldDetailResponseBodyData setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public DescribeContainerGroupedFieldDetailResponseBodyData setClusterName(String clusterName) {
            this.clusterName = clusterName;
            return this;
        }
        public String getClusterName() {
            return this.clusterName;
        }

        public DescribeContainerGroupedFieldDetailResponseBodyData setClusterState(String clusterState) {
            this.clusterState = clusterState;
            return this;
        }
        public String getClusterState() {
            return this.clusterState;
        }

        public DescribeContainerGroupedFieldDetailResponseBodyData setClusterType(String clusterType) {
            this.clusterType = clusterType;
            return this;
        }
        public String getClusterType() {
            return this.clusterType;
        }

        public DescribeContainerGroupedFieldDetailResponseBodyData setContainerCount(Integer containerCount) {
            this.containerCount = containerCount;
            return this;
        }
        public Integer getContainerCount() {
            return this.containerCount;
        }

        public DescribeContainerGroupedFieldDetailResponseBodyData setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public DescribeContainerGroupedFieldDetailResponseBodyData setInstanceCount(Integer instanceCount) {
            this.instanceCount = instanceCount;
            return this;
        }
        public Integer getInstanceCount() {
            return this.instanceCount;
        }

        public DescribeContainerGroupedFieldDetailResponseBodyData setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public DescribeContainerGroupedFieldDetailResponseBodyData setNodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }
        public String getNodeName() {
            return this.nodeName;
        }

        public DescribeContainerGroupedFieldDetailResponseBodyData setPod(String pod) {
            this.pod = pod;
            return this;
        }
        public String getPod() {
            return this.pod;
        }

        public DescribeContainerGroupedFieldDetailResponseBodyData setPodCount(Integer podCount) {
            this.podCount = podCount;
            return this;
        }
        public Integer getPodCount() {
            return this.podCount;
        }

        public DescribeContainerGroupedFieldDetailResponseBodyData setPodIp(String podIp) {
            this.podIp = podIp;
            return this;
        }
        public String getPodIp() {
            return this.podIp;
        }

        public DescribeContainerGroupedFieldDetailResponseBodyData setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeContainerGroupedFieldDetailResponseBodyData setVulCount(Integer vulCount) {
            this.vulCount = vulCount;
            return this;
        }
        public Integer getVulCount() {
            return this.vulCount;
        }

    }

}
