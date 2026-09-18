// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class CreateGroupPublicUrlResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateGroupPublicUrlResponseBody body;

    public static CreateGroupPublicUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateGroupPublicUrlResponse self = new CreateGroupPublicUrlResponse();
        return TeaModel.build(map, self);
    }

    public CreateGroupPublicUrlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateGroupPublicUrlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateGroupPublicUrlResponse setBody(CreateGroupPublicUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateGroupPublicUrlResponseBody getBody() {
        return this.body;
    }

}
