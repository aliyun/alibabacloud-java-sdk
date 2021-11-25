// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xixikf20200730.models;

import com.aliyun.tea.*;

public class CreateEntityIvrRouteResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateEntityIvrRouteResponseBody body;

    public static CreateEntityIvrRouteResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateEntityIvrRouteResponse self = new CreateEntityIvrRouteResponse();
        return TeaModel.build(map, self);
    }

    public CreateEntityIvrRouteResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateEntityIvrRouteResponse setBody(CreateEntityIvrRouteResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateEntityIvrRouteResponseBody getBody() {
        return this.body;
    }

}
