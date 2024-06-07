// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class CloneLaboratoryRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("CloneExperimentGroup")
    public Boolean cloneExperimentGroup;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Environment")
    public String environment;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static CloneLaboratoryRequest build(java.util.Map<String, ?> map) throws Exception {
        CloneLaboratoryRequest self = new CloneLaboratoryRequest();
        return TeaModel.build(map, self);
    }

    public CloneLaboratoryRequest setCloneExperimentGroup(Boolean cloneExperimentGroup) {
        this.cloneExperimentGroup = cloneExperimentGroup;
        return this;
    }
    public Boolean getCloneExperimentGroup() {
        return this.cloneExperimentGroup;
    }

    public CloneLaboratoryRequest setEnvironment(String environment) {
        this.environment = environment;
        return this;
    }
    public String getEnvironment() {
        return this.environment;
    }

    public CloneLaboratoryRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
