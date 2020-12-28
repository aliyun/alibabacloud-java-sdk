// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsWarnCreateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public OnsWarnCreateResponseBody body;

    public static OnsWarnCreateResponse build(java.util.Map<String, ?> map) throws Exception {
        OnsWarnCreateResponse self = new OnsWarnCreateResponse();
        return TeaModel.build(map, self);
    }

    public OnsWarnCreateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OnsWarnCreateResponse setBody(OnsWarnCreateResponseBody body) {
        this.body = body;
        return this;
    }
    public OnsWarnCreateResponseBody getBody() {
        return this.body;
    }

}
