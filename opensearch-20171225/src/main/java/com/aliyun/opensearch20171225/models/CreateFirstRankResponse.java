// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class CreateFirstRankResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateFirstRankResponseBody body;

    public static CreateFirstRankResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateFirstRankResponse self = new CreateFirstRankResponse();
        return TeaModel.build(map, self);
    }

    public CreateFirstRankResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateFirstRankResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateFirstRankResponse setBody(CreateFirstRankResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateFirstRankResponseBody getBody() {
        return this.body;
    }

}
