// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starrocks20221019.models;

import com.aliyun.tea.*;

public class CreateInstanceV1Request extends TeaModel {
    /**
     * <p>The password of the instance administrator.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>password_example</p>
     */
    @NameInMap("AdminPassword")
    public String adminPassword;

    /**
     * <p>The agent compute group.</p>
     */
    @NameInMap("AgentNodeGroup")
    public CreateInstanceV1RequestAgentNodeGroup agentNodeGroup;

    /**
     * <p>Specifies whether automatic payment is enabled for all products specified in the Products parameter. Valid values:</p>
     * <ul>
     * <li>true: Enables automatic payment.</li>
     * <li>false: Disables automatic payment.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoPay")
    public Boolean autoPay;

    /**
     * <p>Specifies whether to enable auto-renewal. This parameter takes effect only when PayType is set to PrePaid. Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoRenew")
    public Boolean autoRenew;

    /**
     * <p>The information about the BE or CN compute groups.</p>
     */
    @NameInMap("BackendNodeGroups")
    public java.util.List<CreateInstanceV1RequestBackendNodeGroups> backendNodeGroups;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must make sure that the value is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The name of the DLF catalog.</p>
     * 
     * <strong>example:</strong>
     * <p>paimon_test</p>
     */
    @NameInMap("DlfCatalogName")
    public String dlfCatalogName;

    /**
     * <p>The type of the DLF catalog, such as paimon or iceberg.</p>
     * 
     * <strong>example:</strong>
     * <p>paimon</p>
     */
    @NameInMap("DlfCatalogType")
    public String dlfCatalogType;

    /**
     * <p>The subscription duration. This parameter takes effect only when PayType is set to PrePaid.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Duration")
    public Integer duration;

    /**
     * <p>Specifies whether to enable the AI center. Default value: false.</p>
     */
    @NameInMap("EnableAiFunction")
    public Boolean enableAiFunction;

    /**
     * <p>Specifies whether to enable disaster recovery.</p>
     */
    @NameInMap("EnableMultiAz")
    public Boolean enableMultiAz;

    /**
     * <p>Specifies whether to enable encryption.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Encrypted")
    public Boolean encrypted;

    /**
     * <p>The information about the FE node groups.</p>
     */
    @NameInMap("FrontendNodeGroups")
    public java.util.List<CreateInstanceV1RequestFrontendNodeGroups> frontendNodeGroups;

    /**
     * <p>The gateway type. Generally, the value is Slb or Privatezone.</p>
     * 
     * <strong>example:</strong>
     * <p>Traditional\&quot;\&quot;</p>
     */
    @NameInMap("GatewayType")
    public String gatewayType;

    /**
     * <p>The instance name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>c1</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>The KMS key ID.</p>
     * 
     * <strong>example:</strong>
     * <p>fdsdf****</p>
     */
    @NameInMap("KmsKeyId")
    public String kmsKeyId;

    /**
     * <p>The username of the associated Resource Access Management (RAM) user or the name of the RAM role.</p>
     * 
     * <strong>example:</strong>
     * <p>aliyun.test1</p>
     */
    @NameInMap("LinkedRamUserName")
    public String linkedRamUserName;

    /**
     * <p>The information about the Observer compute group. Specify this parameter only when you need to enable multi-zone disaster recovery. The configuration of the Observer compute group must be consistent with the specifications of the FE node group.</p>
     */
    @NameInMap("ObserverNodeGroups")
    public java.util.List<CreateInstanceV1RequestObserverNodeGroups> observerNodeGroups;

    /**
     * <p>The name of the role used for password-free access to OSS.</p>
     * 
     * <strong>example:</strong>
     * <p>AliyunEMRStarRocksAccessingOSSRole</p>
     */
    @NameInMap("OssAccessingRoleName")
    public String ossAccessingRoleName;

    /**
     * <p>The instance edition. Valid values:</p>
     * <ul>
     * <li>trial: Trial Edition.</li>
     * <li>official: Standard Edition.</li>
     * </ul>
     * 
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>official</p>
     */
    @NameInMap("PackageType")
    public String packageType;

    /**
     * <p>The billing method of the instance. Valid values:</p>
     * <ol>
     * <li>prePaid: subscription.</li>
     * <li>postPaid: pay-as-you-go.</li>
     * </ol>
     * 
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>prePaid</p>
     */
    @NameInMap("PayType")
    public String payType;

