// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class CreateSecondRankResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateSecondRankResponseBody body;

    public static CreateSecondRankResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSecondRankResponse self = new CreateSecondRankResponse();
        return TeaModel.build(map, self);
    }

    public CreateSecondRankResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSecondRankResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateSecondRankResponse setBody(CreateSecondRankResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSecondRankResponseBody getBody() {
        return this.body;
    }

}
