// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExistCASApplicationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ExistCASApplicationResponseBody body;

    public static ExistCASApplicationResponse build(java.util.Map<String, ?> map) throws Exception {
        ExistCASApplicationResponse self = new ExistCASApplicationResponse();
        return TeaModel.build(map, self);
    }

    public ExistCASApplicationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExistCASApplicationResponse setBody(ExistCASApplicationResponseBody body) {
        this.body = body;
        return this;
    }
    public ExistCASApplicationResponseBody getBody() {
        return this.body;
    }

}
