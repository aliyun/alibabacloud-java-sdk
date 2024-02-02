// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20230313.models;

import com.aliyun.tea.*;

public class GetMapPublishDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetMapPublishDataResponseBody body;

    public static GetMapPublishDataResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMapPublishDataResponse self = new GetMapPublishDataResponse();
        return TeaModel.build(map, self);
    }

    public GetMapPublishDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMapPublishDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetMapPublishDataResponse setBody(GetMapPublishDataResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMapPublishDataResponseBody getBody() {
        return this.body;
    }

}
