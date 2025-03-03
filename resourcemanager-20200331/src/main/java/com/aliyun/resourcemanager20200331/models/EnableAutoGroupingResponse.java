// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class EnableAutoGroupingResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EnableAutoGroupingResponseBody body;

    public static EnableAutoGroupingResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableAutoGroupingResponse self = new EnableAutoGroupingResponse();
        return TeaModel.build(map, self);
    }

    public EnableAutoGroupingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableAutoGroupingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnableAutoGroupingResponse setBody(EnableAutoGroupingResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableAutoGroupingResponseBody getBody() {
        return this.body;
    }

}
