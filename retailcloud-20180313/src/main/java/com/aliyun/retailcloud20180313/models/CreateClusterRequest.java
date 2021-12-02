// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class CreateClusterRequest extends TeaModel {
    @NameInMap("BusinessCode")
    public String businessCode;

    @NameInMap("CloudMonitorFlags")
    public Integer cloudMonitorFlags;

    @NameInMap("ClusterEnvType")
    public String clusterEnvType;

    @NameInMap("ClusterId")
    public Long clusterId;

    @NameInMap("ClusterTitle")
    public String clusterTitle;

    @NameInMap("ClusterType")
    public String clusterType;

    @NameInMap("CreateWithArmsIntegration")
    public Boolean createWithArmsIntegration;

    @NameInMap("CreateWithLogIntegration")
    public Boolean createWithLogIntegration;

    @NameInMap("KeyPair")
    public String keyPair;

    @NameInMap("NetPlug")
    public String netPlug;

    @NameInMap("Password")
    public String password;

    @NameInMap("PodCIDR")
    public String podCIDR;

    @NameInMap("PrivateZone")
    public Boolean privateZone;

    @NameInMap("PublicSlb")
    public Integer publicSlb;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("RegionName")
    public String regionName;

    @NameInMap("ServiceCIDR")
    public String serviceCIDR;

    @NameInMap("SnatEntry")
    public Integer snatEntry;

    @NameInMap("VpcId")
    public String vpcId;

    @NameInMap("Vswitchids")
    public java.util.List<String> vswitchids;

    public static CreateClusterRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateClusterRequest self = new CreateClusterRequest();
        return TeaModel.build(map, self);
    }

    public CreateClusterRequest setBusinessCode(String businessCode) {
        this.businessCode = businessCode;
        return this;
    }
    public String getBusinessCode() {
        return this.businessCode;
    }

    public CreateClusterRequest setCloudMonitorFlags(Integer cloudMonitorFlags) {
        this.cloudMonitorFlags = cloudMonitorFlags;
        return this;
    }
    public Integer getCloudMonitorFlags() {
        return this.cloudMonitorFlags;
    }

    public CreateClusterRequest setClusterEnvType(String clusterEnvType) {
        this.clusterEnvType = clusterEnvType;
        return this;
    }
    public String getClusterEnvType() {
        return this.clusterEnvType;
    }

    public CreateClusterRequest setClusterId(Long clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public Long getClusterId() {
        return this.clusterId;
    }

    public CreateClusterRequest setClusterTitle(String clusterTitle) {
        this.clusterTitle = clusterTitle;
        return this;
    }
    public String getClusterTitle() {
        return this.clusterTitle;
    }

    public CreateClusterRequest setClusterType(String clusterType) {
        this.clusterType = clusterType;
        return this;
    }
    public String getClusterType() {
        return this.clusterType;
    }

    public CreateClusterRequest setCreateWithArmsIntegration(Boolean createWithArmsIntegration) {
        this.createWithArmsIntegration = createWithArmsIntegration;
        return this;
    }
    public Boolean getCreateWithArmsIntegration() {
        return this.createWithArmsIntegration;
    }

    public CreateClusterRequest setCreateWithLogIntegration(Boolean createWithLogIntegration) {
        this.createWithLogIntegration = createWithLogIntegration;
        return this;
    }
    public Boolean getCreateWithLogIntegration() {
        return this.createWithLogIntegration;
    }

    public CreateClusterRequest setKeyPair(String keyPair) {
        this.keyPair = keyPair;
        return this;
    }
    public String getKeyPair() {
        return this.keyPair;
    }

    public CreateClusterRequest setNetPlug(String netPlug) {
        this.netPlug = netPlug;
        return this;
    }
    public String getNetPlug() {
        return this.netPlug;
    }

    public CreateClusterRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public CreateClusterRequest setPodCIDR(String podCIDR) {
        this.podCIDR = podCIDR;
        return this;
    }
    public String getPodCIDR() {
        return this.podCIDR;
    }

    public CreateClusterRequest setPrivateZone(Boolean privateZone) {
        this.privateZone = privateZone;
        return this;
    }
    public Boolean getPrivateZone() {
        return this.privateZone;
    }

    public CreateClusterRequest setPublicSlb(Integer publicSlb) {
        this.publicSlb = publicSlb;
        return this;
    }
    public Integer getPublicSlb() {
        return this.publicSlb;
    }

    public CreateClusterRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateClusterRequest setRegionName(String regionName) {
        this.regionName = regionName;
        return this;
    }
    public String getRegionName() {
        return this.regionName;
    }

    public CreateClusterRequest setServiceCIDR(String serviceCIDR) {
        this.serviceCIDR = serviceCIDR;
        return this;
    }
    public String getServiceCIDR() {
        return this.serviceCIDR;
    }

    public CreateClusterRequest setSnatEntry(Integer snatEntry) {
        this.snatEntry = snatEntry;
        return this;
    }
    public Integer getSnatEntry() {
        return this.snatEntry;
    }

    public CreateClusterRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public CreateClusterRequest setVswitchids(java.util.List<String> vswitchids) {
        this.vswitchids = vswitchids;
        return this;
    }
    public java.util.List<String> getVswitchids() {
        return this.vswitchids;
    }

}
