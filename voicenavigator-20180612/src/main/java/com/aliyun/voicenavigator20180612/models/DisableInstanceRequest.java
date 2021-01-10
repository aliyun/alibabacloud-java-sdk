// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20180612.models;

import com.aliyun.tea.*;

public class DisableInstanceRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    public static DisableInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        DisableInstanceRequest self = new DisableInstanceRequest();
        return TeaModel.build(map, self);
    }

    public DisableInstanceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
