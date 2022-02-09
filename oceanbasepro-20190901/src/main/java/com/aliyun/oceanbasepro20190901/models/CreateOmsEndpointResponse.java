// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class CreateOmsEndpointResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateOmsEndpointResponseBody body;

    public static CreateOmsEndpointResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateOmsEndpointResponse self = new CreateOmsEndpointResponse();
        return TeaModel.build(map, self);
    }

    public CreateOmsEndpointResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateOmsEndpointResponse setBody(CreateOmsEndpointResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateOmsEndpointResponseBody getBody() {
        return this.body;
    }

}
