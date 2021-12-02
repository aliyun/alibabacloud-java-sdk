// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ListVpcEndpointServicesByEndUserResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListVpcEndpointServicesByEndUserResponseBody body;

    public static ListVpcEndpointServicesByEndUserResponse build(java.util.Map<String, ?> map) throws Exception {
        ListVpcEndpointServicesByEndUserResponse self = new ListVpcEndpointServicesByEndUserResponse();
        return TeaModel.build(map, self);
    }

    public ListVpcEndpointServicesByEndUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListVpcEndpointServicesByEndUserResponse setBody(ListVpcEndpointServicesByEndUserResponseBody body) {
        this.body = body;
        return this;
    }
    public ListVpcEndpointServicesByEndUserResponseBody getBody() {
        return this.body;
    }

}
