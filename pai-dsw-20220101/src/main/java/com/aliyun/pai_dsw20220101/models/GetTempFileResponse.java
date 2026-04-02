// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20220101.models;

import com.aliyun.tea.*;

public class GetTempFileResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetTempFileResponseBody body;

    public static GetTempFileResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTempFileResponse self = new GetTempFileResponse();
        return TeaModel.build(map, self);
    }

    public GetTempFileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTempFileResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetTempFileResponse setBody(GetTempFileResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTempFileResponseBody getBody() {
        return this.body;
    }

}
