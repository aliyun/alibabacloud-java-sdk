// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class DescribeInstanceAttributeResponseBody extends TeaModel {
    /**
     * <p>The attribute information about the bastion host.</p>
     */
    @NameInMap("InstanceAttribute")
    public DescribeInstanceAttributeResponseBodyInstanceAttribute instanceAttribute;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeInstanceAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceAttributeResponseBody self = new DescribeInstanceAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceAttributeResponseBody setInstanceAttribute(DescribeInstanceAttributeResponseBodyInstanceAttribute instanceAttribute) {
        this.instanceAttribute = instanceAttribute;
        return this;
    }
    public DescribeInstanceAttributeResponseBodyInstanceAttribute getInstanceAttribute() {
        return this.instanceAttribute;
    }

    public DescribeInstanceAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeInstanceAttributeResponseBodyInstanceAttributePorts extends TeaModel {
        /**
         * <p>The custom port.</p>
         * <br>
         * <p>>  You can change only the SSH and RDP ports. If O\&M ports are not specified, the value of the StandardPort parameter is returned.</p>
         */
        @NameInMap("CustomPort")
        public Integer customPort;

        /**
         * <p>The standard port of the bastion host. Valid values:</p>
         * <br>
         * <p>*   **SSH**: 60022</p>
         * <p>*   **RDP**: 63389</p>
         * <p>*   **HTTPS**: 443</p>
         */
        @NameInMap("StandardPort")
        public Integer standardPort;

        public static DescribeInstanceAttributeResponseBodyInstanceAttributePorts build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceAttributeResponseBodyInstanceAttributePorts self = new DescribeInstanceAttributeResponseBodyInstanceAttributePorts();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceAttributeResponseBodyInstanceAttributePorts setCustomPort(Integer customPort) {
            this.customPort = customPort;
            return this;
        }
        public Integer getCustomPort() {
            return this.customPort;
        }

        public DescribeInstanceAttributeResponseBodyInstanceAttributePorts setStandardPort(Integer standardPort) {
            this.standardPort = standardPort;
            return this;
        }
        public Integer getStandardPort() {
            return this.standardPort;
        }

    }

    public static class DescribeInstanceAttributeResponseBodyInstanceAttribute extends TeaModel {
        @NameInMap("AuthorizedSecurityGroups")
        public java.util.List<String> authorizedSecurityGroups;

        /**
         * <p>The total bandwidth of the bastion host.</p>
         */
        @NameInMap("Bandwidth")
        public String bandwidth;

        /**
         * <p>The extra bandwidth plan of the bastion host.</p>
         */
        @NameInMap("BandwidthPackage")
        public String bandwidthPackage;

        @NameInMap("DbOperationModule")
        public String dbOperationModule;

        @NameInMap("Description")
        public String description;

        @NameInMap("EniInstanceId")
        public String eniInstanceId;

        @NameInMap("ExpireTime")
        public Long expireTime;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("InstanceStatus")
        public String instanceStatus;

        @NameInMap("InternetEndpoint")
        public String internetEndpoint;

        @NameInMap("IntranetEndpoint")
        public String intranetEndpoint;

        @NameInMap("LicenseCode")
        public String licenseCode;

        @NameInMap("ModifyPasswordModule")
        public String modifyPasswordModule;

        @NameInMap("NetworkProxyModule")
        public String networkProxyModule;

        @NameInMap("Ports")
        public java.util.List<DescribeInstanceAttributeResponseBodyInstanceAttributePorts> ports;

        @NameInMap("PrivateExportIps")
        public java.util.List<String> privateExportIps;

        @NameInMap("PrivateWhiteList")
        public java.util.List<String> privateWhiteList;

        @NameInMap("PublicExportIps")
        public java.util.List<String> publicExportIps;

        @NameInMap("PublicIps")
        public java.util.List<String> publicIps;

        @NameInMap("PublicNetworkAccess")
        public Boolean publicNetworkAccess;

        @NameInMap("PublicWhiteList")
        public java.util.List<String> publicWhiteList;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        @NameInMap("SecurityGroupIds")
        public java.util.List<String> securityGroupIds;

        @NameInMap("StartTime")
        public Long startTime;

        @NameInMap("Storage")
        public Long storage;

        @NameInMap("VpcId")
        public String vpcId;

        @NameInMap("VswitchId")
        public String vswitchId;

        @NameInMap("WebTerminalModule")
        public String webTerminalModule;

        public static DescribeInstanceAttributeResponseBodyInstanceAttribute build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceAttributeResponseBodyInstanceAttribute self = new DescribeInstanceAttributeResponseBodyInstanceAttribute();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceAttributeResponseBodyInstanceAttribute setAuthorizedSecurityGroups(java.util.List<String> authorizedSecurityGroups) {
            this.authorizedSecurityGroups = authorizedSecurityGroups;
            return this;
        }
        public java.util.List<String> getAuthorizedSecurityGroups() {
            return this.authorizedSecurityGroups;
        }

        public DescribeInstanceAttributeResponseBodyInstanceAttribute setBandwidth(String bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }
        public String getBandwidth() {
            return this.bandwidth;
        }

        public DescribeInstanceAttributeResponseBodyInstanceAttribute setBandwidthPackage(String bandwidthPackage) {
            this.bandwidthPackage = bandwidthPackage;
            return this;
        }
        public String getBandwidthPackage() {
            return this.bandwidthPackage;
        }

        public DescribeInstanceAttributeResponseBodyInstanceAttribute setDbOperationModule(String dbOperationModule) {
            this.dbOperationModule = dbOperationModule;
            return this;
        }
        public String getDbOperationModule() {
            return this.dbOperationModule;
        }

        public DescribeInstanceAttributeResponseBodyInstanceAttribute setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeInstanceAttributeResponseBodyInstanceAttribute setEniInstanceId(String eniInstanceId) {
            this.eniInstanceId = eniInstanceId;
            return this;
        }
        public String getEniInstanceId() {
            return this.eniInstanceId;
        }

        public DescribeInstanceAttributeResponseBodyInstanceAttribute setExpireTime(Long expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public Long getExpireTime() {
            return this.expireTime;
        }

        public DescribeInstanceAttributeResponseBodyInstanceAttribute setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeInstanceAttributeResponseBodyInstanceAttribute setInstanceStatus(String instanceStatus) {
            this.instanceStatus = instanceStatus;
            return this;
        }
        public String getInstanceStatus() {
            return this.instanceStatus;
        }

        public DescribeInstanceAttributeResponseBodyInstanceAttribute setInternetEndpoint(String internetEndpoint) {
            this.internetEndpoint = internetEndpoint;
            return this;
        }
        public String getInternetEndpoint() {
            return this.internetEndpoint;
        }

        public DescribeInstanceAttributeResponseBodyInstanceAttribute setIntranetEndpoint(String intranetEndpoint) {
            this.intranetEndpoint = intranetEndpoint;
            return this;
        }
        public String getIntranetEndpoint() {
            return this.intranetEndpoint;
        }

        public DescribeInstanceAttributeResponseBodyInstanceAttribute setLicenseCode(String licenseCode) {
            this.licenseCode = licenseCode;
            return this;
        }
        public String getLicenseCode() {
            return this.licenseCode;
        }

        public DescribeInstanceAttributeResponseBodyInstanceAttribute setModifyPasswordModule(String modifyPasswordModule) {
            this.modifyPasswordModule = modifyPasswordModule;
            return this;
        }
        public String getModifyPasswordModule() {
            return this.modifyPasswordModule;
        }

        public DescribeInstanceAttributeResponseBodyInstanceAttribute setNetworkProxyModule(String networkProxyModule) {
            this.networkProxyModule = networkProxyModule;
            return this;
        }
        public String getNetworkProxyModule() {
            return this.networkProxyModule;
        }

        public DescribeInstanceAttributeResponseBodyInstanceAttribute setPorts(java.util.List<DescribeInstanceAttributeResponseBodyInstanceAttributePorts> ports) {
            this.ports = ports;
            return this;
        }
        public java.util.List<DescribeInstanceAttributeResponseBodyInstanceAttributePorts> getPorts() {
            return this.ports;
        }

        public DescribeInstanceAttributeResponseBodyInstanceAttribute setPrivateExportIps(java.util.List<String> privateExportIps) {
            this.privateExportIps = privateExportIps;
            return this;
        }
        public java.util.List<String> getPrivateExportIps() {
            return this.privateExportIps;
        }

        public DescribeInstanceAttributeResponseBodyInstanceAttribute setPrivateWhiteList(java.util.List<String> privateWhiteList) {
            this.privateWhiteList = privateWhiteList;
            return this;
        }
        public java.util.List<String> getPrivateWhiteList() {
            return this.privateWhiteList;
        }

        public DescribeInstanceAttributeResponseBodyInstanceAttribute setPublicExportIps(java.util.List<String> publicExportIps) {
            this.publicExportIps = publicExportIps;
            return this;
        }
        public java.util.List<String> getPublicExportIps() {
            return this.publicExportIps;
        }

        public DescribeInstanceAttributeResponseBodyInstanceAttribute setPublicIps(java.util.List<String> publicIps) {
            this.publicIps = publicIps;
            return this;
        }
        public java.util.List<String> getPublicIps() {
            return this.publicIps;
        }

        public DescribeInstanceAttributeResponseBodyInstanceAttribute setPublicNetworkAccess(Boolean publicNetworkAccess) {
            this.publicNetworkAccess = publicNetworkAccess;
            return this;
        }
        public Boolean getPublicNetworkAccess() {
            return this.publicNetworkAccess;
        }

        public DescribeInstanceAttributeResponseBodyInstanceAttribute setPublicWhiteList(java.util.List<String> publicWhiteList) {
            this.publicWhiteList = publicWhiteList;
            return this;
        }
        public java.util.List<String> getPublicWhiteList() {
            return this.publicWhiteList;
        }

        public DescribeInstanceAttributeResponseBodyInstanceAttribute setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeInstanceAttributeResponseBodyInstanceAttribute setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeInstanceAttributeResponseBodyInstanceAttribute setSecurityGroupIds(java.util.List<String> securityGroupIds) {
            this.securityGroupIds = securityGroupIds;
            return this;
        }
        public java.util.List<String> getSecurityGroupIds() {
            return this.securityGroupIds;
        }

        public DescribeInstanceAttributeResponseBodyInstanceAttribute setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public DescribeInstanceAttributeResponseBodyInstanceAttribute setStorage(Long storage) {
            this.storage = storage;
            return this;
        }
        public Long getStorage() {
            return this.storage;
        }

        public DescribeInstanceAttributeResponseBodyInstanceAttribute setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeInstanceAttributeResponseBodyInstanceAttribute setVswitchId(String vswitchId) {
            this.vswitchId = vswitchId;
            return this;
        }
        public String getVswitchId() {
            return this.vswitchId;
        }

        public DescribeInstanceAttributeResponseBodyInstanceAttribute setWebTerminalModule(String webTerminalModule) {
            this.webTerminalModule = webTerminalModule;
            return this;
        }
        public String getWebTerminalModule() {
            return this.webTerminalModule;
        }

    }

}
