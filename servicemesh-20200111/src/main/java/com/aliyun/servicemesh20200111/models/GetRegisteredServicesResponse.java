// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class GetRegisteredServicesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Services")
    @Validation(required = true)
    public java.util.List<String> services;

    public static GetRegisteredServicesResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRegisteredServicesResponse self = new GetRegisteredServicesResponse();
        return TeaModel.build(map, self);
    }

    public GetRegisteredServicesResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetRegisteredServicesResponse setServices(java.util.List<String> services) {
        this.services = services;
        return this;
    }
    public java.util.List<String> getServices() {
        return this.services;
    }

}
