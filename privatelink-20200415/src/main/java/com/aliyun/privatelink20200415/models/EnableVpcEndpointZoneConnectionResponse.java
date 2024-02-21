// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.privatelink20200415.models;

import com.aliyun.tea.*;

public class EnableVpcEndpointZoneConnectionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EnableVpcEndpointZoneConnectionResponseBody body;

    public static EnableVpcEndpointZoneConnectionResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableVpcEndpointZoneConnectionResponse self = new EnableVpcEndpointZoneConnectionResponse();
        return TeaModel.build(map, self);
    }

    public EnableVpcEndpointZoneConnectionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableVpcEndpointZoneConnectionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnableVpcEndpointZoneConnectionResponse setBody(EnableVpcEndpointZoneConnectionResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableVpcEndpointZoneConnectionResponseBody getBody() {
        return this.body;
    }

}
