// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class DeleteExperimentGroupRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    public static DeleteExperimentGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteExperimentGroupRequest self = new DeleteExperimentGroupRequest();
        return TeaModel.build(map, self);
    }

    public DeleteExperimentGroupRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
