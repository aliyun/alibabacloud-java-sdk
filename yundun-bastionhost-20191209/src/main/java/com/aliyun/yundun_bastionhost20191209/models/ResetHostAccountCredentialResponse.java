// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ResetHostAccountCredentialResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ResetHostAccountCredentialResponseBody body;

    public static ResetHostAccountCredentialResponse build(java.util.Map<String, ?> map) throws Exception {
        ResetHostAccountCredentialResponse self = new ResetHostAccountCredentialResponse();
        return TeaModel.build(map, self);
    }

    public ResetHostAccountCredentialResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ResetHostAccountCredentialResponse setBody(ResetHostAccountCredentialResponseBody body) {
        this.body = body;
        return this;
    }
    public ResetHostAccountCredentialResponseBody getBody() {
        return this.body;
    }

}
