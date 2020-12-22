// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videoenhan20200320.models;

import com.aliyun.tea.*;

public class AbstractFilmVideoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public AbstractFilmVideoResponse setBody(AbstractFilmVideoResponseBody body) {
        this.body = body;
        return this;
    }
    public AbstractFilmVideoResponseBody getBody() {
        return this.body;
    }

}
