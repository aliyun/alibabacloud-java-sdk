// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class DescribeInstanceAttributeResponseBody extends TeaModel {
    /**
     * <p>The attribute information about the bastion host.</p>
     */
    @NameInMap("InstanceAttribute")
    public DescribeInstanceAttributeResponseBodyInstanceAttribute instanceAttribute;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     */
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
         * <p>> : You can change only the SSH and RDP ports. If O\&M ports are not specified, the value of the StandardPort parameter is returned.</p>
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
        /**
         * <p>An array that consists of the IDs of authorized security groups.</p>
         */
        @NameInMap("AuthorizedSecurityGroups")
        public java.util.List<String> authorizedSecurityGroups;

        /**
         * <p>The status of the database O\&M feature.</p>
         */
        @NameInMap("DbOperationModule")
        public String dbOperationModule;

        /**
         * <p>The remarks of the bastion host.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The ID of the elastic network interface (ENI).</p>
         */
        @NameInMap("EniInstanceId")
        public String eniInstanceId;

        /**
         * <p>The time when the bastion host expires.</p>
         */
        @NameInMap("ExpireTime")
        public Long expireTime;

        /**
         * <p>The ID of the bastion host.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The status of the bastion host. Valid values:</p>
         * <br>
         * <p>*   **PENDING**: The bastion host is not initialized.</p>
         * <p>*   **CREATING**: The bastion host is being created.</p>
         * <p>*   **RUNNING**: The bastion host is running.</p>
         * <p>*   **EXPIRED**: The bastion host expired.</p>
         * <p>*   **CREATE_FAILED**: The bastion host fails to be created.</p>
         * <p>*   **UPGRADING**: The configurations of the bastion host are being changed.</p>
         * <p>*   **UPGRADE_FAILED**: The configurations of the bastion host fail to be changed.</p>
         */
        @NameInMap("InstanceStatus")
        public String instanceStatus;

        /**
         * <p>The public endpoint of the bastion host.</p>
         */
        @NameInMap("InternetEndpoint")
        public String internetEndpoint;

        /**
         * <p>The internal endpoint of the bastion host.</p>
         */
        @NameInMap("IntranetEndpoint")
        public String intranetEndpoint;

        /**
         * <p>The license code.</p>
         */
        @NameInMap("LicenseCode")
        public String licenseCode;

        /**
         * <p>The status of the automatic password change feature.</p>
         * <br>
         * <p>*   **Enable**</p>
         * <p>*   **Disable**</p>
         */
        @NameInMap("ModifyPasswordModule")
        public String modifyPasswordModule;

        /**
         * <p>The status of the network domain feature.</p>
         * <br>
         * <p>*   **Enable**</p>
         * <p>*   **Disable**</p>
         */
        @NameInMap("NetworkProxyModule")
        public String networkProxyModule;

        /**
         * <p>An array that consists of the O\&M ports of the bastion host.</p>
         */
        @NameInMap("Ports")
        public java.util.List<DescribeInstanceAttributeResponseBodyInstanceAttributePorts> ports;

        /**
         * <p>An array that consists of the egress private IP addresses of the bastion host.</p>
         */
        @NameInMap("PrivateExportIps")
        public java.util.List<String> privateExportIps;

        /**
         * <p>An array that consists of private IP addresses in a whitelist for the bastion host.</p>
         */
        @NameInMap("PrivateWhiteList")
        public java.util.List<String> privateWhiteList;

        /**
         * <p>An array that consists of the egress public IP addresses of the bastion host.</p>
         */
        @NameInMap("PublicExportIps")
        public java.util.List<String> publicExportIps;

        /**
         * <p>An array that consists of the public IP addresses of the bastion host.</p>
         */
        @NameInMap("PublicIps")
        public java.util.List<String> publicIps;

        /**
         * <p>Indicates whether the bastion host can be accessed over the Internet.</p>
         */
        @NameInMap("PublicNetworkAccess")
        public Boolean publicNetworkAccess;

        /**
         * <p>An array that consists of public IP addresses in a whitelist for the bastion host.</p>
         */
        @NameInMap("PublicWhiteList")
        public java.util.List<String> publicWhiteList;

        /**
         * <p>The ID of the region in which the bastion host resides.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The ID of the resource group to which the bastion host belongs.</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>An array that consists of the IDs of the security groups to which the bastion host belongs.</p>
         */
        @NameInMap("SecurityGroupIds")
        public java.util.List<String> securityGroupIds;

        /**
         * <p>The time when the bastion host was purchased.</p>
         */
        @NameInMap("StartTime")
        public Long startTime;

        /**
         * <p>The storage capacity of the bastion host.</p>
         */
        @NameInMap("Storage")
        public Long storage;

        /**
         * <p>The ID of the virtual private cloud (VPC) to which the bastion host belongs.</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <p>The ID of the vSwitch to which the bastion host belongs.</p>
         */
        @NameInMap("VswitchId")
        public String vswitchId;

        /**
         * <p>The status of the web terminal.</p>
         * <br>
         * <p>*   **Enable**</p>
         * <p>*   **Disable**</p>
         */
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
