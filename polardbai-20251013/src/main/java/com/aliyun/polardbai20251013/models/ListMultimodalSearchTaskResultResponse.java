// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbai20251013.models;

import com.aliyun.tea.*;

public class ListMultimodalSearchTaskResultResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListMultimodalSearchTaskResultResponseBody body;

    public static ListMultimodalSearchTaskResultResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMultimodalSearchTaskResultResponse self = new ListMultimodalSearchTaskResultResponse();
        return TeaModel.build(map, self);
    }

    public ListMultimodalSearchTaskResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMultimodalSearchTaskResultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListMultimodalSearchTaskResultResponse setBody(ListMultimodalSearchTaskResultResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMultimodalSearchTaskResultResponseBody getBody() {
        return this.body;
    }

}
