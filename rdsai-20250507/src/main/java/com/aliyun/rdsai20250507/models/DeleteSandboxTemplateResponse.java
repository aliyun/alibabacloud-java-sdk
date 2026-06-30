// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class DeleteSandboxTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteSandboxTemplateResponseBody body;

    public static DeleteSandboxTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteSandboxTemplateResponse self = new DeleteSandboxTemplateResponse();
        return TeaModel.build(map, self);
    }

    public DeleteSandboxTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteSandboxTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteSandboxTemplateResponse setBody(DeleteSandboxTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteSandboxTemplateResponseBody getBody() {
        return this.body;
    }

}
