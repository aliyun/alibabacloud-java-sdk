// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class GetWorkItemAttachmentAccessResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetWorkItemAttachmentAccessResponseBody body;

    public static GetWorkItemAttachmentAccessResponse build(java.util.Map<String, ?> map) throws Exception {
        GetWorkItemAttachmentAccessResponse self = new GetWorkItemAttachmentAccessResponse();
        return TeaModel.build(map, self);
    }

    public GetWorkItemAttachmentAccessResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetWorkItemAttachmentAccessResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetWorkItemAttachmentAccessResponse setBody(GetWorkItemAttachmentAccessResponseBody body) {
        this.body = body;
        return this;
    }
    public GetWorkItemAttachmentAccessResponseBody getBody() {
        return this.body;
    }

}
