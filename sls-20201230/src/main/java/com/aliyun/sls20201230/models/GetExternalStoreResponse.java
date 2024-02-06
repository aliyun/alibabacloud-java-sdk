// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class GetExternalStoreResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ExternalStore body;

    public static GetExternalStoreResponse build(java.util.Map<String, ?> map) throws Exception {
        GetExternalStoreResponse self = new GetExternalStoreResponse();
        return TeaModel.build(map, self);
    }

    public GetExternalStoreResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetExternalStoreResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetExternalStoreResponse setBody(ExternalStore body) {
        this.body = body;
        return this;
    }
    public ExternalStore getBody() {
        return this.body;
    }

}
