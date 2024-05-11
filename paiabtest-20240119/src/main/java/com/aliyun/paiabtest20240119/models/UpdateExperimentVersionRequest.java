// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiabtest20240119.models;

import com.aliyun.tea.*;

public class UpdateExperimentVersionRequest extends TeaModel {
    @NameInMap("Config")
    public String config;

    @NameInMap("CrowdIds")
    public String crowdIds;

    @NameInMap("DebugUsers")
    public String debugUsers;

    @NameInMap("Description")
    public String description;

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

    public static UpdateExperimentVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateExperimentVersionRequest self = new UpdateExperimentVersionRequest();
        return TeaModel.build(map, self);
    }

    public UpdateExperimentVersionRequest setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

    public UpdateExperimentVersionRequest setCrowdIds(String crowdIds) {
        this.crowdIds = crowdIds;
        return this;
    }
    public String getCrowdIds() {
        return this.crowdIds;
    }

    public UpdateExperimentVersionRequest setDebugUsers(String debugUsers) {
        this.debugUsers = debugUsers;
        return this;
    }
    public String getDebugUsers() {
        return this.debugUsers;
    }

    public UpdateExperimentVersionRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateExperimentVersionRequest setFlow(Integer flow) {
        this.flow = flow;
        return this;
    }
    public Integer getFlow() {
        return this.flow;
    }

    public UpdateExperimentVersionRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateExperimentVersionRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
