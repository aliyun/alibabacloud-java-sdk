// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class GetTableMetaResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetTableMetaResponseBody body;

    public static GetTableMetaResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTableMetaResponse self = new GetTableMetaResponse();
        return TeaModel.build(map, self);
    }

    public GetTableMetaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTableMetaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetTableMetaResponse setBody(GetTableMetaResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTableMetaResponseBody getBody() {
        return this.body;
    }

}
