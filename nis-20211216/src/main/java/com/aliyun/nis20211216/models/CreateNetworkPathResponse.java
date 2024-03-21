// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nis20211216.models;

import com.aliyun.tea.*;

public class CreateNetworkPathResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateNetworkPathResponseBody body;

    public static CreateNetworkPathResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateNetworkPathResponse self = new CreateNetworkPathResponse();
        return TeaModel.build(map, self);
    }

    public CreateNetworkPathResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateNetworkPathResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateNetworkPathResponse setBody(CreateNetworkPathResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateNetworkPathResponseBody getBody() {
        return this.body;
    }

}
