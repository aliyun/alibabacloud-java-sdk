// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsConsumerStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public OnsConsumerStatusResponseBody body;

    public static OnsConsumerStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        OnsConsumerStatusResponse self = new OnsConsumerStatusResponse();
        return TeaModel.build(map, self);
    }

    public OnsConsumerStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OnsConsumerStatusResponse setBody(OnsConsumerStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public OnsConsumerStatusResponseBody getBody() {
        return this.body;
    }

}
