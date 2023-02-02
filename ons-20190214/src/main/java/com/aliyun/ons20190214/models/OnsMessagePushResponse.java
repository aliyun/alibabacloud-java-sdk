// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsMessagePushResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public OnsMessagePushResponseBody body;

    public static OnsMessagePushResponse build(java.util.Map<String, ?> map) throws Exception {
        OnsMessagePushResponse self = new OnsMessagePushResponse();
        return TeaModel.build(map, self);
    }

    public OnsMessagePushResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OnsMessagePushResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public OnsMessagePushResponse setBody(OnsMessagePushResponseBody body) {
        this.body = body;
        return this;
    }
    public OnsMessagePushResponseBody getBody() {
        return this.body;
    }

}
