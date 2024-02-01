// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class PublishVpnRouteEntryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public PublishVpnRouteEntryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PublishVpnRouteEntryResponse setBody(PublishVpnRouteEntryResponseBody body) {
        this.body = body;
        return this;
    }
    public PublishVpnRouteEntryResponseBody getBody() {
        return this.body;
    }

}
