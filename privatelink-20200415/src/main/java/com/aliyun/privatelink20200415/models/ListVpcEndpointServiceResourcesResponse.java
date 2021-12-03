// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.privatelink20200415.models;

import com.aliyun.tea.*;

public class ListVpcEndpointServiceResourcesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public ListVpcEndpointServiceResourcesResponse setBody(ListVpcEndpointServiceResourcesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListVpcEndpointServiceResourcesResponseBody getBody() {
        return this.body;
    }

}
