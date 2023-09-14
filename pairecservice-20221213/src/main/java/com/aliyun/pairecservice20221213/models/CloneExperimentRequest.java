// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class CloneExperimentRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    public static CloneExperimentRequest build(java.util.Map<String, ?> map) throws Exception {
        CloneExperimentRequest self = new CloneExperimentRequest();
        return TeaModel.build(map, self);
    }

    public CloneExperimentRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
