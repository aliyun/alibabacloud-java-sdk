// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ListGatewayRouteTableEntriesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListGatewayRouteTableEntriesResponseBody body;

    public static ListGatewayRouteTableEntriesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListGatewayRouteTableEntriesResponse self = new ListGatewayRouteTableEntriesResponse();
        return TeaModel.build(map, self);
    }

    public ListGatewayRouteTableEntriesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListGatewayRouteTableEntriesResponse setBody(ListGatewayRouteTableEntriesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListGatewayRouteTableEntriesResponseBody getBody() {
        return this.body;
    }

}
