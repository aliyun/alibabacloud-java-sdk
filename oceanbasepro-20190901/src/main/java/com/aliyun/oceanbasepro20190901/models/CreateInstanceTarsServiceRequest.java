// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class CreateInstanceTarsServiceRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    public static CreateInstanceTarsServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateInstanceTarsServiceRequest self = new CreateInstanceTarsServiceRequest();
        return TeaModel.build(map, self);
    }

    public CreateInstanceTarsServiceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
