// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starops20260428.models;

import com.aliyun.tea.*;

public class GetArtifactDownloadUrlResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetArtifactDownloadUrlResponseBody body;

    public static GetArtifactDownloadUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        GetArtifactDownloadUrlResponse self = new GetArtifactDownloadUrlResponse();
        return TeaModel.build(map, self);
    }

    public GetArtifactDownloadUrlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetArtifactDownloadUrlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetArtifactDownloadUrlResponse setBody(GetArtifactDownloadUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public GetArtifactDownloadUrlResponseBody getBody() {
        return this.body;
    }

}
