// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20220101.models;

import com.aliyun.tea.*;

public class GetIdleInstanceCullerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetIdleInstanceCullerResponseBody body;

    public static GetIdleInstanceCullerResponse build(java.util.Map<String, ?> map) throws Exception {
        GetIdleInstanceCullerResponse self = new GetIdleInstanceCullerResponse();
        return TeaModel.build(map, self);
    }

    public GetIdleInstanceCullerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetIdleInstanceCullerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetIdleInstanceCullerResponse setBody(GetIdleInstanceCullerResponseBody body) {
        this.body = body;
        return this;
    }
    public GetIdleInstanceCullerResponseBody getBody() {
        return this.body;
    }

}
