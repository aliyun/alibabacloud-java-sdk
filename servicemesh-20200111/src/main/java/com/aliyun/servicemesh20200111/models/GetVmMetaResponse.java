// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class GetVmMetaResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetVmMetaResponseBody body;

    public static GetVmMetaResponse build(java.util.Map<String, ?> map) throws Exception {
        GetVmMetaResponse self = new GetVmMetaResponse();
        return TeaModel.build(map, self);
    }

    public GetVmMetaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetVmMetaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetVmMetaResponse setBody(GetVmMetaResponseBody body) {
        this.body = body;
        return this;
    }
    public GetVmMetaResponseBody getBody() {
        return this.body;
    }

}
