// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ListOperationHostsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListOperationHostsResponseBody body;

    public static ListOperationHostsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListOperationHostsResponse self = new ListOperationHostsResponse();
        return TeaModel.build(map, self);
    }

    public ListOperationHostsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListOperationHostsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListOperationHostsResponse setBody(ListOperationHostsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListOperationHostsResponseBody getBody() {
        return this.body;
    }

}
