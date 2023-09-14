// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class OnlineLaboratoryRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    public static OnlineLaboratoryRequest build(java.util.Map<String, ?> map) throws Exception {
        OnlineLaboratoryRequest self = new OnlineLaboratoryRequest();
        return TeaModel.build(map, self);
    }

    public OnlineLaboratoryRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