    /**
     * <p>The unit of the billing cycle. Valid values:</p>
     * <ul>
     * <li>Month</li>
     * <li>Year</li>
     * </ul>
     * This parameter takes effect only when PayType is set to PrePaid.
     * 
     * <strong>example:</strong>
     * <p>Month</p>
     */
    @NameInMap("PricingCycle")
    public String pricingCycle;

    /**
     * <p>The RAM authentication type. A value of RS indicates a Resource Access Management (RAM) user, and a value of RR indicates a RAM role.</p>
     * 
     * <strong>example:</strong>
     * <p>RR</p>
     */
    @NameInMap("PrincipalType")
    public String principalType;

    /**
     * <p>The coupon ID.</p>
     * 
     * <strong>example:</strong>
     * <p>165445235634</p>
     */
    @NameInMap("PromotionOptionNo")
    public String promotionOptionNo;

    /**
     * <p>The ID of the Resource Access Management (RAM) user or RAM role.</p>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("RamUserId")
    public String ramUserId;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-aekzllkih7jqxxx</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The run mode of the cluster. Valid values:</p>
     * <ul>
     * <li>shared_nothing: shared-nothing architecture.</li>
     * <li>shared_data: shared-data architecture.</li>
     * </ul>
     * 
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>shared_data</p>
     */
    @NameInMap("RunMode")
    public String runMode;

    /**
     * <p>The tags of the instance.</p>
     */
    @NameInMap("Tags")
    public java.util.List<CreateInstanceV1RequestTags> tags;

    /**
     * <p>The vSwitch and zone information.</p>
     */
    @NameInMap("VSwitches")
    public java.util.List<CreateInstanceV1RequestVSwitches> vSwitches;

