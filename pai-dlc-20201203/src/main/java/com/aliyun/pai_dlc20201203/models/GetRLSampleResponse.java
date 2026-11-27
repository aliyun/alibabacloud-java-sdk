// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class GetRLSampleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetRLSampleResponseBody body;

    public static GetRLSampleResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRLSampleResponse self = new GetRLSampleResponse();
        return TeaModel.build(map, self);
    }

    public GetRLSampleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetRLSampleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetRLSampleResponse setBody(GetRLSampleResponseBody body) {
        this.body = body;
        return this;
    }
    public GetRLSampleResponseBody getBody() {
        return this.body;
    }

}
