// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class ModifyLoadBalancerInstanceSpecResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyLoadBalancerInstanceSpecResponseBody body;

    public static ModifyLoadBalancerInstanceSpecResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyLoadBalancerInstanceSpecResponse self = new ModifyLoadBalancerInstanceSpecResponse();
        return TeaModel.build(map, self);
    }

    public ModifyLoadBalancerInstanceSpecResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyLoadBalancerInstanceSpecResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyLoadBalancerInstanceSpecResponse setBody(ModifyLoadBalancerInstanceSpecResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyLoadBalancerInstanceSpecResponseBody getBody() {
        return this.body;
    }

}
