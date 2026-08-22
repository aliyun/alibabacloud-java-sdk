// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class CreateOpenSearchResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateOpenSearchResponseBody body;

    public static CreateOpenSearchResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateOpenSearchResponse self = new CreateOpenSearchResponse();
        return TeaModel.build(map, self);
    }

    public CreateOpenSearchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateOpenSearchResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateOpenSearchResponse setBody(CreateOpenSearchResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateOpenSearchResponseBody getBody() {
        return this.body;
    }

}
