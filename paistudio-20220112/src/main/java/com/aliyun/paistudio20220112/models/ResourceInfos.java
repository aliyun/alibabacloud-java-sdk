// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class ResourceInfos extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("EcsSpec")
    public String ecsSpec;

    @NameInMap("GpuCardType")
    public String gpuCardType;

    @NameInMap("MachineModel")
    public String machineModel;

    @NameInMap("MaxQuota")
    public Long maxQuota;

    @NameInMap("NetworkPodId")
    public String networkPodId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("UsedQuota")
    public Long usedQuota;

    @NameInMap("UserId")
    public String userId;

    @NameInMap("UserName")
    public String userName;

    public static ResourceInfos build(java.util.Map<String, ?> map) throws Exception {
        ResourceInfos self = new ResourceInfos();
        return TeaModel.build(map, self);
    }

    public ResourceInfos setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ResourceInfos setEcsSpec(String ecsSpec) {
        this.ecsSpec = ecsSpec;
        return this;
    }
    public String getEcsSpec() {
        return this.ecsSpec;
    }

    public ResourceInfos setGpuCardType(String gpuCardType) {
        this.gpuCardType = gpuCardType;
        return this;
    }
    public String getGpuCardType() {
        return this.gpuCardType;
    }

    public ResourceInfos setMachineModel(String machineModel) {
        this.machineModel = machineModel;
        return this;
    }
    public String getMachineModel() {
        return this.machineModel;
    }

    public ResourceInfos setMaxQuota(Long maxQuota) {
        this.maxQuota = maxQuota;
        return this;
    }
    public Long getMaxQuota() {
        return this.maxQuota;
    }

    public ResourceInfos setNetworkPodId(String networkPodId) {
        this.networkPodId = networkPodId;
        return this;
    }
    public String getNetworkPodId() {
        return this.networkPodId;
    }

    public ResourceInfos setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ResourceInfos setUsedQuota(Long usedQuota) {
        this.usedQuota = usedQuota;
        return this;
    }
    public Long getUsedQuota() {
        return this.usedQuota;
    }

    public ResourceInfos setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public ResourceInfos setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

}
