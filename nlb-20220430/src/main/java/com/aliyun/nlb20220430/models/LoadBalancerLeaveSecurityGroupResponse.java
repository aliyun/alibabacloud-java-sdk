// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nlb20220430.models;

import com.aliyun.tea.*;

public class LoadBalancerLeaveSecurityGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public LoadBalancerLeaveSecurityGroupResponseBody body;

    public static LoadBalancerLeaveSecurityGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        LoadBalancerLeaveSecurityGroupResponse self = new LoadBalancerLeaveSecurityGroupResponse();
        return TeaModel.build(map, self);
    }

    public LoadBalancerLeaveSecurityGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public LoadBalancerLeaveSecurityGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public LoadBalancerLeaveSecurityGroupResponse setBody(LoadBalancerLeaveSecurityGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public LoadBalancerLeaveSecurityGroupResponseBody getBody() {
        return this.body;
    }

}
