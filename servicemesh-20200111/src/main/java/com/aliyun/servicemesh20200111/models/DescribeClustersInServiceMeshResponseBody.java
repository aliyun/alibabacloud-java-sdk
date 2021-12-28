// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DescribeClustersInServiceMeshResponseBody extends TeaModel {
    @NameInMap("Clusters")
    public java.util.List<DescribeClustersInServiceMeshResponseBodyClusters> clusters;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeClustersInServiceMeshResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeClustersInServiceMeshResponseBody self = new DescribeClustersInServiceMeshResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeClustersInServiceMeshResponseBody setClusters(java.util.List<DescribeClustersInServiceMeshResponseBodyClusters> clusters) {
        this.clusters = clusters;
        return this;
    }
    public java.util.List<DescribeClustersInServiceMeshResponseBodyClusters> getClusters() {
        return this.clusters;
    }

    public DescribeClustersInServiceMeshResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeClustersInServiceMeshResponseBodyClustersAccessLogDashboards extends TeaModel {
        @NameInMap("Title")
        public String title;

        @NameInMap("Url")
        public String url;

        public static DescribeClustersInServiceMeshResponseBodyClustersAccessLogDashboards build(java.util.Map<String, ?> map) throws Exception {
            DescribeClustersInServiceMeshResponseBodyClustersAccessLogDashboards self = new DescribeClustersInServiceMeshResponseBodyClustersAccessLogDashboards();
            return TeaModel.build(map, self);
        }

        public DescribeClustersInServiceMeshResponseBodyClustersAccessLogDashboards setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public DescribeClustersInServiceMeshResponseBodyClustersAccessLogDashboards setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class DescribeClustersInServiceMeshResponseBodyClusters extends TeaModel {
        @NameInMap("AccessLogDashboards")
        public java.util.List<DescribeClustersInServiceMeshResponseBodyClustersAccessLogDashboards> accessLogDashboards;

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

        @NameInMap("LogtailInstalledState")
        public String logtailInstalledState;

        @NameInMap("Name")
        public String name;

        @NameInMap("RegionId")
        public String regionId;

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

        public static DescribeClustersInServiceMeshResponseBodyClusters build(java.util.Map<String, ?> map) throws Exception {
            DescribeClustersInServiceMeshResponseBodyClusters self = new DescribeClustersInServiceMeshResponseBodyClusters();
            return TeaModel.build(map, self);
        }

        public DescribeClustersInServiceMeshResponseBodyClusters setAccessLogDashboards(java.util.List<DescribeClustersInServiceMeshResponseBodyClustersAccessLogDashboards> accessLogDashboards) {
            this.accessLogDashboards = accessLogDashboards;
            return this;
        }
        public java.util.List<DescribeClustersInServiceMeshResponseBodyClustersAccessLogDashboards> getAccessLogDashboards() {
            return this.accessLogDashboards;
        }

        public DescribeClustersInServiceMeshResponseBodyClusters setClusterDomain(String clusterDomain) {
            this.clusterDomain = clusterDomain;
            return this;
        }
        public String getClusterDomain() {
            return this.clusterDomain;
        }

        public DescribeClustersInServiceMeshResponseBodyClusters setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public DescribeClustersInServiceMeshResponseBodyClusters setClusterType(String clusterType) {
            this.clusterType = clusterType;
            return this;
        }
        public String getClusterType() {
            return this.clusterType;
        }

        public DescribeClustersInServiceMeshResponseBodyClusters setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeClustersInServiceMeshResponseBodyClusters setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DescribeClustersInServiceMeshResponseBodyClusters setLogtailInstalledState(String logtailInstalledState) {
            this.logtailInstalledState = logtailInstalledState;
            return this;
        }
        public String getLogtailInstalledState() {
            return this.logtailInstalledState;
        }

        public DescribeClustersInServiceMeshResponseBodyClusters setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeClustersInServiceMeshResponseBodyClusters setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeClustersInServiceMeshResponseBodyClusters setSgId(String sgId) {
            this.sgId = sgId;
            return this;
        }
        public String getSgId() {
            return this.sgId;
        }

        public DescribeClustersInServiceMeshResponseBodyClusters setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public DescribeClustersInServiceMeshResponseBodyClusters setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public DescribeClustersInServiceMeshResponseBodyClusters setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public DescribeClustersInServiceMeshResponseBodyClusters setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

}
