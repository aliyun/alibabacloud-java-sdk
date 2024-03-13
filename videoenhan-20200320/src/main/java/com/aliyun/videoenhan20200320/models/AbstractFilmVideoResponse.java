// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videoenhan20200320.models;

import com.aliyun.tea.*;

public class AbstractFilmVideoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AbstractFilmVideoResponseBody body;

    public static AbstractFilmVideoResponse build(java.util.Map<String, ?> map) throws Exception {
        AbstractFilmVideoResponse self = new AbstractFilmVideoResponse();
        return TeaModel.build(map, self);
    }

    public AbstractFilmVideoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AbstractFilmVideoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AbstractFilmVideoResponse setBody(AbstractFilmVideoResponseBody body) {
        this.body = body;
        return this;
    }
    public AbstractFilmVideoResponseBody getBody() {
        return this.body;
    }

}
