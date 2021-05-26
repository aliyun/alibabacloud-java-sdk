// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class DescribeLoadBalancerListenersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeLoadBalancerListenersResponseBody body;

    public static DescribeLoadBalancerListenersResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLoadBalancerListenersResponse self = new DescribeLoadBalancerListenersResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLoadBalancerListenersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLoadBalancerListenersResponse setBody(DescribeLoadBalancerListenersResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLoadBalancerListenersResponseBody getBody() {
        return this.body;
    }

}
