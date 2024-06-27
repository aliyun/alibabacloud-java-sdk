// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class CreateSampleApiResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateSampleApiResponseBody body;

    public static CreateSampleApiResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSampleApiResponse self = new CreateSampleApiResponse();
        return TeaModel.build(map, self);
    }

    public CreateSampleApiResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSampleApiResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateSampleApiResponse setBody(CreateSampleApiResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSampleApiResponseBody getBody() {
        return this.body;
    }

}
