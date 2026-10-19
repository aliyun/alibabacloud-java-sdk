// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class GetWorkItemArtifactAccessResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetWorkItemArtifactAccessResponseBody body;

    public static GetWorkItemArtifactAccessResponse build(java.util.Map<String, ?> map) throws Exception {
        GetWorkItemArtifactAccessResponse self = new GetWorkItemArtifactAccessResponse();
        return TeaModel.build(map, self);
    }

    public GetWorkItemArtifactAccessResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetWorkItemArtifactAccessResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetWorkItemArtifactAccessResponse setBody(GetWorkItemArtifactAccessResponseBody body) {
        this.body = body;
        return this;
    }
    public GetWorkItemArtifactAccessResponseBody getBody() {
        return this.body;
    }

}
