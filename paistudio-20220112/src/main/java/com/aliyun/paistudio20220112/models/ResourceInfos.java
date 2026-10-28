// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class ResourceInfos extends TeaModel {
    /**
     * <p>The cluster ID.</p>
     * 
     * <strong>example:</strong>
     * <p>c1a2b3c4d5e6f7a8b9c0d1e2f3a4b5c6</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The ECS instance type information.</p>
     * 
     * <strong>example:</strong>
     * <p>ecs.gn5-c8g1.2xlarge</p>
     */
    @NameInMap("EcsSpec")
    public String ecsSpec;

    /**
     * <p>The GPU card type.</p>
     */
    @NameInMap("GpuCardType")
    public String gpuCardType;

    /**
     * <p>The machine model.</p>
     */
    @NameInMap("MachineModel")
    public String machineModel;

    /**
     * <p>The maximum quota.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("MaxQuota")
    public Long maxQuota;

    /**
     * <p>The network pod ID.</p>
     */
    @NameInMap("NetworkPodId")
    public String networkPodId;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The used quota.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("UsedQuota")
    public Long usedQuota;

    /**
     * <p>The user ID.</p>
     * 
     * <strong>example:</strong>
     * <p>123456789</p>
     */
    @NameInMap("UserId")
    public String userId;

    /**
     * <p>The username.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
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
