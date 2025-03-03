// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class DisableAutoGroupingResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DisableAutoGroupingResponseBody body;

    public static DisableAutoGroupingResponse build(java.util.Map<String, ?> map) throws Exception {
        DisableAutoGroupingResponse self = new DisableAutoGroupingResponse();
        return TeaModel.build(map, self);
    }

    public DisableAutoGroupingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisableAutoGroupingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DisableAutoGroupingResponse setBody(DisableAutoGroupingResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableAutoGroupingResponseBody getBody() {
        return this.body;
    }

}
