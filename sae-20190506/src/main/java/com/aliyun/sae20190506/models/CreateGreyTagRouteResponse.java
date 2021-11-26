// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class CreateGreyTagRouteResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateGreyTagRouteResponseBody body;

    public static CreateGreyTagRouteResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateGreyTagRouteResponse self = new CreateGreyTagRouteResponse();
        return TeaModel.build(map, self);
    }

    public CreateGreyTagRouteResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateGreyTagRouteResponse setBody(CreateGreyTagRouteResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateGreyTagRouteResponseBody getBody() {
        return this.body;
    }

}
