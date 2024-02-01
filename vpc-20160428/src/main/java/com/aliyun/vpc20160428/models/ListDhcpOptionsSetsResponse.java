// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ListDhcpOptionsSetsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDhcpOptionsSetsResponseBody body;

    public static ListDhcpOptionsSetsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDhcpOptionsSetsResponse self = new ListDhcpOptionsSetsResponse();
        return TeaModel.build(map, self);
    }

    public ListDhcpOptionsSetsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDhcpOptionsSetsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDhcpOptionsSetsResponse setBody(ListDhcpOptionsSetsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDhcpOptionsSetsResponseBody getBody() {
        return this.body;
    }

}
