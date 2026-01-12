// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20221111.models;

import com.aliyun.tea.*;

public class ListAreaMapResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAreaMapResponseBody body;

    public static ListAreaMapResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAreaMapResponse self = new ListAreaMapResponse();
        return TeaModel.build(map, self);
    }

    public ListAreaMapResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAreaMapResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAreaMapResponse setBody(ListAreaMapResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAreaMapResponseBody getBody() {
        return this.body;
    }

}
