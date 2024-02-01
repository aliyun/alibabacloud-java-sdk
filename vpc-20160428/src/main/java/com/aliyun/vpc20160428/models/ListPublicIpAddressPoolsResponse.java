// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ListPublicIpAddressPoolsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListPublicIpAddressPoolsResponseBody body;

    public static ListPublicIpAddressPoolsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPublicIpAddressPoolsResponse self = new ListPublicIpAddressPoolsResponse();
        return TeaModel.build(map, self);
    }

    public ListPublicIpAddressPoolsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPublicIpAddressPoolsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListPublicIpAddressPoolsResponse setBody(ListPublicIpAddressPoolsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPublicIpAddressPoolsResponseBody getBody() {
        return this.body;
    }

}
