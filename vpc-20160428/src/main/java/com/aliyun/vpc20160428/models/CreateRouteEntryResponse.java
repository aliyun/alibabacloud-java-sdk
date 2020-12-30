// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateRouteEntryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateRouteEntryResponseBody body;

    public static CreateRouteEntryResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateRouteEntryResponse self = new CreateRouteEntryResponse();
        return TeaModel.build(map, self);
    }

    public CreateRouteEntryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateRouteEntryResponse setBody(CreateRouteEntryResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateRouteEntryResponseBody getBody() {
        return this.body;
    }

}
