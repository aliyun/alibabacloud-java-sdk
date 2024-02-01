// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateRouteEntriesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateRouteEntriesResponseBody body;

    public static CreateRouteEntriesResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateRouteEntriesResponse self = new CreateRouteEntriesResponse();
        return TeaModel.build(map, self);
    }

    public CreateRouteEntriesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateRouteEntriesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateRouteEntriesResponse setBody(CreateRouteEntriesResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateRouteEntriesResponseBody getBody() {
        return this.body;
    }

}
