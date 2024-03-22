// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class GetExperimentGroupResponseBody extends TeaModel {
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

    @NameInMap("HoldingBuckets")
    public String holdingBuckets;

    @NameInMap("LaboratoryId")
    public String laboratoryId;

    @NameInMap("LayerId")
    public String layerId;

    @NameInMap("Name")
    public String name;

    @NameInMap("NeedAA")
    public Boolean needAA;

    @NameInMap("Owner")
    public String owner;

    @NameInMap("RandomFlow")
    public Long randomFlow;

    /**
     * <p>Id of the request</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ReservedBuckets")
    public String reservedBuckets;

    @NameInMap("SceneId")
    public String sceneId;

    @NameInMap("Status")
    public String status;

    public static GetExperimentGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetExperimentGroupResponseBody self = new GetExperimentGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public GetExperimentGroupResponseBody setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

    public GetExperimentGroupResponseBody setCrowdId(String crowdId) {
        this.crowdId = crowdId;
        return this;
    }
    public String getCrowdId() {
        return this.crowdId;
    }

    public GetExperimentGroupResponseBody setCrowdTargetType(String crowdTargetType) {
        this.crowdTargetType = crowdTargetType;
        return this;
    }
    public String getCrowdTargetType() {
        return this.crowdTargetType;
    }

    public GetExperimentGroupResponseBody setDebugCrowdId(String debugCrowdId) {
        this.debugCrowdId = debugCrowdId;
        return this;
    }
    public String getDebugCrowdId() {
        return this.debugCrowdId;
    }

    public GetExperimentGroupResponseBody setDebugUsers(String debugUsers) {
        this.debugUsers = debugUsers;
        return this;
    }
    public String getDebugUsers() {
        return this.debugUsers;
    }

    public GetExperimentGroupResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public GetExperimentGroupResponseBody setDistributionTimeDuration(Integer distributionTimeDuration) {
        this.distributionTimeDuration = distributionTimeDuration;
        return this;
    }
    public Integer getDistributionTimeDuration() {
        return this.distributionTimeDuration;
    }

    public GetExperimentGroupResponseBody setDistributionType(String distributionType) {
        this.distributionType = distributionType;
        return this;
    }
    public String getDistributionType() {
        return this.distributionType;
    }

    public GetExperimentGroupResponseBody setFilter(String filter) {
        this.filter = filter;
        return this;
    }
    public String getFilter() {
        return this.filter;
    }

    public GetExperimentGroupResponseBody setHoldingBuckets(String holdingBuckets) {
        this.holdingBuckets = holdingBuckets;
        return this;
    }
    public String getHoldingBuckets() {
        return this.holdingBuckets;
    }

    public GetExperimentGroupResponseBody setLaboratoryId(String laboratoryId) {
        this.laboratoryId = laboratoryId;
        return this;
    }
    public String getLaboratoryId() {
        return this.laboratoryId;
    }

    public GetExperimentGroupResponseBody setLayerId(String layerId) {
        this.layerId = layerId;
        return this;
    }
    public String getLayerId() {
        return this.layerId;
    }

    public GetExperimentGroupResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetExperimentGroupResponseBody setNeedAA(Boolean needAA) {
        this.needAA = needAA;
        return this;
    }
    public Boolean getNeedAA() {
        return this.needAA;
    }

    public GetExperimentGroupResponseBody setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
    }

    public GetExperimentGroupResponseBody setRandomFlow(Long randomFlow) {
        this.randomFlow = randomFlow;
        return this;
    }
    public Long getRandomFlow() {
        return this.randomFlow;
    }

    public GetExperimentGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetExperimentGroupResponseBody setReservedBuckets(String reservedBuckets) {
        this.reservedBuckets = reservedBuckets;
        return this;
    }
    public String getReservedBuckets() {
        return this.reservedBuckets;
    }

    public GetExperimentGroupResponseBody setSceneId(String sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public String getSceneId() {
        return this.sceneId;
    }

    public GetExperimentGroupResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
