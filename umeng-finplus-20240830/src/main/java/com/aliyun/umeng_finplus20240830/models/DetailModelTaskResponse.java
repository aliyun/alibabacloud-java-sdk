// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_finplus20240830.models;

import com.aliyun.tea.*;

public class DetailModelTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DetailModelTaskResponseBody body;

    public static DetailModelTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        DetailModelTaskResponse self = new DetailModelTaskResponse();
        return TeaModel.build(map, self);
    }

    public DetailModelTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DetailModelTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DetailModelTaskResponse setBody(DetailModelTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public DetailModelTaskResponseBody getBody() {
        return this.body;
    }

}
