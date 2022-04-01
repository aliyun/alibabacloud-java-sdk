// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class NodeGroupParam extends TeaModel {
    // additionalSecurityGroupIds
    @NameInMap("additionalSecurityGroupIds")
    public java.util.List<String> additionalSecurityGroupIds;

    // autoRenew
    @NameInMap("autoRenew")
    public Boolean autoRenew;

    // autoRenewPeriod
    @NameInMap("autoRenewPeriod")
    public Integer autoRenewPeriod;

    // autoRenewPeriodUnit
    @NameInMap("autoRenewPeriodUnit")
    public String autoRenewPeriodUnit;

    // componentTags
    @NameInMap("componentTags")
    public java.util.List<String> componentTags;

    @NameInMap("costOptimizedConfig")
    public CostOptimizedConfig costOptimizedConfig;

    // dataDiskCategory
    @NameInMap("dataDiskCategory")
    public String dataDiskCategory;

    // dataDiskCount
    @NameInMap("dataDiskCount")
    public Integer dataDiskCount;

    // dataDiskSize
    @NameInMap("dataDiskSize")
    public Integer dataDiskSize;

    // description
    @NameInMap("description")
    public String description;

    // enableDecommissionGracefully
    @NameInMap("enableDecommissionGracefully")
    public Boolean enableDecommissionGracefully;

    // imageId
    @NameInMap("imageId")
    public String imageId;

    // instanceTypes
    @NameInMap("instanceTypes")
    public java.util.List<String> instanceTypes;

    // internetChargeType
    @NameInMap("internetChargeType")
    public String internetChargeType;

    // internetMaxBandwidthOut
    @NameInMap("internetMaxBandwidthOut")
    public Integer internetMaxBandwidthOut;

    // keyPairName
    @NameInMap("keyPairName")
    public String keyPairName;

    // maxSize
    @NameInMap("maxSize")
    public Integer maxSize;

    // minSize
    @NameInMap("minSize")
    public Integer minSize;

    // nodeCount
    @NameInMap("nodeCount")
    public Integer nodeCount;

    // nodeGroupName
    @NameInMap("nodeGroupName")
    public String nodeGroupName;

    // nodeGroupRole
    @NameInMap("nodeGroupRole")
    public String nodeGroupRole;

    // nodeRamRole
    @NameInMap("nodeRamRole")
    public String nodeRamRole;

    // nodeResizeStrategy
    @NameInMap("nodeResizeStrategy")
    public String nodeResizeStrategy;

    // password
    @NameInMap("password")
    public String password;

    // paymentType
    @NameInMap("paymentType")
    public String paymentType;

    // period
    @NameInMap("period")
    public Integer period;

    // periodUnit
    @NameInMap("periodUnit")
    public String periodUnit;

    // securityGroupId
    @NameInMap("securityGroupId")
    public String securityGroupId;

    // spotInstanceRemedy
    @NameInMap("spotInstanceRemedy")
    public Boolean spotInstanceRemedy;

    // spotPriceLimits
    @NameInMap("spotPriceLimits")
    public java.util.List<Double> spotPriceLimits;

    // spotStrategy
    @NameInMap("spotStrategy")
    public String spotStrategy;

    // systemDiskCategory
    @NameInMap("systemDiskCategory")
    public String systemDiskCategory;

    // systemDiskSize
    @NameInMap("systemDiskSize")
    public Integer systemDiskSize;

    // tags
    @NameInMap("tags")
    public java.util.List<String> tags;

    // vswitchIds
    @NameInMap("vswitchIds")
    public java.util.List<String> vswitchIds;

    // withPublicIp
    @NameInMap("withPublicIp")
    public Boolean withPublicIp;

    // zoneId
    @NameInMap("zoneId")
    public String zoneId;

    public static NodeGroupParam build(java.util.Map<String, ?> map) throws Exception {
        NodeGroupParam self = new NodeGroupParam();
        return TeaModel.build(map, self);
    }

    public NodeGroupParam setAdditionalSecurityGroupIds(java.util.List<String> additionalSecurityGroupIds) {
        this.additionalSecurityGroupIds = additionalSecurityGroupIds;
        return this;
    }
    public java.util.List<String> getAdditionalSecurityGroupIds() {
        return this.additionalSecurityGroupIds;
    }

    public NodeGroupParam setAutoRenew(Boolean autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }
    public Boolean getAutoRenew() {
        return this.autoRenew;
    }

    public NodeGroupParam setAutoRenewPeriod(Integer autoRenewPeriod) {
        this.autoRenewPeriod = autoRenewPeriod;
        return this;
    }
    public Integer getAutoRenewPeriod() {
        return this.autoRenewPeriod;
    }

    public NodeGroupParam setAutoRenewPeriodUnit(String autoRenewPeriodUnit) {
        this.autoRenewPeriodUnit = autoRenewPeriodUnit;
        return this;
    }
    public String getAutoRenewPeriodUnit() {
        return this.autoRenewPeriodUnit;
    }

    public NodeGroupParam setComponentTags(java.util.List<String> componentTags) {
        this.componentTags = componentTags;
        return this;
    }
    public java.util.List<String> getComponentTags() {
        return this.componentTags;
    }

    public NodeGroupParam setCostOptimizedConfig(CostOptimizedConfig costOptimizedConfig) {
        this.costOptimizedConfig = costOptimizedConfig;
        return this;
    }
    public CostOptimizedConfig getCostOptimizedConfig() {
        return this.costOptimizedConfig;
    }

    public NodeGroupParam setDataDiskCategory(String dataDiskCategory) {
        this.dataDiskCategory = dataDiskCategory;
        return this;
    }
    public String getDataDiskCategory() {
        return this.dataDiskCategory;
    }

    public NodeGroupParam setDataDiskCount(Integer dataDiskCount) {
        this.dataDiskCount = dataDiskCount;
        return this;
    }
    public Integer getDataDiskCount() {
        return this.dataDiskCount;
    }

    public NodeGroupParam setDataDiskSize(Integer dataDiskSize) {
        this.dataDiskSize = dataDiskSize;
        return this;
    }
    public Integer getDataDiskSize() {
        return this.dataDiskSize;
    }

    public NodeGroupParam setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public NodeGroupParam setEnableDecommissionGracefully(Boolean enableDecommissionGracefully) {
        this.enableDecommissionGracefully = enableDecommissionGracefully;
        return this;
    }
    public Boolean getEnableDecommissionGracefully() {
        return this.enableDecommissionGracefully;
    }

    public NodeGroupParam setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public NodeGroupParam setInstanceTypes(java.util.List<String> instanceTypes) {
        this.instanceTypes = instanceTypes;
        return this;
    }
    public java.util.List<String> getInstanceTypes() {
        return this.instanceTypes;
    }

    public NodeGroupParam setInternetChargeType(String internetChargeType) {
        this.internetChargeType = internetChargeType;
        return this;
    }
    public String getInternetChargeType() {
        return this.internetChargeType;
    }

    public NodeGroupParam setInternetMaxBandwidthOut(Integer internetMaxBandwidthOut) {
        this.internetMaxBandwidthOut = internetMaxBandwidthOut;
        return this;
    }
    public Integer getInternetMaxBandwidthOut() {
        return this.internetMaxBandwidthOut;
    }

    public NodeGroupParam setKeyPairName(String keyPairName) {
        this.keyPairName = keyPairName;
        return this;
    }
    public String getKeyPairName() {
        return this.keyPairName;
    }

    public NodeGroupParam setMaxSize(Integer maxSize) {
        this.maxSize = maxSize;
        return this;
    }
    public Integer getMaxSize() {
        return this.maxSize;
    }

    public NodeGroupParam setMinSize(Integer minSize) {
        this.minSize = minSize;
        return this;
    }
    public Integer getMinSize() {
        return this.minSize;
    }

    public NodeGroupParam setNodeCount(Integer nodeCount) {
        this.nodeCount = nodeCount;
        return this;
    }
    public Integer getNodeCount() {
        return this.nodeCount;
    }

    public NodeGroupParam setNodeGroupName(String nodeGroupName) {
        this.nodeGroupName = nodeGroupName;
        return this;
    }
    public String getNodeGroupName() {
        return this.nodeGroupName;
    }

    public NodeGroupParam setNodeGroupRole(String nodeGroupRole) {
        this.nodeGroupRole = nodeGroupRole;
        return this;
    }
    public String getNodeGroupRole() {
        return this.nodeGroupRole;
    }

    public NodeGroupParam setNodeRamRole(String nodeRamRole) {
        this.nodeRamRole = nodeRamRole;
        return this;
    }
    public String getNodeRamRole() {
        return this.nodeRamRole;
    }

    public NodeGroupParam setNodeResizeStrategy(String nodeResizeStrategy) {
        this.nodeResizeStrategy = nodeResizeStrategy;
        return this;
    }
    public String getNodeResizeStrategy() {
        return this.nodeResizeStrategy;
    }

    public NodeGroupParam setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public NodeGroupParam setPaymentType(String paymentType) {
        this.paymentType = paymentType;
        return this;
    }
    public String getPaymentType() {
        return this.paymentType;
    }

    public NodeGroupParam setPeriod(Integer period) {
        this.period = period;
        return this;
    }
    public Integer getPeriod() {
        return this.period;
    }

    public NodeGroupParam setPeriodUnit(String periodUnit) {
        this.periodUnit = periodUnit;
        return this;
    }
    public String getPeriodUnit() {
        return this.periodUnit;
    }

    public NodeGroupParam setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public NodeGroupParam setSpotInstanceRemedy(Boolean spotInstanceRemedy) {
        this.spotInstanceRemedy = spotInstanceRemedy;
        return this;
    }
    public Boolean getSpotInstanceRemedy() {
        return this.spotInstanceRemedy;
    }

    public NodeGroupParam setSpotPriceLimits(java.util.List<Double> spotPriceLimits) {
        this.spotPriceLimits = spotPriceLimits;
        return this;
    }
    public java.util.List<Double> getSpotPriceLimits() {
        return this.spotPriceLimits;
    }

    public NodeGroupParam setSpotStrategy(String spotStrategy) {
        this.spotStrategy = spotStrategy;
        return this;
    }
    public String getSpotStrategy() {
        return this.spotStrategy;
    }

    public NodeGroupParam setSystemDiskCategory(String systemDiskCategory) {
        this.systemDiskCategory = systemDiskCategory;
        return this;
    }
    public String getSystemDiskCategory() {
        return this.systemDiskCategory;
    }

    public NodeGroupParam setSystemDiskSize(Integer systemDiskSize) {
        this.systemDiskSize = systemDiskSize;
        return this;
    }
    public Integer getSystemDiskSize() {
        return this.systemDiskSize;
    }

    public NodeGroupParam setTags(java.util.List<String> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<String> getTags() {
        return this.tags;
    }

    public NodeGroupParam setVswitchIds(java.util.List<String> vswitchIds) {
        this.vswitchIds = vswitchIds;
        return this;
    }
    public java.util.List<String> getVswitchIds() {
        return this.vswitchIds;
    }

    public NodeGroupParam setWithPublicIp(Boolean withPublicIp) {
        this.withPublicIp = withPublicIp;
        return this;
    }
    public Boolean getWithPublicIp() {
        return this.withPublicIp;
    }

    public NodeGroupParam setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

}
