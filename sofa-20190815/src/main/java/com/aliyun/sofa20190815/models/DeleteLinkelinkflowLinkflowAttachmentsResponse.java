// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteLinkelinkflowLinkflowAttachmentsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteLinkelinkflowLinkflowAttachmentsResponseBody body;

    public static DeleteLinkelinkflowLinkflowAttachmentsResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteLinkelinkflowLinkflowAttachmentsResponse self = new DeleteLinkelinkflowLinkflowAttachmentsResponse();
        return TeaModel.build(map, self);
    }

    public DeleteLinkelinkflowLinkflowAttachmentsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteLinkelinkflowLinkflowAttachmentsResponse setBody(DeleteLinkelinkflowLinkflowAttachmentsResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteLinkelinkflowLinkflowAttachmentsResponseBody getBody() {
        return this.body;
    }

}
