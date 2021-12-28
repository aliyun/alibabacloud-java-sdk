// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class GetRegisteredServicesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Services")
    public java.util.List<String> services;

    public static GetRegisteredServicesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRegisteredServicesResponseBody self = new GetRegisteredServicesResponseBody();
        return TeaModel.build(map, self);
    }

    public GetRegisteredServicesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetRegisteredServicesResponseBody setServices(java.util.List<String> services) {
        this.services = services;
        return this;
    }
    public java.util.List<String> getServices() {
        return this.services;
    }

}
