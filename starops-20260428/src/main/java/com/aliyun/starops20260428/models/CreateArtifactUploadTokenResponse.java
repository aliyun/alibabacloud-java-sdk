// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starops20260428.models;

import com.aliyun.tea.*;

public class CreateArtifactUploadTokenResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateArtifactUploadTokenResponseBody body;

    public static CreateArtifactUploadTokenResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateArtifactUploadTokenResponse self = new CreateArtifactUploadTokenResponse();
        return TeaModel.build(map, self);
    }

    public CreateArtifactUploadTokenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateArtifactUploadTokenResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateArtifactUploadTokenResponse setBody(CreateArtifactUploadTokenResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateArtifactUploadTokenResponseBody getBody() {
        return this.body;
    }

}
