// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class GetClusterRunTimeInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetClusterRunTimeInfoResponseBody body;

    public static GetClusterRunTimeInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetClusterRunTimeInfoResponse self = new GetClusterRunTimeInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetClusterRunTimeInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetClusterRunTimeInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetClusterRunTimeInfoResponse setBody(GetClusterRunTimeInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetClusterRunTimeInfoResponseBody getBody() {
        return this.body;
    }

}
