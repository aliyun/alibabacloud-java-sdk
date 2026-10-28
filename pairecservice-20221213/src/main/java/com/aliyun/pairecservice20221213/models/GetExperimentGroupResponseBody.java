// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class GetExperimentGroupResponseBody extends TeaModel {
    /**
     * <p>The configuration of the experiment group.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;RankBy&quot;: &quot;Score&quot;}</p>
     */
    @NameInMap("Config")
    public String config;

    /**
     * <p>The ID of the crowd.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("CrowdId")
    public String crowdId;

    /**
     * <p>The type of traffic targeting for the experiment group. Valid values:</p>
     * <ul>
     * <li>All: All traffic.</li>
     * <li>Filter: Traffic that uses filter conditions.</li>
     * <li>CrowdId: Traffic targeted by a specified crowd ID.</li>
     * <li>Random: Random traffic based on a percentage.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>All</p>
     */
    @NameInMap("CrowdTargetType")
    public String crowdTargetType;

    /**
     * <p>The ID of the debug crowd.</p>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("DebugCrowdId")
    public String debugCrowdId;

    /**
     * <p>The debug users. Separate multiple users with commas.</p>
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
     * <p>The time period for traffic distribution.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("DistributionTimeDuration")
    public Integer distributionTimeDuration;

    /**
     * <p>The traffic distribution method. Valid values:</p>
     * <ul>
     * <li>UserId: User ID.</li>
     * <li>TimeDuration: Time period.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>UserId</p>
     */
    @NameInMap("DistributionType")
    public String distributionType;

    /**
     * <p>The filter conditions.</p>
     * 
     * <strong>example:</strong>
     * <p>gender=female</p>
     */
    @NameInMap("Filter")
    public String filter;

    /**
     * <p>The specific bucket numbers returned based on the RandomFlow value when the traffic targeting type is Random.</p>
     * 
     * <strong>example:</strong>
     * <p>1,2,3,4</p>
     */
    @NameInMap("HoldingBuckets")
    public String holdingBuckets;

    /**
     * <p>The ID of the laboratory.</p>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("LaboratoryId")
    public String laboratoryId;

    /**
     * <p>The ID of the layer.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("LayerId")
    public String layerId;

    /**
     * <p>The name of the experiment group.</p>
     * 
     * <strong>example:</strong>
     * <p>experiment_group1</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>Indicates whether an AB experiment group is required.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("NeedAA")
    public Boolean needAA;

    /**
     * <p>The creator.</p>
     * 
     * <strong>example:</strong>
     * <p>1124512470******</p>
     */
    @NameInMap("Owner")
    public String owner;

    /**
     * <p>The percentage of random traffic used to match the experiment group when the traffic targeting type is Random. Valid values: 0 to 100.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("RandomFlow")
    public Long randomFlow;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>BDB621CB-A81E-5D39-8793-39A365CBCC74</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The reserved bucket numbers.</p>
     * 
     * <strong>example:</strong>
     * <p>1,2,3,4</p>
     */
    @NameInMap("ReservedBuckets")
    public String reservedBuckets;

    /**
     * <p>The ID of the scene.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SceneId")
    public String sceneId;

    /**
     * <p>The status of the experiment group. Valid values:</p>
     * <ul>
     * <li>Offline: Not online.</li>
     * <li>Online: Online.</li>
     * <li>Pushed: Fully rolled out.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Offline</p>
     */
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
