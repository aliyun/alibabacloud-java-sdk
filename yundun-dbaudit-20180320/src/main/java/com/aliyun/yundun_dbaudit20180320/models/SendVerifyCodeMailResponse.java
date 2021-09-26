// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class SendVerifyCodeMailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SendVerifyCodeMailResponseBody body;

    public static SendVerifyCodeMailResponse build(java.util.Map<String, ?> map) throws Exception {
        SendVerifyCodeMailResponse self = new SendVerifyCodeMailResponse();
        return TeaModel.build(map, self);
    }

    public SendVerifyCodeMailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SendVerifyCodeMailResponse setBody(SendVerifyCodeMailResponseBody body) {
        this.body = body;
        return this;
    }
    public SendVerifyCodeMailResponseBody getBody() {
        return this.body;
    }

}
