// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class UpdateExperimentRequest extends TeaModel {
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
