// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeClusterInfoListResponseBody extends TeaModel {
    /**
     * <p>An array that consists of the information about clusters.</p>
     */
    @NameInMap("ClusterList")
    public java.util.List<DescribeClusterInfoListResponseBodyClusterList> clusterList;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>7E0618A9-D5EF-4220-9471-C42B5E92719F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeClusterInfoListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterInfoListResponseBody self = new DescribeClusterInfoListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeClusterInfoListResponseBody setClusterList(java.util.List<DescribeClusterInfoListResponseBodyClusterList> clusterList) {
        this.clusterList = clusterList;
        return this;
    }
    public java.util.List<DescribeClusterInfoListResponseBodyClusterList> getClusterList() {
        return this.clusterList;
    }

    public DescribeClusterInfoListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeClusterInfoListResponseBodyClusterList extends TeaModel {
        /**
         * <p>The ID of the container cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>cfeb7a9f99ce740e98c5595d0fe37****</p>
         */
        @NameInMap("ClusterId")
        public String clusterId;

        /**
         * <p>The name of the container cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>test111</p>
         */
        @NameInMap("ClusterName")
        public String clusterName;

        /**
         * <p>The type of the cluster. Valid values:</p>
         * <ul>
         * <li><strong>ManagedKubernetes</strong>: managed Kubernetes cluster.</li>
         * <li><strong>NotManagedKubernetes</strong>: non-managed Kubernetes cluster.</li>
         * <li><strong>PrivateKubernetes</strong>: private cluster.</li>
         * <li><strong>kubernetes</strong>: dedicated Kubernetes cluster.</li>
         * <li><strong>ask</strong>: dedicated serverless Kubernetes (ASK) cluster.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ManagedKubernetes</p>
         */
        @NameInMap("ClusterType")
        public String clusterType;

        /**
         * <p>The region in which the cluster resides.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The status of the cluster. Valid values:</p>
         * <ul>
         * <li><strong>unavailable</strong>: The cluster is unavailable.</li>
         * <li><strong>Available</strong>: The cluster is available.</li>
         * <li><strong>Creating</strong>: The cluster is being created.</li>
         * <li><strong>CreateFailed</strong>: The cluster failed to be created.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Available</p>
         */
        @NameInMap("State")
        public String state;

        /**
         * <p>Indicates whether container network topology was enabled. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("TargetResult")
        public Boolean targetResult;

        public static DescribeClusterInfoListResponseBodyClusterList build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterInfoListResponseBodyClusterList self = new DescribeClusterInfoListResponseBodyClusterList();
            return TeaModel.build(map, self);
        }

        public DescribeClusterInfoListResponseBodyClusterList setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public DescribeClusterInfoListResponseBodyClusterList setClusterName(String clusterName) {
            this.clusterName = clusterName;
            return this;
        }
        public String getClusterName() {
            return this.clusterName;
        }

        public DescribeClusterInfoListResponseBodyClusterList setClusterType(String clusterType) {
            this.clusterType = clusterType;
            return this;
        }
        public String getClusterType() {
            return this.clusterType;
        }

        public DescribeClusterInfoListResponseBodyClusterList setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeClusterInfoListResponseBodyClusterList setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public DescribeClusterInfoListResponseBodyClusterList setTargetResult(Boolean targetResult) {
            this.targetResult = targetResult;
            return this;
        }
        public Boolean getTargetResult() {
            return this.targetResult;
        }

    }

}
