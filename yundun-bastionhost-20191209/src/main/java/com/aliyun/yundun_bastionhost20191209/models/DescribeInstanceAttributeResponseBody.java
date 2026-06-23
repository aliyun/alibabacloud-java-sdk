// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class DescribeInstanceAttributeResponseBody extends TeaModel {
    /**
     * <p>The attributes of the instance.</p>
     */
    @NameInMap("InstanceAttribute")
    public DescribeInstanceAttributeResponseBodyInstanceAttribute instanceAttribute;

    /**
     * <p>The unique ID of the request. You can use this ID to troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>082FAB35-6AB9-4FD5-8750-D36673548E76</p>
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
         * <p>The custom O\&amp;M port.</p>
         * <blockquote>
         * <p>Only SSH and RDP ports can be customized. If no custom port is set, this parameter returns the value of the <code>StandardPort</code> parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>600xx</p>
         */
        @NameInMap("CustomPort")
        public Integer customPort;

        /**
         * <p>The standard O\&amp;M port number. The following are the default standard ports for specific protocols:</p>
         * <ul>
         * <li><p><strong>SSH</strong>: 60022</p>
         * </li>
         * <li><p><strong>RDP</strong>: 63389</p>
         * </li>
         * <li><p><strong>HTTPS</strong>: 443</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>60022</p>
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

    public static class DescribeInstanceAttributeResponseBodyInstanceAttributeWhiteListPolicies extends TeaModel {
        /**
         * <p>The description of the whitelist rule.</p>
         * 
         * <strong>example:</strong>
         * <p>description</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>An IP address or CIDR block in the whitelist.</p>
         * 
         * <strong>example:</strong>
         * <p>94.74.xx.xx/32</p>
         */
        @NameInMap("Entry")
        public String entry;

        public static DescribeInstanceAttributeResponseBodyInstanceAttributeWhiteListPolicies build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceAttributeResponseBodyInstanceAttributeWhiteListPolicies self = new DescribeInstanceAttributeResponseBodyInstanceAttributeWhiteListPolicies();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceAttributeResponseBodyInstanceAttributeWhiteListPolicies setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeInstanceAttributeResponseBodyInstanceAttributeWhiteListPolicies setEntry(String entry) {
            this.entry = entry;
            return this;
        }
        public String getEntry() {
            return this.entry;
        }

    }

    public static class DescribeInstanceAttributeResponseBodyInstanceAttribute extends TeaModel {
        /**
         * <p>Indicates whether the application O\&amp;M module is enabled. Valid values are <code>Enable</code> and <code>Disable</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>Enable</p>
         */
        @NameInMap("AppOperationModule")
        public String appOperationModule;

        /**
         * <p>A list of authorized security group IDs.</p>
         */
        @NameInMap("AuthorizedSecurityGroups")
        public java.util.List<String> authorizedSecurityGroups;

        /**
         * <p>The total bandwidth of the Bastionhost instance, in Mbit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("Bandwidth")
        public String bandwidth;

        /**
         * <p>The extra bandwidth package of the Bastionhost instance, in Mbit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("BandwidthPackage")
        public String bandwidthPackage;

        /**
         * <p>The status of the database O\&amp;M feature.</p>
         * <ul>
         * <li><p><strong>Enable</strong>: The database O\&amp;M feature is enabled.</p>
         * </li>
         * <li><p><strong>Disable</strong>: The database O\&amp;M feature is disabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Disable</p>
         */
        @NameInMap("DbOperationModule")
        public String dbOperationModule;

        /**
         * <p>The description of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>Test API</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The ID of the elastic network interface (ENI).</p>
         * 
         * <strong>example:</strong>
         * <p>eni-bp1455jrzwm7moaxxxxx</p>
         */
        @NameInMap("EniInstanceId")
        public String eniInstanceId;

        /**
         * <p>The expiration timestamp, in milliseconds, of the Bastionhost instance.</p>
         * 
         * <strong>example:</strong>
         * <p>1578326400000</p>
         */
        @NameInMap("ExpireTime")
        public Long expireTime;

        /**
         * <p>Indicates whether the Bastionhost instance is integrated with a Hardware Security Module (HSM).</p>
         */
        @NameInMap("HSMModule")
        public String HSMModule;

        /**
         * <p>Indicates whether the IDaaS integration module is enabled. Valid values are <code>Enable</code> and <code>Disable</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>Enable</p>
         */
        @NameInMap("IDaaSModule")
        public String IDaaSModule;

        /**
         * <p>The ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>bastionhost-cn-78v1ghxxxxx</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The status of the instance. Valid values:</p>
         * <ul>
         * <li><p><strong>PENDING</strong>: The instance is being initialized.</p>
         * </li>
         * <li><p><strong>CREATING</strong>: The instance is being created.</p>
         * </li>
         * <li><p><strong>RUNNING</strong>: The instance is running.</p>
         * </li>
         * <li><p><strong>EXPIRED</strong>: The instance has expired.</p>
         * </li>
         * <li><p><strong>CREATE_FAILED</strong>: Instance creation failed.</p>
         * </li>
         * <li><p><strong>UPGRADING</strong>: The instance is being upgraded.</p>
         * </li>
         * <li><p><strong>UPGRADE_FAILED</strong>: Instance upgrade failed.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        @NameInMap("InstanceStatus")
        public String instanceStatus;

        /**
         * <p>The public domain name of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>******lwb-public.bastionhost.aliyuncs.com</p>
         */
        @NameInMap("InternetEndpoint")
        public String internetEndpoint;

        /**
         * <p>The internal endpoint of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>******xalwb.bastionhost.aliyuncs.com</p>
         */
        @NameInMap("IntranetEndpoint")
        public String intranetEndpoint;

        /**
         * <p>Indicates whether the instance is integrated with Key Management Service (KMS) and Secrets Manager. Valid values are <code>Enable</code> and <code>Disable</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>Enable</p>
         */
        @NameInMap("KmsSecretModule")
        public String kmsSecretModule;

        /**
         * <p>The license code.</p>
         * 
         * <strong>example:</strong>
         * <p>bhah_ent_50_asset</p>
         */
        @NameInMap("LicenseCode")
        public String licenseCode;

        /**
         * <p>The status of the password change feature.</p>
         * <ul>
         * <li><p><strong>Enable</strong>: The feature is enabled.</p>
         * </li>
         * <li><p><strong>Disable</strong>: The feature is disabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Enable</p>
         */
        @NameInMap("ModifyPasswordModule")
        public String modifyPasswordModule;

        /**
         * <p>The status of the network domain proxy feature.</p>
         * <ul>
         * <li><p><strong>Enable</strong>: The network domain proxy feature is enabled.</p>
         * </li>
         * <li><p><strong>Disable</strong>: The network domain proxy feature is disabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Enable</p>
         */
        @NameInMap("NetworkProxyModule")
        public String networkProxyModule;

        /**
         * <p>The O\&amp;M ports of the Bastionhost instance.</p>
         */
        @NameInMap("Ports")
        public java.util.List<DescribeInstanceAttributeResponseBodyInstanceAttributePorts> ports;

        /**
         * <p>A list of private egress IP addresses of the Bastionhost instance.</p>
         */
        @NameInMap("PrivateExportIps")
        public java.util.List<String> privateExportIps;

        /**
         * <p>The private whitelist of the instance.</p>
         */
        @NameInMap("PrivateWhiteList")
        public java.util.List<String> privateWhiteList;

        /**
         * <p>A list of public egress IP addresses of the Bastionhost instance.</p>
         */
        @NameInMap("PublicExportIps")
        public java.util.List<String> publicExportIps;

        /**
         * <p>A list of public IP addresses of the Bastionhost instance.</p>
         */
        @NameInMap("PublicIps")
        public java.util.List<String> publicIps;

        /**
         * <p>Indicates whether the Bastionhost instance is accessible over the public network. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: The Bastionhost instance is accessible over the public network.</p>
         * </li>
         * <li><p><strong>false</strong>: The Bastionhost instance is not accessible over the public network.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("PublicNetworkAccess")
        public Boolean publicNetworkAccess;

        /**
         * <p>The public whitelist of the Bastionhost instance.</p>
         */
        @NameInMap("PublicWhiteList")
        public java.util.List<String> publicWhiteList;

        /**
         * <p>Indicates whether the multi-account module is enabled. Valid values are <code>Enable</code> and <code>Disable</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>Enable</p>
         */
        @NameInMap("RDModule")
        public String RDModule;

        /**
         * <p>The ID of the region where the Bastionhost instance is located.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The ID of the instance\&quot;s resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-aekzc427db******</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>A list of routing rules for the Bastionhost instance.</p>
         */
        @NameInMap("RouterRules")
        public java.util.List<String> routerRules;

        /**
         * <p>Indicates whether the script-based O\&amp;M module is enabled. Valid values are <code>Enable</code> and <code>Disable</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>Enable</p>
         */
        @NameInMap("ScriptDeliverModule")
        public String scriptDeliverModule;

        /**
         * <p>A list of the instance\&quot;s security group IDs.</p>
         */
        @NameInMap("SecurityGroupIds")
        public java.util.List<String> securityGroupIds;

        /**
         * <p>The ID of the standby VSwitch for the Bastionhost instance.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-uf6cmnae7hu5****</p>
         */
        @NameInMap("SlaveVswitchId")
        public String slaveVswitchId;

        /**
         * <p>The timestamp, in milliseconds, when the Bastionhost instance was purchased or renewed.</p>
         * 
         * <strong>example:</strong>
         * <p>1577681345000</p>
         */
        @NameInMap("StartTime")
        public Long startTime;

        /**
         * <p>The total storage capacity of the Bastionhost instance, in bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>2199023255552</p>
         */
        @NameInMap("Storage")
        public Long storage;

        /**
         * <p>The ID of the instance\&quot;s Virtual Private Cloud (VPC).</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-bp1c85tzgqu1bf5bxxxxx</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <p>The ID of the instance\&quot;s VSwitch.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-bp1xfwzzfti0kjbfxxxxx</p>
         */
        @NameInMap("VswitchId")
        public String vswitchId;

        /**
         * <p>The status of the web terminal.</p>
         * <ul>
         * <li><p><strong>Enable</strong>: Supports web-based remote connections.</p>
         * </li>
         * <li><p><strong>Disable</strong>: Does not support web-based remote connections.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Enable</p>
         */
        @NameInMap("WebTerminalModule")
        public String webTerminalModule;

        /**
         * <p>The configured IP address whitelist policies.</p>
         */
        @NameInMap("WhiteListPolicies")
        public java.util.List<DescribeInstanceAttributeResponseBodyInstanceAttributeWhiteListPolicies> whiteListPolicies;

        public static DescribeInstanceAttributeResponseBodyInstanceAttribute build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceAttributeResponseBodyInstanceAttribute self = new DescribeInstanceAttributeResponseBodyInstanceAttribute();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceAttributeResponseBodyInstanceAttribute setAppOperationModule(String appOperationModule) {
            this.appOperationModule = appOperationModule;
            return this;
        }
        public String getAppOperationModule() {
            return this.appOperationModule;
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

        public DescribeInstanceAttributeResponseBodyInstanceAttribute setHSMModule(String HSMModule) {
            this.HSMModule = HSMModule;
            return this;
        }
        public String getHSMModule() {
            return this.HSMModule;
        }

        public DescribeInstanceAttributeResponseBodyInstanceAttribute setIDaaSModule(String IDaaSModule) {
            this.IDaaSModule = IDaaSModule;
            return this;
        }
        public String getIDaaSModule() {
            return this.IDaaSModule;
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

        public DescribeInstanceAttributeResponseBodyInstanceAttribute setKmsSecretModule(String kmsSecretModule) {
            this.kmsSecretModule = kmsSecretModule;
            return this;
        }
        public String getKmsSecretModule() {
            return this.kmsSecretModule;
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

        public DescribeInstanceAttributeResponseBodyInstanceAttribute setRDModule(String RDModule) {
            this.RDModule = RDModule;
            return this;
        }
        public String getRDModule() {
            return this.RDModule;
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

        public DescribeInstanceAttributeResponseBodyInstanceAttribute setRouterRules(java.util.List<String> routerRules) {
            this.routerRules = routerRules;
            return this;
        }
        public java.util.List<String> getRouterRules() {
            return this.routerRules;
        }

        public DescribeInstanceAttributeResponseBodyInstanceAttribute setScriptDeliverModule(String scriptDeliverModule) {
            this.scriptDeliverModule = scriptDeliverModule;
            return this;
        }
        public String getScriptDeliverModule() {
            return this.scriptDeliverModule;
        }

        public DescribeInstanceAttributeResponseBodyInstanceAttribute setSecurityGroupIds(java.util.List<String> securityGroupIds) {
            this.securityGroupIds = securityGroupIds;
            return this;
        }
        public java.util.List<String> getSecurityGroupIds() {
            return this.securityGroupIds;
        }

        public DescribeInstanceAttributeResponseBodyInstanceAttribute setSlaveVswitchId(String slaveVswitchId) {
            this.slaveVswitchId = slaveVswitchId;
            return this;
        }
        public String getSlaveVswitchId() {
            return this.slaveVswitchId;
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

        public DescribeInstanceAttributeResponseBodyInstanceAttribute setWhiteListPolicies(java.util.List<DescribeInstanceAttributeResponseBodyInstanceAttributeWhiteListPolicies> whiteListPolicies) {
            this.whiteListPolicies = whiteListPolicies;
            return this;
        }
        public java.util.List<DescribeInstanceAttributeResponseBodyInstanceAttributeWhiteListPolicies> getWhiteListPolicies() {
            return this.whiteListPolicies;
        }

    }

}
