// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateVpnPbrRouteEntryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateVpnPbrRouteEntryResponseBody body;

    public static CreateVpnPbrRouteEntryResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateVpnPbrRouteEntryResponse self = new CreateVpnPbrRouteEntryResponse();
        return TeaModel.build(map, self);
    }

    public CreateVpnPbrRouteEntryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateVpnPbrRouteEntryResponse setBody(CreateVpnPbrRouteEntryResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateVpnPbrRouteEntryResponseBody getBody() {
        return this.body;
    }

}
