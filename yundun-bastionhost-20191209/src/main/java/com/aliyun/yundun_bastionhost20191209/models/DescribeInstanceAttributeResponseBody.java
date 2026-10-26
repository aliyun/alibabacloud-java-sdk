// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class DescribeInstanceAttributeResponseBody extends TeaModel {
    /**
     * <p>The instance attribute information.</p>
     */
    @NameInMap("InstanceAttribute")
    public DescribeInstanceAttributeResponseBodyInstanceAttribute instanceAttribute;

    /**
     * <p>The request ID.</p>
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
         * <p>The custom port.</p>
         * <blockquote>
         * <p>Only SSH and RDP ports can be modified. If no custom O&amp;M port is specified for the Bastionhost instance, the standard port is returned.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>600xx</p>
         */
        @NameInMap("CustomPort")
        public Integer customPort;

        /**
         * <p>The standard port of the Bastionhost instance. Valid values:</p>
         * <ul>
         * <li><strong>SSH</strong>: 60022</li>
         * <li><strong>RDP</strong>: 63389</li>
         * <li><strong>HTTPS</strong>: 443</li>
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
         * <p>The IP address whitelist to be configured. You can configure up to 50 IP addresses. Separate multiple IP addresses with commas (,).</p>
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
         * <p>The AI credit status (Available/Exhausted).</p>
         * 
         * <strong>example:</strong>
         * <p>Available</p>
         */
        @NameInMap("AiCreditStatus")
        public String aiCreditStatus;

        /**
         * <p>The total number of AI credits in the package.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AiCreditsTotal")
        public Long aiCreditsTotal;

        /**
         * <p>The number of used AI credits in the package.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AiCreditsUs")
        public Long aiCreditsUs;

        /**
         * <p>The AI O&amp;M audit status.</p>
         * 
         * <strong>example:</strong>
         * <p>Disabled</p>
         */
        @NameInMap("AiOpsAuditStatus")
        public String aiOpsAuditStatus;

        /**
         * <p>The switch status of the intelligent O&amp;M module (Enable/Disable).</p>
         * 
         * <strong>example:</strong>
         * <p>Enable</p>
         */
        @NameInMap("AiOpsModule")
        public String aiOpsModule;

        /**
         * <p>The application O&amp;M module. Valid values: Enable and Disable.</p>
         * 
         * <strong>example:</strong>
         * <p>Enable</p>
         */
        @NameInMap("AppOperationModule")
        public String appOperationModule;

        /**
         * <p>The list of authorized security group IDs.</p>
         */
        @NameInMap("AuthorizedSecurityGroups")
        public java.util.List<String> authorizedSecurityGroups;

        /**
         * <p>The total bandwidth of the Bastionhost instance.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("Bandwidth")
        public String bandwidth;

        /**
         * <p>The extended bandwidth plan of the Bastionhost instance.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("BandwidthPackage")
        public String bandwidthPackage;

        /**
         * <p>The database O&amp;M status. Valid values:</p>
         * <ul>
         * <li><strong>Enable</strong>: Database O&amp;M is supported.</li>
         * <li><strong>Disable</strong>: Database O&amp;M is not supported.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Disable</p>
         */
        @NameInMap("DbOperationModule")
        public String dbOperationModule;

        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>Test API</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The ID of the elastic network interface controller (NIC).</p>
         * 
         * <strong>example:</strong>
         * <p>eni-bp1455jrzwm7moaxxxxx</p>
         */
        @NameInMap("EniInstanceId")
        public String eniInstanceId;

        /**
         * <p>The expiration timestamp of the Bastionhost instance. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1578326400000</p>
         */
        @NameInMap("ExpireTime")
        public Long expireTime;

        /**
         * <p>The status of the HSM hardware encryption module. Indicates whether the Bastionhost instance is integrated with an HSM.</p>
         * 
         * <strong>example:</strong>
         * <p>Disable</p>
         */
        @NameInMap("HSMModule")
        public String HSMModule;

        /**
         * <p>The IDaaS integration module. Valid values: Enable and Disable.</p>
         * 
         * <strong>example:</strong>
         * <p>Enable</p>
         */
        @NameInMap("IDaaSModule")
        public String IDaaSModule;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>bastionhost-cn-78v1ghxxxxx</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The instance status. Valid values:</p>
         * <ul>
         * <li><strong>PENDING</strong>: Uninitialized.</li>
         * <li><strong>CREATING</strong>: Creating.</li>
         * <li><strong>RUNNING</strong>: Running.</li>
         * <li><strong>EXPIRED</strong>: Expired.</li>
         * <li><strong>CREATE_FAILED</strong>: Creation failed.</li>
         * <li><strong>UPGRADING</strong>: Upgrading or downgrading.</li>
         * <li><strong>UPGRADE_FAILED</strong>: Upgrade or downgrade failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        @NameInMap("InstanceStatus")
        public String instanceStatus;

        /**
         * <p>The public domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>******lwb-public.bastionhost.aliyuncs.com</p>
         */
        @NameInMap("InternetEndpoint")
        public String internetEndpoint;

        /**
         * <p>The internal domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>******xalwb.bastionhost.aliyuncs.com</p>
         */
        @NameInMap("IntranetEndpoint")
        public String intranetEndpoint;

        /**
         * <p>The KMS Secrets Manager integration module. Valid values: Enable and Disable.</p>
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
         * <p>The status of the password change task feature. Valid values:</p>
         * <ul>
         * <li><strong>Enable</strong>: Enabled.</li>
         * <li><strong>Disable</strong>: Disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Enable</p>
         */
        @NameInMap("ModifyPasswordModule")
        public String modifyPasswordModule;

        /**
         * <p>The network domain proxy status. Valid values:</p>
         * <ul>
         * <li><strong>Enable</strong>: The network domain proxy mode is supported.</li>
         * <li><strong>Disable</strong>: The network domain proxy mode is not supported.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Enable</p>
         */
        @NameInMap("NetworkProxyModule")
        public String networkProxyModule;

        /**
         * <p>The O&amp;M ports of the Bastionhost instance.</p>
         */
        @NameInMap("Ports")
        public java.util.List<DescribeInstanceAttributeResponseBodyInstanceAttributePorts> ports;

        /**
         * <p>The list of internal outbound IP addresses of the Bastionhost instance.</p>
         */
        @NameInMap("PrivateExportIps")
        public java.util.List<String> privateExportIps;

        /**
         * <p>The list of IP addresses in the internal network whitelist.</p>
         */
        @NameInMap("PrivateWhiteList")
        public java.util.List<String> privateWhiteList;

        /**
         * <p>The list of public outbound IP addresses of the Bastionhost instance.</p>
         */
        @NameInMap("PublicExportIps")
        public java.util.List<String> publicExportIps;

        /**
         * <p>The list of public IP addresses of the Bastionhost instance.</p>
         */
        @NameInMap("PublicIps")
        public java.util.List<String> publicIps;

        /**
         * <p>Indicates whether the Bastionhost instance can be accessed over the Internet. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The Bastionhost instance can be accessed over the Internet.</li>
         * <li><strong>false</strong>: The Bastionhost instance cannot be accessed over the Internet.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("PublicNetworkAccess")
        public Boolean publicNetworkAccess;

        /**
         * <p>The list of IP addresses in the public network whitelist of the Bastionhost instance.</p>
         */
        @NameInMap("PublicWhiteList")
        public java.util.List<String> publicWhiteList;

        /**
         * <p>The multi-account module. Valid values: Enable and Disable.</p>
         * 
         * <strong>example:</strong>
         * <p>Enable</p>
         */
        @NameInMap("RDModule")
        public String RDModule;

        /**
         * <p>The region ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The ID of the resource group to which the instance belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-aekzc427db******</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The list of rules for the Bastionhost instance.</p>
         */
        @NameInMap("RouterRules")
        public java.util.List<String> routerRules;

        /**
         * <p>The script O&amp;M module. Valid values: Enable and Disable.</p>
         * 
         * <strong>example:</strong>
         * <p>Enable</p>
         */
        @NameInMap("ScriptDeliverModule")
        public String scriptDeliverModule;

        /**
         * <p>The list of security group IDs to which the instance belongs.</p>
         */
        @NameInMap("SecurityGroupIds")
        public java.util.List<String> securityGroupIds;

        /**
         * <p>The ID of the secondary vSwitch bound to the Bastionhost instance.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-uf6cmnae7hu5****</p>
         */
        @NameInMap("SlaveVswitchId")
        public String slaveVswitchId;

        /**
         * <p>The timestamp when the Bastionhost instance was purchased or renewed. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1577681345000</p>
         */
        @NameInMap("StartTime")
        public Long startTime;

        /**
         * <p>The total purchased storage capacity of the Bastionhost instance. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>2199023255552</p>
         */
        @NameInMap("Storage")
        public Long storage;

        /**
         * <p>The ID of the VPC to which the instance is connected.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-bp1c85tzgqu1bf5bxxxxx</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <p>The ID of the vSwitch to which the instance is connected.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-bp1xfwzzfti0kjbfxxxxx</p>
         */
        @NameInMap("VswitchId")
        public String vswitchId;

        /**
         * <p>The Web Terminal status. Valid values:</p>
         * <ul>
         * <li><strong>Enable</strong>: Web remote connection is supported.</li>
         * <li><strong>Disable</strong>: Web remote connection is not supported.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Enable</p>
         */
        @NameInMap("WebTerminalModule")
        public String webTerminalModule;

        /**
         * <p>The IP address whitelist to be configured.</p>
         */
        @NameInMap("WhiteListPolicies")
        public java.util.List<DescribeInstanceAttributeResponseBodyInstanceAttributeWhiteListPolicies> whiteListPolicies;

        public static DescribeInstanceAttributeResponseBodyInstanceAttribute build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceAttributeResponseBodyInstanceAttribute self = new DescribeInstanceAttributeResponseBodyInstanceAttribute();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceAttributeResponseBodyInstanceAttribute setAiCreditStatus(String aiCreditStatus) {
            this.aiCreditStatus = aiCreditStatus;
            return this;
        }
        public String getAiCreditStatus() {
            return this.aiCreditStatus;
        }

        public DescribeInstanceAttributeResponseBodyInstanceAttribute setAiCreditsTotal(Long aiCreditsTotal) {
            this.aiCreditsTotal = aiCreditsTotal;
            return this;
        }
        public Long getAiCreditsTotal() {
            return this.aiCreditsTotal;
        }

        public DescribeInstanceAttributeResponseBodyInstanceAttribute setAiCreditsUs(Long aiCreditsUs) {
            this.aiCreditsUs = aiCreditsUs;
            return this;
        }
        public Long getAiCreditsUs() {
            return this.aiCreditsUs;
        }

        public DescribeInstanceAttributeResponseBodyInstanceAttribute setAiOpsAuditStatus(String aiOpsAuditStatus) {
            this.aiOpsAuditStatus = aiOpsAuditStatus;
            return this;
        }
        public String getAiOpsAuditStatus() {
            return this.aiOpsAuditStatus;
        }

        public DescribeInstanceAttributeResponseBodyInstanceAttribute setAiOpsModule(String aiOpsModule) {
            this.aiOpsModule = aiOpsModule;
            return this;
        }
        public String getAiOpsModule() {
            return this.aiOpsModule;
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
