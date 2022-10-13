// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.unimkt20181212.models;

import com.aliyun.tea.*;

public class CheckUserFinishAdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CheckUserFinishAdResponseBody body;

    public static CheckUserFinishAdResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckUserFinishAdResponse self = new CheckUserFinishAdResponse();
        return TeaModel.build(map, self);
    }

    public CheckUserFinishAdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckUserFinishAdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckUserFinishAdResponse setBody(CheckUserFinishAdResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckUserFinishAdResponseBody getBody() {
        return this.body;
    }

}
