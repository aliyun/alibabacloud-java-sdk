// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class GetHttpEventConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetHttpEventConfigResponseBody body;

    public static GetHttpEventConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        GetHttpEventConfigResponse self = new GetHttpEventConfigResponse();
        return TeaModel.build(map, self);
    }

    public GetHttpEventConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetHttpEventConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetHttpEventConfigResponse setBody(GetHttpEventConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public GetHttpEventConfigResponseBody getBody() {
        return this.body;
    }

}
