// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class PublishVpnRouteEntryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public PublishVpnRouteEntryResponseBody body;

    public static PublishVpnRouteEntryResponse build(java.util.Map<String, ?> map) throws Exception {
        PublishVpnRouteEntryResponse self = new PublishVpnRouteEntryResponse();
        return TeaModel.build(map, self);
    }

    public PublishVpnRouteEntryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PublishVpnRouteEntryResponse setBody(PublishVpnRouteEntryResponseBody body) {
        this.body = body;
        return this;
    }
    public PublishVpnRouteEntryResponseBody getBody() {
        return this.body;
    }

}
