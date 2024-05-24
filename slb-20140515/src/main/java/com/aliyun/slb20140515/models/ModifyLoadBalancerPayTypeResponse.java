// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class ModifyLoadBalancerPayTypeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyLoadBalancerPayTypeResponseBody body;

    public static ModifyLoadBalancerPayTypeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyLoadBalancerPayTypeResponse self = new ModifyLoadBalancerPayTypeResponse();
        return TeaModel.build(map, self);
    }

    public ModifyLoadBalancerPayTypeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyLoadBalancerPayTypeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyLoadBalancerPayTypeResponse setBody(ModifyLoadBalancerPayTypeResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyLoadBalancerPayTypeResponseBody getBody() {
        return this.body;
    }

}
