// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_cmp20220303.models;

import com.aliyun.tea.*;

public class CheckNotaryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CheckNotaryResponseBody body;

    public static CheckNotaryResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckNotaryResponse self = new CheckNotaryResponse();
        return TeaModel.build(map, self);
    }

    public CheckNotaryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckNotaryResponse setBody(CheckNotaryResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckNotaryResponseBody getBody() {
        return this.body;
    }

}
