// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DeleteVpnRouteEntryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteVpnRouteEntryResponseBody body;

    public static DeleteVpnRouteEntryResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteVpnRouteEntryResponse self = new DeleteVpnRouteEntryResponse();
        return TeaModel.build(map, self);
    }

    public DeleteVpnRouteEntryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteVpnRouteEntryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteVpnRouteEntryResponse setBody(DeleteVpnRouteEntryResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteVpnRouteEntryResponseBody getBody() {
        return this.body;
    }

}
