// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeRCVClusterResponseBody extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("ClusterName")
    public String clusterName;

    @NameInMap("MysqlOperator")
    public DescribeRCVClusterResponseBodyMysqlOperator mysqlOperator;

    @NameInMap("Region")
    public String region;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SupportDiskPerformanceLevel")
    public java.util.List<String> supportDiskPerformanceLevel;

    @NameInMap("VClusterStatus")
    public String VClusterStatus;

    @NameInMap("VpcId")
    public String vpcId;

    public static DescribeRCVClusterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRCVClusterResponseBody self = new DescribeRCVClusterResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRCVClusterResponseBody setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DescribeRCVClusterResponseBody setClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }
    public String getClusterName() {
        return this.clusterName;
    }

    public DescribeRCVClusterResponseBody setMysqlOperator(DescribeRCVClusterResponseBodyMysqlOperator mysqlOperator) {
        this.mysqlOperator = mysqlOperator;
        return this;
    }
    public DescribeRCVClusterResponseBodyMysqlOperator getMysqlOperator() {
        return this.mysqlOperator;
    }

    public DescribeRCVClusterResponseBody setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public DescribeRCVClusterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRCVClusterResponseBody setSupportDiskPerformanceLevel(java.util.List<String> supportDiskPerformanceLevel) {
        this.supportDiskPerformanceLevel = supportDiskPerformanceLevel;
        return this;
    }
    public java.util.List<String> getSupportDiskPerformanceLevel() {
        return this.supportDiskPerformanceLevel;
    }

    public DescribeRCVClusterResponseBody setVClusterStatus(String VClusterStatus) {
        this.VClusterStatus = VClusterStatus;
        return this;
    }
    public String getVClusterStatus() {
        return this.VClusterStatus;
    }

    public DescribeRCVClusterResponseBody setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public static class DescribeRCVClusterResponseBodyMysqlOperator extends TeaModel {
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

        public static DescribeRCVClusterResponseBodyMysqlOperator build(java.util.Map<String, ?> map) throws Exception {
            DescribeRCVClusterResponseBodyMysqlOperator self = new DescribeRCVClusterResponseBodyMysqlOperator();
            return TeaModel.build(map, self);
        }

        public DescribeRCVClusterResponseBodyMysqlOperator setDashboardPublicEndpoint(String dashboardPublicEndpoint) {
            this.dashboardPublicEndpoint = dashboardPublicEndpoint;
            return this;
        }
        public String getDashboardPublicEndpoint() {
            return this.dashboardPublicEndpoint;
        }

        public DescribeRCVClusterResponseBodyMysqlOperator setDashboardUsername(String dashboardUsername) {
            this.dashboardUsername = dashboardUsername;
            return this;
        }
        public String getDashboardUsername() {
            return this.dashboardUsername;
        }

        public DescribeRCVClusterResponseBodyMysqlOperator setDashboardVpcEndpoint(String dashboardVpcEndpoint) {
            this.dashboardVpcEndpoint = dashboardVpcEndpoint;
            return this;
        }
        public String getDashboardVpcEndpoint() {
            return this.dashboardVpcEndpoint;
        }

        public DescribeRCVClusterResponseBodyMysqlOperator setDeployTime(String deployTime) {
            this.deployTime = deployTime;
            return this;
        }
        public String getDeployTime() {
            return this.deployTime;
        }

        public DescribeRCVClusterResponseBodyMysqlOperator setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
