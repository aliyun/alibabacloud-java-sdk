// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class VerifySentenceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public VerifySentenceResponseBody body;

    public static VerifySentenceResponse build(java.util.Map<String, ?> map) throws Exception {
        VerifySentenceResponse self = new VerifySentenceResponse();
        return TeaModel.build(map, self);
    }

    public VerifySentenceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public VerifySentenceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public VerifySentenceResponse setBody(VerifySentenceResponseBody body) {
        this.body = body;
        return this;
    }
    public VerifySentenceResponseBody getBody() {
        return this.body;
    }

}
