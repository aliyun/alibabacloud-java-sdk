// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DescribeServiceMeshClustersResponseBody extends TeaModel {
    /**
     * <p>The point in time when the cluster was last modified.</p>
     */
    @NameInMap("Clusters")
    public java.util.List<DescribeServiceMeshClustersResponseBodyClusters> clusters;

    @NameInMap("NumberOfClusters")
    public Long numberOfClusters;

    /**
     * <p>The point in time when the cluster was created.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeServiceMeshClustersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeServiceMeshClustersResponseBody self = new DescribeServiceMeshClustersResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeServiceMeshClustersResponseBody setClusters(java.util.List<DescribeServiceMeshClustersResponseBodyClusters> clusters) {
        this.clusters = clusters;
        return this;
    }
    public java.util.List<DescribeServiceMeshClustersResponseBodyClusters> getClusters() {
        return this.clusters;
    }

    public DescribeServiceMeshClustersResponseBody setNumberOfClusters(Long numberOfClusters) {
        this.numberOfClusters = numberOfClusters;
        return this;
    }
    public Long getNumberOfClusters() {
        return this.numberOfClusters;
    }

    public DescribeServiceMeshClustersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeServiceMeshClustersResponseBodyClusters extends TeaModel {
        /**
         * <p>The ID of the cluster.</p>
         */
        @NameInMap("ClusterDomain")
        public String clusterDomain;

        @NameInMap("ClusterId")
        public String clusterId;

        @NameInMap("ClusterType")
        public String clusterType;

        /**
         * <p>The ID of the ASM instance.</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The domain name of the cluster.</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("ForbiddenFlag")
        public Long forbiddenFlag;

        @NameInMap("ForbiddenInfo")
        public String forbiddenInfo;

        @NameInMap("Name")
        public String name;

        /**
         * <p>The name of the cluster.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The type of the cluster.</p>
         */
        @NameInMap("ServiceMeshId")
        public String serviceMeshId;

        /**
         * <p>The error message about the cluster.</p>
         */
        @NameInMap("SgId")
        public String sgId;

        /**
         * <p>The version number of the cluster.</p>
         */
        @NameInMap("State")
        public String state;

        /**
         * <p>The ID of the region in which the cluster resides.</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        /**
         * <p>Indicates that the cluster is available or the reason why the cluster cannot be added to the ASM instance. Valid values:</p>
         * <br>
         * <p>*   `0`: The cluster can be added to the ASM instance.</p>
         * <p>*   `1`: The cluster cannot be added to the ASM instance because you do not have administrator permissions on the cluster.</p>
         * <p>*   `2`: The cluster cannot be added to the ASM instance because the cluster and the ASM instance reside in different VPCs between which no private connections are built.</p>
         * <p>*   `3`: The CIDR block of the cluster conflicts with that of the ASM instance.</p>
         * <p>*   `4`: The cluster has a namespace that is named istio system.</p>
         */
        @NameInMap("Version")
        public String version;

        /**
         * <p>The status of the cluster. Valid values:</p>
         * <br>
         * <p>*   `running`: The cluster is running.</p>
         * <p>*   `starting`: The cluster is starting.</p>
         * <p>*   `stopping`: The cluster is being stopped.</p>
         * <p>*   `stopped`: The cluster is stopped.</p>
         * <p>*   `failed`: The cluster fails to be run.</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        public static DescribeServiceMeshClustersResponseBodyClusters build(java.util.Map<String, ?> map) throws Exception {
            DescribeServiceMeshClustersResponseBodyClusters self = new DescribeServiceMeshClustersResponseBodyClusters();
            return TeaModel.build(map, self);
        }

        public DescribeServiceMeshClustersResponseBodyClusters setClusterDomain(String clusterDomain) {
            this.clusterDomain = clusterDomain;
            return this;
        }
        public String getClusterDomain() {
            return this.clusterDomain;
        }

        public DescribeServiceMeshClustersResponseBodyClusters setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public DescribeServiceMeshClustersResponseBodyClusters setClusterType(String clusterType) {
            this.clusterType = clusterType;
            return this;
        }
        public String getClusterType() {
            return this.clusterType;
        }

        public DescribeServiceMeshClustersResponseBodyClusters setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeServiceMeshClustersResponseBodyClusters setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DescribeServiceMeshClustersResponseBodyClusters setForbiddenFlag(Long forbiddenFlag) {
            this.forbiddenFlag = forbiddenFlag;
            return this;
        }
        public Long getForbiddenFlag() {
            return this.forbiddenFlag;
        }

        public DescribeServiceMeshClustersResponseBodyClusters setForbiddenInfo(String forbiddenInfo) {
            this.forbiddenInfo = forbiddenInfo;
            return this;
        }
        public String getForbiddenInfo() {
            return this.forbiddenInfo;
        }

        public DescribeServiceMeshClustersResponseBodyClusters setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeServiceMeshClustersResponseBodyClusters setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeServiceMeshClustersResponseBodyClusters setServiceMeshId(String serviceMeshId) {
            this.serviceMeshId = serviceMeshId;
            return this;
        }
        public String getServiceMeshId() {
            return this.serviceMeshId;
        }

        public DescribeServiceMeshClustersResponseBodyClusters setSgId(String sgId) {
            this.sgId = sgId;
            return this;
        }
        public String getSgId() {
            return this.sgId;
        }

        public DescribeServiceMeshClustersResponseBodyClusters setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public DescribeServiceMeshClustersResponseBodyClusters setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public DescribeServiceMeshClustersResponseBodyClusters setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public DescribeServiceMeshClustersResponseBodyClusters setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

}
