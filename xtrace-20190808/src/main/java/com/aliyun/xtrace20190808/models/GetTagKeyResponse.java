// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtrace20190808.models;

import com.aliyun.tea.*;

public class GetTagKeyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetTagKeyResponseBody body;

    public static GetTagKeyResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTagKeyResponse self = new GetTagKeyResponse();
        return TeaModel.build(map, self);
    }

    public GetTagKeyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTagKeyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetTagKeyResponse setBody(GetTagKeyResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTagKeyResponseBody getBody() {
        return this.body;
    }

}
