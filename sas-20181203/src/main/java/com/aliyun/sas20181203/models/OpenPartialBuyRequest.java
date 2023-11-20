// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class OpenPartialBuyRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    public static OpenPartialBuyRequest build(java.util.Map<String, ?> map) throws Exception {
        OpenPartialBuyRequest self = new OpenPartialBuyRequest();
        return TeaModel.build(map, self);
    }

    public OpenPartialBuyRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
