// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class PutLoginCountResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public PutLoginCountResponseBody body;

    public static PutLoginCountResponse build(java.util.Map<String, ?> map) throws Exception {
        PutLoginCountResponse self = new PutLoginCountResponse();
        return TeaModel.build(map, self);
    }

    public PutLoginCountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PutLoginCountResponse setBody(PutLoginCountResponseBody body) {
        this.body = body;
        return this;
    }
    public PutLoginCountResponseBody getBody() {
        return this.body;
    }

}
