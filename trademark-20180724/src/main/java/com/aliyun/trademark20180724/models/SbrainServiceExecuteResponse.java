// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class SbrainServiceExecuteResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SbrainServiceExecuteResponseBody body;

    public static SbrainServiceExecuteResponse build(java.util.Map<String, ?> map) throws Exception {
        SbrainServiceExecuteResponse self = new SbrainServiceExecuteResponse();
        return TeaModel.build(map, self);
    }

    public SbrainServiceExecuteResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SbrainServiceExecuteResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SbrainServiceExecuteResponse setBody(SbrainServiceExecuteResponseBody body) {
        this.body = body;
        return this;
    }
    public SbrainServiceExecuteResponseBody getBody() {
        return this.body;
    }

}
