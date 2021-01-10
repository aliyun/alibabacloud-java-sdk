// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateLinkelinkflowLinkflowAttachmentsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateLinkelinkflowLinkflowAttachmentsResponseBody body;

    public static CreateLinkelinkflowLinkflowAttachmentsResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateLinkelinkflowLinkflowAttachmentsResponse self = new CreateLinkelinkflowLinkflowAttachmentsResponse();
        return TeaModel.build(map, self);
    }

    public CreateLinkelinkflowLinkflowAttachmentsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateLinkelinkflowLinkflowAttachmentsResponse setBody(CreateLinkelinkflowLinkflowAttachmentsResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateLinkelinkflowLinkflowAttachmentsResponseBody getBody() {
        return this.body;
    }

}
