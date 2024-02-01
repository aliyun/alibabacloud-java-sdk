// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ListIpv4GatewaysResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListIpv4GatewaysResponseBody body;

    public static ListIpv4GatewaysResponse build(java.util.Map<String, ?> map) throws Exception {
        ListIpv4GatewaysResponse self = new ListIpv4GatewaysResponse();
        return TeaModel.build(map, self);
    }

    public ListIpv4GatewaysResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListIpv4GatewaysResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListIpv4GatewaysResponse setBody(ListIpv4GatewaysResponseBody body) {
        this.body = body;
        return this;
    }
    public ListIpv4GatewaysResponseBody getBody() {
        return this.body;
    }

}