    /**
     * <p>The major version of the instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("Version")
    public String version;

    /**
     * <p>The VPC ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-bp1fll2mci6d7pw8m****</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    /**
     * <p>The primary zone ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-i</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    public static CreateInstanceV1Request build(java.util.Map<String, ?> map) throws Exception {
        CreateInstanceV1Request self = new CreateInstanceV1Request();
        return TeaModel.build(map, self);
    }

    public CreateInstanceV1Request setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword;
        return this;
    }
    public String getAdminPassword() {
        return this.adminPassword;
    }

    public CreateInstanceV1Request setAgentNodeGroup(CreateInstanceV1RequestAgentNodeGroup agentNodeGroup) {
        this.agentNodeGroup = agentNodeGroup;
        return this;
    }
    public CreateInstanceV1RequestAgentNodeGroup getAgentNodeGroup() {
        return this.agentNodeGroup;
    }

    public CreateInstanceV1Request setAutoPay(Boolean autoPay) {
        this.autoPay = autoPay;
        return this;
    }
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    public CreateInstanceV1Request setAutoRenew(Boolean autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }
    public Boolean getAutoRenew() {
        return this.autoRenew;
    }

    public CreateInstanceV1Request setBackendNodeGroups(java.util.List<CreateInstanceV1RequestBackendNodeGroups> backendNodeGroups) {
        this.backendNodeGroups = backendNodeGroups;
        return this;
    }
    public java.util.List<CreateInstanceV1RequestBackendNodeGroups> getBackendNodeGroups() {
        return this.backendNodeGroups;
    }

    public CreateInstanceV1Request setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateInstanceV1Request setDlfCatalogName(String dlfCatalogName) {
        this.dlfCatalogName = dlfCatalogName;
        return this;
    }
    public String getDlfCatalogName() {
        return this.dlfCatalogName;
    }

    public CreateInstanceV1Request setDlfCatalogType(String dlfCatalogType) {
        this.dlfCatalogType = dlfCatalogType;
        return this;
    }
    public String getDlfCatalogType() {
        return this.dlfCatalogType;
    }

    public CreateInstanceV1Request setDuration(Integer duration) {
        this.duration = duration;
        return this;
    }
    public Integer getDuration() {
        return this.duration;
    }

    public CreateInstanceV1Request setEnableAiFunction(Boolean enableAiFunction) {
        this.enableAiFunction = enableAiFunction;
        return this;
    }
    public Boolean getEnableAiFunction() {
        return this.enableAiFunction;
    }

    public CreateInstanceV1Request setEnableMultiAz(Boolean enableMultiAz) {
        this.enableMultiAz = enableMultiAz;
        return this;
    }
    public Boolean getEnableMultiAz() {
        return this.enableMultiAz;
    }

    public CreateInstanceV1Request setEncrypted(Boolean encrypted) {
        this.encrypted = encrypted;
        return this;
    }
    public Boolean getEncrypted() {
        return this.encrypted;
    }

    public CreateInstanceV1Request setFrontendNodeGroups(java.util.List<CreateInstanceV1RequestFrontendNodeGroups> frontendNodeGroups) {
        this.frontendNodeGroups = frontendNodeGroups;
        return this;
    }
    public java.util.List<CreateInstanceV1RequestFrontendNodeGroups> getFrontendNodeGroups() {
        return this.frontendNodeGroups;
    }

    public CreateInstanceV1Request setGatewayType(String gatewayType) {
        this.gatewayType = gatewayType;
        return this;
    }
    public String getGatewayType() {
        return this.gatewayType;
    }

    public CreateInstanceV1Request setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public CreateInstanceV1Request setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
        return this;
    }
    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    public CreateInstanceV1Request setLinkedRamUserName(String linkedRamUserName) {
        this.linkedRamUserName = linkedRamUserName;
        return this;
    }
    public String getLinkedRamUserName() {
        return this.linkedRamUserName;
    }

    public CreateInstanceV1Request setObserverNodeGroups(java.util.List<CreateInstanceV1RequestObserverNodeGroups> observerNodeGroups) {
        this.observerNodeGroups = observerNodeGroups;
        return this;
    }
    public java.util.List<CreateInstanceV1RequestObserverNodeGroups> getObserverNodeGroups() {
        return this.observerNodeGroups;
    }

    public CreateInstanceV1Request setOssAccessingRoleName(String ossAccessingRoleName) {
        this.ossAccessingRoleName = ossAccessingRoleName;
        return this;
    }
    public String getOssAccessingRoleName() {
        return this.ossAccessingRoleName;
    }

    public CreateInstanceV1Request setPackageType(String packageType) {
        this.packageType = packageType;
        return this;
    }
    public String getPackageType() {
        return this.packageType;
    }

    public CreateInstanceV1Request setPayType(String payType) {
        this.payType = payType;
        return this;
    }
    public String getPayType() {
        return this.payType;
    }

    public CreateInstanceV1Request setPricingCycle(String pricingCycle) {
        this.pricingCycle = pricingCycle;
        return this;
    }
    public String getPricingCycle() {
        return this.pricingCycle;
    }

    public CreateInstanceV1Request setPrincipalType(String principalType) {
        this.principalType = principalType;
        return this;
    }
    public String getPrincipalType() {
        return this.principalType;
    }

    public CreateInstanceV1Request setPromotionOptionNo(String promotionOptionNo) {
        this.promotionOptionNo = promotionOptionNo;
        return this;
    }
    public String getPromotionOptionNo() {
        return this.promotionOptionNo;
    }

    public CreateInstanceV1Request setRamUserId(String ramUserId) {
        this.ramUserId = ramUserId;
        return this;
    }
    public String getRamUserId() {
        return this.ramUserId;
    }

    public CreateInstanceV1Request setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateInstanceV1Request setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateInstanceV1Request setRunMode(String runMode) {
        this.runMode = runMode;
        return this;
    }
    public String getRunMode() {
        return this.runMode;
    }

    public CreateInstanceV1Request setTags(java.util.List<CreateInstanceV1RequestTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<CreateInstanceV1RequestTags> getTags() {
        return this.tags;
    }

    public CreateInstanceV1Request setVSwitches(java.util.List<CreateInstanceV1RequestVSwitches> vSwitches) {
        this.vSwitches = vSwitches;
        return this;
    }
    public java.util.List<CreateInstanceV1RequestVSwitches> getVSwitches() {
        return this.vSwitches;
    }

    public CreateInstanceV1Request setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public CreateInstanceV1Request setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public CreateInstanceV1Request setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public static class CreateInstanceV1RequestAgentNodeGroup extends TeaModel {
        /**
         * <p>The number of compute units (CUs). A CU is the basic metering unit of the service. 1 CU equals 1 vCPU and 4 GiB of memory.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("cu")
        public Integer cu;

        public static CreateInstanceV1RequestAgentNodeGroup build(java.util.Map<String, ?> map) throws Exception {
            CreateInstanceV1RequestAgentNodeGroup self = new CreateInstanceV1RequestAgentNodeGroup();
            return TeaModel.build(map, self);
        }

        public CreateInstanceV1RequestAgentNodeGroup setCu(Integer cu) {
            this.cu = cu;
            return this;
        }
        public Integer getCu() {
            return this.cu;
        }

    }

    public static class CreateInstanceV1RequestBackendNodeGroups extends TeaModel {
        /**
         * <p>The number of CUs. A CU (Compute Unit) is the basic metering unit of the service. 1 CU equals 1 vCPU and 4 GiB of memory. If SpecType is set to the memory-enhanced instance family, 1 CU equals 1 vCPU and 8 GiB of memory.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("cu")
        public Integer cu;

        /**
         * <p>The number of disks.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         * 
         * <strong>if can be null:</strong>
         * <p>false</p>
         */
        @NameInMap("diskNumber")
        public Integer diskNumber;

