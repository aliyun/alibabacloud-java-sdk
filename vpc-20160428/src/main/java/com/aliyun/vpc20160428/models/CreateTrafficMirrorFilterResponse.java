// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateTrafficMirrorFilterResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateTrafficMirrorFilterResponseBody body;

    public static CreateTrafficMirrorFilterResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateTrafficMirrorFilterResponse self = new CreateTrafficMirrorFilterResponse();
        return TeaModel.build(map, self);
    }

    public CreateTrafficMirrorFilterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateTrafficMirrorFilterResponse setBody(CreateTrafficMirrorFilterResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateTrafficMirrorFilterResponseBody getBody() {
        return this.body;
    }

}
