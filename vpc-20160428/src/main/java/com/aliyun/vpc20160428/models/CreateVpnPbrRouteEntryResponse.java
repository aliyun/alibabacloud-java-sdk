// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateVpnPbrRouteEntryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public CreateVpnPbrRouteEntryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateVpnPbrRouteEntryResponse setBody(CreateVpnPbrRouteEntryResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateVpnPbrRouteEntryResponseBody getBody() {
        return this.body;
    }

}
