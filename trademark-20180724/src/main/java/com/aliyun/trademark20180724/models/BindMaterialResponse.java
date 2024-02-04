// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class BindMaterialResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BindMaterialResponseBody body;

    public static BindMaterialResponse build(java.util.Map<String, ?> map) throws Exception {
        BindMaterialResponse self = new BindMaterialResponse();
        return TeaModel.build(map, self);
    }

    public BindMaterialResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BindMaterialResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BindMaterialResponse setBody(BindMaterialResponseBody body) {
        this.body = body;
        return this;
    }
    public BindMaterialResponseBody getBody() {
        return this.body;
    }

}
