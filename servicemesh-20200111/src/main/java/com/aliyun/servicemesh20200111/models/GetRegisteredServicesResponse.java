// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class GetRegisteredServicesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetRegisteredServicesResponseBody body;

    public static GetRegisteredServicesResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRegisteredServicesResponse self = new GetRegisteredServicesResponse();
        return TeaModel.build(map, self);
    }

    public GetRegisteredServicesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetRegisteredServicesResponse setBody(GetRegisteredServicesResponseBody body) {
        this.body = body;
        return this;
    }
    public GetRegisteredServicesResponseBody getBody() {
        return this.body;
    }

}
