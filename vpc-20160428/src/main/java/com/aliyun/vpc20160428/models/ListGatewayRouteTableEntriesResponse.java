// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ListGatewayRouteTableEntriesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public ListGatewayRouteTableEntriesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListGatewayRouteTableEntriesResponse setBody(ListGatewayRouteTableEntriesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListGatewayRouteTableEntriesResponseBody getBody() {
        return this.body;
    }

}
