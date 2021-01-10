// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExecDWSStoreDestroyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ExecDWSStoreDestroyResponseBody body;

    public static ExecDWSStoreDestroyResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecDWSStoreDestroyResponse self = new ExecDWSStoreDestroyResponse();
        return TeaModel.build(map, self);
    }

    public ExecDWSStoreDestroyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExecDWSStoreDestroyResponse setBody(ExecDWSStoreDestroyResponseBody body) {
        this.body = body;
        return this;
    }
    public ExecDWSStoreDestroyResponseBody getBody() {
        return this.body;
    }

}
