// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExecDWSStoreCreateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ExecDWSStoreCreateResponseBody body;

    public static ExecDWSStoreCreateResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecDWSStoreCreateResponse self = new ExecDWSStoreCreateResponse();
        return TeaModel.build(map, self);
    }

    public ExecDWSStoreCreateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExecDWSStoreCreateResponse setBody(ExecDWSStoreCreateResponseBody body) {
        this.body = body;
        return this;
    }
    public ExecDWSStoreCreateResponseBody getBody() {
        return this.body;
    }

}
