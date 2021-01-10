// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20180612.models;

import com.aliyun.tea.*;

public class EnableInstanceRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    public static EnableInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        EnableInstanceRequest self = new EnableInstanceRequest();
        return TeaModel.build(map, self);
    }

    public EnableInstanceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
