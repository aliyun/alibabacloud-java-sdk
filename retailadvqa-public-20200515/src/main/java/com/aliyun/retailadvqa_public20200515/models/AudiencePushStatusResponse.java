// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailadvqa_public20200515.models;

import com.aliyun.tea.*;

public class AudiencePushStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AudiencePushStatusResponseBody body;

    public static AudiencePushStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        AudiencePushStatusResponse self = new AudiencePushStatusResponse();
        return TeaModel.build(map, self);
    }

    public AudiencePushStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AudiencePushStatusResponse setBody(AudiencePushStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public AudiencePushStatusResponseBody getBody() {
        return this.body;
    }

}
