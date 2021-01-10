// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateODPInstancesRequest extends TeaModel {
    @NameInMap("InstanceJsonStr")
    public String instanceJsonStr;

    @NameInMap("InstanceId")
    public String instanceId;

    public static UpdateODPInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateODPInstancesRequest self = new UpdateODPInstancesRequest();
        return TeaModel.build(map, self);
    }

    public UpdateODPInstancesRequest setInstanceJsonStr(String instanceJsonStr) {
        this.instanceJsonStr = instanceJsonStr;
        return this;
    }
    public String getInstanceJsonStr() {
        return this.instanceJsonStr;
    }

    public UpdateODPInstancesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
