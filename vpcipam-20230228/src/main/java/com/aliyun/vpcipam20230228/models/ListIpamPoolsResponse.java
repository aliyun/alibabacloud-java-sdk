// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpcipam20230228.models;

import com.aliyun.tea.*;

public class ListIpamPoolsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListIpamPoolsResponseBody body;

    public static ListIpamPoolsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListIpamPoolsResponse self = new ListIpamPoolsResponse();
        return TeaModel.build(map, self);
    }

    public ListIpamPoolsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListIpamPoolsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListIpamPoolsResponse setBody(ListIpamPoolsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListIpamPoolsResponseBody getBody() {
        return this.body;
    }

}
