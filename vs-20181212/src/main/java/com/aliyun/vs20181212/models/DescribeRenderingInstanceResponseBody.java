// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeRenderingInstanceResponseBody extends TeaModel {
    @NameInMap("ConfigInfo")
    public DescribeRenderingInstanceResponseBodyConfigInfo configInfo;

    /**
     * <strong>example:</strong>
     * <p>2024-05-07T02:27:06Z</p>
     */
    @NameInMap("CreationTime")
    public String creationTime;

    /**
     * <strong>example:</strong>
     * <p>cn-xxx.ecr.aliyuncs.com</p>
     */
    @NameInMap("Hostname")
    public String hostname;

    @NameInMap("PortMappings")
    public java.util.List<DescribeRenderingInstanceResponseBodyPortMappings> portMappings;

    /**
     * <strong>example:</strong>
     * <p>render-9f8c57355d224ad7beaf95e145f22111</p>
     */
    @NameInMap("RenderingInstanceId")
    public String renderingInstanceId;

    @NameInMap("RenderingStatus")
    public DescribeRenderingInstanceResponseBodyRenderingStatus renderingStatus;

    /**
     * <strong>example:</strong>
     * <p>BEA5625F-8FCF-48F4-851B-CA63946DA664</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SystemInfo")
    public DescribeRenderingInstanceResponseBodySystemInfo systemInfo;

    public static DescribeRenderingInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRenderingInstanceResponseBody self = new DescribeRenderingInstanceResponseBody();
        return TeaModel.build(map, self);
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

    public DescribeRenderingInstanceResponseBody setHostname(String hostname) {
        this.hostname = hostname;
        return this;
    }
    public String getHostname() {
        return this.hostname;
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

    public DescribeRenderingInstanceResponseBody setSystemInfo(DescribeRenderingInstanceResponseBodySystemInfo systemInfo) {
        this.systemInfo = systemInfo;
        return this;
    }
    public DescribeRenderingInstanceResponseBodySystemInfo getSystemInfo() {
        return this.systemInfo;
    }

    public static class DescribeRenderingInstanceResponseBodyConfigInfoConfigurationAttributes extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>lon</p>
         */
        @NameInMap("Name")
        public String name;

        /**
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
        @NameInMap("Attributes")
        public java.util.List<DescribeRenderingInstanceResponseBodyConfigInfoConfigurationAttributes> attributes;

        /**
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
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("BandwidthStatus")
        public String bandwidthStatus;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("MaxEgressBandwidth")
        public Integer maxEgressBandwidth;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("MaxIngressBandwidth")
        public Integer maxIngressBandwidth;

        /**
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
        @NameInMap("Configuration")
        public java.util.List<DescribeRenderingInstanceResponseBodyConfigInfoConfiguration> configuration;

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
         * <strong>example:</strong>
         * <p>10013/10020</p>
         */
        @NameInMap("ExternalPort")
        public String externalPort;

        /**
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
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>MigrateLocalData</p>
         */
        @NameInMap("LatestAction")
        public String latestAction;

        /**
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

    public static class DescribeRenderingInstanceResponseBodySystemInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("Frequency")
        public Integer frequency;

        /**
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
