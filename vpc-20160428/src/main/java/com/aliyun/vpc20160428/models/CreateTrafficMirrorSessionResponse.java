// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateTrafficMirrorSessionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateTrafficMirrorSessionResponseBody body;

    public static CreateTrafficMirrorSessionResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateTrafficMirrorSessionResponse self = new CreateTrafficMirrorSessionResponse();
        return TeaModel.build(map, self);
    }

    public CreateTrafficMirrorSessionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateTrafficMirrorSessionResponse setBody(CreateTrafficMirrorSessionResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateTrafficMirrorSessionResponseBody getBody() {
        return this.body;
    }

}
