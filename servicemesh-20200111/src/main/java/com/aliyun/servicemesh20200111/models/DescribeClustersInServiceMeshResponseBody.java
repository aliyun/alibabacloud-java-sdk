// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DescribeClustersInServiceMeshResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Clusters")
    public java.util.List<DescribeClustersInServiceMeshResponseBodyClusters> clusters;

    public static DescribeClustersInServiceMeshResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeClustersInServiceMeshResponseBody self = new DescribeClustersInServiceMeshResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeClustersInServiceMeshResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeClustersInServiceMeshResponseBody setClusters(java.util.List<DescribeClustersInServiceMeshResponseBodyClusters> clusters) {
        this.clusters = clusters;
        return this;
    }
    public java.util.List<DescribeClustersInServiceMeshResponseBodyClusters> getClusters() {
        return this.clusters;
    }

    public static class DescribeClustersInServiceMeshResponseBodyClusters extends TeaModel {
        @NameInMap("SgId")
        public String sgId;

        @NameInMap("VpcId")
        public String vpcId;

        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("UpdateTime")
        public String updateTime;

        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("State")
        public String state;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("ClusterDomain")
        public String clusterDomain;

        @NameInMap("Version")
        public String version;

        @NameInMap("ClusterType")
        public String clusterType;

        @NameInMap("Name")
        public String name;

        @NameInMap("ClusterId")
        public String clusterId;

        public static DescribeClustersInServiceMeshResponseBodyClusters build(java.util.Map<String, ?> map) throws Exception {
            DescribeClustersInServiceMeshResponseBodyClusters self = new DescribeClustersInServiceMeshResponseBodyClusters();
            return TeaModel.build(map, self);
        }

        public DescribeClustersInServiceMeshResponseBodyClusters setSgId(String sgId) {
            this.sgId = sgId;
            return this;
        }
        public String getSgId() {
            return this.sgId;
        }

        public DescribeClustersInServiceMeshResponseBodyClusters setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeClustersInServiceMeshResponseBodyClusters setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeClustersInServiceMeshResponseBodyClusters setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public DescribeClustersInServiceMeshResponseBodyClusters setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DescribeClustersInServiceMeshResponseBodyClusters setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public DescribeClustersInServiceMeshResponseBodyClusters setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeClustersInServiceMeshResponseBodyClusters setClusterDomain(String clusterDomain) {
            this.clusterDomain = clusterDomain;
            return this;
        }
        public String getClusterDomain() {
            return this.clusterDomain;
        }

        public DescribeClustersInServiceMeshResponseBodyClusters setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public DescribeClustersInServiceMeshResponseBodyClusters setClusterType(String clusterType) {
            this.clusterType = clusterType;
            return this;
        }
        public String getClusterType() {
            return this.clusterType;
        }

        public DescribeClustersInServiceMeshResponseBodyClusters setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeClustersInServiceMeshResponseBodyClusters setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

    }

}
