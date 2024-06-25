// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class UpdateExperimentGroupRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>{&quot;RankBy&quot;: &quot;Score&quot;}</p>
     */
    @NameInMap("Config")
    public String config;

    /**
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("CrowdId")
    public String crowdId;

    @NameInMap("CrowdTargetType")
    public String crowdTargetType;

    /**
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("DebugCrowdId")
    public String debugCrowdId;

    /**
     * <strong>example:</strong>
     * <p>user1,user2,user3</p>
     */
    @NameInMap("DebugUsers")
    public String debugUsers;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>This is a test.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("DistributionTimeDuration")
    public Integer distributionTimeDuration;

    /**
     * <strong>example:</strong>
     * <p>UserId</p>
     */
    @NameInMap("DistributionType")
    public String distributionType;

    /**
     * <strong>example:</strong>
     * <p>gender=male</p>
     */
    @NameInMap("Filter")
    public String filter;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pairec-cn-abcdefg1234</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("LayerId")
    public String layerId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>experiment_group1</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("NeedAA")
    public Boolean needAA;

    @NameInMap("RandomFlow")
    public Long randomFlow;

    /**
     * <strong>example:</strong>
     * <p>1,2,3</p>
     */
    @NameInMap("ReservcedBuckets")
    public String reservcedBuckets;

    public static UpdateExperimentGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateExperimentGroupRequest self = new UpdateExperimentGroupRequest();
        return TeaModel.build(map, self);
    }

    public UpdateExperimentGroupRequest setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

    public UpdateExperimentGroupRequest setCrowdId(String crowdId) {
        this.crowdId = crowdId;
        return this;
    }
    public String getCrowdId() {
        return this.crowdId;
    }

    public UpdateExperimentGroupRequest setCrowdTargetType(String crowdTargetType) {
        this.crowdTargetType = crowdTargetType;
        return this;
    }
    public String getCrowdTargetType() {
        return this.crowdTargetType;
    }

    public UpdateExperimentGroupRequest setDebugCrowdId(String debugCrowdId) {
        this.debugCrowdId = debugCrowdId;
        return this;
    }
    public String getDebugCrowdId() {
        return this.debugCrowdId;
    }

    public UpdateExperimentGroupRequest setDebugUsers(String debugUsers) {
        this.debugUsers = debugUsers;
        return this;
    }
    public String getDebugUsers() {
        return this.debugUsers;
    }

    public UpdateExperimentGroupRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateExperimentGroupRequest setDistributionTimeDuration(Integer distributionTimeDuration) {
        this.distributionTimeDuration = distributionTimeDuration;
        return this;
    }
    public Integer getDistributionTimeDuration() {
        return this.distributionTimeDuration;
    }

    public UpdateExperimentGroupRequest setDistributionType(String distributionType) {
        this.distributionType = distributionType;
        return this;
    }
    public String getDistributionType() {
        return this.distributionType;
    }

    public UpdateExperimentGroupRequest setFilter(String filter) {
        this.filter = filter;
        return this;
    }
    public String getFilter() {
        return this.filter;
    }

    public UpdateExperimentGroupRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateExperimentGroupRequest setLayerId(String layerId) {
        this.layerId = layerId;
        return this;
    }
    public String getLayerId() {
        return this.layerId;
    }

    public UpdateExperimentGroupRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateExperimentGroupRequest setNeedAA(Boolean needAA) {
        this.needAA = needAA;
        return this;
    }
    public Boolean getNeedAA() {
        return this.needAA;
    }

    public UpdateExperimentGroupRequest setRandomFlow(Long randomFlow) {
        this.randomFlow = randomFlow;
        return this;
    }
    public Long getRandomFlow() {
        return this.randomFlow;
    }

    public UpdateExperimentGroupRequest setReservcedBuckets(String reservcedBuckets) {
        this.reservcedBuckets = reservcedBuckets;
        return this;
    }
    public String getReservcedBuckets() {
        return this.reservcedBuckets;
    }

}
