// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DescribeServiceMeshClustersResponseBody extends TeaModel {
    @NameInMap("Clusters")
    public java.util.List<DescribeServiceMeshClustersResponseBodyClusters> clusters;

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

    public DescribeServiceMeshClustersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeServiceMeshClustersResponseBodyClusters extends TeaModel {
        @NameInMap("ClusterDomain")
        public String clusterDomain;

        @NameInMap("ClusterId")
        public String clusterId;

        @NameInMap("ClusterType")
        public String clusterType;

        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("ForbiddenFlag")
        public Long forbiddenFlag;

        @NameInMap("Name")
        public String name;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("ServiceMeshId")
        public String serviceMeshId;

        @NameInMap("SgId")
        public String sgId;

        @NameInMap("State")
        public String state;

        @NameInMap("UpdateTime")
        public String updateTime;

        @NameInMap("Version")
        public String version;

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
