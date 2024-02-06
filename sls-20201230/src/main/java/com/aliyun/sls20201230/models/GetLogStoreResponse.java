// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class GetLogStoreResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public Logstore body;

    public static GetLogStoreResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLogStoreResponse self = new GetLogStoreResponse();
        return TeaModel.build(map, self);
    }

    public GetLogStoreResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLogStoreResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetLogStoreResponse setBody(Logstore body) {
        this.body = body;
        return this;
    }
    public Logstore getBody() {
        return this.body;
    }

}
