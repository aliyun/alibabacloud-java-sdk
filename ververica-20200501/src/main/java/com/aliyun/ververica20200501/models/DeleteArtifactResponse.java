// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20200501.models;

import com.aliyun.tea.*;

public class DeleteArtifactResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteArtifactResponseBody body;

    public static DeleteArtifactResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteArtifactResponse self = new DeleteArtifactResponse();
        return TeaModel.build(map, self);
    }

    public DeleteArtifactResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteArtifactResponse setBody(DeleteArtifactResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteArtifactResponseBody getBody() {
        return this.body;
    }

}
