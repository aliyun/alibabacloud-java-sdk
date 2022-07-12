// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class GetEtlMetaResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetEtlMetaResponseBody body;

    public static GetEtlMetaResponse build(java.util.Map<String, ?> map) throws Exception {
        GetEtlMetaResponse self = new GetEtlMetaResponse();
        return TeaModel.build(map, self);
    }

    public GetEtlMetaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetEtlMetaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetEtlMetaResponse setBody(GetEtlMetaResponseBody body) {
        this.body = body;
        return this;
    }
    public GetEtlMetaResponseBody getBody() {
        return this.body;
    }

}
