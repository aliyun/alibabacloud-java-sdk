// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListDockerhubImageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDockerhubImageResponseBody body;

    public static ListDockerhubImageResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDockerhubImageResponse self = new ListDockerhubImageResponse();
        return TeaModel.build(map, self);
    }

    public ListDockerhubImageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDockerhubImageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDockerhubImageResponse setBody(ListDockerhubImageResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDockerhubImageResponseBody getBody() {
        return this.body;
    }

}
