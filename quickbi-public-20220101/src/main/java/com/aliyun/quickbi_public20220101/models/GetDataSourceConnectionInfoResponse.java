// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class GetDataSourceConnectionInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDataSourceConnectionInfoResponseBody body;

    public static GetDataSourceConnectionInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDataSourceConnectionInfoResponse self = new GetDataSourceConnectionInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetDataSourceConnectionInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDataSourceConnectionInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDataSourceConnectionInfoResponse setBody(GetDataSourceConnectionInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDataSourceConnectionInfoResponseBody getBody() {
        return this.body;
    }

}
