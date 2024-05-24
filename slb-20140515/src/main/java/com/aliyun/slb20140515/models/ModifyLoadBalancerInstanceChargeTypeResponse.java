// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class ModifyLoadBalancerInstanceChargeTypeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyLoadBalancerInstanceChargeTypeResponseBody body;

    public static ModifyLoadBalancerInstanceChargeTypeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyLoadBalancerInstanceChargeTypeResponse self = new ModifyLoadBalancerInstanceChargeTypeResponse();
        return TeaModel.build(map, self);
    }

    public ModifyLoadBalancerInstanceChargeTypeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyLoadBalancerInstanceChargeTypeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyLoadBalancerInstanceChargeTypeResponse setBody(ModifyLoadBalancerInstanceChargeTypeResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyLoadBalancerInstanceChargeTypeResponseBody getBody() {
        return this.body;
    }

}
