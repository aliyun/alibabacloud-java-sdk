// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class GetStoreViewIndexResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetStoreViewIndexResponseBody body;

    public static GetStoreViewIndexResponse build(java.util.Map<String, ?> map) throws Exception {
        GetStoreViewIndexResponse self = new GetStoreViewIndexResponse();
        return TeaModel.build(map, self);
    }

    public GetStoreViewIndexResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetStoreViewIndexResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetStoreViewIndexResponse setBody(GetStoreViewIndexResponseBody body) {
        this.body = body;
        return this;
    }
    public GetStoreViewIndexResponseBody getBody() {
        return this.body;
    }

}
