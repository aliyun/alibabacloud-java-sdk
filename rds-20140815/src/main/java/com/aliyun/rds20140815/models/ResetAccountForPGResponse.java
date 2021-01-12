// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ResetAccountForPGResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ResetAccountForPGResponseBody body;

    public static ResetAccountForPGResponse build(java.util.Map<String, ?> map) throws Exception {
        ResetAccountForPGResponse self = new ResetAccountForPGResponse();
        return TeaModel.build(map, self);
    }

    public ResetAccountForPGResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ResetAccountForPGResponse setBody(ResetAccountForPGResponseBody body) {
        this.body = body;
        return this;
    }
    public ResetAccountForPGResponseBody getBody() {
        return this.body;
    }

}
