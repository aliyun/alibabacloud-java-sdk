// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class ResolveWorkItemArtifactAccessResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ResolveWorkItemArtifactAccessResponseBody body;

    public static ResolveWorkItemArtifactAccessResponse build(java.util.Map<String, ?> map) throws Exception {
        ResolveWorkItemArtifactAccessResponse self = new ResolveWorkItemArtifactAccessResponse();
        return TeaModel.build(map, self);
    }

    public ResolveWorkItemArtifactAccessResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ResolveWorkItemArtifactAccessResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ResolveWorkItemArtifactAccessResponse setBody(ResolveWorkItemArtifactAccessResponseBody body) {
        this.body = body;
        return this;
    }
    public ResolveWorkItemArtifactAccessResponseBody getBody() {
        return this.body;
    }

}
