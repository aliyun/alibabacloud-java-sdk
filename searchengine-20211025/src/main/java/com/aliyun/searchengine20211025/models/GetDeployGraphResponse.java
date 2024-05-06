// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class GetDeployGraphResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDeployGraphResponseBody body;

    public static GetDeployGraphResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDeployGraphResponse self = new GetDeployGraphResponse();
        return TeaModel.build(map, self);
    }

    public GetDeployGraphResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDeployGraphResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDeployGraphResponse setBody(GetDeployGraphResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDeployGraphResponseBody getBody() {
        return this.body;
    }

}
