// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20221111.models;

import com.aliyun.tea.*;

public class ListHdrResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListHdrResponseBody body;

    public static ListHdrResponse build(java.util.Map<String, ?> map) throws Exception {
        ListHdrResponse self = new ListHdrResponse();
        return TeaModel.build(map, self);
    }

    public ListHdrResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListHdrResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListHdrResponse setBody(ListHdrResponseBody body) {
        this.body = body;
        return this;
    }
    public ListHdrResponseBody getBody() {
        return this.body;
    }

}
