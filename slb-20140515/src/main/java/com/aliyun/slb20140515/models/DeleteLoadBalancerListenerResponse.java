// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class DeleteLoadBalancerListenerResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteLoadBalancerListenerResponseBody body;

    public static DeleteLoadBalancerListenerResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteLoadBalancerListenerResponse self = new DeleteLoadBalancerListenerResponse();
        return TeaModel.build(map, self);
    }

    public DeleteLoadBalancerListenerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteLoadBalancerListenerResponse setBody(DeleteLoadBalancerListenerResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteLoadBalancerListenerResponseBody getBody() {
        return this.body;
    }

}
