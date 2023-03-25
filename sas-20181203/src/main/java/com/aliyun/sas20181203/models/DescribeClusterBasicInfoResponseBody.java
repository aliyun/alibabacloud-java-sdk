// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeClusterBasicInfoResponseBody extends TeaModel {
    /**
     * <p>The detailed information about the cluster.</p>
     */
    @NameInMap("ClusterInfo")
    public DescribeClusterBasicInfoResponseBodyClusterInfo clusterInfo;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeClusterBasicInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterBasicInfoResponseBody self = new DescribeClusterBasicInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeClusterBasicInfoResponseBody setClusterInfo(DescribeClusterBasicInfoResponseBodyClusterInfo clusterInfo) {
        this.clusterInfo = clusterInfo;
        return this;
    }
    public DescribeClusterBasicInfoResponseBodyClusterInfo getClusterInfo() {
        return this.clusterInfo;
    }

    public DescribeClusterBasicInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeClusterBasicInfoResponseBodyClusterInfo extends TeaModel {
        /**
         * <p>The ID of cluster.</p>
         */
        @NameInMap("ClusterId")
        public String clusterId;

        /**
         * <p>The name of the cluster.</p>
         */
        @NameInMap("ClusterName")
        public String clusterName;

        /**
         * <p>The type of the cluster. Valid values:</p>
         * <br>
         * <p>*   **ManagedKubernetes**: managed Kubernetes cluster</p>
         * <p>*   **NotManagedKubernetes**: non-managed Kubernetes cluster</p>
         * <p>*   **PrivateKubernetes**: private cluster</p>
         * <p>*   **kubernetes**: dedicated Kubernetes cluster</p>
         * <p>*   **ask**: dedicated ASK cluster</p>
         */
        @NameInMap("ClusterType")
        public String clusterType;

        /**
         * <p>The timestamp when the cluster was created. Unit: milliseconds.</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The version of the cluster.</p>
         */
        @NameInMap("CurrentVersion")
        public String currentVersion;

        /**
         * <p>The number of instances in the cluster.</p>
         */
        @NameInMap("InstanceCount")
        public Integer instanceCount;

        /**
         * <p>The ID of the region in which the cluster is deployed.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The status of the cluster. Valid values:</p>
         * <br>
         * <p>*   **unavailable**</p>
         * <p>*   **Available**</p>
         * <p>*   **Creating**</p>
         * <p>*   **CreateFailed**</p>
         */
        @NameInMap("State")
        public String state;

        /**
         * <p>Indicates whether the cluster is enabled. Valid values:</p>
         * <br>
         * <p>*   **true**: The cluster is enabled.</p>
         * <p>*   **false**: The cluster is disabled.</p>
         */
        @NameInMap("TargetResult")
        public Boolean targetResult;

        public static DescribeClusterBasicInfoResponseBodyClusterInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterBasicInfoResponseBodyClusterInfo self = new DescribeClusterBasicInfoResponseBodyClusterInfo();
            return TeaModel.build(map, self);
        }

        public DescribeClusterBasicInfoResponseBodyClusterInfo setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public DescribeClusterBasicInfoResponseBodyClusterInfo setClusterName(String clusterName) {
            this.clusterName = clusterName;
            return this;
        }
        public String getClusterName() {
            return this.clusterName;
        }

        public DescribeClusterBasicInfoResponseBodyClusterInfo setClusterType(String clusterType) {
            this.clusterType = clusterType;
            return this;
        }
        public String getClusterType() {
            return this.clusterType;
        }

        public DescribeClusterBasicInfoResponseBodyClusterInfo setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public DescribeClusterBasicInfoResponseBodyClusterInfo setCurrentVersion(String currentVersion) {
            this.currentVersion = currentVersion;
            return this;
        }
        public String getCurrentVersion() {
            return this.currentVersion;
        }

        public DescribeClusterBasicInfoResponseBodyClusterInfo setInstanceCount(Integer instanceCount) {
            this.instanceCount = instanceCount;
            return this;
        }
        public Integer getInstanceCount() {
            return this.instanceCount;
        }

        public DescribeClusterBasicInfoResponseBodyClusterInfo setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeClusterBasicInfoResponseBodyClusterInfo setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public DescribeClusterBasicInfoResponseBodyClusterInfo setTargetResult(Boolean targetResult) {
            this.targetResult = targetResult;
            return this;
        }
        public Boolean getTargetResult() {
            return this.targetResult;
        }

    }

}
