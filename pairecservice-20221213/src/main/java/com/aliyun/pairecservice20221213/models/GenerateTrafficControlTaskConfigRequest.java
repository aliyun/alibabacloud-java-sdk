// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class GenerateTrafficControlTaskConfigRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    public static GenerateTrafficControlTaskConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        GenerateTrafficControlTaskConfigRequest self = new GenerateTrafficControlTaskConfigRequest();
        return TeaModel.build(map, self);
    }

    public GenerateTrafficControlTaskConfigRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
