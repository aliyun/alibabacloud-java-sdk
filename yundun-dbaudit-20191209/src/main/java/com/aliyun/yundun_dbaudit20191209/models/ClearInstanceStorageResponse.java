// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20191209.models;

import com.aliyun.tea.*;

public class ClearInstanceStorageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ClearInstanceStorageResponseBody body;

    public static ClearInstanceStorageResponse build(java.util.Map<String, ?> map) throws Exception {
        ClearInstanceStorageResponse self = new ClearInstanceStorageResponse();
        return TeaModel.build(map, self);
    }

    public ClearInstanceStorageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ClearInstanceStorageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ClearInstanceStorageResponse setBody(ClearInstanceStorageResponseBody body) {
        this.body = body;
        return this;
    }
    public ClearInstanceStorageResponseBody getBody() {
        return this.body;
    }

}
