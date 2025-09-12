// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starrocks20221019.models;

import com.aliyun.tea.*;

public class CreateInstanceV1Request extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>password_example</p>
     */
    @NameInMap("AdminPassword")
    public String adminPassword;

    @NameInMap("AgentNodeGroup")
    public CreateInstanceV1RequestAgentNodeGroup agentNodeGroup;

    @NameInMap("AutoPay")
    public Boolean autoPay;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoRenew")
    public Boolean autoRenew;

    @NameInMap("BackendNodeGroups")
    public java.util.List<CreateInstanceV1RequestBackendNodeGroups> backendNodeGroups;

    /**
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Duration")
    public Integer duration;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Encrypted")
    public Boolean encrypted;

    @NameInMap("FrontendNodeGroups")
    public java.util.List<CreateInstanceV1RequestFrontendNodeGroups> frontendNodeGroups;

    @NameInMap("GatewayType")
    public String gatewayType;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>c1</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <strong>example:</strong>
     * <p>fdsdf****</p>
     */
    @NameInMap("KmsKeyId")
    public String kmsKeyId;

    @NameInMap("ObserverNodeGroups")
    public java.util.List<CreateInstanceV1RequestObserverNodeGroups> observerNodeGroups;

    /**
     * <strong>example:</strong>
     * <p>AliyunEMRStarRocksAccessingOSSRole</p>
     */
    @NameInMap("OssAccessingRoleName")
    public String ossAccessingRoleName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>official</p>
     */
    @NameInMap("PackageType")
    public String packageType;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>prePaid</p>
     */
    @NameInMap("PayType")
    public String payType;

    /**
     * <strong>example:</strong>
     * <p>Month</p>
     */
    @NameInMap("PricingCycle")
    public String pricingCycle;

    /**
     * <strong>example:</strong>
     * <p>165445235634</p>
     */
    @NameInMap("PromotionOptionNo")
    public String promotionOptionNo;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <strong>example:</strong>
     * <p>rg-aekzllkih7jqxxx</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>shared_data</p>
     */
    @NameInMap("RunMode")
    public String runMode;

    @NameInMap("Tags")
    public java.util.List<CreateInstanceV1RequestTags> tags;

    @NameInMap("VSwitches")
    public java.util.List<CreateInstanceV1RequestVSwitches> vSwitches;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("Version")
    public String version;

    /**
     * <p>VPC ID。</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-bp1fll2mci6d7pw8m****</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    /**
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

    public CreateInstanceV1Request setDuration(Integer duration) {
        this.duration = duration;
        return this;
    }
    public Integer getDuration() {
        return this.duration;
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

    public CreateInstanceV1Request setPromotionOptionNo(String promotionOptionNo) {
        this.promotionOptionNo = promotionOptionNo;
        return this;
    }
    public String getPromotionOptionNo() {
        return this.promotionOptionNo;
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
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("cu")
        public Integer cu;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         * 
         * <strong>if can be null:</strong>
         * <p>false</p>
         */
        @NameInMap("diskNumber")
        public Integer diskNumber;

        /**
         * <strong>example:</strong>
         * <p>local_ssd_4_4xlarge</p>
         */
        @NameInMap("localStorageInstanceType")
        public String localStorageInstanceType;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("residentNodeNumber")
        public Integer residentNodeNumber;

        /**
         * <strong>example:</strong>
         * <p>standard</p>
         */
        @NameInMap("specType")
        public String specType;

        /**
         * <strong>example:</strong>
         * <p>pl1</p>
         */
        @NameInMap("storagePerformanceLevel")
        public String storagePerformanceLevel;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("storageSize")
        public Integer storageSize;

        /**
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
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("cu")
        public Integer cu;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("diskNumber")
        public Integer diskNumber;

        /**
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("localStorageInstanceType")
        public String localStorageInstanceType;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("residentNodeNumber")
        public Integer residentNodeNumber;

        /**
         * <strong>example:</strong>
         * <p>standard</p>
         */
        @NameInMap("specType")
        public String specType;

        /**
         * <strong>example:</strong>
         * <p>pl1</p>
         */
        @NameInMap("storagePerformanceLevel")
        public String storagePerformanceLevel;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("storageSize")
        public Integer storageSize;

        /**
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
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("cu")
        public Integer cu;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("diskNumber")
        public Integer diskNumber;

        /**
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("localStorageInstanceType")
        public String localStorageInstanceType;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("residentNodeNumber")
        public Integer residentNodeNumber;

        /**
         * <strong>example:</strong>
         * <p>standard</p>
         */
        @NameInMap("specType")
        public String specType;

        /**
         * <strong>example:</strong>
         * <p>pl1</p>
         */
        @NameInMap("storagePerformanceLevel")
        public String storagePerformanceLevel;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("storageSize")
        public Integer storageSize;

        /**
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
         * <strong>example:</strong>
         * <p>k1</p>
         */
        @NameInMap("Key")
        public String key;

        /**
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-bp19mlh98tm9teyyd****</p>
         */
        @NameInMap("VswId")
        public String vswId;

        /**
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
