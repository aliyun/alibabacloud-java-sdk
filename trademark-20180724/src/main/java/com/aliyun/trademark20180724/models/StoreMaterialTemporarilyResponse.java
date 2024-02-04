// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class StoreMaterialTemporarilyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StoreMaterialTemporarilyResponseBody body;

    public static StoreMaterialTemporarilyResponse build(java.util.Map<String, ?> map) throws Exception {
        StoreMaterialTemporarilyResponse self = new StoreMaterialTemporarilyResponse();
        return TeaModel.build(map, self);
    }

    public StoreMaterialTemporarilyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StoreMaterialTemporarilyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StoreMaterialTemporarilyResponse setBody(StoreMaterialTemporarilyResponseBody body) {
        this.body = body;
        return this;
    }
    public StoreMaterialTemporarilyResponseBody getBody() {
        return this.body;
    }

}
