// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class CreateExperimentRequest extends TeaModel {
    /**
     * <p>The experiment configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;RankBy&quot;: &quot;Score&quot;}</p>
     */
    @NameInMap("Config")
    public String config;

    /**
     * <p>The ID of the debug crowd. Call the ListCrowds operation to obtain this ID.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("DebugCrowdId")
    public String debugCrowdId;

    /**
     * <p>The UIDs of Alibaba Cloud accounts or RAM users for debugging. Separate multiple UIDs with a comma.</p>
     * 
     * <strong>example:</strong>
     * <p>1124512470******,1124512471******,1124512472******</p>
     */
    @NameInMap("DebugUsers")
    public String debugUsers;

    /**
     * <p>The experiment description.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>This is a test.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The ID of the experiment group. Call the ListExperimentGroups operation to obtain this ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("ExperimentGroupId")
    public String experimentGroupId;

    /**
     * <p>The traffic distribution percentage.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("FlowPercent")
    public Integer flowPercent;

    /**
     * <p>The instance ID. Call the ListInstances operation to obtain this ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pairec-test1</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The experiment name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>experiment_test</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The experiment type. Valid values:<br>● <code>Baseline</code>: Indicates a baseline experiment.<br>● <code>Normal</code>: Indicates a normal experiment.<br><br></p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Baseline</p>
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
