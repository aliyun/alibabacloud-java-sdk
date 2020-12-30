// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateVpnRouteEntryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateVpnRouteEntryResponseBody body;

    public static CreateVpnRouteEntryResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateVpnRouteEntryResponse self = new CreateVpnRouteEntryResponse();
        return TeaModel.build(map, self);
    }

    public CreateVpnRouteEntryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateVpnRouteEntryResponse setBody(CreateVpnRouteEntryResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateVpnRouteEntryResponseBody getBody() {
        return this.body;
    }

}
