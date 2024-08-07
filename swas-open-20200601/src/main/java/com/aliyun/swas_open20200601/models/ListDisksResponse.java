// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class ListDisksResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDisksResponseBody body;

    public static ListDisksResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDisksResponse self = new ListDisksResponse();
        return TeaModel.build(map, self);
    }

    public ListDisksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDisksResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDisksResponse setBody(ListDisksResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDisksResponseBody getBody() {
        return this.body;
    }

}
