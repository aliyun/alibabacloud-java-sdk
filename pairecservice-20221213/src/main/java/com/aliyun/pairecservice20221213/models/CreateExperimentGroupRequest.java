// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class CreateExperimentGroupRequest extends TeaModel {
    /**
     * <p>The configuration of the experiment group.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;RankBy&quot;: &quot;Score&quot;}</p>
     */
    @NameInMap("Config")
    public String config;

    /**
     * <p>The ID of the crowd for crowd targeting. You can obtain this ID by calling the ListCrowds operation.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CrowdId")
    public String crowdId;

    /**
     * <p>The crowd targeting type for the experiment group. Valid values:</p>
     * <ul>
     * <li><p><code>All</code>: All traffic</p>
     * </li>
     * <li><p><code>Filter</code>: Traffic that matches the filter condition</p>
     * </li>
     * <li><p><code>CrowdId</code>: Traffic from a specific crowd</p>
     * </li>
     * <li><p><code>Random</code>: A random percentage of traffic</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>All</p>
     */
    @NameInMap("CrowdTargetType")
    public String crowdTargetType;

    /**
     * <p>The ID of the debug crowd. You can obtain this ID by calling the ListCrowds operation.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("DebugCrowdId")
    public String debugCrowdId;

    /**
     * <p>The UIDs of the debug users. The value must be the UID of an Alibaba Cloud account or a RAM user. Separate multiple UIDs with a comma.</p>
     * 
     * <strong>example:</strong>
     * <p>1124512470******,1124512471******,1124512472******</p>
     */
    @NameInMap("DebugUsers")
    public String debugUsers;

    /**
     * <p>The description of the experiment group.</p>
     * 
     * <strong>example:</strong>
     * <p>This is a test.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The time duration for traffic distribution.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("DistributionTimeDuration")
    public Integer distributionTimeDuration;

    /**
     * <p>The distribution type. Valid values: <code>UserId</code> (by user ID) and <code>TimeDuration</code> (by time duration).</p>
     * 
     * <strong>example:</strong>
     * <p>UserId</p>
     */
    @NameInMap("DistributionType")
    public String distributionType;

    /**
     * <p>The filter condition for crowd targeting.</p>
     * 
     * <strong>example:</strong>
     * <p>gender=male</p>
     */
    @NameInMap("Filter")
    public String filter;

    /**
     * <p>The instance ID. You can obtain this ID by calling the ListInstances operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pairec-test1</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The ID of the layer. You can obtain this ID by calling the ListLayers operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("LayerId")
    public String layerId;

    /**
     * <p>The name of the experiment group.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>experiment_group_test</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>Specifies whether to create an A/A experiment group.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("NeedAA")
    public Boolean needAA;

    /**
     * <p>The percentage of traffic to randomly allocate to this experiment group. This parameter is used only when <code>CrowdTargetType</code> is set to <code>Random</code>. Valid values: 0 to 100.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("RandomFlow")
    public Long randomFlow;

    /**
     * <p>A comma-separated list of reserved bucket numbers.</p>
     * 
     * <strong>example:</strong>
     * <p>1,2,3</p>
     */
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
