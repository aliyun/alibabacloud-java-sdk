// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class CreateAuditResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateAuditResponseBody body;

    public static CreateAuditResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAuditResponse self = new CreateAuditResponse();
        return TeaModel.build(map, self);
    }

    public CreateAuditResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAuditResponse setBody(CreateAuditResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAuditResponseBody getBody() {
        return this.body;
    }

}
