// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeRenderingInstanceResponseBody extends TeaModel {
    /**
     * <p>A list of optional ingress network information.</p>
     */
    @NameInMap("AdditionalIngresses")
    public java.util.List<DescribeRenderingInstanceResponseBodyAdditionalIngresses> additionalIngresses;

    /**
     * <p>The configuration information of the rendering instance.</p>
     */
    @NameInMap("ConfigInfo")
    public DescribeRenderingInstanceResponseBodyConfigInfo configInfo;

    /**
     * <p>The instance creation time, in UTC (ISO 8601).</p>
     * 
     * <strong>example:</strong>
     * <p>2024-05-07T02:27:06Z</p>
     */
    @NameInMap("CreationTime")
    public String creationTime;

    /**
     * <p>The egress IP address.</p>
     * 
     * <strong>example:</strong>
     * <p>1.1.8.8</p>
     */
    @NameInMap("EgressIp")
    public String egressIp;

    /**
     * <p>The domain name or access IP address of the rendering instance.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-xxx.ecr.aliyuncs.com</p>
     */
    @NameInMap("Hostname")
    public String hostname;

    /**
     * <p>The billing method of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>PostPaid</p>
     */
    @NameInMap("InstanceChargeType")
    public String instanceChargeType;

    /**
     * <p>The internal IP address.</p>
     * 
     * <strong>example:</strong>
     * <p>10.1.17.32</p>
     */
    @NameInMap("InternalIp")
    public String internalIp;

    /**
     * <p>The ISP code. Valid values:</p>
     * <ol>
     * <li><p><code>cmcc</code></p>
     * </li>
     * <li><p><code>unicom</code></p>
     * </li>
     * <li><p><code>telecom</code></p>
     * </li>
     * </ol>
     * 
     * <strong>example:</strong>
     * <p>telecom</p>
     */
    @NameInMap("Isp")
    public String isp;

    /**
     * <p>A list of port mappings.</p>
     */
    @NameInMap("PortMappings")
    public java.util.List<DescribeRenderingInstanceResponseBodyPortMappings> portMappings;

    /**
     * <p>The ID of the rendering instance.</p>
     * 
     * <strong>example:</strong>
     * <p>render-9f8c57355d224ad7beaf95e145f22111</p>
     */
    @NameInMap("RenderingInstanceId")
    public String renderingInstanceId;

    /**
     * <p>The specification of the rendering instance.</p>
     * 
     * <strong>example:</strong>
     * <p>crs.cp.l1</p>
     */
    @NameInMap("RenderingSpec")
    public String renderingSpec;

    /**
     * <p>The operational status of the rendering instance.</p>
     */
    @NameInMap("RenderingStatus")
    public DescribeRenderingInstanceResponseBodyRenderingStatus renderingStatus;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>BEA5625F-8FCF-48F4-851B-CA63946DA664</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The attributes of the rendering instance.</p>
     */
    @NameInMap("ResourceAttributes")
    public DescribeRenderingInstanceResponseBodyResourceAttributes resourceAttributes;

    /**
     * <p>The status of the underlying computing resource.</p>
     */
    @NameInMap("ResourceStatus")
    public DescribeRenderingInstanceResponseBodyResourceStatus resourceStatus;

    /**
     * <p>The storage capacity of the rendering instance.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("StorageSize")
    public Integer storageSize;

    /**
     * <p>The system information of the rendering instance, such as its resolution.</p>
     */
    @NameInMap("SystemInfo")
    public DescribeRenderingInstanceResponseBodySystemInfo systemInfo;

    public static DescribeRenderingInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRenderingInstanceResponseBody self = new DescribeRenderingInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRenderingInstanceResponseBody setAdditionalIngresses(java.util.List<DescribeRenderingInstanceResponseBodyAdditionalIngresses> additionalIngresses) {
        this.additionalIngresses = additionalIngresses;
        return this;
    }
    public java.util.List<DescribeRenderingInstanceResponseBodyAdditionalIngresses> getAdditionalIngresses() {
        return this.additionalIngresses;
    }

    public DescribeRenderingInstanceResponseBody setConfigInfo(DescribeRenderingInstanceResponseBodyConfigInfo configInfo) {
        this.configInfo = configInfo;
        return this;
    }
    public DescribeRenderingInstanceResponseBodyConfigInfo getConfigInfo() {
        return this.configInfo;
    }

    public DescribeRenderingInstanceResponseBody setCreationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }
    public String getCreationTime() {
        return this.creationTime;
    }

    public DescribeRenderingInstanceResponseBody setEgressIp(String egressIp) {
        this.egressIp = egressIp;
        return this;
    }
    public String getEgressIp() {
        return this.egressIp;
    }

    public DescribeRenderingInstanceResponseBody setHostname(String hostname) {
        this.hostname = hostname;
        return this;
    }
    public String getHostname() {
        return this.hostname;
    }

    public DescribeRenderingInstanceResponseBody setInstanceChargeType(String instanceChargeType) {
        this.instanceChargeType = instanceChargeType;
        return this;
    }
    public String getInstanceChargeType() {
        return this.instanceChargeType;
    }

    public DescribeRenderingInstanceResponseBody setInternalIp(String internalIp) {
        this.internalIp = internalIp;
        return this;
    }
    public String getInternalIp() {
        return this.internalIp;
    }

    public DescribeRenderingInstanceResponseBody setIsp(String isp) {
        this.isp = isp;
        return this;
    }
    public String getIsp() {
        return this.isp;
    }

    public DescribeRenderingInstanceResponseBody setPortMappings(java.util.List<DescribeRenderingInstanceResponseBodyPortMappings> portMappings) {
        this.portMappings = portMappings;
        return this;
    }
    public java.util.List<DescribeRenderingInstanceResponseBodyPortMappings> getPortMappings() {
        return this.portMappings;
    }

    public DescribeRenderingInstanceResponseBody setRenderingInstanceId(String renderingInstanceId) {
        this.renderingInstanceId = renderingInstanceId;
        return this;
    }
    public String getRenderingInstanceId() {
        return this.renderingInstanceId;
    }

    public DescribeRenderingInstanceResponseBody setRenderingSpec(String renderingSpec) {
        this.renderingSpec = renderingSpec;
        return this;
    }
    public String getRenderingSpec() {
        return this.renderingSpec;
    }

    public DescribeRenderingInstanceResponseBody setRenderingStatus(DescribeRenderingInstanceResponseBodyRenderingStatus renderingStatus) {
        this.renderingStatus = renderingStatus;
        return this;
    }
    public DescribeRenderingInstanceResponseBodyRenderingStatus getRenderingStatus() {
        return this.renderingStatus;
    }

    public DescribeRenderingInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRenderingInstanceResponseBody setResourceAttributes(DescribeRenderingInstanceResponseBodyResourceAttributes resourceAttributes) {
        this.resourceAttributes = resourceAttributes;
        return this;
    }
    public DescribeRenderingInstanceResponseBodyResourceAttributes getResourceAttributes() {
        return this.resourceAttributes;
    }

    public DescribeRenderingInstanceResponseBody setResourceStatus(DescribeRenderingInstanceResponseBodyResourceStatus resourceStatus) {
        this.resourceStatus = resourceStatus;
        return this;
    }
    public DescribeRenderingInstanceResponseBodyResourceStatus getResourceStatus() {
        return this.resourceStatus;
    }

    public DescribeRenderingInstanceResponseBody setStorageSize(Integer storageSize) {
        this.storageSize = storageSize;
        return this;
    }
    public Integer getStorageSize() {
        return this.storageSize;
    }

    public DescribeRenderingInstanceResponseBody setSystemInfo(DescribeRenderingInstanceResponseBodySystemInfo systemInfo) {
        this.systemInfo = systemInfo;
        return this;
    }
    public DescribeRenderingInstanceResponseBodySystemInfo getSystemInfo() {
        return this.systemInfo;
    }

    public static class DescribeRenderingInstanceResponseBodyAdditionalIngressesPortMappings extends TeaModel {
        /**
         * <p>The external port or port range, such as <code>22</code>. For a port range, use a forward slash (<code>/</code>) to separate the start and end ports, for example, <code>10/20</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>12500/12519</p>
         */
        @NameInMap("ExternalPort")
        public String externalPort;

        /**
         * <p>The internal port or port range. The ports correspond one-to-one with the external ports. For a port range, use a forward slash (<code>/</code>) to separate the start and end ports, for example, <code>10/20</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>11120/11139</p>
         */
        @NameInMap("InternalPort")
        public String internalPort;

        public static DescribeRenderingInstanceResponseBodyAdditionalIngressesPortMappings build(java.util.Map<String, ?> map) throws Exception {
            DescribeRenderingInstanceResponseBodyAdditionalIngressesPortMappings self = new DescribeRenderingInstanceResponseBodyAdditionalIngressesPortMappings();
            return TeaModel.build(map, self);
        }

        public DescribeRenderingInstanceResponseBodyAdditionalIngressesPortMappings setExternalPort(String externalPort) {
            this.externalPort = externalPort;
            return this;
        }
        public String getExternalPort() {
            return this.externalPort;
        }

        public DescribeRenderingInstanceResponseBodyAdditionalIngressesPortMappings setInternalPort(String internalPort) {
            this.internalPort = internalPort;
            return this;
        }
        public String getInternalPort() {
            return this.internalPort;
        }

    }

    public static class DescribeRenderingInstanceResponseBodyAdditionalIngresses extends TeaModel {
        /**
         * <p>The domain name or IP address of the rendering instance.</p>
         * 
         * <strong>example:</strong>
         * <p>101.66.165.213</p>
         */
        @NameInMap("Hostname")
        public String hostname;

        /**
         * <p>The ISP code. Valid values:</p>
         * <ol>
         * <li><p><code>cmcc</code></p>
         * </li>
         * <li><p><code>unicom</code></p>
         * </li>
         * <li><p><code>telecom</code></p>
         * </li>
         * </ol>
         * 
         * <strong>example:</strong>
         * <p>cmcc</p>
         */
        @NameInMap("Isp")
        public String isp;

        /**
         * <p>A list of port mappings.</p>
         */
        @NameInMap("PortMappings")
        public java.util.List<DescribeRenderingInstanceResponseBodyAdditionalIngressesPortMappings> portMappings;

        public static DescribeRenderingInstanceResponseBodyAdditionalIngresses build(java.util.Map<String, ?> map) throws Exception {
            DescribeRenderingInstanceResponseBodyAdditionalIngresses self = new DescribeRenderingInstanceResponseBodyAdditionalIngresses();
            return TeaModel.build(map, self);
        }

        public DescribeRenderingInstanceResponseBodyAdditionalIngresses setHostname(String hostname) {
            this.hostname = hostname;
            return this;
        }
        public String getHostname() {
            return this.hostname;
        }

        public DescribeRenderingInstanceResponseBodyAdditionalIngresses setIsp(String isp) {
            this.isp = isp;
            return this;
        }
        public String getIsp() {
            return this.isp;
        }

        public DescribeRenderingInstanceResponseBodyAdditionalIngresses setPortMappings(java.util.List<DescribeRenderingInstanceResponseBodyAdditionalIngressesPortMappings> portMappings) {
            this.portMappings = portMappings;
            return this;
        }
        public java.util.List<DescribeRenderingInstanceResponseBodyAdditionalIngressesPortMappings> getPortMappings() {
            return this.portMappings;
        }

    }

    public static class DescribeRenderingInstanceResponseBodyConfigInfoConfigurationAttributes extends TeaModel {
        /**
         * <p>The name of the attribute.</p>
         * 
         * <strong>example:</strong>
         * <p>lon</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The value of the attribute.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Value")
        public Object value;

        public static DescribeRenderingInstanceResponseBodyConfigInfoConfigurationAttributes build(java.util.Map<String, ?> map) throws Exception {
            DescribeRenderingInstanceResponseBodyConfigInfoConfigurationAttributes self = new DescribeRenderingInstanceResponseBodyConfigInfoConfigurationAttributes();
            return TeaModel.build(map, self);
        }

        public DescribeRenderingInstanceResponseBodyConfigInfoConfigurationAttributes setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeRenderingInstanceResponseBodyConfigInfoConfigurationAttributes setValue(Object value) {
            this.value = value;
            return this;
        }
        public Object getValue() {
            return this.value;
        }

    }

    public static class DescribeRenderingInstanceResponseBodyConfigInfoConfiguration extends TeaModel {
        /**
         * <p>A list of attributes.</p>
         */
        @NameInMap("Attributes")
        public java.util.List<DescribeRenderingInstanceResponseBodyConfigInfoConfigurationAttributes> attributes;

        /**
         * <p>The name of the physical device simulation module. Valid values:</p>
         * <ol>
         * <li><p><code>ctl</code>: Control module</p>
         * </li>
         * <li><p><code>prop</code>: Property module</p>
         * </li>
         * <li><p><code>location</code>: Location module</p>
         * </li>
         * <li><p><code>battery</code>: Battery module</p>
         * </li>
         * <li><p><code>network</code>: Network module</p>
         * </li>
         * <li><p><code>bluetooth</code>: Bluetooth module</p>
         * </li>
         * <li><p><code>sim</code>: SIM card module</p>
         * </li>
         * <li><p><code>display</code>: Display module</p>
         * </li>
         * <li><p><code>system</code>: System module</p>
         * </li>
         * </ol>
         * 
         * <strong>example:</strong>
         * <p>location</p>
         */
        @NameInMap("ModuleName")
        public String moduleName;

        public static DescribeRenderingInstanceResponseBodyConfigInfoConfiguration build(java.util.Map<String, ?> map) throws Exception {
            DescribeRenderingInstanceResponseBodyConfigInfoConfiguration self = new DescribeRenderingInstanceResponseBodyConfigInfoConfiguration();
            return TeaModel.build(map, self);
        }

        public DescribeRenderingInstanceResponseBodyConfigInfoConfiguration setAttributes(java.util.List<DescribeRenderingInstanceResponseBodyConfigInfoConfigurationAttributes> attributes) {
            this.attributes = attributes;
            return this;
        }
        public java.util.List<DescribeRenderingInstanceResponseBodyConfigInfoConfigurationAttributes> getAttributes() {
            return this.attributes;
        }

        public DescribeRenderingInstanceResponseBodyConfigInfoConfiguration setModuleName(String moduleName) {
            this.moduleName = moduleName;
            return this;
        }
        public String getModuleName() {
            return this.moduleName;
        }

    }

    public static class DescribeRenderingInstanceResponseBodyConfigInfoNetworkConfig extends TeaModel {
        /**
         * <p>The status of the bandwidth configuration. Valid values:</p>
         * <ol>
         * <li><p><code>waiting</code>: The configuration is being applied.</p>
         * </li>
         * <li><p><code>success</code>: The configuration change is complete.</p>
         * </li>
         * <li><p><code>failed</code>: The configuration change failed.</p>
         * </li>
         * </ol>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("BandwidthStatus")
        public String bandwidthStatus;

        /**
         * <p>The maximum egress bandwidth, in Mbps. A value of 0 indicates no limit.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("MaxEgressBandwidth")
        public Integer maxEgressBandwidth;

        /**
         * <p>The maximum ingress bandwidth, in Mbps. A value of 0 indicates no limit.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("MaxIngressBandwidth")
        public Integer maxIngressBandwidth;

        /**
         * <p>The time the configuration was last updated.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-08-17T09:54:35Z</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        public static DescribeRenderingInstanceResponseBodyConfigInfoNetworkConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeRenderingInstanceResponseBodyConfigInfoNetworkConfig self = new DescribeRenderingInstanceResponseBodyConfigInfoNetworkConfig();
            return TeaModel.build(map, self);
        }

        public DescribeRenderingInstanceResponseBodyConfigInfoNetworkConfig setBandwidthStatus(String bandwidthStatus) {
            this.bandwidthStatus = bandwidthStatus;
            return this;
        }
        public String getBandwidthStatus() {
            return this.bandwidthStatus;
        }

        public DescribeRenderingInstanceResponseBodyConfigInfoNetworkConfig setMaxEgressBandwidth(Integer maxEgressBandwidth) {
            this.maxEgressBandwidth = maxEgressBandwidth;
            return this;
        }
        public Integer getMaxEgressBandwidth() {
            return this.maxEgressBandwidth;
        }

        public DescribeRenderingInstanceResponseBodyConfigInfoNetworkConfig setMaxIngressBandwidth(Integer maxIngressBandwidth) {
            this.maxIngressBandwidth = maxIngressBandwidth;
            return this;
        }
        public Integer getMaxIngressBandwidth() {
            return this.maxIngressBandwidth;
        }

        public DescribeRenderingInstanceResponseBodyConfigInfoNetworkConfig setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

    public static class DescribeRenderingInstanceResponseBodyConfigInfo extends TeaModel {
        /**
         * <p>A list of configured physical device simulation modules.</p>
         */
        @NameInMap("Configuration")
        public java.util.List<DescribeRenderingInstanceResponseBodyConfigInfoConfiguration> configuration;

        /**
         * <p>Ingress and egress bandwidth limits, in Mbps.</p>
         */
        @NameInMap("NetworkConfig")
        public DescribeRenderingInstanceResponseBodyConfigInfoNetworkConfig networkConfig;

        public static DescribeRenderingInstanceResponseBodyConfigInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeRenderingInstanceResponseBodyConfigInfo self = new DescribeRenderingInstanceResponseBodyConfigInfo();
            return TeaModel.build(map, self);
        }

        public DescribeRenderingInstanceResponseBodyConfigInfo setConfiguration(java.util.List<DescribeRenderingInstanceResponseBodyConfigInfoConfiguration> configuration) {
            this.configuration = configuration;
            return this;
        }
        public java.util.List<DescribeRenderingInstanceResponseBodyConfigInfoConfiguration> getConfiguration() {
            return this.configuration;
        }

        public DescribeRenderingInstanceResponseBodyConfigInfo setNetworkConfig(DescribeRenderingInstanceResponseBodyConfigInfoNetworkConfig networkConfig) {
            this.networkConfig = networkConfig;
            return this;
        }
        public DescribeRenderingInstanceResponseBodyConfigInfoNetworkConfig getNetworkConfig() {
            return this.networkConfig;
        }

    }

    public static class DescribeRenderingInstanceResponseBodyPortMappings extends TeaModel {
        /**
         * <p>The external port or port range, such as <code>22</code>. For a port range, use a forward slash (<code>/</code>) to separate the start and end ports, for example, <code>10/20</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>10013/10020</p>
         */
        @NameInMap("ExternalPort")
        public String externalPort;

        /**
         * <p>The internal port or port range. The ports correspond one-to-one with the external ports. For a port range, use a forward slash (<code>/</code>) to separate the start and end ports, for example, <code>10/20</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>49008/49015</p>
         */
        @NameInMap("InternalPort")
        public String internalPort;

        public static DescribeRenderingInstanceResponseBodyPortMappings build(java.util.Map<String, ?> map) throws Exception {
            DescribeRenderingInstanceResponseBodyPortMappings self = new DescribeRenderingInstanceResponseBodyPortMappings();
            return TeaModel.build(map, self);
        }

        public DescribeRenderingInstanceResponseBodyPortMappings setExternalPort(String externalPort) {
            this.externalPort = externalPort;
            return this;
        }
        public String getExternalPort() {
            return this.externalPort;
        }

        public DescribeRenderingInstanceResponseBodyPortMappings setInternalPort(String internalPort) {
            this.internalPort = internalPort;
            return this;
        }
        public String getInternalPort() {
            return this.internalPort;
        }

    }

    public static class DescribeRenderingInstanceResponseBodyRenderingStatus extends TeaModel {
        /**
         * <p>Additional details about the current status.</p>
         * 
         * <strong>example:</strong>
         * <p>工作中</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The name of the last action performed on the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>MigrateLocalData</p>
         */
        @NameInMap("LatestAction")
        public String latestAction;

        /**
         * <p>The operational status of the instance. Valid values:</p>
         * <ol>
         * <li><p><code>Preparing</code>: The instance is being initialized.</p>
         * </li>
         * <li><p><code>Rebooting</code>: The instance is rebooting.</p>
         * </li>
         * <li><p><code>Resetting</code>: The instance is being reset.</p>
         * </li>
         * <li><p><code>Working</code>: The instance is running normally. This is a terminal state.</p>
         * </li>
         * <li><p><code>Failure</code>: The instance has failed to start or operate. This is a terminal state.</p>
         * </li>
         * </ol>
         * 
         * <strong>example:</strong>
         * <p>Working</p>
         */
        @NameInMap("Status")
        public String status;

        public static DescribeRenderingInstanceResponseBodyRenderingStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribeRenderingInstanceResponseBodyRenderingStatus self = new DescribeRenderingInstanceResponseBodyRenderingStatus();
            return TeaModel.build(map, self);
        }

        public DescribeRenderingInstanceResponseBodyRenderingStatus setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeRenderingInstanceResponseBodyRenderingStatus setLatestAction(String latestAction) {
            this.latestAction = latestAction;
            return this;
        }
        public String getLatestAction() {
            return this.latestAction;
        }

        public DescribeRenderingInstanceResponseBodyRenderingStatus setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeRenderingInstanceResponseBodyResourceAttributes extends TeaModel {
        /**
         * <p>The configuration of the edge media service. Valid values:</p>
         * <ol>
         * <li><p><code>ON</code>: Enabled.</p>
         * </li>
         * <li><p><code>OFF</code>: Disabled.</p>
         * </li>
         * </ol>
         * 
         * <strong>example:</strong>
         * <p>ON</p>
         */
        @NameInMap("EdgeMediaService")
        public String edgeMediaService;

        /**
         * <p>The ingress network access configuration. Valid values:</p>
         * <ol>
         * <li><p><code>ON</code>: Enabled. The rendering instance can be accessed from the public internet.</p>
         * </li>
         * <li><p><code>OFF</code>: Disabled.</p>
         * </li>
         * </ol>
         * 
         * <strong>example:</strong>
         * <p>ON</p>
         */
        @NameInMap("InAccess")
        public String inAccess;

        /**
         * <p>The egress network access configuration. Valid values:</p>
         * <ol>
         * <li><p><code>ON</code>: Enabled. The rendering instance can access the public internet.</p>
         * </li>
         * <li><p><code>OFF</code>: Disabled.</p>
         * </li>
         * </ol>
         * 
         * <strong>example:</strong>
         * <p>ON</p>
         */
        @NameInMap("OutAccess")
        public String outAccess;

        /**
         * <p>The resource zone. Valid values: <code>Private</code> and <code>Public</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>Public</p>
         */
        @NameInMap("Zone")
        public String zone;

        public static DescribeRenderingInstanceResponseBodyResourceAttributes build(java.util.Map<String, ?> map) throws Exception {
            DescribeRenderingInstanceResponseBodyResourceAttributes self = new DescribeRenderingInstanceResponseBodyResourceAttributes();
            return TeaModel.build(map, self);
        }

        public DescribeRenderingInstanceResponseBodyResourceAttributes setEdgeMediaService(String edgeMediaService) {
            this.edgeMediaService = edgeMediaService;
            return this;
        }
        public String getEdgeMediaService() {
            return this.edgeMediaService;
        }

        public DescribeRenderingInstanceResponseBodyResourceAttributes setInAccess(String inAccess) {
            this.inAccess = inAccess;
            return this;
        }
        public String getInAccess() {
            return this.inAccess;
        }

        public DescribeRenderingInstanceResponseBodyResourceAttributes setOutAccess(String outAccess) {
            this.outAccess = outAccess;
            return this;
        }
        public String getOutAccess() {
            return this.outAccess;
        }

        public DescribeRenderingInstanceResponseBodyResourceAttributes setZone(String zone) {
            this.zone = zone;
            return this;
        }
        public String getZone() {
            return this.zone;
        }

    }

    public static class DescribeRenderingInstanceResponseBodyResourceStatus extends TeaModel {
        /**
         * <p>The running status of the computing resource. Valid values:</p>
         * <ol>
         * <li><p><code>running</code>: The edge instance is running normally.</p>
         * </li>
         * <li><p><code>operating</code>: The edge instance is under maintenance.</p>
         * </li>
         * <li><p><code>error</code>: An exception is detected on the edge instance.</p>
         * </li>
         * </ol>
         * 
         * <strong>example:</strong>
         * <p>running</p>
         */
        @NameInMap("Status")
        public String status;

        public static DescribeRenderingInstanceResponseBodyResourceStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribeRenderingInstanceResponseBodyResourceStatus self = new DescribeRenderingInstanceResponseBodyResourceStatus();
            return TeaModel.build(map, self);
        }

        public DescribeRenderingInstanceResponseBodyResourceStatus setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeRenderingInstanceResponseBodySystemInfo extends TeaModel {
        /**
         * <p>The refresh rate of the instance, in Hz.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("Frequency")
        public Integer frequency;

        /**
         * <p>The resolution. Valid values:</p>
         * <ul>
         * <li><p><code>1920*864</code></p>
         * </li>
         * <li><p><code>1080*1920</code></p>
         * </li>
         * <li><p><code>1920*1080</code></p>
         * </li>
         * <li><p><code>720*1280</code></p>
         * </li>
         * <li><p><code>2400*1080</code></p>
         * </li>
         * <li><p><code>1080*2400</code></p>
         * </li>
         * <li><p><code>1280*720</code></p>
         * </li>
         * <li><p><code>864*1920</code></p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1920*1080</p>
         */
        @NameInMap("Resolution")
        public String resolution;

        public static DescribeRenderingInstanceResponseBodySystemInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeRenderingInstanceResponseBodySystemInfo self = new DescribeRenderingInstanceResponseBodySystemInfo();
            return TeaModel.build(map, self);
        }

        public DescribeRenderingInstanceResponseBodySystemInfo setFrequency(Integer frequency) {
            this.frequency = frequency;
            return this;
        }
        public Integer getFrequency() {
            return this.frequency;
        }

        public DescribeRenderingInstanceResponseBodySystemInfo setResolution(String resolution) {
            this.resolution = resolution;
            return this;
        }
        public String getResolution() {
            return this.resolution;
        }

    }

}
