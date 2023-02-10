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
         */
        @NameInMap("ClusterId")
        public String clusterId;

        /**
         * <p>The name of the container cluster.</p>
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
         * <p>The region of the container cluster.</p>
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
         * <p>*   **true**: yes</p>
         * <p>*   **false**: no</p>
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
