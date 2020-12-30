// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateRouteTableResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateRouteTableResponseBody body;

    public static CreateRouteTableResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateRouteTableResponse self = new CreateRouteTableResponse();
        return TeaModel.build(map, self);
    }

    public CreateRouteTableResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateRouteTableResponse setBody(CreateRouteTableResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateRouteTableResponseBody getBody() {
        return this.body;
    }

}
