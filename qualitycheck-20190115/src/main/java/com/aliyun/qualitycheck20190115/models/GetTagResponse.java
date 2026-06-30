// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class GetTagResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetTagResponseBody body;

    public static GetTagResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTagResponse self = new GetTagResponse();
        return TeaModel.build(map, self);
    }

    public GetTagResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTagResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetTagResponse setBody(GetTagResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTagResponseBody getBody() {
        return this.body;
    }

}
