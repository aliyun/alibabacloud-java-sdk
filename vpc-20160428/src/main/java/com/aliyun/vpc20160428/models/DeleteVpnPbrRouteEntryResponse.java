// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DeleteVpnPbrRouteEntryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteVpnPbrRouteEntryResponseBody body;

    public static DeleteVpnPbrRouteEntryResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteVpnPbrRouteEntryResponse self = new DeleteVpnPbrRouteEntryResponse();
        return TeaModel.build(map, self);
    }

    public DeleteVpnPbrRouteEntryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteVpnPbrRouteEntryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteVpnPbrRouteEntryResponse setBody(DeleteVpnPbrRouteEntryResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteVpnPbrRouteEntryResponseBody getBody() {
        return this.body;
    }

}
