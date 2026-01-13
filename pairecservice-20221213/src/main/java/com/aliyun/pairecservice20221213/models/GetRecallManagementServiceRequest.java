// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class GetRecallManagementServiceRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    public static GetRecallManagementServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        GetRecallManagementServiceRequest self = new GetRecallManagementServiceRequest();
        return TeaModel.build(map, self);
    }

    public GetRecallManagementServiceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
