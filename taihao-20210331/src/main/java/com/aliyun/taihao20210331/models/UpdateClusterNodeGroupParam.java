// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class UpdateClusterNodeGroupParam extends TeaModel {
    // securityGroupId
    @NameInMap("additionalSecurityGroupIds")
    public java.util.List<String> additionalSecurityGroupIds;

    // clusterId
    @NameInMap("clusterId")
    public String clusterId;

    @NameInMap("costOptimizedConfig")
    public CostOptimizedConfig costOptimizedConfig;

    // dataDiskCategory
    @NameInMap("dataDiskCategory")
    public String dataDiskCategory;

    // description
    @NameInMap("description")
    public String description;

    // enableDecommissionGracefully
    @NameInMap("enableDecommissionGracefully")
    public Boolean enableDecommissionGracefully;

    // fleetId
    @NameInMap("fleetId")
    public String fleetId;

    // imageId
    @NameInMap("imageId")
    public String imageId;

    // instanceTypeList
    @NameInMap("instanceTypeList")
    public java.util.List<String> instanceTypeList;

    // maxSize
    @NameInMap("maxSize")
    public Integer maxSize;

    // minSize
    @NameInMap("minSize")
    public Integer minSize;

    // nodeGroupId
    @NameInMap("nodeGroupId")
    public String nodeGroupId;

    // nodeName
    @NameInMap("nodeName")
    public String nodeName;

    // nodeResizeStrategy
    @NameInMap("nodeResizeStrategy")
    public String nodeResizeStrategy;

    // spotInstanceRemedy
    @NameInMap("spotInstanceRemedy")
    public Boolean spotInstanceRemedy;

    // systemDiskCategory
    @NameInMap("systemDiskCategory")
    public String systemDiskCategory;

    // vswIdList
    @NameInMap("vswIdList")
    public java.util.List<String> vswIdList;

    // withPublicIp
    @NameInMap("withPublicIp")
    public Boolean withPublicIp;

    // zoneId
    @NameInMap("zoneId")
    public String zoneId;

    public static UpdateClusterNodeGroupParam build(java.util.Map<String, ?> map) throws Exception {
        UpdateClusterNodeGroupParam self = new UpdateClusterNodeGroupParam();
        return TeaModel.build(map, self);
    }

    public UpdateClusterNodeGroupParam setAdditionalSecurityGroupIds(java.util.List<String> additionalSecurityGroupIds) {
        this.additionalSecurityGroupIds = additionalSecurityGroupIds;
        return this;
    }
    public java.util.List<String> getAdditionalSecurityGroupIds() {
        return this.additionalSecurityGroupIds;
    }

    public UpdateClusterNodeGroupParam setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public UpdateClusterNodeGroupParam setCostOptimizedConfig(CostOptimizedConfig costOptimizedConfig) {
        this.costOptimizedConfig = costOptimizedConfig;
        return this;
    }
    public CostOptimizedConfig getCostOptimizedConfig() {
        return this.costOptimizedConfig;
    }

    public UpdateClusterNodeGroupParam setDataDiskCategory(String dataDiskCategory) {
        this.dataDiskCategory = dataDiskCategory;
        return this;
    }
    public String getDataDiskCategory() {
        return this.dataDiskCategory;
    }

    public UpdateClusterNodeGroupParam setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateClusterNodeGroupParam setEnableDecommissionGracefully(Boolean enableDecommissionGracefully) {
        this.enableDecommissionGracefully = enableDecommissionGracefully;
        return this;
    }
    public Boolean getEnableDecommissionGracefully() {
        return this.enableDecommissionGracefully;
    }

    public UpdateClusterNodeGroupParam setFleetId(String fleetId) {
        this.fleetId = fleetId;
        return this;
    }
    public String getFleetId() {
        return this.fleetId;
    }

    public UpdateClusterNodeGroupParam setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public UpdateClusterNodeGroupParam setInstanceTypeList(java.util.List<String> instanceTypeList) {
        this.instanceTypeList = instanceTypeList;
        return this;
    }
    public java.util.List<String> getInstanceTypeList() {
        return this.instanceTypeList;
    }

    public UpdateClusterNodeGroupParam setMaxSize(Integer maxSize) {
        this.maxSize = maxSize;
        return this;
    }
    public Integer getMaxSize() {
        return this.maxSize;
    }

    public UpdateClusterNodeGroupParam setMinSize(Integer minSize) {
        this.minSize = minSize;
        return this;
    }
    public Integer getMinSize() {
        return this.minSize;
    }

    public UpdateClusterNodeGroupParam setNodeGroupId(String nodeGroupId) {
        this.nodeGroupId = nodeGroupId;
        return this;
    }
    public String getNodeGroupId() {
        return this.nodeGroupId;
    }

    public UpdateClusterNodeGroupParam setNodeName(String nodeName) {
        this.nodeName = nodeName;
        return this;
    }
    public String getNodeName() {
        return this.nodeName;
    }

    public UpdateClusterNodeGroupParam setNodeResizeStrategy(String nodeResizeStrategy) {
        this.nodeResizeStrategy = nodeResizeStrategy;
        return this;
    }
    public String getNodeResizeStrategy() {
        return this.nodeResizeStrategy;
    }

    public UpdateClusterNodeGroupParam setSpotInstanceRemedy(Boolean spotInstanceRemedy) {
        this.spotInstanceRemedy = spotInstanceRemedy;
        return this;
    }
    public Boolean getSpotInstanceRemedy() {
        return this.spotInstanceRemedy;
    }

    public UpdateClusterNodeGroupParam setSystemDiskCategory(String systemDiskCategory) {
        this.systemDiskCategory = systemDiskCategory;
        return this;
    }
    public String getSystemDiskCategory() {
        return this.systemDiskCategory;
    }

    public UpdateClusterNodeGroupParam setVswIdList(java.util.List<String> vswIdList) {
        this.vswIdList = vswIdList;
        return this;
    }
    public java.util.List<String> getVswIdList() {
        return this.vswIdList;
    }

    public UpdateClusterNodeGroupParam setWithPublicIp(Boolean withPublicIp) {
        this.withPublicIp = withPublicIp;
        return this;
    }
    public Boolean getWithPublicIp() {
        return this.withPublicIp;
    }

    public UpdateClusterNodeGroupParam setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

}
