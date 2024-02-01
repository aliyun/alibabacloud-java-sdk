// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateTrafficMirrorFilterResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public CreateTrafficMirrorFilterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateTrafficMirrorFilterResponse setBody(CreateTrafficMirrorFilterResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateTrafficMirrorFilterResponseBody getBody() {
        return this.body;
    }

}
