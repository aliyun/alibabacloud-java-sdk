// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class CancelUpdateStackResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CancelUpdateStackResponseBody body;

    public static CancelUpdateStackResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelUpdateStackResponse self = new CancelUpdateStackResponse();
        return TeaModel.build(map, self);
    }

    public CancelUpdateStackResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CancelUpdateStackResponse setBody(CancelUpdateStackResponseBody body) {
        this.body = body;
        return this;
    }
    public CancelUpdateStackResponseBody getBody() {
        return this.body;
    }

}
