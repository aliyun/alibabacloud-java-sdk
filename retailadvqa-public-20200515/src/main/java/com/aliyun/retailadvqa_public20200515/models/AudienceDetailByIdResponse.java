// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailadvqa_public20200515.models;

import com.aliyun.tea.*;

public class AudienceDetailByIdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AudienceDetailByIdResponseBody body;

    public static AudienceDetailByIdResponse build(java.util.Map<String, ?> map) throws Exception {
        AudienceDetailByIdResponse self = new AudienceDetailByIdResponse();
        return TeaModel.build(map, self);
    }

    public AudienceDetailByIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AudienceDetailByIdResponse setBody(AudienceDetailByIdResponseBody body) {
        this.body = body;
        return this;
    }
    public AudienceDetailByIdResponseBody getBody() {
        return this.body;
    }

}
