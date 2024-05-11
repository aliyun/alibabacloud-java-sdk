// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiabtest20240119.models;

import com.aliyun.tea.*;

public class CreateExperimentVersionRequest extends TeaModel {
    @NameInMap("Config")
    public String config;

    @NameInMap("CrowdIds")
    public String crowdIds;

    @NameInMap("DebugUsers")
    public String debugUsers;

    @NameInMap("Description")
    public String description;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ExperimentId")
    public String experimentId;

    @NameInMap("Flow")
    public Integer flow;

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

    public static CreateExperimentVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateExperimentVersionRequest self = new CreateExperimentVersionRequest();
        return TeaModel.build(map, self);
    }

    public CreateExperimentVersionRequest setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

    public CreateExperimentVersionRequest setCrowdIds(String crowdIds) {
        this.crowdIds = crowdIds;
        return this;
    }
    public String getCrowdIds() {
        return this.crowdIds;
    }

    public CreateExperimentVersionRequest setDebugUsers(String debugUsers) {
        this.debugUsers = debugUsers;
        return this;
    }
    public String getDebugUsers() {
        return this.debugUsers;
    }

    public CreateExperimentVersionRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateExperimentVersionRequest setExperimentId(String experimentId) {
        this.experimentId = experimentId;
        return this;
    }
    public String getExperimentId() {
        return this.experimentId;
    }

    public CreateExperimentVersionRequest setFlow(Integer flow) {
        this.flow = flow;
        return this;
    }
    public Integer getFlow() {
        return this.flow;
    }

    public CreateExperimentVersionRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateExperimentVersionRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
