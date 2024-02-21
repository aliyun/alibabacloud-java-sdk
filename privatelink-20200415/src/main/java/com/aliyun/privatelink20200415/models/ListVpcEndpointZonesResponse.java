// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.privatelink20200415.models;

import com.aliyun.tea.*;

public class ListVpcEndpointZonesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListVpcEndpointZonesResponseBody body;

    public static ListVpcEndpointZonesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListVpcEndpointZonesResponse self = new ListVpcEndpointZonesResponse();
        return TeaModel.build(map, self);
    }

    public ListVpcEndpointZonesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListVpcEndpointZonesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListVpcEndpointZonesResponse setBody(ListVpcEndpointZonesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListVpcEndpointZonesResponseBody getBody() {
        return this.body;
    }

}