        /**
         * <p>The local SSD instance type of the node group. This parameter is valid only when the instance is based on ECS and SpecType is set to localSSD or bigData.</p>
         * 
         * <strong>example:</strong>
         * <p>local_ssd_4_4xlarge</p>
         */
        @NameInMap("localStorageInstanceType")
        public String localStorageInstanceType;

        /**
         * <p>The number of nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("residentNodeNumber")
        public Integer residentNodeNumber;

        /**
         * <p>The instance family category of the compute group. Valid values:</p>
         * <ul>
         * <li>standard: Standard.</li>
         * <li>localSSD: Local SSD.</li>
         * <li>bigData: Large storage.</li>
         * <li>ramEnhanced: Memory-enhanced instance family.</li>
         * <li>networkEnhanced: Network-enhanced.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>standard</p>
         */
        @NameInMap("specType")
        public String specType;

        /**
         * <p>The performance level (PL) of the cloud disk. Valid values:</p>
         * <ul>
         * <li>pl0: A single disk delivers up to 10,000 random read/write IOPS.</li>
         * <li>pl1: A single disk delivers up to 50,000 random read/write IOPS.</li>
         * <li>pl2: A single disk delivers up to 100,000 random read/write IOPS.</li>
         * <li>pl3: A single disk delivers up to 1,000,000 random read/write IOPS.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>pl1</p>
         */
        @NameInMap("storagePerformanceLevel")
        public String storagePerformanceLevel;

        /**
         * <p>The storage size. Unit: GiB.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("storageSize")
        public Integer storageSize;

        /**
         * <p>The zone ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-i</p>
         */
        @NameInMap("zoneId")
        public String zoneId;

        public static CreateInstanceV1RequestBackendNodeGroups build(java.util.Map<String, ?> map) throws Exception {
            CreateInstanceV1RequestBackendNodeGroups self = new CreateInstanceV1RequestBackendNodeGroups();
            return TeaModel.build(map, self);
        }

        public CreateInstanceV1RequestBackendNodeGroups setCu(Integer cu) {
            this.cu = cu;
            return this;
        }
        public Integer getCu() {
            return this.cu;
        }

        public CreateInstanceV1RequestBackendNodeGroups setDiskNumber(Integer diskNumber) {
            this.diskNumber = diskNumber;
            return this;
        }
        public Integer getDiskNumber() {
            return this.diskNumber;
        }

        public CreateInstanceV1RequestBackendNodeGroups setLocalStorageInstanceType(String localStorageInstanceType) {
            this.localStorageInstanceType = localStorageInstanceType;
            return this;
        }
        public String getLocalStorageInstanceType() {
            return this.localStorageInstanceType;
        }

        public CreateInstanceV1RequestBackendNodeGroups setResidentNodeNumber(Integer residentNodeNumber) {
            this.residentNodeNumber = residentNodeNumber;
            return this;
        }
        public Integer getResidentNodeNumber() {
            return this.residentNodeNumber;
        }

        public CreateInstanceV1RequestBackendNodeGroups setSpecType(String specType) {
            this.specType = specType;
            return this;
        }
        public String getSpecType() {
            return this.specType;
        }

