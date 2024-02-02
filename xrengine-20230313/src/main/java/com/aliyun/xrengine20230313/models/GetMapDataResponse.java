// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20230313.models;

import com.aliyun.tea.*;

public class GetMapDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetMapDataResponseBody body;

    public static GetMapDataResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMapDataResponse self = new GetMapDataResponse();
        return TeaModel.build(map, self);
    }

    public GetMapDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMapDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetMapDataResponse setBody(GetMapDataResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMapDataResponseBody getBody() {
        return this.body;
    }

}
