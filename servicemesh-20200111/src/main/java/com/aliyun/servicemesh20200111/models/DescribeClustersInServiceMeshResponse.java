// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DescribeClustersInServiceMeshResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Clusters")
    @Validation(required = true)
    public java.util.List<DescribeClustersInServiceMeshResponseClusters> clusters;

    public static DescribeClustersInServiceMeshResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeClustersInServiceMeshResponse self = new DescribeClustersInServiceMeshResponse();
        return TeaModel.build(map, self);
    }

    public DescribeClustersInServiceMeshResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeClustersInServiceMeshResponse setClusters(java.util.List<DescribeClustersInServiceMeshResponseClusters> clusters) {
        this.clusters = clusters;
        return this;
    }
    public java.util.List<DescribeClustersInServiceMeshResponseClusters> getClusters() {
        return this.clusters;
    }

    public static class DescribeClustersInServiceMeshResponseClustersAccessLogDashboards extends TeaModel {
        @NameInMap("Title")
        @Validation(required = true)
        public String title;

        @NameInMap("Url")
        @Validation(required = true)
        public String url;

        public static DescribeClustersInServiceMeshResponseClustersAccessLogDashboards build(java.util.Map<String, ?> map) throws Exception {
            DescribeClustersInServiceMeshResponseClustersAccessLogDashboards self = new DescribeClustersInServiceMeshResponseClustersAccessLogDashboards();
            return TeaModel.build(map, self);
        }

        public DescribeClustersInServiceMeshResponseClustersAccessLogDashboards setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public DescribeClustersInServiceMeshResponseClustersAccessLogDashboards setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class DescribeClustersInServiceMeshResponseClusters extends TeaModel {
        @NameInMap("ClusterId")
        @Validation(required = true)
        public String clusterId;

        @NameInMap("ClusterType")
        @Validation(required = true)
        public String clusterType;

        @NameInMap("CreationTime")
        @Validation(required = true)
        public String creationTime;

        @NameInMap("ErrorMessage")
        @Validation(required = true)
        public String errorMessage;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("RegionId")
        @Validation(required = true)
        public String regionId;

        @NameInMap("State")
        @Validation(required = true)
        public String state;

        @NameInMap("UpdateTime")
        @Validation(required = true)
        public String updateTime;

        @NameInMap("Version")
        @Validation(required = true)
        public String version;

        @NameInMap("VpcId")
        @Validation(required = true)
        public String vpcId;

        @NameInMap("SgId")
        @Validation(required = true)
        public String sgId;

        @NameInMap("ClusterDomain")
        @Validation(required = true)
        public String clusterDomain;

        @NameInMap("AccessLogDashboards")
        @Validation(required = true)
        public java.util.List<DescribeClustersInServiceMeshResponseClustersAccessLogDashboards> accessLogDashboards;

        public static DescribeClustersInServiceMeshResponseClusters build(java.util.Map<String, ?> map) throws Exception {
            DescribeClustersInServiceMeshResponseClusters self = new DescribeClustersInServiceMeshResponseClusters();
            return TeaModel.build(map, self);
        }

        public DescribeClustersInServiceMeshResponseClusters setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public DescribeClustersInServiceMeshResponseClusters setClusterType(String clusterType) {
            this.clusterType = clusterType;
            return this;
        }
        public String getClusterType() {
            return this.clusterType;
        }

        public DescribeClustersInServiceMeshResponseClusters setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeClustersInServiceMeshResponseClusters setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DescribeClustersInServiceMeshResponseClusters setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeClustersInServiceMeshResponseClusters setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeClustersInServiceMeshResponseClusters setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public DescribeClustersInServiceMeshResponseClusters setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public DescribeClustersInServiceMeshResponseClusters setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public DescribeClustersInServiceMeshResponseClusters setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeClustersInServiceMeshResponseClusters setSgId(String sgId) {
            this.sgId = sgId;
            return this;
        }
        public String getSgId() {
            return this.sgId;
        }

        public DescribeClustersInServiceMeshResponseClusters setClusterDomain(String clusterDomain) {
            this.clusterDomain = clusterDomain;
            return this;
        }
        public String getClusterDomain() {
            return this.clusterDomain;
        }

        public DescribeClustersInServiceMeshResponseClusters setAccessLogDashboards(java.util.List<DescribeClustersInServiceMeshResponseClustersAccessLogDashboards> accessLogDashboards) {
            this.accessLogDashboards = accessLogDashboards;
            return this;
        }
        public java.util.List<DescribeClustersInServiceMeshResponseClustersAccessLogDashboards> getAccessLogDashboards() {
            return this.accessLogDashboards;
        }

    }

}
