// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.privatelink20200415.models;

import com.aliyun.tea.*;

public class AddZoneToVpcEndpointResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddZoneToVpcEndpointResponseBody body;

    public static AddZoneToVpcEndpointResponse build(java.util.Map<String, ?> map) throws Exception {
        AddZoneToVpcEndpointResponse self = new AddZoneToVpcEndpointResponse();
        return TeaModel.build(map, self);
    }

    public AddZoneToVpcEndpointResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddZoneToVpcEndpointResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddZoneToVpcEndpointResponse setBody(AddZoneToVpcEndpointResponseBody body) {
        this.body = body;
        return this;
    }
    public AddZoneToVpcEndpointResponseBody getBody() {
        return this.body;
    }

}
