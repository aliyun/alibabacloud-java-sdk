// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class CreateSagStaticRouteResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateSagStaticRouteResponseBody body;

    public static CreateSagStaticRouteResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSagStaticRouteResponse self = new CreateSagStaticRouteResponse();
        return TeaModel.build(map, self);
    }

    public CreateSagStaticRouteResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSagStaticRouteResponse setBody(CreateSagStaticRouteResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSagStaticRouteResponseBody getBody() {
        return this.body;
    }

}
