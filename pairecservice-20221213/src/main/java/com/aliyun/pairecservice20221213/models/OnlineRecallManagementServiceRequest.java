// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class OnlineRecallManagementServiceRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    public static OnlineRecallManagementServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        OnlineRecallManagementServiceRequest self = new OnlineRecallManagementServiceRequest();
        return TeaModel.build(map, self);
    }

    public OnlineRecallManagementServiceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
