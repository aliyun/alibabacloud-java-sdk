// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsGroupCreateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public OnsGroupCreateResponseBody body;

    public static OnsGroupCreateResponse build(java.util.Map<String, ?> map) throws Exception {
        OnsGroupCreateResponse self = new OnsGroupCreateResponse();
        return TeaModel.build(map, self);
    }

    public OnsGroupCreateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OnsGroupCreateResponse setBody(OnsGroupCreateResponseBody body) {
        this.body = body;
        return this;
    }
    public OnsGroupCreateResponseBody getBody() {
        return this.body;
    }

}
