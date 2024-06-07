// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class CreateExperimentRequest extends TeaModel {
    @NameInMap("Config")
    public String config;

    @NameInMap("DebugCrowdId")
    public String debugCrowdId;

    @NameInMap("DebugUsers")
    public String debugUsers;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ExperimentGroupId")
    public String experimentGroupId;

    @NameInMap("FlowPercent")
    public Integer flowPercent;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Type")
    public String type;

    public static CreateExperimentRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateExperimentRequest self = new CreateExperimentRequest();
        return TeaModel.build(map, self);
    }

    public CreateExperimentRequest setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

    public CreateExperimentRequest setDebugCrowdId(String debugCrowdId) {
        this.debugCrowdId = debugCrowdId;
        return this;
    }
    public String getDebugCrowdId() {
        return this.debugCrowdId;
    }

    public CreateExperimentRequest setDebugUsers(String debugUsers) {
        this.debugUsers = debugUsers;
        return this;
    }
    public String getDebugUsers() {
        return this.debugUsers;
    }

    public CreateExperimentRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateExperimentRequest setExperimentGroupId(String experimentGroupId) {
        this.experimentGroupId = experimentGroupId;
        return this;
    }
    public String getExperimentGroupId() {
        return this.experimentGroupId;
    }

    public CreateExperimentRequest setFlowPercent(Integer flowPercent) {
        this.flowPercent = flowPercent;
        return this;
    }
    public Integer getFlowPercent() {
        return this.flowPercent;
    }

    public CreateExperimentRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateExperimentRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateExperimentRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