        public CreateInstanceV1RequestBackendNodeGroups setStoragePerformanceLevel(String storagePerformanceLevel) {
            this.storagePerformanceLevel = storagePerformanceLevel;
            return this;
        }
        public String getStoragePerformanceLevel() {
            return this.storagePerformanceLevel;
        }

        public CreateInstanceV1RequestBackendNodeGroups setStorageSize(Integer storageSize) {
            this.storageSize = storageSize;
            return this;
        }
        public Integer getStorageSize() {
            return this.storageSize;
        }

        public CreateInstanceV1RequestBackendNodeGroups setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class CreateInstanceV1RequestFrontendNodeGroups extends TeaModel {
        /**
         * <p>The number of compute units (CUs). A CU is the basic metering unit of the service. 1 CU equals 1 vCPU and 4 GiB of memory.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("cu")
        public Integer cu;

        /**
         * <p>The number of disks.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("diskNumber")
        public Integer diskNumber;

        /**
         * <p>The local SSD instance type. You do not need to set this parameter for FE compute groups.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("localStorageInstanceType")
        public String localStorageInstanceType;

        /**
         * <p>The number of nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("residentNodeNumber")
        public Integer residentNodeNumber;

        /**
         * <p>The specification type of the compute group. Only standard is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>standard</p>
         */
        @NameInMap("specType")
        public String specType;

        /**
         * <p>The performance level (PL) of the cloud disk. Only pl1 is supported, where a single disk delivers up to 50,000 random read/write IOPS.</p>
         * 
         * <strong>example:</strong>
         * <p>pl1</p>
         */
        @NameInMap("storagePerformanceLevel")
        public String storagePerformanceLevel;

        /**
         * <p>The storage size. Unit: GiB.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("storageSize")
        public Integer storageSize;

        /**
         * <p>The zone ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-i</p>
         */
        @NameInMap("zoneId")
        public String zoneId;

        public static CreateInstanceV1RequestFrontendNodeGroups build(java.util.Map<String, ?> map) throws Exception {
            CreateInstanceV1RequestFrontendNodeGroups self = new CreateInstanceV1RequestFrontendNodeGroups();
            return TeaModel.build(map, self);
        }

        public CreateInstanceV1RequestFrontendNodeGroups setCu(Integer cu) {
            this.cu = cu;
            return this;
        }
        public Integer getCu() {
            return this.cu;
        }

        public CreateInstanceV1RequestFrontendNodeGroups setDiskNumber(Integer diskNumber) {
            this.diskNumber = diskNumber;
            return this;
        }
        public Integer getDiskNumber() {
            return this.diskNumber;
        }

        public CreateInstanceV1RequestFrontendNodeGroups setLocalStorageInstanceType(String localStorageInstanceType) {
            this.localStorageInstanceType = localStorageInstanceType;
            return this;
        }
        public String getLocalStorageInstanceType() {
            return this.localStorageInstanceType;
        }

        public CreateInstanceV1RequestFrontendNodeGroups setResidentNodeNumber(Integer residentNodeNumber) {
            this.residentNodeNumber = residentNodeNumber;
            return this;
        }
        public Integer getResidentNodeNumber() {
            return this.residentNodeNumber;
        }

        public CreateInstanceV1RequestFrontendNodeGroups setSpecType(String specType) {
            this.specType = specType;
            return this;
        }
        public String getSpecType() {
            return this.specType;
        }

        public CreateInstanceV1RequestFrontendNodeGroups setStoragePerformanceLevel(String storagePerformanceLevel) {
            this.storagePerformanceLevel = storagePerformanceLevel;
            return this;
        }
        public String getStoragePerformanceLevel() {
            return this.storagePerformanceLevel;
        }

        public CreateInstanceV1RequestFrontendNodeGroups setStorageSize(Integer storageSize) {
            this.storageSize = storageSize;
            return this;
        }
        public Integer getStorageSize() {
            return this.storageSize;
        }

        public CreateInstanceV1RequestFrontendNodeGroups setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class CreateInstanceV1RequestObserverNodeGroups extends TeaModel {
        /**
         * <p>The number of compute units (CUs). A CU is the basic metering unit of the service. 1 CU equals 1 vCPU and 4 GiB of memory.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("cu")
        public Integer cu;

        /**
         * <p>The number of disks.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("diskNumber")
        public Integer diskNumber;

        /**
         * <p>The instance specification for local SSDs. You do not need to specify this parameter for the Observer compute group.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("localStorageInstanceType")
        public String localStorageInstanceType;

        /**
         * <p>The number of nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("residentNodeNumber")
        public Integer residentNodeNumber;

        /**
         * <p>The specification type of the compute group. Only standard is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>standard</p>
         */
        @NameInMap("specType")
        public String specType;

        /**
         * <p>The performance level (PL) of the cloud disk. Only PL1 is supported, which delivers up to 50,000 random read/write IOPS per disk.</p>
         * 
         * <strong>example:</strong>
         * <p>pl1</p>
         */
        @NameInMap("storagePerformanceLevel")
        public String storagePerformanceLevel;

        /**
         * <p>The storage size. Unit: GiB.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("storageSize")
        public Integer storageSize;

        /**
         * <p>The zone ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-i</p>
         */
        @NameInMap("zoneId")
        public String zoneId;

        public static CreateInstanceV1RequestObserverNodeGroups build(java.util.Map<String, ?> map) throws Exception {
            CreateInstanceV1RequestObserverNodeGroups self = new CreateInstanceV1RequestObserverNodeGroups();
            return TeaModel.build(map, self);
        }

        public CreateInstanceV1RequestObserverNodeGroups setCu(Integer cu) {
            this.cu = cu;
            return this;
        }
        public Integer getCu() {
            return this.cu;
        }

        public CreateInstanceV1RequestObserverNodeGroups setDiskNumber(Integer diskNumber) {
            this.diskNumber = diskNumber;
            return this;
        }
        public Integer getDiskNumber() {
            return this.diskNumber;
        }

        public CreateInstanceV1RequestObserverNodeGroups setLocalStorageInstanceType(String localStorageInstanceType) {
            this.localStorageInstanceType = localStorageInstanceType;
            return this;
        }
        public String getLocalStorageInstanceType() {
            return this.localStorageInstanceType;
        }

        public CreateInstanceV1RequestObserverNodeGroups setResidentNodeNumber(Integer residentNodeNumber) {
            this.residentNodeNumber = residentNodeNumber;
            return this;
        }
        public Integer getResidentNodeNumber() {
            return this.residentNodeNumber;
        }

        public CreateInstanceV1RequestObserverNodeGroups setSpecType(String specType) {
            this.specType = specType;
            return this;
        }
        public String getSpecType() {
            return this.specType;
        }

        public CreateInstanceV1RequestObserverNodeGroups setStoragePerformanceLevel(String storagePerformanceLevel) {
            this.storagePerformanceLevel = storagePerformanceLevel;
            return this;
        }
        public String getStoragePerformanceLevel() {
            return this.storagePerformanceLevel;
        }

        public CreateInstanceV1RequestObserverNodeGroups setStorageSize(Integer storageSize) {
            this.storageSize = storageSize;
            return this;
        }
        public Integer getStorageSize() {
            return this.storageSize;
        }

        public CreateInstanceV1RequestObserverNodeGroups setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class CreateInstanceV1RequestTags extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>k1</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>v1</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateInstanceV1RequestTags build(java.util.Map<String, ?> map) throws Exception {
            CreateInstanceV1RequestTags self = new CreateInstanceV1RequestTags();
            return TeaModel.build(map, self);
        }

        public CreateInstanceV1RequestTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateInstanceV1RequestTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateInstanceV1RequestVSwitches extends TeaModel {
        /**
         * <p>The vSwitch ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-bp19mlh98tm9teyyd****</p>
         */
        @NameInMap("VswId")
        public String vswId;

        /**
         * <p>The zone ID of the vSwitch.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-i</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static CreateInstanceV1RequestVSwitches build(java.util.Map<String, ?> map) throws Exception {
            CreateInstanceV1RequestVSwitches self = new CreateInstanceV1RequestVSwitches();
            return TeaModel.build(map, self);
        }

        public CreateInstanceV1RequestVSwitches setVswId(String vswId) {
            this.vswId = vswId;
            return this;
        }
        public String getVswId() {
            return this.vswId;
        }

        public CreateInstanceV1RequestVSwitches setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

}
