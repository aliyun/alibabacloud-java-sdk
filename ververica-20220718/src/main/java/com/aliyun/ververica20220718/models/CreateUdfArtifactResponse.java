// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class CreateUdfArtifactResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateUdfArtifactResponseBody body;

    public static CreateUdfArtifactResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateUdfArtifactResponse self = new CreateUdfArtifactResponse();
        return TeaModel.build(map, self);
    }

    public CreateUdfArtifactResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateUdfArtifactResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateUdfArtifactResponse setBody(CreateUdfArtifactResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateUdfArtifactResponseBody getBody() {
        return this.body;
    }

}
