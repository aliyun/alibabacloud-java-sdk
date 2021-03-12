// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class GetServiceRegistrySourceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetServiceRegistrySourceResponseBody body;

    public static GetServiceRegistrySourceResponse build(java.util.Map<String, ?> map) throws Exception {
        GetServiceRegistrySourceResponse self = new GetServiceRegistrySourceResponse();
        return TeaModel.build(map, self);
    }

    public GetServiceRegistrySourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetServiceRegistrySourceResponse setBody(GetServiceRegistrySourceResponseBody body) {
        this.body = body;
        return this;
    }
    public GetServiceRegistrySourceResponseBody getBody() {
        return this.body;
    }

}
