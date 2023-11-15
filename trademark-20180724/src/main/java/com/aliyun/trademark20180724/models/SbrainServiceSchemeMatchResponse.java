// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class SbrainServiceSchemeMatchResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SbrainServiceSchemeMatchResponseBody body;

    public static SbrainServiceSchemeMatchResponse build(java.util.Map<String, ?> map) throws Exception {
        SbrainServiceSchemeMatchResponse self = new SbrainServiceSchemeMatchResponse();
        return TeaModel.build(map, self);
    }

    public SbrainServiceSchemeMatchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SbrainServiceSchemeMatchResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SbrainServiceSchemeMatchResponse setBody(SbrainServiceSchemeMatchResponseBody body) {
        this.body = body;
        return this;
    }
    public SbrainServiceSchemeMatchResponseBody getBody() {
        return this.body;
    }

}
