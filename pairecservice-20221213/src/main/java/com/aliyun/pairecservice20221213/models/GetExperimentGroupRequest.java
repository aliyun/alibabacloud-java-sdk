// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class GetExperimentGroupRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    public static GetExperimentGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        GetExperimentGroupRequest self = new GetExperimentGroupRequest();
        return TeaModel.build(map, self);
    }

    public GetExperimentGroupRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
