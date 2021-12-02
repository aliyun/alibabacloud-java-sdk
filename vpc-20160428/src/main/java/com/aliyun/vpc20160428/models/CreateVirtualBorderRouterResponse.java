// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateVirtualBorderRouterResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateVirtualBorderRouterResponseBody body;

    public static CreateVirtualBorderRouterResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateVirtualBorderRouterResponse self = new CreateVirtualBorderRouterResponse();
        return TeaModel.build(map, self);
    }

    public CreateVirtualBorderRouterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateVirtualBorderRouterResponse setBody(CreateVirtualBorderRouterResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateVirtualBorderRouterResponseBody getBody() {
        return this.body;
    }

}
