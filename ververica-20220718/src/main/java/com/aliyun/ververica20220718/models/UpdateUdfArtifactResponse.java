// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class UpdateUdfArtifactResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateUdfArtifactResponseBody body;

    public static UpdateUdfArtifactResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateUdfArtifactResponse self = new UpdateUdfArtifactResponse();
        return TeaModel.build(map, self);
    }

    public UpdateUdfArtifactResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateUdfArtifactResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateUdfArtifactResponse setBody(UpdateUdfArtifactResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateUdfArtifactResponseBody getBody() {
        return this.body;
    }

}
