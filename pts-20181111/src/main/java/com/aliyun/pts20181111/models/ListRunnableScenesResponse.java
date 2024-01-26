// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20181111.models;

import com.aliyun.tea.*;

public class ListRunnableScenesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListRunnableScenesResponseBody body;

    public static ListRunnableScenesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListRunnableScenesResponse self = new ListRunnableScenesResponse();
        return TeaModel.build(map, self);
    }

    public ListRunnableScenesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListRunnableScenesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListRunnableScenesResponse setBody(ListRunnableScenesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListRunnableScenesResponseBody getBody() {
        return this.body;
    }

}
