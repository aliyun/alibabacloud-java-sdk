// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slbv220220430.models;

import com.aliyun.tea.*;

public class ListLoadBalancersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListLoadBalancersResponseBody body;

    public static ListLoadBalancersResponse build(java.util.Map<String, ?> map) throws Exception {
        ListLoadBalancersResponse self = new ListLoadBalancersResponse();
        return TeaModel.build(map, self);
    }

    public ListLoadBalancersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListLoadBalancersResponse setBody(ListLoadBalancersResponseBody body) {
        this.body = body;
        return this;
    }
    public ListLoadBalancersResponseBody getBody() {
        return this.body;
    }

}
