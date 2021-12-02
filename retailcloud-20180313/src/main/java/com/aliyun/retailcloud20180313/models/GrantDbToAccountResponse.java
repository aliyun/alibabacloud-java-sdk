// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class GrantDbToAccountResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GrantDbToAccountResponseBody body;

    public static GrantDbToAccountResponse build(java.util.Map<String, ?> map) throws Exception {
        GrantDbToAccountResponse self = new GrantDbToAccountResponse();
        return TeaModel.build(map, self);
    }

    public GrantDbToAccountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GrantDbToAccountResponse setBody(GrantDbToAccountResponseBody body) {
        this.body = body;
        return this;
    }
    public GrantDbToAccountResponseBody getBody() {
        return this.body;
    }

}
