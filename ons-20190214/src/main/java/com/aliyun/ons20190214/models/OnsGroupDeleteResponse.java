// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsGroupDeleteResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public OnsGroupDeleteResponseBody body;

    public static OnsGroupDeleteResponse build(java.util.Map<String, ?> map) throws Exception {
        OnsGroupDeleteResponse self = new OnsGroupDeleteResponse();
        return TeaModel.build(map, self);
    }

    public OnsGroupDeleteResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OnsGroupDeleteResponse setBody(OnsGroupDeleteResponseBody body) {
        this.body = body;
        return this;
    }
    public OnsGroupDeleteResponseBody getBody() {
        return this.body;
    }

}
