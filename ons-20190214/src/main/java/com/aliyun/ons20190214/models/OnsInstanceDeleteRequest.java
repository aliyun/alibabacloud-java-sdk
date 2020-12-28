// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsInstanceDeleteRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    public static OnsInstanceDeleteRequest build(java.util.Map<String, ?> map) throws Exception {
        OnsInstanceDeleteRequest self = new OnsInstanceDeleteRequest();
        return TeaModel.build(map, self);
    }

    public OnsInstanceDeleteRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
