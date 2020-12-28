// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsInstanceBaseInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public OnsInstanceBaseInfoResponseBody body;

    public static OnsInstanceBaseInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        OnsInstanceBaseInfoResponse self = new OnsInstanceBaseInfoResponse();
        return TeaModel.build(map, self);
    }

    public OnsInstanceBaseInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OnsInstanceBaseInfoResponse setBody(OnsInstanceBaseInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public OnsInstanceBaseInfoResponseBody getBody() {
        return this.body;
    }

}
