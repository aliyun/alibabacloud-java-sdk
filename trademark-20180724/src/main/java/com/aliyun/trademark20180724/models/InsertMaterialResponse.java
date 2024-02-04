// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class InsertMaterialResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public InsertMaterialResponseBody body;

    public static InsertMaterialResponse build(java.util.Map<String, ?> map) throws Exception {
        InsertMaterialResponse self = new InsertMaterialResponse();
        return TeaModel.build(map, self);
    }

    public InsertMaterialResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InsertMaterialResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public InsertMaterialResponse setBody(InsertMaterialResponseBody body) {
        this.body = body;
        return this;
    }
    public InsertMaterialResponseBody getBody() {
        return this.body;
    }

}
