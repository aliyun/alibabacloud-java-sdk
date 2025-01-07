// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeRCNodePoolResponseBody extends TeaModel {
    @NameInMap("NodePoolList")
    public java.util.List<DescribeRCNodePoolResponseBodyNodePoolList> nodePoolList;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeRCNodePoolResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRCNodePoolResponseBody self = new DescribeRCNodePoolResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRCNodePoolResponseBody setNodePoolList(java.util.List<DescribeRCNodePoolResponseBodyNodePoolList> nodePoolList) {
        this.nodePoolList = nodePoolList;
        return this;
    }
    public java.util.List<DescribeRCNodePoolResponseBodyNodePoolList> getNodePoolList() {
        return this.nodePoolList;
    }

    public DescribeRCNodePoolResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeRCNodePoolResponseBodyNodePoolListDataDisk extends TeaModel {
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

        public static DescribeRCNodePoolResponseBodyNodePoolListDataDisk build(java.util.Map<String, ?> map) throws Exception {
            DescribeRCNodePoolResponseBodyNodePoolListDataDisk self = new DescribeRCNodePoolResponseBodyNodePoolListDataDisk();
            return TeaModel.build(map, self);
        }

        public DescribeRCNodePoolResponseBodyNodePoolListDataDisk setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public DescribeRCNodePoolResponseBodyNodePoolListDataDisk setDeleteWithInstance(Boolean deleteWithInstance) {
            this.deleteWithInstance = deleteWithInstance;
            return this;
        }
        public Boolean getDeleteWithInstance() {
            return this.deleteWithInstance;
        }

        public DescribeRCNodePoolResponseBodyNodePoolListDataDisk setEncrypted(String encrypted) {
            this.encrypted = encrypted;
            return this;
        }
        public String getEncrypted() {
            return this.encrypted;
        }

        public DescribeRCNodePoolResponseBodyNodePoolListDataDisk setPerformanceLevel(String performanceLevel) {
            this.performanceLevel = performanceLevel;
            return this;
        }
        public String getPerformanceLevel() {
            return this.performanceLevel;
        }

        public DescribeRCNodePoolResponseBodyNodePoolListDataDisk setSize(Integer size) {
            this.size = size;
            return this;
        }
        public Integer getSize() {
            return this.size;
        }

    }

    public static class DescribeRCNodePoolResponseBodyNodePoolListSystemDisk extends TeaModel {
        @NameInMap("Category")
        public String category;

        @NameInMap("Size")
        public Integer size;

        public static DescribeRCNodePoolResponseBodyNodePoolListSystemDisk build(java.util.Map<String, ?> map) throws Exception {
            DescribeRCNodePoolResponseBodyNodePoolListSystemDisk self = new DescribeRCNodePoolResponseBodyNodePoolListSystemDisk();
            return TeaModel.build(map, self);
        }

        public DescribeRCNodePoolResponseBodyNodePoolListSystemDisk setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public DescribeRCNodePoolResponseBodyNodePoolListSystemDisk setSize(Integer size) {
            this.size = size;
            return this;
        }
        public Integer getSize() {
            return this.size;
        }

    }

    public static class DescribeRCNodePoolResponseBodyNodePoolListTag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static DescribeRCNodePoolResponseBodyNodePoolListTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeRCNodePoolResponseBodyNodePoolListTag self = new DescribeRCNodePoolResponseBodyNodePoolListTag();
            return TeaModel.build(map, self);
        }

        public DescribeRCNodePoolResponseBodyNodePoolListTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeRCNodePoolResponseBodyNodePoolListTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeRCNodePoolResponseBodyNodePoolList extends TeaModel {
        @NameInMap("AutoPay")
        public Boolean autoPay;

        @NameInMap("AutoRenew")
        public Boolean autoRenew;

        @NameInMap("ClusterId")
        public String clusterId;

        @NameInMap("CreateMode")
        public String createMode;

        @NameInMap("DataDisk")
        public java.util.List<DescribeRCNodePoolResponseBodyNodePoolListDataDisk> dataDisk;

        @NameInMap("DeploymentSetId")
        public String deploymentSetId;

        @NameInMap("Description")
        public String description;

        @NameInMap("HostName")
        public String hostName;

        @NameInMap("ImageId")
        public String imageId;

        @NameInMap("InstanceChargeType")
        public String instanceChargeType;

        @NameInMap("InstanceName")
        public String instanceName;

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

        @NameInMap("NodePoolId")
        public String nodePoolId;

        @NameInMap("NodePoolName")
        public String nodePoolName;

        @NameInMap("Password")
        public String password;

        @NameInMap("Period")
        public Integer period;

        @NameInMap("PeriodUnit")
        public String periodUnit;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        @NameInMap("SecurityEnhancementStrategy")
        public String securityEnhancementStrategy;

        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        @NameInMap("SpotStrategy")
        public String spotStrategy;

        @NameInMap("SystemDisk")
        public DescribeRCNodePoolResponseBodyNodePoolListSystemDisk systemDisk;

        @NameInMap("Tag")
        public java.util.List<DescribeRCNodePoolResponseBodyNodePoolListTag> tag;

        @NameInMap("VSwitchId")
        public String vSwitchId;

        @NameInMap("ZoneId")
        public String zoneId;

        public static DescribeRCNodePoolResponseBodyNodePoolList build(java.util.Map<String, ?> map) throws Exception {
            DescribeRCNodePoolResponseBodyNodePoolList self = new DescribeRCNodePoolResponseBodyNodePoolList();
            return TeaModel.build(map, self);
        }

        public DescribeRCNodePoolResponseBodyNodePoolList setAutoPay(Boolean autoPay) {
            this.autoPay = autoPay;
            return this;
        }
        public Boolean getAutoPay() {
            return this.autoPay;
        }

        public DescribeRCNodePoolResponseBodyNodePoolList setAutoRenew(Boolean autoRenew) {
            this.autoRenew = autoRenew;
            return this;
        }
        public Boolean getAutoRenew() {
            return this.autoRenew;
        }

        public DescribeRCNodePoolResponseBodyNodePoolList setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public DescribeRCNodePoolResponseBodyNodePoolList setCreateMode(String createMode) {
            this.createMode = createMode;
            return this;
        }
        public String getCreateMode() {
            return this.createMode;
        }

        public DescribeRCNodePoolResponseBodyNodePoolList setDataDisk(java.util.List<DescribeRCNodePoolResponseBodyNodePoolListDataDisk> dataDisk) {
            this.dataDisk = dataDisk;
            return this;
        }
        public java.util.List<DescribeRCNodePoolResponseBodyNodePoolListDataDisk> getDataDisk() {
            return this.dataDisk;
        }

        public DescribeRCNodePoolResponseBodyNodePoolList setDeploymentSetId(String deploymentSetId) {
            this.deploymentSetId = deploymentSetId;
            return this;
        }
        public String getDeploymentSetId() {
            return this.deploymentSetId;
        }

        public DescribeRCNodePoolResponseBodyNodePoolList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeRCNodePoolResponseBodyNodePoolList setHostName(String hostName) {
            this.hostName = hostName;
            return this;
        }
        public String getHostName() {
            return this.hostName;
        }

        public DescribeRCNodePoolResponseBodyNodePoolList setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public DescribeRCNodePoolResponseBodyNodePoolList setInstanceChargeType(String instanceChargeType) {
            this.instanceChargeType = instanceChargeType;
            return this;
        }
        public String getInstanceChargeType() {
            return this.instanceChargeType;
        }

        public DescribeRCNodePoolResponseBodyNodePoolList setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DescribeRCNodePoolResponseBodyNodePoolList setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public DescribeRCNodePoolResponseBodyNodePoolList setInternetChargeType(String internetChargeType) {
            this.internetChargeType = internetChargeType;
            return this;
        }
        public String getInternetChargeType() {
            return this.internetChargeType;
        }

        public DescribeRCNodePoolResponseBodyNodePoolList setInternetMaxBandwidthOut(Integer internetMaxBandwidthOut) {
            this.internetMaxBandwidthOut = internetMaxBandwidthOut;
            return this;
        }
        public Integer getInternetMaxBandwidthOut() {
            return this.internetMaxBandwidthOut;
        }

        public DescribeRCNodePoolResponseBodyNodePoolList setIoOptimized(String ioOptimized) {
            this.ioOptimized = ioOptimized;
            return this;
        }
        public String getIoOptimized() {
            return this.ioOptimized;
        }

        public DescribeRCNodePoolResponseBodyNodePoolList setKeyPairName(String keyPairName) {
            this.keyPairName = keyPairName;
            return this;
        }
        public String getKeyPairName() {
            return this.keyPairName;
        }

        public DescribeRCNodePoolResponseBodyNodePoolList setNodePoolId(String nodePoolId) {
            this.nodePoolId = nodePoolId;
            return this;
        }
        public String getNodePoolId() {
            return this.nodePoolId;
        }

        public DescribeRCNodePoolResponseBodyNodePoolList setNodePoolName(String nodePoolName) {
            this.nodePoolName = nodePoolName;
            return this;
        }
        public String getNodePoolName() {
            return this.nodePoolName;
        }

        public DescribeRCNodePoolResponseBodyNodePoolList setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public DescribeRCNodePoolResponseBodyNodePoolList setPeriod(Integer period) {
            this.period = period;
            return this;
        }
        public Integer getPeriod() {
            return this.period;
        }

        public DescribeRCNodePoolResponseBodyNodePoolList setPeriodUnit(String periodUnit) {
            this.periodUnit = periodUnit;
            return this;
        }
        public String getPeriodUnit() {
            return this.periodUnit;
        }

        public DescribeRCNodePoolResponseBodyNodePoolList setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeRCNodePoolResponseBodyNodePoolList setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeRCNodePoolResponseBodyNodePoolList setSecurityEnhancementStrategy(String securityEnhancementStrategy) {
            this.securityEnhancementStrategy = securityEnhancementStrategy;
            return this;
        }
        public String getSecurityEnhancementStrategy() {
            return this.securityEnhancementStrategy;
        }

        public DescribeRCNodePoolResponseBodyNodePoolList setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public DescribeRCNodePoolResponseBodyNodePoolList setSpotStrategy(String spotStrategy) {
            this.spotStrategy = spotStrategy;
            return this;
        }
        public String getSpotStrategy() {
            return this.spotStrategy;
        }

        public DescribeRCNodePoolResponseBodyNodePoolList setSystemDisk(DescribeRCNodePoolResponseBodyNodePoolListSystemDisk systemDisk) {
            this.systemDisk = systemDisk;
            return this;
        }
        public DescribeRCNodePoolResponseBodyNodePoolListSystemDisk getSystemDisk() {
            return this.systemDisk;
        }

        public DescribeRCNodePoolResponseBodyNodePoolList setTag(java.util.List<DescribeRCNodePoolResponseBodyNodePoolListTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<DescribeRCNodePoolResponseBodyNodePoolListTag> getTag() {
            return this.tag;
        }

        public DescribeRCNodePoolResponseBodyNodePoolList setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public DescribeRCNodePoolResponseBodyNodePoolList setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

}
