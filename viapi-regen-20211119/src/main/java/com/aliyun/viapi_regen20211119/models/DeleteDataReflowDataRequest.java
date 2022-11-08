// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi_regen20211119.models;

import com.aliyun.tea.*;

public class DeleteDataReflowDataRequest extends TeaModel {
    @NameInMap("Id")
    public Long id;

    @NameInMap("ServiceId")
    public Long serviceId;

    public static DeleteDataReflowDataRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDataReflowDataRequest self = new DeleteDataReflowDataRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDataReflowDataRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public DeleteDataReflowDataRequest setServiceId(Long serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public Long getServiceId() {
        return this.serviceId;
    }

}
