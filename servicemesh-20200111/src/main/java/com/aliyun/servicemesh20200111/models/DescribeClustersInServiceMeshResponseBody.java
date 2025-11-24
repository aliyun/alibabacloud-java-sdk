// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DescribeClustersInServiceMeshResponseBody extends TeaModel {
    /**
     * <p>The list of the clusters in the ASM instance.</p>
     */
    @NameInMap("Clusters")
    public java.util.List<DescribeClustersInServiceMeshResponseBodyClusters> clusters;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>31d3a0f0-07ed-4f6e-9004-1804498c****</p>
     */
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
        /**
         * <p>The name of the dashboard for access logs.</p>
         * 
         * <strong>example:</strong>
         * <p>mesh-access-log_details_cn</p>
         */
        @NameInMap("Title")
        public String title;

        /**
         * <p>The URL of the dashboard for access logs.</p>
         */
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

    public static class DescribeClustersInServiceMeshResponseBodyClustersGuestClusterConfigSMC extends TeaModel {
        @NameInMap("Enabled")
        public Boolean enabled;

        public static DescribeClustersInServiceMeshResponseBodyClustersGuestClusterConfigSMC build(java.util.Map<String, ?> map) throws Exception {
            DescribeClustersInServiceMeshResponseBodyClustersGuestClusterConfigSMC self = new DescribeClustersInServiceMeshResponseBodyClustersGuestClusterConfigSMC();
            return TeaModel.build(map, self);
        }

        public DescribeClustersInServiceMeshResponseBodyClustersGuestClusterConfigSMC setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

    }

    public static class DescribeClustersInServiceMeshResponseBodyClustersGuestClusterConfig extends TeaModel {
        @NameInMap("SMC")
        public DescribeClustersInServiceMeshResponseBodyClustersGuestClusterConfigSMC SMC;

        public static DescribeClustersInServiceMeshResponseBodyClustersGuestClusterConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeClustersInServiceMeshResponseBodyClustersGuestClusterConfig self = new DescribeClustersInServiceMeshResponseBodyClustersGuestClusterConfig();
            return TeaModel.build(map, self);
        }

        public DescribeClustersInServiceMeshResponseBodyClustersGuestClusterConfig setSMC(DescribeClustersInServiceMeshResponseBodyClustersGuestClusterConfigSMC SMC) {
            this.SMC = SMC;
            return this;
        }
        public DescribeClustersInServiceMeshResponseBodyClustersGuestClusterConfigSMC getSMC() {
            return this.SMC;
        }

    }

    public static class DescribeClustersInServiceMeshResponseBodyClusters extends TeaModel {
        /**
         * <p>The configurations of access log collection.</p>
         */
        @NameInMap("AccessLogDashboards")
        public java.util.List<DescribeClustersInServiceMeshResponseBodyClustersAccessLogDashboards> accessLogDashboards;

        /**
         * <p>The domain name of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        @NameInMap("ClusterDomain")
        public String clusterDomain;

        /**
         * <p>The ID of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>c80f45444b3da447da60a911390c2****</p>
         */
        @NameInMap("ClusterId")
        public String clusterId;

        /**
         * <p>The type of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>Ask</p>
         */
        @NameInMap("ClusterType")
        public String clusterType;

        /**
         * <p>The time when the cluster was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-05-12T15:38:16+08:00</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>,</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("GuestClusterConfig")
        public DescribeClustersInServiceMeshResponseBodyClustersGuestClusterConfig guestClusterConfig;

        /**
         * <p>Indicates whether the Logtail component is installed in the cluster. Valid values:</p>
         * <ul>
         * <li><code>logtail_installed</code>: The Logtail component is installed.</li>
         * </ul>
         * <p>\-<code>logtail_uninstalled</code>: The Logtail component is not installed.</p>
         * <ul>
         * <li><code>logtail_state_get_error</code>: The Logtail component failed to be installed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>logtail_installed</p>
         */
        @NameInMap("LogtailInstalledState")
        public String logtailInstalledState;

        /**
         * <p>The name of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>ask1</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The ID of the region in which the cluster resides.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The ID of the security group.</p>
         * 
         * <strong>example:</strong>
         * <p>sg-bp197668l6iupljy****</p>
         */
        @NameInMap("SgId")
        public String sgId;

        /**
         * <p>The status of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>running</p>
         */
        @NameInMap("State")
        public String state;

        /**
         * <p>The time when the cluster was last modified.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-05-12T15:38:16+08:00</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        /**
         * <p>The version number of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>v1.16.6-aliyun.1</p>
         */
        @NameInMap("Version")
        public String version;

        /**
         * <p>The ID of the virtual private cloud (VPC).</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-2zew0rajjkmxy2369****</p>
         */
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

        public DescribeClustersInServiceMeshResponseBodyClusters setGuestClusterConfig(DescribeClustersInServiceMeshResponseBodyClustersGuestClusterConfig guestClusterConfig) {
            this.guestClusterConfig = guestClusterConfig;
            return this;
        }
        public DescribeClustersInServiceMeshResponseBodyClustersGuestClusterConfig getGuestClusterConfig() {
            return this.guestClusterConfig;
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
