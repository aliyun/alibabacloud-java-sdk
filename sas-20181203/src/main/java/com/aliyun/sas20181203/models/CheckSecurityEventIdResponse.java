// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CheckSecurityEventIdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CheckSecurityEventIdResponseBody body;

    public static CheckSecurityEventIdResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckSecurityEventIdResponse self = new CheckSecurityEventIdResponse();
        return TeaModel.build(map, self);
    }

    public CheckSecurityEventIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckSecurityEventIdResponse setBody(CheckSecurityEventIdResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckSecurityEventIdResponseBody getBody() {
        return this.body;
    }

}
