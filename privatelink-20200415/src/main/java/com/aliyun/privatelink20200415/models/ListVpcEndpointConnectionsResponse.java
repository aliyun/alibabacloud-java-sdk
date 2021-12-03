// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.privatelink20200415.models;

import com.aliyun.tea.*;

public class ListVpcEndpointConnectionsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListVpcEndpointConnectionsResponseBody body;

    public static ListVpcEndpointConnectionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListVpcEndpointConnectionsResponse self = new ListVpcEndpointConnectionsResponse();
        return TeaModel.build(map, self);
    }

    public ListVpcEndpointConnectionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListVpcEndpointConnectionsResponse setBody(ListVpcEndpointConnectionsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListVpcEndpointConnectionsResponseBody getBody() {
        return this.body;
    }

}
