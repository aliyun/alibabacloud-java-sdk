// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class ModifyLoadBalancerInternetSpecResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyLoadBalancerInternetSpecResponseBody body;

    public static ModifyLoadBalancerInternetSpecResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyLoadBalancerInternetSpecResponse self = new ModifyLoadBalancerInternetSpecResponse();
        return TeaModel.build(map, self);
    }

    public ModifyLoadBalancerInternetSpecResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyLoadBalancerInternetSpecResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyLoadBalancerInternetSpecResponse setBody(ModifyLoadBalancerInternetSpecResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyLoadBalancerInternetSpecResponseBody getBody() {
        return this.body;
    }

}
