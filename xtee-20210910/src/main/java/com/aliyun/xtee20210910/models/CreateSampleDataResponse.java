// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class CreateSampleDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateSampleDataResponseBody body;

    public static CreateSampleDataResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSampleDataResponse self = new CreateSampleDataResponse();
        return TeaModel.build(map, self);
    }

    public CreateSampleDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSampleDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateSampleDataResponse setBody(CreateSampleDataResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSampleDataResponseBody getBody() {
        return this.body;
    }

}
