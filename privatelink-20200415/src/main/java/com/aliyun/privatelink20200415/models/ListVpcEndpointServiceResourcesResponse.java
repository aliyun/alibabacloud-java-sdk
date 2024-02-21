// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.privatelink20200415.models;

import com.aliyun.tea.*;

public class ListVpcEndpointServiceResourcesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListVpcEndpointServiceResourcesResponseBody body;

    public static ListVpcEndpointServiceResourcesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListVpcEndpointServiceResourcesResponse self = new ListVpcEndpointServiceResourcesResponse();
        return TeaModel.build(map, self);
    }

    public ListVpcEndpointServiceResourcesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListVpcEndpointServiceResourcesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListVpcEndpointServiceResourcesResponse setBody(ListVpcEndpointServiceResourcesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListVpcEndpointServiceResourcesResponseBody getBody() {
        return this.body;
    }

}
