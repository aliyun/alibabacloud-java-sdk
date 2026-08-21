// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class GetConfigByNameResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetConfigByNameResponseBody body;

    public static GetConfigByNameResponse build(java.util.Map<String, ?> map) throws Exception {
        GetConfigByNameResponse self = new GetConfigByNameResponse();
        return TeaModel.build(map, self);
    }

    public GetConfigByNameResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetConfigByNameResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetConfigByNameResponse setBody(GetConfigByNameResponseBody body) {
        this.body = body;
        return this;
    }
    public GetConfigByNameResponseBody getBody() {
        return this.body;
    }

}
