// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class GetStoreViewResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetStoreViewResponseBody body;

    public static GetStoreViewResponse build(java.util.Map<String, ?> map) throws Exception {
        GetStoreViewResponse self = new GetStoreViewResponse();
        return TeaModel.build(map, self);
    }

    public GetStoreViewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetStoreViewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetStoreViewResponse setBody(GetStoreViewResponseBody body) {
        this.body = body;
        return this;
    }
    public GetStoreViewResponseBody getBody() {
        return this.body;
    }

}
