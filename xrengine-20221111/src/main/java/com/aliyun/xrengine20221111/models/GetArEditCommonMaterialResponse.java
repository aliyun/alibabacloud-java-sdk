// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20221111.models;

import com.aliyun.tea.*;

public class GetArEditCommonMaterialResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetArEditCommonMaterialResponseBody body;

    public static GetArEditCommonMaterialResponse build(java.util.Map<String, ?> map) throws Exception {
        GetArEditCommonMaterialResponse self = new GetArEditCommonMaterialResponse();
        return TeaModel.build(map, self);
    }

    public GetArEditCommonMaterialResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetArEditCommonMaterialResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetArEditCommonMaterialResponse setBody(GetArEditCommonMaterialResponseBody body) {
        this.body = body;
        return this;
    }
    public GetArEditCommonMaterialResponseBody getBody() {
        return this.body;
    }

}
