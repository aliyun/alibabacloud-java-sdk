// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class DescribeInstanceAttributeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("InstanceAttribute")
    public DescribeInstanceAttributeResponseBodyInstanceAttribute instanceAttribute;

    public static DescribeInstanceAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceAttributeResponseBody self = new DescribeInstanceAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeInstanceAttributeResponseBody setInstanceAttribute(DescribeInstanceAttributeResponseBodyInstanceAttribute instanceAttribute) {
        this.instanceAttribute = instanceAttribute;
        return this;
    }
    public DescribeInstanceAttributeResponseBodyInstanceAttribute getInstanceAttribute() {
        return this.instanceAttribute;
    }

    public static class DescribeInstanceAttributeResponseBodyInstanceAttributePorts extends TeaModel {
        @NameInMap("StandardPort")
        public Integer standardPort;

        @NameInMap("CustomPort")
        public Integer customPort;

        public static DescribeInstanceAttributeResponseBodyInstanceAttributePorts build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceAttributeResponseBodyInstanceAttributePorts self = new DescribeInstanceAttributeResponseBodyInstanceAttributePorts();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceAttributeResponseBodyInstanceAttributePorts setStandardPort(Integer standardPort) {
            this.standardPort = standardPort;
            return this;
        }
        public Integer getStandardPort() {
            return this.standardPort;
        }

        public DescribeInstanceAttributeResponseBodyInstanceAttributePorts setCustomPort(Integer customPort) {
            this.customPort = customPort;
            return this;
        }
        public Integer getCustomPort() {
            return this.customPort;
        }

    }

    public static class DescribeInstanceAttributeResponseBodyInstanceAttribute extends TeaModel {
        @NameInMap("VpcId")
        public String vpcId;

        @NameInMap("VswitchId")
        public String vswitchId;

        @NameInMap("Description")
        public String description;

        @NameInMap("ExpireTime")
        public Long expireTime;

        @NameInMap("ModifyPasswordModule")
        public String modifyPasswordModule;

        @NameInMap("EniInstanceId")
        public String eniInstanceId;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("InternetEndpoint")
        public String internetEndpoint;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("IntranetEndpoint")
        public String intranetEndpoint;

        @NameInMap("StartTime")
        public Long startTime;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        @NameInMap("NetworkProxyModule")
        public String networkProxyModule;

        @NameInMap("WebTerminalModule")
        public String webTerminalModule;

        @NameInMap("InstanceStatus")
        public String instanceStatus;

        @NameInMap("LicenseCode")
        public String licenseCode;

        @NameInMap("PublicNetworkAccess")
        public Boolean publicNetworkAccess;

        @NameInMap("Storage")
        public Long storage;

        @NameInMap("Ports")
        public java.util.List<DescribeInstanceAttributeResponseBodyInstanceAttributePorts> ports;

        @NameInMap("PublicExportIps")
        public java.util.List<String> publicExportIps;

        @NameInMap("PublicWhiteList")
        public java.util.List<String> publicWhiteList;

        @NameInMap("AuthorizedSecurityGroups")
        public java.util.List<String> authorizedSecurityGroups;

        @NameInMap("PrivateExportIps")
        public java.util.List<String> privateExportIps;

        @NameInMap("PublicIps")
        public java.util.List<String> publicIps;

        @NameInMap("SecurityGroupIds")
        public java.util.List<String> securityGroupIds;

        @NameInMap("PrivateWhiteList")
        public java.util.List<String> privateWhiteList;

        public static DescribeInstanceAttributeResponseBodyInstanceAttribute build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceAttributeResponseBodyInstanceAttribute self = new DescribeInstanceAttributeResponseBodyInstanceAttribute();
            return TeaModel.build(map, self);
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

        public DescribeInstanceAttributeResponseBodyInstanceAttribute setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeInstanceAttributeResponseBodyInstanceAttribute setExpireTime(Long expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public Long getExpireTime() {
            return this.expireTime;
        }

        public DescribeInstanceAttributeResponseBodyInstanceAttribute setModifyPasswordModule(String modifyPasswordModule) {
            this.modifyPasswordModule = modifyPasswordModule;
            return this;
        }
        public String getModifyPasswordModule() {
            return this.modifyPasswordModule;
        }

        public DescribeInstanceAttributeResponseBodyInstanceAttribute setEniInstanceId(String eniInstanceId) {
            this.eniInstanceId = eniInstanceId;
            return this;
        }
        public String getEniInstanceId() {
            return this.eniInstanceId;
        }

        public DescribeInstanceAttributeResponseBodyInstanceAttribute setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeInstanceAttributeResponseBodyInstanceAttribute setInternetEndpoint(String internetEndpoint) {
            this.internetEndpoint = internetEndpoint;
            return this;
        }
        public String getInternetEndpoint() {
            return this.internetEndpoint;
        }

        public DescribeInstanceAttributeResponseBodyInstanceAttribute setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeInstanceAttributeResponseBodyInstanceAttribute setIntranetEndpoint(String intranetEndpoint) {
            this.intranetEndpoint = intranetEndpoint;
            return this;
        }
        public String getIntranetEndpoint() {
            return this.intranetEndpoint;
        }

        public DescribeInstanceAttributeResponseBodyInstanceAttribute setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public DescribeInstanceAttributeResponseBodyInstanceAttribute setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeInstanceAttributeResponseBodyInstanceAttribute setNetworkProxyModule(String networkProxyModule) {
            this.networkProxyModule = networkProxyModule;
            return this;
        }
        public String getNetworkProxyModule() {
            return this.networkProxyModule;
        }

        public DescribeInstanceAttributeResponseBodyInstanceAttribute setWebTerminalModule(String webTerminalModule) {
            this.webTerminalModule = webTerminalModule;
            return this;
        }
        public String getWebTerminalModule() {
            return this.webTerminalModule;
        }

        public DescribeInstanceAttributeResponseBodyInstanceAttribute setInstanceStatus(String instanceStatus) {
            this.instanceStatus = instanceStatus;
            return this;
        }
        public String getInstanceStatus() {
            return this.instanceStatus;
        }

        public DescribeInstanceAttributeResponseBodyInstanceAttribute setLicenseCode(String licenseCode) {
            this.licenseCode = licenseCode;
            return this;
        }
        public String getLicenseCode() {
            return this.licenseCode;
        }

        public DescribeInstanceAttributeResponseBodyInstanceAttribute setPublicNetworkAccess(Boolean publicNetworkAccess) {
            this.publicNetworkAccess = publicNetworkAccess;
            return this;
        }
        public Boolean getPublicNetworkAccess() {
            return this.publicNetworkAccess;
        }

        public DescribeInstanceAttributeResponseBodyInstanceAttribute setStorage(Long storage) {
            this.storage = storage;
            return this;
        }
        public Long getStorage() {
            return this.storage;
        }

        public DescribeInstanceAttributeResponseBodyInstanceAttribute setPorts(java.util.List<DescribeInstanceAttributeResponseBodyInstanceAttributePorts> ports) {
            this.ports = ports;
            return this;
        }
        public java.util.List<DescribeInstanceAttributeResponseBodyInstanceAttributePorts> getPorts() {
            return this.ports;
        }

        public DescribeInstanceAttributeResponseBodyInstanceAttribute setPublicExportIps(java.util.List<String> publicExportIps) {
            this.publicExportIps = publicExportIps;
            return this;
        }
        public java.util.List<String> getPublicExportIps() {
            return this.publicExportIps;
        }

        public DescribeInstanceAttributeResponseBodyInstanceAttribute setPublicWhiteList(java.util.List<String> publicWhiteList) {
            this.publicWhiteList = publicWhiteList;
            return this;
        }
        public java.util.List<String> getPublicWhiteList() {
            return this.publicWhiteList;
        }

        public DescribeInstanceAttributeResponseBodyInstanceAttribute setAuthorizedSecurityGroups(java.util.List<String> authorizedSecurityGroups) {
            this.authorizedSecurityGroups = authorizedSecurityGroups;
            return this;
        }
        public java.util.List<String> getAuthorizedSecurityGroups() {
            return this.authorizedSecurityGroups;
        }

        public DescribeInstanceAttributeResponseBodyInstanceAttribute setPrivateExportIps(java.util.List<String> privateExportIps) {
            this.privateExportIps = privateExportIps;
            return this;
        }
        public java.util.List<String> getPrivateExportIps() {
            return this.privateExportIps;
        }

        public DescribeInstanceAttributeResponseBodyInstanceAttribute setPublicIps(java.util.List<String> publicIps) {
            this.publicIps = publicIps;
            return this;
        }
        public java.util.List<String> getPublicIps() {
            return this.publicIps;
        }

        public DescribeInstanceAttributeResponseBodyInstanceAttribute setSecurityGroupIds(java.util.List<String> securityGroupIds) {
            this.securityGroupIds = securityGroupIds;
            return this;
        }
        public java.util.List<String> getSecurityGroupIds() {
            return this.securityGroupIds;
        }

        public DescribeInstanceAttributeResponseBodyInstanceAttribute setPrivateWhiteList(java.util.List<String> privateWhiteList) {
            this.privateWhiteList = privateWhiteList;
            return this;
        }
        public java.util.List<String> getPrivateWhiteList() {
            return this.privateWhiteList;
        }

    }

}
