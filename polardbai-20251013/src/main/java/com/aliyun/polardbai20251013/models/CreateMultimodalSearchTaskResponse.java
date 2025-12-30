// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbai20251013.models;

import com.aliyun.tea.*;

public class CreateMultimodalSearchTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateMultimodalSearchTaskResponseBody body;

    public static CreateMultimodalSearchTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateMultimodalSearchTaskResponse self = new CreateMultimodalSearchTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateMultimodalSearchTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateMultimodalSearchTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateMultimodalSearchTaskResponse setBody(CreateMultimodalSearchTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateMultimodalSearchTaskResponseBody getBody() {
        return this.body;
    }

}
