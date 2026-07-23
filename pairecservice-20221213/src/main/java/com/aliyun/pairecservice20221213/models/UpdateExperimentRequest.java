// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class UpdateExperimentRequest extends TeaModel {
    /**
     * <p>The experiment configuration, specified as a JSON string.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;RankBy&quot;: &quot;Score&quot;}</p>
     */
    @NameInMap("Config")
    public String config;

    /**
     * <p>The ID of the debug crowd. To obtain this ID, call the ListCrowds operation.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("DebugCrowdId")
    public String debugCrowdId;

    /**
     * <p>The UIDs for debug users, specified as a comma-separated string. Each UID must belong to an Alibaba Cloud account or RAM user.</p>
     * 
     * <strong>example:</strong>
     * <p>1124512470******,1124512471******,1124512472******</p>
     */
    @NameInMap("DebugUsers")
    public String debugUsers;

    /**
     * <p>The description of the experiment.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>This is a test.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The percentage of traffic to allocate to the experiment.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("FlowPercent")
    public Integer flowPercent;

    /**
     * <p>The ID of the instance. To obtain this ID, call the ListInstances operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pairec-cn-abcdefg1234</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The name of the experiment.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>experiment_test</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The type of the experiment. Valid values: ● Baseline: A baseline experiment. ● Normal: A normal experiment.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Baseline</p>
     */
    @NameInMap("Type")
    public String type;

    public static UpdateExperimentRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateExperimentRequest self = new UpdateExperimentRequest();
        return TeaModel.build(map, self);
    }

    public UpdateExperimentRequest setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

    public UpdateExperimentRequest setDebugCrowdId(String debugCrowdId) {
        this.debugCrowdId = debugCrowdId;
        return this;
    }
    public String getDebugCrowdId() {
        return this.debugCrowdId;
    }

    public UpdateExperimentRequest setDebugUsers(String debugUsers) {
        this.debugUsers = debugUsers;
        return this;
    }
    public String getDebugUsers() {
        return this.debugUsers;
    }

    public UpdateExperimentRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateExperimentRequest setFlowPercent(Integer flowPercent) {
        this.flowPercent = flowPercent;
        return this;
    }
    public Integer getFlowPercent() {
        return this.flowPercent;
    }

    public UpdateExperimentRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateExperimentRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateExperimentRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
