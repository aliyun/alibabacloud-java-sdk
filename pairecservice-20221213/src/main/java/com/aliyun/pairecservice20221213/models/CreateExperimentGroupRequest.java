// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class CreateExperimentGroupRequest extends TeaModel {
    @NameInMap("Config")
    public String config;

    @NameInMap("CrowdId")
    public String crowdId;

    @NameInMap("CrowdTargetType")
    public String crowdTargetType;

    @NameInMap("DebugCrowdId")
    public String debugCrowdId;

    @NameInMap("DebugUsers")
    public String debugUsers;

    @NameInMap("Description")
    public String description;

    @NameInMap("DistributionTimeDuration")
    public Integer distributionTimeDuration;

    @NameInMap("DistributionType")
    public String distributionType;

    @NameInMap("Filter")
    public String filter;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("LayerId")
    public String layerId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("NeedAA")
    public Boolean needAA;

    @NameInMap("RandomFlow")
    public Long randomFlow;

    @NameInMap("ReservedBuckets")
    public String reservedBuckets;

    public static CreateExperimentGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateExperimentGroupRequest self = new CreateExperimentGroupRequest();
        return TeaModel.build(map, self);
    }

    public CreateExperimentGroupRequest setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

    public CreateExperimentGroupRequest setCrowdId(String crowdId) {
        this.crowdId = crowdId;
        return this;
    }
    public String getCrowdId() {
        return this.crowdId;
    }

    public CreateExperimentGroupRequest setCrowdTargetType(String crowdTargetType) {
        this.crowdTargetType = crowdTargetType;
        return this;
    }
    public String getCrowdTargetType() {
        return this.crowdTargetType;
    }

    public CreateExperimentGroupRequest setDebugCrowdId(String debugCrowdId) {
        this.debugCrowdId = debugCrowdId;
        return this;
    }
    public String getDebugCrowdId() {
        return this.debugCrowdId;
    }

    public CreateExperimentGroupRequest setDebugUsers(String debugUsers) {
        this.debugUsers = debugUsers;
        return this;
    }
    public String getDebugUsers() {
        return this.debugUsers;
    }

    public CreateExperimentGroupRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateExperimentGroupRequest setDistributionTimeDuration(Integer distributionTimeDuration) {
        this.distributionTimeDuration = distributionTimeDuration;
        return this;
    }
    public Integer getDistributionTimeDuration() {
        return this.distributionTimeDuration;
    }

    public CreateExperimentGroupRequest setDistributionType(String distributionType) {
        this.distributionType = distributionType;
        return this;
    }
    public String getDistributionType() {
        return this.distributionType;
    }

    public CreateExperimentGroupRequest setFilter(String filter) {
        this.filter = filter;
        return this;
    }
    public String getFilter() {
        return this.filter;
    }

    public CreateExperimentGroupRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateExperimentGroupRequest setLayerId(String layerId) {
        this.layerId = layerId;
        return this;
    }
    public String getLayerId() {
        return this.layerId;
    }

    public CreateExperimentGroupRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateExperimentGroupRequest setNeedAA(Boolean needAA) {
        this.needAA = needAA;
        return this;
    }
    public Boolean getNeedAA() {
        return this.needAA;
    }

    public CreateExperimentGroupRequest setRandomFlow(Long randomFlow) {
        this.randomFlow = randomFlow;
        return this;
    }
    public Long getRandomFlow() {
        return this.randomFlow;
    }

    public CreateExperimentGroupRequest setReservedBuckets(String reservedBuckets) {
        this.reservedBuckets = reservedBuckets;
        return this;
    }
    public String getReservedBuckets() {
        return this.reservedBuckets;
    }

}
