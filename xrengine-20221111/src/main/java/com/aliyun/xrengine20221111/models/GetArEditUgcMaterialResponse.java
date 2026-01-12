// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20221111.models;

import com.aliyun.tea.*;

public class GetArEditUgcMaterialResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetArEditUgcMaterialResponseBody body;

    public static GetArEditUgcMaterialResponse build(java.util.Map<String, ?> map) throws Exception {
        GetArEditUgcMaterialResponse self = new GetArEditUgcMaterialResponse();
        return TeaModel.build(map, self);
    }

    public GetArEditUgcMaterialResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetArEditUgcMaterialResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetArEditUgcMaterialResponse setBody(GetArEditUgcMaterialResponseBody body) {
        this.body = body;
        return this;
    }
    public GetArEditUgcMaterialResponseBody getBody() {
        return this.body;
    }

}
