// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class CreateAuditResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public CreateAuditResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateAuditResponse setBody(CreateAuditResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAuditResponseBody getBody() {
        return this.body;
    }

}
