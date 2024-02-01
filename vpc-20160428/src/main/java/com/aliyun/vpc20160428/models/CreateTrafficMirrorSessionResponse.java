// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateTrafficMirrorSessionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public CreateTrafficMirrorSessionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateTrafficMirrorSessionResponse setBody(CreateTrafficMirrorSessionResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateTrafficMirrorSessionResponseBody getBody() {
        return this.body;
    }

}
