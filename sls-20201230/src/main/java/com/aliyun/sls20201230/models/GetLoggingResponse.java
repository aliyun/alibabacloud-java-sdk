// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class GetLoggingResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public Logging body;

    public static GetLoggingResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLoggingResponse self = new GetLoggingResponse();
        return TeaModel.build(map, self);
    }

    public GetLoggingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLoggingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetLoggingResponse setBody(Logging body) {
        this.body = body;
        return this;
    }
    public Logging getBody() {
        return this.body;
    }

}
