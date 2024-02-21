// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.privatelink20200415.models;

import com.aliyun.tea.*;

public class RemoveZoneFromVpcEndpointResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RemoveZoneFromVpcEndpointResponseBody body;

    public static RemoveZoneFromVpcEndpointResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveZoneFromVpcEndpointResponse self = new RemoveZoneFromVpcEndpointResponse();
        return TeaModel.build(map, self);
    }

    public RemoveZoneFromVpcEndpointResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveZoneFromVpcEndpointResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RemoveZoneFromVpcEndpointResponse setBody(RemoveZoneFromVpcEndpointResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveZoneFromVpcEndpointResponseBody getBody() {
        return this.body;
    }

}
