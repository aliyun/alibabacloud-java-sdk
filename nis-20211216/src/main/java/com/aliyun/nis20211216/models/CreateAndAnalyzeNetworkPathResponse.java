// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nis20211216.models;

import com.aliyun.tea.*;

public class CreateAndAnalyzeNetworkPathResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateAndAnalyzeNetworkPathResponseBody body;

    public static CreateAndAnalyzeNetworkPathResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAndAnalyzeNetworkPathResponse self = new CreateAndAnalyzeNetworkPathResponse();
        return TeaModel.build(map, self);
    }

    public CreateAndAnalyzeNetworkPathResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAndAnalyzeNetworkPathResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateAndAnalyzeNetworkPathResponse setBody(CreateAndAnalyzeNetworkPathResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAndAnalyzeNetworkPathResponseBody getBody() {
        return this.body;
    }

}
