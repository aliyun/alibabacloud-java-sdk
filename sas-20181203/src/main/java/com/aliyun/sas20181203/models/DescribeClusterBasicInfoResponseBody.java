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
     * 
     * <strong>example:</strong>
     * <p>24A20733-10A0-4AF6-BE6B-E3322413BB68</p>
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
         * 
         * <strong>example:</strong>
         * <p>c870ec78ecbcb41d2a35c679823ef****</p>
         */
        @NameInMap("ClusterId")
        public String clusterId;

        /**
         * <p>The name of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>testackpro</p>
         */
        @NameInMap("ClusterName")
        public String clusterName;

        /**
         * <p>The type of the cluster. Valid values:</p>
         * <ul>
         * <li><strong>ManagedKubernetes</strong>: managed Kubernetes cluster</li>
         * <li><strong>NotManagedKubernetes</strong>: non-managed Kubernetes cluster</li>
         * <li><strong>PrivateKubernetes</strong>: private cluster</li>
         * <li><strong>kubernetes</strong>: dedicated Kubernetes cluster</li>
         * <li><strong>ask</strong>: dedicated ASK cluster</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>kubernetes</p>
         */
        @NameInMap("ClusterType")
        public String clusterType;

        /**
         * <p>The timestamp when the cluster was created. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1662038134000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The version of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>1.22.10-aliyun.1</p>
         */
        @NameInMap("CurrentVersion")
        public String currentVersion;

        /**
         * <p>The number of instances in the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("InstanceCount")
        public Integer instanceCount;

        /**
         * <p>The ID of the region in which the cluster is deployed.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The status of the cluster. Valid values:</p>
         * <ul>
         * <li><strong>unavailable</strong></li>
         * <li><strong>Available</strong></li>
         * <li><strong>Creating</strong></li>
         * <li><strong>CreateFailed</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Available</p>
         */
        @NameInMap("State")
        public String state;

        /**
         * <p>Indicates whether the cluster is enabled. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The cluster is enabled.</li>
         * <li><strong>false</strong>: The cluster is disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
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
