// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.safe20220117.models;

import com.aliyun.tea.*;

public class ChangeEndResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ChangeEndResponseBody body;

    public static ChangeEndResponse build(java.util.Map<String, ?> map) throws Exception {
        ChangeEndResponse self = new ChangeEndResponse();
        return TeaModel.build(map, self);
    }

    public ChangeEndResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ChangeEndResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ChangeEndResponse setBody(ChangeEndResponseBody body) {
        this.body = body;
        return this;
    }
    public ChangeEndResponseBody getBody() {
        return this.body;
    }

}
