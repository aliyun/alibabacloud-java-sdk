// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class RunRCInstancesRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Amount")
    public Integer amount;

    @NameInMap("AutoPay")
    public Boolean autoPay;

    @NameInMap("AutoRenew")
    public Boolean autoRenew;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("DataDisk")
    public java.util.List<RunRCInstancesRequestDataDisk> dataDisk;

    @NameInMap("DeploymentSetId")
    public String deploymentSetId;

    @NameInMap("Description")
    public String description;

    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("ImageId")
    public String imageId;

    @NameInMap("InstanceChargeType")
    public String instanceChargeType;

    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    @NameInMap("InternetChargeType")
    public String internetChargeType;

    @NameInMap("InternetMaxBandwidthOut")
    public Integer internetMaxBandwidthOut;

    @NameInMap("IoOptimized")
    public String ioOptimized;

    @NameInMap("KeyPairName")
    public String keyPairName;

    @NameInMap("Password")
    public String password;

    @NameInMap("Period")
    public Integer period;

    @NameInMap("PeriodUnit")
    public String periodUnit;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("SecurityEnhancementStrategy")
    public String securityEnhancementStrategy;

    @NameInMap("SecurityGroupId")
    public String securityGroupId;

    @NameInMap("SystemDisk")
    public RunRCInstancesRequestSystemDisk systemDisk;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    @NameInMap("ZoneId")
    public String zoneId;

    public static RunRCInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        RunRCInstancesRequest self = new RunRCInstancesRequest();
        return TeaModel.build(map, self);
    }

    public RunRCInstancesRequest setAmount(Integer amount) {
        this.amount = amount;
        return this;
    }
    public Integer getAmount() {
        return this.amount;
    }

    public RunRCInstancesRequest setAutoPay(Boolean autoPay) {
        this.autoPay = autoPay;
        return this;
    }
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    public RunRCInstancesRequest setAutoRenew(Boolean autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }
    public Boolean getAutoRenew() {
        return this.autoRenew;
    }

    public RunRCInstancesRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public RunRCInstancesRequest setDataDisk(java.util.List<RunRCInstancesRequestDataDisk> dataDisk) {
        this.dataDisk = dataDisk;
        return this;
    }
    public java.util.List<RunRCInstancesRequestDataDisk> getDataDisk() {
        return this.dataDisk;
    }

    public RunRCInstancesRequest setDeploymentSetId(String deploymentSetId) {
        this.deploymentSetId = deploymentSetId;
        return this;
    }
    public String getDeploymentSetId() {
        return this.deploymentSetId;
    }

    public RunRCInstancesRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public RunRCInstancesRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public RunRCInstancesRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public RunRCInstancesRequest setInstanceChargeType(String instanceChargeType) {
        this.instanceChargeType = instanceChargeType;
        return this;
    }
    public String getInstanceChargeType() {
        return this.instanceChargeType;
    }

    public RunRCInstancesRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public RunRCInstancesRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public RunRCInstancesRequest setInternetChargeType(String internetChargeType) {
        this.internetChargeType = internetChargeType;
        return this;
    }
    public String getInternetChargeType() {
        return this.internetChargeType;
    }

    public RunRCInstancesRequest setInternetMaxBandwidthOut(Integer internetMaxBandwidthOut) {
        this.internetMaxBandwidthOut = internetMaxBandwidthOut;
        return this;
    }
    public Integer getInternetMaxBandwidthOut() {
        return this.internetMaxBandwidthOut;
    }

    public RunRCInstancesRequest setIoOptimized(String ioOptimized) {
        this.ioOptimized = ioOptimized;
        return this;
    }
    public String getIoOptimized() {
        return this.ioOptimized;
    }

    public RunRCInstancesRequest setKeyPairName(String keyPairName) {
        this.keyPairName = keyPairName;
        return this;
    }
    public String getKeyPairName() {
        return this.keyPairName;
    }

    public RunRCInstancesRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public RunRCInstancesRequest setPeriod(Integer period) {
        this.period = period;
        return this;
    }
    public Integer getPeriod() {
        return this.period;
    }

    public RunRCInstancesRequest setPeriodUnit(String periodUnit) {
        this.periodUnit = periodUnit;
        return this;
    }
    public String getPeriodUnit() {
        return this.periodUnit;
    }

    public RunRCInstancesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public RunRCInstancesRequest setSecurityEnhancementStrategy(String securityEnhancementStrategy) {
        this.securityEnhancementStrategy = securityEnhancementStrategy;
        return this;
    }
    public String getSecurityEnhancementStrategy() {
        return this.securityEnhancementStrategy;
    }

    public RunRCInstancesRequest setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public RunRCInstancesRequest setSystemDisk(RunRCInstancesRequestSystemDisk systemDisk) {
        this.systemDisk = systemDisk;
        return this;
    }
    public RunRCInstancesRequestSystemDisk getSystemDisk() {
        return this.systemDisk;
    }

    public RunRCInstancesRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public RunRCInstancesRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public static class RunRCInstancesRequestDataDisk extends TeaModel {
        @NameInMap("Category")
        public String category;

        @NameInMap("DeleteWithInstance")
        public Boolean deleteWithInstance;

        @NameInMap("Encrypted")
        public String encrypted;

        @NameInMap("PerformanceLevel")
        public String performanceLevel;

        @NameInMap("Size")
        public Integer size;

        public static RunRCInstancesRequestDataDisk build(java.util.Map<String, ?> map) throws Exception {
            RunRCInstancesRequestDataDisk self = new RunRCInstancesRequestDataDisk();
            return TeaModel.build(map, self);
        }

        public RunRCInstancesRequestDataDisk setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public RunRCInstancesRequestDataDisk setDeleteWithInstance(Boolean deleteWithInstance) {
            this.deleteWithInstance = deleteWithInstance;
            return this;
        }
        public Boolean getDeleteWithInstance() {
            return this.deleteWithInstance;
        }

        public RunRCInstancesRequestDataDisk setEncrypted(String encrypted) {
            this.encrypted = encrypted;
            return this;
        }
        public String getEncrypted() {
            return this.encrypted;
        }

        public RunRCInstancesRequestDataDisk setPerformanceLevel(String performanceLevel) {
            this.performanceLevel = performanceLevel;
            return this;
        }
        public String getPerformanceLevel() {
            return this.performanceLevel;
        }

        public RunRCInstancesRequestDataDisk setSize(Integer size) {
            this.size = size;
            return this;
        }
        public Integer getSize() {
            return this.size;
        }

    }

    public static class RunRCInstancesRequestSystemDisk extends TeaModel {
        @NameInMap("Category")
        public String category;

        @NameInMap("Size")
        public String size;

        public static RunRCInstancesRequestSystemDisk build(java.util.Map<String, ?> map) throws Exception {
            RunRCInstancesRequestSystemDisk self = new RunRCInstancesRequestSystemDisk();
            return TeaModel.build(map, self);
        }

        public RunRCInstancesRequestSystemDisk setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public RunRCInstancesRequestSystemDisk setSize(String size) {
            this.size = size;
            return this;
        }
        public String getSize() {
            return this.size;
        }

    }

}
