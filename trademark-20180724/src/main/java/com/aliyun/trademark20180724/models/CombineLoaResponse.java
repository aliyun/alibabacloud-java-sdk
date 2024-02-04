// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class CombineLoaResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CombineLoaResponseBody body;

    public static CombineLoaResponse build(java.util.Map<String, ?> map) throws Exception {
        CombineLoaResponse self = new CombineLoaResponse();
        return TeaModel.build(map, self);
    }

    public CombineLoaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CombineLoaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CombineLoaResponse setBody(CombineLoaResponseBody body) {
        this.body = body;
        return this;
    }
    public CombineLoaResponseBody getBody() {
        return this.body;
    }

}
