// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20200501.models;

import com.aliyun.tea.*;

public class GetArtifactMetadataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetArtifactMetadataResponseBody body;

    public static GetArtifactMetadataResponse build(java.util.Map<String, ?> map) throws Exception {
        GetArtifactMetadataResponse self = new GetArtifactMetadataResponse();
        return TeaModel.build(map, self);
    }

    public GetArtifactMetadataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetArtifactMetadataResponse setBody(GetArtifactMetadataResponseBody body) {
        this.body = body;
        return this;
    }
    public GetArtifactMetadataResponseBody getBody() {
        return this.body;
    }

}
