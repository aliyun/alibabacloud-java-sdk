// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class GetCatalogsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetCatalogsResponseBody body;

    public static GetCatalogsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCatalogsResponse self = new GetCatalogsResponse();
        return TeaModel.build(map, self);
    }

    public GetCatalogsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCatalogsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetCatalogsResponse setBody(GetCatalogsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCatalogsResponseBody getBody() {
        return this.body;
    }

}
