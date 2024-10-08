// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class WithdrawVpcPublishedRouteEntriesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public WithdrawVpcPublishedRouteEntriesResponseBody body;

    public static WithdrawVpcPublishedRouteEntriesResponse build(java.util.Map<String, ?> map) throws Exception {
        WithdrawVpcPublishedRouteEntriesResponse self = new WithdrawVpcPublishedRouteEntriesResponse();
        return TeaModel.build(map, self);
    }

    public WithdrawVpcPublishedRouteEntriesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public WithdrawVpcPublishedRouteEntriesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public WithdrawVpcPublishedRouteEntriesResponse setBody(WithdrawVpcPublishedRouteEntriesResponseBody body) {
        this.body = body;
        return this;
    }
    public WithdrawVpcPublishedRouteEntriesResponseBody getBody() {
        return this.body;
    }

}
