// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.privatelink20200415.models;

import com.aliyun.tea.*;

public class ListVpcEndpointServicesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListVpcEndpointServicesResponseBody body;

    public static ListVpcEndpointServicesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListVpcEndpointServicesResponse self = new ListVpcEndpointServicesResponse();
        return TeaModel.build(map, self);
    }

    public ListVpcEndpointServicesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListVpcEndpointServicesResponse setBody(ListVpcEndpointServicesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListVpcEndpointServicesResponseBody getBody() {
        return this.body;
    }

}
