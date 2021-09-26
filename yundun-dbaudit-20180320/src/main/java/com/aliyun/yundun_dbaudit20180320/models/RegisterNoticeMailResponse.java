// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class RegisterNoticeMailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RegisterNoticeMailResponseBody body;

    public static RegisterNoticeMailResponse build(java.util.Map<String, ?> map) throws Exception {
        RegisterNoticeMailResponse self = new RegisterNoticeMailResponse();
        return TeaModel.build(map, self);
    }

    public RegisterNoticeMailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RegisterNoticeMailResponse setBody(RegisterNoticeMailResponseBody body) {
        this.body = body;
        return this;
    }
    public RegisterNoticeMailResponseBody getBody() {
        return this.body;
    }

}
