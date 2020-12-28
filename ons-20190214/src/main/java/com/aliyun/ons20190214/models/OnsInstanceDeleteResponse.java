// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsInstanceDeleteResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public OnsInstanceDeleteResponseBody body;

    public static OnsInstanceDeleteResponse build(java.util.Map<String, ?> map) throws Exception {
        OnsInstanceDeleteResponse self = new OnsInstanceDeleteResponse();
        return TeaModel.build(map, self);
    }

    public OnsInstanceDeleteResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OnsInstanceDeleteResponse setBody(OnsInstanceDeleteResponseBody body) {
        this.body = body;
        return this;
    }
    public OnsInstanceDeleteResponseBody getBody() {
        return this.body;
    }

}
