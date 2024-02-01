// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ListEnhanhcedNatGatewayAvailableZonesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListEnhanhcedNatGatewayAvailableZonesResponseBody body;

    public static ListEnhanhcedNatGatewayAvailableZonesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListEnhanhcedNatGatewayAvailableZonesResponse self = new ListEnhanhcedNatGatewayAvailableZonesResponse();
        return TeaModel.build(map, self);
    }

    public ListEnhanhcedNatGatewayAvailableZonesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListEnhanhcedNatGatewayAvailableZonesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListEnhanhcedNatGatewayAvailableZonesResponse setBody(ListEnhanhcedNatGatewayAvailableZonesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListEnhanhcedNatGatewayAvailableZonesResponseBody getBody() {
        return this.body;
    }

}
