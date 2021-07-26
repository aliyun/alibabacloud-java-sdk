// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20210202.models;

import com.aliyun.tea.*;

public class GetServiceRequest extends TeaModel {
    @NameInMap("ServiceType")
    public String serviceType;

    public static GetServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        GetServiceRequest self = new GetServiceRequest();
        return TeaModel.build(map, self);
    }

    public GetServiceRequest setServiceType(String serviceType) {
        this.serviceType = serviceType;
        return this;
    }
    public String getServiceType() {
        return this.serviceType;
    }

}
