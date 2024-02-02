// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20230313.models;

import com.aliyun.tea.*;

public class PopCreateMaterialResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PopCreateMaterialResponseBody body;

    public static PopCreateMaterialResponse build(java.util.Map<String, ?> map) throws Exception {
        PopCreateMaterialResponse self = new PopCreateMaterialResponse();
        return TeaModel.build(map, self);
    }

    public PopCreateMaterialResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PopCreateMaterialResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PopCreateMaterialResponse setBody(PopCreateMaterialResponseBody body) {
        this.body = body;
        return this;
    }
    public PopCreateMaterialResponseBody getBody() {
        return this.body;
    }

}
