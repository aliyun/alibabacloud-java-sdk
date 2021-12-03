// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.privatelink20200415.models;

import com.aliyun.tea.*;

public class ListVpcEndpointServiceUsersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListVpcEndpointServiceUsersResponseBody body;

    public static ListVpcEndpointServiceUsersResponse build(java.util.Map<String, ?> map) throws Exception {
        ListVpcEndpointServiceUsersResponse self = new ListVpcEndpointServiceUsersResponse();
        return TeaModel.build(map, self);
    }

    public ListVpcEndpointServiceUsersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListVpcEndpointServiceUsersResponse setBody(ListVpcEndpointServiceUsersResponseBody body) {
        this.body = body;
        return this;
    }
    public ListVpcEndpointServiceUsersResponseBody getBody() {
        return this.body;
    }

}
