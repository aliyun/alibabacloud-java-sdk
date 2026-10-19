// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class ResolveWorkItemAttachmentAccessResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ResolveWorkItemAttachmentAccessResponseBody body;

    public static ResolveWorkItemAttachmentAccessResponse build(java.util.Map<String, ?> map) throws Exception {
        ResolveWorkItemAttachmentAccessResponse self = new ResolveWorkItemAttachmentAccessResponse();
        return TeaModel.build(map, self);
    }

    public ResolveWorkItemAttachmentAccessResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ResolveWorkItemAttachmentAccessResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ResolveWorkItemAttachmentAccessResponse setBody(ResolveWorkItemAttachmentAccessResponseBody body) {
        this.body = body;
        return this;
    }
    public ResolveWorkItemAttachmentAccessResponseBody getBody() {
        return this.body;
    }

}
