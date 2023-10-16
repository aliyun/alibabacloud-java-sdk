// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetLogMetaResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetLogMetaResponseBody body;

    public static GetLogMetaResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLogMetaResponse self = new GetLogMetaResponse();
        return TeaModel.build(map, self);
    }

    public GetLogMetaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLogMetaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetLogMetaResponse setBody(GetLogMetaResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLogMetaResponseBody getBody() {
        return this.body;
    }

}
