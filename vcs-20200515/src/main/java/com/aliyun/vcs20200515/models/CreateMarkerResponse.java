// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class CreateMarkerResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateMarkerResponseBody body;

    public static CreateMarkerResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateMarkerResponse self = new CreateMarkerResponse();
        return TeaModel.build(map, self);
    }

    public CreateMarkerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateMarkerResponse setBody(CreateMarkerResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateMarkerResponseBody getBody() {
        return this.body;
    }

}
