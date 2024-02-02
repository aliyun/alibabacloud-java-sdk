// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20230313.models;

import com.aliyun.tea.*;

public class PopDeleteMaterialResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PopDeleteMaterialResponseBody body;

    public static PopDeleteMaterialResponse build(java.util.Map<String, ?> map) throws Exception {
        PopDeleteMaterialResponse self = new PopDeleteMaterialResponse();
        return TeaModel.build(map, self);
    }

    public PopDeleteMaterialResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PopDeleteMaterialResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PopDeleteMaterialResponse setBody(PopDeleteMaterialResponseBody body) {
        this.body = body;
        return this;
    }
    public PopDeleteMaterialResponseBody getBody() {
        return this.body;
    }

}
