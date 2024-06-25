// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class PushAllExperimentRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>pairec-cn-abcdefg1234</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static PushAllExperimentRequest build(java.util.Map<String, ?> map) throws Exception {
        PushAllExperimentRequest self = new PushAllExperimentRequest();
        return TeaModel.build(map, self);
    }

    public PushAllExperimentRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
