// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videorecog20200320.models;

import com.aliyun.tea.*;

public class UnderstandVideoContentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UnderstandVideoContentResponseBody body;

    public static UnderstandVideoContentResponse build(java.util.Map<String, ?> map) throws Exception {
        UnderstandVideoContentResponse self = new UnderstandVideoContentResponse();
        return TeaModel.build(map, self);
    }

    public UnderstandVideoContentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UnderstandVideoContentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UnderstandVideoContentResponse setBody(UnderstandVideoContentResponseBody body) {
        this.body = body;
        return this;
    }
    public UnderstandVideoContentResponseBody getBody() {
        return this.body;
    }

}
