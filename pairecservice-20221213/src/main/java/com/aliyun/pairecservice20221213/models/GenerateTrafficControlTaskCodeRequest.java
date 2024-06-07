// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class GenerateTrafficControlTaskCodeRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    public static GenerateTrafficControlTaskCodeRequest build(java.util.Map<String, ?> map) throws Exception {
        GenerateTrafficControlTaskCodeRequest self = new GenerateTrafficControlTaskCodeRequest();
        return TeaModel.build(map, self);
    }

    public GenerateTrafficControlTaskCodeRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
