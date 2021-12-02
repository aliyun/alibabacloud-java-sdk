// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class DeleteServiceRequest extends TeaModel {
    @NameInMap("ServiceId")
    public Long serviceId;

    public static DeleteServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteServiceRequest self = new DeleteServiceRequest();
        return TeaModel.build(map, self);
    }

    public DeleteServiceRequest setServiceId(Long serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public Long getServiceId() {
        return this.serviceId;
    }

}
