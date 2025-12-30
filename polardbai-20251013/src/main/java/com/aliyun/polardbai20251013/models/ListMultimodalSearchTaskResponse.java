// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbai20251013.models;

import com.aliyun.tea.*;

public class ListMultimodalSearchTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListMultimodalSearchTaskResponseBody body;

    public static ListMultimodalSearchTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMultimodalSearchTaskResponse self = new ListMultimodalSearchTaskResponse();
        return TeaModel.build(map, self);
    }

    public ListMultimodalSearchTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMultimodalSearchTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListMultimodalSearchTaskResponse setBody(ListMultimodalSearchTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMultimodalSearchTaskResponseBody getBody() {
        return this.body;
    }

}
