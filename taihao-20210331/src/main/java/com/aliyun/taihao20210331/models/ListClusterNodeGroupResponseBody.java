// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class ListClusterNodeGroupResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public Data data;

    @NameInMap("message")
    public String message;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("success")
    public Boolean success;

    public static ListClusterNodeGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListClusterNodeGroupResponseBody self = new ListClusterNodeGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public ListClusterNodeGroupResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListClusterNodeGroupResponseBody setData(Data data) {
        this.data = data;
        return this;
    }
    public Data getData() {
        return this.data;
    }

    public ListClusterNodeGroupResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListClusterNodeGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListClusterNodeGroupResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CostOptimizedConfig extends TeaModel {
        @NameInMap("onDemandBaseCapacity")
        public Integer onDemandBaseCapacity;

        @NameInMap("onDemandPercentageAboveBaseCapacity")
        public Integer onDemandPercentageAboveBaseCapacity;

        @NameInMap("spotInstancePools")
        public Integer spotInstancePools;

        public static CostOptimizedConfig build(java.util.Map<String, ?> map) throws Exception {
            CostOptimizedConfig self = new CostOptimizedConfig();
            return TeaModel.build(map, self);
        }

        public CostOptimizedConfig setOnDemandBaseCapacity(Integer onDemandBaseCapacity) {
            this.onDemandBaseCapacity = onDemandBaseCapacity;
            return this;
        }
        public Integer getOnDemandBaseCapacity() {
            return this.onDemandBaseCapacity;
        }

        public CostOptimizedConfig setOnDemandPercentageAboveBaseCapacity(Integer onDemandPercentageAboveBaseCapacity) {
            this.onDemandPercentageAboveBaseCapacity = onDemandPercentageAboveBaseCapacity;
            return this;
        }
        public Integer getOnDemandPercentageAboveBaseCapacity() {
            return this.onDemandPercentageAboveBaseCapacity;
        }

        public CostOptimizedConfig setSpotInstancePools(Integer spotInstancePools) {
            this.spotInstancePools = spotInstancePools;
            return this;
        }
        public Integer getSpotInstancePools() {
            return this.spotInstancePools;
        }

    }

    public static class Items extends TeaModel {
        @NameInMap("additionalSecurityGroupIds")
        public java.util.List<String> additionalSecurityGroupIds;

        @NameInMap("costOptimizedConfig")
        public CostOptimizedConfig costOptimizedConfig;

        @NameInMap("dataDiskCount")
        public Integer dataDiskCount;

        @NameInMap("dataDiskSize")
        public Integer dataDiskSize;

        @NameInMap("description")
        public String description;

        @NameInMap("enableDecommissionGracefully")
        public Boolean enableDecommissionGracefully;

        @NameInMap("fleetId")
        public String fleetId;

        @NameInMap("imageId")
        public String imageId;

        @NameInMap("instanceTypeList")
        public java.util.List<String> instanceTypeList;

        @NameInMap("keypairName")
        public String keypairName;

        @NameInMap("maxSize")
        public Integer maxSize;

        @NameInMap("minSize")
        public Integer minSize;

        @NameInMap("nodeGroupId")
        public String nodeGroupId;

        @NameInMap("nodeGroupName")
        public String nodeGroupName;

        @NameInMap("nodeGroupType")
        public String nodeGroupType;

        @NameInMap("nodeRamRole")
        public String nodeRamRole;

        @NameInMap("nodeResizeStrategy")
        public String nodeResizeStrategy;

        @NameInMap("paymentType")
        public String paymentType;

        @NameInMap("sataDiskCategory")
        public String sataDiskCategory;

        @NameInMap("scalingPolicyId")
        public String scalingPolicyId;

        @NameInMap("securityGroupId")
        public String securityGroupId;

        @NameInMap("spotInstanceRemedy")
        public Boolean spotInstanceRemedy;

        @NameInMap("spotPriceLimits")
        public java.util.List<Double> spotPriceLimits;

        @NameInMap("spotStrategy")
        public String spotStrategy;

        @NameInMap("systemDiskCategory")
        public String systemDiskCategory;

        @NameInMap("systemDiskSize")
        public Integer systemDiskSize;

        @NameInMap("vswitchId")
        public String vswitchId;

        @NameInMap("withPublicIp")
        public Boolean withPublicIp;

        @NameInMap("zoneId")
        public String zoneId;

        public static Items build(java.util.Map<String, ?> map) throws Exception {
            Items self = new Items();
            return TeaModel.build(map, self);
        }

        public Items setAdditionalSecurityGroupIds(java.util.List<String> additionalSecurityGroupIds) {
            this.additionalSecurityGroupIds = additionalSecurityGroupIds;
            return this;
        }
        public java.util.List<String> getAdditionalSecurityGroupIds() {
            return this.additionalSecurityGroupIds;
        }

        public Items setCostOptimizedConfig(CostOptimizedConfig costOptimizedConfig) {
            this.costOptimizedConfig = costOptimizedConfig;
            return this;
        }
        public CostOptimizedConfig getCostOptimizedConfig() {
            return this.costOptimizedConfig;
        }

        public Items setDataDiskCount(Integer dataDiskCount) {
            this.dataDiskCount = dataDiskCount;
            return this;
        }
        public Integer getDataDiskCount() {
            return this.dataDiskCount;
        }

        public Items setDataDiskSize(Integer dataDiskSize) {
            this.dataDiskSize = dataDiskSize;
            return this;
        }
        public Integer getDataDiskSize() {
            return this.dataDiskSize;
        }

        public Items setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public Items setEnableDecommissionGracefully(Boolean enableDecommissionGracefully) {
            this.enableDecommissionGracefully = enableDecommissionGracefully;
            return this;
        }
        public Boolean getEnableDecommissionGracefully() {
            return this.enableDecommissionGracefully;
        }

        public Items setFleetId(String fleetId) {
            this.fleetId = fleetId;
            return this;
        }
        public String getFleetId() {
            return this.fleetId;
        }

        public Items setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public Items setInstanceTypeList(java.util.List<String> instanceTypeList) {
            this.instanceTypeList = instanceTypeList;
            return this;
        }
        public java.util.List<String> getInstanceTypeList() {
            return this.instanceTypeList;
        }

        public Items setKeypairName(String keypairName) {
            this.keypairName = keypairName;
            return this;
        }
        public String getKeypairName() {
            return this.keypairName;
        }

        public Items setMaxSize(Integer maxSize) {
            this.maxSize = maxSize;
            return this;
        }
        public Integer getMaxSize() {
            return this.maxSize;
        }

        public Items setMinSize(Integer minSize) {
            this.minSize = minSize;
            return this;
        }
        public Integer getMinSize() {
            return this.minSize;
        }

        public Items setNodeGroupId(String nodeGroupId) {
            this.nodeGroupId = nodeGroupId;
            return this;
        }
        public String getNodeGroupId() {
            return this.nodeGroupId;
        }

        public Items setNodeGroupName(String nodeGroupName) {
            this.nodeGroupName = nodeGroupName;
            return this;
        }
        public String getNodeGroupName() {
            return this.nodeGroupName;
        }

        public Items setNodeGroupType(String nodeGroupType) {
            this.nodeGroupType = nodeGroupType;
            return this;
        }
        public String getNodeGroupType() {
            return this.nodeGroupType;
        }

        public Items setNodeRamRole(String nodeRamRole) {
            this.nodeRamRole = nodeRamRole;
            return this;
        }
        public String getNodeRamRole() {
            return this.nodeRamRole;
        }

        public Items setNodeResizeStrategy(String nodeResizeStrategy) {
            this.nodeResizeStrategy = nodeResizeStrategy;
            return this;
        }
        public String getNodeResizeStrategy() {
            return this.nodeResizeStrategy;
        }

        public Items setPaymentType(String paymentType) {
            this.paymentType = paymentType;
            return this;
        }
        public String getPaymentType() {
            return this.paymentType;
        }

        public Items setSataDiskCategory(String sataDiskCategory) {
            this.sataDiskCategory = sataDiskCategory;
            return this;
        }
        public String getSataDiskCategory() {
            return this.sataDiskCategory;
        }

        public Items setScalingPolicyId(String scalingPolicyId) {
            this.scalingPolicyId = scalingPolicyId;
            return this;
        }
        public String getScalingPolicyId() {
            return this.scalingPolicyId;
        }

        public Items setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public Items setSpotInstanceRemedy(Boolean spotInstanceRemedy) {
            this.spotInstanceRemedy = spotInstanceRemedy;
            return this;
        }
        public Boolean getSpotInstanceRemedy() {
            return this.spotInstanceRemedy;
        }

        public Items setSpotPriceLimits(java.util.List<Double> spotPriceLimits) {
            this.spotPriceLimits = spotPriceLimits;
            return this;
        }
        public java.util.List<Double> getSpotPriceLimits() {
            return this.spotPriceLimits;
        }

        public Items setSpotStrategy(String spotStrategy) {
            this.spotStrategy = spotStrategy;
            return this;
        }
        public String getSpotStrategy() {
            return this.spotStrategy;
        }

        public Items setSystemDiskCategory(String systemDiskCategory) {
            this.systemDiskCategory = systemDiskCategory;
            return this;
        }
        public String getSystemDiskCategory() {
            return this.systemDiskCategory;
        }

        public Items setSystemDiskSize(Integer systemDiskSize) {
            this.systemDiskSize = systemDiskSize;
            return this;
        }
        public Integer getSystemDiskSize() {
            return this.systemDiskSize;
        }

        public Items setVswitchId(String vswitchId) {
            this.vswitchId = vswitchId;
            return this;
        }
        public String getVswitchId() {
            return this.vswitchId;
        }

        public Items setWithPublicIp(Boolean withPublicIp) {
            this.withPublicIp = withPublicIp;
            return this;
        }
        public Boolean getWithPublicIp() {
            return this.withPublicIp;
        }

        public Items setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class Data extends TeaModel {
        @NameInMap("items")
        public java.util.List<Items> items;

        @NameInMap("pageNumber")
        public Integer pageNumber;

        @NameInMap("pageSize")
        public Integer pageSize;

        @NameInMap("totalCount")
        public Integer totalCount;

        public static Data build(java.util.Map<String, ?> map) throws Exception {
            Data self = new Data();
            return TeaModel.build(map, self);
        }

        public Data setItems(java.util.List<Items> items) {
            this.items = items;
            return this;
        }
        public java.util.List<Items> getItems() {
            return this.items;
        }

        public Data setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public Data setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public Data setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
