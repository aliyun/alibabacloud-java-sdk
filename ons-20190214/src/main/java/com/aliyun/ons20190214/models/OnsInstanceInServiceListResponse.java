// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsInstanceInServiceListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public OnsInstanceInServiceListResponseBody body;

    public static OnsInstanceInServiceListResponse build(java.util.Map<String, ?> map) throws Exception {
        OnsInstanceInServiceListResponse self = new OnsInstanceInServiceListResponse();
        return TeaModel.build(map, self);
    }

    public OnsInstanceInServiceListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OnsInstanceInServiceListResponse setBody(OnsInstanceInServiceListResponseBody body) {
        this.body = body;
        return this;
    }
    public OnsInstanceInServiceListResponseBody getBody() {
        return this.body;
    }

}
