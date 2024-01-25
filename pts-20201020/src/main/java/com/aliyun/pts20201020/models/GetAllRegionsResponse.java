// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20201020.models;

import com.aliyun.tea.*;

public class GetAllRegionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAllRegionsResponseBody body;

    public static GetAllRegionsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAllRegionsResponse self = new GetAllRegionsResponse();
        return TeaModel.build(map, self);
    }

    public GetAllRegionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAllRegionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAllRegionsResponse setBody(GetAllRegionsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAllRegionsResponseBody getBody() {
        return this.body;
    }

}
