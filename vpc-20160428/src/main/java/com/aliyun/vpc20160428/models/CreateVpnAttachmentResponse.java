// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateVpnAttachmentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateVpnAttachmentResponseBody body;

    public static CreateVpnAttachmentResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateVpnAttachmentResponse self = new CreateVpnAttachmentResponse();
        return TeaModel.build(map, self);
    }

    public CreateVpnAttachmentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateVpnAttachmentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateVpnAttachmentResponse setBody(CreateVpnAttachmentResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateVpnAttachmentResponseBody getBody() {
        return this.body;
    }

}
