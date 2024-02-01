// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateVpnRouteEntryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public CreateVpnRouteEntryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateVpnRouteEntryResponse setBody(CreateVpnRouteEntryResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateVpnRouteEntryResponseBody getBody() {
        return this.body;
    }

}
