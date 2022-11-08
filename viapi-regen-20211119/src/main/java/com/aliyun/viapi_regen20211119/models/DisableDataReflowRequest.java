// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi_regen20211119.models;

import com.aliyun.tea.*;

public class DisableDataReflowRequest extends TeaModel {
    @NameInMap("ServiceId")
    public Long serviceId;

    public static DisableDataReflowRequest build(java.util.Map<String, ?> map) throws Exception {
        DisableDataReflowRequest self = new DisableDataReflowRequest();
        return TeaModel.build(map, self);
    }

    public DisableDataReflowRequest setServiceId(Long serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public Long getServiceId() {
        return this.serviceId;
    }

}
