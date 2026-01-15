// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbai20251013.models;

import com.aliyun.tea.*;

public class ListMultimodalSearchModelResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListMultimodalSearchModelResponseBody body;

    public static ListMultimodalSearchModelResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMultimodalSearchModelResponse self = new ListMultimodalSearchModelResponse();
        return TeaModel.build(map, self);
    }

    public ListMultimodalSearchModelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMultimodalSearchModelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListMultimodalSearchModelResponse setBody(ListMultimodalSearchModelResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMultimodalSearchModelResponseBody getBody() {
        return this.body;
    }

}
