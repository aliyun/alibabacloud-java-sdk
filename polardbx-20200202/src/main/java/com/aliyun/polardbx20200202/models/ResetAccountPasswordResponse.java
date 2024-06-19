// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class ResetAccountPasswordResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ResetAccountPasswordResponseBody body;

    public static ResetAccountPasswordResponse build(java.util.Map<String, ?> map) throws Exception {
        ResetAccountPasswordResponse self = new ResetAccountPasswordResponse();
        return TeaModel.build(map, self);
    }

    public ResetAccountPasswordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ResetAccountPasswordResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ResetAccountPasswordResponse setBody(ResetAccountPasswordResponseBody body) {
        this.body = body;
        return this;
    }
    public ResetAccountPasswordResponseBody getBody() {
        return this.body;
    }

}
