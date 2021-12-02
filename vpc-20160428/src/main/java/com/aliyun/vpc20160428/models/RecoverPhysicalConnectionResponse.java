// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class RecoverPhysicalConnectionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RecoverPhysicalConnectionResponseBody body;

    public static RecoverPhysicalConnectionResponse build(java.util.Map<String, ?> map) throws Exception {
        RecoverPhysicalConnectionResponse self = new RecoverPhysicalConnectionResponse();
        return TeaModel.build(map, self);
    }

    public RecoverPhysicalConnectionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RecoverPhysicalConnectionResponse setBody(RecoverPhysicalConnectionResponseBody body) {
        this.body = body;
        return this;
    }
    public RecoverPhysicalConnectionResponseBody getBody() {
        return this.body;
    }

}
