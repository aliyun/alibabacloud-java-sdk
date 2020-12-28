// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class DescribeLoadBalancerTCPListenerAttributeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeLoadBalancerTCPListenerAttributeResponseBody body;

    public static DescribeLoadBalancerTCPListenerAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLoadBalancerTCPListenerAttributeResponse self = new DescribeLoadBalancerTCPListenerAttributeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLoadBalancerTCPListenerAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLoadBalancerTCPListenerAttributeResponse setBody(DescribeLoadBalancerTCPListenerAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLoadBalancerTCPListenerAttributeResponseBody getBody() {
        return this.body;
    }

}
