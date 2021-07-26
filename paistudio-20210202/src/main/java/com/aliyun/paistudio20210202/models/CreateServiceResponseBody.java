// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20210202.models;

import com.aliyun.tea.*;

public class CreateServiceResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Url")
    public String url;

    @NameInMap("ServiceId")
    public String serviceId;

    public static CreateServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateServiceResponseBody self = new CreateServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateServiceResponseBody setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public CreateServiceResponseBody setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

}
