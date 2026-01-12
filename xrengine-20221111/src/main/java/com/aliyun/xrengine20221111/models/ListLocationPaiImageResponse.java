// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20221111.models;

import com.aliyun.tea.*;

public class ListLocationPaiImageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListLocationPaiImageResponseBody body;

    public static ListLocationPaiImageResponse build(java.util.Map<String, ?> map) throws Exception {
        ListLocationPaiImageResponse self = new ListLocationPaiImageResponse();
        return TeaModel.build(map, self);
    }

    public ListLocationPaiImageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListLocationPaiImageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListLocationPaiImageResponse setBody(ListLocationPaiImageResponseBody body) {
        this.body = body;
        return this;
    }
    public ListLocationPaiImageResponseBody getBody() {
        return this.body;
    }

}
