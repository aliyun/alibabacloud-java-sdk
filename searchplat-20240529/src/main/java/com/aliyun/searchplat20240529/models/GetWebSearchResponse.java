// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchplat20240529.models;

import com.aliyun.tea.*;

public class GetWebSearchResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetWebSearchResponseBody body;

    public static GetWebSearchResponse build(java.util.Map<String, ?> map) throws Exception {
        GetWebSearchResponse self = new GetWebSearchResponse();
        return TeaModel.build(map, self);
    }

    public GetWebSearchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetWebSearchResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetWebSearchResponse setBody(GetWebSearchResponseBody body) {
        this.body = body;
        return this;
    }
    public GetWebSearchResponseBody getBody() {
        return this.body;
    }

}
