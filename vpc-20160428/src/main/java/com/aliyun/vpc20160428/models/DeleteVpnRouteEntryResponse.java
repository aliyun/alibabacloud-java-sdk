// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DeleteVpnRouteEntryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DeleteVpnRouteEntryResponse setBody(DeleteVpnRouteEntryResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteVpnRouteEntryResponseBody getBody() {
        return this.body;
    }

}
