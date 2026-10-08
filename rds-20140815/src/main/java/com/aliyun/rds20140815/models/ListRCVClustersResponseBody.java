// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ListRCVClustersResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("VClusters")
    public java.util.List<ListRCVClustersResponseBodyVClusters> VClusters;

    public static ListRCVClustersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRCVClustersResponseBody self = new ListRCVClustersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRCVClustersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListRCVClustersResponseBody setVClusters(java.util.List<ListRCVClustersResponseBodyVClusters> VClusters) {
        this.VClusters = VClusters;
        return this;
    }
    public java.util.List<ListRCVClustersResponseBodyVClusters> getVClusters() {
        return this.VClusters;
    }

    public static class ListRCVClustersResponseBodyVClustersMysqlOperator extends TeaModel {
        @NameInMap("DashboardPublicEndpoint")
        public String dashboardPublicEndpoint;

        @NameInMap("DashboardUsername")
        public String dashboardUsername;

        @NameInMap("DashboardVpcEndpoint")
        public String dashboardVpcEndpoint;

        @NameInMap("DeployTime")
        public String deployTime;

        @NameInMap("Status")
        public String status;

        public static ListRCVClustersResponseBodyVClustersMysqlOperator build(java.util.Map<String, ?> map) throws Exception {
            ListRCVClustersResponseBodyVClustersMysqlOperator self = new ListRCVClustersResponseBodyVClustersMysqlOperator();
            return TeaModel.build(map, self);
        }

        public ListRCVClustersResponseBodyVClustersMysqlOperator setDashboardPublicEndpoint(String dashboardPublicEndpoint) {
            this.dashboardPublicEndpoint = dashboardPublicEndpoint;
            return this;
        }
        public String getDashboardPublicEndpoint() {
            return this.dashboardPublicEndpoint;
        }

        public ListRCVClustersResponseBodyVClustersMysqlOperator setDashboardUsername(String dashboardUsername) {
            this.dashboardUsername = dashboardUsername;
            return this;
        }
        public String getDashboardUsername() {
            return this.dashboardUsername;
        }

        public ListRCVClustersResponseBodyVClustersMysqlOperator setDashboardVpcEndpoint(String dashboardVpcEndpoint) {
            this.dashboardVpcEndpoint = dashboardVpcEndpoint;
            return this;
        }
        public String getDashboardVpcEndpoint() {
            return this.dashboardVpcEndpoint;
        }

        public ListRCVClustersResponseBodyVClustersMysqlOperator setDeployTime(String deployTime) {
            this.deployTime = deployTime;
            return this;
        }
        public String getDeployTime() {
            return this.deployTime;
        }

        public ListRCVClustersResponseBodyVClustersMysqlOperator setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class ListRCVClustersResponseBodyVClusters extends TeaModel {
        @NameInMap("ClusterId")
        public String clusterId;

        @NameInMap("ClusterName")
        public String clusterName;

        @NameInMap("InstanceCount")
        public Long instanceCount;

        @NameInMap("MysqlOperator")
        public ListRCVClustersResponseBodyVClustersMysqlOperator mysqlOperator;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("Status")
        public String status;

        @NameInMap("SupportDiskPerformanceLevel")
        public java.util.List<String> supportDiskPerformanceLevel;

        @NameInMap("VpcId")
        public String vpcId;

        public static ListRCVClustersResponseBodyVClusters build(java.util.Map<String, ?> map) throws Exception {
            ListRCVClustersResponseBodyVClusters self = new ListRCVClustersResponseBodyVClusters();
            return TeaModel.build(map, self);
        }

        public ListRCVClustersResponseBodyVClusters setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public ListRCVClustersResponseBodyVClusters setClusterName(String clusterName) {
            this.clusterName = clusterName;
            return this;
        }
        public String getClusterName() {
            return this.clusterName;
        }

        public ListRCVClustersResponseBodyVClusters setInstanceCount(Long instanceCount) {
            this.instanceCount = instanceCount;
            return this;
        }
        public Long getInstanceCount() {
            return this.instanceCount;
        }

        public ListRCVClustersResponseBodyVClusters setMysqlOperator(ListRCVClustersResponseBodyVClustersMysqlOperator mysqlOperator) {
            this.mysqlOperator = mysqlOperator;
            return this;
        }
        public ListRCVClustersResponseBodyVClustersMysqlOperator getMysqlOperator() {
            return this.mysqlOperator;
        }

        public ListRCVClustersResponseBodyVClusters setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListRCVClustersResponseBodyVClusters setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListRCVClustersResponseBodyVClusters setSupportDiskPerformanceLevel(java.util.List<String> supportDiskPerformanceLevel) {
            this.supportDiskPerformanceLevel = supportDiskPerformanceLevel;
            return this;
        }
        public java.util.List<String> getSupportDiskPerformanceLevel() {
            return this.supportDiskPerformanceLevel;
        }

        public ListRCVClustersResponseBodyVClusters setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

}
