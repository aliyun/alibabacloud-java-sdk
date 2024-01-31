// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class IgnoreCheckItemsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public IgnoreCheckItemsResponseBody body;

    public static IgnoreCheckItemsResponse build(java.util.Map<String, ?> map) throws Exception {
        IgnoreCheckItemsResponse self = new IgnoreCheckItemsResponse();
        return TeaModel.build(map, self);
    }

    public IgnoreCheckItemsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public IgnoreCheckItemsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public IgnoreCheckItemsResponse setBody(IgnoreCheckItemsResponseBody body) {
        this.body = body;
        return this;
    }
    public IgnoreCheckItemsResponseBody getBody() {
        return this.body;
    }

}
