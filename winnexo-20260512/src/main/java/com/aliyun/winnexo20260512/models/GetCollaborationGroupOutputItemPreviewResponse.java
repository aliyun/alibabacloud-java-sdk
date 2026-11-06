// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class GetCollaborationGroupOutputItemPreviewResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetCollaborationGroupOutputItemPreviewResponseBody body;

    public static GetCollaborationGroupOutputItemPreviewResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCollaborationGroupOutputItemPreviewResponse self = new GetCollaborationGroupOutputItemPreviewResponse();
        return TeaModel.build(map, self);
    }

    public GetCollaborationGroupOutputItemPreviewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCollaborationGroupOutputItemPreviewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetCollaborationGroupOutputItemPreviewResponse setBody(GetCollaborationGroupOutputItemPreviewResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCollaborationGroupOutputItemPreviewResponseBody getBody() {
        return this.body;
    }

}
