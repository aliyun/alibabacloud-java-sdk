// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class GetLogStoreConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetLogStoreConfigResponseBody body;

    public static GetLogStoreConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLogStoreConfigResponse self = new GetLogStoreConfigResponse();
        return TeaModel.build(map, self);
    }

    public GetLogStoreConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLogStoreConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetLogStoreConfigResponse setBody(GetLogStoreConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLogStoreConfigResponseBody getBody() {
        return this.body;
    }

}
