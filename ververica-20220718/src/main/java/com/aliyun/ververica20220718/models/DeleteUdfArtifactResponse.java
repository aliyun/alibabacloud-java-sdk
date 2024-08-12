// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class DeleteUdfArtifactResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteUdfArtifactResponseBody body;

    public static DeleteUdfArtifactResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteUdfArtifactResponse self = new DeleteUdfArtifactResponse();
        return TeaModel.build(map, self);
    }

    public DeleteUdfArtifactResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteUdfArtifactResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteUdfArtifactResponse setBody(DeleteUdfArtifactResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteUdfArtifactResponseBody getBody() {
        return this.body;
    }

}
